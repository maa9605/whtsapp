package X;

import java.util.ArrayList;

/* renamed from: X.1Wq */
/* loaded from: classes.dex */
public abstract class AbstractC29401Wq extends C0SK {
    public static final ArrayList A0E;
    public static final String[] A0F;
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public C18580ty A0A;
    public final C18630u3 A0B;
    public final C18650u5 A0C;
    public final int[] A0D;

    public int A0C() {
        return -1;
    }

    public abstract C18760uH A0D(int i, int i2, int i3);

    static {
        String[] strArr = new String[20];
        A0F = strArr;
        int i = 0;
        do {
            strArr[i] = String.valueOf(i);
            i++;
        } while (i <= 19);
        A0E = new ArrayList(5);
    }

    public AbstractC29401Wq(C0T4 c0t4, C18650u5 c18650u5) {
        super(c0t4);
        this.A0A = new C18580ty();
        this.A00 = 1.2d;
        this.A0B = new C18630u3();
        this.A02 = -1;
        this.A0D = new int[2];
        this.A0C = c18650u5;
    }

    @Override // X.C0SK
    public void A0A() {
        A0G();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0182  */
    @Override // X.C0SK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0B(android.graphics.Canvas r36) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC29401Wq.A0B(android.graphics.Canvas):void");
    }

    public void A0E() {
        C18650u5 c18650u5 = this.A0C;
        C18760uH c18760uH = c18650u5.A04;
        while (c18760uH != null) {
            C18760uH c18760uH2 = c18760uH.A09;
            c18760uH.A03();
            c18760uH = c18760uH2;
        }
        C18760uH A00 = C18760uH.A00(-1, -1);
        c18650u5.A06 = A00;
        A00.A02 = 0;
        A00.A03 = 0;
        A00.A04 = 0;
        c18650u5.A04 = A00;
        c18650u5.A05 = A00;
        c18650u5.A00 = 0;
    }

    public void A0F() {
        A0E();
        this.A02 = -1;
        this.A0C.A03 = -1;
    }

    public void A0G() {
        int i = this.A02;
        if (i == -1 || !super.A04) {
            return;
        }
        C18650u5 c18650u5 = this.A0C;
        c18650u5.A03 = i;
        int i2 = 1 << i;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                c18650u5.A02(i3, i4, this.A02, this.A0A);
                C18580ty c18580ty = this.A0A;
                if (c18580ty.A06 == null && c18580ty.A03 != 1) {
                    A0H(i3, i4, this.A02, 2);
                }
            }
        }
    }

    public void A0H(int i, int i2, int i3, int i4) {
        int i5 = super.A08;
        C18760uH A00 = C18760uH.A00(i5, i5);
        A00.A02 = i;
        A00.A03 = i2;
        A00.A04 = i3;
        A00.A0C = 1;
        this.A0C.A03(A00);
        C18620u2.A02(new C29391Wp(this, i, i2, i3, i4, A00), A0F[i3]);
    }

    public void A0I(boolean z) {
        if (z) {
            C18650u5 c18650u5 = this.A0C;
            if (c18650u5.A03 == -1) {
                c18650u5.A03 = A0C();
                A0G();
                return;
            }
            return;
        }
        C18650u5 c18650u52 = this.A0C;
        if (c18650u52.A03 == -1) {
            return;
        }
        c18650u52.A03 = -1;
    }

    public void A0J(int[] iArr) {
        int i = this.A01;
        int i2 = ((int) (i * this.A00)) + 1;
        iArr[0] = i2;
        iArr[1] = Math.max((i2 - i) - 1, 1);
    }
}
