package X;

/* renamed from: X.48Y  reason: invalid class name */
/* loaded from: classes3.dex */
public class C48Y {
    public C899148x A00;
    public boolean A01;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r3 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void A00() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.A01     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L7
            monitor-exit(r6)
            return
        L7:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L45
            r1 = 18
            r5 = 1
            r0 = 0
            if (r2 < r1) goto L10
            r0 = 1
        L10:
            r4 = 0
            if (r0 == 0) goto L3f
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r3 = java.security.KeyStore.getInstance(r0)     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L45
            r3.load(r4)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L45
            goto L37
        L1d:
            r2 = move-exception
            goto L21
        L1f:
            r2 = move-exception
            r3 = r4
        L21:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r1.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore keystore load threw: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L45
            r1.append(r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L45
            com.whatsapp.util.Log.w(r0)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L3f
        L37:
            X.48x r0 = new X.48x     // Catch: java.lang.Throwable -> L45
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L45
            r6.A00 = r0     // Catch: java.lang.Throwable -> L45
            goto L41
        L3f:
            r6.A00 = r4     // Catch: java.lang.Throwable -> L45
        L41:
            r6.A01 = r5     // Catch: java.lang.Throwable -> L45
            monitor-exit(r6)
            return
        L45:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48Y.A00():void");
    }
}
