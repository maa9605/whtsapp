package X;

/* renamed from: X.1OI  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1OI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0EO A01;
    public final /* synthetic */ AnonymousClass092 A02;

    public /* synthetic */ C1OI(C0EO c0eo, AnonymousClass092 anonymousClass092, int i) {
        this.A01 = c0eo;
        this.A02 = anonymousClass092;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A02(this.A02, this.A00);
    }
}
