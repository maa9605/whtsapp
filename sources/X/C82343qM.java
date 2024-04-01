package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3qM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82343qM extends C00T {
    public boolean A00;
    public final /* synthetic */ C86873yf A01;

    public C82343qM(C86873yf c86873yf) {
        this.A01 = c86873yf;
    }

    @Override // X.C00T
    public void A08(AnonymousClass092 anonymousClass092, int i) {
        if (anonymousClass092 != null) {
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            C86873yf c86873yf = this.A01;
            if (!anonymousClass094.equals(((AbstractC86423xS) c86873yf).A04.A0n) || anonymousClass094.A02) {
                return;
            }
            C018508q c018508q = ((AbstractC53812hY) c86873yf).A09;
            c018508q.A02.post(new RunnableEBaseShape1S0201000_I1(this, i, anonymousClass092, 5));
        }
    }

    @Override // X.C00T
    public void A0B(Collection collection, Map map, Map map2) {
        C09H c09h;
        C86873yf c86873yf = this.A01;
        AnonymousClass092 anonymousClass092 = ((AbstractC86423xS) c86873yf).A04;
        AbstractC71693Xc abstractC71693Xc = ((AbstractC53812hY) c86873yf).A01;
        if (abstractC71693Xc == null) {
            abstractC71693Xc = new C82353qN();
            ((AbstractC53812hY) c86873yf).A01 = abstractC71693Xc;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass0922 = (AnonymousClass092) it.next();
            if (anonymousClass0922.A0n.equals(anonymousClass092.A0n)) {
                abstractC71693Xc.A04.setVisibility(8);
                anonymousClass092.A0r = true;
                if (!(anonymousClass0922 instanceof AnonymousClass097) || (c09h = ((AnonymousClass097) anonymousClass0922).A02) == null || c09h.A0P) {
                    return;
                }
                c86873yf.A0G();
                return;
            }
        }
    }
}
