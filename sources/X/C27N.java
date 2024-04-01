package X;

/* renamed from: X.27N  reason: invalid class name */
/* loaded from: classes2.dex */
public class C27N extends C451920u {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C27N(AbstractC000600i abstractC000600i, C01B c01b, int i, String str, byte[] bArr, String str2, String str3, String str4, String str5, int i2, int i3, long j) {
        super(abstractC000600i, c01b);
        super.A04 = 5;
        super.A00 = i;
        this.A07 = str;
        this.A0R = bArr;
        this.A05 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A06 = str5;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = j;
    }

    public static C27N A00(AbstractC000600i abstractC000600i, C01B c01b, int i) {
        return new C27N(abstractC000600i, c01b, i, null, null, null, null, null, null, 0, 0, 0L);
    }

    @Override // X.C20v
    public String toString() {
        StringBuilder A0P = C000200d.A0P("NonMessageMediaUploadResponse{directpath='");
        C000200d.A1P(A0P, this.A03, '\'', ", encFilehash='");
        C000200d.A1P(A0P, this.A04, '\'', ", mimeType='");
        C000200d.A1P(A0P, this.A06, '\'', ", mediaId='");
        C000200d.A1P(A0P, this.A05, '\'', ", width=");
        A0P.append(this.A01);
        A0P.append(", height=");
        A0P.append(this.A00);
        A0P.append(", size=");
        A0P.append(this.A02);
        A0P.append(", code=");
        A0P.append(super.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
