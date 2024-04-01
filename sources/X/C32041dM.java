package X;

import java.util.concurrent.Executor;

/* renamed from: X.1dM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32041dM implements C0AF, C0AG, C0AH, C19C {
    public final AnonymousClass191 A00;
    public final C0AD A01;
    public final Executor A02;

    public C32041dM(Executor executor, AnonymousClass191 anonymousClass191, C0AD c0ad) {
        this.A02 = executor;
        this.A00 = anonymousClass191;
        this.A01 = c0ad;
    }

    @Override // X.C0AF
    public final void AIG() {
        this.A01.A06();
    }

    @Override // X.C19C
    public final void AIm(final C0AC c0ac) {
        this.A02.execute(new Runnable() { // from class: X.196
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C32041dM c32041dM = C32041dM.this;
                    C0AC c0ac2 = (C0AC) c32041dM.A00.AVU(c0ac);
                    if (c0ac2 == null) {
                        c32041dM.A01.A08(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    Executor executor = C0AI.A01;
                    c0ac2.A02(executor, c32041dM);
                    c0ac2.A01(executor, c32041dM);
                    c0ac2.A00(executor, c32041dM);
                } catch (AnonymousClass193 e) {
                    if (e.getCause() instanceof Exception) {
                        C32041dM.this.A01.A08((Exception) e.getCause());
                    } else {
                        C32041dM.this.A01.A08(e);
                    }
                } catch (Exception e2) {
                    C32041dM.this.A01.A08(e2);
                }
            }
        });
    }

    @Override // X.C0AG
    public final void AKE(Exception exc) {
        this.A01.A08(exc);
    }

    @Override // X.C0AH
    public final void APH(Object obj) {
        this.A01.A09(obj);
    }
}
