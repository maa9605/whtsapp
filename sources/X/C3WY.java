package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;

/* renamed from: X.3WY  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3WY extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Interpolator A01;
    public final /* synthetic */ C3WZ A02;

    public C3WY(C3WZ c3wz, View view, Interpolator interpolator) {
        this.A02 = c3wz;
        this.A00 = view;
        this.A01 = interpolator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        WallpaperPreview wallpaperPreview = this.A02.A04;
        wallpaperPreview.A06.setBackgroundColor(wallpaperPreview.getResources().getColor(R.color.primary_surface));
        wallpaperPreview.A0C = false;
        wallpaperPreview.A09.setScrollEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        WallpaperPreview wallpaperPreview = this.A02.A04;
        wallpaperPreview.A06.setBackgroundColor(wallpaperPreview.getResources().getColor(R.color.primary_surface));
        View view = this.A00;
        if (view != null) {
            view.animate().setDuration(250L).alpha(1.0f).translationY(0.0f).setInterpolator(this.A01);
        }
        wallpaperPreview.A07.animate().setDuration(250L).alpha(1.0f).setInterpolator(this.A01).setListener(new AnimatorListenerAdapter() { // from class: X.3WX
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                super.onAnimationCancel(animator2);
                WallpaperPreview wallpaperPreview2 = C3WY.this.A02.A04;
                wallpaperPreview2.A0C = false;
                wallpaperPreview2.A09.setScrollEnabled(true);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                super.onAnimationEnd(animator2);
                WallpaperPreview wallpaperPreview2 = C3WY.this.A02.A04;
                wallpaperPreview2.A0C = false;
                wallpaperPreview2.A09.setScrollEnabled(true);
            }
        });
    }
}
