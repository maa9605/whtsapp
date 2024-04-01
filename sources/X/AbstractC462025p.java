package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.search.IteratingPlayer;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.25p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC462025p extends AbstractC04890Mh {
    public boolean A01 = false;
    public HashSet A00 = new HashSet();
    public final AbstractC15200oF A02 = new AbstractC15200oF() { // from class: X.3Bs
        @Override // X.AbstractC15200oF
        public void A00(RecyclerView recyclerView, int i) {
            boolean z;
            AbstractC462025p abstractC462025p = AbstractC462025p.this;
            boolean z2 = abstractC462025p.A01;
            boolean z3 = i != 0;
            abstractC462025p.A01 = z3;
            if (z2 != z3) {
                Iterator it = abstractC462025p.A00.iterator();
                while (it.hasNext()) {
                    AbstractC09080cc abstractC09080cc = (AbstractC09080cc) it.next();
                    if (abstractC462025p.A01) {
                        abstractC09080cc.A0G(false);
                        abstractC09080cc.A0F(true);
                    } else {
                        if (abstractC462025p instanceof C461925o) {
                            IteratingPlayer iteratingPlayer = ((C461925o) abstractC462025p).A0c;
                            if (iteratingPlayer == null) {
                                throw null;
                            }
                            z = false;
                            if (abstractC09080cc.A01() == iteratingPlayer.A00) {
                                z = true;
                            }
                        } else {
                            z = true;
                        }
                        abstractC09080cc.A0G(z);
                        abstractC09080cc.A0F(false);
                    }
                }
            }
        }
    };

    @Override // X.AbstractC04890Mh
    public void A05(C0TS c0ts) {
        AbstractC09080cc abstractC09080cc = (AbstractC09080cc) c0ts;
        abstractC09080cc.A0C();
        this.A00.add(abstractC09080cc);
    }

    @Override // X.AbstractC04890Mh
    public void A06(C0TS c0ts) {
        AbstractC09080cc abstractC09080cc = (AbstractC09080cc) c0ts;
        abstractC09080cc.A0D();
        this.A00.remove(abstractC09080cc);
    }

    @Override // X.AbstractC04890Mh
    public void A07(C0TS c0ts) {
        ((AbstractC09080cc) c0ts).A0E();
    }

    @Override // X.AbstractC04890Mh
    public void A09(RecyclerView recyclerView) {
        if (!(this instanceof C461925o)) {
            recyclerView.A0m(this.A02);
            return;
        }
        C461925o c461925o = (C461925o) this;
        recyclerView.A0m(((AbstractC462025p) c461925o).A02);
        recyclerView.A0m(c461925o.A0c.A04);
        c461925o.A00 = recyclerView;
    }

    @Override // X.AbstractC04890Mh
    public void A0A(RecyclerView recyclerView) {
        if (!(this instanceof C461925o)) {
            recyclerView.A0n(this.A02);
            return;
        }
        C461925o c461925o = (C461925o) this;
        recyclerView.A0n(((AbstractC462025p) c461925o).A02);
        IteratingPlayer iteratingPlayer = c461925o.A0c;
        recyclerView.A0n(iteratingPlayer.A04);
        iteratingPlayer.A01();
        c461925o.A00 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
        if (r2 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0G(X.AbstractC09080cc r4) {
        /*
            r3 = this;
            boolean r0 = r3.A01
            if (r0 != 0) goto Ld
            r1 = r3
            boolean r0 = r3 instanceof X.C461925o
            if (r0 != 0) goto L17
            r2 = 1
        La:
            r0 = 1
            if (r2 != 0) goto Le
        Ld:
            r0 = 0
        Le:
            r4.A0G(r0)
            boolean r0 = r3.A01
            r4.A0F(r0)
            return
        L17:
            X.25o r1 = (X.C461925o) r1
            com.whatsapp.search.IteratingPlayer r0 = r1.A0c
            if (r0 == 0) goto L28
            int r1 = r4.A01()
            int r0 = r0.A00
            r2 = 0
            if (r1 != r0) goto La
            r2 = 1
            goto La
        L28:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC462025p.A0G(X.0cc):void");
    }
}
