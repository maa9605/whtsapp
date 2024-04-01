package X;

import sun.misc.Unsafe;

/* renamed from: X.0ei  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09760ei {
    public static final long A00;
    public static final Unsafe A01;
    public static final boolean A02;
    public static final boolean A03;

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            X.0ej r0 = new X.0ej     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.Throwable -> Le
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            X.C09760ei.A01 = r0
            r7 = 3
            java.lang.String r6 = "copyMemory"
            java.lang.String r9 = "putByte"
            r5 = 2
            java.lang.String r10 = "getByte"
            java.lang.String r8 = "getLong"
            r3 = 1
            r11 = 0
            if (r0 == 0) goto L5f
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = "objectFieldOffset"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L5f
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r11] = r0     // Catch: java.lang.Throwable -> L5f
            r4.getMethod(r2, r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L5f
            r0[r11] = r2     // Catch: java.lang.Throwable -> L5f
            r4.getMethod(r10, r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L5f
            r0[r11] = r12     // Catch: java.lang.Throwable -> L5f
            r0[r3] = r2     // Catch: java.lang.Throwable -> L5f
            r4.getMethod(r8, r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L5f
            r1[r11] = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L5f
            r1[r3] = r0     // Catch: java.lang.Throwable -> L5f
            r4.getMethod(r9, r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L5f
            r0[r11] = r2     // Catch: java.lang.Throwable -> L5f
            r4.getMethod(r8, r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L5f
            r0[r11] = r2     // Catch: java.lang.Throwable -> L5f
            r0[r3] = r2     // Catch: java.lang.Throwable -> L5f
            r0[r5] = r2     // Catch: java.lang.Throwable -> L5f
            r4.getMethod(r6, r0)     // Catch: java.lang.Throwable -> L5f
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            X.C09760ei.A03 = r0
            sun.misc.Unsafe r0 = X.C09760ei.A01
            if (r0 == 0) goto La8
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "arrayBaseOffset"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> La8
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            r1[r11] = r0     // Catch: java.lang.Throwable -> La8
            r4.getMethod(r2, r1)     // Catch: java.lang.Throwable -> La8
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> La8
            r0[r11] = r12     // Catch: java.lang.Throwable -> La8
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> La8
            r0[r3] = r2     // Catch: java.lang.Throwable -> La8
            r4.getMethod(r10, r0)     // Catch: java.lang.Throwable -> La8
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> La8
            r1[r11] = r12     // Catch: java.lang.Throwable -> La8
            r1[r3] = r2     // Catch: java.lang.Throwable -> La8
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> La8
            r1[r5] = r0     // Catch: java.lang.Throwable -> La8
            r4.getMethod(r9, r1)     // Catch: java.lang.Throwable -> La8
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> La8
            r0[r11] = r12     // Catch: java.lang.Throwable -> La8
            r0[r3] = r2     // Catch: java.lang.Throwable -> La8
            r4.getMethod(r8, r0)     // Catch: java.lang.Throwable -> La8
            r0 = 5
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> La8
            r1[r11] = r12     // Catch: java.lang.Throwable -> La8
            r1[r3] = r2     // Catch: java.lang.Throwable -> La8
            r1[r5] = r12     // Catch: java.lang.Throwable -> La8
            r1[r7] = r2     // Catch: java.lang.Throwable -> La8
            r0 = 4
            r1[r0] = r2     // Catch: java.lang.Throwable -> La8
            r4.getMethod(r6, r1)     // Catch: java.lang.Throwable -> La8
            r11 = 1
        La8:
            X.C09760ei.A02 = r11
            if (r11 == 0) goto Lbc
            sun.misc.Unsafe r1 = X.C09760ei.A01
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = r1.arrayBaseOffset(r0)
        Lb4:
            long r0 = (long) r0
            X.C09760ei.A00 = r0
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "address"
            goto Lbe
        Lbc:
            r0 = -1
            goto Lb4
        Lbe:
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> Lcc
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> Lcc
            sun.misc.Unsafe r0 = X.C09760ei.A01
            if (r0 == 0) goto Lcc
            r0.objectFieldOffset(r1)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09760ei.<clinit>():void");
    }

    public static void A00(byte[] bArr, long j, byte b) {
        A01.putByte(bArr, j, b);
    }
}
