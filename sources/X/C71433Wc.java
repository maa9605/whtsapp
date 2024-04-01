package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;

/* renamed from: X.3Wc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C71433Wc extends AnimatorListenerAdapter {
    public final /* synthetic */ Interpolator A00;
    public final /* synthetic */ WallpaperPreview A01;

    public C71433Wc(WallpaperPreview wallpaperPreview, Interpolator interpolator) {
        this.A01 = wallpaperPreview;
        this.A00 = interpolator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        WallpaperPreview wallpaperPreview = this.A01;
        ViewPropertyAnimator alpha = wallpaperPreview.A05.animate().setDuration(250L).alpha(0.0f);
        Interpolator interpolator = this.A00;
        alpha.setInterpolator(interpolator);
        wallpaperPreview.A09.animate().setDuration(250L).alpha(0.0f).scaleX(wallpaperPreview.A00).scaleY(wallpaperPreview.A01).translationX(wallpaperPreview.A02).translationY(wallpaperPreview.A03).setInterpolator(interpolator).setListener(new AnimatorListenerAdapter() { // from class: X.3Wb
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                super.onAnimationCancel(animator2);
                C71433Wc.this.A01.finish();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                super.onAnimationEnd(animator2);
                C71433Wc.this.A01.finish();
            }
        });
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        WallpaperPreview wallpaperPreview = this.A01;
        ViewPropertyAnimator alpha = wallpaperPreview.A05.animate().setDuration(250L).alpha(0.0f);
        Interpolator interpolator = this.A00;
        alpha.setInterpolator(interpolator);
        wallpaperPreview.A09.animate().setDuration(250L).alpha(0.0f).scaleX(wallpaperPreview.A00).scaleY(wallpaperPreview.A01).translationX(wallpaperPreview.A02).translationY(wallpaperPreview.A03).setInterpolator(interpolator).setListener(new AnimatorListenerAdapter() { // from class: X.3Wa
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                super.onAnimationCancel(animator2);
                C71433Wc.this.A01.finish();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                super.onAnimationEnd(animator2);
                C71433Wc.this.A01.finish();
            }
        });
    }
}
