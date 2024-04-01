package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.0AE  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AE implements C0AF, C0AG, C0AH {
    public final CountDownLatch A00 = new CountDownLatch(1);

    @Override // X.C0AF
    public final void AIG() {
        this.A00.countDown();
    }

    @Override // X.C0AG
    public final void AKE(Exception exc) {
        this.A00.countDown();
    }

    @Override // X.C0AH
    public final void APH(Object obj) {
        this.A00.countDown();
    }
}
