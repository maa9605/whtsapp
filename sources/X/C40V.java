package X;

/* renamed from: X.40V  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40V extends C0AZ implements C0AY {
    public static final C40V A04;
    public static volatile C0RQ A05;
    public int A00;
    public int A01 = 0;
    public int A02;
    public Object A03;

    static {
        C40V c40v = new C40V();
        A04 = c40v;
        c40v.A0E();
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0A = this.A01 == 1 ? 0 + C0RS.A0A(1, (C0Aa) this.A03) : 0;
        if (this.A01 == 2) {
            A0A += C0RS.A0A(2, (C0Aa) this.A03);
        }
        if (this.A01 == 3) {
            A0A += C0RS.A0A(3, (C0Aa) this.A03);
        }
        if ((this.A00 & 8) == 8) {
            A0A += C0RS.A06(4, this.A02);
        }
        int A00 = this.unknownFields.A00() + A0A;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if (this.A01 == 1) {
            c0rs.A0O(1, (C0Aa) this.A03);
        }
        if (this.A01 == 2) {
            c0rs.A0O(2, (C0Aa) this.A03);
        }
        if (this.A01 == 3) {
            c0rs.A0O(3, (C0Aa) this.A03);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0K(4, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
        if (r10.A01 == 2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
        if (r10.A01 == 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0071, code lost:
        if (r10.A01 == 3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0074, code lost:
        r10.A03 = r12.AWA(r2, r10.A03, r13.A03);
     */
    @Override // X.C0AZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A0h(X.C0RL r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40V.A0h(X.0RL, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
