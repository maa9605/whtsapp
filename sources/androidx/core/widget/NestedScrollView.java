package androidx.core.widget;

import X.C000200d;
import X.C07O;
import X.C0AS;
import X.C0AT;
import X.C13110kc;
import X.C13120kd;
import X.C13330l5;
import X.C1TR;
import X.C42271vT;
import X.InterfaceC02860De;
import X.InterfaceC02880Dg;
import X.InterfaceC13310l3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.NestedScrollView;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC02860De, InterfaceC02880Dg {
    public static final C1TR A0Q = new C0AS() { // from class: X.1TR
        @Override // X.C0AS
        public void A02(View view, AccessibilityEvent accessibilityEvent) {
            this.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // X.C0AS
        public void A04(View view, C08420bS c08420bS) {
            int scrollRange;
            View.AccessibilityDelegate accessibilityDelegate = this.A01;
            AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfo.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            accessibilityNodeInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                c08420bS.A06(C08440bU.A03);
                c08420bS.A06(C08440bU.A06);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c08420bS.A06(C08440bU.A05);
                c08420bS.A06(C08440bU.A04);
            }
        }

        @Override // X.C0AS
        public boolean A05(View view, int i, Bundle bundle) {
            if (super.A05(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                if (i != 4096) {
                    if (i == 8192 || i == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.A08(max, true);
                            return true;
                        }
                        return false;
                    } else if (i != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.A08(min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    };
    public static final int[] A0R = {16843130};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public VelocityTracker A09;
    public View A0A;
    public EdgeEffect A0B;
    public EdgeEffect A0C;
    public OverScroller A0D;
    public InterfaceC13310l3 A0E;
    public C13330l5 A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final Rect A0L;
    public final C13110kc A0M;
    public final C13120kd A0N;
    public final int[] A0O;
    public final int[] A0P;

    @Override // X.InterfaceC02890Dh
    public boolean AOu(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A0L = new Rect();
        this.A0J = true;
        this.A0I = false;
        this.A0A = null;
        this.A0H = false;
        this.A0K = true;
        this.A01 = -1;
        this.A0P = new int[2];
        this.A0O = new int[2];
        this.A0D = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.A07 = viewConfiguration.getScaledTouchSlop();
        this.A05 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A04 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0R, 0, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A0N = new C13120kd();
        this.A0M = new C13110kc(this);
        setNestedScrollingEnabled(true);
        C0AT.A0c(this, A0Q);
    }

    public static boolean A00(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && A00((View) parent, view2);
    }

    public int A01(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = i3 - verticalFadingEdgeLength;
        if (rect.bottom >= childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i4 = i3;
        }
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    public final void A02() {
        this.A0H = false;
        VelocityTracker velocityTracker = this.A09;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A09 = null;
        }
        this.A0M.A01(0);
        EdgeEffect edgeEffect = this.A0C;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.A0B.onRelease();
        }
    }

    public final void A03() {
        if (getOverScrollMode() != 2) {
            if (this.A0C == null) {
                Context context = getContext();
                this.A0C = new EdgeEffect(context);
                this.A0B = new EdgeEffect(context);
                return;
            }
            return;
        }
        this.A0C = null;
        this.A0B = null;
    }

    public void A04(int i) {
        if (getChildCount() > 0) {
            this.A0D.fling(getScrollX(), getScrollY(), 0, i, 0, 0, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE, 0, 0);
            this.A0M.A02(2, 1);
            this.A03 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final void A05(int i) {
        if (i != 0) {
            if (this.A0K) {
                A06(0, i, false);
            } else {
                scrollBy(0, i);
            }
        }
    }

    public final void A06(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.A08 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.A0D;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY);
            if (z) {
                this.A0M.A02(2, 1);
            } else {
                this.A0M.A01(1);
            }
            this.A03 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.A0D.isFinished()) {
                this.A0D.abortAnimation();
                this.A0M.A01(1);
            }
            scrollBy(i, i2);
        }
        this.A08 = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void A07(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.A0M.A03(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public void A08(int i, boolean z) {
        A06(0 - getScrollX(), i - getScrollY(), z);
    }

    public final void A09(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A01) {
            int i = actionIndex == 0 ? 1 : 0;
            this.A02 = (int) motionEvent.getY(i);
            this.A01 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.A09;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean A0A(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && A0F(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.A0L;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            A05(A01(rect));
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            A05(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && (!A0F(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(C42271vT.A09);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public boolean A0B(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.A0L;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return A0C(i, rect.top, rect.bottom);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0034, code lost:
        if (r2 >= r16) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0C(int r14, int r15, int r16) {
        /*
            r13 = this;
            int r10 = r13.getHeight()
            int r9 = r13.getScrollY()
            int r10 = r10 + r9
            r0 = 33
            r12 = 0
            if (r14 != r0) goto Lf
            r12 = 1
        Lf:
            r0 = 2
            java.util.ArrayList r8 = r13.getFocusables(r0)
            int r7 = r8.size()
            r6 = 0
            r5 = 0
            r11 = 0
        L1b:
            r0 = r16
            if (r5 >= r7) goto L5f
            java.lang.Object r4 = r8.get(r5)
            android.view.View r4 = (android.view.View) r4
            int r3 = r4.getTop()
            int r2 = r4.getBottom()
            if (r15 >= r2) goto L3b
            if (r3 >= r0) goto L3b
            if (r15 >= r3) goto L36
            r1 = 1
            if (r2 < r0) goto L37
        L36:
            r1 = 0
        L37:
            if (r6 != 0) goto L3e
            r6 = r4
            r11 = r1
        L3b:
            int r5 = r5 + 1
            goto L1b
        L3e:
            if (r12 == 0) goto L57
            int r0 = r6.getTop()
            if (r3 < r0) goto L5d
        L46:
            r0 = 0
        L47:
            if (r11 == 0) goto L4f
            if (r1 == 0) goto L3b
            if (r0 == 0) goto L3b
        L4d:
            r6 = r4
            goto L3b
        L4f:
            if (r1 == 0) goto L54
            r6 = r4
            r11 = 1
            goto L3b
        L54:
            if (r0 == 0) goto L3b
            goto L4d
        L57:
            int r0 = r6.getBottom()
            if (r2 <= r0) goto L46
        L5d:
            r0 = 1
            goto L47
        L5f:
            if (r6 != 0) goto L62
            r6 = r13
        L62:
            if (r15 < r9) goto L71
            if (r0 > r10) goto L71
            r1 = 0
        L67:
            android.view.View r0 = r13.findFocus()
            if (r6 == r0) goto L70
            r6.requestFocus(r14)
        L70:
            return r1
        L71:
            int r15 = r15 - r9
            if (r12 != 0) goto L76
            int r15 = r16 - r10
        L76:
            r13.A05(r15)
            r1 = 1
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0C(int, int, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0D(int r13, int r14, int r15, int r16) {
        /*
            r12 = this;
            r8 = 0
            int r5 = r12.getOverScrollMode()
            int r1 = r12.computeHorizontalScrollRange()
            int r0 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r3 = 1
            r2 = 0
            if (r1 <= r0) goto L13
            r2 = 1
        L13:
            r12.computeVerticalScrollRange()
            r12.computeVerticalScrollExtent()
            int r6 = r14 + r8
            r2 = 0
            int r7 = r15 + r13
            int r1 = -r8
            int r0 = r8 + r16
            if (r6 <= r8) goto L4b
            r6 = 0
        L24:
            r2 = 1
        L25:
            if (r7 <= r0) goto L45
            r7 = r0
        L28:
            r1 = 1
            X.0kc r0 = r12.A0M
            android.view.ViewParent r0 = r0.A00(r3)
            if (r0 != 0) goto L3c
            android.widget.OverScroller r5 = r12.A0D
            int r11 = r12.getScrollRange()
            r9 = r8
            r10 = r8
            r5.springBack(r6, r7, r8, r9, r10, r11)
        L3c:
            r12.onOverScrolled(r6, r7, r2, r1)
            if (r2 != 0) goto L43
            if (r1 == 0) goto L44
        L43:
            r4 = 1
        L44:
            return r4
        L45:
            if (r7 >= r1) goto L49
            r7 = r1
            goto L28
        L49:
            r1 = 0
            goto L3c
        L4b:
            if (r6 >= r1) goto L25
            r6 = r1
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0D(int, int, int, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0030, code lost:
        if (r2 <= ((getHeight() - getPaddingTop()) - getPaddingBottom())) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0E(android.view.KeyEvent r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0E(android.view.KeyEvent):boolean");
    }

    public final boolean A0F(View view, int i, int i2) {
        Rect rect = this.A0L;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // X.InterfaceC02890Dh
    public void AMK(View view, int i, int i2, int[] iArr, int i3) {
        this.A0M.A04(i, i2, iArr, null, i3);
    }

    @Override // X.InterfaceC02890Dh
    public void AML(View view, int i, int i2, int i3, int i4, int i5) {
        A07(i4, i5, null);
    }

    @Override // X.InterfaceC02880Dg
    public void AMM(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        A07(i4, i5, iArr);
    }

    @Override // X.InterfaceC02890Dh
    public void AMN(View view, View view2, int i, int i2) {
        C13120kd c13120kd = this.A0N;
        if (i2 == 1) {
            c13120kd.A00 = i;
        } else {
            c13120kd.A01 = i;
        }
        this.A0M.A02(2, i2);
    }

    @Override // X.InterfaceC02890Dh
    public void APB(View view, int i) {
        C13120kd c13120kd = this.A0N;
        if (i == 1) {
            c13120kd.A00 = 0;
        } else {
            c13120kd.A01 = 0;
        }
        this.A0M.A01(i);
    }

    @Override // X.InterfaceC02860De
    public void AVB(int i) {
        this.A0M.A01(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.A0D.isFinished()) {
            return;
        }
        this.A0D.computeScrollOffset();
        int currY = this.A0D.getCurrY();
        int i = currY - this.A03;
        this.A03 = currY;
        int[] iArr = this.A0O;
        iArr[1] = 0;
        C13110kc c13110kc = this.A0M;
        c13110kc.A04(0, i, iArr, null, 1);
        int i2 = i - iArr[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            A0D(i2, getScrollX(), scrollY, scrollRange);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            iArr[1] = 0;
            c13110kc.A03(0, scrollY2, 0, i3, this.A0P, 1, iArr);
            int i4 = i3 - iArr[1];
            if (i4 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    A03();
                    if (i4 < 0) {
                        if (this.A0C.isFinished()) {
                            this.A0C.onAbsorb((int) this.A0D.getCurrVelocity());
                        }
                    } else if (this.A0B.isFinished()) {
                        this.A0B.onAbsorb((int) this.A0D.getCurrVelocity());
                    }
                }
                this.A0D.abortAnimation();
                c13110kc.A01(1);
            }
        }
        if (!this.A0D.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            c13110kc.A01(1);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0E(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent viewParent;
        C13110kc c13110kc = this.A0M;
        if (!c13110kc.A02 || (viewParent = c13110kc.A01) == null) {
            return false;
        }
        return C07O.A15(viewParent, c13110kc.A04, f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent viewParent;
        C13110kc c13110kc = this.A0M;
        if (!c13110kc.A02 || (viewParent = c13110kc.A01) == null) {
            return false;
        }
        return C07O.A14(viewParent, c13110kc.A04, f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0M.A04(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A0M.A03(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.A0C != null) {
            int scrollY = getScrollY();
            int i = 0;
            if (!this.A0C.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate(paddingLeft, min);
                this.A0C.setSize(width, height);
                if (this.A0C.draw(canvas)) {
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save);
            }
            if (this.A0B.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i = 0 + getPaddingLeft();
            }
            if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.A0B.setSize(width2, height2);
            if (this.A0B.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C13120kd c13120kd = this.A0N;
        return c13120kd.A01 | c13120kd.A00;
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    private float getVerticalScrollFactorCompat() {
        float f = this.A00;
        if (f == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
                this.A00 = dimension;
                return dimension;
            }
            throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
        }
        return f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        ViewParent viewParent;
        C13110kc c13110kc = this.A0M;
        if (0 != 0) {
            viewParent = 0 != 1 ? null : c13110kc.A00;
        } else {
            viewParent = c13110kc.A01;
        }
        return viewParent != null;
    }

    @Override // android.view.View, X.InterfaceC02870Df
    public boolean isNestedScrollingEnabled() {
        return this.A0M.A02;
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0I = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.A0H) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.A0H) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.A01;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                            Log.e("NestedScrollView", sb.toString());
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.A02) > this.A07 && (2 & getNestedScrollAxes()) == 0) {
                                this.A0H = true;
                                this.A02 = y;
                                VelocityTracker velocityTracker = this.A09;
                                if (velocityTracker == null) {
                                    velocityTracker = VelocityTracker.obtain();
                                    this.A09 = velocityTracker;
                                }
                                velocityTracker.addMovement(motionEvent);
                                this.A06 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        A09(motionEvent);
                    }
                }
            }
            this.A0H = false;
            this.A01 = -1;
            VelocityTracker velocityTracker2 = this.A09;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.A09 = null;
            }
            if (this.A0D.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            this.A0M.A01(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.A02 = y2;
                    this.A01 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.A09;
                    if (velocityTracker3 == null) {
                        this.A09 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.A09.addMovement(motionEvent);
                    this.A0D.computeScrollOffset();
                    this.A0H = !this.A0D.isFinished();
                    this.A0M.A02(2, 0);
                }
            }
            this.A0H = false;
            VelocityTracker velocityTracker4 = this.A09;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.A09 = null;
            }
        }
        return this.A0H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0036, code lost:
        if (r2 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0038, code lost:
        if (r4 != false) goto L20;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            r5 = 0
            r6.A0J = r5
            android.view.View r0 = r6.A0A
            if (r0 == 0) goto L4d
            if (r0 == r6) goto L3a
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L4d
            android.view.View r1 = (android.view.View) r1
            r4 = 1
            if (r1 == r6) goto L38
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lb5
            android.view.View r1 = (android.view.View) r1
            r2 = 1
            if (r1 == r6) goto L36
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lb3
            android.view.View r1 = (android.view.View) r1
            boolean r0 = A00(r1, r6)
            if (r0 == 0) goto Lb3
        L36:
            if (r2 == 0) goto Lb5
        L38:
            if (r4 == 0) goto L4d
        L3a:
            android.view.View r1 = r6.A0A
            android.graphics.Rect r0 = r6.A0L
            r1.getDrawingRect(r0)
            r6.offsetDescendantRectToMyCoords(r1, r0)
            int r0 = r6.A01(r0)
            if (r0 == 0) goto L4d
            r6.scrollBy(r5, r0)
        L4d:
            r2 = 0
            r6.A0A = r2
            boolean r0 = r6.A0I
            if (r0 != 0) goto La2
            X.0l5 r0 = r6.A0F
            if (r0 == 0) goto L65
            int r1 = r6.getScrollX()
            X.0l5 r0 = r6.A0F
            int r0 = r0.A00
            r6.scrollTo(r1, r0)
            r6.A0F = r2
        L65:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L7f
            android.view.View r0 = r6.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r5 = r0.getMeasuredHeight()
            int r0 = r1.topMargin
            int r5 = r5 + r0
            int r0 = r1.bottomMargin
            int r5 = r5 + r0
        L7f:
            int r11 = r11 - r9
            int r0 = r6.getPaddingTop()
            int r11 = r11 - r0
            int r0 = r6.getPaddingBottom()
            int r11 = r11 - r0
            int r2 = r6.getScrollY()
            if (r11 >= r5) goto Lb1
            if (r2 < 0) goto Lb1
            int r0 = r11 + r2
            r1 = r2
            if (r0 <= r5) goto L99
            int r5 = r5 - r11
            r1 = r5
        L99:
            if (r1 == r2) goto La2
            int r0 = r6.getScrollX()
            r6.scrollTo(r0, r1)
        La2:
            int r1 = r6.getScrollX()
            int r0 = r6.getScrollY()
            r6.scrollTo(r1, r0)
            r0 = 1
            r6.A0I = r0
            return
        Lb1:
            r1 = 0
            goto L99
        Lb3:
            r2 = 0
            goto L36
        Lb5:
            r4 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A0G && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        A04((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.A0M.A04(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        A07(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0N.A01 = i;
        this.A0M.A02(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || (true ^ A0F(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C13330l5)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C13330l5 c13330l5 = (C13330l5) parcelable;
        super.onRestoreInstanceState(c13330l5.getSuperState());
        this.A0F = c13330l5;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C13330l5 c13330l5 = new C13330l5(super.onSaveInstanceState());
        c13330l5.A00 = getScrollY();
        return c13330l5;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC13310l3 interfaceC13310l3 = this.A0E;
        if (interfaceC13310l3 != null) {
            interfaceC13310l3.AOL(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !A0F(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.A0L;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        A05(A01(rect));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public void onStopNestedScroll(View view) {
        this.A0N.A01 = 0;
        AVB(0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        ViewParent viewParent;
        if (this.A09 == null) {
            this.A09 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A06 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.A06);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.A09;
                velocityTracker.computeCurrentVelocity(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, this.A04);
                int yVelocity = (int) velocityTracker.getYVelocity(this.A01);
                if (Math.abs(yVelocity) >= this.A05) {
                    int i = -yVelocity;
                    float f = i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        A04(i);
                    }
                } else if (this.A0D.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.A01 = -1;
                A02();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.A01);
                if (findPointerIndex == -1) {
                    StringBuilder A0P = C000200d.A0P("Invalid pointerId=");
                    A0P.append(this.A01);
                    A0P.append(" in onTouchEvent");
                    Log.e("NestedScrollView", A0P.toString());
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.A02 - y;
                    boolean z = this.A0H;
                    if (!z && Math.abs(i2) > this.A07) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.A0H = true;
                        z = true;
                        int i3 = this.A07;
                        i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                    }
                    if (z) {
                        int[] iArr = this.A0O;
                        int[] iArr2 = this.A0P;
                        C13110kc c13110kc = this.A0M;
                        if (c13110kc.A04(0, i2, iArr, iArr2, 0)) {
                            i2 -= iArr[1];
                            this.A06 += iArr2[1];
                        }
                        this.A02 = y - iArr2[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (A0D(i2, 0, getScrollY(), scrollRange)) {
                            if (0 != 0) {
                                viewParent = 0 != 1 ? null : c13110kc.A00;
                            } else {
                                viewParent = c13110kc.A01;
                            }
                            if (viewParent == null) {
                                this.A09.clear();
                            }
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        iArr[1] = 0;
                        c13110kc.A03(0, scrollY2, 0, i2 - scrollY2, iArr2, 0, iArr);
                        int i4 = this.A02;
                        int i5 = iArr2[1];
                        this.A02 = i4 - i5;
                        this.A06 += i5;
                        if (z2) {
                            int i6 = i2 - iArr[1];
                            A03();
                            int i7 = scrollY + i6;
                            if (i7 < 0) {
                                C07O.A0g(this.A0C, i6 / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                if (!this.A0B.isFinished()) {
                                    this.A0B.onRelease();
                                }
                            } else if (i7 > scrollRange) {
                                C07O.A0g(this.A0B, i6 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                if (!this.A0C.isFinished()) {
                                    this.A0C.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.A0C;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.A0B.isFinished())) {
                                postInvalidateOnAnimation();
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.A0H && getChildCount() > 0 && this.A0D.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.A01 = -1;
                A02();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.A02 = (int) motionEvent.getY(actionIndex);
                this.A01 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                A09(motionEvent);
                this.A02 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.A01));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z3 = !this.A0D.isFinished();
            this.A0H = z3;
            if (z3 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.A0D.isFinished()) {
                this.A0D.abortAnimation();
                this.A0M.A01(1);
            }
            this.A02 = (int) motionEvent.getY();
            this.A01 = motionEvent.getPointerId(0);
            this.A0M.A02(2, 0);
        }
        VelocityTracker velocityTracker2 = this.A09;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.A0J) {
            Rect rect = this.A0L;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A01 = A01(rect);
            if (A01 != 0) {
                scrollBy(0, A01);
            }
        } else {
            this.A0A = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int A01 = A01(rect);
        boolean z2 = false;
        if (A01 != 0) {
            z2 = true;
            if (z) {
                scrollBy(0, A01);
            } else {
                A06(0, A01, false);
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.A09) != null) {
            velocityTracker.recycle();
            this.A09 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.A0J = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height < height2 && i2 >= 0) {
                if (height + i2 > height2) {
                    i2 = height2 - height;
                }
            } else {
                i2 = 0;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.A0G) {
            this.A0G = z;
            requestLayout();
        }
    }

    @Override // android.view.View, X.InterfaceC02870Df
    public void setNestedScrollingEnabled(boolean z) {
        C13110kc c13110kc = this.A0M;
        if (c13110kc.A02) {
            C0AT.A0O(c13110kc.A04);
        }
        c13110kc.A02 = z;
    }

    public void setOnScrollChangeListener(InterfaceC13310l3 interfaceC13310l3) {
        this.A0E = interfaceC13310l3;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.A0K = z;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.A0M.A02(i, 0);
    }

    @Override // android.view.View, X.InterfaceC02870Df
    public void stopNestedScroll() {
        AVB(0);
    }
}
