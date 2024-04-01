package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;

/* renamed from: X.38a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C656538a extends C0DJ {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C58862rp A01;

    public C656538a(View view, C58862rp c58862rp) {
        this.A00 = view;
        this.A01 = c58862rp;
    }

    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        View view = this.A00;
        view.getLayoutParams().width = -2;
        view.requestLayout();
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2ro
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C656538a c656538a = C656538a.this;
                c656538a.A00.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                C58862rp c58862rp = c656538a.A01;
                c58862rp.A00 = -1;
                c58862rp.invalidateSelf();
            }
        });
        view.clearAnimation();
    }
}
