package com.whatsapp.util;

import X.AbstractC83683sW;
import X.C000700j;
import X.ViewTreeObserver$OnPreDrawListenerC72513a7;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.FloatingChildLayout;

/* loaded from: classes2.dex */
public class FloatingChildLayout extends AbstractC83683sW {
    public static final boolean A09;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ValueAnimator A04;
    public Rect A05;
    public View.OnTouchListener A06;
    public View A07;
    public boolean A08;

    static {
        A09 = Build.VERSION.SDK_INT >= 21;
    }

    public FloatingChildLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = new Rect();
        this.A01 = 0;
        this.A04 = null;
        this.A03 = 0;
        Resources resources = getResources();
        this.A02 = resources.getDimensionPixelOffset(R.dimen.quick_contact_top_position);
        this.A00 = (resources.getInteger(17694720) * 11) / 10;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 127);
        this.A04 = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3Zt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FloatingChildLayout.this.setBackgroundColor(((Number) valueAnimator.getAnimatedValue()).intValue() << 24);
            }
        });
        super.setBackgroundDrawable(new ColorDrawable(0));
    }

    public static int A00(int i, int i2, int i3) {
        if (i2 > i3) {
            return (i3 - i2) >> 1;
        }
        return Math.min(Math.max(i, 0), i3 - i2);
    }

    public static void A01(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC72513a7(view, runnable));
    }

    public final void A02(final boolean z, final Runnable runnable) {
        float f;
        float width;
        int i;
        float f2 = 1.0f;
        if (z) {
            f = this.A05.width() / this.A07.getWidth();
            width = 1.0f;
        } else {
            f = 1.0f;
            width = this.A05.width() / this.A07.getWidth();
        }
        if (this.A08 && A09) {
            float sqrt = ((float) (Math.sqrt(2.0d) * Math.max(this.A07.getWidth(), this.A07.getHeight()))) / 2.0f;
            float min = Math.min(this.A07.getWidth(), this.A07.getHeight()) / 2.0f;
            if (!z) {
                min = sqrt;
                sqrt = min;
            }
            View view = this.A07;
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, view.getWidth() / 2, this.A07.getWidth() / 2, sqrt, min);
            createCircularReveal.setDuration(this.A00);
            if (z) {
                createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: X.3a4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        FloatingChildLayout.this.A07.setVisibility(4);
                    }
                });
            }
            createCircularReveal.start();
        }
        int[] iArr = new int[2];
        this.A07.getLocationOnScreen(iArr);
        int i2 = 0;
        Rect rect = this.A05;
        int i3 = rect.left - iArr[0];
        int i4 = rect.top - iArr[1];
        if (!z) {
            if (!A09) {
                this.A07.setAlpha(0.0f);
            }
            i2 = i3;
            i = 0;
            i3 = 0;
        } else {
            i = i4;
            i4 = 0;
        }
        this.A07.setTranslationX(i2);
        this.A07.setTranslationY(i4);
        this.A07.setPivotX(0.0f);
        this.A07.setPivotY(0.0f);
        this.A07.setScaleX(width);
        this.A07.setScaleY(width);
        ViewPropertyAnimator translationY = this.A07.animate().setDuration(this.A00).setInterpolator(AnimationUtils.loadInterpolator(getContext(), 17563654)).scaleX(f).scaleY(f).translationX(i3).translationY(i);
        if (z && !A09) {
            f2 = 0.0f;
        }
        translationY.alpha(f2).setListener(new AnimatorListenerAdapter() { // from class: X.3a5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                FloatingChildLayout floatingChildLayout = FloatingChildLayout.this;
                floatingChildLayout.A07.setLayerType(0, null);
                boolean z2 = z;
                int i5 = floatingChildLayout.A03;
                if (z2) {
                    if (i5 == 3) {
                        floatingChildLayout.A03 = 4;
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                } else if (i5 != 1) {
                } else {
                    floatingChildLayout.A03 = 2;
                    Runnable runnable3 = runnable;
                    if (runnable3 == null) {
                        return;
                    }
                    runnable3.run();
                }
            }
        });
    }

    public View getChild() {
        return this.A07;
    }

    private Rect getTargetInWindow() {
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect(this.A05);
        rect2.offset(-rect.left, -rect.top);
        return rect2;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(16908290);
        this.A07 = findViewById;
        findViewById.setDuplicateParentStateEnabled(true);
        if (A09) {
            return;
        }
        this.A07.setAlpha(0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.A07;
        Rect targetInWindow = getTargetInWindow();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (this.A02 != -1) {
            int i5 = this.A02;
            int A00 = A00((getWidth() - measuredWidth) >> 1, measuredWidth, getWidth());
            int A002 = A00(i5, measuredHeight, getHeight());
            view.layout(A00, A002, view.getMeasuredWidth() + A00, view.getMeasuredHeight() + A002);
            return;
        }
        int centerX = targetInWindow.centerX() - (measuredWidth >> 1);
        int centerY = targetInWindow.centerY() - Math.round(measuredHeight * 0.75f);
        int A003 = A00(centerX, measuredWidth, getWidth());
        int A004 = A00(centerY, measuredHeight, getHeight());
        view.layout(A003, A004, view.getMeasuredWidth() + A003, view.getMeasuredHeight() + A004);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.A06;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(this, motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        C000700j.A08(false, "don't setBackground(), it is managed internally");
    }

    public void setBackgroundColorAlpha(int i) {
        setBackgroundColor(i << 24);
    }

    public void setChildTargetScreen(Rect rect) {
        this.A05 = rect;
        requestLayout();
    }

    public void setCircularReveal(boolean z) {
        this.A08 = z;
    }

    public void setOnOutsideTouchListener(View.OnTouchListener onTouchListener) {
        this.A06 = onTouchListener;
    }
}
