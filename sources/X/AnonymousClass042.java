package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.042 */
/* loaded from: classes.dex */
public abstract class AnonymousClass042 extends PhantomReference {
    public AnonymousClass042 next;
    public AnonymousClass042 previous;

    public abstract void destruct();

    public AnonymousClass042() {
        super(null, C06310Sn.A03);
    }

    public AnonymousClass042(Object obj) {
        super(obj, C06310Sn.A03);
        AtomicReference atomicReference;
        AnonymousClass042 anonymousClass042;
        C06320So c06320So = C06310Sn.A01;
        do {
            atomicReference = c06320So.A00;
            anonymousClass042 = (AnonymousClass042) atomicReference.get();
            this.next = anonymousClass042;
        } while (!atomicReference.compareAndSet(anonymousClass042, this));
    }
}
