package X;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.0lb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class animation.Animation$AnimationListenerC13650lb implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C0HE A01;
    public final /* synthetic */ C0BA A02;
    public final /* synthetic */ C0UN A03;

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }

    public animation.Animation$AnimationListenerC13650lb(ViewGroup viewGroup, C0BA c0ba, C0UN c0un, C0HE c0he) {
        this.A00 = viewGroup;
        this.A02 = c0ba;
        this.A03 = c0un;
        this.A01 = c0he;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.A00.post(new Runnable() { // from class: X.0la
            @Override // java.lang.Runnable
            public void run() {
                animation.Animation$AnimationListenerC13650lb animation_animation_animationlistenerc13650lb = animation.Animation$AnimationListenerC13650lb.this;
                C0BA c0ba = animation_animation_animationlistenerc13650lb.A02;
                C0XM c0xm = c0ba.A0C;
                if (c0xm == null || c0xm.A04 == null) {
                    return;
                }
                c0ba.A06().A04 = null;
                ((C0UM) animation_animation_animationlistenerc13650lb.A03).A00(c0ba, animation_animation_animationlistenerc13650lb.A01);
            }
        });
    }
}
