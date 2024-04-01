package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarViewLegacy;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarViewWave1;

/* renamed from: X.2Gn */
/* loaded from: classes2.dex */
public class C48752Gn {
    public static Animation A0D = new AlphaAnimation(1.0f, 0.0f);
    public static Animation A0E = new AlphaAnimation(0.0f, 1.0f);
    public C48792Gs A02;
    public C48742Gm A03;
    public boolean A04;
    public boolean A05;
    public final C3GQ A09;
    public final C48822Gw A0A;
    public final AbstractC48762Go A0B;
    public final boolean A0C;
    public final ValueAnimator A08 = ValueAnimator.ofFloat(0.8f, 1.0f);
    public float A00 = 1.0f;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -13381889;

    static {
        A0D.setDuration(300L);
        A0E.setDuration(300L);
    }

    public C48752Gn(AbstractC48762Go abstractC48762Go, C3GQ c3gq, C48822Gw c48822Gw) {
        this.A0A = c48822Gw;
        this.A0B = abstractC48762Go;
        this.A09 = c3gq;
        abstractC48762Go.A03(this);
        this.A0C = abstractC48762Go instanceof TitleBarViewWave1;
    }

    public int A00() {
        return ((Number) this.A0A.A03.A01()).intValue();
    }

    public void A01() {
        AbstractC48762Go abstractC48762Go = this.A0B;
        Animation animation = A0E;
        if (abstractC48762Go.A00.getVisibility() != 0) {
            abstractC48762Go.A00.setVisibility(0);
            abstractC48762Go.A00.startAnimation(animation);
        }
    }

    public void A02(float f) {
        this.A0A.A07(0);
        AbstractC48762Go abstractC48762Go = this.A0B;
        abstractC48762Go.setShapeToolDrawableStrokePreview(false);
        abstractC48762Go.setPenToolDrawableStrokePreview(false);
        abstractC48762Go.A05.setSelected(false);
        abstractC48762Go.A07.setSelected(false);
        abstractC48762Go.A06.setSelected(false);
        AnonymousClass302 anonymousClass302 = abstractC48762Go.A0C;
        anonymousClass302.A02 = f;
        anonymousClass302.A03 = 0;
        anonymousClass302.A01 = 1.0f;
        anonymousClass302.invalidateSelf();
        AnonymousClass302 anonymousClass3022 = abstractC48762Go.A0D;
        anonymousClass3022.A02 = f;
        anonymousClass3022.A03 = 0;
        anonymousClass3022.A01 = 1.0f;
        anonymousClass3022.invalidateSelf();
        AnonymousClass302 anonymousClass3023 = abstractC48762Go.A0B;
        anonymousClass3023.A02 = f;
        anonymousClass3023.A03 = 0;
        anonymousClass3023.A01 = 1.0f;
        anonymousClass3023.invalidateSelf();
        A08(false);
        this.A06 = true;
        this.A07 = true;
    }

