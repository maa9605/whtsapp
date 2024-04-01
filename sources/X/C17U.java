package X;

/* renamed from: X.17U  reason: invalid class name */
/* loaded from: classes.dex */
public final class C17U {
    public static C239718z A00;
    public static Boolean A01;
    public static Object A02 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0.enabled == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(android.content.Context r4) {
        /*
            X.C07K.A1P(r4)
            java.lang.Boolean r0 = X.C17U.A01
            if (r0 == 0) goto Lc
            boolean r0 = r0.booleanValue()
            return r0
        Lc:
            java.lang.String r3 = "com.google.android.gms.analytics.AnalyticsReceiver"
            r2 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r0.<init>(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.ActivityInfo r0 = r1.getReceiverInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r0 == 0) goto L23
            boolean r0 = r0.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r1 = 1
            if (r0 != 0) goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C17U.A01 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17U.A00(android.content.Context):boolean");
    }
}
