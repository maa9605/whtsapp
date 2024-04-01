package X;

/* renamed from: X.2o5  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2o5 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C46O A00;
    public final /* synthetic */ C46P A01;
    public final /* synthetic */ C46R A02;
    public final /* synthetic */ C46T A03;

    public /* synthetic */ C2o5(C46T c46t, C46O c46o, C46P c46p, C46R c46r) {
        this.A03 = c46t;
        this.A00 = c46o;
        this.A01 = c46p;
        this.A02 = c46r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A03.A00(this.A00, this.A01, this.A02);
    }
}
