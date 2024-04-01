package androidx.appcompat.widget;

import X.C000200d;
import X.C06730Ut;
import X.C0AT;
import X.C0VF;
import X.C10750ga;
import X.C10960gw;
import X.C13120kd;
import X.InterfaceC02880Dg;
import X.InterfaceC02890Dh;
import X.InterfaceC02900Di;
import X.InterfaceC06740Uu;
import X.InterfaceC06760Uw;
import X.InterfaceC08830c9;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC06760Uw, InterfaceC02900Di, InterfaceC02890Dh, InterfaceC02880Dg {
    public static final int[] A0R = {R.attr.actionBarSize, 16842841};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public ViewPropertyAnimator A05;
    public OverScroller A06;
    public ActionBarContainer A07;
    public InterfaceC06740Uu A08;
    public ContentFrameLayout A09;
    public InterfaceC08830c9 A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnimatorListenerAdapter A0G;
    public final Rect A0H;
    public final Rect A0I;
    public final Rect A0J;
    public final Rect A0K;
    public final Rect A0L;
    public final Rect A0M;
    public final Rect A0N;
    public final C13120kd A0O;
    public final Runnable A0P;
    public final Runnable A0Q;

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = 0;
        this.A0H = new Rect();
        this.A0L = new Rect();
        this.A0J = new Rect();
        this.A0I = new Rect();
        this.A0M = new Rect();
        this.A0K = new Rect();
        this.A0N = new Rect();
        this.A0G = new AnimatorListenerAdapter() { // from class: X.0gt
            {
                ActionBarOverlayLayout.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.A05 = null;
                actionBarOverlayLayout.A0B = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.A05 = null;
                actionBarOverlayLayout.A0B = false;
            }
        };
        this.A0Q = new Runnable() { // from class: X.0gu
            {
                ActionBarOverlayLayout.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.A01();
                actionBarOverlayLayout.A05 = actionBarOverlayLayout.A07.animate().translationY(0.0f).setListener(actionBarOverlayLayout.A0G);
            }
        };
        this.A0P = new Runnable() { // from class: X.0gv
            {
                ActionBarOverlayLayout.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.A01();
                actionBarOverlayLayout.A05 = actionBarOverlayLayout.A07.animate().translationY(-actionBarOverlayLayout.A07.getHeight()).setListener(actionBarOverlayLayout.A0G);
            }
        };
        A03(context);
        this.A0O = new C13120kd();
    }

    public static final boolean A00(View view, Rect rect, boolean z) {
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i = marginLayoutParams.leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            marginLayoutParams.leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = marginLayoutParams.topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            marginLayoutParams.topMargin = i4;
            z2 = true;
        }
        int i5 = marginLayoutParams.rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            marginLayoutParams.rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = marginLayoutParams.bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                marginLayoutParams.bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public void A01() {
        removeCallbacks(this.A0Q);
        removeCallbacks(this.A0P);
        ViewPropertyAnimator viewPropertyAnimator = this.A05;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void A02() {
        InterfaceC08830c9 wrapper;
        if (this.A09 == null) {
            this.A09 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.A07 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC08830c9) {
                wrapper = (InterfaceC08830c9) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder A0P = C000200d.A0P("Can't make a decor toolbar out of ");
                A0P.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(A0P.toString());
            }
            this.A0A = wrapper;
        }
    }

    public final void A03(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A0R);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.A04 = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.A0E = context.getApplicationInfo().targetSdkVersion < 19;
        this.A06 = new OverScroller(context);
    }

    @Override // X.InterfaceC06760Uw
    public boolean A5x() {
        A02();
        return this.A0A.A5x();
    }

    @Override // X.InterfaceC06760Uw
    public void A7M() {
        A02();
        this.A0A.A7L();
    }

    @Override // X.InterfaceC06760Uw
    public boolean AEd() {
        A02();
        return this.A0A.AEd();
    }

    @Override // X.InterfaceC06760Uw
    public void AEs(int i) {
        A02();
        if (i == 2) {
            this.A0A.AEv();
        } else if (i == 5) {
            this.A0A.AEu();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    @Override // X.InterfaceC06760Uw
    public boolean AFa() {
        A02();
        return this.A0A.AFa();
    }

    @Override // X.InterfaceC06760Uw
    public boolean AFb() {
        A02();
        return this.A0A.AFb();
    }

    @Override // X.InterfaceC02890Dh
    public void AMK(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // X.InterfaceC02890Dh
    public void AML(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // X.InterfaceC02880Dg
    public void AMM(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // X.InterfaceC02890Dh
    public void AMN(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // X.InterfaceC02890Dh
    public boolean AOu(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // X.InterfaceC02890Dh
    public void APB(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // X.InterfaceC06760Uw
    public void ATN() {
        A02();
        this.A0A.ATN();
    }

    @Override // X.InterfaceC06760Uw
    public boolean AUn() {
        A02();
        return this.A0A.AUn();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C10960gw;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.A04 == null || this.A0E) {
            return;
        }
        if (this.A07.getVisibility() == 0) {
            i = (int) (this.A07.getTranslationY() + this.A07.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.A04.setBounds(0, i, getWidth(), this.A04.getIntrinsicHeight() + i);
        this.A04.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
        if (r4 != false) goto L7;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean fitSystemWindows(android.graphics.Rect r7) {
        /*
            r6 = this;
            r6.A02()
            r6.getWindowSystemUiVisibility()
            androidx.appcompat.widget.ActionBarContainer r1 = r6.A07
            r5 = 1
            r0 = 0
            boolean r4 = A00(r1, r7, r0)
            android.graphics.Rect r3 = r6.A0I
            r3.set(r7)
            android.graphics.Rect r2 = r6.A0H
            X.C0Ux.A00(r6, r3, r2)
            android.graphics.Rect r1 = r6.A0M
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L24
            r1.set(r3)
            r4 = 1
        L24:
            android.graphics.Rect r1 = r6.A0L
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L33
            r1.set(r2)
        L2f:
            r6.requestLayout()
        L32:
            return r5
        L33:
            if (r4 == 0) goto L32
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.fitSystemWindows(android.graphics.Rect):boolean");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C10960gw();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C10960gw(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C10960gw(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.A07;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C13120kd c13120kd = this.A0O;
        return c13120kd.A01 | c13120kd.A00;
    }

    public CharSequence getTitle() {
        A02();
        return this.A0A.getTitle();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A03(getContext());
        C0AT.A0L(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A01();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = marginLayoutParams.leftMargin + paddingLeft;
                int i7 = marginLayoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        A02();
        measureChildWithMargins(this.A07, i, 0, i2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A07.getLayoutParams();
        int max = Math.max(0, this.A07.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        int max2 = Math.max(0, this.A07.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.A07.getMeasuredState());
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z = true;
            measuredHeight = this.A00;
            if (this.A0C && this.A07.A06 != null) {
                measuredHeight += measuredHeight;
            }
        } else {
            z = false;
            measuredHeight = this.A07.getVisibility() != 8 ? this.A07.getMeasuredHeight() : 0;
        }
        Rect rect = this.A0J;
        rect.set(this.A0H);
        Rect rect2 = this.A0K;
        rect2.set(this.A0I);
        if (!this.A0F && !z) {
            rect.top += measuredHeight;
            rect.bottom += 0;
        } else {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        A00(this.A09, rect, true);
        Rect rect3 = this.A0N;
        if (!rect3.equals(rect2)) {
            rect3.set(rect2);
            this.A09.A00(rect2);
        }
        measureChildWithMargins(this.A09, i, 0, i2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A09.getLayoutParams();
        int max3 = Math.max(max, this.A09.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin);
        int max4 = Math.max(max2, this.A09.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.A09.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.A0D && z) {
            this.A06.fling(0, 0, 0, (int) f2, 0, 0, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE);
            if (this.A06.getFinalY() > this.A07.getHeight()) {
                A01();
                this.A0P.run();
            } else {
                A01();
                this.A0Q.run();
            }
            this.A0B = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.A01 + i2;
        this.A01 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public void onNestedScrollAccepted(View view, View view2, int i) {
        C06730Ut c06730Ut;
        C10750ga c10750ga;
        this.A0O.A01 = i;
        this.A01 = getActionBarHideOffset();
        A01();
        InterfaceC06740Uu interfaceC06740Uu = this.A08;
        if (interfaceC06740Uu == null || (c10750ga = (c06730Ut = (C06730Ut) interfaceC06740Uu).A07) == null) {
            return;
        }
        c10750ga.A00();
        c06730Ut.A07 = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.A07.getVisibility() != 0) {
            return false;
        }
        return this.A0D;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public void onStopNestedScroll(View view) {
        if (this.A0D && !this.A0B) {
            if (this.A01 <= this.A07.getHeight()) {
                A01();
                postDelayed(this.A0Q, 600L);
                return;
            }
            A01();
            postDelayed(this.A0P, 600L);
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        A02();
        int i2 = this.A02 ^ i;
        this.A02 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC06740Uu interfaceC06740Uu = this.A08;
        if (interfaceC06740Uu != null) {
            C06730Ut c06730Ut = (C06730Ut) interfaceC06740Uu;
            c06730Ut.A0D = !z2;
            if (!z && z2) {
                if (!c06730Ut.A0H) {
                    c06730Ut.A0H = true;
                    c06730Ut.A0Z(true);
                }
            } else if (c06730Ut.A0H) {
                c06730Ut.A0H = false;
                c06730Ut.A0Z(true);
            }
        }
        if ((i2 & 256) == 0 || this.A08 == null) {
            return;
        }
        C0AT.A0L(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A03 = i;
        InterfaceC06740Uu interfaceC06740Uu = this.A08;
        if (interfaceC06740Uu != null) {
            ((C06730Ut) interfaceC06740Uu).A00 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        A01();
        this.A07.setTranslationY(-Math.max(0, Math.min(i, this.A07.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC06740Uu interfaceC06740Uu) {
        this.A08 = interfaceC06740Uu;
        if (getWindowToken() != null) {
            ((C06730Ut) this.A08).A00 = this.A03;
            int i = this.A02;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0AT.A0L(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.A0C = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.A0D) {
            this.A0D = z;
            if (z) {
                return;
            }
            A01();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        A02();
        this.A0A.AT7(i);
    }

    public void setIcon(Drawable drawable) {
        A02();
        this.A0A.AT8(drawable);
    }

    public void setLogo(int i) {
        A02();
        this.A0A.ATF(i);
    }

    @Override // X.InterfaceC06760Uw
    public void setMenu(Menu menu, C0VF c0vf) {
        A02();
        this.A0A.setMenu(menu, c0vf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0011, code lost:
        if (getContext().getApplicationInfo().targetSdkVersion >= 19) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setOverlayMode(boolean r4) {
        /*
            r3 = this;
            r3.A0F = r4
            if (r4 == 0) goto L13
            android.content.Context r0 = r3.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r2 = r0.targetSdkVersion
            r1 = 19
            r0 = 1
            if (r2 < r1) goto L14
        L13:
            r0 = 0
        L14:
            r3.A0E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.setOverlayMode(boolean):void");
    }

    @Override // X.InterfaceC06760Uw
    public void setWindowCallback(Window.Callback callback) {
        A02();
        this.A0A.setWindowCallback(callback);
    }

    @Override // X.InterfaceC06760Uw
    public void setWindowTitle(CharSequence charSequence) {
        A02();
        this.A0A.setWindowTitle(charSequence);
    }
}
