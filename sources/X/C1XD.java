package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1XD  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1XD implements InterfaceC18780uJ {
    public static final C18640u4 A03 = new C18640u4(32);
    public int A00;
    public int A01;
    public final AtomicLong A02 = new AtomicLong(0);

    public C1XD(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public static C18790uK A00(InputStream inputStream, boolean z) {
        C18640u4 c18640u4 = A03;
        C18790uK c18790uK = (C18790uK) c18640u4.A00();
        if (c18790uK == null) {
            c18790uK = new C18790uK(new byte[C42271vT.A09], 0);
        }
        byte[] bArr = c18790uK.A02;
        int i = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, i, bArr.length - i);
                if (read == -1) {
                    break;
                }
                i += read;
                int length = bArr.length;
                if (i >= length) {
                    byte[] bArr2 = new byte[length << 1];
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                    bArr = bArr2;
                }
            } catch (IOException e) {
                if (!z || i == 0) {
                    c18640u4.A02(c18790uK);
                    if (z) {
                        C18680u8.A0P.A01();
                        return null;
                    }
                    throw e;
                }
            }
        }
        if (c18790uK.A02 != bArr) {
            c18640u4.A02(c18790uK);
            return new C18790uK(bArr, i);
        }
        c18790uK.A00 = i;
        return c18790uK;
    }

    public static void A01(C18790uK c18790uK) {
        if (c18790uK.A02.length == 131072) {
            c18790uK.A01 = null;
            A03.A02(c18790uK);
        }
    }
}
