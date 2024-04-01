package X;

/* renamed from: X.3vK */
/* loaded from: classes2.dex */
public abstract class AbstractC85393vK implements InterfaceC54282iU, InterfaceC75323ei {
    public void A00(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte b;
        byte b2;
        if (i3 + i2 <= bArr2.length) {
            int i4 = i + i2;
            if (i4 > bArr.length) {
                throw new C54302iW("input buffer too small");
            }
            while (i < i4) {
                int i5 = i3 + 1;
                int i6 = i + 1;
                byte b3 = bArr[i];
                if (this instanceof C86803yK) {
                    C86803yK c86803yK = (C86803yK) this;
                    int i7 = c86803yK.A00;
                    if (i7 == 0) {
                        c86803yK.A05.AQr(c86803yK.A02, 0, c86803yK.A03, 0);
                        byte[] bArr3 = c86803yK.A03;
                        int i8 = c86803yK.A00;
                        c86803yK.A00 = i8 + 1;
                        b = (byte) (b3 ^ bArr3[i8]);
                    } else {
                        byte[] bArr4 = c86803yK.A03;
                        int i9 = i7 + 1;
                        c86803yK.A00 = i9;
                        b = (byte) (b3 ^ bArr4[i7]);
                        byte[] bArr5 = c86803yK.A02;
                        int length = bArr5.length;
                        if (i9 == length) {
                            c86803yK.A00 = 0;
                            int i10 = length - 0;
                            do {
                                i10--;
                                if (i10 < 0) {
                                    break;
                                }
                                b2 = (byte) (bArr5[i10] + 1);
                                bArr5[i10] = b2;
                            } while (b2 == 0);
                            byte[] bArr6 = c86803yK.A01;
                            int length2 = bArr6.length;
                            if (length2 < c86803yK.A04) {
                                for (int i11 = 0; i11 != length2; i11++) {
                                    if (bArr5[i11] != bArr6[i11]) {
                                        throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
                                    }
                                }
                                continue;
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (!(this instanceof C86793yJ)) {
                    C86783yI c86783yI = (C86783yI) this;
                    if (c86783yI.A03) {
                        if (c86783yI.A01 == 0) {
                            c86783yI.A02.AQr(c86783yI.A06, 0, c86783yI.A05, 0);
                        }
                        byte[] bArr7 = c86783yI.A05;
                        int i12 = c86783yI.A01;
                        b = (byte) (b3 ^ bArr7[i12]);
                        byte[] bArr8 = c86783yI.A07;
                        int i13 = i12 + 1;
                        c86783yI.A01 = i13;
                        bArr8[i12] = b;
                        int i14 = c86783yI.A00;
                        if (i13 == i14) {
                            c86783yI.A01 = 0;
                            byte[] bArr9 = c86783yI.A06;
                            System.arraycopy(bArr9, i14, bArr9, 0, bArr9.length - i14);
                            byte[] bArr10 = c86783yI.A07;
                            byte[] bArr11 = c86783yI.A06;
                            int length3 = bArr11.length;
                            int i15 = c86783yI.A00;
                            System.arraycopy(bArr10, 0, bArr11, length3 - i15, i15);
                        }
                    } else {
                        if (c86783yI.A01 == 0) {
                            c86783yI.A02.AQr(c86783yI.A06, 0, c86783yI.A05, 0);
                        }
                        byte[] bArr12 = c86783yI.A07;
                        int i16 = c86783yI.A01;
                        bArr12[i16] = b3;
                        byte[] bArr13 = c86783yI.A05;
                        int i17 = i16 + 1;
                        c86783yI.A01 = i17;
                        b = (byte) (b3 ^ bArr13[i16]);
                        int i18 = c86783yI.A00;
                        if (i17 == i18) {
                            c86783yI.A01 = 0;
                            byte[] bArr14 = c86783yI.A06;
                            System.arraycopy(bArr14, i18, bArr14, 0, bArr14.length - i18);
                            byte[] bArr15 = c86783yI.A07;
                            byte[] bArr16 = c86783yI.A06;
                            int length4 = bArr16.length;
                            int i19 = c86783yI.A00;
                            System.arraycopy(bArr15, 0, bArr16, length4 - i19, i19);
                        }
                    }
                } else {
                    C86793yJ c86793yJ = (C86793yJ) this;
                    if (c86793yJ.A00 == 0) {
                        c86793yJ.A05.AQr(c86793yJ.A03, 0, c86793yJ.A02, 0);
                    }
                    byte[] bArr17 = c86793yJ.A02;
                    int i20 = c86793yJ.A00;
                    int i21 = i20 + 1;
                    c86793yJ.A00 = i21;
                    b = (byte) (b3 ^ bArr17[i20]);
                    int i22 = c86793yJ.A04;
                    if (i21 == i22) {
                        c86793yJ.A00 = 0;
                        byte[] bArr18 = c86793yJ.A03;
                        System.arraycopy(bArr18, i22, bArr18, 0, bArr18.length - i22);
                        byte[] bArr19 = c86793yJ.A02;
                        byte[] bArr20 = c86793yJ.A03;
                        System.arraycopy(bArr19, 0, bArr20, bArr20.length - i22, i22);
                    }
                }
                bArr2[i3] = b;
                i3 = i5;
                i = i6;
            }
            return;
        }
        throw new C54302iW("output buffer too short");
    }
}
