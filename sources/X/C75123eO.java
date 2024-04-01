package X;

/* renamed from: X.3eO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C75123eO {
    public final int A00;
    public final int A01 = 7;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C75123eO(int i, String str, int i2, int i3, String str2, String str3) {
        this.A00 = i;
        this.A05 = str;
        this.A03 = i2;
        this.A02 = i3;
        this.A06 = str2;
        this.A04 = str3;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("WamsysMMSUploadRequest{mediaType=");
        A0P.append(this.A00);
        A0P.append(", filePath='");
        C000200d.A1P(A0P, this.A05, '\'', ", uploadType=");
        A0P.append(this.A03);
        A0P.append(", uploadOptions=");
        A0P.append(this.A02);
        A0P.append(", transferOptions=");
        A0P.append(this.A01);
        A0P.append(", loggingId='");
        C000200d.A1P(A0P, this.A06, '\'', ", connBlockJSONStr='");
        A0P.append(this.A04);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }
}
