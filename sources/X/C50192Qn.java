package X;

/* renamed from: X.2Qn */
/* loaded from: classes2.dex */
public class C50192Qn extends C2Qo {
    public static volatile C50192Qn A01;
    public final C000500h A00;

    public C50192Qn(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C002301c c002301c, C0E7 c0e7, C000500h c000500h, C42331vZ c42331vZ, C50202Qp c50202Qp, C2Qq c2Qq, C50212Qr c50212Qr) {
        super(anonymousClass012, interfaceC002901k, anonymousClass011, c002301c, c42331vZ, c0e7, c50202Qp, c2Qq, c50212Qr);
        this.A00 = c000500h;
    }

    @Override // X.C2Qo
    public C61482wE A00() {
        if (this.A00.A00.getInt("emoji_search_algorithm_version", 0) == 2) {
            return super.A00();
        }
        return new C61482wE();
    }

    @Override // X.C2Qo
    public boolean A01(C61482wE c61482wE) {
        boolean A012 = super.A01(c61482wE);
        if (A012) {
            C000200d.A0g(this.A00, "emoji_search_algorithm_version", 2);
        }
        return A012;
    }
}
