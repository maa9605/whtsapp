package X;

/* renamed from: X.2D5  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2D5 {
    public final C0JM A00;
    public final String A01;
    public final String A02;

    public C2D5(String str, String str2, C0JM c0jm) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = c0jm;
    }

    public void A00(C0JM c0jm) {
        C0JM c0jm2 = this.A00;
        c0jm2.A0E = c0jm.A0E;
        c0jm2.A07 = c0jm.A07;
        c0jm2.A05 = c0jm.A05;
        c0jm2.A0A = c0jm.A0A;
        c0jm2.A09 = c0jm.A09;
        c0jm2.A00 = c0jm.A00;
        c0jm2.A03 = c0jm.A03;
        c0jm2.A02 = c0jm.A02;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("RecentStickerIdentifier{fileHash='");
        C000200d.A1P(A0P, this.A01, '\'', ", imageHash='");
        C000200d.A1P(A0P, this.A02, '\'', ", sticker=");
        A0P.append(this.A00.toString());
        A0P.append('}');
        return A0P.toString();
    }
}
