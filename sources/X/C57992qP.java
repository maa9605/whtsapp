package X;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* renamed from: X.2qP  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C57992qP implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AbstractActivityC40691si A00;

    public C57992qP(AbstractActivityC40691si abstractActivityC40691si) {
        this.A00 = abstractActivityC40691si;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractActivityC40691si abstractActivityC40691si = this.A00;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) abstractActivityC40691si.A08.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, ((Number) valueAnimator.getAnimatedValue()).intValue(), layoutParams.rightMargin, layoutParams.bottomMargin);
        abstractActivityC40691si.A08.setLayoutParams(layoutParams);
    }
}
