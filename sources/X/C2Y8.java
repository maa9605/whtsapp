package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.mentions.MentionPickerView;

/* renamed from: X.2Y8 */
/* loaded from: classes2.dex */
public abstract class C2Y8 extends C2Y9 {
    public int A00;
    public ValueAnimator A01;
    public View A02;
    public View A03;

    public abstract View getContentView();

    public C2Y8(Context context, AttributeSet attributeSet) {
        new WaFrameLayout(context, attributeSet) { // from class: X.2Y9
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC08310bE
            public void A00() {
                if (!(this instanceof C2Y7)) {
                    if (this.A00) {
                        return;
                    }
                    this.A00 = true;
                    generatedComponent();
                    return;
                }
                C2Y7 c2y7 = (C2Y7) this;
                if (c2y7.A00) {
                    return;
                }
                c2y7.A00 = true;
                ((AbstractC07960aN) c2y7.generatedComponent()).A1y((MentionPickerView) c2y7);
            }
        };
    }

    public final void A02() {
        if (this.A02 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getContentView().getLayoutParams();
        layoutParams.width = this.A02.getWidth();
        getContentView().setLayoutParams(layoutParams);
    }

    public void A03(final int i) {
        if (i == this.A00) {
            return;
        }
        this.A00 = i;
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(getVisibility() == 0 ? getHeight() : 0, i);
        this.A01 = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.2qp
            {
                C2Y8.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C2Y8 c2y8 = C2Y8.this;
                int intValue = ((Number) valueAnimator2.getAnimatedValue()).intValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2y8.getLayoutParams();
                layoutParams.height = intValue;
                c2y8.setLayoutParams(layoutParams);
            }
        });
        this.A01.addListener(new AnimatorListenerAdapter() { // from class: X.2r2
            {
                C2Y8.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C2Y8 c2y8 = C2Y8.this;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2y8.getLayoutParams();
                int i2 = i;
                layoutParams.height = i2;
                c2y8.setLayoutParams(layoutParams);
                if (i2 == 0) {
                    c2y8.setVisibility(8);
                    C2LT c2lt = ((MentionPickerView) c2y8).A0A;
                    if (c2lt != null) {
                        c2lt.AII(false);
                    }
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C2Y8 c2y8 = C2Y8.this;
                if (c2y8.getVisibility() != 0) {
                    c2y8.A02();
                    c2y8.setVisibility(0);
                    C2LT c2lt = ((MentionPickerView) c2y8).A0A;
                    if (c2lt != null) {
                        c2lt.AII(true);
                    }
                }
            }
        });
        this.A01.setDuration(250L);
        this.A01.start();
    }

    public void A04(int i, int i2) {
        if (i != 0) {
            int actionBarSize = getActionBarSize();
            Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i3 = point.y;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            View view = this.A03;
            if (view == null) {
                view = (View) getParent().getParent();
                this.A03 = view;
            }
            view.getLocationOnScreen(iArr2);
            double d = i2;
            int min = Math.min(((i3 / 2) - actionBarSize) - ((int) (1.25d * d)), ((getHeight() + iArr[1]) - iArr2[1]) - ((int) (0.6d * d))) / i2;
            if (i > min) {
                i2 = (min * i2) + ((int) (d * 0.5d));
            } else if (i <= 0 || min != 0) {
                i2 *= i;
            }
            if (i2 != 0) {
                A03(i2);
                return;
            }
        }
        if (getVisibility() == 0) {
            A03(0);
        }
    }

    private int getActionBarSize() {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16843499});
        try {
            return (int) obtainStyledAttributes.getDimension(0, 0.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.A02 != null && getVisibility() == 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2r3
                {
                    C2Y8.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    C2Y8 c2y8 = C2Y8.this;
                    c2y8.A02();
                    MentionPickerView mentionPickerView = (MentionPickerView) c2y8;
                    mentionPickerView.A04(mentionPickerView.A0C.A0C(), mentionPickerView.getResources().getDimensionPixelSize(R.dimen.mention_picker_row_height));
                    c2y8.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    public void setAnchorWidthView(View view) {
        this.A02 = view;
        A02();
    }

    public void setConstraintParentView(View view) {
        this.A03 = view;
    }
}
