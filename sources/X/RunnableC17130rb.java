package X;

/* renamed from: X.0rb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC17130rb implements Runnable {
    public C16510qW A00;
    public C0OP A01;
    public String A02;

    public RunnableC17130rb(C0OP workManagerImpl, String workSpecId, C16510qW runtimeExtras) {
        this.A01 = workManagerImpl;
        this.A02 = workSpecId;
        this.A00 = runtimeExtras;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.A03.A05(this.A02, this.A00);
    }
}
