package X;

import java.util.concurrent.Executor;

/* renamed from: X.1dP  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32071dP implements C19C {
    public C0AG A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C32071dP(Executor executor, C0AG c0ag) {
        this.A02 = executor;
        this.A00 = c0ag;
    }

    @Override // X.C19C
    public final void AIm(final C0AC c0ac) {
        C0AG c0ag;
        if (!c0ac.A05() && !((C0AD) c0ac).A05) {
            synchronized (this.A01) {
                c0ag = this.A00;
            }
            if (c0ag == null) {
                return;
            }
            this.A02.execute(new Runnable() { // from class: X.199
                @Override // java.lang.Runnable
                public final void run() {
                    C32071dP c32071dP = C32071dP.this;
                    synchronized (c32071dP.A01) {
                        C0AG c0ag2 = c32071dP.A00;
                        if (c0ag2 != null) {
                            c0ag2.AKE(c0ac.A03());
                        }
                    }
                }
            });
        }
    }
}
