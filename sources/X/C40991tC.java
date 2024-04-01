package X;

/* renamed from: X.1tC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40991tC extends C0DL {
    public static final int[] A0A = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int[] A09;

    public static final int A00(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    public static final int A01(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    @Override // X.C0DO
    public String A8K() {
        return "SHA-256";
    }

    @Override // X.C0DO
    public int A9n() {
        return 32;
    }

    public C40991tC() {
        this.A09 = new int[64];
        reset();
    }

    public C40991tC(C40991tC c40991tC) {
        super(c40991tC);
        this.A09 = new int[64];
        A05(c40991tC);
    }

    @Override // X.C0DL
    public void A02() {
        int[] iArr;
        int i = 16;
        do {
            iArr = this.A09;
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
            i++;
        } while (i <= 63);
        int i5 = this.A00;
        int i6 = this.A01;
        int i7 = this.A02;
        int i8 = this.A03;
        int i9 = this.A04;
        int i10 = this.A05;
        int i11 = this.A06;
        int i12 = this.A07;
        int i13 = 0;
        int i14 = 0;
        do {
            int[] iArr2 = A0A;
            int A01 = (((i9 ^ (-1)) & i11) ^ (i10 & i9)) + A01(i9) + iArr2[i14] + iArr[i14] + i12;
            int i15 = i8 + A01;
            int i16 = i5 & i6;
            int A00 = (((i5 & i7) ^ i16) ^ (i6 & i7)) + A00(i5) + A01;
            int i17 = i14 + 1;
            int A012 = (((i15 ^ (-1)) & i10) ^ (i9 & i15)) + A01(i15) + iArr2[i17] + iArr[i17] + i11;
            int i18 = i7 + A012;
            int i19 = A00 & i5;
            int A002 = (((A00 & i6) ^ i19) ^ i16) + A00(A00) + A012;
            int i20 = i17 + 1;
            int A013 = (((i18 ^ (-1)) & i9) ^ (i15 & i18)) + A01(i18) + iArr2[i20] + iArr[i20] + i10;
            int i21 = i6 + A013;
            int i22 = A002 & A00;
            int A003 = (((A002 & i5) ^ i22) ^ i19) + A00(A002) + A013;
            int i23 = i20 + 1;
            int A014 = (((i21 ^ (-1)) & i15) ^ (i18 & i21)) + A01(i21) + iArr2[i23] + iArr[i23] + i9;
            int i24 = i5 + A014;
            int i25 = A003 & A002;
            int A004 = (((A003 & A00) ^ i25) ^ i22) + A00(A003) + A014;
            int i26 = i23 + 1;
            int A015 = (((i24 ^ (-1)) & i18) ^ (i21 & i24)) + A01(i24) + iArr2[i26] + iArr[i26] + i15;
            i12 = A00 + A015;
            int i27 = A004 & A003;
            i8 = (((A004 & A002) ^ i27) ^ i25) + A00(A004) + A015;
            int i28 = i26 + 1;
            int A016 = (((i12 ^ (-1)) & i21) ^ (i24 & i12)) + A01(i12) + iArr2[i28] + iArr[i28] + i18;
            i11 = A002 + A016;
            int i29 = i8 & A004;
            i7 = (((i8 & A003) ^ i29) ^ i27) + A00(i8) + A016;
            int i30 = i28 + 1;
            int A017 = (((i11 ^ (-1)) & i24) ^ (i12 & i11)) + A01(i11) + iArr2[i30] + iArr[i30] + i21;
            i10 = A003 + A017;
            int i31 = i7 & i8;
            i6 = (((i7 & A004) ^ i31) ^ i29) + A00(i7) + A017;
            int i32 = i30 + 1;
            int A018 = (((i10 ^ (-1)) & i12) ^ (i11 & i10)) + A01(i10) + iArr2[i32] + iArr[i32] + i24;
            i9 = A004 + A018;
            i5 = (((i6 & i8) ^ (i6 & i7)) ^ i31) + A00(i6) + A018;
            i14 = i32 + 1;
            i13++;
        } while (i13 < 8);
        this.A00 = i5 + i5;
        this.A01 = i6 + i6;
        this.A02 = i7 + i7;
        this.A03 = i8 + i8;
        this.A04 = i9 + i9;
        this.A05 = i10 + i10;
        this.A06 = i11 + i11;
        this.A07 = i12 + i12;
        this.A08 = 0;
        int i33 = 0;
        do {
            iArr[i33] = 0;
            i33++;
        } while (i33 < 16);
    }

    @Override // X.C0DL
    public void A03(long j) {
        if (this.A08 > 14) {
            A02();
        }
        int[] iArr = this.A09;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & (-1));
    }

    @Override // X.C0DL
    public void A04(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.A09;
        int i5 = this.A08;
        iArr[i5] = (bArr[i3 + 1] & 255) | i4;
        int i6 = i5 + 1;
        this.A08 = i6;
        if (i6 == 16) {
            A02();
        }
    }

    public final void A05(C40991tC c40991tC) {
        super.A01(c40991tC);
        this.A00 = c40991tC.A00;
        this.A01 = c40991tC.A01;
        this.A02 = c40991tC.A02;
        this.A03 = c40991tC.A03;
        this.A04 = c40991tC.A04;
        this.A05 = c40991tC.A05;
        this.A06 = c40991tC.A06;
        this.A07 = c40991tC.A07;
        int[] iArr = c40991tC.A09;
        System.arraycopy(iArr, 0, this.A09, 0, iArr.length);
        this.A08 = c40991tC.A08;
    }

    @Override // X.C0DM
    public C0DM A6a() {
        return new C40991tC(this);
    }

    @Override // X.C0DO
    public int A7P(byte[] bArr, int i) {
        A00();
        C02180Ae.A0u(this.A00, bArr, i);
        C02180Ae.A0u(this.A01, bArr, i + 4);
        C02180Ae.A0u(this.A02, bArr, i + 8);
        C02180Ae.A0u(this.A03, bArr, i + 12);
        C02180Ae.A0u(this.A04, bArr, i + 16);
        C02180Ae.A0u(this.A05, bArr, i + 20);
        C02180Ae.A0u(this.A06, bArr, i + 24);
        C02180Ae.A0u(this.A07, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // X.C0DM
    public void ARi(C0DM c0dm) {
        A05((C40991tC) c0dm);
    }

    @Override // X.C0DL, X.C0DO
    public void reset() {
        super.reset();
        this.A00 = 1779033703;
        this.A01 = -1150833019;
        this.A02 = 1013904242;
        this.A03 = -1521486534;
        this.A04 = 1359893119;
        this.A05 = -1694144372;
        this.A06 = 528734635;
        this.A07 = 1541459225;
        this.A08 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.A09;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
