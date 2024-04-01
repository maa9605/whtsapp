package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2sQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C59232sQ extends HashMap<AnonymousClass094, AnonymousClass092> {
    public boolean finished;
    public final C018508q globalUI;
    public final C00T messageObserver;
    public final C00A messageObservers;

    public C59232sQ(C018508q c018508q, C00A c00a, C59232sQ c59232sQ, final InterfaceC59222sP interfaceC59222sP) {
        if (c59232sQ != null) {
            c59232sQ.A00();
        }
        this.globalUI = c018508q;
        this.messageObservers = c00a;
        this.finished = false;
        C00T c00t = new C00T() { // from class: X.39G
            @Override // X.C00T
            public void A0B(Collection collection, Map map, Map map2) {
                InterfaceC59222sP interfaceC59222sP2;
                C59232sQ c59232sQ2 = C59232sQ.this;
                if (c59232sQ2.finished) {
                    return;
                }
                boolean z = false;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass094 anonymousClass094 = ((AnonymousClass092) it.next()).A0n;
                    if (c59232sQ2.containsKey(anonymousClass094)) {
                        c59232sQ2.remove(anonymousClass094);
                        z = true;
                    }
                }
                if (!z || (interfaceC59222sP2 = interfaceC59222sP) == null) {
                    return;
                }
                interfaceC59222sP2.AOT();
            }
        };
        this.messageObserver = c00t;
        c00a.A01(c00t);
    }

    public void A00() {
        this.finished = true;
        C018508q c018508q = this.globalUI;
        c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(this, 21));
    }
}
