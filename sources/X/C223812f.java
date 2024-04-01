package X;

import java.nio.charset.Charset;

/* renamed from: X.12f */
/* loaded from: classes.dex */
public final class C223812f {
    public int A00;
    public int A01;
    public byte[] A02;

    public C223812f() {
        this.A02 = C08M.A05;
    }

    public C223812f(int i) {
        this.A02 = new byte[i];
        this.A00 = i;
    }

    public C223812f(byte[] bArr) {
        this.A02 = bArr;
        this.A00 = bArr.length;
    }

    public C223812f(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A00 = i;
    }

    public int A00() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        this.A01 = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    public int A01() {
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return bArr[i] & 255;
    }

    public int A02() {
        int A00 = A00();
        if (A00 >= 0) {
            return A00;
        }
        throw new IllegalStateException(C000200d.A0D("Top bit not zero: ", A00));
    }

    public int A03() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.A01 = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public long A04() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        int i5 = i4 + 1;
        this.A01 = i5;
        int i6 = i5 + 1;
        this.A01 = i6;
        int i7 = i6 + 1;
        this.A01 = i7;
        int i8 = i7 + 1;
        this.A01 = i8;
        this.A01 = i8 + 1;
        return (bArr[i8] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8);
    }

    public long A05() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        this.A01 = i4 + 1;
        return (bArr[i4] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    public long A06() {
        long A04 = A04();
        if (A04 >= 0) {
            return A04;
        }
        StringBuilder sb = new StringBuilder("Top bit not zero: ");
        sb.append(A04);
        throw new IllegalStateException(sb.toString());
    }

    public String A07() {
        int i = this.A00;
        int i2 = this.A01;
        if (i - i2 == 0) {
            return null;
        }
        int i3 = i2;
        while (i3 < i) {
            byte b = this.A02[i3];
            if (b == 10 || b == 13) {
                break;
            }
            i3++;
        }
        if (i3 - i2 >= 3) {
            byte[] bArr = this.A02;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                i2 += 3;
                this.A01 = i2;
            }
        }
        String str = new String(this.A02, i2, i3 - i2, Charset.forName("UTF-8"));
        this.A01 = i3;
        int i4 = this.A00;
        if (i3 == i4) {
            return str;
        }
        byte[] bArr2 = this.A02;
        if (bArr2[i3] == 13) {
            i3++;
            this.A01 = i3;
            if (i3 == i4) {
                return str;
            }
        }
        if (bArr2[i3] == 10) {
            this.A01 = i3 + 1;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0015, code lost:
        if (r5.A02[r1] != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A08(int r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            int r4 = r5.A01
            int r0 = r4 + r6
            int r1 = r0 + (-1)
            int r0 = r5.A00
            if (r1 >= r0) goto L17
            byte[] r0 = r5.A02
            r0 = r0[r1]
            int r3 = r6 + (-1)
            if (r0 == 0) goto L18
        L17:
            r3 = r6
        L18:
            byte[] r2 = r5.A02
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r4, r3, r0)
            int r0 = r5.A01
            int r0 = r0 + r6
            r5.A01 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223812f.A08(int):java.lang.String");
    }

    public String A09(int i, Charset charset) {
        String str = new String(this.A02, this.A01, i, charset);
        this.A01 += i;
        return str;
    }

    public void A0A(int i) {
        byte[] bArr = this.A02;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        this.A02 = bArr;
        this.A00 = i;
        this.A01 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0005, code lost:
        if (r3 > r2.A00) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0B(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L7
            int r1 = r2.A00
            r0 = 1
            if (r3 <= r1) goto L8
        L7:
            r0 = 0
        L8:
            X.C002701i.A1J(r0)
            r2.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223812f.A0B(int):void");
    }

    public void A0C(int i) {
        A0B(this.A01 + i);
    }
}
