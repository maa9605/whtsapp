package X;

/* renamed from: X.1DQ  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DQ {
    public C1DW A00;
    public C24841Db A01;
    public boolean A02;
    public final C1DF A03;

    public C1DQ(C1DF c1df) {
        int i = c1df.A00;
        if (i >= 21 && (i & 3) == 1) {
            this.A03 = c1df;
            return;
        }
        throw C33141fQ.A00;
    }

    public final int A00(int i, int i2, int i3) {
        return this.A02 ? this.A03.A03(i2, i) : this.A03.A03(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public C1DW A01() {
        C1DW c1dw = this.A00;
        if (c1dw != null) {
            return c1dw;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = A00(i3, 8, i2);
        }
        int A00 = A00(8, 7, A00(8, 8, A00(7, 8, i2)));
        int i4 = 5;
        do {
            A00 = A00(8, i4, A00);
            i4--;
        } while (i4 >= 0);
        int i5 = this.A03.A00;
        int i6 = i5 - 7;
        for (int i7 = i5 - 1; i7 >= i6; i7--) {
            i = A00(8, i7, i);
        }
        for (int i8 = i5 - 8; i8 < i5; i8++) {
            i = A00(i8, 8, i);
        }
        C1DW A01 = C1DW.A01(A00, i);
        if (A01 == null) {
            A01 = C1DW.A01(A00 ^ 21522, i ^ 21522);
        }
        this.A00 = A01;
        if (A01 != null) {
            return A01;
        }
        throw C33141fQ.A00;
    }

    public C24841Db A02() {
        int i;
        C24841Db c24841Db = this.A01;
        if (c24841Db != null) {
            return c24841Db;
        }
        int i2 = this.A03.A00;
        int i3 = (i2 - 17) >> 2;
        if (i3 <= 6) {
            return C24841Db.A01(i3);
        }
        int i4 = i2 - 11;
        int i5 = 5;
        int i6 = 0;
        int i7 = 5;
        int i8 = 0;
        do {
            i = i2 - 9;
            while (i >= i4) {
                i8 = A00(i, i7, i8);
                i--;
            }
            i7--;
        } while (i7 >= 0);
        C24841Db A00 = C24841Db.A00(i8);
        if (A00 != null && (A00.A01 << 2) + 17 == i2) {
            this.A01 = A00;
            return A00;
        }
        do {
            for (int i9 = i; i9 >= i4; i9--) {
                i6 = A00(i5, i9, i6);
            }
            i5--;
        } while (i5 >= 0);
        C24841Db A002 = C24841Db.A00(i6);
        if (A002 != null && (A002.A01 << 2) + 17 == i2) {
            this.A01 = A002;
            return A002;
        }
        throw C33141fQ.A00;
    }
}
