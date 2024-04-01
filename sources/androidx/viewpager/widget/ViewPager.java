package androidx.viewpager.widget;

import X.AbstractC13390lB;
import X.C02160Ac;
import X.C08370bN;
import X.C08380bO;
import X.C08970cP;
import X.C09740eg;
import X.C0AS;
import X.C0AT;
import X.C0V5;
import X.C0Z8;
import X.C0ZT;
import X.C1VB;
import X.InterfaceC16350qG;
import X.InterfaceC16360qH;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
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
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public Drawable A0Q;
    public Parcelable A0R;
    public VelocityTracker A0S;
    public EdgeEffect A0T;
    public EdgeEffect A0U;
    public C0ZT A0V;
    public C0Z8 A0W;
    public InterfaceC16360qH A0X;
    public C08970cP A0Y;
    public ClassLoader A0Z;
    public ArrayList A0a;
    public List A0b;
    public List A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final Rect A0l;
    public final C08380bO A0m;
    public final Runnable A0n;
    public final ArrayList A0o;
    public Scroller mScroller;
    public static final int[] A0s = {16842931};
    public static final Comparator A0r = new Comparator() { // from class: X.0bL
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((C08380bO) obj).A02 - ((C08380bO) obj2).A02;
        }
    };
    public static final Interpolator A0p = new Interpolator() { // from class: X.0bM
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public static final C08370bN A0q = new Comparator() { // from class: X.0bN
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            C09740eg c09740eg = (C09740eg) ((View) obj).getLayoutParams();
            C09740eg c09740eg2 = (C09740eg) ((View) obj2).getLayoutParams();
            boolean z = c09740eg.A04;
            if (z != c09740eg2.A04) {
                return z ? 1 : -1;
            }
            return c09740eg.A03 - c09740eg2.A03;
        }
    };

    /* loaded from: classes.dex */
    public @interface DecorView {
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0o = new ArrayList();
        this.A0m = new C08380bO();
        this.A0l = new Rect();
        this.A0M = -1;
        this.A0R = null;
        this.A0Z = null;
        this.A00 = -3.4028235E38f;
        this.A05 = Float.MAX_VALUE;
        this.A0J = 1;
        this.A06 = -1;
        this.A0e = true;
        this.A0n = new Runnable() { // from class: X.0bP
            {
                ViewPager.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewPager viewPager = ViewPager.this;
                viewPager.setScrollState(0);
                viewPager.A07(viewPager.A0A);
            }
        };
        this.A0N = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.mScroller = new Scroller(context2, A0p);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.A0P = viewConfiguration.getScaledPagingTouchSlop();
        this.A0I = (int) (400.0f * f);
        this.A0H = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0T = new EdgeEffect(context2);
        this.A0U = new EdgeEffect(context2);
        this.A0F = (int) (25.0f * f);
        this.A09 = (int) (2.0f * f);
        this.A0C = (int) (f * 16.0f);
        C0AT.A0c(this, new C0AS() { // from class: X.0bQ
            {
                ViewPager.this = this;
            }

            @Override // X.C0AS
            public void A02(View view, AccessibilityEvent accessibilityEvent) {
                C0ZT c0zt;
                this.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setClassName(ViewPager.class.getName());
                ViewPager viewPager = ViewPager.this;
                C0ZT c0zt2 = viewPager.A0V;
                boolean z = true;
                accessibilityEvent.setScrollable((c0zt2 == null || c0zt2.A0B() <= 1) ? false : false);
                if (accessibilityEvent.getEventType() != 4096 || (c0zt = viewPager.A0V) == null) {
                    return;
                }
                accessibilityEvent.setItemCount(c0zt.A0B());
                accessibilityEvent.setFromIndex(viewPager.A0A);
                accessibilityEvent.setToIndex(viewPager.A0A);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x001c, code lost:
                if (r1 <= 1) goto L14;
             */
            @Override // X.C0AS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A04(android.view.View r6, X.C08420bS r7) {
                /*
                    r5 = this;
                    android.view.View$AccessibilityDelegate r0 = r5.A01
                    android.view.accessibility.AccessibilityNodeInfo r4 = r7.A02
                    r0.onInitializeAccessibilityNodeInfo(r6, r4)
                    java.lang.Class<androidx.viewpager.widget.ViewPager> r0 = androidx.viewpager.widget.ViewPager.class
                    java.lang.String r0 = r0.getName()
                    r4.setClassName(r0)
                    androidx.viewpager.widget.ViewPager r3 = androidx.viewpager.widget.ViewPager.this
                    X.0ZT r0 = r3.A0V
                    r2 = 1
                    if (r0 == 0) goto L1e
                    int r1 = r0.A0B()
                    r0 = 1
                    if (r1 > r2) goto L1f
                L1e:
                    r0 = 0
                L1f:
                    r4.setScrollable(r0)
                    boolean r0 = r3.canScrollHorizontally(r2)
                    if (r0 == 0) goto L2d
                    r0 = 4096(0x1000, float:5.74E-42)
                    r4.addAction(r0)
                L2d:
                    r0 = -1
                    boolean r0 = r3.canScrollHorizontally(r0)
                    if (r0 == 0) goto L39
                    r0 = 8192(0x2000, float:1.14794E-41)
                    r4.addAction(r0)
                L39:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C08400bQ.A04(android.view.View, X.0bS):void");
            }

            @Override // X.C0AS
            public boolean A05(View view, int i, Bundle bundle) {
                if (super.A05(view, i, bundle)) {
                    return true;
                }
                if (i == 4096) {
                    ViewPager viewPager = ViewPager.this;
                    if (viewPager.canScrollHorizontally(1)) {
                        viewPager.setCurrentItem(viewPager.A0A + 1);
                        return true;
                    }
                    return false;
                } else if (i != 8192) {
                    return false;
                } else {
                    ViewPager viewPager2 = ViewPager.this;
                    if (viewPager2.canScrollHorizontally(-1)) {
                        viewPager2.setCurrentItem(viewPager2.A0A - 1);
                        return true;
                    }
                    return false;
                }
            }
        });
        if (getImportantForAccessibility() == 0) {
            C0AT.A0V(this, 1);
        }
        C0AT.A0d(this, new C0V5() { // from class: X.0bV
            public final Rect A00 = new Rect();

            {
                ViewPager.this = this;
            }

            @Override // X.C0V5
            public C07110Wv AHK(View view, C07110Wv c07110Wv) {
                C07110Wv c07110Wv2;
                C07110Wv A0F = C0AT.A0F(view, c07110Wv);
                if (A0F.A06()) {
                    return A0F;
                }
                Rect rect = this.A00;
                rect.left = A0F.A02();
                rect.top = A0F.A04();
                rect.right = A0F.A03();
                rect.bottom = A0F.A01();
                ViewPager viewPager = ViewPager.this;
                int childCount = viewPager.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewPager.getChildAt(i);
                    if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets = (WindowInsets) A0F.A00;
                        WindowInsets dispatchApplyWindowInsets = childAt.dispatchApplyWindowInsets(windowInsets);
                        if (!dispatchApplyWindowInsets.equals(windowInsets)) {
                            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
                        }
                        c07110Wv2 = C07110Wv.A00(windowInsets);
                    } else {
                        c07110Wv2 = A0F;
                    }
                    rect.left = Math.min(c07110Wv2.A02(), rect.left);
                    rect.top = Math.min(c07110Wv2.A04(), rect.top);
                    rect.right = Math.min(c07110Wv2.A03(), rect.right);
                    rect.bottom = Math.min(c07110Wv2.A01(), rect.bottom);
                }
                return A0F.A05(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    public final Rect A00(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C08380bO A01() {
        /*
            r12 = this;
            int r1 = r12.getClientWidth()
            r9 = 0
            if (r1 <= 0) goto L5f
            int r0 = r12.getScrollX()
            float r8 = (float) r0
            float r1 = (float) r1
            float r8 = r8 / r1
            int r0 = r12.A0K
            float r7 = (float) r0
            float r7 = r7 / r1
        L12:
            r11 = 0
            r10 = 1
            r2 = 0
            r1 = -1
            r6 = 0
            r5 = 1
        L18:
            java.util.ArrayList r4 = r12.A0o
            int r0 = r4.size()
            if (r6 >= r0) goto L63
            java.lang.Object r3 = r4.get(r6)
            X.0bO r3 = (X.C08380bO) r3
            if (r5 != 0) goto L3f
            int r0 = r3.A02
            int r1 = r1 + r10
            if (r0 == r1) goto L3f
            X.0bO r3 = r12.A0m
            float r9 = r9 + r2
            float r9 = r9 + r7
            r3.A00 = r9
            r3.A02 = r1
            X.0ZT r0 = r12.A0V
            float r0 = r0.A00(r1)
            r3.A01 = r0
            int r6 = r6 + (-1)
        L3f:
            float r9 = r3.A00
            float r2 = r3.A01
            float r1 = r2 + r9
            float r1 = r1 + r7
            if (r5 != 0) goto L4d
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 >= 0) goto L4d
            return r11
        L4d:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L62
            int r0 = r4.size()
            int r0 = r0 - r10
            if (r6 == r0) goto L62
            int r1 = r3.A02
            int r6 = r6 + 1
            r11 = r3
            r5 = 0
            goto L18
        L5f:
            r8 = 0
            r7 = 0
            goto L12
        L62:
            return r3
        L63:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A01():X.0bO");
    }

    public C08380bO A02(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C08380bO c08380bO = (C08380bO) arrayList.get(i2);
            if (c08380bO.A02 == i) {
                return c08380bO;
            }
            i2++;
        }
    }

    public C08380bO A03(int i, int i2) {
        C08380bO c08380bO = new C08380bO();
        c08380bO.A02 = i;
        c08380bO.A03 = this.A0V.A0C(this, i);
        c08380bO.A01 = this.A0V.A00(i);
        if (i2 >= 0) {
            ArrayList arrayList = this.A0o;
            if (i2 < arrayList.size()) {
                arrayList.add(i2, c08380bO);
                return c08380bO;
            }
        }
        this.A0o.add(c08380bO);
        return c08380bO;
    }

    public C08380bO A04(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i >= arrayList.size()) {
                return null;
            }
            C08380bO c08380bO = (C08380bO) arrayList.get(i);
            if (this.A0V.A0E(view, c08380bO.A03)) {
                return c08380bO;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x001c, code lost:
        if (r3.size() >= r8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05() {
        /*
            r12 = this;
            X.0ZT r0 = r12.A0V
            int r8 = r0.A0B()
            r12.A0E = r8
            java.util.ArrayList r3 = r12.A0o
            int r1 = r3.size()
            int r0 = r12.A0J
            int r0 = r0 << 1
            r6 = 1
            int r0 = r0 + r6
            r5 = 0
            if (r1 >= r0) goto L1e
            int r0 = r3.size()
            r11 = 1
            if (r0 < r8) goto L1f
        L1e:
            r11 = 0
        L1f:
            int r4 = r12.A0A
            r7 = 0
            r10 = 0
        L23:
            int r0 = r3.size()
            if (r7 >= r0) goto L72
            java.lang.Object r9 = r3.get(r7)
            X.0bO r9 = (X.C08380bO) r9
            X.0ZT r1 = r12.A0V
            java.lang.Object r0 = r9.A03
            int r2 = r1.A01(r0)
            r0 = -1
            if (r2 == r0) goto L64
            r0 = -2
            if (r2 != r0) goto L66
            r3.remove(r7)
            int r7 = r7 + (-1)
            if (r10 != 0) goto L4a
            X.0ZT r0 = r12.A0V
            r0.A09(r12)
            r10 = 1
        L4a:
            X.0ZT r2 = r12.A0V
            int r1 = r9.A02
            java.lang.Object r0 = r9.A03
            r2.A0D(r12, r1, r0)
            int r1 = r12.A0A
            int r0 = r9.A02
            if (r1 != r0) goto L63
            int r0 = r8 + (-1)
            int r0 = java.lang.Math.min(r1, r0)
            int r4 = java.lang.Math.max(r5, r0)
        L63:
            r11 = 1
        L64:
            int r7 = r7 + r6
            goto L23
        L66:
            int r1 = r9.A02
            if (r1 == r2) goto L64
            int r0 = r12.A0A
            if (r1 != r0) goto L6f
            r4 = r2
        L6f:
            r9.A02 = r2
            goto L63
        L72:
            if (r10 == 0) goto L79
            X.0ZT r0 = r12.A0V
            r0.A08(r12)
        L79:
            java.util.Comparator r0 = androidx.viewpager.widget.ViewPager.A0r
            java.util.Collections.sort(r3, r0)
            if (r11 == 0) goto La1
            int r3 = r12.getChildCount()
            r2 = 0
        L85:
            if (r2 >= r3) goto L9b
            android.view.View r0 = r12.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.0eg r1 = (X.C09740eg) r1
            boolean r0 = r1.A04
            if (r0 != 0) goto L98
            r0 = 0
            r1.A00 = r0
        L98:
            int r2 = r2 + 1
            goto L85
        L9b:
            r12.A0D(r4, r5, r6, r5)
            r12.requestLayout()
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A05():void");
    }

    public final void A06() {
        if (this.A0D != 0) {
            ArrayList arrayList = this.A0a;
            if (arrayList == null) {
                this.A0a = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0a.add(getChildAt(i));
            }
            Collections.sort(this.A0a, A0q);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x005d, code lost:
        if (r0 == r2) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(int r19) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A07(int):void");
    }

    public final void A08(int i) {
        C0Z8 c0z8 = this.A0W;
        if (c0z8 != null) {
            c0z8.AMi(i);
        }
        List list = this.A0c;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0Z8 c0z82 = (C0Z8) this.A0c.get(i2);
                if (c0z82 != null) {
                    c0z82.AMi(i);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.A0B
            r6 = 0
            r5 = 1
            if (r0 <= 0) goto L68
            int r11 = r12.getScrollX()
            int r7 = r12.getPaddingLeft()
            int r10 = r12.getPaddingRight()
            int r9 = r12.getWidth()
            int r4 = r12.getChildCount()
            r3 = 0
        L1b:
            if (r3 >= r4) goto L68
            android.view.View r2 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.0eg r1 = (X.C09740eg) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L52
            int r0 = r1.A02
            r8 = r0 & 7
            if (r8 == r5) goto L5b
            r0 = 3
            if (r8 == r0) goto L55
            r1 = 5
            r0 = r7
            if (r8 != r1) goto L46
            int r1 = r9 - r10
            int r0 = r2.getMeasuredWidth()
            int r1 = r1 - r0
            int r0 = r2.getMeasuredWidth()
            int r10 = r10 + r0
        L44:
            r0 = r7
            r7 = r1
        L46:
            int r7 = r7 + r11
            int r1 = r2.getLeft()
            int r7 = r7 - r1
            if (r7 == 0) goto L51
            r2.offsetLeftAndRight(r7)
        L51:
            r7 = r0
        L52:
            int r3 = r3 + 1
            goto L1b
        L55:
            int r0 = r2.getWidth()
            int r0 = r0 + r7
            goto L46
        L5b:
            int r0 = r2.getMeasuredWidth()
            int r0 = r9 - r0
            int r0 = r0 >> 1
            int r1 = java.lang.Math.max(r0, r7)
            goto L44
        L68:
            X.0Z8 r0 = r12.A0W
            if (r0 == 0) goto L6f
            r0.AMh(r13, r14, r15)
        L6f:
            java.util.List r0 = r12.A0c
            if (r0 == 0) goto L8a
            int r2 = r0.size()
            r1 = 0
        L78:
            if (r1 >= r2) goto L8a
            java.util.List r0 = r12.A0c
            java.lang.Object r0 = r0.get(r1)
            X.0Z8 r0 = (X.C0Z8) r0
            if (r0 == 0) goto L87
            r0.AMh(r13, r14, r15)
        L87:
            int r1 = r1 + 1
            goto L78
        L8a:
            X.0qH r0 = r12.A0X
            if (r0 == 0) goto Lba
            int r4 = r12.getScrollX()
            int r3 = r12.getChildCount()
        L96:
            if (r6 >= r3) goto Lba
            android.view.View r2 = r12.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.0eg r0 = (X.C09740eg) r0
            boolean r0 = r0.A04
            if (r0 != 0) goto Lb7
            int r0 = r2.getLeft()
            int r0 = r0 - r4
            float r1 = (float) r0
            int r0 = r12.getClientWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            X.0qH r0 = r12.A0X
            r0.AVg(r2, r1)
        Lb7:
            int r6 = r6 + 1
            goto L96
        Lba:
            r12.A0d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A09(int, float, int):void");
    }

    public final void A0A(int i, int i2, int i3, int i4) {
        float f;
        if (i2 > 0 && !this.A0o.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        C08380bO A02 = A02(this.A0A);
        if (A02 != null) {
            f = Math.min(A02.A00, this.A05);
        } else {
            f = 0.0f;
        }
        int paddingLeft = (int) (f * ((i - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft == getScrollX()) {
            return;
        }
        A0G(false);
        scrollTo(paddingLeft, getScrollY());
    }

    public void A0B(int i, boolean z) {
        this.A0j = false;
        A0D(i, z, false, 0);
    }

    public final void A0C(int i, boolean z, int i2, boolean z2) {
        int i3;
        int scrollX;
        int A00;
        C08380bO A02 = A02(i);
        if (A02 != null) {
            i3 = (int) (Math.max(this.A00, Math.min(A02.A00, this.A05)) * getClientWidth());
        } else {
            i3 = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.mScroller;
                if (scroller != null && !scroller.isFinished()) {
                    scrollX = this.A0h ? this.mScroller.getCurrX() : this.mScroller.getStartX();
                    this.mScroller.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int scrollY = getScrollY();
                int i4 = i3 - scrollX;
                int i5 = 0 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    A0G(false);
                    A07(this.A0A);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    float abs = Math.abs(i4);
                    float f = clientWidth;
                    float f2 = clientWidth >> 1;
                    float sin = (((float) Math.sin((Math.min(1.0f, (abs * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        A00 = Math.round(Math.abs(sin / abs2) * 1000.0f) << 2;
                    } else {
                        A00 = (int) (((abs / ((this.A0V.A00(this.A0A) * f) + this.A0K)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(A00, 600);
                    this.A0h = false;
                    this.mScroller.startScroll(scrollX, scrollY, i4, i5, min);
                    postInvalidateOnAnimation();
                }
            }
            if (z2) {
                A08(i);
                return;
            }
            return;
        }
        if (z2) {
            A08(i);
        }
        A0G(false);
        scrollTo(i3, 0);
        A0M(i3);
    }

    public void A0D(int i, boolean z, boolean z2, int i2) {
        C0ZT c0zt = this.A0V;
        if (c0zt != null && c0zt.A0B() > 0) {
            if (!z2 && this.A0A == i && this.A0o.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.A0V.A0B()) {
                i = this.A0V.A0B() - 1;
            }
            int i3 = this.A0J;
            int i4 = this.A0A;
            if (i > i4 + i3 || i < i4 - i3) {
                int i5 = 0;
                while (true) {
                    ArrayList arrayList = this.A0o;
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    ((C08380bO) arrayList.get(i5)).A04 = true;
                    i5++;
                }
            }
            boolean z3 = i4 != i;
            if (this.A0e) {
                this.A0A = i;
                if (z3) {
                    A08(i);
                }
                requestLayout();
                return;
            }
            A07(i);
            A0C(i, z, i2, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public final void A0E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A06) {
            int i = actionIndex == 0 ? 1 : 0;
            this.A03 = motionEvent.getX(i);
            this.A06 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.A0S;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public void A0F(C0Z8 c0z8) {
        List list = this.A0c;
        if (list == null) {
            list = new ArrayList();
            this.A0c = list;
        }
        list.add(c0z8);
    }

    public final void A0G(boolean z) {
        boolean z2 = false;
        if (this.A0N == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0M(currX);
                    }
                }
            }
        }
        this.A0j = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i >= arrayList.size()) {
                break;
            }
            C08380bO c08380bO = (C08380bO) arrayList.get(i);
            if (c08380bO.A04) {
                c08380bO.A04 = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.A0n);
            } else {
                this.A0n.run();
            }
        }
    }

    public void A0H(boolean z, InterfaceC16360qH interfaceC16360qH) {
        boolean z2 = interfaceC16360qH != null;
        boolean z3 = z2 != (this.A0X != null);
        this.A0X = interfaceC16360qH;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.A0D = z ? 2 : 1;
            this.A0L = 2;
        } else {
            this.A0D = 0;
        }
        if (z3) {
            A07(this.A0A);
        }
    }

    public boolean A0I() {
        C0ZT c0zt = this.A0V;
        if (c0zt == null || this.A0A >= c0zt.A0B() - 1) {
            return false;
        }
        A0B(this.A0A + 1, true);
        return true;
    }

    public final boolean A0J() {
        this.A06 = -1;
        this.A0g = false;
        this.A0i = false;
        VelocityTracker velocityTracker = this.A0S;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A0S = null;
        }
        this.A0T.onRelease();
        this.A0U.onRelease();
        return this.A0T.isFinished() || this.A0U.isFinished();
    }

    public final boolean A0K(float f) {
        boolean z;
        boolean z2;
        this.A03 = f;
        float scrollX = getScrollX() + (this.A03 - f);
        float clientWidth = getClientWidth();
        float f2 = this.A00 * clientWidth;
        float f3 = this.A05 * clientWidth;
        ArrayList arrayList = this.A0o;
        boolean z3 = false;
        C08380bO c08380bO = (C08380bO) arrayList.get(0);
        C08380bO c08380bO2 = (C08380bO) arrayList.get(arrayList.size() - 1);
        if (c08380bO.A02 != 0) {
            f2 = c08380bO.A00 * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c08380bO2.A02 != this.A0V.A0B() - 1) {
            f3 = c08380bO2.A00 * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f2) {
            if (z) {
                this.A0T.onPull(Math.abs(f2 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f2;
        } else if (scrollX > f3) {
            if (z2) {
                this.A0U.onPull(Math.abs(scrollX - f3) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.A03 = (scrollX - i) + this.A03;
        scrollTo(i, getScrollY());
        A0M(i);
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x008b, code lost:
        if (r4 == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0L(int r8) {
        /*
            r7 = this;
            android.view.View r5 = r7.findFocus()
            r3 = 1
            r4 = 0
            r6 = 0
            if (r5 == r7) goto L5d
            if (r5 == 0) goto L5e
            android.view.ViewParent r1 = r5.getParent()
        Lf:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1a
            if (r1 == r7) goto L5e
            android.view.ViewParent r1 = r1.getParent()
            goto Lf
        L1a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            android.view.ViewParent r1 = r5.getParent()
        L2e:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L47
            java.lang.String r0 = " => "
            r2.append(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto L2e
        L47:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewPager"
            android.util.Log.e(r0, r1)
        L5d:
            r5 = r6
        L5e:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r7, r5, r8)
            r1 = 66
            r0 = 17
            if (r6 == 0) goto Lb8
            if (r6 == r5) goto Lb8
            if (r8 != r0) goto L9a
            android.graphics.Rect r2 = r7.A0l
            android.graphics.Rect r0 = r7.A00(r2, r6)
            int r1 = r0.left
            android.graphics.Rect r0 = r7.A00(r2, r5)
            int r0 = r0.left
            if (r5 == 0) goto L95
            if (r1 < r0) goto L95
            int r1 = r7.A0A
            if (r1 <= 0) goto L8b
            int r1 = r1 - r3
            r7.A0B(r1, r3)
            r4 = 1
        L8b:
            if (r4 == 0) goto L94
        L8d:
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r0)
        L94:
            return r4
        L95:
            boolean r4 = r6.requestFocus()
            goto L8b
        L9a:
            if (r8 != r1) goto L94
            android.graphics.Rect r2 = r7.A0l
            android.graphics.Rect r0 = r7.A00(r2, r6)
            int r1 = r0.left
            android.graphics.Rect r0 = r7.A00(r2, r5)
            int r0 = r0.left
            if (r5 == 0) goto Lb3
            if (r1 > r0) goto Lb3
            boolean r4 = r7.A0I()
            goto L8b
        Lb3:
            boolean r4 = r6.requestFocus()
            goto L8b
        Lb8:
            if (r8 == r0) goto Lc6
            if (r8 == r3) goto Lc6
            if (r8 == r1) goto Lc1
            r0 = 2
            if (r8 != r0) goto L94
        Lc1:
            boolean r4 = r7.A0I()
            goto L8b
        Lc6:
            int r0 = r7.A0A
            if (r0 <= 0) goto L94
            int r0 = r0 - r3
            r7.A0B(r0, r3)
            r4 = 1
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0L(int):boolean");
    }

    public final boolean A0M(int i) {
        if (this.A0o.size() == 0) {
            if (this.A0e) {
                return false;
            }
            this.A0d = false;
            A09(0, 0.0f, 0);
            if (this.A0d) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C08380bO A01 = A01();
        int clientWidth = getClientWidth();
        int i2 = this.A0K;
        int i3 = clientWidth + i2;
        float f = i2;
        float f2 = clientWidth;
        int i4 = A01.A02;
        float f3 = ((i / f2) - A01.A00) / (A01.A01 + (f / f2));
        this.A0d = false;
        A09(i4, f3, (int) (i3 * f3));
        if (this.A0d) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public boolean A0N(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && A0N(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        C08380bO A04;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (A04 = A04(childAt)) != null && A04.A02 == this.A0A) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        C08380bO A04;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A04 = A04(childAt)) != null && A04.A02 == this.A0A) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C09740eg c09740eg = (C09740eg) layoutParams;
        boolean z = c09740eg.A04 | (view.getClass().getAnnotation(DecorView.class) != null);
        c09740eg.A04 = z;
        if (!this.A0f) {
            super.addView(view, i, layoutParams);
        } else if (!z) {
            c09740eg.A05 = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.A0V == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.A00)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.A05));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C09740eg) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.A0h = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!A0M(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        A0G(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean A0L;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode != 61) {
                        return false;
                    }
                    if (keyEvent.hasNoModifiers()) {
                        A0L = A0L(2);
                    } else if (!keyEvent.hasModifiers(1)) {
                        return false;
                    } else {
                        A0L = A0L(1);
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    A0L = A0I();
                } else {
                    A0L = A0L(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                int i = this.A0A;
                if (i <= 0) {
                    return false;
                }
                A0B(i - 1, true);
            } else {
                A0L = A0L(17);
            }
            if (!A0L) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C08380bO A04;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A04 = A04(childAt)) != null && A04.A02 == this.A0A && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C0ZT c0zt;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (c0zt = this.A0V) != null && c0zt.A0B() > 1)) {
            if (!this.A0T.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.A00 * width);
                this.A0T.setSize(height, width);
                z = false | this.A0T.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.A0U.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.A05 + 1.0f)) * width2);
                this.A0U.setSize(height2, width2);
                z |= this.A0U.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                postInvalidateOnAnimation();
                return;
            }
            return;
        }
        this.A0T.finish();
        this.A0U.finish();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0Q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C09740eg();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C09740eg(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C0ZT getAdapter() {
        return this.A0V;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.A0D == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C09740eg) ((View) this.A0a.get(i2)).getLayoutParams()).A01;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A0A;
    }

    public int getOffscreenPageLimit() {
        return this.A0J;
    }

    public int getPageMargin() {
        return this.A0K;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0e = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.A0n);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        float f;
        super.onDraw(canvas);
        if (this.A0K > 0 && this.A0Q != null) {
            ArrayList arrayList = this.A0o;
            if (arrayList.size() > 0 && this.A0V != null) {
                int scrollX = getScrollX();
                float width2 = getWidth();
                float f2 = this.A0K / width2;
                int i = 0;
                C08380bO c08380bO = (C08380bO) arrayList.get(0);
                float f3 = c08380bO.A00;
                int size = arrayList.size();
                int i2 = ((C08380bO) arrayList.get(size - 1)).A02;
                for (int i3 = c08380bO.A02; i3 < i2; i3++) {
                    while (i3 > c08380bO.A02 && i < size) {
                        i++;
                        c08380bO = (C08380bO) arrayList.get(i);
                    }
                    if (i3 == c08380bO.A02) {
                        float f4 = c08380bO.A00 + c08380bO.A01;
                        f = f4 * width2;
                        f3 = f4 + f2;
                    } else {
                        float A00 = this.A0V.A00(i3);
                        f = (f3 + A00) * width2;
                        f3 = A00 + f2 + f3;
                    }
                    float f5 = this.A0K + f;
                    if (f5 > scrollX) {
                        this.A0Q.setBounds(Math.round(f), this.A0O, Math.round(f5), this.A07);
                        this.A0Q.draw(canvas);
                    }
                    if (f > scrollX + width) {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.A0g) {
                    return true;
                }
                if (this.A0i) {
                    return false;
                }
            }
            if (action == 0) {
                float x = motionEvent.getX();
                this.A01 = x;
                this.A03 = x;
                float y = motionEvent.getY();
                this.A02 = y;
                this.A04 = y;
                this.A06 = motionEvent.getPointerId(0);
                this.A0i = false;
                this.A0h = true;
                this.mScroller.computeScrollOffset();
                if (this.A0N == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.A09) {
                    this.mScroller.abortAnimation();
                    this.A0j = false;
                    A07(this.A0A);
                    this.A0g = true;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    A0G(false);
                    this.A0g = false;
                }
            } else if (action == 2) {
                int i = this.A06;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float f2 = x2 - this.A03;
                    float abs = Math.abs(f2);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.A02);
                    if (f2 != 0.0f) {
                        float f3 = this.A03;
                        if ((f3 >= this.A0G || f2 <= 0.0f) && ((f3 <= getWidth() - this.A0G || f2 >= 0.0f) && A0N(this, false, (int) f2, (int) x2, (int) y2))) {
                            this.A03 = x2;
                            this.A04 = y2;
                            this.A0i = true;
                            return false;
                        }
                    }
                    float f4 = this.A0P;
                    if (abs > f4 && abs * 0.5f > abs2) {
                        this.A0g = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        setScrollState(1);
                        if (f2 > 0.0f) {
                            f = this.A01 + this.A0P;
                        } else {
                            f = this.A01 - this.A0P;
                        }
                        this.A03 = f;
                        this.A04 = y2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > f4) {
                        this.A0i = true;
                    }
                    if (this.A0g && A0K(x2)) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (action == 6) {
                A0E(motionEvent);
            }
            VelocityTracker velocityTracker = this.A0S;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.A0S = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
            return this.A0g;
        }
        A0J();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x00b1, code lost:
        if (r12 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0068, code lost:
        if (r2 == 80) goto L45;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C08380bO A04;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (A04 = A04(childAt)) != null && A04.A02 == this.A0A && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1VB)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1VB c1vb = (C1VB) parcelable;
        super.onRestoreInstanceState(((AbstractC13390lB) c1vb).A00);
        C0ZT c0zt = this.A0V;
        if (c0zt != null) {
            c0zt.A07(c1vb.A01, c1vb.A02);
            A0D(c1vb.A00, false, true, 0);
            return;
        }
        this.A0M = c1vb.A00;
        this.A0R = c1vb.A01;
        this.A0Z = c1vb.A02;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1VB c1vb = new C1VB(super.onSaveInstanceState());
        c1vb.A00 = this.A0A;
        C0ZT c0zt = this.A0V;
        if (c0zt != null) {
            c1vb.A01 = c0zt.A02();
        }
        return c1vb;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A0K;
            A0A(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x00fe  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.A0f) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0cP] */
    public void setAdapter(C0ZT c0zt) {
        ArrayList arrayList;
        C0ZT c0zt2 = this.A0V;
        if (c0zt2 != null) {
            synchronized (c0zt2) {
                c0zt2.A00 = null;
            }
            this.A0V.A09(this);
            int i = 0;
            while (true) {
                arrayList = this.A0o;
                if (i >= arrayList.size()) {
                    break;
                }
                C08380bO c08380bO = (C08380bO) arrayList.get(i);
                this.A0V.A0D(this, c08380bO.A02, c08380bO.A03);
                i++;
            }
            this.A0V.A08(this);
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C09740eg) getChildAt(i2).getLayoutParams()).A04) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.A0A = 0;
            scrollTo(0, 0);
        }
        C0ZT c0zt3 = this.A0V;
        this.A0V = c0zt;
        this.A0E = 0;
        if (c0zt != null) {
            C08970cP c08970cP = this.A0Y;
            C08970cP c08970cP2 = c08970cP;
            if (c08970cP == null) {
                ?? r0 = new DataSetObserver() { // from class: X.0cP
                    {
                        ViewPager.this = this;
                    }

                    @Override // android.database.DataSetObserver
                    public void onChanged() {
                        ViewPager.this.A05();
                    }

                    @Override // android.database.DataSetObserver
                    public void onInvalidated() {
                        ViewPager.this.A05();
                    }
                };
                this.A0Y = r0;
                c08970cP2 = r0;
            }
            C0ZT c0zt4 = this.A0V;
            synchronized (c0zt4) {
                c0zt4.A00 = c08970cP2;
            }
            this.A0j = false;
            boolean z = this.A0e;
            this.A0e = true;
            this.A0E = this.A0V.A0B();
            if (this.A0M >= 0) {
                this.A0V.A07(this.A0R, this.A0Z);
                A0D(this.A0M, false, true, 0);
                this.A0M = -1;
                this.A0R = null;
                this.A0Z = null;
            } else if (!z) {
                A07(this.A0A);
            } else {
                requestLayout();
            }
        }
        List list = this.A0b;
        if (list != null && !list.isEmpty()) {
            int size = this.A0b.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((InterfaceC16350qG) this.A0b.get(i3)).AGw(this, c0zt3, c0zt);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.A0j = false;
        A0D(i, !this.A0e, false, 0);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            i = 1;
        }
        if (i != this.A0J) {
            this.A0J = i;
            A07(this.A0A);
        }
    }

    public void setOnPageChangeListener(C0Z8 c0z8) {
        this.A0W = c0z8;
    }

    public void setPageMargin(int i) {
        int i2 = this.A0K;
        this.A0K = i;
        int width = getWidth();
        A0A(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C02160Ac.A03(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.A0Q = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        int i2;
        if (this.A0N == i) {
            return;
        }
        this.A0N = i;
        if (this.A0X != null) {
            boolean z = i != 0;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (z) {
                    i2 = this.A0L;
                } else {
                    i2 = 0;
                }
                getChildAt(i3).setLayerType(i2, null);
            }
        }
        C0Z8 c0z8 = this.A0W;
        if (c0z8 != null) {
            c0z8.AMg(i);
        }
        List list = this.A0c;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0Z8 c0z82 = (C0Z8) this.A0c.get(i4);
                if (c0z82 != null) {
                    c0z82.AMg(i);
                }
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0k != z) {
            this.A0k = z;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0Q;
    }
}
