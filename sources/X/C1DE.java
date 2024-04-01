package X;

import java.util.Arrays;

/* renamed from: X.1DE  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DE implements Cloneable {
    public int A00;
    public int[] A01;

    public C1DE() {
        this.A00 = 0;
        this.A01 = new int[1];
    }

    public C1DE(int[] iArr, int i) {
        this.A01 = iArr;
        this.A00 = i;
    }

    public final void A00(int i) {
        int[] iArr = this.A01;
        int length = iArr.length;
        if (i > (length << 5)) {
            int[] iArr2 = new int[(i + 31) >> 5];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A01 = iArr2;
        }
    }

    public void A01(int i, int i2) {
        if (i2 >= 0 && i2 <= 32) {
            A00(this.A00 + i2);
            while (i2 > 0) {
                boolean z = true;
                if (((i >> (i2 - 1)) & 1) != 1) {
                    z = false;
                }
                A02(z);
                i2--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public void A02(boolean z) {
        A00(this.A00 + 1);
        if (z) {
            int[] iArr = this.A01;
            int i = this.A00;
            int i2 = i >> 5;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.A00++;
    }

    public boolean A03(int i) {
        return ((1 << (i & 31)) & this.A01[i >> 5]) != 0;
    }

    public Object clone() {
        return new C1DE((int[]) this.A01.clone(), this.A00);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1DE) {
            C1DE c1de = (C1DE) obj;
            return this.A00 == c1de.A00 && Arrays.equals(this.A01, c1de.A01);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01) + (this.A00 * 31);
    }

    public String toString() {
        int i = this.A00;
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            char c = '.';
            if (A03(i2)) {
                c = 'X';
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
