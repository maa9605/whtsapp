package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

/* renamed from: X.1Vq */
/* loaded from: classes.dex */
public class C29161Vq extends AbstractC16800r2 {
    public static final String A03 = AbstractC16430qO.A01("NetworkStateTracker");
    public C16810r3 A00;
    public C16820r4 A01;
    public final ConnectivityManager A02;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0r3] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0r4] */
    public C29161Vq(Context context, InterfaceC17300rs taskExecutor) {
        super(context, taskExecutor);
        this.A02 = (ConnectivityManager) super.A01.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.A01 = new ConnectivityManager.NetworkCallback() { // from class: X.0r4
                {
                    C29161Vq.this = this;
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
                    AbstractC16430qO.A00().A02(C29161Vq.A03, String.format("Network capabilities changed: %s", capabilities), new Throwable[0]);
                    C29161Vq c29161Vq = C29161Vq.this;
                    c29161Vq.A04(c29161Vq.A05());
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    AbstractC16430qO.A00().A02(C29161Vq.A03, "Network connection lost", new Throwable[0]);
                    C29161Vq c29161Vq = C29161Vq.this;
                    c29161Vq.A04(c29161Vq.A05());
                }
            };
        } else {
            this.A00 = new BroadcastReceiver() { // from class: X.0r3
                {
                    C29161Vq.this = this;
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        return;
                    }
                    AbstractC16430qO.A00().A02(C29161Vq.A03, "Network broadcast received", new Throwable[0]);
                    C29161Vq c29161Vq = C29161Vq.this;
                    c29161Vq.A04(c29161Vq.A05());
                }
            };
        }
    }

    @Override // X.AbstractC16800r2
    public Object A00() {
        return A05();
    }

    @Override // X.AbstractC16800r2
    public void A01() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                AbstractC16430qO.A00().A02(A03, "Registering network callback", new Throwable[0]);
                this.A02.registerDefaultNetworkCallback(this.A01);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                AbstractC16430qO.A00().A03(A03, "Received exception while registering network callback", e);
                return;
            }
        }
        AbstractC16430qO.A00().A02(A03, "Registering broadcast receiver", new Throwable[0]);
        super.A01.registerReceiver(this.A00, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // X.AbstractC16800r2
    public void A02() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                AbstractC16430qO.A00().A02(A03, "Unregistering network callback", new Throwable[0]);
                this.A02.unregisterNetworkCallback(this.A01);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                AbstractC16430qO.A00().A03(A03, "Received exception while unregistering network callback", e);
                return;
            }
        }
        AbstractC16430qO.A00().A02(A03, "Unregistering broadcast receiver", new Throwable[0]);
        super.A01.unregisterReceiver(this.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x000f, code lost:
        if (r8.isConnected() == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C16750qx A05() {
        /*
            r9 = this;
            android.net.ConnectivityManager r6 = r9.A02
            android.net.NetworkInfo r8 = r6.getActiveNetworkInfo()
            r5 = 0
            r7 = 1
            if (r8 == 0) goto L11
            boolean r0 = r8.isConnected()
            r4 = 1
            if (r0 != 0) goto L12
        L11:
            r4 = 0
        L12:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L3c
            android.net.Network r0 = r6.getActiveNetwork()     // Catch: java.lang.SecurityException -> L2c
            android.net.NetworkCapabilities r1 = r6.getNetworkCapabilities(r0)     // Catch: java.lang.SecurityException -> L2c
            if (r1 == 0) goto L3c
            r0 = 16
            boolean r0 = r1.hasCapability(r0)     // Catch: java.lang.SecurityException -> L2c
            r2 = 1
            if (r0 != 0) goto L3d
            goto L3c
        L2c:
            r0 = move-exception
            X.0qO r3 = X.AbstractC16430qO.A00()
            java.lang.String r2 = X.C29161Vq.A03
            java.lang.Throwable[] r1 = new java.lang.Throwable[r7]
            r1[r5] = r0
            java.lang.String r0 = "Unable to validate active network"
            r3.A03(r2, r0, r1)
        L3c:
            r2 = 0
        L3d:
            boolean r1 = r6.isActiveNetworkMetered()
            if (r8 == 0) goto L4a
            boolean r0 = r8.isRoaming()
            if (r0 != 0) goto L4a
            r5 = 1
        L4a:
            X.0qx r0 = new X.0qx
            r0.<init>(r4, r2, r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29161Vq.A05():X.0qx");
    }
}
