package X;

import android.content.BroadcastReceiver;

/* renamed from: X.17S  reason: invalid class name */
/* loaded from: classes.dex */
public class C17S extends BroadcastReceiver {
    public static final String A03 = C17S.class.getName();
    public boolean A00;
    public boolean A01;
    public final AnonymousClass176 A02;

    public C17S(AnonymousClass176 anonymousClass176) {
        C07K.A1P(anonymousClass176);
        this.A02 = anonymousClass176;
    }

    public final void A00() {
        if (this.A00) {
            AnonymousClass176 anonymousClass176 = this.A02;
            C39851qp c39851qp = anonymousClass176.A07;
            AnonymousClass176.A01(c39851qp);
            c39851qp.A03("Unregistering connectivity change receiver");
            this.A00 = false;
            this.A01 = false;
            try {
                anonymousClass176.A00.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                AnonymousClass176.A01(c39851qp);
                c39851qp.A09("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r0.isConnected() == false) goto L16;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            X.176 r3 = r5.A02
            X.1qp r2 = r3.A07
            X.AnonymousClass176.A01(r2)
            X.1qg r4 = r3.A04
            X.AnonymousClass176.A01(r4)
            java.lang.String r1 = r7.getAction()
            X.AnonymousClass176.A01(r2)
            java.lang.String r0 = "NetworkBroadcastReceiver received action"
            r2.A06(r0, r1)
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            android.content.Context r1 = r3.A00
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L37
            if (r0 == 0) goto L37
            boolean r0 = r0.isConnected()     // Catch: java.lang.SecurityException -> L37
            r1 = 1
            if (r0 != 0) goto L38
        L37:
            r1 = 0
        L38:
            boolean r0 = r5.A01
            if (r0 == r1) goto L5e
            r5.A01 = r1
            X.AnonymousClass176.A01(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "Network connectivity status changed"
            r4.A06(r0, r1)
            X.176 r0 = r4.A00
            X.13H r0 = r0.A02
            X.C07K.A1P(r0)
            X.172 r1 = new X.172
            r1.<init>()
            X.C07K.A1P(r1)
            X.13E r0 = r0.A02
            r0.submit(r1)
        L5e:
            return
        L5f:
            java.lang.String r0 = "com.google.analytics.RADIO_POWERED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb6
            java.lang.String r0 = X.C17S.A03
            boolean r0 = r7.hasExtra(r0)
            if (r0 != 0) goto L9e
            X.AnonymousClass176.A01(r4)
            java.lang.String r0 = "Radio powered up"
            r4.A03(r0)
            r4.A0C()
            X.176 r1 = r4.A00
            android.content.Context r3 = r1.A00
            boolean r0 = X.C17U.A00(r3)
            if (r0 == 0) goto L9f
            boolean r0 = X.C17V.A00(r3)
            if (r0 == 0) goto L9f
            java.lang.String r0 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r1 = "com.google.android.gms.analytics.AnalyticsService"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r3, r1)
            r2.setComponent(r0)
            r3.startService(r2)
        L9e:
            return
        L9f:
            r2 = 0
            r4.A0C()
            X.13H r0 = r1.A02
            X.C07K.A1P(r0)
            X.173 r1 = new X.173
            r1.<init>(r4, r2)
            X.C07K.A1P(r1)
            X.13E r0 = r0.A02
            r0.submit(r1)
            return
        Lb6:
            X.AnonymousClass176.A01(r2)
            java.lang.String r0 = "NetworkBroadcastReceiver received unknown action"
            r2.A08(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17S.onReceive(android.content.Context, android.content.Intent):void");
    }
}
