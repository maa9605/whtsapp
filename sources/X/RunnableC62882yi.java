package X;

/* renamed from: X.2yi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC62882yi extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C04130Ir A02;
    public final /* synthetic */ C41771uU A03;
    public final /* synthetic */ C454622d A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ RunnableC62882yi(C41771uU c41771uU, long j, C454622d c454622d, boolean z, Integer num, int i, C04130Ir c04130Ir) {
        this.A03 = c41771uU;
        this.A01 = j;
        this.A04 = c454622d;
        this.A06 = z;
        this.A05 = num;
        this.A00 = i;
        this.A02 = c04130Ir;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A03.A04(this.A01, this.A04, this.A06, this.A05, this.A00, this.A02);
    }
}
