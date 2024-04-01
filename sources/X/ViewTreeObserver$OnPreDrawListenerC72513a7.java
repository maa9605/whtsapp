package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.3a7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserver$OnPreDrawListenerC72513a7 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Runnable A01;

    public ViewTreeObserver$OnPreDrawListenerC72513a7(View view, Runnable runnable) {
        this.A00 = view;
        this.A01 = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        this.A01.run();
        return true;
    }
}
