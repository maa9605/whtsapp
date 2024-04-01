package androidx.coordinatorlayout.widget;

import X.AbstractC08910cJ;
import X.AbstractC13390lB;
import X.C000200d;
import X.C006802z;
import X.C02160Ac;
import X.C07110Wv;
import X.C07O;
import X.C08930cL;
import X.C0AT;
import X.C0V5;
import X.C12450jR;
import X.C12500jX;
import X.C12510jY;
import X.C13040kV;
import X.C13120kd;
import X.C1TK;
import X.C28631Sy;
import X.InterfaceC02890Dh;
import X.ViewTreeObserver$OnPreDrawListenerC12470jU;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.search.verification.client.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC02890Dh {
    public static final C13040kV A0I;
    public static final String A0J;
    public static final ThreadLocal A0K;
    public static final Comparator A0L;
    public static final Class[] A0M;
    public Drawable A00;
    public View A01;
    public View A02;
    public ViewGroup.OnHierarchyChangeListener A03;
    public ViewTreeObserver$OnPreDrawListenerC12470jU A04;
    public C0V5 A05;
    public C07110Wv A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int[] A0B;
    public final C12500jX A0C;
    public final C13120kd A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final int[] A0H;

    /* loaded from: classes.dex */
    public @interface DefaultBehavior {
        Class value();
    }

    static {
        Package r1 = CoordinatorLayout.class.getPackage();
        A0J = r1 != null ? r1.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            A0L = new Comparator() { // from class: X.0jW
                @Override // java.util.Comparator
                public int compare(Object obj, Object obj2) {
                    View view = (View) obj2;
                    float A01 = C0AT.A01((View) obj);
                    float z = Build.VERSION.SDK_INT >= 21 ? view.getZ() : 0.0f;
                    if (A01 > z) {
                        return -1;
                    }
                    return A01 < z ? 1 : 0;
                }
            };
        }
        A0M = new Class[]{Context.class, AttributeSet.class};
        A0K = new ThreadLocal();
        A0I = new C1TK(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.A0E = new ArrayList();
        this.A0C = new C12500jX();
        this.A0G = new ArrayList();
        this.A0F = new ArrayList();
        this.A0H = new int[2];
        this.A0D = new C13120kd();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12450jR.A01, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.A0B = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int[] iArr = this.A0B;
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = (int) (iArr[i] * f);
            }
        }
        this.A00 = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        A08();
        super.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: X.0jT
            {
                CoordinatorLayout.this = this;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.A03;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
                CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                coordinatorLayout.A09(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.A03;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                }
            }
        });
    }

    public static Rect A00() {
        Rect rect = (Rect) A0I.A00();
        return rect == null ? new Rect() : rect;
    }

    public static C08930cL A01(View view) {
        C08930cL c08930cL = (C08930cL) view.getLayoutParams();
        if (!c08930cL.A0B) {
            Class<?> cls = view.getClass();
            while (true) {
                if (cls == null) {
                    break;
                }
                DefaultBehavior defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior == null) {
                    cls = cls.getSuperclass();
                } else {
                    try {
                        c08930cL.A00((AbstractC08910cJ) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                        break;
                    } catch (Exception e) {
                        StringBuilder A0P = C000200d.A0P("Default behavior class ");
                        A0P.append(defaultBehavior.value().getName());
                        A0P.append(" could not be instantiated. Did you forget");
                        A0P.append(" a default constructor?");
                        Log.e("CoordinatorLayout", A0P.toString(), e);
                    }
                }
            }
            c08930cL.A0B = true;
        }
        return c08930cL;
    }

    public static final void A02(int i, Rect rect, Rect rect2, C08930cL c08930cL, int i2, int i3) {
        int width;
        int height;
        int i4 = c08930cL.A02;
        if (i4 == 0) {
            i4 = 17;
        }
        int A01 = C07O.A01(i4, i);
        int i5 = c08930cL.A00;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int A012 = C07O.A01(i5, i);
        int i6 = A01 & 7;
        int i7 = A01 & 112;
        int i8 = A012 & 7;
        int i9 = A012 & 112;
        if (i8 == 1) {
            width = rect.left + (rect.width() >> 1);
        } else if (i8 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() >> 1);
        }
        if (i6 == 1) {
            width -= i2 >> 1;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 >> 1;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public static final void A03(View view, int i) {
        C08930cL c08930cL = (C08930cL) view.getLayoutParams();
        int i2 = c08930cL.A06;
        if (i2 != i) {
            C0AT.A0S(view, i - i2);
            c08930cL.A06 = i;
        }
    }

    public static final void A04(View view, int i) {
        C08930cL c08930cL = (C08930cL) view.getLayoutParams();
        int i2 = c08930cL.A07;
        if (i2 != i) {
            C0AT.A0T(view, i - i2);
            c08930cL.A07 = i;
        }
    }

    public final int A05(int i) {
        int[] iArr = this.A0B;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            Log.e("CoordinatorLayout", sb.toString());
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            Log.e("CoordinatorLayout", sb2.toString());
            return 0;
        }
    }

    public List A06(View view) {
        C006802z c006802z = this.A0C.A00;
        int i = c006802z.A00;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            AbstractCollection abstractCollection = (AbstractCollection) c006802z.A02[(i2 << 1) + 1];
            if (abstractCollection != null && abstractCollection.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c006802z.A02[i2 << 1]);
            }
        }
        List list = this.A0F;
        list.clear();
        if (arrayList != null) {
            list.addAll(arrayList);
        }
        return list;
    }

    public final void A07() {
        View childAt;
        int A05;
        int A01;
        AbstractC08910cJ abstractC08910cJ;
        List list = this.A0E;
        list.clear();
        C12500jX c12500jX = this.A0C;
        C006802z c006802z = c12500jX.A00;
        int i = c006802z.A00;
        for (int i2 = 0; i2 < i; i2++) {
            AbstractCollection abstractCollection = (AbstractCollection) c006802z.A02[(i2 << 1) + 1];
            if (abstractCollection != null) {
                abstractCollection.clear();
                c12500jX.A01.A01(abstractCollection);
            }
        }
        c006802z.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C08930cL A012 = A01(childAt2);
            if (A012.A05 == -1) {
                A012.A08 = null;
                A012.A09 = null;
            } else {
                View view = A012.A09;
                if (view != null && view.getId() == A012.A05) {
                    View view2 = A012.A09;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent != null && parent != childAt2) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                        } else {
                            A012.A08 = null;
                            A012.A09 = null;
                        }
                    }
                    A012.A08 = view2;
                }
                View findViewById = findViewById(A012.A05);
                A012.A09 = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (isInEditMode()) {
                            A012.A08 = null;
                            A012.A09 = null;
                        } else {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt2) {
                                if (isInEditMode()) {
                                    A012.A08 = null;
                                    A012.A09 = null;
                                } else {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = (View) parent2;
                                }
                            }
                        }
                        A012.A08 = findViewById;
                    }
                } else if (isInEditMode()) {
                    A012.A08 = null;
                    A012.A09 = null;
                } else {
                    StringBuilder A0P = C000200d.A0P("Could not find CoordinatorLayout descendant view with id ");
                    A0P.append(getResources().getResourceName(A012.A05));
                    A0P.append(" to anchor view ");
                    A0P.append(childAt2);
                    throw new IllegalStateException(A0P.toString());
                }
            }
            if (c006802z.A02(childAt2) < 0) {
                c006802z.put(childAt2, null);
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                if (i4 != i3 && ((childAt = getChildAt(i4)) == A012.A08 || (((A01 = C07O.A01(((C08930cL) childAt.getLayoutParams()).A03, (A05 = C0AT.A05(this)))) != 0 && (C07O.A01(A012.A01, A05) & A01) == A01) || ((abstractC08910cJ = A012.A0A) != null && abstractC08910cJ.A0H(this, childAt2, childAt))))) {
                    if (c006802z.A02(childAt) < 0 && c006802z.A02(childAt) < 0) {
                        c006802z.put(childAt, null);
                    }
                    if (c006802z.A02(childAt) >= 0 && c006802z.A02(childAt2) >= 0) {
                        AbstractCollection abstractCollection2 = (AbstractCollection) c006802z.getOrDefault(childAt, null);
                        if (abstractCollection2 == null) {
                            abstractCollection2 = (AbstractCollection) c12500jX.A01.A00();
                            if (abstractCollection2 == null) {
                                abstractCollection2 = new ArrayList();
                            }
                            c006802z.put(childAt, abstractCollection2);
                        }
                        abstractCollection2.add(childAt2);
                    } else {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                }
            }
        }
        ArrayList arrayList = c12500jX.A02;
        arrayList.clear();
        HashSet hashSet = c12500jX.A03;
        hashSet.clear();
        int i5 = c006802z.A00;
        for (int i6 = 0; i6 < i5; i6++) {
            c12500jX.A00(c006802z.A02[i6 << 1], arrayList, hashSet);
        }
        list.addAll(arrayList);
        Collections.reverse(list);
    }

    public final void A08() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (getFitsSystemWindows()) {
            C0V5 c0v5 = this.A05;
            if (c0v5 == null) {
                c0v5 = new C0V5() { // from class: X.1Sx
                    {
                        CoordinatorLayout.this = this;
                    }

                    @Override // X.C0V5
                    public C07110Wv AHK(View view, C07110Wv c07110Wv) {
                        CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                        if (!C07O.A18(coordinatorLayout.A06, c07110Wv)) {
                            coordinatorLayout.A06 = c07110Wv;
                            boolean z = true;
                            boolean z2 = c07110Wv.A04() > 0;
                            coordinatorLayout.A08 = z2;
                            coordinatorLayout.setWillNotDraw((z2 || coordinatorLayout.getBackground() != null) ? false : false);
                            if (!c07110Wv.A06()) {
                                int childCount = coordinatorLayout.getChildCount();
                                for (int i = 0; i < childCount; i++) {
                                    View childAt = coordinatorLayout.getChildAt(i);
                                    if (childAt.getFitsSystemWindows() && ((C08930cL) childAt.getLayoutParams()).A0A != null && c07110Wv.A06()) {
                                        break;
                                    }
                                }
                            }
                            coordinatorLayout.requestLayout();
                        }
                        return c07110Wv;
                    }
                };
                this.A05 = c0v5;
            }
            C0AT.A0d(this, c0v5);
            setSystemUiVisibility(1280);
            return;
        }
        C0AT.A0d(this, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0089, code lost:
        if (r9.top != r10.top) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0202 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A09(int r27) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A09(int):void");
    }

    public void A0A(View view) {
        List list = (List) this.A0C.A00.getOrDefault(view, null);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            AbstractC08910cJ abstractC08910cJ = ((C08930cL) view2.getLayoutParams()).A0A;
            if (abstractC08910cJ != null) {
                abstractC08910cJ.A0D(this, view2, view);
            }
        }
    }

    public void A0B(View view, int i) {
        Rect A00;
        Rect A002;
        C13040kV c13040kV;
        C08930cL c08930cL = (C08930cL) view.getLayoutParams();
        View view2 = c08930cL.A09;
        int i2 = 0;
        if (view2 == null && c08930cL.A05 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            A00 = A00();
            A002 = A00();
            try {
                C12510jY.A00(this, view2, A00);
                C08930cL c08930cL2 = (C08930cL) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                A02(i, A00, A002, c08930cL2, measuredWidth, measuredHeight);
                A0E(c08930cL2, A002, measuredWidth, measuredHeight);
                view.layout(A002.left, A002.top, A002.right, A002.bottom);
                return;
            } finally {
                A00.setEmpty();
                c13040kV = A0I;
                c13040kV.A01(A00);
                A002.setEmpty();
                c13040kV.A01(A002);
            }
        }
        int i3 = c08930cL.A04;
        if (i3 >= 0) {
            C08930cL c08930cL3 = (C08930cL) view.getLayoutParams();
            int i4 = c08930cL3.A02;
            if (i4 == 0) {
                i4 = 8388661;
            }
            int A01 = C07O.A01(i4, i);
            int i5 = A01 & 7;
            int i6 = A01 & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            int A05 = A05(i3) - measuredWidth2;
            if (i5 == 1) {
                A05 += measuredWidth2 >> 1;
            } else if (i5 == 5) {
                A05 += measuredWidth2;
            }
            if (i6 == 16) {
                i2 = 0 + (measuredHeight2 >> 1);
            } else if (i6 == 80) {
                i2 = measuredHeight2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c08930cL3).leftMargin, Math.min(A05, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c08930cL3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c08930cL3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c08930cL3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        C08930cL c08930cL4 = (C08930cL) view.getLayoutParams();
        A00 = A00();
        A00.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c08930cL4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c08930cL4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c08930cL4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c08930cL4).bottomMargin);
        if (this.A06 != null && getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            A00.left = this.A06.A02() + A00.left;
            A00.top = this.A06.A04() + A00.top;
            A00.right -= this.A06.A03();
            A00.bottom -= this.A06.A01();
        }
        A002 = A00();
        int i7 = c08930cL4.A02;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        C07O.A0T(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), A00, A002, i);
        view.layout(A002.left, A002.top, A002.right, A002.bottom);
    }

    public void A0C(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void A0D(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            C12510jY.A00(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void A0E(C08930cL c08930cL, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c08930cL).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c08930cL).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c08930cL).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c08930cL).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void A0F(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC08910cJ abstractC08910cJ = ((C08930cL) childAt.getLayoutParams()).A0A;
            if (abstractC08910cJ != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC08910cJ.A0B(this, childAt, obtain);
                } else {
                    abstractC08910cJ.A0C(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).getLayoutParams();
        }
        this.A01 = null;
        this.A07 = false;
    }

    public final boolean A0G(MotionEvent motionEvent, int i) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.A0G;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            list.add(getChildAt(i2));
        }
        Comparator comparator = A0L;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            AbstractC08910cJ abstractC08910cJ = ((C08930cL) view.getLayoutParams()).A0A;
            if (!z) {
                if (abstractC08910cJ != null) {
                    if (i == 0) {
                        z = abstractC08910cJ.A0B(this, view, motionEvent);
                    } else if (i == 1) {
                        z = abstractC08910cJ.A0C(this, view, motionEvent);
                    }
                    if (z) {
                        this.A01 = view;
                    }
                }
            } else if (actionMasked != 0 && abstractC08910cJ != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC08910cJ.A0B(this, view, motionEvent2);
                } else if (i == 1) {
                    abstractC08910cJ.A0C(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    public boolean A0H(View view, int i, int i2) {
        Rect A00 = A00();
        C12510jY.A00(this, view, A00);
        try {
            return A00.contains(i, i2);
        } finally {
            A00.setEmpty();
            A0I.A01(A00);
        }
    }

    @Override // X.InterfaceC02890Dh
    public void AMK(View view, int i, int i2, int[] iArr, int i3) {
        boolean z;
        AbstractC08910cJ abstractC08910cJ;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C08930cL c08930cL = (C08930cL) childAt.getLayoutParams();
                if (i3 != 0) {
                    if (i3 == 1) {
                        z = c08930cL.A0C;
                    }
                } else {
                    z = c08930cL.A0D;
                }
                if (z && (abstractC08910cJ = c08930cL.A0A) != null) {
                    int[] iArr2 = this.A0H;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    abstractC08910cJ.A07(this, childAt, view, i, i2, iArr2, i3);
                    int i7 = iArr2[0];
                    i4 = i > 0 ? Math.max(i4, i7) : Math.min(i4, i7);
                    int i8 = iArr2[1];
                    i5 = i2 > 0 ? Math.max(i5, i8) : Math.min(i5, i8);
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            A09(1);
        }
    }

    @Override // X.InterfaceC02890Dh
    public void AML(View view, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        AbstractC08910cJ abstractC08910cJ;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C08930cL c08930cL = (C08930cL) childAt.getLayoutParams();
                if (i5 != 0) {
                    if (i5 == 1) {
                        z = c08930cL.A0C;
                    }
                } else {
                    z = c08930cL.A0D;
                }
                if (z && (abstractC08910cJ = c08930cL.A0A) != null) {
                    abstractC08910cJ.A06(this, childAt, view, i, i2, i3, i4, i5);
                    z2 = true;
                }
            }
        }
        if (z2) {
            A09(1);
        }
    }

    @Override // X.InterfaceC02890Dh
    public void AMN(View view, View view2, int i, int i2) {
        C13120kd c13120kd = this.A0D;
        if (i2 == 1) {
            c13120kd.A00 = i;
        } else {
            c13120kd.A01 = i;
        }
        this.A02 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C08930cL c08930cL = (C08930cL) getChildAt(i3).getLayoutParams();
            if (i2 == 0) {
                boolean z = c08930cL.A0D;
            } else if (i2 == 1) {
                boolean z2 = c08930cL.A0C;
            }
        }
    }

    @Override // X.InterfaceC02890Dh
    public boolean AOu(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C08930cL c08930cL = (C08930cL) childAt.getLayoutParams();
                AbstractC08910cJ abstractC08910cJ = c08930cL.A0A;
                if (abstractC08910cJ != null) {
                    boolean A0F = abstractC08910cJ.A0F(this, childAt, view, view2, i, i2);
                    z |= A0F;
                    if (i2 == 0) {
                        c08930cL.A0D = A0F;
                    } else if (i2 == 1) {
                        c08930cL.A0C = A0F;
                    }
                } else if (i2 == 0) {
                    c08930cL.A0D = false;
                } else if (i2 == 1) {
                    c08930cL.A0C = false;
                }
            }
        }
        return z;
    }

    @Override // X.InterfaceC02890Dh
    public void APB(View view, int i) {
        boolean z;
        C13120kd c13120kd = this.A0D;
        if (i == 1) {
            c13120kd.A00 = 0;
        } else {
            c13120kd.A01 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C08930cL c08930cL = (C08930cL) childAt.getLayoutParams();
            if (i == 0) {
                z = c08930cL.A0D;
            } else if (i == 1) {
                z = c08930cL.A0C;
            }
            if (z) {
                AbstractC08910cJ abstractC08910cJ = c08930cL.A0A;
                if (abstractC08910cJ != null) {
                    abstractC08910cJ.A05(this, childAt, view, i);
                }
                if (i == 0) {
                    c08930cL.A0D = false;
                } else if (i == 1) {
                    c08930cL.A0C = false;
                }
                c08930cL.A0E = false;
            }
        }
        this.A02 = null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C08930cL) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A00;
        if (drawable == null || !drawable.isStateful() || (!false && !drawable.setState(drawableState))) {
            return;
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C08930cL();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C08930cL(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C08930cL) {
            return new C08930cL((C08930cL) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C08930cL((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C08930cL(layoutParams);
    }

    public final List getDependencySortedChildren() {
        A07();
        return Collections.unmodifiableList(this.A0E);
    }

    public final C07110Wv getLastWindowInsets() {
        return this.A06;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C13120kd c13120kd = this.A0D;
        return c13120kd.A01 | c13120kd.A00;
    }

    public Drawable getStatusBarBackground() {
        return this.A00;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A0F(false);
        if (this.A0A) {
            if (this.A04 == null) {
                this.A04 = new ViewTreeObserver$OnPreDrawListenerC12470jU(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.A04);
        }
        if (this.A06 == null && getFitsSystemWindows()) {
            if (Build.VERSION.SDK_INT >= 20) {
                requestApplyInsets();
            } else {
                requestFitSystemWindows();
            }
        }
        this.A09 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A0F(false);
        if (this.A0A && this.A04 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.A04);
        }
        View view = this.A02;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.A09 = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C07110Wv c07110Wv;
        int A04;
        super.onDraw(canvas);
        if (!this.A08 || this.A00 == null || (c07110Wv = this.A06) == null || (A04 = c07110Wv.A04()) <= 0) {
            return;
        }
        this.A00.setBounds(0, 0, getWidth(), A04);
        this.A00.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            A0F(true);
        }
        boolean A0G = A0G(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            A0F(true);
        }
        return A0G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC08910cJ abstractC08910cJ;
        int A05 = C0AT.A05(this);
        List list = this.A0E;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) list.get(i5);
            if (view.getVisibility() != 8 && ((abstractC08910cJ = ((C08930cL) view.getLayoutParams()).A0A) == null || !abstractC08910cJ.A08(this, view, A05))) {
                A0B(view, A05);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0092, code lost:
        if (getFitsSystemWindows() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00ce, code lost:
        if (r21 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0155, code lost:
        if (r21 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0157, code lost:
        r29 = java.lang.Math.max(0, (r20 - r22) - r15);
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                boolean z2 = ((C08930cL) childAt.getLayoutParams()).A0D;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC08910cJ abstractC08910cJ;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C08930cL c08930cL = (C08930cL) childAt.getLayoutParams();
                if (c08930cL.A0D && (abstractC08910cJ = c08930cL.A0A) != null) {
                    z |= abstractC08910cJ.A0E(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        AMK(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        AML(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public void onNestedScrollAccepted(View view, View view2, int i) {
        AMN(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C28631Sy)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C28631Sy c28631Sy = (C28631Sy) parcelable;
        super.onRestoreInstanceState(((AbstractC13390lB) c28631Sy).A00);
        SparseArray sparseArray = c28631Sy.A00;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC08910cJ abstractC08910cJ = A01(childAt).A0A;
            if (id != -1 && abstractC08910cJ != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC08910cJ.A04(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable A03;
        C28631Sy c28631Sy = new C28631Sy(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC08910cJ abstractC08910cJ = ((C08930cL) childAt.getLayoutParams()).A0A;
            if (id != -1 && abstractC08910cJ != null && (A03 = abstractC08910cJ.A03(this, childAt)) != null) {
                sparseArray.append(id, A03);
            }
        }
        c28631Sy.A00 = sparseArray;
        return c28631Sy;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return AOu(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC02900Di
    public void onStopNestedScroll(View view) {
        APB(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x000e, code lost:
        if (r4 != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0034  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r2 = r13.getActionMasked()
            android.view.View r0 = r12.A01
            r3 = 1
            r11 = 0
            if (r0 != 0) goto L4d
            boolean r4 = r12.A0G(r13, r3)
            if (r4 == 0) goto L4b
        L10:
            android.view.View r0 = r12.A01
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0cL r0 = (X.C08930cL) r0
            X.0cJ r1 = r0.A0A
            if (r1 == 0) goto L4b
            android.view.View r0 = r12.A01
            boolean r1 = r1.A0C(r12, r0, r13)
        L22:
            android.view.View r0 = r12.A01
            if (r0 != 0) goto L34
            boolean r0 = super.onTouchEvent(r13)
            r1 = r1 | r0
        L2b:
            if (r2 == r3) goto L30
            r0 = 3
            if (r2 != r0) goto L33
        L30:
            r12.A0F(r11)
        L33:
            return r1
        L34:
            if (r4 == 0) goto L2b
            long r4 = android.os.SystemClock.uptimeMillis()
            r8 = 3
            r9 = 0
            r6 = r4
            r10 = r9
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            super.onTouchEvent(r0)
            if (r0 == 0) goto L2b
            r0.recycle()
            goto L2b
        L4b:
            r1 = 0
            goto L22
        L4d:
            r4 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC08910cJ abstractC08910cJ = ((C08930cL) view.getLayoutParams()).A0A;
        if (abstractC08910cJ == null || !abstractC08910cJ.A0A(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.A07) {
            return;
        }
        A0F(false);
        this.A07 = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        A08();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A03 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.A00 = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.A00.setState(getDrawableState());
                }
                C07O.A0W(this.A00, C0AT.A05(this));
                this.A00.setVisible(getVisibility() == 0, false);
                this.A00.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C02160Ac.A03(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.A00;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.A00.setVisible(z, false);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A00;
    }
}
