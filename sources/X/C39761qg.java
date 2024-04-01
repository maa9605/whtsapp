package X;

/* renamed from: X.1qg */
/* loaded from: classes.dex */
public final class C39761qg extends AbstractC31511cO {
    public final C39801qk A00;

    public C39761qg(AnonymousClass176 anonymousClass176, AnonymousClass178 anonymousClass178) {
        super(anonymousClass176);
        C07K.A1P(anonymousClass178);
        this.A00 = new C39801qk(anonymousClass176, anonymousClass178);
    }

    @Override // X.AbstractC31511cO
    public final void A0D() {
        this.A00.A0B();
    }

    public final void A0E() {
        C13H.A00();
        C39801qk c39801qk = this.A00;
        if (c39801qk != null) {
            C13H.A00();
            if (((AnonymousClass174) c39801qk).A00.A03 != null) {
                c39801qk.A01 = System.currentTimeMillis();
                return;
            }
            throw null;
        }
        throw null;
    }
}
