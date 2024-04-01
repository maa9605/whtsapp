package X;

/* renamed from: X.0Te  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Te {
    public static final long A00;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r3 > 0) goto L6;
     */
    static {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            r8 = 100
            if (r1 < r0) goto L18
            int r0 = android.system.OsConstants._SC_CLK_TCK
            long r3 = android.system.Os.sysconf(r0)
        Le:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L15
        L14:
            r8 = r3
        L15:
            X.C0Te.A00 = r8
            return
        L18:
            java.lang.String r1 = "_SC_CLK_TCK"
            java.lang.String r0 = "libcore.io.OsConstants"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            r2 = 0
            int r7 = r0.getInt(r2)     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            java.lang.String r0 = "libcore.io.Libcore"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            java.lang.String r0 = "libcore.io.Os"
            java.lang.Class r6 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            java.lang.String r0 = "os"
            java.lang.reflect.Field r0 = r1.getField(r0)     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            java.lang.Object r5 = r0.get(r2)     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            java.lang.String r2 = "sysconf"
            r4 = 1
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            r3 = 0
            r1[r3] = r0     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            java.lang.reflect.Method r2 = r6.getMethod(r2, r1)     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            r1[r3] = r0     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            java.lang.Object r0 = r2.invoke(r5, r1)     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            long r3 = r0.longValue()     // Catch: java.lang.ClassNotFoundException -> L60 java.lang.IllegalAccessException -> L65 java.lang.NoSuchFieldException -> L6a java.lang.NoSuchMethodException -> L6f java.lang.reflect.InvocationTargetException -> L74
            goto Le
        L60:
            r0 = move-exception
            X.C07K.A1M(r0)
            goto L78
        L65:
            r0 = move-exception
            X.C07K.A1M(r0)
            goto L78
        L6a:
            r0 = move-exception
            X.C07K.A1M(r0)
            goto L78
        L6f:
            r0 = move-exception
            X.C07K.A1M(r0)
            goto L78
        L74:
            r0 = move-exception
            X.C07K.A1M(r0)
        L78:
            r3 = 100
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Te.<clinit>():void");
    }
}
