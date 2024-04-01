package X;

import java.io.ByteArrayInputStream;
import java.io.File;

/* renamed from: X.2CC  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2CC {
    public static volatile C2CC A01;
    public final C0F2 A00;

    public C2CC(C0F2 c0f2) {
        this.A00 = c0f2;
    }

    public File A00(String str) {
        File A03 = this.A00.A03();
        if (A03.exists() || A03.mkdirs()) {
            return new File(A03, C000200d.A0H(str, ".png"));
        }
        return null;
    }

    public File A01(byte[] bArr, C42531vt c42531vt) {
        File A00 = A00(c42531vt.A0D);
        if (A00 == null || !AnonymousClass024.A0i(new ByteArrayInputStream(bArr), A00)) {
            return null;
        }
        return A00;
    }
}
