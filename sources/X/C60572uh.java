package X;

import java.io.OutputStream;
import java.security.SecureRandom;

/* renamed from: X.2uh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60572uh {
    public static final SecureRandom A04 = new SecureRandom();
    public byte[] A00;
    public final C60562ug A01;
    public final C60552uf[] A02;
    public final C60592uj[] A03;

    public C60572uh(C60562ug c60562ug, C60592uj[] c60592ujArr, C60552uf[] c60552ufArr) {
        this.A01 = c60562ug;
        this.A03 = c60592ujArr;
        this.A02 = c60552ufArr;
    }

    public static C60572uh A00(String str) {
        C60582ui A01 = C60582ui.A01(str.split("\\."));
        return A02(new C60592uj[]{new C60592uj(A01, (short) 1, (short) 1, A01.A00 + 4)});
    }

    public static C60572uh A01(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length >= 12) {
                short A03 = A03(bArr, 0);
                byte b = bArr[2];
                boolean z = (b & 128) != 0;
                byte b2 = (byte) ((b >> 3) & 15);
                boolean z2 = (b & 4) != 0;
                boolean z3 = (b & 2) != 0;
                boolean z4 = (b & 1) != 0;
                byte b3 = bArr[3];
                C60562ug c60562ug = new C60562ug(A03, z, b2, z2, z3, z4, (b3 & 128) != 0, (byte) (b3 & 15), A03(bArr, 4), A03(bArr, 6), A03(bArr, 8), A03(bArr, 10));
                int i = c60562ug.A05;
                C60592uj[] c60592ujArr = new C60592uj[i];
                int i2 = 12;
                for (int i3 = 0; i3 < i; i3++) {
                    C60582ui A00 = C60582ui.A00(bArr, i2);
                    int i4 = A00.A00 + i2;
                    if (length >= i4 + 4) {
                        c60592ujArr[i3] = new C60592uj(A00, A03(bArr, i4), A03(bArr, i4 + 2), A00.A00 + 4);
                        i2 += c60592ujArr[i3].A00;
                    } else {
                        throw new IllegalArgumentException("insufficient data");
                    }
                }
                int i5 = c60562ug.A03;
                C60552uf[] c60552ufArr = new C60552uf[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    C60582ui A002 = C60582ui.A00(bArr, i2);
                    int i7 = A002.A00;
                    int i8 = i7 + i2;
                    int i9 = i8 + 10;
                    if (length >= i9) {
                        short A032 = A03(bArr, i8);
                        short A033 = A03(bArr, i8 + 2);
                        int i10 = i8 + 4;
                        int i11 = (bArr[i10 + 3] & 255) | ((bArr[i10] << 24) & (-16777216)) | ((bArr[i10 + 1] << 16) & 16711680) | ((bArr[i10 + 2] << 8) & 65280);
                        int A034 = A03(bArr, i8 + 8);
                        if (length >= i9 + A034) {
                            byte[] bArr2 = new byte[A034];
                            System.arraycopy(bArr, i9, bArr2, 0, A034);
                            c60552ufArr[i6] = new C60552uf(A002, A032, A033, i11, bArr2, i7 + 10 + A034);
                            i2 += c60552ufArr[i6].A00;
                        } else {
                            throw new IllegalArgumentException("insufficient data");
                        }
                    } else {
                        throw new IllegalArgumentException("insufficient data");
                    }
                }
                C60572uh c60572uh = new C60572uh(c60562ug, c60592ujArr, c60552ufArr);
                c60572uh.A00 = bArr;
                return c60572uh;
            }
            throw new IllegalArgumentException("bytes does not contain enough data");
        }
        throw new NullPointerException("bytes may not be null");
    }

    public static C60572uh A02(C60592uj[] c60592ujArr) {
        return new C60572uh(new C60562ug((short) A04.nextInt(65536), false, (byte) 0, false, false, true, false, (short) 0, (short) 1, (short) 0, (short) 0, (short) 0), c60592ujArr, new C60552uf[0]);
    }

    public static short A03(byte[] bArr, int i) {
        byte b = bArr[i];
        return (short) ((bArr[i + 1] & 255) | ((b << 8) & 65280));
    }

    public static void A04(OutputStream outputStream, short s) {
        outputStream.write((byte) ((65280 & s) >>> 8));
        outputStream.write((byte) (s & 255));
    }

    public static void A05(short s, byte[] bArr, int i) {
        bArr[i] = (byte) ((65280 & s) >>> 8);
        bArr[i + 1] = (byte) (s & 255);
    }

    public void A06(OutputStream outputStream) {
        C60592uj[] c60592ujArr;
        C60552uf[] c60552ufArr;
        C60562ug c60562ug = this.A01;
        byte[] bArr = new byte[12];
        A05(c60562ug.A01, bArr, 0);
        bArr[2] = 0;
        byte b = (byte) ((c60562ug.A0A ? 128 : 0) | 0);
        bArr[2] = b;
        byte b2 = (byte) (b | ((byte) ((c60562ug.A00 & 15) << 3)));
        bArr[2] = b2;
        byte b3 = (byte) (b2 | (c60562ug.A07 ? (byte) 4 : (byte) 0));
        bArr[2] = b3;
        byte b4 = (byte) (b3 | (c60562ug.A0B ? (byte) 2 : (byte) 0));
        bArr[2] = b4;
        bArr[2] = (byte) (b4 | (c60562ug.A09 ? 1 : 0));
        bArr[3] = 0;
        byte b5 = (byte) (0 | (c60562ug.A08 ? 128 : 0));
        bArr[3] = b5;
        bArr[3] = (byte) (b5 | ((byte) (c60562ug.A06 & 15)));
        A05(c60562ug.A05, bArr, 4);
        A05(c60562ug.A03, bArr, 6);
        A05(c60562ug.A04, bArr, 8);
        A05(c60562ug.A02, bArr, 10);
        outputStream.write(bArr);
        for (C60592uj c60592uj : this.A03) {
            c60592uj.A01.A02(outputStream);
            A04(outputStream, c60592uj.A03);
            A04(outputStream, c60592uj.A02);
        }
        for (C60552uf c60552uf : this.A02) {
            c60552uf.A02.A02(outputStream);
            A04(outputStream, c60552uf.A04);
            A04(outputStream, c60552uf.A03);
            int i = c60552uf.A01;
            outputStream.write((i >>> 24) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write(i & 255);
            byte[] bArr2 = c60552uf.A05;
            A04(outputStream, (short) bArr2.length);
            outputStream.write(bArr2);
        }
    }
}
