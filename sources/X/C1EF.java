package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1EF  reason: invalid class name */
/* loaded from: classes.dex */
public class C1EF implements ValueAnimator.AnimatorUpdateListener {
    public final RecyclerView A00;
    public final C29831Yp A01;

    public C1EF(RecyclerView recyclerView, C29831Yp c29831Yp) {
        this.A00 = recyclerView;
        this.A01 = c29831Yp;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A00 = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        this.A00.invalidate();
    }
}
