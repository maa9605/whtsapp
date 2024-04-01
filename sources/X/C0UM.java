package X;

import java.util.AbstractCollection;
import java.util.HashSet;

/* renamed from: X.0UM  reason: invalid class name */
/* loaded from: classes.dex */
public class C0UM implements C0UN {
    public final /* synthetic */ AbstractC02800Cx A00;

    public C0UM(AbstractC02800Cx abstractC02800Cx) {
        this.A00 = abstractC02800Cx;
    }

    public void A00(C0BA c0ba, C0HE c0he) {
        if (c0he.A03()) {
            return;
        }
        AbstractC02800Cx abstractC02800Cx = this.A00;
        AbstractCollection abstractCollection = (AbstractCollection) abstractC02800Cx.A0G.get(c0ba);
        if (abstractCollection != null && abstractCollection.remove(c0he) && abstractCollection.isEmpty()) {
            abstractC02800Cx.A0G.remove(c0ba);
            if (c0ba.A04 < 3) {
                abstractC02800Cx.A0Z(c0ba);
                C0XM c0xm = c0ba.A0C;
                abstractC02800Cx.A0c(c0ba, c0xm == null ? 0 : c0xm.A02);
            }
        }
    }

    public void A01(C0BA c0ba, C0HE c0he) {
        AbstractC02800Cx abstractC02800Cx = this.A00;
        if (abstractC02800Cx.A0G.get(c0ba) == null) {
            abstractC02800Cx.A0G.put(c0ba, new HashSet());
        }
        ((AbstractCollection) abstractC02800Cx.A0G.get(c0ba)).add(c0he);
    }
}
