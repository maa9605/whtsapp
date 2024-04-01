package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.1UN  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1UN extends AbstractC04890Mh {
    public final C14610nI A00;

    public C1UN(AbstractC14780nZ abstractC14780nZ) {
        C1U9 c1u9 = new C1U9(this);
        C14560nD c14560nD = new C14560nD(abstractC14780nZ);
        Executor executor = c14560nD.A00;
        if (executor == null) {
            synchronized (C14560nD.A03) {
                if (C14560nD.A02 == null) {
                    C14560nD.A02 = Executors.newFixedThreadPool(2);
                }
            }
            executor = C14560nD.A02;
            c14560nD.A00 = executor;
        }
        this.A00 = new C14610nI(c1u9, new C14570nE(executor, c14560nD.A01));
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A00.A02.size();
    }

    public void A0G(List list) {
        C14610nI c14610nI = this.A00;
        int i = c14610nI.A00 + 1;
        c14610nI.A00 = i;
        List list2 = c14610nI.A01;
        if (list != list2) {
            if (list2 == null) {
                c14610nI.A01 = list;
                c14610nI.A02 = Collections.unmodifiableList(list);
                c14610nI.A04.AL5(0, list.size());
                return;
            }
            c14610nI.A03.A01.execute(new RunnableC14590nG(c14610nI, list2, list, i));
        }
    }
}
