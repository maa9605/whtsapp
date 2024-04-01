package X;

/* renamed from: X.1tE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41011tE extends C0DL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int[] A06;

    @Override // X.C0DO
    public String A8K() {
        return "SHA-1";
    }

    @Override // X.C0DO
    public int A9n() {
        return 20;
    }

    public C41011tE() {
        this.A06 = new int[80];
        reset();
    }

    public C41011tE(C41011tE c41011tE) {
        super(c41011tE);
        this.A06 = new int[80];
        A05(c41011tE);
    }

    @Override // X.C0DL
    public void A02() {
        int[] iArr;
        int i = 16;
        do {
            iArr = this.A06;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
            i++;
        } while (i < 80);
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = this.A02;
        int i6 = this.A03;
        int i7 = this.A04;
        int i8 = 0;
        int i9 = 0;
        do {
            int i10 = (((i4 ^ (-1)) & i6) | (i5 & i4)) + ((i3 << 5) | (i3 >>> 27));
            int i11 = i9 + 1;
            int i12 = i10 + iArr[i9] + 1518500249 + i7;
            int i13 = (i4 >>> 2) | (i4 << 30);
            int i14 = (((i3 ^ (-1)) & i5) | (i13 & i3)) + ((i12 << 5) | (i12 >>> 27));
            int i15 = i11 + 1;
            int i16 = i14 + iArr[i11] + 1518500249 + i6;
            int i17 = (i3 >>> 2) | (i3 << 30);
            int i18 = i15 + 1;
            int i19 = (((i12 ^ (-1)) & i13) | (i17 & i12)) + ((i16 << 5) | (i16 >>> 27)) + iArr[i15] + 1518500249 + i5;
            i7 = (i12 >>> 2) | (i12 << 30);
            int i20 = i18 + 1;
            i4 = (((i16 ^ (-1)) & i17) | (i7 & i16)) + ((i19 << 5) | (i19 >>> 27)) + iArr[i18] + 1518500249 + i13;
            i6 = (i16 >>> 2) | (i16 << 30);
            i9 = i20 + 1;
            i3 = (((i19 ^ (-1)) & i7) | (i6 & i19)) + ((i4 << 5) | (i4 >>> 27)) + iArr[i20] + 1518500249 + i17;
            i5 = (i19 >>> 2) | (i19 << 30);
            i8++;
        } while (i8 < 4);
        int i21 = 0;
        do {
            int i22 = i9 + 1;
            int i23 = ((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6) + iArr[i9] + 1859775393 + i7;
            int i24 = (i4 >>> 2) | (i4 << 30);
            int i25 = i22 + 1;
            int i26 = ((i23 << 5) | (i23 >>> 27)) + ((i3 ^ i24) ^ i5) + iArr[i22] + 1859775393 + i6;
            int i27 = (i3 >>> 2) | (i3 << 30);
            int i28 = i25 + 1;
            int i29 = ((i26 << 5) | (i26 >>> 27)) + ((i23 ^ i27) ^ i24) + iArr[i25] + 1859775393 + i5;
            i7 = (i23 >>> 2) | (i23 << 30);
            int i30 = i28 + 1;
            i4 = ((i29 << 5) | (i29 >>> 27)) + ((i26 ^ i7) ^ i27) + iArr[i28] + 1859775393 + i24;
            i6 = (i26 >>> 2) | (i26 << 30);
            i9 = i30 + 1;
            i3 = ((i4 << 5) | (i4 >>> 27)) + ((i29 ^ i6) ^ i7) + iArr[i30] + 1859775393 + i27;
            i5 = (i29 >>> 2) | (i29 << 30);
            i21++;
        } while (i21 < 4);
        int i31 = 0;
        do {
            int i32 = i9 + 1;
            int i33 = ((((((i4 & i6) | (i4 & i5)) | (i5 & i6)) + ((i3 << 5) | (i3 >>> 27))) + iArr[i9]) - 1894007588) + i7;
            int i34 = (i4 >>> 2) | (i4 << 30);
            int i35 = i32 + 1;
            int i36 = ((((((i3 & i5) | (i3 & i34)) | (i34 & i5)) + ((i33 << 5) | (i33 >>> 27))) + iArr[i32]) - 1894007588) + i6;
            int i37 = (i3 >>> 2) | (i3 << 30);
            int i38 = i35 + 1;
            int i39 = ((((((i33 & i34) | (i33 & i37)) | (i37 & i34)) + ((i36 << 5) | (i36 >>> 27))) + iArr[i35]) - 1894007588) + i5;
            i7 = (i33 >>> 2) | (i33 << 30);
            int i40 = i38 + 1;
            i4 = ((((((i36 & i37) | (i36 & i7)) | (i7 & i37)) + ((i39 << 5) | (i39 >>> 27))) + iArr[i38]) - 1894007588) + i34;
            i6 = (i36 >>> 2) | (i36 << 30);
            i9 = i40 + 1;
            i3 = ((((((i39 & i7) | (i39 & i6)) | (i6 & i7)) + ((i4 << 5) | (i4 >>> 27))) + iArr[i40]) - 1894007588) + i37;
            i5 = (i39 >>> 2) | (i39 << 30);
            i31++;
        } while (i31 < 4);
        int i41 = 0;
        do {
            int i42 = i9 + 1;
            int i43 = (((((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6)) + iArr[i9]) - 899497514) + i7;
            int i44 = (i4 >>> 2) | (i4 << 30);
            int i45 = i42 + 1;
            int i46 = (((((i43 << 5) | (i43 >>> 27)) + ((i3 ^ i44) ^ i5)) + iArr[i42]) - 899497514) + i6;
            int i47 = (i3 >>> 2) | (i3 << 30);
            int i48 = i45 + 1;
            int i49 = (((((i46 << 5) | (i46 >>> 27)) + ((i43 ^ i47) ^ i44)) + iArr[i45]) - 899497514) + i5;
            i7 = (i43 >>> 2) | (i43 << 30);
            int i50 = i48 + 1;
            i4 = (((((i49 << 5) | (i49 >>> 27)) + ((i46 ^ i7) ^ i47)) + iArr[i48]) - 899497514) + i44;
            i6 = (i46 >>> 2) | (i46 << 30);
            i9 = i50 + 1;
            i3 = (((((i4 << 5) | (i4 >>> 27)) + ((i49 ^ i6) ^ i7)) + iArr[i50]) - 899497514) + i47;
            i5 = (i49 >>> 2) | (i49 << 30);
            i41++;
        } while (i41 <= 3);
        this.A00 = i3 + i3;
        this.A01 = i4 + i4;
        this.A02 = i5 + i5;
        this.A03 = i6 + i6;
        this.A04 = i7 + i7;
        this.A05 = 0;
        int i51 = 0;
        do {
            iArr[i51] = 0;
            i51++;
        } while (i51 < 16);
    }

    @Override // X.C0DL
    public void A03(long j) {
        if (this.A05 > 14) {
            A02();
        }
        int[] iArr = this.A06;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & (-1));
    }

    @Override // X.C0DL
    public void A04(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.A06;
        int i5 = this.A05;
        iArr[i5] = (bArr[i3 + 1] & 255) | i4;
        int i6 = i5 + 1;
        this.A05 = i6;
        if (i6 == 16) {
            A02();
        }
    }

    public final void A05(C41011tE c41011tE) {
        this.A00 = c41011tE.A00;
        this.A01 = c41011tE.A01;
        this.A02 = c41011tE.A02;
        this.A03 = c41011tE.A03;
        this.A04 = c41011tE.A04;
        int[] iArr = c41011tE.A06;
        System.arraycopy(iArr, 0, this.A06, 0, iArr.length);
        this.A05 = c41011tE.A05;
    }

    @Override // X.C0DM
    public C0DM A6a() {
        return new C41011tE(this);
    }

    @Override // X.C0DO
    public int A7P(byte[] bArr, int i) {
        A00();
        C02180Ae.A0u(this.A00, bArr, i);
        C02180Ae.A0u(this.A01, bArr, i + 4);
        C02180Ae.A0u(this.A02, bArr, i + 8);
        C02180Ae.A0u(this.A03, bArr, i + 12);
        C02180Ae.A0u(this.A04, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // X.C0DM
    public void ARi(C0DM c0dm) {
        C41011tE c41011tE = (C41011tE) c0dm;
        super.A01(c41011tE);
        A05(c41011tE);
    }

    @Override // X.C0DL, X.C0DO
    public void reset() {
        super.reset();
        this.A00 = 1732584193;
        this.A01 = -271733879;
        this.A02 = -1732584194;
        this.A03 = 271733878;
        this.A04 = -1009589776;
        this.A05 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.A06;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
