package X;

/* renamed from: X.0RA  reason: invalid class name */
/* loaded from: classes.dex */
public class C0RA extends C0RB {
    public static volatile C0RA A01;
    public final C002601h A00;

    public C0RA(C002601h c002601h) {
        this.A00 = c002601h;
    }

    @Override // X.C0RB
    public void A00(AbstractC02800Cx abstractC02800Cx, C0BA c0ba) {
        this.A00.A05(c0ba, "paused");
    }

    @Override // X.C0RB
    public void A01(AbstractC02800Cx abstractC02800Cx, C0BA c0ba) {
        StringBuilder A0P = C000200d.A0P("resumed ");
        A0P.append(c0ba.A0j ? "visible" : "invisible");
        this.A00.A05(c0ba, A0P.toString());
    }
}
