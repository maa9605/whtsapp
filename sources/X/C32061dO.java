package X;

import java.util.concurrent.Executor;

/* renamed from: X.1dO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32061dO implements C19C {
    public AnonymousClass192 A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C32061dO(Executor executor, AnonymousClass192 anonymousClass192) {
        this.A02 = executor;
        this.A00 = anonymousClass192;
    }

    @Override // X.C19C
    public final void AIm(final C0AC c0ac) {
        AnonymousClass192 anonymousClass192;
        synchronized (this.A01) {
            anonymousClass192 = this.A00;
        }
        if (anonymousClass192 == null) {
            return;
        }
        this.A02.execute(new Runnable() { // from class: X.198
            @Override // java.lang.Runnable
            public final void run() {
                C32061dO c32061dO = C32061dO.this;
                synchronized (c32061dO.A01) {
                    AnonymousClass192 anonymousClass1922 = c32061dO.A00;
                    if (anonymousClass1922 != null) {
                        anonymousClass1922.AIm(c0ac);
                    }
                }
            }
        });
    }
}
