package X;

/* renamed from: X.0p2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15610p2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r1.contains("DOUB") != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C15610p2(java.lang.String r4, java.lang.String r5, boolean r6, int r7, java.lang.String r8, int r9) {
        /*
            r3 = this;
            r3.<init>()
            r3.A04 = r4
            r3.A05 = r5
            r3.A06 = r6
            r3.A02 = r7
            r2 = 5
            if (r5 == 0) goto L1d
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r5.toUpperCase(r0)
            java.lang.String r0 = "INT"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L24
            r2 = 3
        L1d:
            r3.A00 = r2
            r3.A03 = r8
            r3.A01 = r9
            return
        L24:
            java.lang.String r0 = "CHAR"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "CLOB"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "TEXT"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "BLOB"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L1d
            java.lang.String r0 = "REAL"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "FLOA"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "DOUB"
            boolean r0 = r1.contains(r0)
            r2 = 1
            if (r0 == 0) goto L1d
        L5d:
            r2 = 4
            goto L1d
        L5f:
            r2 = 2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15610p2.<init>(java.lang.String, java.lang.String, boolean, int, java.lang.String, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0068, code lost:
        if (r4 != 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r2 = 1
            if (r6 != r7) goto L4
            return r2
        L4:
            r5 = 0
            if (r7 == 0) goto L88
            java.lang.Class<X.0p2> r1 = X.C15610p2.class
            java.lang.Class r0 = r7.getClass()
            if (r1 != r0) goto L88
            X.0p2 r7 = (X.C15610p2) r7
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 20
            if (r1 < r0) goto L1e
            int r1 = r6.A02
            int r0 = r7.A02
            if (r1 == r0) goto L2d
            return r5
        L1e:
            int r0 = r6.A02
            r3 = 0
            if (r0 <= 0) goto L24
            r3 = 1
        L24:
            int r1 = r7.A02
            r0 = 0
            if (r1 <= 0) goto L2a
            r0 = 1
        L2a:
            if (r3 == r0) goto L2d
            return r5
        L2d:
            java.lang.String r1 = r6.A04
            java.lang.String r0 = r7.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L38
            return r5
        L38:
            boolean r1 = r6.A06
            boolean r0 = r7.A06
            if (r1 == r0) goto L3f
            return r5
        L3f:
            int r4 = r6.A01
            r3 = 2
            if (r4 != r2) goto L55
            int r0 = r7.A01
            if (r0 != r3) goto L55
            java.lang.String r1 = r6.A03
            if (r1 == 0) goto L55
            java.lang.String r0 = r7.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L55
            return r5
        L55:
            if (r4 != r3) goto L68
            int r0 = r7.A01
            if (r0 != r2) goto L6a
            java.lang.String r1 = r7.A03
            if (r1 == 0) goto L6a
            java.lang.String r0 = r6.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6a
            return r5
        L68:
            if (r4 == 0) goto L80
        L6a:
            int r0 = r7.A01
            if (r4 != r0) goto L80
            java.lang.String r1 = r6.A03
            if (r1 == 0) goto L7b
            java.lang.String r0 = r7.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            return r5
        L7b:
            java.lang.String r0 = r7.A03
            if (r0 == 0) goto L80
            return r5
        L80:
            int r1 = r6.A00
            int r0 = r7.A00
            if (r1 == r0) goto L87
            r2 = 0
        L87:
            return r2
        L88:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15610p2.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((((this.A04.hashCode() * 31) + this.A00) * 31) + (this.A06 ? 1231 : 1237)) * 31) + this.A02;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Column{name='");
        C000200d.A1P(A0P, this.A04, '\'', ", type='");
        C000200d.A1P(A0P, this.A05, '\'', ", affinity='");
        A0P.append(this.A00);
        A0P.append('\'');
        A0P.append(", notNull=");
        A0P.append(this.A06);
        A0P.append(", primaryKeyPosition=");
        A0P.append(this.A02);
        A0P.append(", defaultValue='");
        A0P.append(this.A03);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }
}
