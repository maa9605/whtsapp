package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Dc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24851Dc {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C1DF A05;
    public final List A06 = new ArrayList(5);
    public final int[] A07 = new int[3];

    public C24851Dc(C1DF c1df, int i, int i2, int i3, int i4, float f) {
        this.A05 = c1df;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A00 = f;
    }

    public final C33281fe A00(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = i5 + i6 + iArr[2];
        float f = (i2 - i3) - (i6 / 2.0f);
        int i8 = (int) f;
        int i9 = i6 << 1;
        C1DF c1df = this.A05;
        int i10 = c1df.A00;
        int[] iArr2 = this.A07;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i11 = i;
        while (i11 >= 0 && c1df.A03(i8, i11)) {
            int i12 = iArr2[1];
            if (i12 > i9) {
                break;
            }
            iArr2[1] = i12 + 1;
            i11--;
        }
        float f2 = Float.NaN;
        if (i11 >= 0 && iArr2[1] <= i9) {
            while (!c1df.A03(i8, i11) && (i4 = iArr2[0]) <= i9) {
                iArr2[0] = i4 + 1;
                i11--;
                if (i11 < 0) {
                    break;
                }
            }
            if (iArr2[0] <= i9) {
                int i13 = i + 1;
                while (i13 < i10 && c1df.A03(i8, i13)) {
                    int i14 = iArr2[1];
                    if (i14 > i9) {
                        break;
                    }
                    iArr2[1] = i14 + 1;
                    i13++;
                }
                if (i13 != i10 && iArr2[1] <= i9) {
                    while (i13 < i10 && !c1df.A03(i8, i13)) {
                        int i15 = iArr2[2];
                        if (i15 > i9) {
                            break;
                        }
                        iArr2[2] = i15 + 1;
                        i13++;
                    }
                    int i16 = iArr2[2];
                    if (i16 <= i9) {
                        int i17 = iArr2[0];
                        int i18 = iArr2[1];
                        if (Math.abs(((i17 + i18) + i16) - i7) * 5 < (i7 << 1) && A01(iArr2)) {
                            f2 = (i13 - i16) - (i18 / 2.0f);
                        }
                    }
                }
            }
        }
        if (!Float.isNaN(f2)) {
            float f3 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
            List<C33281fe> list = this.A06;
            for (C33281fe c33281fe : list) {
                float f4 = c33281fe.A01;
                if (Math.abs(f2 - f4) <= f3) {
                    float f5 = ((C1DB) c33281fe).A00;
                    if (Math.abs(f - f5) <= f3) {
                        float f6 = c33281fe.A00;
                        float abs = Math.abs(f3 - f6);
                        if (abs <= 1.0f || abs <= f6) {
                            return new C33281fe((f5 + f) / 2.0f, (f4 + f2) / 2.0f, (f6 + f3) / 2.0f);
                        }
                    } else {
                        continue;
                    }
                }
            }
            list.add(new C33281fe(f, f2, f3));
            return null;
        }
        return null;
    }

    public final boolean A01(int[] iArr) {
        float f = this.A00;
        float f2 = f / 2.0f;
        int i = 0;
        while (Math.abs(f - iArr[i]) < f2) {
            i++;
            if (i >= 3) {
                return true;
            }
        }
        return false;
    }
}
