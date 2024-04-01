package X;

/* renamed from: X.3qO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82363qO extends C00T {
    public final /* synthetic */ C86883yg A00;

    public C82363qO(C86883yg c86883yg) {
        this.A00 = c86883yg;
    }

    @Override // X.C00T
    public void A01(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 != null) {
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            String str = anonymousClass094.A01;
            C86883yg c86883yg = this.A00;
            AnonymousClass092 anonymousClass0922 = ((AbstractC86423xS) c86883yg).A04;
            if (anonymousClass0922 == null) {
                throw null;
            }
            if (str.equals(anonymousClass0922.A0n.A01) && anonymousClass094.A02) {
                c86883yg.A0S();
            }
        }
    }

    @Override // X.C00T
    public void A08(AnonymousClass092 anonymousClass092, int i) {
        if (anonymousClass092 != null) {
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            C86883yg c86883yg = this.A00;
            if (anonymousClass094.equals(((AbstractC86423xS) c86883yg).A04.A0n) && anonymousClass094.A02) {
                C018508q c018508q = c86883yg.A02;
                c018508q.A02.post(new RunnableEBaseShape1S0201000_I1(this, i, anonymousClass092, 6));
            }
        }
    }
}