    public void A03(final float f, final int i) {
        AbstractC48762Go abstractC48762Go = this.A0B;
        if (!(abstractC48762Go instanceof TitleBarViewLegacy) && i != 0) {
            if (abstractC48762Go instanceof TitleBarViewWave1) {
                if (!this.A06) {
                    AnonymousClass302 anonymousClass302 = abstractC48762Go.A0B;
                    anonymousClass302.A02 = f;
                    anonymousClass302.A03 = i;
                    anonymousClass302.A01 = 1.0f;
                    anonymousClass302.invalidateSelf();
                    return;
                }
                ValueAnimator valueAnimator = this.A08;
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.30i
                    {
                        C48752Gn.this = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        C48752Gn c48752Gn = C48752Gn.this;
                        float f2 = f;
                        int i2 = i;
                        AbstractC48762Go abstractC48762Go2 = c48752Gn.A0B;
                        float floatValue = ((Number) valueAnimator2.getAnimatedValue()).floatValue();
                        AnonymousClass302 anonymousClass3022 = abstractC48762Go2.A0B;
                        anonymousClass3022.A02 = f2;
                        anonymousClass3022.A03 = i2;
                        anonymousClass3022.A01 = floatValue;
                        anonymousClass3022.invalidateSelf();
                    }
                });
                valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.30m
                    {
                        C48752Gn.this = this;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        ValueAnimator valueAnimator2 = C48752Gn.this.A08;
                        valueAnimator2.removeAllUpdateListeners();
                        valueAnimator2.removeAllListeners();
                    }
                });
                valueAnimator.start();
                this.A06 = false;
                this.A07 = true;
                return;
            }
            return;
        }
        AnonymousClass302 anonymousClass3022 = abstractC48762Go.A0B;
        anonymousClass3022.A02 = f;
        anonymousClass3022.A03 = i;
        anonymousClass3022.A01 = 1.0f;
        anonymousClass3022.invalidateSelf();
    }

    public void A04(final float f, final int i) {
        AbstractC48762Go abstractC48762Go = this.A0B;
        if (abstractC48762Go instanceof TitleBarViewWave1) {
            if (this.A07 && i != 0) {
                ValueAnimator valueAnimator = this.A08;
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.30j
                    {
                        C48752Gn.this = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        C48752Gn c48752Gn = C48752Gn.this;
                        float f2 = f;
                        int i2 = i;
                        AbstractC48762Go abstractC48762Go2 = c48752Gn.A0B;
                        float floatValue = ((Number) valueAnimator2.getAnimatedValue()).floatValue();
                        AnonymousClass302 anonymousClass302 = abstractC48762Go2.A0C;
                        anonymousClass302.A02 = f2;
                        anonymousClass302.A03 = i2;
                        anonymousClass302.A01 = floatValue;
                        anonymousClass302.invalidateSelf();
                    }
                });
                valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.30l
                    {
                        C48752Gn.this = this;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        ValueAnimator valueAnimator2 = C48752Gn.this.A08;
                        valueAnimator2.removeAllUpdateListeners();
                        valueAnimator2.removeAllListeners();
                    }
                });
                valueAnimator.start();
                this.A06 = true;
                this.A07 = false;
                return;
            }
            AnonymousClass302 anonymousClass302 = abstractC48762Go.A0C;
            anonymousClass302.A02 = f;
            anonymousClass302.A03 = i;
            anonymousClass302.A01 = 1.0f;
            anonymousClass302.invalidateSelf();
        } else if (!(abstractC48762Go instanceof TitleBarViewLegacy)) {
        } else {
            AnonymousClass302 anonymousClass3022 = abstractC48762Go.A0C;
            anonymousClass3022.A02 = f;
            anonymousClass3022.A03 = i;
            anonymousClass3022.A01 = 1.0f;
            anonymousClass3022.invalidateSelf();
        }
    }

    public void A05(float f, int i, boolean z, boolean z2) {
        this.A04 = z;
        this.A01 = i;
        this.A00 = f;
        boolean z3 = false;
        this.A06 = false;
        this.A07 = false;
        int A00 = A00();
        if (A00 != 0) {
            if (A00 == 1) {
                A03(f, i);
                this.A0B.setPenToolDrawableStrokePreview(z);
                return;
            } else if (A00 == 2) {
                A04(f, i);
                if (z && z2) {
                    z3 = true;
                }
                this.A0B.setShapeToolDrawableStrokePreview(z3);
                return;
            } else if (A00 != 3) {
                return;
            }
        }
        A02(f);
    }

    public void A06(int i) {
        A08(false);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 5) {
                            A08(true);
                        } else {
                            return;
                        }
                    }
                }
                float f = this.A00;
                A04(f, this.A01);
                AbstractC48762Go abstractC48762Go = this.A0B;
                AnonymousClass302 anonymousClass302 = abstractC48762Go.A0D;
                anonymousClass302.A02 = f;
                anonymousClass302.A03 = 0;
                anonymousClass302.A01 = 1.0f;
                anonymousClass302.invalidateSelf();
                AnonymousClass302 anonymousClass3022 = abstractC48762Go.A0B;
                anonymousClass3022.A02 = f;
                anonymousClass3022.A03 = 0;
                anonymousClass3022.A01 = 1.0f;
                anonymousClass3022.invalidateSelf();
                abstractC48762Go.A06.setSelected(true);
                this.A06 = true;
                this.A07 = false;
                return;
            }
            float f2 = this.A00;
            int i2 = this.A01;
            boolean z = this.A04;
            A03(f2, i2);
            AbstractC48762Go abstractC48762Go2 = this.A0B;
            AnonymousClass302 anonymousClass3023 = abstractC48762Go2.A0C;
            anonymousClass3023.A02 = f2;
            anonymousClass3023.A03 = 0;
            anonymousClass3023.A01 = 1.0f;
            anonymousClass3023.invalidateSelf();
            AnonymousClass302 anonymousClass3024 = abstractC48762Go2.A0D;
            anonymousClass3024.A02 = f2;
            anonymousClass3024.A03 = 0;
            anonymousClass3024.A01 = 1.0f;
            anonymousClass3024.invalidateSelf();
            abstractC48762Go2.setPenToolDrawableStrokePreview(z);
            abstractC48762Go2.A05.setSelected(true);
            this.A06 = false;
            this.A07 = true;
            return;
        }
        A02(this.A00);
    }

    public void A07(int i) {
        if (i == 2 && A00() == 2) {
            A04(this.A00, this.A01);
            return;
        }
        C48822Gw c48822Gw = this.A0A;
        if (A00() == i) {
            i = 0;
        }
        c48822Gw.A07(i);
    }

    public void A08(boolean z) {
        int i;
        AbstractC48762Go abstractC48762Go = this.A0B;
        if (abstractC48762Go instanceof TitleBarViewWave1) {
            i = R.drawable.ic_cam_close;
            if (z) {
                i = R.drawable.ic_cam_back;
            }
        } else {
            i = R.drawable.ic_cam_back;
        }
        abstractC48762Go.setBackButtonDrawable(i);
    }

    public void A09(boolean z, boolean z2) {
        if (z) {
            AbstractC48762Go abstractC48762Go = this.A0B;
            RelativeLayout relativeLayout = abstractC48762Go.A08;
            View startingViewFromToolbarExtra = abstractC48762Go.getStartingViewFromToolbarExtra();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.addRule(!z2 ? 1 : 0, startingViewFromToolbarExtra.getId());
            relativeLayout.setLayoutParams(layoutParams);
        }
    }
}
