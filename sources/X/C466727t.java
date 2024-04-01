package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.27t  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C466727t {
    public static final byte[] A01 = {71, 79, 65};
    public final InputStream A00;

    public C466727t(InputStream inputStream) {
        this.A00 = inputStream;
    }

    public final byte[] A00(int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i > 0) {
            int read = this.A00.read(bArr, i2, i);
            if (read == -1) {
                throw new IOException("Closed before read completed!");
            }
            i2 += read;
            i -= read;
        }
        return bArr;
    }
}
