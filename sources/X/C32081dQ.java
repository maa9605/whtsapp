package X;

import java.util.concurrent.Executor;

/* renamed from: X.1dQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32081dQ implements C19C {
    public C0AH A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C32081dQ(Executor executor, C0AH c0ah) {
        this.A02 = executor;
        this.A00 = c0ah;
    }

    @Override // X.C19C
    public final void AIm(final C0AC c0ac) {
        C0AH c0ah;
        if (c0ac.A05()) {
            synchronized (this.A01) {
                c0ah = this.A00;
            }
            if (c0ah == null) {
                return;
            }
            this.A02.execute(new Runnable() { // from class: X.19A
                @Override // java.lang.Runnable
                public final void run() {
                    C32081dQ c32081dQ = C32081dQ.this;
                    synchronized (c32081dQ.A01) {
                        C0AH c0ah2 = c32081dQ.A00;
                        if (c0ah2 != null) {
                            c0ah2.APH(c0ac.A04());
                        }
                    }
                }
            });
        }
    }
}
