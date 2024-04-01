package X;

import javax.crypto.BadPaddingException;

/* renamed from: X.3vc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C85443vc implements InterfaceC75373en {
    public C75303eg A00;

    @Override // X.InterfaceC75373en
    public boolean AWG() {
        return true;
    }

    public C85443vc(InterfaceC54282iU interfaceC54282iU) {
        this.A00 = new C85413vM(interfaceC54282iU);
    }

    public C85443vc(C75303eg c75303eg) {
        this.A00 = c75303eg;
    }

    @Override // X.InterfaceC75373en
    public int A7P(byte[] bArr, int i) {
        int i2;
        try {
            C75303eg c75303eg = this.A00;
            if (!(c75303eg instanceof C85413vM)) {
                int i3 = c75303eg.A00;
                if (i3 + i <= bArr.length) {
                    int i4 = 0;
                    if (i3 != 0) {
                        if (c75303eg.A03) {
                            InterfaceC54282iU interfaceC54282iU = c75303eg.A01;
                            byte[] bArr2 = c75303eg.A05;
                            interfaceC54282iU.AQr(bArr2, 0, bArr2, 0);
                            int i5 = c75303eg.A00;
                            c75303eg.A00 = 0;
                            System.arraycopy(c75303eg.A05, 0, bArr, i, i5);
                            i4 = i5;
                        } else {
                            throw new C54302iW("data not block size aligned");
                        }
                    }
                    c75303eg.A01();
                    return i4;
                }
                throw new C54292iV("output buffer too short for doFinal()");
            }
            C85413vM c85413vM = (C85413vM) c75303eg;
            InterfaceC54282iU interfaceC54282iU2 = c85413vM.A01;
            int A8X = interfaceC54282iU2.A8X();
            if (c85413vM.A02) {
                int i6 = ((C75303eg) c85413vM).A00;
                if (i6 != A8X) {
                    i2 = 0;
                } else if ((A8X << 1) + i <= bArr.length) {
                    i2 = interfaceC54282iU2.AQr(c85413vM.A05, 0, bArr, i);
                    ((C75303eg) c85413vM).A00 = 0;
                    i6 = 0;
                } else {
                    c85413vM.A01();
                    throw new C54292iV("output buffer too short");
                }
                C75343ek c75343ek = c85413vM.A00;
                byte[] bArr3 = c85413vM.A05;
                if (c75343ek != null) {
                    int length = bArr3.length;
                    byte b = (byte) (length - i6);
                    while (i6 < length) {
                        bArr3[i6] = b;
                        i6++;
                    }
                    int AQr = c85413vM.A01.AQr(bArr3, 0, bArr, i + i2) + i2;
                    c85413vM.A01();
                    return AQr;
                }
                throw null;
            } else if (((C75303eg) c85413vM).A00 == A8X) {
                byte[] bArr4 = c85413vM.A05;
                int AQr2 = interfaceC54282iU2.AQr(bArr4, 0, bArr4, 0);
                ((C75303eg) c85413vM).A00 = 0;
                C75343ek c75343ek2 = c85413vM.A00;
                byte[] bArr5 = c85413vM.A05;
                if (c75343ek2 != null) {
                    int length2 = bArr5.length;
                    int i7 = bArr5[length2 - 1] & 255;
                    byte b2 = (byte) i7;
                    boolean z = (i7 > length2) | (i7 == 0);
                    for (int i8 = 0; i8 < length2; i8++) {
                        boolean z2 = length2 - i8 <= i7;
                        boolean z3 = false;
                        if (bArr5[i8] != b2) {
                            z3 = true;
                        }
                        z |= z2 & z3;
                    }
                    if (!z) {
                        int i9 = AQr2 - i7;
                        System.arraycopy(bArr5, 0, bArr, i, i9);
                        c85413vM.A01();
                        return i9;
                    }
                    throw new C54362ic("pad block corrupted");
                }
                throw null;
            } else {
                c85413vM.A01();
                throw new C54302iW("last block incomplete in decryption");
            }
        } catch (C54362ic e) {
            throw new BadPaddingException(e.getMessage());
        }
    }

    @Override // X.InterfaceC75373en
    public String A8K() {
        return this.A00.A01.A8K();
    }

    @Override // X.InterfaceC75373en
    public int ABl(int i) {
        C75303eg c75303eg = this.A00;
        if (!(c75303eg instanceof C85413vM)) {
            return i + c75303eg.A00;
        }
        int i2 = i + c75303eg.A00;
        int length = c75303eg.A05.length;
        int i3 = i2 % length;
        if (i3 != 0) {
            i2 -= i3;
        } else if (!c75303eg.A02) {
            return i2;
        }
        return i2 + length;
    }

    @Override // X.InterfaceC75373en
    public InterfaceC54282iU ADe() {
        return this.A00.A01;
    }

    @Override // X.InterfaceC75373en
    public int ADh(int i) {
        return this.A00.A00(i);
    }

    @Override // X.InterfaceC75373en
    public void AEj(boolean z, InterfaceC54072i2 interfaceC54072i2) {
        C75303eg c75303eg = this.A00;
        if (!(c75303eg instanceof C85413vM)) {
            c75303eg.A02 = z;
            c75303eg.A01();
            c75303eg.A01.AEj(z, interfaceC54072i2);
            return;
        }
        C85413vM c85413vM = (C85413vM) c75303eg;
        c85413vM.A02 = z;
        c85413vM.A01();
        if (interfaceC54072i2 instanceof C85423vN) {
            C85423vN c85423vN = (C85423vN) interfaceC54072i2;
            if (c85413vM.A00 != null) {
                c85413vM.A01.AEj(z, c85423vN.A01);
                return;
            }
            throw null;
        } else if (c85413vM.A00 != null) {
            c85413vM.A01.AEj(z, interfaceC54072i2);
        } else {
            throw null;
        }
    }

    @Override // X.InterfaceC75373en
    public int AQs(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        C75303eg c75303eg = this.A00;
        if (c75303eg instanceof C85413vM) {
            if (i2 >= 0) {
                int A8X = c75303eg.A01.A8X();
                int A00 = c75303eg.A00(i2);
                if (A00 > 0 && A00 + i3 > bArr2.length) {
                    throw new C54292iV("output buffer too short");
                }
                byte[] bArr3 = c75303eg.A05;
                int length = bArr3.length;
                int i5 = c75303eg.A00;
                int i6 = length - i5;
                int i7 = 0;
                if (i2 > i6) {
                    System.arraycopy(bArr, i, bArr3, i5, i6);
                    c75303eg.A00 = 0;
                    i2 -= i6;
                    i += i6;
                    i7 = c75303eg.A01.AQr(c75303eg.A05, 0, bArr2, i3) + 0;
                    while (true) {
                        bArr3 = c75303eg.A05;
                        if (i2 <= bArr3.length) {
                            break;
                        }
                        i7 += c75303eg.A01.AQr(bArr, i, bArr2, i3 + i7);
                        i2 -= A8X;
                        i += A8X;
                    }
                }
                System.arraycopy(bArr, i, bArr3, c75303eg.A00, i2);
                c75303eg.A00 += i2;
                return i7;
            }
            throw new IllegalArgumentException("Can't have a negative input length!");
        } else if (i2 >= 0) {
            int A8X2 = c75303eg.A01.A8X();
            int A002 = c75303eg.A00(i2);
            if (A002 > 0 && A002 + i3 > bArr2.length) {
                throw new C54292iV("output buffer too short");
            }
            byte[] bArr4 = c75303eg.A05;
            int length2 = bArr4.length;
            int i8 = c75303eg.A00;
            int i9 = length2 - i8;
            if (i2 > i9) {
                System.arraycopy(bArr, i, bArr4, i8, i9);
                i4 = c75303eg.A01.AQr(c75303eg.A05, 0, bArr2, i3) + 0;
                c75303eg.A00 = 0;
                i2 -= i9;
                i += i9;
                while (true) {
                    bArr4 = c75303eg.A05;
                    if (i2 <= bArr4.length) {
                        break;
                    }
                    i4 += c75303eg.A01.AQr(bArr, i, bArr2, i3 + i4);
                    i2 -= A8X2;
                    i += A8X2;
                }
            } else {
                i4 = 0;
            }
            System.arraycopy(bArr, i, bArr4, c75303eg.A00, i2);
            int i10 = c75303eg.A00 + i2;
            c75303eg.A00 = i10;
            byte[] bArr5 = c75303eg.A05;
            if (i10 == bArr5.length) {
                int AQr = i4 + c75303eg.A01.AQr(bArr5, 0, bArr2, i3 + i4);
                c75303eg.A00 = 0;
                return AQr;
            }
            return i4;
        } else {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
    }

    @Override // X.InterfaceC75373en
    public void AVm(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("AAD is not supported in the current mode.");
    }
}
