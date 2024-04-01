package X;

/* renamed from: X.0hR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC11250hR implements Runnable {
    public final /* synthetic */ C1SJ A00;

    public RunnableC11250hR(C1SJ c1sj) {
        this.A00 = c1sj;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1SJ c1sj = this.A00;
        C11150hH c11150hH = c1sj.A0E;
        if (c11150hH == null || !C0AT.A0g(c11150hH) || c1sj.A0E.getCount() <= c1sj.A0E.getChildCount() || c1sj.A0E.getChildCount() > Integer.MAX_VALUE) {
            return;
        }
        c1sj.A0D.setInputMethodMode(2);
        c1sj.AUa();
    }
}
