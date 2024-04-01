package X;

import android.view.View;
import android.view.animation.AlphaAnimation;

/* renamed from: X.2xC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC62012xC extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ View A03;

    public /* synthetic */ RunnableC62012xC(View view, int i, float f, float f2) {
        this.A03 = view;
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A03;
        int i = this.A02;
        float f = this.A00;
        float f2 = this.A01;
        if (view.getVisibility() != i) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
            alphaAnimation.setDuration(200L);
            view.startAnimation(alphaAnimation);
            view.setVisibility(i);
        }
    }
}
