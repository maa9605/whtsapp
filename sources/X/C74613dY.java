package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import com.whatsapp.voipcalling.VoipCallFooter;
import java.lang.ref.WeakReference;

/* renamed from: X.3dY */
/* loaded from: classes2.dex */
public class C74613dY {
    public int A00;
    public int A01;
    public BluetoothAdapter A02;
    public BluetoothHeadset A03;
    public boolean A04;
    public boolean A05 = false;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final C02E A0A;
    public final AbstractC84583tz A0B;
    public final AnonymousClass258 A0C;
    public final C459824m A0D;
    public final C25L A0E;
    public final C84873uU A0F;
    public final C74603dX A0G;
    public final C84883uV A0H;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.3uU] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.3dX] */
    public C74613dY(C25L c25l, Context context, C02E c02e, C459824m c459824m) {
        this.A0E = c25l;
        this.A09 = context;
        this.A0A = c02e;
        this.A0D = c459824m;
        StringBuilder sb = new StringBuilder("voip/audio_route/create ");
        sb.append(this);
        Log.i(sb.toString());
        C84383te c84383te = new C84383te(this);
        int i = Build.VERSION.SDK_INT;
        AbstractC84583tz c86723y8 = i >= 23 ? new AbstractC84583tz(c02e) { // from class: X.3y7
            public final AudioDeviceCallback A00 = new AudioDeviceCallback() { // from class: X.3d5
                {
                    C86713y7.this = this;
                }

                @Override // android.media.AudioDeviceCallback
                public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                    A02();
                }

                @Override // android.media.AudioDeviceCallback
                public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                    A02();
                }
            };
            public final C02E A01;

            {
                this.A01 = c02e;
            }

            @Override // X.AbstractC84583tz
            public void A00() {
                AudioManager A0A = this.A01.A0A();
                if (A0A == null) {
                    return;
                }
                A0A.registerAudioDeviceCallback(this.A00, null);
            }

            @Override // X.AbstractC84583tz
            public void A01() {
                AudioManager A0A = this.A01.A0A();
                if (A0A == null) {
                    return;
                }
                A0A.unregisterAudioDeviceCallback(this.A00);
            }

            @Override // X.AbstractC84583tz
            public boolean A03() {
                AudioManager A0A = this.A01.A0A();
                if (A0A == null) {
                    return false;
                }
                for (AudioDeviceInfo audioDeviceInfo : A0A.getDevices(2)) {
                    int type = audioDeviceInfo.getType();
                    if (type == 4 || type == 3 || type == 11 || (Build.VERSION.SDK_INT >= 26 && type == 22)) {
                        return true;
                    }
                }
                return false;
            }
        } : new C86723y8(context, c02e);
        c86723y8.A00 = c84383te;
        this.A0B = c86723y8;
        this.A0F = new BroadcastReceiver() { // from class: X.3uU
            public volatile boolean A01 = false;
            public final Object A00 = new Object();

            {
                C74613dY.this = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (!this.A01) {
                    synchronized (this.A00) {
                        if (!this.A01) {
                            AnonymousClass029.A0Y(context2);
                            this.A01 = true;
                        }
                    }
                }
                if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                    int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", 0);
                    StringBuilder A0P = C000200d.A0P("voip/audio_route/bluetoothConnectionReceiver [");
                    A0P.append(intExtra2 != 0 ? intExtra2 != 1 ? intExtra2 != 2 ? intExtra2 != 3 ? "UNKOWN BLUETOOTH CONNECTION STATE" : "DISCONNECTING" : "CONNECTED" : "CONNECTING" : "DISCONNECTED");
                    A0P.append(" -> ");
                    A0P.append(intExtra != 0 ? intExtra != 1 ? intExtra != 2 ? intExtra != 3 ? "UNKOWN BLUETOOTH CONNECTION STATE" : "DISCONNECTING" : "CONNECTED" : "CONNECTING" : "DISCONNECTED");
                    C000200d.A1N(A0P, "]");
                    if (intExtra == intExtra2) {
                        return;
                    }
                    if (intExtra != 0) {
                        if (intExtra == 2) {
                            C74613dY.this.A00(Voip.getCallInfo());
                            return;
                        } else if (intExtra != 3) {
                            return;
                        }
                    }
                    C74613dY.this.A04(false, Voip.getCallInfo());
                }
            }
        };
        this.A0H = new C84883uV(this);
        this.A0G = new BluetoothProfile.ServiceListener(this) { // from class: X.3dX
            public WeakReference A00;

            {
                StringBuilder sb2 = new StringBuilder("voip/audio_route/BluetoothProfileListener created");
                sb2.append(this);
                Log.i(sb2.toString());
                this.A00 = new WeakReference(this);
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceConnected(int i2, BluetoothProfile bluetoothProfile) {
                C74613dY c74613dY = (C74613dY) this.A00.get();
                if (c74613dY == null || c74613dY.A05) {
                    StringBuilder sb2 = new StringBuilder("voip/audio_route/BluetoothProfileListener/onServiceConnected VoipAudioManager already Destroyed ");
                    sb2.append(c74613dY);
                    Log.w(sb2.toString());
                } else if (i2 == 1) {
                    BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
                    c74613dY.A03 = bluetoothHeadset;
                    StringBuilder A0P = C000200d.A0P("voip/audio_route/BluetoothProfileListener/onServiceConnected ");
                    A0P.append(bluetoothHeadset);
                    A0P.append(", devices: ");
                    A0P.append(c74613dY.A03.getConnectedDevices());
                    A0P.append(", ");
                    A0P.append(c74613dY);
                    Log.i(A0P.toString());
                    c74613dY.A00(Voip.getCallInfo());
                }
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceDisconnected(int i2) {
                C74613dY c74613dY = (C74613dY) this.A00.get();
                if (c74613dY == null || c74613dY.A05) {
                    StringBuilder sb2 = new StringBuilder("voip/audio_route/BluetoothProfileListener/onServiceDisconnected VoipAudioManager already Destroyed ");
                    sb2.append(c74613dY);
                    Log.w(sb2.toString());
                } else if (i2 == 1) {
                    StringBuilder A0P = C000200d.A0P("voip/audio_route/BluetoothProfileListener/onServiceDisconnected ");
                    A0P.append(c74613dY.A03);
                    A0P.append(", ");
                    A0P.append(c74613dY);
                    Log.i(A0P.toString());
                    c74613dY.A03 = null;
                    c74613dY.A04(false, Voip.getCallInfo());
                }
            }
        };
        this.A0C = i >= 28 ? new C86743yC(this) : null;
    }

    public void A00(CallInfo callInfo) {
        if (callInfo != null && callInfo.callState != Voip.CallState.NONE) {
            if (A06()) {
                A02(callInfo);
                A04(true, callInfo);
            } else if (this.A0B.A03()) {
                A03(callInfo);
            } else {
                Boolean A00 = Voip.A00("options.android_should_use_speaker_for_ringtone");
                if (callInfo.videoEnabled || (A00 != null && A00.booleanValue() && callInfo.callState == Voip.CallState.RECEIVED_CALL)) {
                    A05(true, callInfo);
                } else {
                    A05(false, callInfo);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0056, code lost:
        if ((r4.videoEnabled || (r1 != null && r1.booleanValue() && r4.callState == com.whatsapp.voipcalling.Voip.CallState.RECEIVED_CALL)) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(com.whatsapp.voipcalling.CallInfo r4) {
        /*
            r3 = this;
            r3.A03(r4)
            if (r4 == 0) goto L5b
            com.whatsapp.voipcalling.Voip$CallState r2 = r4.callState
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.NONE
            if (r2 == r0) goto L5b
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.ACTIVE_ELSEWHERE
            if (r2 == r0) goto L5b
            java.lang.String r0 = "voip/audio_route/checkAndTurnOnSpeakerPhone usingSpeakerBefore: "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            boolean r0 = r3.A08
            r1.append(r0)
            java.lang.String r0 = ", video call: "
            r1.append(r0)
            boolean r0 = r4.videoEnabled
            r1.append(r0)
            java.lang.String r0 = ", call state: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            int r1 = r3.A00
            r0 = 2
            r2 = 1
            if (r1 != r0) goto L5e
            boolean r0 = r3.A08
            if (r0 != 0) goto L58
            java.lang.String r0 = "options.android_should_use_speaker_for_ringtone"
            java.lang.Boolean r1 = com.whatsapp.voipcalling.Voip.A00(r0)
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L55
            if (r1 == 0) goto L5c
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L5c
            com.whatsapp.voipcalling.Voip$CallState r1 = r4.callState
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.RECEIVED_CALL
            if (r1 != r0) goto L5c
        L55:
            r0 = 1
        L56:
            if (r0 == 0) goto L5e
        L58:
            r3.A05(r2, r4)
        L5b:
            return
        L5c:
            r0 = 0
            goto L56
        L5e:
            int r0 = r3.A00
            if (r0 != r2) goto L5b
            com.whatsapp.voipcalling.Voip$CallState r1 = r4.callState
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.ACCEPT_SENT
            if (r1 != r0) goto L5b
            boolean r0 = r3.A08
            if (r0 != 0) goto L5b
            r0 = 0
            r3.A05(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74613dY.A01(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void A02(CallInfo callInfo) {
        boolean z = true;
        this.A08 = (this.A00 != 1 || callInfo.videoEnabled || callInfo.callState == Voip.CallState.RECEIVED_CALL) ? false : false;
    }

    public final void A03(CallInfo callInfo) {
        Voip.CallState callState;
        VoipCallFooter voipCallFooter;
        C000700j.A01();
        if (callInfo != null && (callState = callInfo.callState) != Voip.CallState.NONE && callState != Voip.CallState.ACTIVE_ELSEWHERE) {
            int i = this.A00;
            AudioManager A0A = this.A0A.A0A();
            if (A0A == null) {
                return;
            }
            C25L c25l = this.A0E;
            C74403dD A0B = c25l.A0B(callInfo.callId);
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 28 && A0B != null && A0B.getCallAudioState() != null) {
                int route = A0B.getCallAudioState().getRoute();
                if (route == 1) {
                    this.A00 = 2;
                } else if (route == 2) {
                    this.A00 = 3;
                } else if (route == 4) {
                    this.A00 = 4;
                } else if (route == 8) {
                    this.A00 = 1;
                }
            } else {
                if (A0A.isBluetoothScoOn()) {
                    this.A00 = 3;
                } else if (A0A.isSpeakerphoneOn() && !this.A06) {
                    this.A00 = 1;
                    if (i != 1) {
                        this.A08 = false;
                    }
                } else if (this.A0B.A03()) {
                    this.A00 = 4;
                } else {
                    this.A00 = 2;
                }
                this.A04 = A0A.isBluetoothScoOn();
                z = false;
            }
            StringBuilder A0P = C000200d.A0P("voip/audio_route/updateAudioRoute: [");
            A0P.append(Voip.A05(i));
            A0P.append(" -> ");
            A0P.append(Voip.A05(this.A00));
            A0P.append("], ");
            A0P.append("using telecom: ");
            A0P.append(z);
            A0P.append(", ");
            A0P.append("Bluetooth: [ScoAudioState: ");
            A0P.append(C84883uV.A00(this.A01));
            A0P.append(", ScoOn: ");
            A0P.append(A0A.isBluetoothScoOn());
            A0P.append(", ScoRequested: ");
            A0P.append(this.A04);
            A0P.append("], ");
            A0P.append("Speaker: ");
            A0P.append(A0A.isSpeakerphoneOn());
            A0P.append(", ");
            A0P.append(this);
            Log.i(A0P.toString());
            this.A06 = false;
            int i2 = this.A00;
            c25l.A0s.execute(new RunnableC73913cP(i2));
            C0MS c0ms = c25l.A0Z;
            if (c0ms != null) {
                boolean A0w = c25l.A0w();
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) c0ms;
                C000700j.A01();
                VoipCallControlBottomSheet voipCallControlBottomSheet = voipActivityV2.A1I;
                if (voipCallControlBottomSheet != null && (voipCallFooter = voipCallControlBottomSheet.A0T) != null) {
                    voipCallFooter.A03(callInfo, i2, A0w);
                } else {
                    voipActivityV2.A1J.A03(callInfo, i2, A0w);
                }
            }
            c25l.A0g(callInfo);
            c25l.A1B = false;
        }
    }

    public void A04(boolean z, CallInfo callInfo) {
        AudioManager A0A;
        C74403dD A0B = this.A0E.A0B(callInfo == null ? null : callInfo.callId);
        StringBuilder A0P = C000200d.A0P("voip/audio_route/changeBluetoothState ");
        A0P.append(z ? "On" : "Off");
        A0P.append(" using telecom: ");
        C000200d.A1V(A0P, A0B != null);
        if (Build.VERSION.SDK_INT >= 28 && A0B != null) {
            if (z) {
                A0B.setAudioRoute(2);
            } else if (A0B.getCallAudioState() == null || A0B.getCallAudioState().getRoute() != 2) {
            } else {
                A0B.setAudioRoute(5);
            }
        } else if (this.A04 == z || (A0A = this.A0A.A0A()) == null) {
        } else {
            this.A04 = z;
            try {
                if (z) {
                    A0A.startBluetoothSco();
                    A0A.setBluetoothScoOn(true);
                } else {
                    A0A.setBluetoothScoOn(false);
                    A0A.stopBluetoothSco();
                }
            } catch (Exception e) {
                Log.e(e);
            }
            A03(callInfo);
        }
    }

    public void A05(boolean z, CallInfo callInfo) {
        C74403dD A0B = this.A0E.A0B(callInfo == null ? null : callInfo.callId);
        StringBuilder A0P = C000200d.A0P("voip/audio_route/changeSpeakerphoneState ");
        A0P.append(z ? "On" : "Off");
        A0P.append(" using telecom: ");
        C000200d.A1V(A0P, A0B != null);
        if (Build.VERSION.SDK_INT >= 28 && A0B != null) {
            if (z) {
                A0B.setAudioRoute(8);
                return;
            } else {
                A0B.setAudioRoute(5);
                return;
            }
        }
        AudioManager A0A = this.A0A.A0A();
        if (A0A == null) {
            return;
        }
        A0A.setSpeakerphoneOn(z);
        A03(callInfo);
    }

    public boolean A06() {
        AudioManager A0A;
        BluetoothHeadset bluetoothHeadset;
        try {
            BluetoothAdapter bluetoothAdapter = this.A02;
            if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled() || (A0A = this.A0A.A0A()) == null || !A0A.isBluetoothScoAvailableOffCall() || (bluetoothHeadset = this.A03) == null) {
                return false;
            }
            return !bluetoothHeadset.getConnectedDevices().isEmpty();
        } catch (Exception e) {
            Log.e(e);
            return false;
        }
    }
}
