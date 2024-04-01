package X;

/* renamed from: X.12q  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC224912q implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass136 A04;

    public /* synthetic */ RunnableC224912q(AnonymousClass136 anonymousClass136, int i, int i2, int i3, float f) {
        this.A04 = anonymousClass136;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass136 anonymousClass136 = this.A04;
        anonymousClass136.A01.AQN(this.A01, this.A02, this.A03, this.A00);
    }
}
