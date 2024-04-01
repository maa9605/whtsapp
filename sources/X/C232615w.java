package X;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: X.15w  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C232615w {
    public static final Method A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|2|3|4|(15:43|44|7|8|9|10|11|12|13|(2:35|36)|15|(1:17)|18|(2:30|31)|(3:21|22|23)(1:29))|6|7|8|9|10|11|12|13|(0)|15|(0)|18|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.String r3 = "add"
            android.os.Process.myUid()
            r4 = 0
            r7 = 1
            r6 = 0
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L17
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L17
            r1[r6] = r0     // Catch: java.lang.Exception -> L17
            java.lang.reflect.Method r0 = r2.getMethod(r3, r1)     // Catch: java.lang.Exception -> L17
            goto L18
        L17:
            r0 = r4
        L18:
            X.C232615w.A00 = r0
            boolean r0 = X.AnonymousClass088.A1p()
            r8 = 2
            if (r0 == 0) goto L30
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L30
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L30
            r1[r6] = r0     // Catch: java.lang.Exception -> L30
            r1[r7] = r9     // Catch: java.lang.Exception -> L30
            java.lang.reflect.Method r0 = r2.getMethod(r3, r1)     // Catch: java.lang.Exception -> L30
            goto L31
        L30:
            r0 = r4
        L31:
            X.C232615w.A01 = r0
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r1 = "size"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Method r0 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> L3e
            goto L3f
        L3e:
            r0 = r4
        L3f:
            X.C232615w.A02 = r0
            java.lang.Class<android.os.WorkSource> r3 = android.os.WorkSource.class
            java.lang.String r2 = "get"
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L4e
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4e
            r1[r6] = r0     // Catch: java.lang.Exception -> L4e
            r3.getMethod(r2, r1)     // Catch: java.lang.Exception -> L4e
        L4e:
            boolean r0 = X.AnonymousClass088.A1p()
            if (r0 == 0) goto L62
            java.lang.Class<android.os.WorkSource> r3 = android.os.WorkSource.class
            java.lang.String r2 = "getName"
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L62
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L62
            r1[r6] = r0     // Catch: java.lang.Exception -> L62
            java.lang.reflect.Method r4 = r3.getMethod(r2, r1)     // Catch: java.lang.Exception -> L62
        L62:
            X.C232615w.A03 = r4
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            r0 = 0
            if (r5 < r3) goto L6c
            r0 = 1
        L6c:
            java.lang.String r4 = "WorkSourceUtil"
            if (r0 == 0) goto L80
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r1 = "createWorkChain"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L7a
            r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> L7a
            goto L80
        L7a:
            r1 = move-exception
            java.lang.String r0 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r4, r0, r1)
        L80:
            if (r5 < r3) goto L9c
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L96
            java.lang.String r2 = "addNode"
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L96
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L96
            r1[r6] = r0     // Catch: java.lang.Exception -> L96
            r1[r7] = r9     // Catch: java.lang.Exception -> L96
            r3.getMethod(r2, r1)     // Catch: java.lang.Exception -> L96
            return
        L96:
            r1 = move-exception
            java.lang.String r0 = "Missing WorkChain class"
            android.util.Log.w(r4, r0, r1)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232615w.<clinit>():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r2.trim().isEmpty() != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List A00(android.os.WorkSource r9) {
        /*
            java.lang.String r7 = "Unable to assign blame through WorkSource"
            java.lang.String r6 = "WorkSourceUtil"
            r5 = 0
            if (r9 == 0) goto L1c
            java.lang.reflect.Method r1 = X.C232615w.A02
            if (r1 == 0) goto L1c
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L18
            java.lang.Object r0 = r1.invoke(r9, r0)     // Catch: java.lang.Exception -> L18
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L18
            int r8 = r0.intValue()     // Catch: java.lang.Exception -> L18
            goto L1d
        L18:
            r0 = move-exception
            android.util.Log.wtf(r6, r7, r0)
        L1c:
            r8 = 0
        L1d:
            if (r8 != 0) goto L24
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L24:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
        L2a:
            if (r3 >= r8) goto L5b
            java.lang.reflect.Method r2 = X.C232615w.A03
            if (r2 == 0) goto L44
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L40
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L40
            r1[r5] = r0     // Catch: java.lang.Exception -> L40
            java.lang.Object r2 = r2.invoke(r9, r1)     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L40
            goto L45
        L40:
            r0 = move-exception
            android.util.Log.wtf(r6, r7, r0)
        L44:
            r2 = 0
        L45:
            if (r2 == 0) goto L52
            java.lang.String r0 = r2.trim()
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L53
        L52:
            r0 = 1
        L53:
            if (r0 != 0) goto L58
            r4.add(r2)
        L58:
            int r3 = r3 + 1
            goto L2a
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232615w.A00(android.os.WorkSource):java.util.List");
    }

    public static boolean A01(Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        return C06080Rl.A00(context).A00.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
    }
}
