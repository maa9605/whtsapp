package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;

/* renamed from: X.3fb */
/* loaded from: classes2.dex */
public class C75823fb {
    public static byte[] A00(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                byteArrayOutputStream.write(bArr2);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static int[] A01(int i, int i2) {
        int i3 = 32 / i2;
        int i4 = (int) ((1 << i3) - 1);
        int[] iArr = new int[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            iArr[(i2 - i5) - 1] = (i >> (i3 * i5)) & i4;
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            iArr[i6] = iArr[i6] + 1;
        }
        return iArr;
    }

    public static byte[][] A02(byte[] bArr, int i, int i2) {
        System.arraycopy(bArr, 0, r3[0], 0, i);
        byte[][] bArr2 = {new byte[i], new byte[i2]};
        System.arraycopy(bArr, i, bArr2[1], 0, i2);
        return bArr2;
    }

    public static byte[][] A03(byte[] bArr, int i, int i2, int i3) {
        String str;
        if (bArr != null && i2 >= 0) {
            int i4 = i + i2;
            if (bArr.length >= i4 + i3) {
                System.arraycopy(bArr, 0, r2[0], 0, i);
                System.arraycopy(bArr, i, r2[1], 0, i2);
                byte[][] bArr2 = {new byte[i], new byte[i2], new byte[i3]};
                System.arraycopy(bArr, i4, bArr2[2], 0, i3);
                return bArr2;
            }
        }
        StringBuilder A0P = C000200d.A0P("Input too small: ");
        if (bArr != null) {
            int length = bArr.length;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i5 = 0; i5 < length; i5++) {
                byte b = bArr[0 + i5];
                stringBuffer.append("(byte)0x");
                char[] cArr = C75863ff.A00;
                stringBuffer.append(cArr[(b >> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
                stringBuffer.append(", ");
            }
            str = stringBuffer.toString();
        } else {
            str = null;
        }
        A0P.append(str);
        throw new ParseException(A0P.toString(), 0);
    }
}
