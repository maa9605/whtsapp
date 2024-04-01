package X;

import java.util.concurrent.Executor;

/* renamed from: X.1dL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32031dL implements C19C {
    public final AnonymousClass191 A00;
    public final C0AD A01;
    public final Executor A02;

    public C32031dL(Executor executor, AnonymousClass191 anonymousClass191, C0AD c0ad) {
        this.A02 = executor;
        this.A00 = anonymousClass191;
        this.A01 = c0ad;
    }

    @Override // X.C19C
    public final void AIm(final C0AC c0ac) {
        this.A02.execute(new Runnable() { // from class: X.195
            @Override // java.lang.Runnable
            public final void run() {
                C0AC c0ac2 = c0ac;
                if (((C0AD) c0ac2).A05) {
                    C32031dL.this.A01.A06();
                    return;
                }
                try {
                    C32031dL c32031dL = C32031dL.this;
                    c32031dL.A01.A09(c32031dL.A00.AVU(c0ac2));
                } catch (AnonymousClass193 e) {
                    if (e.getCause() instanceof Exception) {
                        C32031dL.this.A01.A08((Exception) e.getCause());
                    } else {
                        C32031dL.this.A01.A08(e);
                    }
                } catch (Exception e2) {
                    C32031dL.this.A01.A08(e2);
                }
            }
        });
    }
}
