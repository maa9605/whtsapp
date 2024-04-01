package X;

/* renamed from: X.3Mn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68943Mn {
    public C68993Ms A00;
    public byte[] A01;

    public C68943Mn(byte[] bArr, C68993Ms c68993Ms) {
        this.A01 = bArr;
        this.A00 = c68993Ms;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("WtCertificateEntry{certData=");
        A0P.append(C40841sx.A0U(this.A01));
        A0P.append(", wtExtensions=");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
