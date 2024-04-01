package X;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.0jU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnPreDrawListenerC12470jU implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout A00;

    public ViewTreeObserver$OnPreDrawListenerC12470jU(CoordinatorLayout coordinatorLayout) {
        this.A00 = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.A00.A09(0);
        return true;
    }
}
