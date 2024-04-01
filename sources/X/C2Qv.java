package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2Qv  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Qv {
    public int A00;
    public Charset A01;
    public byte[] A02;
    public int[] A03;

    public C2Qv(InputStream inputStream, List list) {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder("ParsedStringPack/byteArrayFromInputStream error: ");
                sb.append(e);
                C47362Ax.A00(sb.toString());
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray != null) {
            this.A02 = byteArray;
            int i2 = 11;
            if (byteArray.length < 11) {
                C47362Ax.A00("LoadedStringPack: header incomplete");
                return;
            }
            int A00 = A00(0);
            int A01 = A01(2);
            byte b = byteArray[6];
            Charset[] charsetArr = C47192Ag.A02;
            if (b >= charsetArr.length) {
                C47362Ax.A00("LoadedStringPack: unrecognized encoding");
            }
            this.A01 = charsetArr[b];
            int A012 = A01(7);
            this.A00 = A012;
            int length = this.A02.length;
            if (length >= A01 && length >= A012) {
                if (list.isEmpty()) {
                    C47362Ax.A00("LoadedStringPack: parentLocales is empty");
                    return;
                }
                int size = list.size();
                int[] iArr = new int[size];
                int i3 = 0;
                for (int i4 = 0; i4 < A00; i4++) {
                    byte[] bArr2 = this.A02;
                    if (bArr2[i2 + 2] == 0) {
                        i = 2;
                    } else {
                        i = 7;
                        if (bArr2[i2 + 5] == 0) {
                            i = 5;
                        }
                    }
                    int indexOf = list.indexOf(new String(bArr2, i2, i, C47192Ag.A01));
                    if (indexOf != -1) {
                        i3++;
                        iArr[indexOf] = i2;
                        if (i3 >= list.size()) {
                            break;
                        }
                    }
                    i2 += 11;
                }
                int[] iArr2 = new int[i3];
                this.A03 = iArr2;
                int i5 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    int i7 = iArr[i6];
                    if (i7 != 0) {
                        int A013 = A01(i7 + 7) + A01;
                        iArr2[i5] = A013;
                        int length2 = this.A02.length;
                        if (length2 < A013 + 4) {
                            C47362Ax.A00(String.format(Locale.US, "LoadedStringPack: header for locale incomplete, input.length=%d", Integer.valueOf(length2)));
                            return;
                        }
                        i5++;
                    }
                }
                return;
            }
            C47362Ax.A00(String.format(Locale.US, "LoadedStringPack: header incomplete, input.length=%d startOfLocaleData=%d startOfStringData=%d", Integer.valueOf(length), Integer.valueOf(A01), Integer.valueOf(A012)));
            return;
        }
        C47362Ax.A00("LoadedStringPack: could not read the language pack");
    }

    public final int A00(int i) {
        byte[] bArr = this.A02;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public final int A01(int i) {
        byte[] bArr = this.A02;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
