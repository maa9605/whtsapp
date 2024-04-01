package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0wA */
/* loaded from: classes.dex */
public abstract class AbstractC19820wA extends PhantomReference {
    public AbstractC19820wA A00;
    public AbstractC19820wA A01;

    public abstract void destruct();

    public AbstractC19820wA() {
        super(null, C19850wD.A03);
    }

    public AbstractC19820wA(C19810w9 c19810w9) {
        super(null, C19850wD.A03);
    }

    public AbstractC19820wA(Object obj) {
        super(obj, C19850wD.A03);
        AtomicReference atomicReference;
        AbstractC19820wA abstractC19820wA;
        C19840wC c19840wC = C19850wD.A01;
        do {
            atomicReference = c19840wC.A00;
            abstractC19820wA = (AbstractC19820wA) atomicReference.get();
            this.A00 = abstractC19820wA;
        } while (!atomicReference.compareAndSet(abstractC19820wA, this));
    }
}
