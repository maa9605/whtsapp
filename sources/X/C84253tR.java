package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;

/* renamed from: X.3tR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84253tR extends C0DJ {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ C73453bf A04;

    public C84253tR(C73453bf c73453bf, View view, View view2, View view3, View view4) {
        this.A04 = c73453bf;
        this.A01 = view;
        this.A02 = view2;
        this.A03 = view3;
        this.A00 = view4;
    }

    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.A01.setVisibility(8);
        if (this.A04.A0S()) {
            this.A02.setVisibility(8);
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, -0.3f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(160L);
        RotateAnimation rotateAnimation = new RotateAnimation(-60.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(160L);
        rotateAnimation.setFillAfter(true);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation);
        this.A03.startAnimation(animationSet);
        View view = this.A02;
        view.postDelayed(new RunnableEBaseShape2S0300000_I1(this.A00, this, view, 8), 500L);
    }
}
