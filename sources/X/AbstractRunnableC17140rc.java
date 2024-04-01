package X;

/* renamed from: X.0rc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC17140rc implements Runnable {
    public final C09610eQ A00 = new C09610eQ();

    public abstract Object A00();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.A00.A08(A00());
        } catch (Throwable th) {
            this.A00.A09(th);
        }
    }
}
