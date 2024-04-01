package X;

/* renamed from: X.05j  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C010805j {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public C010805j(int i, int i2, byte[] bArr) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bArr;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("EncryptedMessage{ciphertextVersion=");
        A0P.append(this.A01);
        A0P.append(", ciphertextType=");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
