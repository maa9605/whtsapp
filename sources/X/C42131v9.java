package X;

/* renamed from: X.1v9 */
/* loaded from: classes2.dex */
public class C42131v9 {
    public static volatile C42131v9 A04;
    public final C01B A00;
    public final C001200o A01;
    public final C000500h A02;
    public final C0EG A03;

    public C42131v9(C001200o c001200o, C0EG c0eg, C01B c01b, C000500h c000500h) {
        this.A01 = c001200o;
        this.A03 = c0eg;
        this.A00 = c01b;
        this.A02 = c000500h;
    }

    public static C42131v9 A00() {
        if (A04 == null) {
            synchronized (C42131v9.class) {
                if (A04 == null) {
                    A04 = new C42131v9(C001200o.A01, C0EG.A00(), C01B.A00(), C000500h.A00());
                }
            }
        }
        return A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x002d, code lost:
        if (210915004 != r3) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(java.lang.String r7) {
        /*
            r6 = this;
            X.01B r1 = r6.A00
            X.03B r0 = X.C01C.A0s
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            X.00h r5 = r6.A02
            android.content.SharedPreferences r2 = r5.A00
            java.lang.String r1 = "fbns_token"
            r0 = 0
            java.lang.String r4 = r2.getString(r1, r0)
            java.lang.String r1 = "fbns_app_vers"
            r0 = 0
            int r3 = r2.getInt(r1, r0)
            r2 = 210915004(0xc924ebc, float:2.2542248E-31)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L2f
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L2f
            r1 = 0
            if (r2 == r3) goto L30
        L2f:
            r1 = 1
        L30:
            java.lang.String r0 = "last_server_fbns_token"
            X.C000200d.A0i(r5, r0, r7)
            if (r1 == 0) goto La1
            X.0Ni r2 = new X.0Ni
            r2.<init>()
            X.00o r0 = r6.A01
            android.app.Application r1 = r0.A00
            java.lang.String r0 = X.C0FH.A06
            X.0Nj r5 = new X.0Nj
            r5.<init>(r2, r1, r0)
            X.0Ni r0 = r5.A01
            boolean r0 = r0.A00
            if (r0 == 0) goto La1
            java.lang.String r4 = r5.A03
            if (r4 == 0) goto La1
            if (r0 == 0) goto La1
            if (r4 == 0) goto La1
            java.lang.String r0 = "com.facebook.rti.fbns.intent.REGISTER"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            android.content.Context r2 = r5.A00
            java.lang.String r1 = r2.getPackageName()
            java.lang.String r0 = "pkg_name"
            r3.putExtra(r0, r1)
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "appid"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "com.facebook.services"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L7e
            java.lang.String r0 = "com.facebook.services.dev"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto La1
        L7e:
            java.lang.String r1 = "com.facebook.oxygen.services.fbns.PreloadedFbnsService"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L99 java.lang.SecurityException -> La1
            r0.<init>(r4, r1)     // Catch: java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L99 java.lang.SecurityException -> La1
            r3.setComponent(r0)     // Catch: java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L99 java.lang.SecurityException -> La1
            X.C05120Nk.A00(r2, r3)     // Catch: java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L99 java.lang.SecurityException -> La1
            r2.startService(r3)     // Catch: java.lang.RuntimeException -> L8f java.lang.IllegalStateException -> L99 java.lang.SecurityException -> La1
            return
        L8f:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 != 0) goto La1
            throw r1
        L99:
            r2 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 >= r0) goto La1
            throw r2
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42131v9.A01(java.lang.String):void");
    }
}
