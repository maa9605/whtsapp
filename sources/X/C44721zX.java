package X;

/* renamed from: X.1zX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44721zX extends AbstractC44571zI {
    public final AnonymousClass012 A00;
    public final C05M A01;
    public final C0CB A02;

    public C44721zX(AnonymousClass012 anonymousClass012, C05M c05m, C0CB c0cb, C44351yv c44351yv) {
        super(c44351yv);
        this.A00 = anonymousClass012;
        this.A01 = c05m;
        this.A02 = c0cb;
    }

    public final void A08(C44731zY c44731zY) {
        if (c44731zY.A02) {
            long j = c44731zY.A00;
            if (j != -1) {
                j = this.A00.A06(j);
            }
            this.A02.A0R(c44731zY.A01, j, false);
            return;
        }
        C0CB c0cb = this.A02;
        AbstractC005302j abstractC005302j = c44731zY.A01;
        if (!c0cb.A0Q(abstractC005302j)) {
            return;
        }
        c0cb.A0P(abstractC005302j);
    }
}
