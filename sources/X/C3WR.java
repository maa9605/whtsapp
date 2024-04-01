package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* renamed from: X.3WR  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3WR extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Interpolator A02;
    public final /* synthetic */ C3WS A03;

    public C3WR(C3WS c3ws, Interpolator interpolator, View view, View view2) {
        this.A03 = c3ws;
        this.A02 = interpolator;
        this.A00 = view;
        this.A01 = view2;
    }

    public final void A00(View view) {
        if (view == null) {
            return;
        }
        view.animate().setDuration(250L).alpha(1.0f).translationY(0.0f).setInterpolator(this.A02).setListener(new AnimatorListenerAdapter() { // from class: X.3WQ
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                SolidColorWallpaperPreview solidColorWallpaperPreview = C3WR.this.A03.A04;
                solidColorWallpaperPreview.A0B = false;
                solidColorWallpaperPreview.A09.setScrollEnabled(true);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SolidColorWallpaperPreview solidColorWallpaperPreview = C3WR.this.A03.A04;
                solidColorWallpaperPreview.A0B = false;
                solidColorWallpaperPreview.A09.setScrollEnabled(true);
            }
        });
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A03.A04;
        solidColorWallpaperPreview.A05.setBackgroundColor(solidColorWallpaperPreview.getResources().getColor(R.color.white));
        solidColorWallpaperPreview.A0B = false;
        solidColorWallpaperPreview.A09.setScrollEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A03.A04;
        solidColorWallpaperPreview.A05.setBackgroundColor(solidColorWallpaperPreview.getResources().getColor(R.color.white));
        solidColorWallpaperPreview.A06.animate().setDuration(250L).alpha(1.0f).setInterpolator(this.A02);
        A00(this.A00);
        A00(this.A01);
    }
}
