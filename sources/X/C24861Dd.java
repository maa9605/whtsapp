package X;

/* renamed from: X.1Dd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24861Dd {
    public final C1DF A00;

    public C24861Dd(C1DF c1df) {
        this.A00 = c1df;
    }

    public final float A00(int i, int i2, int i3, int i4) {
        double sqrt;
        int i5 = i;
        int i6 = i3;
        int i7 = 1;
        boolean z = false;
        int i8 = i2;
        int i9 = i4;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
            i8 = i5;
            i5 = i2;
            i9 = i6;
            i6 = i4;
        }
        int abs = Math.abs(i6 - i5);
        int i10 = i9 - i8;
        int abs2 = Math.abs(i10);
        int i11 = (-abs) / 2;
        int i12 = i5 < i6 ? 1 : -1;
        int i13 = i8 < i9 ? 1 : -1;
        int i14 = i6 + i12;
        int i15 = i5;
        int i16 = i8;
        int i17 = 0;
        while (i15 != i14) {
            int i18 = i15;
            if (z) {
                i18 = i16;
            }
            int i19 = i16;
            if (z) {
                i19 = i15;
            }
            if ((i17 == i7) == this.A00.A03(i18, i19)) {
                if (i17 == 2) {
                    int i20 = i15 - i5;
                    int i21 = i16 - i8;
                    sqrt = Math.sqrt((i21 * i21) + (i20 * i20));
                    break;
                }
                i17++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i16 == i9) {
                    break;
                }
                i16 += i13;
                i11 -= abs;
            }
            i15 += i12;
            i7 = 1;
        }
        if (i17 == 2) {
            int i22 = i14 - i5;
            sqrt = Math.sqrt((i10 * i10) + (i22 * i22));
            return (float) sqrt;
        }
        return Float.NaN;
    }

    public final float A01(int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float A00 = A00(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = i / (i - i6);
            i6 = 0;
        } else {
            int i8 = this.A00.A02;
            if (i6 >= i8) {
                f = (i5 - i) / (i6 - i);
                i6 = i8 - 1;
            } else {
                f = 1.0f;
            }
        }
        float f3 = i2;
        int i9 = (int) (f3 - ((i4 - i2) * f));
        if (i9 < 0) {
            f2 = f3 / (i2 - i9);
        } else {
            int i10 = this.A00.A00;
            if (i9 >= i10) {
                i7 = i10 - 1;
                f2 = (i7 - i2) / (i9 - i2);
            } else {
                i7 = i9;
                f2 = 1.0f;
            }
        }
        return (A00(i, i2, (int) (((i6 - i) * f2) + i), i7) + A00) - 1.0f;
    }

    public final float A02(C1DB c1db, C1DB c1db2) {
        int i = (int) c1db.A00;
        int i2 = (int) c1db.A01;
        int i3 = (int) c1db2.A00;
        int i4 = (int) c1db2.A01;
        float A01 = A01(i, i2, i3, i4);
        float A012 = A01(i3, i4, i, i2);
        return Float.isNaN(A01) ? A012 / 7.0f : Float.isNaN(A012) ? A01 / 7.0f : (A01 + A012) / 14.0f;
    }
}
