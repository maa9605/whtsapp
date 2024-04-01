package X;

/* renamed from: X.0pM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC15800pM implements Runnable {
    public final /* synthetic */ C38381o3 A00;
    public final /* synthetic */ Runnable A01;

    public RunnableC15800pM(C38381o3 c38381o3, Runnable runnable) {
        this.A00 = c38381o3;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        C38381o3 c38381o3 = this.A00;
        if (c38381o3.value instanceof C12040il) {
            return;
        }
        try {
            this.A01.run();
            c38381o3.A07(null);
        } catch (Exception e) {
            c38381o3.A06(e);
        }
    }
}
