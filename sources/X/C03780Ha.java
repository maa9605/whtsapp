package X;

import java.util.Arrays;

/* renamed from: X.0Ha  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03780Ha {
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C03780Ha(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.A03 = bArr;
        this.A00 = str;
        this.A04 = bArr2;
        this.A02 = bArr3;
        this.A01 = bArr4;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("BackupCipher [cipherVersion=");
        A0P.append(Arrays.toString(this.A03));
        A0P.append(" keyVersion=");
        A0P.append(this.A00);
        A0P.append(", serverSalt=");
        A0P.append(Arrays.toString(this.A04));
        A0P.append(", googleIdSalt=");
        A0P.append(Arrays.toString(this.A02));
        A0P.append(", encryptionIv=");
        A0P.append(Arrays.toString(this.A01));
        A0P.append("]");
        return A0P.toString();
    }
}
