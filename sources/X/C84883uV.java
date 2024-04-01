package X;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.3uV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84883uV extends BroadcastReceiver {
    public final /* synthetic */ C74613dY A02;
    public volatile boolean A01 = false;
    public final Object A00 = new Object();

    public static final String A00(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? "UNKNOWN BLUETOOTH SCO STATE" : "CONNECTING" : "CONNECTED" : "DISCONNECTED" : "ERROR";
    }

    public C84883uV(C74613dY c74613dY) {
        this.A02 = c74613dY;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        BluetoothHeadset bluetoothHeadset;
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    AnonymousClass029.A0Y(context);
                    this.A01 = true;
                }
            }
        }
        C000700j.A01();
        if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
            C74613dY c74613dY = this.A02;
            int i = c74613dY.A01;
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            c74613dY.A01 = intExtra;
            StringBuilder A0P = C000200d.A0P("voip/audio_route/bluetoothScoReceiver/ACTION_SCO_AUDIO_STATE_UPDATED [");
            A0P.append(A00(i));
            A0P.append(" -> ");
            A0P.append(A00(intExtra));
            A0P.append("]");
            Log.i(A0P.toString());
            CallInfo callInfo = Voip.getCallInfo();
            int i2 = c74613dY.A01;
            if (i2 == 0) {
                if (i == 2 || i == 1) {
                    c74613dY.A04(false, callInfo);
                    c74613dY.A01(callInfo);
                }
            } else if (i2 == 1 && (bluetoothHeadset = c74613dY.A03) != null) {
                for (BluetoothDevice bluetoothDevice : bluetoothHeadset.getConnectedDevices()) {
                    if (c74613dY.A03.isAudioConnected(bluetoothDevice)) {
                        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
                        StringBuilder A0P2 = C000200d.A0P("voip/audio_route/bluetoothScoReceiver device name: ");
                        A0P2.append(bluetoothDevice.getName());
                        A0P2.append(", device class:");
                        A0P2.append(bluetoothClass.getDeviceClass());
                        A0P2.append(", major class: ");
                        A0P2.append(bluetoothClass.getMajorDeviceClass());
                        A0P2.append(", supports AUDIO: ");
                        A0P2.append(bluetoothClass.hasService(2097152));
                        A0P2.append(", supports TELEPHONY: ");
                        A0P2.append(bluetoothClass.hasService(4194304));
                        A0P2.append(", address: ");
                        A0P2.append(bluetoothDevice.getAddress());
                        Log.i(A0P2.toString());
                    }
                }
            }
            c74613dY.A03(callInfo);
        }
    }
}
