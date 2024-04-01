package X;

/* renamed from: X.2tS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC59812tS extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02 = 300.0f;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ C2KO A06;
    public final /* synthetic */ Runnable A07;

    public RunnableC59812tS(C2KO c2ko, long j, float f, float f2, float f3, float f4, Runnable runnable) {
        this.A06 = c2ko;
        this.A05 = j;
        this.A04 = f;
        this.A03 = f2;
        this.A00 = f3;
        this.A01 = f4;
        this.A07 = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        float f = this.A02;
        float min = Math.min(f, (float) (currentTimeMillis - this.A05));
        float f2 = this.A04;
        C2KO c2ko = this.A06;
        c2ko.A03((this.A03 * min) + f2, this.A00, this.A01);
        Runnable runnable = this.A07;
        if (runnable != null) {
            runnable.run();
        }
        if (min < f) {
            c2ko.A09.post(this);
        }
    }
}
