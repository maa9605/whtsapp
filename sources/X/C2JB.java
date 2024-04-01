package X;

import android.os.Handler;
import android.view.ViewTreeObserver;

/* renamed from: X.2JB  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2JB implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public final Runnable A01 = new RunnableEBaseShape1S0100000_I0_1(this, 48);
    public final /* synthetic */ C2GQ A02;

    public C2JB(C2GQ c2gq) {
        this.A02 = c2gq;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        C2GQ c2gq = this.A02;
        int width = c2gq.A01.getWidth();
        if (width == 0 || width == this.A00) {
            return;
        }
        this.A00 = width;
        C018508q c018508q = c2gq.A0I;
        Runnable runnable = this.A01;
        Handler handler = c018508q.A02;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }
}
