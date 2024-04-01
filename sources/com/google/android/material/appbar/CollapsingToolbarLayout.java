package com.google.android.material.appbar;

import X.C02160Ac;
import X.C07110Wv;
import X.C07O;
import X.C08550bg;
import X.C08560bh;
import X.C08580bj;
import X.C0AT;
import X.C0V5;
import X.C1AV;
import X.C1AY;
import X.C1B1;
import X.InterfaceC32541eF;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.search.verification.client.R;
import java.util.List;

/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public ValueAnimator A09;
    public Drawable A0A;
    public Drawable A0B;
    public View A0C;
    public View A0D;
    public Toolbar A0E;
    public C07110Wv A0F;
    public InterfaceC32541eF A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final Rect A0L;
    public final C1B1 A0M;

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A0J = true;
        this.A0L = new Rect();
        this.A06 = -1;
        C1B1 c1b1 = new C1B1(this);
        this.A0M = c1b1;
        c1b1.A0O = C08580bj.A00;
        c1b1.A07();
        TypedArray A00 = C08560bh.A00(context, attributeSet, C08550bg.A0L, 0, 2131952447, new int[0]);
        C1B1 c1b12 = this.A0M;
        int i = A00.getInt(3, 8388691);
        if (c1b12.A0M != i) {
            c1b12.A0M = i;
            c1b12.A07();
        }
        C1B1 c1b13 = this.A0M;
        int i2 = A00.getInt(0, 8388627);
        if (c1b13.A0K != i2) {
            c1b13.A0K = i2;
            c1b13.A07();
        }
        int dimensionPixelSize = A00.getDimensionPixelSize(4, 0);
        this.A01 = dimensionPixelSize;
        this.A02 = dimensionPixelSize;
        this.A04 = dimensionPixelSize;
        this.A03 = dimensionPixelSize;
        if (A00.hasValue(7)) {
            this.A03 = A00.getDimensionPixelSize(7, 0);
        }
        if (A00.hasValue(6)) {
            this.A02 = A00.getDimensionPixelSize(6, 0);
        }
        if (A00.hasValue(8)) {
            this.A04 = A00.getDimensionPixelSize(8, 0);
        }
        if (A00.hasValue(5)) {
            this.A01 = A00.getDimensionPixelSize(5, 0);
        }
        this.A0H = A00.getBoolean(14, true);
        setTitle(A00.getText(13));
        this.A0M.A0D(2131952163);
        this.A0M.A0C(2131952136);
        if (A00.hasValue(9)) {
            this.A0M.A0D(A00.getResourceId(9, 0));
        }
        if (A00.hasValue(1)) {
            this.A0M.A0C(A00.getResourceId(1, 0));
        }
        this.A06 = A00.getDimensionPixelSize(11, -1);
        this.A08 = A00.getInt(10, 600);
        setContentScrim(A00.getDrawable(2));
        setStatusBarScrim(A00.getDrawable(12));
        this.A07 = A00.getResourceId(15, -1);
        A00.recycle();
        setWillNotDraw(false);
        C0AT.A0d(this, new C0V5() { // from class: X.1eG
            @Override // X.C0V5
            public C07110Wv AHK(View view, C07110Wv c07110Wv) {
                CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
                if (collapsingToolbarLayout != null) {
                    C07110Wv c07110Wv2 = null;
                    if (collapsingToolbarLayout.getFitsSystemWindows()) {
                        c07110Wv2 = c07110Wv;
                    }
                    if (!C07O.A18(collapsingToolbarLayout.A0F, c07110Wv2)) {
                        collapsingToolbarLayout.A0F = c07110Wv2;
                        collapsingToolbarLayout.requestLayout();
                    }
                    if (Build.VERSION.SDK_INT >= 20) {
                        return new C07110Wv(((WindowInsets) c07110Wv.A00).consumeSystemWindowInsets());
                    }
                    return null;
                }
                throw null;
            }
        });
    }

    public static C1AY A00(View view) {
        C1AY c1ay = (C1AY) view.getTag(R.id.view_offset_helper);
        if (c1ay == null) {
            C1AY c1ay2 = new C1AY(view);
            view.setTag(R.id.view_offset_helper, c1ay2);
            return c1ay2;
        }
        return c1ay;
    }

    public final void A01() {
        if (this.A0J) {
            Toolbar toolbar = null;
            this.A0E = null;
            this.A0D = null;
            int i = this.A07;
            if (i != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i);
                this.A0E = toolbar2;
                if (toolbar2 != null) {
                    ViewParent parent = toolbar2.getParent();
                    View view = toolbar2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.A0D = view;
                }
            }
            if (this.A0E == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i2++;
                }
                this.A0E = toolbar;
            }
            A02();
            this.A0J = false;
        }
    }

    public final void A02() {
        View view;
        if (!this.A0H && (view = this.A0C) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A0C);
            }
        }
        if (!this.A0H || this.A0E == null) {
            return;
        }
        View view2 = this.A0C;
        if (view2 == null) {
            view2 = new View(getContext());
            this.A0C = view2;
        }
        if (view2.getParent() == null) {
            this.A0E.addView(this.A0C, -1, -1);
        }
    }

    public final void A03() {
        if (this.A0A == null && this.A0B == null) {
            return;
        }
        setScrimsShown(getHeight() + this.A00 < getScrimVisibleHeightTrigger());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1AV;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C07110Wv c07110Wv;
        int A04;
        Drawable drawable;
        super.draw(canvas);
        A01();
        if (this.A0E == null && (drawable = this.A0A) != null && this.A05 > 0) {
            drawable.mutate().setAlpha(this.A05);
            this.A0A.draw(canvas);
        }
        if (this.A0H && this.A0I) {
            this.A0M.A0F(canvas);
        }
        if (this.A0B == null || this.A05 <= 0 || (c07110Wv = this.A0F) == null || (A04 = c07110Wv.A04()) <= 0) {
            return;
        }
        this.A0B.setBounds(0, -this.A00, getWidth(), A04 - this.A00);
        this.A0B.mutate().setAlpha(this.A05);
        this.A0B.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.A0A;
        if (drawable != null && this.A05 > 0 && ((view2 = this.A0D) == null || view2 == this ? view == this.A0E : view == view2)) {
            drawable.mutate().setAlpha(this.A05);
            this.A0A.draw(canvas);
            z = true;
        } else {
            z = false;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0B;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0A;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C1B1 c1b1 = this.A0M;
        if (c1b1 != null) {
            c1b1.A0c = drawableState;
            ColorStateList colorStateList2 = c1b1.A0P;
            boolean z2 = true;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c1b1.A0Q) != null && colorStateList.isStateful())) {
                c1b1.A07();
            } else {
                z2 = false;
            }
            z |= z2;
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1AV();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new C1AV();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1AV(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1AV(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.A0M.A0K;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.A0M.A0T;
        return typeface == null ? Typeface.DEFAULT : typeface;
    }

    public Drawable getContentScrim() {
        return this.A0A;
    }

    public int getExpandedTitleGravity() {
        return this.A0M.A0M;
    }

    public int getExpandedTitleMarginBottom() {
        return this.A01;
    }

    public int getExpandedTitleMarginEnd() {
        return this.A02;
    }

    public int getExpandedTitleMarginStart() {
        return this.A03;
    }

    public int getExpandedTitleMarginTop() {
        return this.A04;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.A0M.A0V;
        return typeface == null ? Typeface.DEFAULT : typeface;
    }

    public int getScrimAlpha() {
        return this.A05;
    }

    public long getScrimAnimationDuration() {
        return this.A08;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.A06;
        if (i >= 0) {
            return i;
        }
        C07110Wv c07110Wv = this.A0F;
        int A04 = c07110Wv != null ? c07110Wv.A04() : 0;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight > 0) {
            return Math.min((minimumHeight << 1) + A04, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.A0B;
    }

    public CharSequence getTitle() {
        if (this.A0H) {
            return this.A0M.A0W;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            setFitsSystemWindows(((View) parent).getFitsSystemWindows());
            InterfaceC32541eF interfaceC32541eF = this.A0G;
            if (interfaceC32541eF == null) {
                interfaceC32541eF = new InterfaceC32541eF() { // from class: X.1eL
                    @Override // X.C1AR
                    public void AMX(AppBarLayout appBarLayout, int i) {
                        CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
                        collapsingToolbarLayout.A00 = i;
                        C07110Wv c07110Wv = collapsingToolbarLayout.A0F;
                        int A04 = c07110Wv != null ? c07110Wv.A04() : 0;
                        int childCount = collapsingToolbarLayout.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = collapsingToolbarLayout.getChildAt(i2);
                            C1AV c1av = (C1AV) childAt.getLayoutParams();
                            C1AY A00 = CollapsingToolbarLayout.A00(childAt);
                            int i3 = c1av.A01;
                            if (i3 == 1) {
                                int i4 = -i;
                                int height = ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.A00(childAt).A01) - childAt.getHeight()) - ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                                if (i4 < 0) {
                                    i4 = 0;
                                } else if (i4 > height) {
                                    i4 = height;
                                }
                                A00.A01(i4);
                            } else if (i3 == 2) {
                                A00.A01(Math.round((-i) * c1av.A00));
                            }
                        }
                        collapsingToolbarLayout.A03();
                        if (collapsingToolbarLayout.A0B != null && A04 > 0) {
                            collapsingToolbarLayout.postInvalidateOnAnimation();
                        }
                        collapsingToolbarLayout.A0M.A08(Math.abs(i) / ((collapsingToolbarLayout.getHeight() - collapsingToolbarLayout.getMinimumHeight()) - A04));
                    }
                };
                this.A0G = interfaceC32541eF;
            }
            ((AppBarLayout) parent).A02(interfaceC32541eF);
            if (Build.VERSION.SDK_INT >= 20) {
                requestApplyInsets();
            } else {
                requestFitSystemWindows();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        List list;
        ViewParent parent = getParent();
        InterfaceC32541eF interfaceC32541eF = this.A0G;
        if (interfaceC32541eF != null && (parent instanceof AppBarLayout) && (list = ((AppBarLayout) parent).A05) != null) {
            list.remove(interfaceC32541eF);
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r14.A0C.getVisibility() != 0) goto L53;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        A01();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C07110Wv c07110Wv = this.A0F;
        int A04 = c07110Wv != null ? c07110Wv.A04() : 0;
        if (mode != 0 || A04 <= 0) {
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + A04, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A0A;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        C1B1 c1b1 = this.A0M;
        if (c1b1.A0K != i) {
            c1b1.A0K = i;
            c1b1.A07();
        }
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.A0M.A0C(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        C1B1 c1b1 = this.A0M;
        if (c1b1.A0P != colorStateList) {
            c1b1.A0P = colorStateList;
            c1b1.A07();
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C1B1 c1b1 = this.A0M;
        if (c1b1.A0T != typeface) {
            c1b1.A0T = typeface;
            c1b1.A07();
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.A0A;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.A0A = mutate;
            if (mutate != null) {
                mutate.setBounds(0, 0, getWidth(), getHeight());
                this.A0A.setCallback(this);
                this.A0A.setAlpha(this.A05);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C02160Ac.A03(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        C1B1 c1b1 = this.A0M;
        if (c1b1.A0M != i) {
            c1b1.A0M = i;
            c1b1.A07();
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.A01 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.A02 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.A03 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.A04 = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.A0M.A0D(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C1B1 c1b1 = this.A0M;
        if (c1b1.A0Q != colorStateList) {
            c1b1.A0Q = colorStateList;
            c1b1.A07();
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C1B1 c1b1 = this.A0M;
        if (c1b1.A0V != typeface) {
            c1b1.A0V = typeface;
            c1b1.A07();
        }
    }

    public void setScrimAlpha(int i) {
        Toolbar toolbar;
        if (i != this.A05) {
            if (this.A0A != null && (toolbar = this.A0E) != null) {
                toolbar.postInvalidateOnAnimation();
            }
            this.A05 = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.A08 = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            A03();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (isInEditMode() != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setScrimsShown(boolean r7) {
        /*
            r6 = this;
            boolean r0 = X.C0AT.A0h(r6)
            r5 = 1
            r4 = 0
            if (r0 == 0) goto Lf
            boolean r0 = r6.isInEditMode()
            r1 = 1
            if (r0 == 0) goto L10
        Lf:
            r1 = 0
        L10:
            boolean r0 = r6.A0K
            if (r0 == r7) goto L58
            r3 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L68
            if (r7 != 0) goto L1b
            r3 = 0
        L1b:
            r6.A01()
            android.animation.ValueAnimator r0 = r6.A09
            if (r0 != 0) goto L5c
            android.animation.ValueAnimator r2 = new android.animation.ValueAnimator
            r2.<init>()
            r6.A09 = r2
            long r0 = r6.A08
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r6.A09
            int r0 = r6.A05
            if (r3 <= r0) goto L59
            android.animation.TimeInterpolator r0 = X.C08580bj.A01
        L36:
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r6.A09
            X.1AU r0 = new X.1AU
            r0.<init>()
            r1.addUpdateListener(r0)
        L43:
            android.animation.ValueAnimator r2 = r6.A09
            r0 = 2
            int[] r1 = new int[r0]
            int r0 = r6.A05
            r1[r4] = r0
            r1[r5] = r3
            r2.setIntValues(r1)
            android.animation.ValueAnimator r0 = r6.A09
            r0.start()
        L56:
            r6.A0K = r7
        L58:
            return
        L59:
            android.animation.TimeInterpolator r0 = X.C08580bj.A04
            goto L36
        L5c:
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L43
            android.animation.ValueAnimator r0 = r6.A09
            r0.cancel()
            goto L43
        L68:
            if (r7 == 0) goto L6c
            r4 = 255(0xff, float:3.57E-43)
        L6c:
            r6.setScrimAlpha(r4)
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.setScrimsShown(boolean):void");
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.A0B;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.A0B = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.A0B.setState(getDrawableState());
                }
                C07O.A0W(this.A0B, C0AT.A05(this));
                this.A0B.setVisible(getVisibility() == 0, false);
                this.A0B.setCallback(this);
                this.A0B.setAlpha(this.A05);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C02160Ac.A03(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.A0M.A0G(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.A0H) {
            this.A0H = z;
            setContentDescription(getTitle());
            A02();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.A0B;
        if (drawable != null && drawable.isVisible() != z) {
            this.A0B.setVisible(z, false);
        }
        Drawable drawable2 = this.A0A;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.A0A.setVisible(z, false);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0A || drawable == this.A0B;
    }
}
