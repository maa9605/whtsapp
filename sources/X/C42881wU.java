package X;

/* renamed from: X.1wU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42881wU {
    public double A00;
    public double A01;
    public double A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public final C01B A0E;
    public final String A0F;

    public C42881wU(C01B c01b, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A0E = c01b;
        this.A0F = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A08 = str4;
        this.A07 = str5;
        this.A0D = z;
        this.A0C = "Portal".equals(str4);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("WebSessionInfo{browserId='");
        C000200d.A1P(A0P, this.A0F, '\'', ", secret='");
        C000200d.A1P(A0P, this.A0A, '\'', ", token='");
        C000200d.A1P(A0P, this.A0B, '\'', ", os='");
        C000200d.A1P(A0P, this.A08, '\'', ", browserType='");
        C000200d.A1P(A0P, this.A07, '\'', ", lat=");
        A0P.append(this.A01);
        A0P.append(", lon=");
        A0P.append(this.A02);
        A0P.append(", accuracy=");
        A0P.append(this.A00);
        A0P.append(", placeName='");
        C000200d.A1P(A0P, this.A09, '\'', ", lastActive=");
        A0P.append(this.A04);
        A0P.append(", lastPushSent=");
        A0P.append(this.A05);
        A0P.append(", timeout=");
        A0P.append(this.A0D);
        A0P.append(", expiration=");
        A0P.append(this.A03);
        A0P.append('}');
        return A0P.toString();
    }
}
