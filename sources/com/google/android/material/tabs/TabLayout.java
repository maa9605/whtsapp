package com.google.android.material.tabs;

import X.AnonymousClass088;
import X.C08550bg;
import X.C08560bh;
import X.C08580bj;
import X.C09L;
import X.C0AT;
import X.C0UY;
import X.C0ZT;
import X.C13040kV;
import X.C1BP;
import X.C1BQ;
import X.C1BR;
import X.C1TK;
import X.C32801el;
import X.C32811em;
import X.InterfaceC08320bF;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ViewPager.DecorView
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final C13040kV A0e = new C1TK(16);
    public float A00;
    public float A01;
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
    public ValueAnimator A0D;
    public ColorStateList A0E;
    public ColorStateList A0F;
    public ColorStateList A0G;
    public DataSetObserver A0H;
    public PorterDuff.Mode A0I;
    public Drawable A0J;
    public C0ZT A0K;
    public ViewPager A0L;
    public C32801el A0M;
    public InterfaceC08320bF A0N;
    public InterfaceC08320bF A0O;
    public C1BQ A0P;
    public C32811em A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final int A0Y;
    public final RectF A0Z;
    public final C13040kV A0a;
    public final C1BP A0b;
    public final ArrayList A0c;
    public final ArrayList A0d;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.tabStyle);
        this.A0d = new ArrayList();
        this.A0Z = new RectF();
        this.A07 = Integer.MAX_VALUE;
        this.A0c = new ArrayList();
        this.A0a = new C13040kV(12);
        setHorizontalScrollBarEnabled(false);
        C1BP c1bp = new C1BP(this, context);
        this.A0b = c1bp;
        super.addView(c1bp, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray A00 = C08560bh.A00(context, attributeSet, C08550bg.A0v, R.attr.tabStyle, 2131952452, 22);
        C1BP c1bp2 = this.A0b;
        int dimensionPixelSize = A00.getDimensionPixelSize(10, -1);
        if (c1bp2.A04 != dimensionPixelSize) {
            c1bp2.A04 = dimensionPixelSize;
            c1bp2.postInvalidateOnAnimation();
        }
        C1BP c1bp3 = this.A0b;
        int color = A00.getColor(7, 0);
        Paint paint = c1bp3.A07;
        if (paint.getColor() != color) {
            paint.setColor(color);
            c1bp3.postInvalidateOnAnimation();
        }
        setSelectedTabIndicator(AnonymousClass088.A0O(context, A00, 5));
        setSelectedTabIndicatorGravity(A00.getInt(9, 0));
        setTabIndicatorFullWidth(A00.getBoolean(8, true));
        int dimensionPixelSize2 = A00.getDimensionPixelSize(15, 0);
        this.A08 = dimensionPixelSize2;
        this.A09 = dimensionPixelSize2;
        this.A0B = dimensionPixelSize2;
        this.A0A = dimensionPixelSize2;
        this.A0A = A00.getDimensionPixelSize(18, dimensionPixelSize2);
        this.A0B = A00.getDimensionPixelSize(19, this.A0B);
        this.A09 = A00.getDimensionPixelSize(17, this.A09);
        this.A08 = A00.getDimensionPixelSize(16, this.A08);
        int resourceId = A00.getResourceId(22, 2131952170);
        this.A0C = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, C0UY.A0b);
        try {
            this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.A0G = AnonymousClass088.A0L(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (A00.hasValue(23)) {
                this.A0G = AnonymousClass088.A0L(context, A00, 23);
            }
            if (A00.hasValue(21)) {
                this.A0G = A00(this.A0G.getDefaultColor(), A00.getColor(21, 0));
            }
            this.A0E = AnonymousClass088.A0L(context, A00, 3);
            this.A0I = AnonymousClass088.A0N(A00.getInt(4, -1), null);
            this.A0F = AnonymousClass088.A0L(context, A00, 20);
            this.A05 = A00.getInt(6, 300);
            this.A0W = A00.getDimensionPixelSize(13, -1);
            this.A0V = A00.getDimensionPixelSize(12, -1);
            this.A0Y = A00.getResourceId(0, 0);
            this.A02 = A00.getDimensionPixelSize(1, 0);
            this.A03 = A00.getInt(14, 1);
            this.A04 = A00.getInt(2, 0);
            this.A0R = A00.getBoolean(11, false);
            this.A0U = A00.getBoolean(24, false);
            A00.recycle();
            Resources resources = getResources();
            this.A00 = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.A0X = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            A07();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static ColorStateList A00(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public int A01(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final int A02(int i, float f) {
        View view;
        int i2;
        if (this.A03 == 0) {
            C1BP c1bp = this.A0b;
            View childAt = c1bp.getChildAt(i);
            int i3 = i + 1;
            if (i3 < c1bp.getChildCount()) {
                view = c1bp.getChildAt(i3);
            } else {
                view = null;
            }
            if (childAt != null) {
                i2 = childAt.getWidth();
            } else {
                i2 = 0;
            }
            int width = view != null ? view.getWidth() : 0;
            int left = ((i2 >> 1) + childAt.getLeft()) - (getWidth() >> 1);
            int i4 = (int) ((i2 + width) * 0.5f * f);
            return C0AT.A05(this) == 0 ? left + i4 : left - i4;
        }
        return 0;
    }

    public C1BQ A03() {
        C1BR c1br;
        C1BQ c1bq = (C1BQ) A0e.A00();
        if (c1bq == null) {
            c1bq = new C1BQ();
        }
        c1bq.A02 = this;
        C13040kV c13040kV = this.A0a;
        if (c13040kV == null || (c1br = (C1BR) c13040kV.A00()) == null) {
            c1br = new C1BR(this, getContext());
        }
        if (c1bq != c1br.A04) {
            c1br.A04 = c1bq;
            c1br.A00();
        }
        c1br.setFocusable(true);
        c1br.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c1bq.A03)) {
            c1br.setContentDescription(c1bq.A04);
        } else {
            c1br.setContentDescription(c1bq.A03);
        }
        c1bq.A01 = c1br;
        return c1bq;
    }

    public C1BQ A04(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.A0d;
            if (i < arrayList.size()) {
                return (C1BQ) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    public void A05() {
        int currentItem;
        A06();
        C0ZT c0zt = this.A0K;
        if (c0zt != null) {
            int A0B = c0zt.A0B();
            for (int i = 0; i < A0B; i++) {
                C1BQ A03 = A03();
                A03.A02(this.A0K.A03(i));
                A0E(A03, false);
            }
            ViewPager viewPager = this.A0L;
            if (viewPager == null || A0B <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= this.A0d.size()) {
                return;
            }
            A0F(A04(currentItem), true);
        }
    }

    public void A06() {
        C1BP c1bp = this.A0b;
        for (int childCount = c1bp.getChildCount() - 1; childCount >= 0; childCount--) {
            C1BR c1br = (C1BR) c1bp.getChildAt(childCount);
            c1bp.removeViewAt(childCount);
            if (c1br != null) {
                if (c1br.A04 != null) {
                    c1br.A04 = null;
                    c1br.A00();
                }
                c1br.setSelected(false);
                this.A0a.A01(c1br);
            }
            requestLayout();
        }
        Iterator it = this.A0d.iterator();
        while (it.hasNext()) {
            C1BQ c1bq = (C1BQ) it.next();
            it.remove();
            c1bq.A02 = null;
            c1bq.A01 = null;
            c1bq.A04 = null;
            c1bq.A03 = null;
            c1bq.A00 = -1;
            A0e.A01(c1bq);
        }
        this.A0P = null;
    }

    public final void A07() {
        int i;
        if (this.A03 == 0) {
            i = Math.max(0, this.A02 - this.A0A);
        } else {
            i = 0;
        }
        C1BP c1bp = this.A0b;
        C0AT.A0Y(c1bp, i, 0, 0, 0);
        int i2 = this.A03;
        if (i2 == 0) {
            c1bp.setGravity(8388611);
        } else if (i2 == 1) {
            c1bp.setGravity(1);
        }
        A0G(true);
    }

    public final void A08() {
        if (this.A0D == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0D = valueAnimator;
            valueAnimator.setInterpolator(C08580bj.A02);
            this.A0D.setDuration(this.A05);
            this.A0D.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1BL
                {
                    TabLayout.this = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Number) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    public final void A09(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C0AT.A0h(this)) {
            C1BP c1bp = this.A0b;
            int childCount = c1bp.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c1bp.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int A02 = A02(i, 0.0f);
            if (scrollX != A02) {
                A08();
                this.A0D.setIntValues(scrollX, A02);
                this.A0D.start();
            }
            c1bp.A01(i, this.A05);
            return;
        }
        A0A(i, 0.0f, true, true);
    }

    public void A0A(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round >= 0) {
            C1BP c1bp = this.A0b;
            if (round < c1bp.getChildCount()) {
                if (z2) {
                    ValueAnimator valueAnimator = c1bp.A06;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        c1bp.A06.cancel();
                    }
                    c1bp.A05 = i;
                    c1bp.A00 = f;
                    c1bp.A00();
                }
                ValueAnimator valueAnimator2 = this.A0D;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.A0D.cancel();
                }
                scrollTo(A02(i, f), 0);
                if (z) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void A0B(LinearLayout.LayoutParams layoutParams) {
        if (this.A03 == 1 && this.A04 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void A0C(C0ZT c0zt, boolean z) {
        DataSetObserver dataSetObserver;
        C0ZT c0zt2 = this.A0K;
        if (c0zt2 != null && (dataSetObserver = this.A0H) != null) {
            c0zt2.A06(dataSetObserver);
        }
        this.A0K = c0zt;
        if (z && c0zt != null) {
            DataSetObserver dataSetObserver2 = this.A0H;
            if (dataSetObserver2 == null) {
                dataSetObserver2 = new DataSetObserver() { // from class: X.1BM
                    {
                        TabLayout.this = this;
                    }

                    @Override // android.database.DataSetObserver
                    public void onChanged() {
                        TabLayout.this.A05();
                    }

                    @Override // android.database.DataSetObserver
                    public void onInvalidated() {
                        TabLayout.this.A05();
                    }
                };
                this.A0H = dataSetObserver2;
            }
            c0zt.A05(dataSetObserver2);
        }
        A05();
    }

    public final void A0D(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.A0L;
        if (viewPager2 != null) {
            C32811em c32811em = this.A0Q;
            if (c32811em != null && (list2 = viewPager2.A0c) != null) {
                list2.remove(c32811em);
            }
            C32801el c32801el = this.A0M;
            if (c32801el != null && (list = this.A0L.A0b) != null) {
                list.remove(c32801el);
            }
        }
        InterfaceC08320bF interfaceC08320bF = this.A0N;
        if (interfaceC08320bF != null) {
            this.A0c.remove(interfaceC08320bF);
            this.A0N = null;
        }
        if (viewPager != null) {
            this.A0L = viewPager;
            C32811em c32811em2 = this.A0Q;
            if (c32811em2 == null) {
                c32811em2 = new C32811em(this);
                this.A0Q = c32811em2;
            }
            c32811em2.A01 = 0;
            c32811em2.A00 = 0;
            viewPager.A0F(c32811em2);
            InterfaceC08320bF interfaceC08320bF2 = new InterfaceC08320bF(viewPager) { // from class: X.1en
                public final ViewPager A00;

                {
                    this.A00 = viewPager;
                }

                @Override // X.InterfaceC08320bF
                public void APY(C1BQ c1bq) {
                    this.A00.setCurrentItem(c1bq.A00);
                }
            };
            this.A0N = interfaceC08320bF2;
            ArrayList arrayList = this.A0c;
            if (!arrayList.contains(interfaceC08320bF2)) {
                arrayList.add(interfaceC08320bF2);
            }
            C0ZT c0zt = viewPager.A0V;
            if (c0zt != null) {
                A0C(c0zt, true);
            }
            C32801el c32801el2 = this.A0M;
            if (c32801el2 == null) {
                c32801el2 = new C32801el(this);
                this.A0M = c32801el2;
            }
            c32801el2.A00 = true;
            List list3 = viewPager.A0b;
            if (list3 == null) {
                list3 = new ArrayList();
                viewPager.A0b = list3;
            }
            list3.add(c32801el2);
            A0A(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.A0L = null;
            A0C(null, false);
        }
        this.A0S = z;
    }

    public void A0E(C1BQ c1bq, boolean z) {
        ArrayList arrayList = this.A0d;
        int size = arrayList.size();
        if (c1bq.A02 == this) {
            c1bq.A00 = size;
            arrayList.add(size, c1bq);
            int size2 = arrayList.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                ((C1BQ) arrayList.get(size)).A00 = size;
            }
            C1BR c1br = c1bq.A01;
            C1BP c1bp = this.A0b;
            int i = c1bq.A00;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            A0B(layoutParams);
            c1bp.addView(c1br, i, layoutParams);
            if (z) {
                c1bq.A00();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void A0F(C1BQ c1bq, boolean z) {
        int i;
        C1BQ c1bq2 = this.A0P;
        if (c1bq2 == c1bq) {
            if (c1bq2 != null) {
                ArrayList arrayList = this.A0c;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size);
                }
                A09(c1bq.A00);
                return;
            }
            return;
        }
        if (c1bq != null) {
            i = c1bq.A00;
        } else {
            i = -1;
        }
        if (z) {
            if ((c1bq2 == null || c1bq2.A00 == -1) && i != -1) {
                A0A(i, 0.0f, true, true);
            } else {
                A09(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.A0P = c1bq;
        if (c1bq2 != null) {
            ArrayList arrayList2 = this.A0c;
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                arrayList2.get(size2);
            }
        }
        if (c1bq != null) {
            ArrayList arrayList3 = this.A0c;
            for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC08320bF) arrayList3.get(size3)).APY(c1bq);
            }
        }
    }

    public void A0G(boolean z) {
        int i = 0;
        while (true) {
            C1BP c1bp = this.A0b;
            if (i >= c1bp.getChildCount()) {
                return;
            }
            View childAt = c1bp.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            A0B((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.A0d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
        return 48;
    }

    public int getSelectedTabPosition() {
        C1BQ c1bq = this.A0P;
        if (c1bq != null) {
            return c1bq.A00;
        }
        return -1;
    }

    public int getTabCount() {
        return this.A0d.size();
    }

    public int getTabGravity() {
        return this.A04;
    }

    public ColorStateList getTabIconTint() {
        return this.A0E;
    }

    public int getTabIndicatorGravity() {
        return this.A06;
    }

    public int getTabMaxWidth() {
        return this.A07;
    }

    private int getTabMinWidth() {
        int i = this.A0W;
        if (i != -1) {
            return i;
        }
        if (this.A03 == 0) {
            return this.A0X;
        }
        return 0;
    }

    public int getTabMode() {
        return this.A03;
    }

    public ColorStateList getTabRippleColor() {
        return this.A0F;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.A0b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public Drawable getTabSelectedIndicator() {
        return this.A0J;
    }

    public ColorStateList getTabTextColors() {
        return this.A0G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0L == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                A0D((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A0S) {
            setupWithViewPager(null);
            this.A0S = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C1BR c1br;
        Drawable drawable;
        int i = 0;
        while (true) {
            C1BP c1bp = this.A0b;
            if (i < c1bp.getChildCount()) {
                View childAt = c1bp.getChildAt(i);
                if ((childAt instanceof C1BR) && (drawable = (c1br = (C1BR) childAt).A01) != null) {
                    drawable.setBounds(c1br.getLeft(), c1br.getTop(), c1br.getRight(), c1br.getBottom());
                    c1br.A01.draw(canvas);
                }
                i++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int A01 = A01(getDefaultHeight());
        int paddingBottom = getPaddingBottom() + getPaddingTop() + A01;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.A0V;
            if (i3 <= 0) {
                i3 = size - A01(56);
            }
            this.A07 = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.A03;
            if (i4 != 0) {
                if (i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.A0R == z) {
            return;
        }
        this.A0R = z;
        int i = 0;
        while (true) {
            C1BP c1bp = this.A0b;
            if (i < c1bp.getChildCount()) {
                View childAt = c1bp.getChildAt(i);
                if (childAt instanceof C1BR) {
                    C1BR c1br = (C1BR) childAt;
                    c1br.setOrientation(!c1br.A05.A0R ? 1 : 0);
                    c1br.A02(c1br.A03, c1br.A02);
                }
                i++;
            } else {
                A07();
                return;
            }
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setOnTabSelectedListener(InterfaceC08320bF interfaceC08320bF) {
        InterfaceC08320bF interfaceC08320bF2 = this.A0O;
        if (interfaceC08320bF2 != null) {
            this.A0c.remove(interfaceC08320bF2);
        }
        this.A0O = interfaceC08320bF;
        if (interfaceC08320bF != null) {
            ArrayList arrayList = this.A0c;
            if (arrayList.contains(interfaceC08320bF)) {
                return;
            }
            arrayList.add(interfaceC08320bF);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A08();
        this.A0D.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C09L.A01(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.A0J != drawable) {
            this.A0J = drawable;
            this.A0b.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        C1BP c1bp = this.A0b;
        Paint paint = c1bp.A07;
        if (paint.getColor() != i) {
            paint.setColor(i);
            c1bp.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            this.A0b.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C1BP c1bp = this.A0b;
        if (c1bp.A04 != i) {
            c1bp.A04 = i;
            c1bp.postInvalidateOnAnimation();
        }
    }

    private void setSelectedTabView(int i) {
        C1BP c1bp = this.A0b;
        int childCount = c1bp.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = c1bp.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public void setTabGravity(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            A07();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.A0E != colorStateList) {
            this.A0E = colorStateList;
            ArrayList arrayList = this.A0d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1BR c1br = ((C1BQ) arrayList.get(i)).A01;
                if (c1br != null) {
                    c1br.A00();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C09L.A00(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.A0T = z;
        this.A0b.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.A03) {
            this.A03 = i;
            A07();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A0F == colorStateList) {
            return;
        }
        this.A0F = colorStateList;
        int i = 0;
        while (true) {
            C1BP c1bp = this.A0b;
            if (i >= c1bp.getChildCount()) {
                return;
            }
            View childAt = c1bp.getChildAt(i);
            if (childAt instanceof C1BR) {
                ((C1BR) childAt).A01(getContext());
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C09L.A00(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.A0G != colorStateList) {
            this.A0G = colorStateList;
            ArrayList arrayList = this.A0d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1BR c1br = ((C1BQ) arrayList.get(i)).A01;
                if (c1br != null) {
                    c1br.A00();
                }
            }
        }
    }

    public void setTabsFromPagerAdapter(C0ZT c0zt) {
        A0C(c0zt, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.A0U == z) {
            return;
        }
        this.A0U = z;
        int i = 0;
        while (true) {
            C1BP c1bp = this.A0b;
            if (i >= c1bp.getChildCount()) {
                return;
            }
            View childAt = c1bp.getChildAt(i);
            if (childAt instanceof C1BR) {
                ((C1BR) childAt).A01(getContext());
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        A0D(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
