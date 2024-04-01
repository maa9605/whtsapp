package X;

/* renamed from: X.0nJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14620nJ {
    public long A00 = 0;
    public C14620nJ A01;

    public int A00(int i) {
        C14620nJ c14620nJ = this.A01;
        if (c14620nJ == null) {
            if (i >= 64) {
                return Long.bitCount(this.A00);
            }
            return Long.bitCount(this.A00 & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.A00 & ((1 << i) - 1));
        } else {
            return Long.bitCount(this.A00) + c14620nJ.A00(i - 64);
        }
    }

    public void A01() {
        this.A00 = 0L;
        C14620nJ c14620nJ = this.A01;
        if (c14620nJ != null) {
            c14620nJ.A01();
        }
    }

    public final void A02() {
        if (this.A01 == null) {
            this.A01 = new C14620nJ();
        }
    }

    public void A03(int i) {
        if (i < 64) {
            this.A00 &= (1 << i) ^ (-1);
            return;
        }
        C14620nJ c14620nJ = this.A01;
        if (c14620nJ != null) {
            c14620nJ.A03(i - 64);
        }
    }

    public void A04(int i) {
        if (i < 64) {
            this.A00 |= 1 << i;
            return;
        }
        A02();
        this.A01.A04(i - 64);
    }

    public void A05(int i, boolean z) {
        if (i >= 64) {
            A02();
            this.A01.A05(i - 64, z);
            return;
        }
        long j = this.A00;
        boolean z2 = (j & Long.MIN_VALUE) != 0;
        long j2 = (1 << i) - 1;
        this.A00 = ((j & (j2 ^ (-1))) << 1) | (j & j2);
        if (z) {
            A04(i);
        } else {
            A03(i);
        }
        if (!z2 && this.A01 == null) {
            return;
        }
        A02();
        this.A01.A05(0, z2);
    }

    public boolean A06(int i) {
        if (i < 64) {
            return (this.A00 & (1 << i)) != 0;
        }
        A02();
        return this.A01.A06(i - 64);
    }

    public boolean A07(int i) {
        if (i >= 64) {
            A02();
            return this.A01.A07(i - 64);
        }
        long j = 1 << i;
        long j2 = this.A00;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (j ^ (-1));
        this.A00 = j3;
        long j4 = j - 1;
        this.A00 = (j3 & j4) | Long.rotateRight((j4 ^ (-1)) & j3, 1);
        C14620nJ c14620nJ = this.A01;
        if (c14620nJ != null) {
            if (c14620nJ.A06(0)) {
                A04(63);
            }
            this.A01.A07(0);
        }
        return z;
    }

    public String toString() {
        C14620nJ c14620nJ = this.A01;
        if (c14620nJ == null) {
            return Long.toBinaryString(this.A00);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c14620nJ.toString());
        sb.append("xx");
        sb.append(Long.toBinaryString(this.A00));
        return sb.toString();
    }
}
