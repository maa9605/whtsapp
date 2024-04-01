package X;

/* renamed from: X.1PV  reason: invalid class name */
/* loaded from: classes.dex */
public class C1PV {
    public final int A00;
    public final C1QK A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C1PV(C1QK c1qk, boolean z) {
        this.A02 = null;
        this.A05 = false;
        this.A04 = z;
        this.A00 = 1;
        this.A03 = true;
        this.A01 = c1qk;
    }

    public C1PV(Object obj, boolean z, boolean z2, int i, boolean z3) {
        this.A02 = obj;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = i;
        this.A03 = z3;
        this.A01 = null;
    }

    public static C1PV A00(Object obj) {
        return new C1PV(obj, false, false, -1, true);
    }

    public static C1PV A01(Object obj) {
        return new C1PV(obj, false, false, -1, false);
    }

    public static C1PV A02(Object obj) {
        return new C1PV(obj, true, true, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r7 == 507) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C1PV A03(java.lang.Object r6, int r7) {
        /*
            r0 = 400(0x190, float:5.6E-43)
            r4 = r7
            if (r7 < r0) goto L9
            r0 = 500(0x1f4, float:7.0E-43)
            if (r7 < r0) goto L12
        L9:
            r0 = 505(0x1f9, float:7.08E-43)
            if (r7 == r0) goto L12
            r0 = 507(0x1fb, float:7.1E-43)
            r5 = 1
            if (r7 != r0) goto L13
        L12:
            r5 = 0
        L13:
            r2 = 0
            r1 = r6
            r3 = r2
            X.1PV r0 = new X.1PV
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1PV.A03(java.lang.Object, int):X.1PV");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r8 == 507) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C1PV A04(java.lang.Object r6, boolean r7, int r8) {
        /*
            r0 = 400(0x190, float:5.6E-43)
            r4 = r8
            if (r8 < r0) goto L9
            r0 = 500(0x1f4, float:7.0E-43)
            if (r8 < r0) goto L12
        L9:
            r0 = 505(0x1f9, float:7.08E-43)
            if (r8 == r0) goto L12
            r0 = 507(0x1fb, float:7.1E-43)
            r5 = 1
            if (r8 != r0) goto L13
        L12:
            r5 = 0
        L13:
            r2 = 0
            r3 = r7
            r1 = r6
            X.1PV r0 = new X.1PV
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1PV.A04(java.lang.Object, boolean, int):X.1PV");
    }
}
