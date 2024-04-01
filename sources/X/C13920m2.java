package X;

import android.os.Handler;

/* renamed from: X.0m2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13920m2 {
    public RunnableC13910m1 A00;
    public final Handler A01 = new Handler();
    public final C02520Bt A02;

    public C13920m2(InterfaceC02360Aw interfaceC02360Aw) {
        this.A02 = new C02520Bt(interfaceC02360Aw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0m1, java.lang.Runnable] */
    public final void A00(final C0C1 c0c1) {
        RunnableC13910m1 runnableC13910m1 = this.A00;
        if (runnableC13910m1 != null) {
            runnableC13910m1.run();
        }
        final C02520Bt c02520Bt = this.A02;
        ?? r1 = new Runnable(c02520Bt, c0c1) { // from class: X.0m1
            public boolean A00 = false;
            public final C0C1 A01;
            public final C02520Bt A02;

            {
                this.A02 = c02520Bt;
                this.A01 = c0c1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.A00) {
                    return;
                }
                this.A02.A05(this.A01);
                this.A00 = true;
            }
        };
        this.A00 = r1;
        this.A01.postAtFrontOfQueue(r1);
    }
}
