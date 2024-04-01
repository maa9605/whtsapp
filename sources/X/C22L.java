package X;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.22L  reason: invalid class name */
/* loaded from: classes2.dex */
public class C22L implements C22M {
    public BroadcastReceiver A00;
    public Handler A01;
    public final C0E7 A02;
    public final C462626b A03;
    public final C001200o A04;
    public final C40291rx A05;

    public C22L(C001200o c001200o, C40291rx c40291rx, C462626b c462626b, C0E7 c0e7) {
        this.A04 = c001200o;
        this.A05 = c40291rx;
        this.A03 = c462626b;
        this.A02 = c0e7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (X.C0E7.A01() == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(boolean r9) {
        /*
            r8 = this;
            X.0E7 r0 = r8.A02
            android.net.NetworkInfo r3 = r0.A04()
            java.lang.String r0 = "xmpp/handler/network/active "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " isRetry="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            r4 = 1
            if (r3 == 0) goto L65
            android.net.NetworkInfo$State r1 = r3.getState()
            android.net.NetworkInfo$State r0 = android.net.NetworkInfo.State.CONNECTED
            r2 = 0
            if (r1 != r0) goto L2c
            r2 = 1
        L2c:
            int r1 = r3.getType()
            r0 = 0
            if (r1 != r4) goto L34
            r0 = 1
        L34:
            if (r2 == 0) goto L3f
            if (r0 == 0) goto L3f
            boolean r0 = X.C0E7.A01()
            r7 = 1
            if (r0 != 0) goto L40
        L3f:
            r7 = 0
        L40:
            X.26b r0 = r8.A03
            r0.A01()
            X.1rx r6 = r8.A05
            if (r2 == 0) goto L63
            if (r7 != 0) goto L63
        L4b:
            long r2 = (long) r1
            android.os.Handler r5 = r6.A0J
            r0 = 0
            android.os.Message r4 = android.os.Message.obtain(r5, r0, r4, r0)
            android.os.Bundle r1 = r4.getData()
            java.lang.String r0 = "networkId"
            r1.putLong(r0, r2)
            r5.sendMessage(r4)
            r6.A0B(r7, r9)
            return
        L63:
            r4 = 0
            goto L4b
        L65:
            r1 = -1
            r2 = 0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22L.A00(boolean):void");
    }

    @Override // X.C22M
    public long A9T() {
        NetworkInfo A04 = this.A02.A04();
        if (A04 != null) {
            return A04.getType();
        }
        return -1L;
    }

    @Override // X.C22M
    public void ARc() {
        Handler handler = this.A01;
        if (handler == null) {
            throw null;
        }
        handler.post(new RunnableEBaseShape4S0100000_I0_4(this, 27));
    }

    @Override // X.C22M
    public void AV1(Handler handler) {
        this.A01 = handler;
        Application application = this.A04.A00;
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.2Ad
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    C22L.this.A00(false);
                    return;
                }
                StringBuilder sb = new StringBuilder("unknown intent received in connectivity receiver ");
                sb.append(intent);
                Log.w(sb.toString());
            }
        };
        this.A00 = broadcastReceiver;
        if (application.registerReceiver(broadcastReceiver, intentFilter, null, handler) != null || handler.post(new RunnableEBaseShape4S0100000_I0_4(this, 26))) {
            return;
        }
        Log.w("failed to post checkNetworkState isRetry: false");
    }

    @Override // X.C22M
    public void AVC() {
        this.A04.A00.unregisterReceiver(this.A00);
        this.A00 = null;
        this.A01 = null;
    }

    @Override // X.C22M
    public boolean isConnected() {
        NetworkInfo A04 = this.A02.A04();
        return A04 != null && A04.isConnected();
    }
}
