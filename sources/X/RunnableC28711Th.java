package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.1Th  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC28711Th extends AbstractC13990mB implements Runnable {
    public final CountDownLatch A00 = new CountDownLatch(1);
    public final /* synthetic */ AbstractC28721Ti A01;

    public RunnableC28711Th(AbstractC28721Ti abstractC28721Ti) {
        this.A01 = abstractC28721Ti;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.A09();
    }
}
