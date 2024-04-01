package com.google.android.material.appbar;

import X.AbstractC08910cJ;
import X.C07110Wv;
import X.C08550bg;
import X.C08560bh;
import X.C08580bj;
import X.C08930cL;
import X.C0AT;
import X.C0V5;
import X.C1AR;
import X.C1AS;
import X.C1AY;
import X.C1AZ;
import X.C32531eE;
import X.InterfaceC02860De;
import X.InterfaceC32541eF;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@CoordinatorLayout.DefaultBehavior(Behavior.class)
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C07110Wv A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A;

    public float getTargetElevation() {
        return 0.0f;
    }

    /* loaded from: classes.dex */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08550bg.A0o);
            ((HeaderScrollingViewBehavior) this).A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public static AppBarLayout A00(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // X.AbstractC08910cJ
        public boolean A0A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout A00 = A00(coordinatorLayout.A06(view));
            if (A00 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.A02;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    A00.A03(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // X.AbstractC08910cJ
        public boolean A0D(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC08910cJ abstractC08910cJ = ((C08930cL) view2.getLayoutParams()).A0A;
            if (abstractC08910cJ instanceof BaseBehavior) {
                C0AT.A0T(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC08910cJ).A02) + ((HeaderScrollingViewBehavior) this).A01) - A0J(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.A07) {
                    boolean z = view.getScrollY() > 0;
                    if (appBarLayout.A09 != z) {
                        appBarLayout.A09 = z;
                        appBarLayout.refreshDrawableState();
                    }
                }
            }
            return false;
        }

        @Override // X.AbstractC08910cJ
        public boolean A0H(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }
    }

    /* loaded from: classes.dex */
    public class BaseBehavior extends HeaderBehavior {
        public float A00;
        public int A01;
        public int A02;
        public int A03;
        public ValueAnimator A04;
        public WeakReference A05;
        public boolean A06;

        public BaseBehavior() {
            this.A03 = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.A03 = -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0068  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void A00(androidx.coordinatorlayout.widget.CoordinatorLayout r5, com.google.android.material.appbar.AppBarLayout r6, int r7, int r8, boolean r9) {
            /*
                int r3 = java.lang.Math.abs(r7)
                int r2 = r6.getChildCount()
                r1 = 0
            L9:
                if (r1 >= r2) goto La1
                android.view.View r4 = r6.getChildAt(r1)
                int r0 = r4.getTop()
                if (r3 < r0) goto Lbe
                int r0 = r4.getBottom()
                if (r3 > r0) goto Lbe
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                X.1AS r0 = (X.C1AS) r0
                int r1 = r0.A00
                r0 = r1 & 1
                if (r0 == 0) goto Lbc
                int r3 = r4.getMinimumHeight()
                if (r8 <= 0) goto Laa
                r0 = r1 & 12
                if (r0 == 0) goto Laa
                int r2 = -r7
                int r1 = r4.getBottom()
                int r1 = r1 - r3
                int r0 = r6.getTopInset()
                int r1 = r1 - r0
                if (r2 < r1) goto Lbc
            L3e:
                r4 = 1
            L3f:
                boolean r0 = r6.A07
                if (r0 == 0) goto L5c
                int r3 = r5.getChildCount()
                r2 = 0
            L48:
                if (r2 >= r3) goto L5c
                android.view.View r1 = r5.getChildAt(r2)
                boolean r0 = r1 instanceof X.InterfaceC02870Df
                if (r0 == 0) goto La7
                if (r1 == 0) goto L5c
                int r0 = r1.getScrollY()
                r4 = 0
                if (r0 <= 0) goto L5c
                r4 = 1
            L5c:
                boolean r0 = r6.A09
                if (r0 == r4) goto La5
                r6.A09 = r4
                r6.refreshDrawableState()
                r0 = 1
            L66:
                if (r9 != 0) goto L9e
                if (r0 == 0) goto La1
                X.0jX r0 = r5.A0C
                X.02z r1 = r0.A00
                r0 = 0
                java.lang.Object r0 = r1.getOrDefault(r6, r0)
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.List r4 = r5.A0F
                r4.clear()
                if (r0 == 0) goto L7f
                r4.addAll(r0)
            L7f:
                int r3 = r4.size()
                r2 = 0
            L84:
                if (r2 >= r3) goto La1
                java.lang.Object r0 = r4.get(r2)
                android.view.View r0 = (android.view.View) r0
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                X.0cL r0 = (X.C08930cL) r0
                X.0cJ r1 = r0.A0A
                boolean r0 = r1 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto La2
                com.google.android.material.appbar.HeaderScrollingViewBehavior r1 = (com.google.android.material.appbar.HeaderScrollingViewBehavior) r1
                int r0 = r1.A00
                if (r0 == 0) goto La1
            L9e:
                r6.jumpDrawablesToCurrentState()
            La1:
                return
            La2:
                int r2 = r2 + 1
                goto L84
            La5:
                r0 = 0
                goto L66
            La7:
                int r2 = r2 + 1
                goto L48
            Laa:
                r0 = r1 & 2
                if (r0 == 0) goto Lbc
                int r2 = -r7
                int r1 = r4.getBottom()
                int r1 = r1 - r3
                int r0 = r6.getTopInset()
                int r1 = r1 - r0
                if (r2 < r1) goto Lbc
                goto L3e
            Lbc:
                r4 = 0
                goto L3f
            Lbe:
                int r1 = r1 + 1
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A00(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // X.AbstractC08910cJ
        public Parcelable A03(CoordinatorLayout coordinatorLayout, View view) {
            int i;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            C1AY c1ay = ((ViewOffsetBehavior) this).A01;
            if (c1ay != null) {
                i = c1ay.A02;
            } else {
                i = 0;
            }
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int bottom = childAt.getBottom() + i;
                if (childAt.getTop() + i <= 0 && bottom >= 0) {
                    C32531eE c32531eE = new C32531eE(absSavedState);
                    c32531eE.A01 = i2;
                    c32531eE.A02 = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    c32531eE.A00 = bottom / childAt.getHeight();
                    return c32531eE;
                }
            }
            return absSavedState;
        }

        @Override // X.AbstractC08910cJ
        public void A04(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            if (parcelable instanceof C32531eE) {
                C32531eE c32531eE = (C32531eE) parcelable;
                this.A03 = c32531eE.A01;
                this.A00 = c32531eE.A00;
                this.A06 = c32531eE.A02;
                return;
            }
            this.A03 = -1;
        }

        @Override // X.AbstractC08910cJ
        public void A05(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.A01 == 0 || i == 1) {
                A0N(coordinatorLayout, appBarLayout);
            }
            this.A05 = new WeakReference(view2);
        }

        @Override // X.AbstractC08910cJ
        public /* bridge */ /* synthetic */ void A06(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                A0K(coordinatorLayout, appBarLayout, A0J() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
                if (i5 == 1 && A0J() == 0 && (view2 instanceof InterfaceC02860De)) {
                    ((InterfaceC02860De) view2).AVB(1);
                }
            }
            if (appBarLayout.A07) {
                boolean z = view2.getScrollY() > 0;
                if (appBarLayout.A09 != z) {
                    appBarLayout.A09 = z;
                    appBarLayout.refreshDrawableState();
                }
            }
        }

        @Override // X.AbstractC08910cJ
        public /* bridge */ /* synthetic */ void A07(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -appBarLayout.getTotalScrollRange();
                    i5 = appBarLayout.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -appBarLayout.getTotalScrollRange();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = A0K(coordinatorLayout, appBarLayout, A0J() - i2, i4, i5);
                    if (i3 == 1) {
                        int A0J = A0J();
                        if (i2 < 0) {
                            if (A0J != 0) {
                                return;
                            }
                        } else if (A0J != (-appBarLayout.getDownNestedScrollRange())) {
                            return;
                        }
                        if (!(view2 instanceof InterfaceC02860De)) {
                            return;
                        }
                        ((InterfaceC02860De) view2).AVB(1);
                    }
                }
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, X.AbstractC08910cJ
        public boolean A08(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            int i3;
            int i4;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.A08(coordinatorLayout, appBarLayout, i);
            int i5 = appBarLayout.A02;
            int i6 = this.A03;
            if (i6 >= 0 && (i5 & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i6);
                int i7 = -childAt.getBottom();
                if (this.A06) {
                    round = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i7;
                } else {
                    round = Math.round(childAt.getHeight() * this.A00) + i7;
                }
                A0L(coordinatorLayout, appBarLayout, round);
            } else if (i5 != 0) {
                boolean z = (i5 & 4) != 0;
                if ((i5 & 2) != 0) {
                    int i8 = -appBarLayout.getTotalScrollRange();
                    if (z) {
                        A0O(coordinatorLayout, appBarLayout, i8);
                    } else {
                        A0L(coordinatorLayout, appBarLayout, i8);
                    }
                } else if ((i5 & 1) != 0) {
                    if (z) {
                        A0O(coordinatorLayout, appBarLayout, 0);
                    } else {
                        A0L(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.A02 = 0;
            this.A03 = -1;
            C1AY c1ay = ((ViewOffsetBehavior) this).A01;
            if (c1ay != null) {
                i2 = c1ay.A02;
            } else {
                i2 = 0;
            }
            int i9 = -appBarLayout.getTotalScrollRange();
            if (i2 < i9) {
                i2 = i9;
            } else if (i2 > 0) {
                i2 = 0;
            }
            C1AY c1ay2 = ((ViewOffsetBehavior) this).A01;
            if (c1ay2 != null) {
                c1ay2.A01(i2);
            } else {
                ((ViewOffsetBehavior) this).A00 = i2;
            }
            C1AY c1ay3 = ((ViewOffsetBehavior) this).A01;
            if (c1ay3 != null) {
                i3 = c1ay3.A02;
            } else {
                i3 = 0;
            }
            A00(coordinatorLayout, appBarLayout, i3, 0, true);
            C1AY c1ay4 = ((ViewOffsetBehavior) this).A01;
            if (c1ay4 != null) {
                i4 = c1ay4.A02;
            } else {
                i4 = 0;
            }
            appBarLayout.A01(i4);
            return true;
        }

        @Override // X.AbstractC08910cJ
        public boolean A09(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == -2) {
                coordinatorLayout.A0C(view, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return false;
        }

        @Override // X.AbstractC08910cJ
        public /* bridge */ /* synthetic */ boolean A0F(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = true;
            if ((i & 2) != 0 && (appBarLayout.A07 || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                ValueAnimator valueAnimator = this.A04;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            } else {
                z = false;
            }
            this.A05 = null;
            this.A01 = i2;
            return z;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int A0J() {
            int i;
            C1AY c1ay = ((ViewOffsetBehavior) this).A01;
            if (c1ay != null) {
                i = c1ay.A02;
            } else {
                i = 0;
            }
            return i + this.A02;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int A0K(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int A0J = A0J();
            boolean z = false;
            if (i2 != 0 && A0J >= i2 && A0J <= i3) {
                if (i >= i2) {
                    i2 = i;
                    if (i > i3) {
                        i2 = i3;
                    }
                }
                if (A0J != i2) {
                    if (appBarLayout.A06) {
                        int abs = Math.abs(i2);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            C1AS c1as = (C1AS) childAt.getLayoutParams();
                            Interpolator interpolator = c1as.A01;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = c1as.A00;
                                if ((i8 & 1) != 0) {
                                    i6 = childAt.getHeight() + ((LinearLayout.LayoutParams) c1as).topMargin + ((LinearLayout.LayoutParams) c1as).bottomMargin + 0;
                                    if ((i8 & 2) != 0) {
                                        i6 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i6 = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    i6 -= appBarLayout.getTopInset();
                                }
                                if (i6 > 0) {
                                    float f = i6;
                                    i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(i2);
                                }
                            }
                        }
                    }
                    i4 = i2;
                    C1AY c1ay = ((ViewOffsetBehavior) this).A01;
                    if (c1ay != null) {
                        z = c1ay.A01(i4);
                    } else {
                        ((ViewOffsetBehavior) this).A00 = i4;
                    }
                    int i9 = A0J - i2;
                    this.A02 = i2 - i4;
                    if (!z && appBarLayout.A06) {
                        coordinatorLayout.A0A(appBarLayout);
                    }
                    C1AY c1ay2 = ((ViewOffsetBehavior) this).A01;
                    if (c1ay2 != null) {
                        i5 = c1ay2.A02;
                    } else {
                        i5 = 0;
                    }
                    appBarLayout.A01(i5);
                    A00(coordinatorLayout, appBarLayout, i2, i2 < A0J ? -1 : 1, false);
                    return i9;
                }
                return 0;
            }
            this.A02 = 0;
            return 0;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public boolean A0M(View view) {
            View view2;
            WeakReference weakReference = this.A05;
            return weakReference == null || !((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1));
        }

        public final void A0N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int A0J = A0J();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C1AS c1as = (C1AS) childAt.getLayoutParams();
                if ((c1as.A00 & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) c1as).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c1as).bottomMargin;
                }
                int i2 = -A0J;
                if (top <= i2 && bottom >= i2) {
                    if (i >= 0) {
                        View childAt2 = appBarLayout.getChildAt(i);
                        C1AS c1as2 = (C1AS) childAt2.getLayoutParams();
                        int i3 = c1as2.A00;
                        if ((i3 & 17) == 17) {
                            int i4 = -childAt2.getTop();
                            int i5 = -childAt2.getBottom();
                            if (i == appBarLayout.getChildCount() - 1) {
                                i5 += appBarLayout.getTopInset();
                            }
                            if ((i3 & 2) == 2) {
                                i5 += childAt2.getMinimumHeight();
                            } else if ((i3 & 5) == 5) {
                                int minimumHeight = childAt2.getMinimumHeight() + i5;
                                if (A0J < minimumHeight) {
                                    i4 = minimumHeight;
                                } else {
                                    i5 = minimumHeight;
                                }
                            }
                            if ((i3 & 32) == 32) {
                                i4 += ((LinearLayout.LayoutParams) c1as2).topMargin;
                                i5 -= ((LinearLayout.LayoutParams) c1as2).bottomMargin;
                            }
                            if (A0J < (i5 + i4) / 2) {
                                i4 = i5;
                            }
                            int i6 = -appBarLayout.getTotalScrollRange();
                            if (i4 >= i6) {
                                i6 = i4;
                                if (i4 > 0) {
                                    i6 = 0;
                                }
                            }
                            A0O(coordinatorLayout, appBarLayout, i6);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }

        public final void A0O(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i) {
            int height;
            int abs = Math.abs(A0J() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int A0J = A0J();
            if (A0J == i) {
                ValueAnimator valueAnimator = this.A04;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.A04.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.A04;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.A04 = valueAnimator3;
                valueAnimator3.setInterpolator(C08580bj.A00);
                this.A04.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1AP
                    {
                        AppBarLayout.BaseBehavior.this = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        AppBarLayout.BaseBehavior.this.A0L(coordinatorLayout, appBarLayout, ((Number) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.A04.setDuration(Math.min(height, 600));
            this.A04.setIntValues(A0J, i);
            this.A04.start();
        }
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = -1;
        this.A00 = -1;
        this.A01 = -1;
        this.A02 = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            Context context2 = getContext();
            TypedArray A00 = C08560bh.A00(context2, attributeSet, C1AZ.A00, 0, 2131952444, new int[0]);
            try {
                if (A00.hasValue(0)) {
                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, A00.getResourceId(0, 0)));
                }
                A00.recycle();
            } catch (Throwable th) {
                A00.recycle();
                throw th;
            }
        }
        TypedArray A002 = C08560bh.A00(context, attributeSet, C08550bg.A06, 0, 2131952444, new int[0]);
        setBackground(A002.getDrawable(0));
        if (A002.hasValue(4)) {
            A03(A002.getBoolean(4, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && A002.hasValue(3)) {
            C1AZ.A00(this, A002.getDimensionPixelSize(3, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (A002.hasValue(2)) {
                setKeyboardNavigationCluster(A002.getBoolean(2, false));
            }
            if (A002.hasValue(1)) {
                setTouchscreenBlocksFocus(A002.getBoolean(1, false));
            }
        }
        this.A07 = A002.getBoolean(5, false);
        A002.recycle();
        C0AT.A0d(this, new C0V5() { // from class: X.1eD
            {
                AppBarLayout.this = this;
            }

            @Override // X.C0V5
            public C07110Wv AHK(View view, C07110Wv c07110Wv) {
                AppBarLayout appBarLayout = AppBarLayout.this;
                if (appBarLayout != null) {
                    C07110Wv c07110Wv2 = appBarLayout.getFitsSystemWindows() ? c07110Wv : null;
                    if (!C07O.A18(appBarLayout.A04, c07110Wv2)) {
                        appBarLayout.A04 = c07110Wv2;
                        appBarLayout.A03 = -1;
                        appBarLayout.A00 = -1;
                        appBarLayout.A01 = -1;
                    }
                    return c07110Wv;
                }
                throw null;
            }
        });
    }

    public static C1AS A00(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new C1AS((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1AS((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1AS(layoutParams);
    }

    public void A01(int i) {
        List list = this.A05;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1AR c1ar = (C1AR) this.A05.get(i2);
                if (c1ar != null) {
                    c1ar.AMX(this, i);
                }
            }
        }
    }

    public void A02(InterfaceC32541eF interfaceC32541eF) {
        List list = this.A05;
        if (list == null) {
            list = new ArrayList();
            this.A05 = list;
        }
        if (interfaceC32541eF == null || list.contains(interfaceC32541eF)) {
            return;
        }
        this.A05.add(interfaceC32541eF);
    }

    public final void A03(boolean z, boolean z2, boolean z3) {
        this.A02 = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1AS;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1AS();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C1AS();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1AS(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A00(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1AS(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A00(layoutParams);
    }

    public int getDownNestedPreScrollRange() {
        int i = this.A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C1AS c1as = (C1AS) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c1as.A00;
            if ((i3 & 5) == 5) {
                int i4 = ((LinearLayout.LayoutParams) c1as).topMargin + ((LinearLayout.LayoutParams) c1as).bottomMargin + i2;
                if ((i3 & 8) != 0) {
                    i2 = childAt.getMinimumHeight() + i4;
                } else {
                    i2 = (measuredHeight - ((i3 & 2) != 0 ? childAt.getMinimumHeight() : getTopInset())) + i4;
                }
            } else if (i2 > 0) {
                break;
            }
        }
        int max = Math.max(0, i2);
        this.A00 = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.A01;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C1AS c1as = (C1AS) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) c1as).topMargin + ((LinearLayout.LayoutParams) c1as).bottomMargin + childAt.getMeasuredHeight();
            int i4 = c1as.A00;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= getTopInset() + childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.A01 = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int childCount;
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0 || ((childCount = getChildCount()) >= 1 && (minimumHeight = getChildAt(childCount - 1).getMinimumHeight()) != 0)) {
            return (minimumHeight << 1) + topInset;
        }
        return getHeight() / 3;
    }

    public int getPendingAction() {
        return this.A02;
    }

    public final int getTopInset() {
        C07110Wv c07110Wv = this.A04;
        if (c07110Wv != null) {
            return c07110Wv.A04();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.A03;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C1AS c1as = (C1AS) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c1as.A00;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) c1as).topMargin + ((LinearLayout.LayoutParams) c1as).bottomMargin;
            if ((i4 & 2) != 0) {
                i3 -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.A03 = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0025, code lost:
        if (r1 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0041, code lost:
        if (r1 == false) goto L21;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int[] onCreateDrawableState(int r7) {
        /*
            r6 = this;
            int[] r3 = r6.A0A
            if (r3 != 0) goto L9
            r0 = 4
            int[] r3 = new int[r0]
            r6.A0A = r3
        L9:
            int r0 = r3.length
            int r7 = r7 + r0
            int[] r4 = super.onCreateDrawableState(r7)
            r1 = 0
            boolean r5 = r6.A08
            r0 = 2130969421(0x7f04034d, float:1.7547523E38)
            int r0 = -r0
            if (r5 == 0) goto L1b
            r0 = 2130969421(0x7f04034d, float:1.7547523E38)
        L1b:
            r3[r1] = r0
            r2 = 1
            if (r5 == 0) goto L27
            boolean r1 = r6.A09
            r0 = 2130969422(0x7f04034e, float:1.7547525E38)
            if (r1 != 0) goto L2b
        L27:
            r0 = 2130969422(0x7f04034e, float:1.7547525E38)
            int r0 = -r0
        L2b:
            r3[r2] = r0
            r1 = 2
            r0 = 2130969420(0x7f04034c, float:1.7547521E38)
            int r0 = -r0
            if (r5 == 0) goto L37
            r0 = 2130969420(0x7f04034c, float:1.7547521E38)
        L37:
            r3[r1] = r0
            r2 = 3
            if (r5 == 0) goto L43
            boolean r1 = r6.A09
            r0 = 2130969419(0x7f04034b, float:1.754752E38)
            if (r1 != 0) goto L47
        L43:
            r0 = 2130969419(0x7f04034b, float:1.754752E38)
            int r0 = -r0
        L47:
            r3[r2] = r0
            int[] r0 = android.widget.LinearLayout.mergeDrawableStates(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onCreateDrawableState(int):int[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            r0 = -1
            r6.A03 = r0
            r6.A00 = r0
            r6.A01 = r0
            r5 = 0
            r6.A06 = r5
            int r2 = r6.getChildCount()
            r1 = 0
        L12:
            r4 = 1
            if (r1 >= r2) goto L25
            android.view.View r0 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.1AS r0 = (X.C1AS) r0
            android.view.animation.Interpolator r0 = r0.A01
            if (r0 == 0) goto L52
            r6.A06 = r4
        L25:
            boolean r0 = r6.A07
            if (r0 != 0) goto L44
            int r3 = r6.getChildCount()
            r2 = 0
        L2e:
            if (r2 >= r3) goto L45
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.1AS r0 = (X.C1AS) r0
            int r1 = r0.A00
            r0 = r1 & 1
            if (r0 != r4) goto L4f
            r0 = r1 & 10
            if (r0 == 0) goto L4f
        L44:
            r5 = 1
        L45:
            boolean r0 = r6.A08
            if (r0 == r5) goto L4e
            r6.A08 = r5
            r6.refreshDrawableState()
        L4e:
            return
        L4f:
            int r2 = r2 + 1
            goto L2e
        L52:
            int r1 = r1 + 1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A03 = -1;
        this.A00 = -1;
        this.A01 = -1;
    }

    public void setExpanded(boolean z) {
        A03(z, C0AT.A0h(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.A07 = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1AZ.A00(this, f);
        }
    }
}
