package X;

/* renamed from: X.2nc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC56602nc extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C45X A00;
    public final /* synthetic */ InterfaceC889445b A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ RunnableC56602nc(C45X c45x, String str, InterfaceC889445b interfaceC889445b) {
        this.A00 = c45x;
        this.A02 = str;
        this.A01 = interfaceC889445b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A01(this.A02, this.A01);
    }
}
