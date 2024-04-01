package X;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0jt */
/* loaded from: classes.dex */
public final class C12690jt {
    public static final Handler A00 = new Handler(Looper.getMainLooper());
    public static final Class A01;
    public static final Field A02;
    public static final Field A03;
    public static final Method A04;
    public static final Method A05;
    public static final Method A06;

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|4|(2:5|6)|7|(2:8|9)|10|(11:32|33|13|(6:28|29|16|(2:24|25)|20|21)|15|16|(1:18)|24|25|20|21)|12|13|(0)|15|16|(0)|24|25|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            X.C12690jt.A00 = r0
            r9 = 0
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r0 = r9
        L14:
            X.C12690jt.A01 = r0
            r3 = 1
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r0 = "mMainThread"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L23
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r0 = r9
        L24:
            X.C12690jt.A02 = r0
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r0 = "mToken"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L32
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
            r0 = r9
        L33:
            X.C12690jt.A03 = r0
            java.lang.Class r4 = X.C12690jt.A01
            r2 = 3
            java.lang.String r5 = "performStopActivity"
            r7 = 2
            r8 = 0
            if (r4 == 0) goto L54
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L54
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r1[r8] = r0     // Catch: java.lang.Throwable -> L54
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L54
            r1[r3] = r0     // Catch: java.lang.Throwable -> L54
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r7] = r0     // Catch: java.lang.Throwable -> L54
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r5, r1)     // Catch: java.lang.Throwable -> L54
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L54
            goto L55
        L54:
            r0 = r9
        L55:
            X.C12690jt.A05 = r0
            if (r4 == 0) goto L6b
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L6b
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r1[r8] = r0     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L6b
            r1[r3] = r0     // Catch: java.lang.Throwable -> L6b
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r5, r1)     // Catch: java.lang.Throwable -> L6b
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L6b
            goto L6c
        L6b:
            r0 = r9
        L6c:
            X.C12690jt.A04 = r0
            java.lang.Class r6 = X.C12690jt.A01
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 == r0) goto L7a
            r0 = 27
            if (r1 != r0) goto Lac
        L7a:
            if (r4 == 0) goto Lac
            java.lang.String r5 = "requestRelaunchActivity"
            r0 = 9
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> Lac
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r4[r8] = r0     // Catch: java.lang.Throwable -> Lac
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r4[r3] = r0     // Catch: java.lang.Throwable -> Lac
            r4[r7] = r0     // Catch: java.lang.Throwable -> Lac
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lac
            r4[r2] = r0     // Catch: java.lang.Throwable -> Lac
            r0 = 4
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lac
            r4[r0] = r2     // Catch: java.lang.Throwable -> Lac
            r0 = 5
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            r4[r0] = r1     // Catch: java.lang.Throwable -> Lac
            r0 = 6
            r4[r0] = r1     // Catch: java.lang.Throwable -> Lac
            r0 = 7
            r4[r0] = r2     // Catch: java.lang.Throwable -> Lac
            r0 = 8
            r4[r0] = r2     // Catch: java.lang.Throwable -> Lac
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r5, r4)     // Catch: java.lang.Throwable -> Lac
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> Lac
            r9 = r0
        Lac:
            X.C12690jt.A06 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12690jt.<clinit>():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0012, code lost:
        if (r2 == 27) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(android.app.Activity r11) {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r10 = 1
            r0 = 28
            if (r2 < r0) goto Lb
            r11.recreate()
            return r10
        Lb:
            r0 = 26
            if (r2 == r0) goto L14
            r1 = 27
            r0 = 0
            if (r2 != r1) goto L15
        L14:
            r0 = 1
        L15:
            r9 = 0
            if (r0 == 0) goto L1d
            java.lang.reflect.Method r0 = X.C12690jt.A06
            if (r0 != 0) goto L1d
            return r9
        L1d:
            java.lang.reflect.Method r0 = X.C12690jt.A04
            if (r0 != 0) goto L26
            java.lang.reflect.Method r0 = X.C12690jt.A05
            if (r0 != 0) goto L26
            return r9
        L26:
            java.lang.reflect.Field r0 = X.C12690jt.A03     // Catch: java.lang.Throwable -> L99
            java.lang.Object r5 = r0.get(r11)     // Catch: java.lang.Throwable -> L99
            if (r5 != 0) goto L2f
            return r9
        L2f:
            java.lang.reflect.Field r0 = X.C12690jt.A02     // Catch: java.lang.Throwable -> L99
            java.lang.Object r7 = r0.get(r11)     // Catch: java.lang.Throwable -> L99
            if (r7 != 0) goto L38
            return r9
        L38:
            android.app.Application r4 = r11.getApplication()     // Catch: java.lang.Throwable -> L99
            X.0js r3 = new X.0js     // Catch: java.lang.Throwable -> L99
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L99
            r4.registerActivityLifecycleCallbacks(r3)     // Catch: java.lang.Throwable -> L99
            android.os.Handler r2 = X.C12690jt.A00     // Catch: java.lang.Throwable -> L99
            X.0jp r0 = new X.0jp     // Catch: java.lang.Throwable -> L99
            r0.<init>()     // Catch: java.lang.Throwable -> L99
            r2.post(r0)     // Catch: java.lang.Throwable -> L99
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L8f
            r0 = 26
            if (r1 == r0) goto L5c
            r0 = 27
            if (r1 == r0) goto L5c
            r11.recreate()     // Catch: java.lang.Throwable -> L8f
            goto L86
        L5c:
            java.lang.reflect.Method r8 = X.C12690jt.A06     // Catch: java.lang.Throwable -> L8f
            r0 = 9
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L8f
            r6[r9] = r5     // Catch: java.lang.Throwable -> L8f
            r5 = 0
            r6[r10] = r5     // Catch: java.lang.Throwable -> L8f
            r0 = 2
            r6[r0] = r5     // Catch: java.lang.Throwable -> L8f
            r1 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L8f
            r6[r1] = r0     // Catch: java.lang.Throwable -> L8f
            r0 = 4
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8f
            r6[r0] = r1     // Catch: java.lang.Throwable -> L8f
            r0 = 5
            r6[r0] = r5     // Catch: java.lang.Throwable -> L8f
            r0 = 6
            r6[r0] = r5     // Catch: java.lang.Throwable -> L8f
            r0 = 7
            r6[r0] = r1     // Catch: java.lang.Throwable -> L8f
            r0 = 8
            r6[r0] = r1     // Catch: java.lang.Throwable -> L8f
            r8.invoke(r7, r6)     // Catch: java.lang.Throwable -> L8f
        L86:
            X.0jq r0 = new X.0jq     // Catch: java.lang.Throwable -> L99
            r0.<init>()     // Catch: java.lang.Throwable -> L99
            r2.post(r0)     // Catch: java.lang.Throwable -> L99
            return r10
        L8f:
            r1 = move-exception
            X.0jq r0 = new X.0jq     // Catch: java.lang.Throwable -> L99
            r0.<init>()     // Catch: java.lang.Throwable -> L99
            r2.post(r0)     // Catch: java.lang.Throwable -> L99
            throw r1     // Catch: java.lang.Throwable -> L99
        L99:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12690jt.A00(android.app.Activity):boolean");
    }
}
