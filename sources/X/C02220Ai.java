package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.0Ai  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C02220Ai {
    public static final Charset A00 = Charset.forName("UTF-8");
    public static final byte[] A01;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        A01 = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = A01;
        int length = bArr2.length;
        try {
            new C0RO(bArr2, 0, length, false).A04(length);
        } catch (C0JX e) {
            throw new IllegalArgumentException(e);
        }
    }
}
