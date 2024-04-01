package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0ke  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC13130ke implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewTreeObserver A00;
    public final View A01;
    public final Runnable A02;

    public View$OnAttachStateChangeListenerC13130ke(View view, Runnable runnable) {
        this.A01 = view;
        this.A00 = view.getViewTreeObserver();
        this.A02 = runnable;
    }

    public static void A00(View view, Runnable runnable) {
        if (view != null) {
            View$OnAttachStateChangeListenerC13130ke view$OnAttachStateChangeListenerC13130ke = new View$OnAttachStateChangeListenerC13130ke(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(view$OnAttachStateChangeListenerC13130ke);
            view.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC13130ke);
            return;
        }
        throw new NullPointerException("view == null");
    }

    public void A01() {
        if (this.A00.isAlive()) {
            this.A00.removeOnPreDrawListener(this);
        } else {
            this.A01.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.A01.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        A01();
        this.A02.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.A00 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        A01();
    }
}
