package X;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* renamed from: X.2ui  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60582ui {
    public final int A00;
    public final short A01;
    public final String[] A02;

    public C60582ui(String[] strArr, short s, int i) {
        this.A02 = strArr;
        this.A01 = s;
        this.A00 = i;
    }

    public static C60582ui A00(byte[] bArr, int i) {
        short s;
        int i2;
        if (bArr != null) {
            int length = bArr.length;
            if (length >= 1) {
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                int i3 = i;
                while (true) {
                    if (bArr[i3] == 0 || (bArr[i3] & 192) != 0) {
                        break;
                    }
                    byte b = (byte) (bArr[i3] & 63);
                    int i4 = i3 + 1;
                    i3 = i4 + b;
                    if (length >= i3 + 1) {
                        sb.setLength(0);
                        for (byte b2 = 0; b2 < b; b2 = (byte) (b2 + 1)) {
                            sb.append((char) bArr[i4 + b2]);
                        }
                        arrayList.add(sb.toString());
                    } else {
                        throw new IllegalArgumentException("bytes is incomplete");
                    }
                }
                byte b3 = bArr[i3];
                if (b3 == 0) {
                    i2 = i3 + 1;
                    s = 0;
                } else {
                    byte b4 = (byte) (b3 & 63);
                    s = (short) ((bArr[i3 + 1] & 255) | ((b4 << 8) & 65280));
                    i2 = i3 + 2;
                }
                return new C60582ui((String[]) arrayList.toArray(new String[0]), s, i2 - i);
            }
            throw new IllegalArgumentException("insufficient data");
        }
        throw new NullPointerException("bytes may not be null");
    }

    public static C60582ui A01(String[] strArr) {
        int i = 0;
        for (String str : strArr) {
            try {
                int length = str.getBytes("UTF-8").length;
                if (length <= 63) {
                    i += length + 1;
                } else {
                    throw new IllegalStateException("token may not be longer than 63 bytes");
                }
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        return new C60582ui(strArr, (short) 0, i + 1);
    }

    public void A02(OutputStream outputStream) {
        for (String str : this.A02) {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            if (length <= 63) {
                outputStream.write(length);
                outputStream.write(bytes);
            } else {
                throw new IllegalStateException("token may not be longer than 63 bytes");
            }
        }
        short s = this.A01;
        if (s == 0) {
            outputStream.write(0);
            return;
        }
        outputStream.write(((s >>> 8) & 63) | 192);
        outputStream.write(s & 255);
    }
}
