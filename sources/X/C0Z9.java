package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.util.Pair;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;

/* renamed from: X.0Z9  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Z9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ HomeActivity A00;

    public C0Z9(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HomeActivity homeActivity = this.A00;
        int dimensionPixelSize = homeActivity.getResources().getDimensionPixelSize(R.dimen.tab_height) + homeActivity.A1P();
        if (homeActivity.A05 != null) {
            return;
        }
        int i9 = i4 - dimensionPixelSize;
        int i10 = i4 - i2;
        Pair A02 = HomeActivity.A02(HomeActivity.A1x, Math.abs(i3 - i), i10, i10);
        Animator A1R = homeActivity.A1R(i9);
        Animator A1S = homeActivity.A1S(homeActivity.A09.getHeight(), i4, true);
        AnimatorSet animatorSet = new AnimatorSet();
        homeActivity.A05 = animatorSet;
        animatorSet.setStartDelay(((Number) A02.second).intValue());
        homeActivity.A05.setDuration(((Number) A02.first).intValue());
        homeActivity.A05.setInterpolator(homeActivity.A1n);
        homeActivity.A05.playTogether(A1S, A1R);
        homeActivity.A05.addListener(new AnimatorListenerAdapter() { // from class: X.1Km
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                HomeActivity homeActivity2 = C0Z9.this.A00;
                View view2 = homeActivity2.A0C;
                if (view2 != null) {
                    view2.removeOnLayoutChangeListener(homeActivity2.A07);
                    homeActivity2.A05.removeAllListeners();
                    homeActivity2.A05 = null;
                }
            }
        });
        homeActivity.A05.start();
    }
}
