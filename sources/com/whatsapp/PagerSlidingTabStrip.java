package com.whatsapp;

import X.AbstractC07780Zw;
import X.C08510bc;
import X.C08540bf;
import X.C0AS;
import X.C0AT;
import X.C0Z8;
import X.C0ZT;
import X.C0ZU;
import X.C26841Ky;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.search.verification.client.R;
import com.whatsapp.PagerSlidingTabStrip;
import java.util.Locale;

/* loaded from: classes.dex */
public class PagerSlidingTabStrip extends AbstractC07780Zw {
    public static final int[] A0R = {16842901, 16842904};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public Paint A0H;
    public Paint A0I;
    public LinearLayout.LayoutParams A0J;
    public LinearLayout.LayoutParams A0K;
    public LinearLayout A0L;
    public C0Z8 A0M;
    public ViewPager A0N;
    public Locale A0O;
    public boolean A0P;
    public final C08510bc A0Q;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0bc] */
    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A0Q = new C0Z8() { // from class: X.0bc
            {
                PagerSlidingTabStrip.this = this;
            }

            @Override // X.C0Z8
            public void AMg(int i) {
                if (i == 0) {
                    PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                    PagerSlidingTabStrip.A00(pagerSlidingTabStrip, pagerSlidingTabStrip.A0N.getCurrentItem(), 0);
                }
                C0Z8 c0z8 = PagerSlidingTabStrip.this.A0M;
                if (c0z8 != null) {
                    c0z8.AMg(i);
                }
            }

            @Override // X.C0Z8
            public void AMh(int i, float f, int i2) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.A01 = i;
                pagerSlidingTabStrip.A00 = f;
                PagerSlidingTabStrip.A00(pagerSlidingTabStrip, i, (int) (pagerSlidingTabStrip.A0L.getChildAt(i).getWidth() * f));
                pagerSlidingTabStrip.invalidate();
                C0Z8 c0z8 = pagerSlidingTabStrip.A0M;
                if (c0z8 != null) {
                    c0z8.AMh(i, f, i2);
                }
            }

            @Override // X.C0Z8
            public void AMi(int i) {
                C0Z8 c0z8 = PagerSlidingTabStrip.this.A0M;
                if (c0z8 != null) {
                    c0z8.AMi(i);
                }
            }
        };
        this.A01 = 0;
        this.A00 = 0.0f;
        this.A05 = -10066330;
        this.A0F = 436207616;
        this.A02 = 436207616;
        this.A0P = true;
        this.A08 = 52;
        this.A06 = 3;
        this.A0G = 1;
        this.A03 = 12;
        this.A0B = 8;
        this.A04 = 1;
        this.A0D = 12;
        this.A0C = -10066330;
        this.A0E = 1;
        this.A07 = 0;
        this.A09 = R.drawable.background_tab;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout A01 = A01(context);
        this.A0L = A01;
        A01.setOrientation(0);
        this.A0L.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.A0L);
        C0AT.A0V(this.A0L, 2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A08 = (int) TypedValue.applyDimension(1, this.A08, displayMetrics);
        this.A06 = (int) TypedValue.applyDimension(1, this.A06, displayMetrics);
        this.A0G = (int) TypedValue.applyDimension(1, this.A0G, displayMetrics);
        this.A03 = (int) TypedValue.applyDimension(1, this.A03, displayMetrics);
        this.A0B = (int) TypedValue.applyDimension(1, this.A0B, displayMetrics);
        this.A04 = (int) TypedValue.applyDimension(1, this.A04, displayMetrics);
        this.A0D = (int) TypedValue.applyDimension(2, this.A0D, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0R);
        this.A0D = obtainStyledAttributes.getDimensionPixelSize(0, this.A0D);
        this.A0C = obtainStyledAttributes.getColor(1, this.A0C);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C08540bf.A1l);
        this.A05 = obtainStyledAttributes2.getColor(1, this.A05);
        this.A02 = obtainStyledAttributes2.getColor(0, this.A02);
        obtainStyledAttributes2.recycle();
        Paint paint = new Paint();
        this.A0I = paint;
        paint.setAntiAlias(true);
        this.A0I.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.A0H = paint2;
        paint2.setAntiAlias(true);
        this.A0H.setStrokeWidth(this.A04);
        this.A0J = new LinearLayout.LayoutParams(-2, -1);
        this.A0K = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.A0O == null) {
            this.A0O = getResources().getConfiguration().locale;
        }
    }

    public static void A00(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        if (pagerSlidingTabStrip.A0A != 0) {
            int left = pagerSlidingTabStrip.A0L.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= pagerSlidingTabStrip.A08;
            }
            if (left != pagerSlidingTabStrip.A07) {
                pagerSlidingTabStrip.A07 = left;
                pagerSlidingTabStrip.scrollTo(left, 0);
            }
        }
    }

    public LinearLayout A01(Context context) {
        return new LinearLayout(context);
    }

    public final void A02() {
        for (int i = 0; i < this.A0A; i++) {
            View childAt = this.A0L.getChildAt(i);
            childAt.setBackgroundResource(this.A09);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, this.A0D);
                textView.setTypeface(null, this.A0E);
                textView.setTextColor(this.A0C);
                textView.setAllCaps(true);
            }
        }
    }

    public void A03(final int i, View view) {
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() { // from class: X.1I7
            {
                PagerSlidingTabStrip.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.A0N.setCurrentItem(i);
            }
        });
        int i2 = this.A0B;
        view.setPadding(i2, 0, i2, 0);
        C0AT.A0c(view, new C0AS() { // from class: X.0cQ
            {
                PagerSlidingTabStrip.this = this;
            }

            @Override // X.C0AS
            public void A04(View view2, C08420bS c08420bS) {
                View.AccessibilityDelegate accessibilityDelegate = this.A01;
                AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                if (view2.isSelected()) {
                    c08420bS.A07(C08440bU.A01);
                    accessibilityNodeInfo.setClickable(false);
                }
                if (Build.VERSION.SDK_INT >= 22) {
                    view2.setAccessibilityTraversalBefore(PagerSlidingTabStrip.this.A0N.getId());
                }
            }
        });
        this.A0L.addView(view, i, this.A0P ? this.A0K : this.A0J);
    }

    public int getTextColor() {
        return this.A0C;
    }

    public int getTextSize() {
        return this.A0D;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (isInEditMode() || this.A0A == 0) {
            return;
        }
        int height = getHeight();
        this.A0I.setColor(this.A05);
        View childAt = this.A0L.getChildAt(this.A01);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.A00 > 0.0f && (i = this.A01) < this.A0A - 1) {
            View childAt2 = this.A0L.getChildAt(i + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f = this.A00;
            float f2 = 1.0f - f;
            left = (left * f2) + (left2 * f);
            right = (f2 * right) + (right2 * f);
        }
        float f3 = height;
        canvas.drawRect(left, height - this.A06, right, f3, this.A0I);
        this.A0I.setColor(this.A0F);
        canvas.drawRect(0.0f, height - this.A0G, this.A0L.getWidth(), f3, this.A0I);
        this.A0H.setColor(this.A02);
        for (int i2 = 0; i2 < this.A0A - 1; i2++) {
            View childAt3 = this.A0L.getChildAt(i2);
            canvas.drawLine(childAt3.getRight(), this.A03, childAt3.getRight(), height - this.A03, this.A0H);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C26841Ky c26841Ky = (C26841Ky) parcelable;
        super.onRestoreInstanceState(c26841Ky.getSuperState());
        this.A01 = c26841Ky.A00;
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        C26841Ky c26841Ky = new C26841Ky(super.onSaveInstanceState());
        c26841Ky.A00 = this.A01;
        return c26841Ky;
    }

    public void setOnPageChangeListener(C0Z8 c0z8) {
        this.A0M = c0z8;
    }

    public void setShouldExpand(boolean z) {
        this.A0P = z;
        requestLayout();
    }

    public void setTextColor(int i) {
        this.A0C = i;
        A02();
    }

    public void setTextSize(int i) {
        this.A0D = i;
        A02();
    }

    public void setViewPager(ViewPager viewPager) {
        this.A0N = viewPager;
        if (viewPager.A0V != null) {
            viewPager.A0W = this.A0Q;
            this.A0L.removeAllViews();
            this.A0A = this.A0N.A0V.A0B();
            for (int i = 0; i < this.A0A; i++) {
                C0ZT c0zt = this.A0N.A0V;
                if (c0zt instanceof C0ZU) {
                    A03(i, ((C0ZU) c0zt).ABr(i));
                } else {
                    String charSequence = c0zt.A03(i).toString();
                    TextView textView = new TextView(getContext());
                    textView.setText(charSequence);
                    textView.setGravity(17);
                    textView.setSingleLine();
                    A03(i, textView);
                }
            }
            A02();
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0cS
                {
                    PagerSlidingTabStrip.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                    pagerSlidingTabStrip.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int currentItem = pagerSlidingTabStrip.A0N.getCurrentItem();
                    pagerSlidingTabStrip.A01 = currentItem;
                    PagerSlidingTabStrip.A00(pagerSlidingTabStrip, currentItem, 0);
                }
            });
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
