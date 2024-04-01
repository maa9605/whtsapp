package X;

import java.util.concurrent.Executor;

/* renamed from: X.1dN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32051dN implements C19C {
    public C0AF A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C32051dN(Executor executor, C0AF c0af) {
        this.A02 = executor;
        this.A00 = c0af;
    }

    @Override // X.C19C
    public final void AIm(C0AC c0ac) {
        C0AF c0af;
        if (((C0AD) c0ac).A05) {
            synchronized (this.A01) {
                c0af = this.A00;
            }
            if (c0af == null) {
                return;
            }
            this.A02.execute(new Runnable() { // from class: X.197
                @Override // java.lang.Runnable
                public final void run() {
                    C32051dN c32051dN = C32051dN.this;
                    synchronized (c32051dN.A01) {
                        C0AF c0af2 = c32051dN.A00;
                        if (c0af2 != null) {
                            c0af2.AIG();
                        }
                    }
                }
            });
        }
    }
}
