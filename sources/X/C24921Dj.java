package X;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Dj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24921Dj {
    public static final int[] A00 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static C24841Db A00(int i, C1DV c1dv) {
        int i2 = 1;
        do {
            C24841Db A01 = C24841Db.A01(i2);
            int i3 = A01.A00;
            C24831Da c24831Da = A01.A03[c1dv.ordinal()];
            int i4 = c24831Da.A00;
            int i5 = 0;
            for (C1DZ c1dz : c24831Da.A01) {
                i5 += c1dz.A00;
            }
            if (i3 - (i5 * i4) >= ((i + 7) >> 3)) {
                return A01;
            }
            i2++;
        } while (i2 <= 40);
        throw new C1DD("Data too big");
    }

    public static C0SG A01(String str, C1DV c1dv, Map map) {
        C1DX c1dx;
        int length;
        int length2;
        int i;
        int i2;
        C1DH c1dh;
        C1DX c1dx2 = C1DX.BYTE;
        String str2 = map == null ? null : (String) map.get(C1D6.CHARACTER_SET);
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        if ("Shift_JIS".equals(str2)) {
            try {
                byte[] bytes = str.getBytes("Shift_JIS");
                int length3 = bytes.length;
                if (length3 % 2 == 0) {
                    for (int i3 = 0; i3 < length3; i3 += 2) {
                        int i4 = bytes[i3] & 255;
                        if ((i4 >= 129 && i4 <= 159) || (i4 >= 224 && i4 <= 235)) {
                        }
                    }
                    c1dx = C1DX.KANJI;
                }
            } catch (UnsupportedEncodingException unused) {
            }
            c1dx = c1dx2;
            break;
        } else {
            int i5 = 0;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (i5 < str.length()) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        int[] iArr = A00;
                        if (charAt >= iArr.length || iArr[charAt] == -1) {
                            break;
                        }
                        z = true;
                    } else {
                        z2 = true;
                    }
                    i5++;
                } else if (z) {
                    c1dx = C1DX.ALPHANUMERIC;
                } else if (z2) {
                    c1dx = C1DX.NUMERIC;
                }
            }
        }
        C1DE c1de = new C1DE();
        if (c1dx == c1dx2 && !"ISO-8859-1".equals(str2) && (c1dh = (C1DH) C1DH.A00.get(str2)) != null) {
            c1de.A01(C1DX.ECI.bits, 4);
            c1de.A01(c1dh.values[0], 8);
        }
        c1de.A01(c1dx.bits, 4);
        C1DE c1de2 = new C1DE();
        int ordinal = c1dx.ordinal();
        if (ordinal == 1) {
            int length4 = str.length();
            int i6 = 0;
            while (i6 < length4) {
                int charAt2 = str.charAt(i6) - '0';
                int i7 = i6 + 2;
                if (i7 < length4) {
                    c1de2.A01(((str.charAt(i6 + 1) - '0') * 10) + (charAt2 * 100) + (str.charAt(i7) - '0'), 10);
                    i6 += 3;
                } else {
                    i6++;
                    if (i6 < length4) {
                        c1de2.A01((charAt2 * 10) + (str.charAt(i6) - '0'), 7);
                        i6 = i7;
                    } else {
                        c1de2.A01(charAt2, 4);
                    }
                }
            }
        } else if (ordinal == 2) {
            int length5 = str.length();
            int i8 = 0;
            while (i8 < length5) {
                char charAt3 = str.charAt(i8);
                int[] iArr2 = A00;
                int length6 = iArr2.length;
                if (charAt3 >= length6 || (i = iArr2[charAt3]) == -1) {
                    throw new C1DD();
                }
                int i9 = i8 + 1;
                if (i9 < length5) {
                    char charAt4 = str.charAt(i9);
                    if (charAt4 < length6 && (i2 = iArr2[charAt4]) != -1) {
                        c1de2.A01((i * 45) + i2, 11);
                        i8 += 2;
                    } else {
                        throw new C1DD();
                    }
                } else {
                    c1de2.A01(i, 6);
                    i8 = i9;
                }
            }
        } else if (ordinal == 4) {
            try {
                byte[] bytes2 = str.getBytes(str2);
                for (byte b : bytes2) {
                    c1de2.A01(b, 8);
                }
            } catch (UnsupportedEncodingException e) {
                throw new C1DD(e);
            }
        } else if (ordinal == 6) {
            try {
                byte[] bytes3 = str.getBytes("Shift_JIS");
                int length7 = bytes3.length;
                for (int i10 = 0; i10 < length7; i10 += 2) {
                    int i11 = ((bytes3[i10] & 255) << 8) | (bytes3[i10 + 1] & 255);
                    int i12 = 33088;
                    if (i11 < 33088 || i11 > 40956) {
                        i12 = (i11 >= 57408 && i11 <= 60351) ? 49472 : 49472;
                        throw new C1DD("Invalid byte sequence");
                    }
                    int i13 = i11 - i12;
                    if (i13 != -1) {
                        c1de2.A01(((i13 >> 8) * 192) + (i13 & 255), 13);
                    } else {
                        throw new C1DD("Invalid byte sequence");
                    }
                }
            } catch (UnsupportedEncodingException e2) {
                throw new C1DD(e2);
            }
        } else {
            StringBuilder sb = new StringBuilder("Invalid mode: ");
            sb.append(c1dx);
            throw new C1DD(sb.toString());
        }
        C24841Db A002 = A00(c1dx.A00(A00(c1dx.A00(C24841Db.A01(1)) + c1de.A00 + c1de2.A00, c1dv)) + c1de.A00 + c1de2.A00, c1dv);
        C1DE c1de3 = new C1DE();
        int i14 = c1de.A00;
        c1de3.A00(c1de3.A00 + i14);
        for (int i15 = 0; i15 < i14; i15++) {
            c1de3.A02(c1de.A03(i15));
        }
        if (c1dx == c1dx2) {
            length = (c1de2.A00 + 7) >> 3;
        } else {
            length = str.length();
        }
        int A003 = c1dx.A00(A002);
        int i16 = 1 << A003;
        if (length < i16) {
            c1de3.A01(length, A003);
            int i17 = c1de2.A00;
            c1de3.A00(c1de3.A00 + i17);
            for (int i18 = 0; i18 < i17; i18++) {
                c1de3.A02(c1de2.A03(i18));
            }
            C24831Da c24831Da = A002.A03[c1dv.ordinal()];
            int i19 = A002.A00;
            int i20 = c24831Da.A00;
            int i21 = 0;
            for (C1DZ c1dz : c24831Da.A01) {
                i21 += c1dz.A00;
            }
            int i22 = i19 - (i21 * i20);
            int i23 = i22 << 3;
            int i24 = c1de3.A00;
            if (i24 <= i23) {
                int i25 = 0;
                while (c1de3.A00 < i23) {
                    c1de3.A02(false);
                    i25++;
                    if (i25 >= 4) {
                        break;
                    }
                }
                int i26 = c1de3.A00 & 7;
                if (i26 > 0) {
                    while (i26 < 8) {
                        c1de3.A02(false);
                        i26++;
                    }
                }
                int i27 = i22 - ((c1de3.A00 + 7) >> 3);
                for (int i28 = 0; i28 < i27; i28++) {
                    int i29 = 17;
                    if ((i28 & 1) == 0) {
                        i29 = 236;
                    }
                    c1de3.A01(i29, 8);
                }
                int i30 = c1de3.A00;
                if (i30 == i23) {
                    int i31 = 0;
                    for (C1DZ c1dz2 : c24831Da.A01) {
                        i31 += c1dz2.A00;
                    }
                    if (((i30 + 7) >> 3) == i22) {
                        ArrayList arrayList = new ArrayList(i31);
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 0;
                        int i35 = 0;
                        while (true) {
                            int i36 = i31;
                            if (i32 >= i36) {
                                if (i22 == i33) {
                                    C1DE c1de4 = new C1DE();
                                    for (int i37 = 0; i37 < i34; i37++) {
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            byte[] bArr = ((C24911Di) it.next()).A00;
                                            if (i37 < bArr.length) {
                                                c1de4.A01(bArr[i37], 8);
                                            }
                                        }
                                    }
                                    for (int i38 = 0; i38 < i35; i38++) {
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            byte[] bArr2 = ((C24911Di) it2.next()).A01;
                                            if (i38 < bArr2.length) {
                                                c1de4.A01(bArr2[i38], 8);
                                            }
                                        }
                                    }
                                    int i39 = (c1de4.A00 + 7) >> 3;
                                    if (i19 != i39) {
                                        StringBuilder A0Q = C000200d.A0Q("Interleaving error: ", i19, " and ");
                                        A0Q.append(i39);
                                        A0Q.append(" differ.");
                                        throw new C1DD(A0Q.toString());
                                    }
                                    C0SG c0sg = new C0SG();
                                    c0sg.A01 = c1dv;
                                    c0sg.A02 = c1dx;
                                    c0sg.A03 = A002;
                                    int i40 = (A002.A01 << 2) + 17;
                                    C017708g c017708g = new C017708g(i40, i40);
                                    int i41 = Integer.MAX_VALUE;
                                    int i42 = -1;
                                    int i43 = 0;
                                    do {
                                        C24931Dk.A03(c1de4, c1dv, A002, i43, c017708g);
                                        int A04 = AnonymousClass088.A04(c017708g, false) + AnonymousClass088.A04(c017708g, true);
                                        byte[][] bArr3 = c017708g.A02;
                                        int i44 = c017708g.A01;
                                        int i45 = c017708g.A00;
                                        int i46 = 0;
                                        for (int i47 = 0; i47 < i45 - 1; i47++) {
                                            int i48 = 0;
                                            while (i48 < i44 - 1) {
                                                byte[] bArr4 = bArr3[i47];
                                                byte b2 = bArr4[i48];
                                                int i49 = i48 + 1;
                                                if (b2 == bArr4[i49]) {
                                                    int i50 = i47 + 1;
                                                    if (b2 == bArr3[i50][i48] && b2 == bArr3[i50][i49]) {
                                                        i46++;
                                                    }
                                                }
                                                i48 = i49;
                                            }
                                        }
                                        int i51 = (i46 * 3) + A04;
                                        int i52 = 0;
                                        for (int i53 = 0; i53 < i45; i53++) {
                                            for (int i54 = 0; i54 < i44; i54++) {
                                                byte[] bArr5 = bArr3[i53];
                                                int i55 = i54 + 6;
                                                if (i55 < i44 && bArr5[i54] == 1 && bArr5[i54 + 1] == 0 && bArr5[i54 + 2] == 1 && bArr5[i54 + 3] == 1 && bArr5[i54 + 4] == 1 && bArr5[i54 + 5] == 0 && bArr5[i55] == 1) {
                                                    int i56 = i54 - 4;
                                                    while (true) {
                                                        if (i56 >= i54) {
                                                            break;
                                                        } else if (i56 >= 0 && i56 < bArr5.length && bArr5[i56] == 1) {
                                                            int i57 = i54 + 11;
                                                            for (int i58 = i54 + 7; i58 < i57; i58++) {
                                                                if (i58 >= 0 && i58 < bArr5.length && bArr5[i58] == 1) {
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            i56++;
                                                        }
                                                    }
                                                    i52++;
                                                }
                                                int i59 = i53 + 6;
                                                if (i59 < i45 && bArr3[i53][i54] == 1 && bArr3[i53 + 1][i54] == 0 && bArr3[i53 + 2][i54] == 1 && bArr3[i53 + 3][i54] == 1 && bArr3[i53 + 4][i54] == 1 && bArr3[i53 + 5][i54] == 0 && bArr3[i59][i54] == 1) {
                                                    int i60 = i53 - 4;
                                                    while (true) {
                                                        if (i60 >= i53) {
                                                            break;
                                                        } else if (i60 < 0 || i60 >= (length2 = bArr3.length) || bArr3[i60][i54] != 1) {
                                                            i60++;
                                                        } else {
                                                            int i61 = i53 + 11;
                                                            for (int i62 = i53 + 7; i62 < i61; i62++) {
                                                                if (i62 < 0 || i62 >= length2 || bArr3[i62][i54] != 1) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i52++;
                                                }
                                            }
                                        }
                                        int i63 = (i52 * 40) + i51;
                                        int i64 = 0;
                                        for (int i65 = 0; i65 < i45; i65++) {
                                            byte[] bArr6 = bArr3[i65];
                                            for (int i66 = 0; i66 < i44; i66++) {
                                                if (bArr6[i66] == 1) {
                                                    i64++;
                                                }
                                            }
                                        }
                                        int i67 = i45 * i44;
                                        int abs = (((Math.abs((i64 << 1) - i67) * 10) / i67) * 10) + i63;
                                        if (abs < i41) {
                                            i41 = abs;
                                            i42 = i43;
                                        }
                                        i43++;
                                    } while (i43 < 8);
                                    c0sg.A00 = i42;
                                    C24931Dk.A03(c1de4, c1dv, A002, i42, c017708g);
                                    c0sg.A04 = c017708g;
                                    return c0sg;
                                }
                                throw new C1DD("Data bytes does not match offset");
                            }
                            int[] iArr3 = new int[1];
                            if (i32 < i36) {
                                int i68 = i19 % i31;
                                int i69 = i31 - i68;
                                int i70 = i19 / i31;
                                int i71 = i70 + 1;
                                int i72 = i22 / i31;
                                int i73 = i72 + 1;
                                int i74 = i70 - i72;
                                int i75 = i71 - i73;
                                if (i74 != i75) {
                                    throw new C1DD("EC bytes mismatch");
                                }
                                if (i31 != i69 + i68) {
                                    throw new C1DD("RS blocks mismatch");
                                }
                                if (i19 == ((i73 + i75) * i68) + ((i72 + i74) * i69)) {
                                    if (i32 < i69) {
                                        iArr3[0] = i72;
                                    } else {
                                        iArr3[0] = i73;
                                        i72 = i73;
                                        i74 = i75;
                                    }
                                    byte[] bArr7 = new byte[i72];
                                    int i76 = i33 << 3;
                                    for (int i77 = 0; i77 < i72; i77++) {
                                        int i78 = 0;
                                        int i79 = 0;
                                        do {
                                            if (c1de3.A03(i76)) {
                                                i79 |= 1 << (7 - i78);
                                            }
                                            i76++;
                                            i78++;
                                        } while (i78 < 8);
                                        bArr7[i77] = (byte) i79;
                                    }
                                    int i80 = i72 + i74;
                                    int[] iArr4 = new int[i80];
                                    for (int i81 = 0; i81 < i72; i81++) {
                                        iArr4[i81] = bArr7[i81] & 255;
                                    }
                                    C1DO c1do = new C1DO(C1DL.A09);
                                    if (i74 == 0) {
                                        throw new IllegalArgumentException("No error correction bytes");
                                    }
                                    int i82 = i80 - i74;
                                    if (i82 > 0) {
                                        List list = c1do.A01;
                                        int size = list.size();
                                        int i83 = i74;
                                        if (i83 >= size) {
                                            C1DM c1dm = (C1DM) list.get(list.size() - 1);
                                            int size2 = list.size();
                                            while (true) {
                                                i83 = i74;
                                                if (size2 > i83) {
                                                    break;
                                                }
                                                C1DL c1dl = c1do.A00;
                                                c1dm = c1dm.A04(new C1DM(c1dl, new int[]{1, c1dl.A05[(size2 - 1) + c1dl.A00]}));
                                                list.add(c1dm);
                                                size2++;
                                            }
                                        }
                                        C1DM c1dm2 = (C1DM) list.get(i83);
                                        int[] iArr5 = new int[i82];
                                        System.arraycopy(iArr4, 0, iArr5, 0, i82);
                                        C1DM A02 = new C1DM(c1do.A00, iArr5).A02(i74, 1);
                                        C1DL c1dl2 = A02.A00;
                                        if (c1dl2.equals(c1dm2.A00)) {
                                            int[] iArr6 = c1dm2.A01;
                                            if (iArr6[0] == 0) {
                                                throw new IllegalArgumentException("Divide by 0");
                                            }
                                            C1DM c1dm3 = c1dl2.A04;
                                            int length8 = iArr6.length - 1;
                                            int A004 = c1dl2.A00(iArr6[length8 - length8]);
                                            while (A02.A01.length - 1 >= length8 && A02.A01[0] != 0) {
                                                int[] iArr7 = A02.A01;
                                                int length9 = iArr7.length - 1;
                                                int i84 = length9 - length8;
                                                int A01 = c1dl2.A01(iArr7[length9 - length9], A004);
                                                C1DM A022 = c1dm2.A02(i84, A01);
                                                c1dm3 = c1dm3.A03(c1dl2.A02(i84, A01));
                                                A02 = A02.A03(A022);
                                            }
                                            int[] iArr8 = new C1DM[]{c1dm3, A02}[1].A01;
                                            int length10 = iArr8.length;
                                            int i85 = i74 - length10;
                                            for (int i86 = 0; i86 < i85; i86++) {
                                                iArr4[i82 + i86] = 0;
                                            }
                                            System.arraycopy(iArr8, 0, iArr4, i82 + i85, length10);
                                            byte[] bArr8 = new byte[i74];
                                            for (int i87 = 0; i87 < i74; i87++) {
                                                bArr8[i87] = (byte) iArr4[i72 + i87];
                                            }
                                            arrayList.add(new C24911Di(bArr7, bArr8));
                                            i34 = Math.max(i34, i72);
                                            i35 = Math.max(i35, i74);
                                            i33 += iArr3[0];
                                            i32++;
                                        } else {
                                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                        }
                                    } else {
                                        throw new IllegalArgumentException("No data bytes provided");
                                    }
                                } else {
                                    throw new C1DD("Total bytes mismatch");
                                }
                            } else {
                                throw new C1DD("Block ID too large");
                            }
                        }
                    } else {
                        throw new C1DD("Number of bits and data bytes does not match");
                    }
                } else {
                    throw new C1DD("Bits size does not equal capacity");
                }
            } else {
                StringBuilder A0P = C000200d.A0P("data bits cannot fit in the QR Code");
                A0P.append(i24);
                A0P.append(" > ");
                A0P.append(i23);
                throw new C1DD(A0P.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(length);
            sb2.append(" is bigger than ");
            sb2.append(i16 - 1);
            throw new C1DD(sb2.toString());
        }
    }
}
