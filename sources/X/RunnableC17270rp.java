package X;

/* renamed from: X.0rp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC17270rp implements Runnable {
    public final AbstractC09620eR A00;
    public final InterfaceFutureC09630eS A01;

    public RunnableC17270rp(AbstractC09620eR owner, InterfaceFutureC09630eS future) {
        this.A00 = owner;
        this.A01 = future;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC09620eR abstractC09620eR = this.A00;
        if (abstractC09620eR.value != this) {
            return;
        }
        if (AbstractC09620eR.A00.A04(abstractC09620eR, this, AbstractC09620eR.A00(this.A01))) {
            AbstractC09620eR.A03(abstractC09620eR);
        }
    }
}
