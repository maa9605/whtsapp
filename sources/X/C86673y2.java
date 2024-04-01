package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.search.verification.client.R;

/* renamed from: X.3y2 */
/* loaded from: classes2.dex */
public class C86673y2 extends AbstractC84163tI {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public AnimatorSet A0P;
    public Bitmap A0Q;
    public Bitmap A0R;
    public Bitmap A0S;
    public Matrix A0T;
    public Paint A0U;
    public Paint A0V;
    public Paint A0W;
    public Paint A0X;
    public RectF A0Y;
    public RectF A0Z;
    public boolean A0a;
    public boolean A0b;

    public C86673y2(Context context) {
        super(context);
        this.A0a = false;
        this.A0I = getResources().getDimensionPixelSize(R.dimen.bouncing_lock_size_collapsed);
        this.A0M = getResources().getDimensionPixelSize(R.dimen.bouncing_lock_height_expanded);
        this.A0H = getResources().getDimensionPixelSize(R.dimen.bouncing_lock_border_size);
        this.A0F = getResources().getDimensionPixelSize(R.dimen.bouncing_lock_arrow_bounce_displacement);
        this.A0J = this.A0I >> 1;
        this.A0O = C02160Ac.A00(getContext(), R.color.bouncing_lock_lock_icon_unlocked);
        this.A0N = C02160Ac.A00(getContext(), R.color.bouncing_lock_icon_locked);
        this.A0G = C02160Ac.A00(getContext(), R.color.bouncing_lock_arrow_color);
        this.A0Y = new RectF();
        int A00 = C02160Ac.A00(getContext(), R.color.bouncing_lock_background_color);
        Paint paint = new Paint(1);
        this.A0V = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A0V.setColor(A00);
        this.A0Z = new RectF();
        int A002 = C02160Ac.A00(getContext(), R.color.bouncing_lock_border_color);
        Paint paint2 = new Paint(1);
        this.A0W = paint2;
        paint2.setColor(A002);
        this.A0W.setStyle(Paint.Style.STROKE);
        this.A0W.setStrokeWidth(this.A0H);
        Paint paint3 = new Paint(1);
        this.A0X = paint3;
        paint3.setFilterBitmap(true);
        Paint paint4 = new Paint(1);
        this.A0U = paint4;
        paint4.setFilterBitmap(true);
        this.A0U.setColorFilter(new PorterDuffColorFilter(this.A0G, PorterDuff.Mode.SRC_IN));
        this.A0S = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_shackle);
        this.A0R = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_body);
        this.A0Q = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_arrow);
        float height = this.A0S.getHeight() * 0.39f;
        this.A05 = height;
        this.A0B = height;
        float height2 = (this.A0I >> 1) - (this.A0S.getHeight() >> 1);
        this.A0D = height2;
        float height3 = (this.A0S.getHeight() * 0.9f) + height2;
        this.A0C = height3;
        this.A0A = height3 + this.A0R.getHeight() + getResources().getDimensionPixelSize(R.dimen.bouncing_lock_arrow_margin_top);
        this.A01 = this.A0B;
        this.A03 = -2.5f;
        this.A06 = this.A0Q.getHeight() + this.A0M;
        float height4 = this.A0S.getHeight() + this.A0M;
        this.A08 = height4;
        this.A07 = (this.A0S.getHeight() * 0.9f) + height4;
        this.A0T = new Matrix();
        A02();
        if (Build.VERSION.SDK_INT >= 21) {
            setElevation(getResources().getDimensionPixelSize(R.dimen.bouncing_lock_elevation));
            setClipToOutline(false);
            setOutlineProvider(new ViewOutlineProvider() { // from class: X.3bS
                {
                    C86673y2.this = this;
                }

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    C86673y2 c86673y2 = C86673y2.this;
                    outline.setAlpha(c86673y2.A0K / 255.0f);
                    Rect rect = new Rect();
                    c86673y2.A0Y.roundOut(rect);
                    outline.setRoundRect(rect, c86673y2.A0J);
                }
            });
        }
    }

    public void A00() {
        if (this.A0b) {
            if (this.A0a) {
                AnimatorSet animatorSet = this.A0P;
                if (animatorSet != null) {
                    animatorSet.end();
                    this.A0P.removeAllListeners();
                }
                this.A0P = null;
            }
            int alpha = (int) ((getAlpha() / 1.0f) * 200.0f);
            animate().setListener(null).cancel();
            animate().alpha(0.0f).setDuration(alpha).setListener(new AnimatorListenerAdapter() { // from class: X.3bQ
                {
                    C86673y2.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    C86673y2 c86673y2 = C86673y2.this;
                    c86673y2.setVisibility(4);
                    c86673y2.setAlpha(1.0f);
                    c86673y2.A02();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    C86673y2.this.A0b = false;
                }
            }).start();
        }
    }

    public final void A01() {
        postInvalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public final void A02() {
        this.A01 = this.A0B;
        this.A00 = this.A06;
        this.A04 = this.A08;
        this.A02 = this.A07;
        this.A0K = 0;
        this.A0L = this.A0M;
        this.A0E = 255;
        this.A09 = 0.0f;
        setTranslationY(0.0f);
        setScaleX(1.0f);
        setScaleY(1.0f);
        this.A0X.setColorFilter(new PorterDuffColorFilter(this.A0O, PorterDuff.Mode.SRC_IN));
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        setPivotY(getMeasuredHeight() >> 1);
        setPivotX(getMeasuredWidth() >> 1);
    }

    public final void A03() {
        if (this.A0a) {
            return;
        }
        this.A0P = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3bL
            {
                C86673y2.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C86673y2 c86673y2 = C86673y2.this;
                float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                c86673y2.A03 = (2.5f * floatValue) - 2.5f;
                float height = c86673y2.A0S.getHeight() * 0.39f * floatValue;
                c86673y2.A01 = c86673y2.A0B - height;
                c86673y2.A02 = c86673y2.A0C - height;
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(400L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3bK
            {
                C86673y2.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C86673y2 c86673y2 = C86673y2.this;
                float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                c86673y2.A00 = (c86673y2.A0A - (c86673y2.A0F * floatValue)) - Math.abs(c86673y2.A0B - c86673y2.A01);
                c86673y2.A01();
            }
        });
        this.A0P.playTogether(ofFloat, ofFloat2);
        this.A0P.addListener(new AnimatorListenerAdapter() { // from class: X.3bO
            {
                C86673y2.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                C86673y2.this.A0a = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C86673y2.this.A0a = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C86673y2.this.A0a = true;
            }
        });
        this.A0P.start();
    }

    public final void A04(long j, final Runnable runnable) {
        if (this.A0b) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3bJ
            {
                C86673y2.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C86673y2 c86673y2 = C86673y2.this;
                float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                float f = c86673y2.A06;
                c86673y2.A00 = ((c86673y2.A0A - f) * floatValue) + f;
                float f2 = c86673y2.A08;
                c86673y2.A04 = ((c86673y2.A0D - f2) * floatValue) + f2;
                float f3 = c86673y2.A07;
                c86673y2.A02 = ((c86673y2.A0C - f3) * floatValue) + f3;
                c86673y2.A0K = (int) (Math.min(1.0f, floatValue * 1.5f) * 255.0f);
                c86673y2.A01();
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.3bP
            {
                C86673y2.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C86673y2 c86673y2 = C86673y2.this;
                if (c86673y2.A09 < 0.15f) {
                    c86673y2.A03();
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    c86673y2.post(runnable2);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C86673y2 c86673y2 = C86673y2.this;
                c86673y2.setVisibility(0);
                c86673y2.A0b = true;
            }
        });
        ofFloat.start();
    }

    public int getCollapsedHeightPx() {
        return this.A0I;
    }

    public int getExpandedHeightPx() {
        return this.A0M;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2;
        super.onDraw(canvas);
        this.A0V.setAlpha(this.A0K);
        RectF rectF = this.A0Y;
        rectF.left = 0.0f;
        float f = (int) this.A01;
        rectF.top = f;
        rectF.right = 0.0f + this.A0I;
        rectF.bottom = f + this.A0L;
        float f2 = this.A0J;
        canvas.drawRoundRect(rectF, f2, f2, this.A0V);
        if (Build.VERSION.SDK_INT < 21) {
            RectF rectF2 = this.A0Z;
            RectF rectF3 = this.A0Y;
            float f3 = rectF3.left;
            float f4 = this.A0H >> 1;
            float f5 = f3 + f4;
            rectF2.left = f5;
            rectF2.top = rectF3.top + f4;
            float f6 = rectF3.right - f4;
            rectF2.right = f6;
            rectF2.bottom = rectF3.bottom - f4;
            float f7 = (f6 - f5) / 2.0f;
            canvas.drawRoundRect(rectF2, f7, f7, this.A0W);
        }
        float width = getWidth() >> 1;
        this.A0T.setTranslate(width - (this.A0S.getWidth() >> 1), this.A04);
        this.A0T.postRotate(this.A03, this.A0S.getWidth() >> 1, this.A0S.getHeight());
        canvas.drawBitmap(this.A0S, this.A0T, this.A0X);
        canvas.drawBitmap(this.A0R, width - (bitmap.getWidth() >> 1), this.A02, this.A0X);
        this.A0U.setAlpha(this.A0E);
        canvas.drawBitmap(this.A0Q, width - (bitmap2.getWidth() >> 1), this.A00, this.A0U);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.A0I, (int) (this.A0M + this.A05));
    }

    public void setPercentageLocked(float f) {
        C000700j.A09(f >= 0.0f, "Percentage must be >= 0.0");
        float min = Math.min(1.0f, f);
        if (this.A09 != min) {
            this.A09 = min;
            float f2 = this.A0M - this.A0I;
            float height = this.A0S.getHeight() * 0.39f;
            this.A0E = 255 - ((int) (Math.min(1.0f, min / 0.65f) * 255.0f));
            int i = this.A0M;
            this.A0L = Math.min(i, Math.max((int) (i - (f2 * min)), this.A0I));
            setTranslationY(Math.min(min, 1.0f) * (-f2));
            if (min >= 0.15f) {
                boolean z = this.A0a;
                if (z) {
                    if (z) {
                        AnimatorSet animatorSet = this.A0P;
                        if (animatorSet != null) {
                            animatorSet.end();
                            this.A0P.removeAllListeners();
                        }
                        this.A0P = null;
                    }
                    this.A01 = this.A0B;
                    this.A00 = this.A0A;
                }
                float min2 = Math.min(1.0f, min);
                this.A03 = (2.5f * min2) - 2.5f;
                this.A02 = this.A0C - (min2 * height);
                A01();
            } else if (!this.A0b || this.A0a) {
            } else {
                A03();
            }
        }
    }
}
