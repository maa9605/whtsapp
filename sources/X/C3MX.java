package X;

/* renamed from: X.3MX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3MX {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public C3MX(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.A02 = (byte[]) bArr.clone();
        }
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("WtWriteParams{offset=");
        A0P.append(this.A01);
        A0P.append(", len=");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
