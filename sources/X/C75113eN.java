package X;

import java.util.Arrays;

/* renamed from: X.3eN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C75113eN {
    public final int A00;
    public final int A01;
    public final int A02 = 7;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final byte[] A08;
    public final byte[] A09;
    public final byte[] A0A;

    public C75113eN(int i, int i2, String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3, String str4, String str5) {
        this.A01 = i;
        this.A00 = i2;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A09 = bArr;
        this.A08 = bArr2;
        this.A0A = bArr3;
        this.A03 = str4;
        this.A05 = str5;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("WamsysMMSDownloadRequest{mediaType=");
        A0P.append(this.A01);
        A0P.append(", downloadMode=");
        A0P.append(this.A00);
        A0P.append(", transferOption=");
        A0P.append(this.A02);
        A0P.append(", temporaryFilePath='");
        C000200d.A1P(A0P, this.A07, '\'', ", outputFilePath='");
        C000200d.A1P(A0P, this.A06, '\'', ", directPath='");
        C000200d.A1P(A0P, this.A04, '\'', ", hashIdentifier=");
        A0P.append(Arrays.toString(this.A08));
        A0P.append(", plaintextHashIdentifier=");
        A0P.append(Arrays.toString(this.A0A));
        A0P.append(", connBlockJSONStr='");
        C000200d.A1P(A0P, this.A03, '\'', ", loggingIdentifier='");
        A0P.append(this.A05);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }
}
