package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Sn */
/* loaded from: classes.dex */
public final class C28551Sn implements InterfaceFutureC09630eS {
    public final AbstractC28541Sm A00 = new AbstractC28541Sm() { // from class: X.1o2
        {
            C28551Sn.this = this;
        }

        @Override // X.AbstractC28541Sm
        public String A03() {
            C12090iq c12090iq = (C12090iq) C28551Sn.this.A01.get();
            if (c12090iq == null) {
                return "Completer object has been garbage collected, future will fail soon";
            }
            StringBuilder A0P = C000200d.A0P("tag=[");
            A0P.append(c12090iq.A02);
            A0P.append("]");
            return A0P.toString();
        }
    };
    public final WeakReference A01;

    public C28551Sn(C12090iq c12090iq) {
        this.A01 = new WeakReference(c12090iq);
    }

    @Override // X.InterfaceFutureC09630eS
    public void A5E(Runnable runnable, Executor executor) {
        this.A00.A5E(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C12090iq c12090iq = (C12090iq) this.A01.get();
        boolean cancel = this.A00.cancel(z);
        if (cancel && c12090iq != null) {
            c12090iq.A02 = null;
            c12090iq.A00 = null;
            c12090iq.A01.A07(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.A00.get();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.A00.value instanceof C12040il;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.A00.isDone();
    }

    public String toString() {
        return this.A00.toString();
    }
}
