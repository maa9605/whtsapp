package X;

/* renamed from: X.3Mr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68983Mr {
    public short A00;
    public byte[] A01;

    public C68983Mr(short s, byte[] bArr) {
        this.A00 = s;
        this.A01 = bArr;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("WtExtension{extensionType=");
        A0P.append((int) this.A00);
        A0P.append(", extensionData=");
        A0P.append(C40841sx.A0U(this.A01));
        A0P.append('}');
        return A0P.toString();
    }
}
