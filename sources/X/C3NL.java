package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.3NL  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3NL implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C76933hO A00;

    public C3NL(C76933hO c76933hO) {
        this.A00 = c76933hO;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        C76933hO c76933hO = this.A00;
        View view = (View) c76933hO.A04;
        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (c76933hO.isShowing()) {
            return;
        }
        c76933hO.showAtLocation(view, 48, 0, 1000000);
    }
}
