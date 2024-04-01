package X;

/* renamed from: X.1x5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC43241x5 implements Runnable, Comparable, C0CJ {
    public final Object A00;
    public final Object A01;
    public final Runnable A02;
    public volatile boolean A03 = false;
    public final /* synthetic */ AbstractC43161wx A04;

    public RunnableC43241x5(AbstractC43161wx abstractC43161wx, Object obj, Runnable runnable, Object obj2) {
        this.A04 = abstractC43161wx;
        this.A01 = obj;
        this.A02 = runnable;
        this.A00 = obj2;
    }

    @Override // X.C0CJ
    public void cancel() {
        Runnable runnable = this.A02;
        if (runnable instanceof C0CJ) {
            ((C0CJ) runnable).cancel();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        RunnableC43241x5 runnableC43241x5 = (RunnableC43241x5) obj;
        Runnable runnable = this.A02;
        if (runnable instanceof Comparable) {
            return ((Comparable) runnable).compareTo(runnableC43241x5.A02);
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.A03 = true;
            this.A02.run();
        } finally {
            this.A04.A05(this.A01, this);
            this.A03 = false;
        }
    }
}
