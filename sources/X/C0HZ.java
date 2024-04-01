package X;

import java.util.Arrays;

/* renamed from: X.0HZ  reason: invalid class name */
/* loaded from: classes.dex */
public class C0HZ {
    public final C03780Ha A00;
    public final byte[] A01;
    public final byte[] A02;

    public C0HZ(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.A00 = new C03780Ha(bArr, str, bArr2, bArr3, bArr5);
        this.A02 = bArr4;
        this.A01 = bArr6;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("BackupKey [");
        A0P.append(this.A00.toString());
        A0P.append(", hashedGoogleId=");
        A0P.append(Arrays.toString(this.A02));
        A0P.append(", cipherKey=");
        A0P.append(Arrays.toString(this.A01));
        A0P.append("]");
        return A0P.toString();
    }
}
