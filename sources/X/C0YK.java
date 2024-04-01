package X;

import java.util.Arrays;

/* renamed from: X.0YK */
/* loaded from: classes.dex */
public class C0YK {
    public static int A0C = 1;
    public float A00;
    public EnumC12160ix A06;
    public boolean A07;
    public int A02 = -1;
    public int A01 = -1;
    public int A04 = 0;
    public boolean A08 = false;
    public float[] A0A = new float[9];
    public float[] A09 = new float[9];
    public C0YL[] A0B = new C0YL[16];
    public int A03 = 0;
    public int A05 = 0;

    public C0YK(EnumC12160ix enumC12160ix) {
        this.A06 = enumC12160ix;
    }

    public void A00() {
        this.A06 = EnumC12160ix.UNKNOWN;
        this.A04 = 0;
        this.A02 = -1;
        this.A01 = -1;
        this.A00 = 0.0f;
        this.A08 = false;
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0B[i2] = null;
        }
        this.A03 = 0;
        this.A05 = 0;
        this.A07 = false;
        Arrays.fill(this.A09, 0.0f);
    }

    public final void A01(C0YL c0yl) {
        int i = 0;
        while (true) {
            int i2 = this.A03;
            if (i < i2) {
                if (this.A0B[i] == c0yl) {
                    return;
                }
                i++;
            } else {
                C0YL[] c0ylArr = this.A0B;
                int length = c0ylArr.length;
                if (i2 >= length) {
                    c0ylArr = (C0YL[]) Arrays.copyOf(c0ylArr, length << 1);
                    this.A0B = c0ylArr;
                }
                int i3 = this.A03;
                c0ylArr[i3] = c0yl;
                this.A03 = i3 + 1;
                return;
            }
        }
    }

    public final void A02(C0YL c0yl) {
        int i = this.A03;
        int i2 = 0;
        while (i2 < i) {
            C0YL[] c0ylArr = this.A0B;
            if (c0ylArr[i2] != c0yl) {
                i2++;
            } else {
                while (true) {
                    int i3 = i - 1;
                    if (i2 < i3) {
                        int i4 = i2 + 1;
                        c0ylArr[i2] = c0ylArr[i4];
                        i2 = i4;
                    } else {
                        this.A03 = i3;
                        return;
                    }
                }
            }
        }
    }

    public final void A03(C0YL c0yl) {
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0B[i2].A01(c0yl, false);
        }
        this.A03 = 0;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("");
        A0P.append(this.A02);
        return A0P.toString();
    }
}
