package X;

import java.util.ArrayList;

/* renamed from: X.1Sq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28581Sq extends C0YF {
    public int A01;
    public C0YJ A04;
    public float A00 = -1.0f;
    public int A02 = -1;
    public int A03 = -1;

    @Override // X.C0YF
    public boolean A0G() {
        return true;
    }

    public C28581Sq() {
        C0YJ c0yj = this.A0Y;
        this.A04 = c0yj;
        this.A01 = 0;
        ArrayList arrayList = this.A0g;
        arrayList.clear();
        arrayList.add(c0yj);
        C0YJ[] c0yjArr = this.A0n;
        int length = c0yjArr.length;
        for (int i = 0; i < length; i++) {
            c0yjArr[i] = c0yj;
        }
    }

    @Override // X.C0YF
    public C0YJ A04(EnumC12170iy enumC12170iy) {
        switch (enumC12170iy.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.A01 == 1) {
                    return this.A04;
                }
                break;
            case 2:
            case 4:
                if (this.A01 == 0) {
                    return this.A04;
                }
                break;
        }
        throw new AssertionError(enumC12170iy.name());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0.A0o[0] != r2) goto L36;
     */
    @Override // X.C0YF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0B(X.C0YG r10) {
        /*
            r9 = this;
            X.0YH r2 = X.C0YH.WRAP_CONTENT
            X.0YF r3 = r9.A0Z
            if (r3 != 0) goto L7
            return
        L7:
            X.0iy r0 = X.EnumC12170iy.LEFT
            X.0YJ r7 = r3.A04(r0)
            X.0iy r0 = X.EnumC12170iy.RIGHT
            X.0YJ r6 = r3.A04(r0)
            X.0YF r0 = r9.A0Z
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L20
            X.0YH[] r0 = r0.A0o
            r0 = r0[r4]
            r8 = 1
            if (r0 == r2) goto L21
        L20:
            r8 = 0
        L21:
            int r0 = r9.A01
            if (r0 != 0) goto L3c
            X.0iy r0 = X.EnumC12170iy.TOP
            X.0YJ r7 = r3.A04(r0)
            X.0iy r0 = X.EnumC12170iy.BOTTOM
            X.0YJ r6 = r3.A04(r0)
            X.0YF r0 = r9.A0Z
            if (r0 == 0) goto La4
            X.0YH[] r0 = r0.A0o
            r0 = r0[r1]
            if (r0 != r2) goto La4
        L3b:
            r8 = r1
        L3c:
            int r0 = r9.A02
            r5 = 8
            r1 = -1
            r3 = 5
            if (r0 == r1) goto L5d
            X.0YJ r0 = r9.A04
            X.0YK r2 = r10.A05(r0)
            X.0YK r1 = r10.A05(r7)
            int r0 = r9.A02
            r10.A0F(r2, r1, r0, r5)
            if (r8 == 0) goto L5c
            X.0YK r0 = r10.A05(r6)
            r10.A0G(r0, r2, r4, r3)
        L5c:
            return
        L5d:
            int r0 = r9.A03
            if (r0 == r1) goto L7e
            X.0YJ r0 = r9.A04
            X.0YK r2 = r10.A05(r0)
            X.0YK r1 = r10.A05(r6)
            int r0 = r9.A03
            int r0 = -r0
            r10.A0F(r2, r1, r0, r5)
            if (r8 == 0) goto L5c
            X.0YK r0 = r10.A05(r7)
            r10.A0G(r2, r0, r4, r3)
            r10.A0G(r1, r2, r4, r3)
            return
        L7e:
            float r0 = r9.A00
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L5c
            X.0YJ r0 = r9.A04
            X.0YK r4 = r10.A05(r0)
            X.0YK r3 = r10.A05(r6)
            float r2 = r9.A00
            X.0YL r1 = r10.A01()
            X.0YN r0 = r1.A01
            r0.AQx(r4, r5)
            X.0YN r0 = r1.A01
            r0.AQx(r3, r2)
            r10.A09(r1)
            return
        La4:
            r1 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28581Sq.A0B(X.0YG):void");
    }

    @Override // X.C0YF
    public void A0D(C0YG c0yg) {
        C0YF c0yf = this.A0Z;
        if (c0yf == null) {
            return;
        }
        int A00 = C0YG.A00(this.A04);
        if (this.A01 == 1) {
            this.A0P = A00;
            this.A0Q = 0;
            A08(c0yf.A00());
            A09(0);
            return;
        }
        this.A0P = 0;
        this.A0Q = A00;
        A09(c0yf.A01());
        A08(0);
    }

    public void A0J(int i) {
        C0YJ c0yj;
        if (this.A01 == i) {
            return;
        }
        this.A01 = i;
        ArrayList arrayList = this.A0g;
        arrayList.clear();
        if (i == 1) {
            c0yj = this.A0W;
            this.A04 = c0yj;
        } else {
            c0yj = this.A0Y;
            this.A04 = c0yj;
        }
        arrayList.add(c0yj);
        C0YJ[] c0yjArr = this.A0n;
        int length = c0yjArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0yjArr[i2] = c0yj;
        }
    }
}
