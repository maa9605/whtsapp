package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.1BP  reason: invalid class name */
/* loaded from: classes.dex */
public class C1BP extends LinearLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ValueAnimator A06;
    public final Paint A07;
    public final GradientDrawable A08;
    public final /* synthetic */ TabLayout A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BP(TabLayout tabLayout, Context context) {
        super(context);
        this.A09 = tabLayout;
        this.A05 = -1;
        this.A03 = -1;
        this.A01 = -1;
        this.A02 = -1;
        setWillNotDraw(false);
        this.A07 = new Paint();
        this.A08 = new GradientDrawable();
    }

    public final void A00() {
        int i;
        View childAt = getChildAt(this.A05);
        int i2 = -1;
        if (childAt == null || childAt.getWidth() <= 0) {
            i = -1;
        } else {
            int left = childAt.getLeft();
            i = childAt.getRight();
            TabLayout tabLayout = this.A09;
            if (!tabLayout.A0T && (childAt instanceof C1BR)) {
                RectF rectF = tabLayout.A0Z;
                A02((C1BR) childAt, rectF);
                left = (int) rectF.left;
                i = (int) rectF.right;
            }
            if (this.A00 > 0.0f && this.A05 < getChildCount() - 1) {
                View childAt2 = getChildAt(this.A05 + 1);
                int left2 = childAt2.getLeft();
                int right = childAt2.getRight();
                if (!tabLayout.A0T && (childAt2 instanceof C1BR)) {
                    RectF rectF2 = tabLayout.A0Z;
                    A02((C1BR) childAt2, rectF2);
                    left2 = (int) rectF2.left;
                    right = (int) rectF2.right;
                }
                float f = this.A00;
                float f2 = 1.0f - f;
                i2 = (int) ((left * f2) + (left2 * f));
                i = (int) ((f2 * i) + (right * f));
            } else {
                i2 = left;
            }
        }
        if (i2 != this.A01 || i != this.A02) {
            this.A01 = i2;
            this.A02 = i;
            postInvalidateOnAnimation();
        }
    }

    public void A01(final int i, int i2) {
        ValueAnimator valueAnimator = this.A06;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.A06.cancel();
        }
        View childAt = getChildAt(i);
        if (childAt == null) {
            A00();
            return;
        }
        final int left = childAt.getLeft();
        final int right = childAt.getRight();
        TabLayout tabLayout = this.A09;
        if (!tabLayout.A0T && (childAt instanceof C1BR)) {
            RectF rectF = tabLayout.A0Z;
            A02((C1BR) childAt, rectF);
            left = (int) rectF.left;
            right = (int) rectF.right;
        }
        final int i3 = this.A01;
        final int i4 = this.A02;
        if (i3 == left && i4 == right) {
            return;
        }
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.A06 = valueAnimator2;
        valueAnimator2.setInterpolator(C08580bj.A02);
        valueAnimator2.setDuration(i2);
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1BN
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                float animatedFraction = valueAnimator3.getAnimatedFraction();
                C1BP c1bp = C1BP.this;
                int i5 = i3;
                int round = Math.round((left - i5) * animatedFraction) + i5;
                int i6 = i4;
                int round2 = Math.round(animatedFraction * (right - i6)) + i6;
                if (round != c1bp.A01 || round2 != c1bp.A02) {
                    c1bp.A01 = round;
                    c1bp.A02 = round2;
                    c1bp.postInvalidateOnAnimation();
                }
            }
        });
        valueAnimator2.addListener(new AnimatorListenerAdapter() { // from class: X.1BO
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C1BP c1bp = C1BP.this;
                c1bp.A05 = i;
                c1bp.A00 = 0.0f;
            }
        });
        valueAnimator2.start();
    }

    public final void A02(C1BR c1br, RectF rectF) {
        int i = 0;
        View[] viewArr = {c1br.A03, c1br.A02, null};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getLeft());
                    i2 = Math.max(i2, view.getRight());
                } else {
                    i3 = view.getLeft();
                    i2 = view.getRight();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        int i4 = i2 - i3;
        TabLayout tabLayout = this.A09;
        if (i4 < tabLayout.A01(24)) {
            i4 = tabLayout.A01(24);
        }
        int right = (c1br.getRight() + c1br.getLeft()) / 2;
        int i5 = i4 / 2;
        rectF.set(right - i5, 0.0f, right + i5, 0.0f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        TabLayout tabLayout = this.A09;
        Drawable drawable = tabLayout.A0J;
        int i2 = 0;
        if (drawable != null) {
            i = drawable.getIntrinsicHeight();
        } else {
            i = 0;
        }
        int i3 = this.A04;
        if (i3 >= 0) {
            i = i3;
        }
        int i4 = tabLayout.A06;
        if (i4 == 0) {
            i2 = getHeight() - i;
            i = getHeight();
        } else if (i4 == 1) {
            i2 = (getHeight() - i) / 2;
            i = (getHeight() + i) >> 1;
        } else if (i4 != 2) {
            i = i4 != 3 ? 0 : getHeight();
        }
        int i5 = this.A01;
        if (i5 >= 0 && this.A02 > i5) {
            Drawable drawable2 = tabLayout.A0J;
            if (drawable2 == null) {
                drawable2 = this.A08;
            }
            Drawable A0I = C07O.A0I(drawable2);
            A0I.setBounds(this.A01, i2, this.A02, i);
            Paint paint = this.A07;
            if (paint != null) {
                int i6 = Build.VERSION.SDK_INT;
                int color = paint.getColor();
                if (i6 == 21) {
                    A0I.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                } else {
                    C07O.A0X(A0I, color);
                }
            }
            A0I.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.A06;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            A00();
            return;
        }
        this.A06.cancel();
        A01(this.A05, Math.round((1.0f - this.A06.getAnimatedFraction()) * ((float) this.A06.getDuration())));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.A09;
        if (tabLayout.A03 == 1 && tabLayout.A04 == 1) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (tabLayout.A01(16) << 1)) {
                boolean z = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i3;
                        layoutParams.weight = 0.0f;
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            } else {
                tabLayout.A04 = 0;
                tabLayout.A0G(false);
            }
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT >= 23 || this.A03 == i) {
            return;
        }
        requestLayout();
        this.A03 = i;
    }
}
