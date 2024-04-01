package X;

/* renamed from: X.3AA  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3AA extends C0HS {
    public final Runnable A00;

    public C3AA(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        Runnable runnable;
        if (!((Boolean) obj).booleanValue() || (runnable = this.A00) == null) {
            return;
        }
        runnable.run();
    }
}
