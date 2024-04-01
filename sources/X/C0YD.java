package X;

import java.util.Arrays;

/* renamed from: X.0YD */
/* loaded from: classes.dex */
public class C0YD extends C0YE {
    public int A02;
    public int A03;
    public C12220j3 A07 = new C12220j3(this);
    public C12240j5 A08 = new C12240j5(this);
    public InterfaceC12210j2 A06 = null;
    public boolean A0A = false;
    public C0YG A05 = new C0YG();
    public int A00 = 0;
    public int A04 = 0;
    public C0YI[] A0D = new C0YI[4];
    public C0YI[] A0C = new C0YI[4];
    public int A01 = 263;
    public boolean A0B = false;
    public boolean A09 = false;

    @Override // X.C0YE, X.C0YF
    public void A07() {
        this.A05.A06();
        this.A02 = 0;
        this.A03 = 0;
        super.A07();
    }

    @Override // X.C0YF
    public void A0F(boolean z, boolean z2) {
        super.A0F(z, z2);
        int size = ((C0YE) this).A00.size();
        for (int i = 0; i < size; i++) {
            ((C0YF) ((C0YE) this).A00.get(i)).A0F(z, z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x002d, code lost:
        if ((r5 & 128) == 128) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0048, code lost:
        if (r6 == r9) goto L205;
     */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02b1 A[LOOP:7: B:335:0x02af->B:336:0x02b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x036c  */
    @Override // X.C0YE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0J() {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YD.A0J():void");
    }

    public void A0K(C0YF c0yf, int i) {
        if (i == 0) {
            int i2 = this.A00 + 1;
            C0YI[] c0yiArr = this.A0C;
            int length = c0yiArr.length;
            if (i2 >= length) {
                c0yiArr = (C0YI[]) Arrays.copyOf(c0yiArr, length << 1);
                this.A0C = c0yiArr;
            }
            int i3 = this.A00;
            c0yiArr[i3] = new C0YI(c0yf, 0, this.A0A);
            this.A00 = i3 + 1;
        } else if (i != 1) {
        } else {
            int i4 = this.A04 + 1;
            C0YI[] c0yiArr2 = this.A0D;
            int length2 = c0yiArr2.length;
            if (i4 >= length2) {
                c0yiArr2 = (C0YI[]) Arrays.copyOf(c0yiArr2, length2 << 1);
                this.A0D = c0yiArr2;
            }
            int i5 = this.A04;
            c0yiArr2[i5] = new C0YI(c0yf, 1, this.A0A);
            this.A04 = i5 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x00ad, code lost:
        if (r15 == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0L(boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YD.A0L(boolean, int):boolean");
    }
}
