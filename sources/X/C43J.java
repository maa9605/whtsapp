package X;

/* renamed from: X.43J  reason: invalid class name */
/* loaded from: classes3.dex */
public class C43J implements Runnable {
    public final /* synthetic */ C44V A00;
    public final /* synthetic */ Exception A01;

    public C43J(C44V c44v, Exception exc) {
        this.A00 = c44v;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A00(this.A01);
    }
}
