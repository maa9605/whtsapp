package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.22N */
/* loaded from: classes2.dex */
public class C22N implements C22M {
    public Handler A00;
    public C3MC A01;
    public final C02E A02;
    public final C462626b A03;
    public final C40291rx A04;

    public C22N(C02E c02e, C40291rx c40291rx, C462626b c462626b) {
        this.A02 = c02e;
        this.A04 = c40291rx;
        this.A03 = c462626b;
    }

    public /* synthetic */ void A00() {
        boolean z;
        long j;
        C3MC c3mc = this.A01;
        if (c3mc != null) {
            Network network = c3mc.A00;
            if (network != null) {
                z = true;
                j = network.getNetworkHandle();
            } else {
                z = false;
                j = -1;
            }
            A01(z, j, A02(network), true);
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000a, code lost:
        if (r9 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01(boolean r6, long r7, boolean r9, boolean r10) {
        /*
            r5 = this;
            X.26b r0 = r5.A03
            r0.A01()
            X.1rx r4 = r5.A04
            if (r6 == 0) goto Lc
            r1 = 1
            if (r9 == 0) goto Ld
        Lc:
            r1 = 0
        Ld:
            android.os.Handler r3 = r4.A0J
            r0 = 0
            android.os.Message r2 = android.os.Message.obtain(r3, r0, r1, r0)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "networkId"
            r1.putLong(r0, r7)
            r3.sendMessage(r2)
            r4.A0B(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22N.A01(boolean, long, boolean, boolean):void");
    }

    public final boolean A02(Network network) {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager A0B = this.A02.A0B();
        return (A0B == null || network == null || (networkCapabilities = A0B.getNetworkCapabilities(network)) == null || !networkCapabilities.hasTransport(1) || !networkCapabilities.hasCapability(17)) ? false : true;
    }

    @Override // X.C22M
    public long A9T() {
        Network activeNetwork;
        ConnectivityManager A0B = this.A02.A0B();
        if (A0B == null || (activeNetwork = A0B.getActiveNetwork()) == null) {
            return -1L;
        }
        return activeNetwork.getNetworkHandle();
    }

    @Override // X.C22M
    public void ARc() {
        Handler handler = this.A00;
        if (handler == null) {
            throw null;
        }
        handler.post(new RunnableEBaseShape4S0100000_I0_4(this, 25));
    }

    @Override // X.C22M
    public void AV1(Handler handler) {
        C000700j.A07(this.A01 == null);
        this.A00 = handler;
        this.A01 = new C3MC(this);
        ConnectivityManager A0B = this.A02.A0B();
        if (A0B != null) {
            A0B.registerDefaultNetworkCallback(this.A01, handler);
        } else {
            Log.e("xmpp/handler/network/startNetworkCallbacks cm null");
        }
    }

    @Override // X.C22M
    public void AVC() {
        C000700j.A07(this.A01 != null);
        ConnectivityManager A0B = this.A02.A0B();
        if (A0B != null) {
            A0B.unregisterNetworkCallback(this.A01);
        }
        this.A01 = null;
        this.A00 = null;
    }

    @Override // X.C22M
    public boolean isConnected() {
        C3MC c3mc = this.A01;
        return (c3mc == null || c3mc.A00 == null) ? false : true;
    }
}
