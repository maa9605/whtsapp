package androidx.recyclerview.widget;

import X.AbstractC04890Mh;
import X.AbstractC08920cK;
import X.AbstractC13390lB;
import X.AbstractC15100o5;
import X.AbstractC15180oD;
import X.AbstractC15200oF;
import X.AbstractC15270oM;
import X.AbstractC15280oN;
import X.C000200d;
import X.C003601s;
import X.C006702y;
import X.C07O;
import X.C0AT;
import X.C0SV;
import X.C0TR;
import X.C0TS;
import X.C0Y0;
import X.C13110kc;
import X.C13160kh;
import X.C14530nA;
import X.C14550nC;
import X.C14620nJ;
import X.C14640nL;
import X.C15120o7;
import X.C15140o9;
import X.C15170oC;
import X.C15210oG;
import X.C15220oH;
import X.C15230oI;
import X.C15410oa;
import X.C15430oc;
import X.C1U8;
import X.C1UE;
import X.C1UF;
import X.C1UK;
import X.C1UL;
import X.C1UQ;
import X.C1UR;
import X.C1US;
import X.C1UT;
import X.C1UW;
import X.C1UX;
import X.C1UZ;
import X.C38551oa;
import X.InterfaceC02860De;
import X.InterfaceC09590eN;
import X.InterfaceC14630nK;
import X.InterfaceC15110o6;
import X.InterfaceC15130o8;
import X.InterfaceC15190oE;
import X.InterfaceC15240oJ;
import X.InterfaceC15420ob;
import X.RunnableC14880nj;
import X.RunnableC15290oO;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC02860De {
    public static final Interpolator A1C;
    public static final boolean A1D;
    public static final boolean A1E;
    public static final boolean A1F;
    public static final Class[] A1I;
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
    public VelocityTracker A0D;
    public EdgeEffect A0E;
    public EdgeEffect A0F;
    public EdgeEffect A0G;
    public EdgeEffect A0H;
    public C13110kc A0I;
    public C1U8 A0J;
    public C14640nL A0K;
    public C1UF A0L;
    public RunnableC14880nj A0M;
    public AbstractC04890Mh A0N;
    public InterfaceC15110o6 A0O;
    public C15120o7 A0P;
    public InterfaceC15130o8 A0Q;
    public C0TR A0R;
    public C0SV A0S;
    public AbstractC15180oD A0T;
    public InterfaceC15190oE A0U;
    public AbstractC15200oF A0V;
    public InterfaceC15240oJ A0W;
    public C1UX A0X;
    public C1UZ A0Y;
    public Runnable A0Z;
    public List A0a;
    public List A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public final int A0r;
    public final int A0s;
    public final Rect A0t;
    public final Rect A0u;
    public final RectF A0v;
    public final AccessibilityManager A0w;
    public final C15230oI A0x;
    public final C1UW A0y;
    public final C0Y0 A0z;
    public final RunnableC15290oO A10;
    public final InterfaceC15420ob A11;
    public final C15430oc A12;
    public final Runnable A13;
    public final ArrayList A14;
    public final ArrayList A15;
    public final List A16;
    public final int[] A17;
    public final int[] A18;
    public final int[] A19;
    public final int[] A1A;
    public final int[] A1B;
    public static final int[] A1H = {16843830};
    public static final int[] A1G = {16842987};

    public void setViewCacheExtension(AbstractC15280oN abstractC15280oN) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0021, code lost:
        if (r2 == 20) goto L16;
     */
    static {
        /*
            r3 = 1
            int[] r1 = new int[r3]
            r0 = 16843830(0x1010436, float:2.369658E-38)
            r4 = 0
            r1[r4] = r0
            androidx.recyclerview.widget.RecyclerView.A1H = r1
            int[] r1 = new int[r3]
            r0 = 16842987(0x10100eb, float:2.3694217E-38)
            r1[r4] = r0
            androidx.recyclerview.widget.RecyclerView.A1G = r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r2 == r0) goto L23
            r0 = 19
            if (r2 == r0) goto L23
            r1 = 20
            r0 = 0
            if (r2 != r1) goto L24
        L23:
            r0 = 1
        L24:
            androidx.recyclerview.widget.RecyclerView.A1F = r0
            r1 = 23
            r0 = 0
            if (r2 < r1) goto L2c
            r0 = 1
        L2c:
            androidx.recyclerview.widget.RecyclerView.A1D = r0
            r1 = 21
            r0 = 0
            if (r2 < r1) goto L34
            r0 = 1
        L34:
            androidx.recyclerview.widget.RecyclerView.A1E = r0
            r0 = 4
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r2[r4] = r0
            java.lang.Class<android.util.AttributeSet> r0 = android.util.AttributeSet.class
            r2[r3] = r0
            r0 = 2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2[r0] = r1
            r0 = 3
            r2[r0] = r1
            androidx.recyclerview.widget.RecyclerView.A1I = r2
            X.0o4 r0 = new X.0o4
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView.A1C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1UW] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0o7] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float A00;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.A0y = new AbstractC15100o5() { // from class: X.1UW
            {
                RecyclerView.this = this;
            }

            @Override // X.AbstractC15100o5
            public void A00() {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.A0s(null);
                recyclerView.A0z.A0D = true;
                recyclerView.A0u(true);
                if (recyclerView.A0J.A04.size() > 0) {
                    return;
                }
                recyclerView.requestLayout();
            }

            @Override // X.AbstractC15100o5
            public void A02(int i2, int i3) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.A0s(null);
                C1U8 c1u8 = recyclerView.A0J;
                if (c1u8 == null) {
                    throw null;
                }
                if (i3 >= 1) {
                    c1u8.A04.add(c1u8.A02(1, i2, i3, null));
                    c1u8.A00 |= 1;
                    if (c1u8.A04.size() == 1) {
                        A06();
                    }
                }
            }

            @Override // X.AbstractC15100o5
            public void A03(int i2, int i3) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.A0s(null);
                C1U8 c1u8 = recyclerView.A0J;
                if (c1u8 == null) {
                    throw null;
                }
                if (i3 >= 1) {
                    c1u8.A04.add(c1u8.A02(2, i2, i3, null));
                    c1u8.A00 |= 2;
                    if (c1u8.A04.size() == 1) {
                        A06();
                    }
                }
            }

            @Override // X.AbstractC15100o5
            public void A04(int i2, int i3, int i4) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.A0s(null);
                C1U8 c1u8 = recyclerView.A0J;
                if (c1u8 == null) {
                    throw null;
                }
                if (i2 != i3) {
                    if (i4 == 1) {
                        c1u8.A04.add(c1u8.A02(8, i2, i3, null));
                        c1u8.A00 |= 8;
                        if (c1u8.A04.size() == 1) {
                            A06();
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
            }

            @Override // X.AbstractC15100o5
            public void A05(int i2, int i3, Object obj) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.A0s(null);
                C1U8 c1u8 = recyclerView.A0J;
                if (c1u8 == null) {
                    throw null;
                }
                if (i3 >= 1) {
                    c1u8.A04.add(c1u8.A02(4, i2, i3, obj));
                    c1u8.A00 |= 4;
                    if (c1u8.A04.size() == 1) {
                        A06();
                    }
                }
            }

            public void A06() {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.A0i && recyclerView.A0k) {
                    recyclerView.postOnAnimation(recyclerView.A13);
                    return;
                }
                recyclerView.A0c = true;
                recyclerView.requestLayout();
            }
        };
        this.A0x = new C15230oI(this);
        this.A12 = new C15430oc();
        this.A13 = new Runnable() { // from class: X.0o2
            {
                RecyclerView.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = RecyclerView.this;
                if (!recyclerView.A0h || recyclerView.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView.A0k) {
                    recyclerView.requestLayout();
                } else if (recyclerView.A0n) {
                    recyclerView.A0o = true;
                } else {
                    recyclerView.A0H();
                }
            }
        };
        this.A0t = new Rect();
        this.A0u = new Rect();
        this.A0v = new RectF();
        this.A14 = new ArrayList();
        this.A15 = new ArrayList();
        this.A06 = 0;
        this.A0e = false;
        this.A0f = false;
        this.A09 = 0;
        this.A02 = 0;
        this.A0P = new Object() { // from class: X.0o7
        };
        this.A0R = new C38551oa();
        this.A0B = 0;
        this.A0A = -1;
        this.A00 = Float.MIN_VALUE;
        this.A01 = Float.MIN_VALUE;
        boolean z = true;
        this.A0q = true;
        this.A10 = new RunnableC15290oO(this);
        this.A0L = A1E ? new C1UF() : null;
        this.A0z = new C0Y0();
        this.A0l = false;
        this.A0m = false;
        this.A0Q = new C1UT(this);
        this.A0p = false;
        this.A17 = new int[2];
        this.A1A = new int[2];
        this.A19 = new int[2];
        this.A18 = new int[2];
        this.A1B = new int[2];
        this.A16 = new ArrayList();
        this.A0Z = new Runnable() { // from class: X.0o3
            {
                RecyclerView.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = RecyclerView.this;
                C0TR c0tr = recyclerView.A0R;
                if (c0tr != null) {
                    c0tr.A06();
                }
                recyclerView.A0p = false;
            }
        };
        this.A11 = new C1UQ(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1G, i, 0);
            this.A0d = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.A0d = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0C = viewConfiguration.getScaledTouchSlop();
        this.A00 = C13160kh.A01(viewConfiguration, context);
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = viewConfiguration.getScaledVerticalScrollFactor();
        } else {
            A00 = C13160kh.A00(viewConfiguration, context);
        }
        this.A01 = A00;
        this.A0s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0r = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.A0R.A04 = this.A0Q;
        this.A0J = new C1U8(new C1US(this));
        this.A0K = new C14640nL(new C1UR(this));
        if (C0AT.A04(this) == 0 && Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
        if (getImportantForAccessibility() == 0) {
            C0AT.A0V(this, 1);
        }
        this.A0w = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1UZ(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C14530nA.A07, i, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z2 = obtainStyledAttributes2.getBoolean(2, false);
            this.A0g = z2;
            if (z2) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                    Resources resources = getContext().getResources();
                    new C1UE(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
                } else {
                    throw new IllegalArgumentException(C000200d.A0C(this, C000200d.A0P("Trying to set fast scroller without both required drawables.")));
                }
            }
            obtainStyledAttributes2.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        StringBuilder sb = new StringBuilder();
                        sb.append(context.getPackageName());
                        sb.append(trim);
                        trim = sb.toString();
                    } else if (!trim.contains(".")) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(RecyclerView.class.getPackage().getName());
                        sb2.append('.');
                        sb2.append(trim);
                        trim = sb2.toString();
                    }
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class<? extends U> asSubclass = classLoader.loadClass(trim).asSubclass(C0SV.class);
                        try {
                            constructor = asSubclass.getConstructor(A1I);
                            objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                        } catch (NoSuchMethodException e) {
                            try {
                                constructor = asSubclass.getConstructor(new Class[0]);
                                objArr = null;
                            } catch (NoSuchMethodException e2) {
                                e2.initCause(e);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(attributeSet.getPositionDescription());
                                sb3.append(": Error creating LayoutManager ");
                                sb3.append(trim);
                                throw new IllegalStateException(sb3.toString(), e2);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((C0SV) constructor.newInstance(objArr));
                    } catch (ClassCastException e3) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(attributeSet.getPositionDescription());
                        sb4.append(": Class is not a LayoutManager ");
                        sb4.append(trim);
                        throw new IllegalStateException(sb4.toString(), e3);
                    } catch (ClassNotFoundException e4) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(attributeSet.getPositionDescription());
                        sb5.append(": Unable to find LayoutManager ");
                        sb5.append(trim);
                        throw new IllegalStateException(sb5.toString(), e4);
                    } catch (IllegalAccessException e5) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(attributeSet.getPositionDescription());
                        sb6.append(": Cannot access non-public constructor ");
                        sb6.append(trim);
                        throw new IllegalStateException(sb6.toString(), e5);
                    } catch (InstantiationException e6) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(attributeSet.getPositionDescription());
                        sb7.append(": Could not instantiate the LayoutManager: ");
                        sb7.append(trim);
                        throw new IllegalStateException(sb7.toString(), e6);
                    } catch (InvocationTargetException e7) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(attributeSet.getPositionDescription());
                        sb8.append(": Could not instantiate the LayoutManager: ");
                        sb8.append(trim);
                        throw new IllegalStateException(sb8.toString(), e7);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, A1H, i, 0);
                z = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    public static int A00(View view) {
        C0TS A01 = A01(view);
        if (A01 != null) {
            return A01.A00();
        }
        return -1;
    }

    public static C0TS A01(View view) {
        if (view == null) {
            return null;
        }
        return ((C15170oC) view.getLayoutParams()).A00;
    }

    public static RecyclerView A02(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView A02 = A02(viewGroup.getChildAt(i));
                if (A02 != null) {
                    return A02;
                }
            }
            return null;
        }
        return null;
    }

    public static void A03(View view, Rect rect) {
        C15170oC c15170oC = (C15170oC) view.getLayoutParams();
        Rect rect2 = c15170oC.A03;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c15170oC).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c15170oC).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c15170oC).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c15170oC).bottomMargin);
    }

    public static void A04(C0TS c0ts) {
        WeakReference weakReference = c0ts.A0D;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == c0ts.A0H) {
                    return;
                }
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            c0ts.A0D = null;
        }
    }

    public int A09(C0TS c0ts) {
        int i = c0ts.A00;
        if ((524 & i) == 0 && (i & 1) != 0) {
            C1U8 c1u8 = this.A0J;
            int i2 = c0ts.A05;
            ArrayList arrayList = c1u8.A04;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C14550nC c14550nC = (C14550nC) arrayList.get(i3);
                int i4 = c14550nC.A00;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = c14550nC.A02;
                        if (i5 <= i2) {
                            int i6 = c14550nC.A01;
                            int i7 = i2;
                            i2 -= i6;
                            if (i5 + i6 > i7) {
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i8 = c14550nC.A02;
                        if (i8 == i2) {
                            i2 = c14550nC.A01;
                        } else {
                            if (i8 < i2) {
                                i2--;
                            }
                            if (c14550nC.A01 <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (c14550nC.A02 <= i2) {
                    i2 += c14550nC.A01;
                }
            }
            return i2;
        }
        return -1;
    }

    public Rect A0A(View view) {
        C15170oC c15170oC = (C15170oC) view.getLayoutParams();
        if (!c15170oC.A01) {
            return c15170oC.A03;
        }
        C0Y0 c0y0 = this.A0z;
        if (c0y0.A09 && (c15170oC.A00() || c15170oC.A00.A08())) {
            return c15170oC.A03;
        }
        Rect rect = c15170oC.A03;
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.A14;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.A0t;
            rect2.set(0, 0, 0, 0);
            ((AbstractC08920cK) arrayList.get(i)).A01(rect2, view, this, c0y0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c15170oC.A01 = false;
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0016, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A0B(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r1 = r3.getParent()
        L4:
            if (r1 == 0) goto L14
            if (r1 == r2) goto L14
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L14
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r1 = r3.getParent()
            goto L4
        L14:
            if (r1 == r2) goto L17
            r3 = 0
        L17:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0B(android.view.View):android.view.View");
    }

    public C0TS A0C(int i) {
        C0TS c0ts = null;
        if (this.A0e) {
            return null;
        }
        int A01 = this.A0K.A01();
        for (int i2 = 0; i2 < A01; i2++) {
            C0TS A012 = A01(this.A0K.A04(i2));
            if (A012 != null && !A012.A09() && A09(A012) == i) {
                C14640nL c14640nL = this.A0K;
                if (!c14640nL.A02.contains(A012.A0H)) {
                    return A012;
                }
                c0ts = A012;
            }
        }
        return c0ts;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C0TS A0D(int r6, boolean r7) {
        /*
            r5 = this;
            X.0nL r0 = r5.A0K
            int r4 = r0.A01()
            r1 = 0
            r3 = 0
        L8:
            if (r3 >= r4) goto L3b
            X.0nL r0 = r5.A0K
            android.view.View r0 = r0.A04(r3)
            X.0TS r2 = A01(r0)
            if (r2 == 0) goto L22
            boolean r0 = r2.A09()
            if (r0 != 0) goto L22
            if (r7 == 0) goto L25
            int r0 = r2.A05
            if (r0 == r6) goto L2c
        L22:
            int r3 = r3 + 1
            goto L8
        L25:
            int r0 = r2.A01()
            if (r0 == r6) goto L2c
            goto L22
        L2c:
            X.0nL r0 = r5.A0K
            android.view.View r1 = r2.A0H
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L3a
            r1 = r2
            goto L22
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0D(int, boolean):X.0TS");
    }

    public C0TS A0E(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a direct child of ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        return A01(view);
    }

    public String A0F() {
        StringBuilder A0P = C000200d.A0P(" ");
        A0P.append(super.toString());
        A0P.append(", adapter:");
        A0P.append(this.A0N);
        A0P.append(", layout:");
        A0P.append(this.A0S);
        A0P.append(", context:");
        A0P.append(getContext());
        return A0P.toString();
    }

    public void A0G() {
        int A01 = this.A0K.A01();
        for (int i = 0; i < A01; i++) {
            C0TS A012 = A01(this.A0K.A04(i));
            if (!A012.A0B()) {
                A012.A03 = -1;
                A012.A06 = -1;
            }
        }
        C15230oI c15230oI = this.A0x;
        ArrayList arrayList = c15230oI.A05;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0TS c0ts = (C0TS) arrayList.get(i2);
            c0ts.A03 = -1;
            c0ts.A06 = -1;
        }
        ArrayList arrayList2 = c15230oI.A04;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C0TS c0ts2 = (C0TS) arrayList2.get(i3);
            c0ts2.A03 = -1;
            c0ts2.A06 = -1;
        }
        ArrayList arrayList3 = c15230oI.A03;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                C0TS c0ts3 = (C0TS) arrayList3.get(i4);
                c0ts3.A03 = -1;
                c0ts3.A06 = -1;
            }
        }
    }

    public void A0H() {
        if (this.A0h && !this.A0e) {
            C1U8 c1u8 = this.A0J;
            if (c1u8.A04.size() > 0) {
                int i = c1u8.A00;
                if ((i & 4) != 0 && (i & 11) == 0) {
                    C003601s.A01("RV PartialInvalidate");
                    A0R();
                    this.A09++;
                    this.A0J.A05();
                    if (!this.A0o) {
                        int A00 = this.A0K.A00();
                        int i2 = 0;
                        while (true) {
                            if (i2 < A00) {
                                C0TS A01 = A01(this.A0K.A03(i2));
                                if (A01 != null && !A01.A0B() && (A01.A00 & 2) != 0) {
                                    A0I();
                                    break;
                                }
                                i2++;
                            } else {
                                this.A0J.A03();
                                break;
                            }
                        }
                    }
                    A0v(true);
                    A0t(true);
                    C003601s.A00();
                    return;
                }
                if (!(c1u8.A04.size() > 0)) {
                    return;
                }
                C003601s.A01("RV FullInvalidate");
                A0I();
                C003601s.A00();
                return;
            }
            return;
        }
        C003601s.A01("RV FullInvalidate");
        A0I();
        C003601s.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:406:0x0345, code lost:
        if (r22.A0K.A02.contains(getFocusedChild()) == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0388, code lost:
        if (r7 != null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x038a, code lost:
        r0 = r22.A0K;
        r7 = r10.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0394, code lost:
        if (r0.A02.contains(r7) != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x039a, code lost:
        if (r7.hasFocusable() == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x03c3, code lost:
        if (r7 != null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x03c5, code lost:
        r3 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x03cc, code lost:
        if (r3 == (-1)) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x03ce, code lost:
        r1 = r7.findViewById(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x03d2, code lost:
        if (r1 == null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x03d8, code lost:
        if (r1.isFocusable() == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x03da, code lost:
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x03db, code lost:
        r7.requestFocus();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0I() {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0I():void");
    }

    public void A0J() {
        if (this.A0E != null) {
            return;
        }
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A0E = edgeEffect;
        if (this.A0d) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void A0K() {
        if (this.A0F != null) {
            return;
        }
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A0F = edgeEffect;
        if (this.A0d) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void A0L() {
        if (this.A0G != null) {
            return;
        }
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A0G = edgeEffect;
        if (this.A0d) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void A0M() {
        if (this.A0H != null) {
            return;
        }
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A0H = edgeEffect;
        if (this.A0d) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void A0N() {
        if (this.A14.size() == 0) {
            return;
        }
        C0SV c0sv = this.A0S;
        if (c0sv != null) {
            c0sv.A19("Cannot invalidate item decorations during a scroll or layout");
        }
        A0O();
        requestLayout();
    }

    public void A0O() {
        int A01 = this.A0K.A01();
        for (int i = 0; i < A01; i++) {
            ((C15170oC) this.A0K.A04(i).getLayoutParams()).A01 = true;
        }
        ArrayList arrayList = this.A0x.A05;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C15170oC c15170oC = (C15170oC) ((C0TS) arrayList.get(i2)).A0H.getLayoutParams();
            if (c15170oC != null) {
                c15170oC.A01 = true;
            }
        }
    }

    public void A0P() {
        if (this.A0p || !this.A0k) {
            return;
        }
        postOnAnimation(this.A0Z);
        this.A0p = true;
    }

    public void A0Q() {
        C0TR c0tr = this.A0R;
        if (c0tr != null) {
            c0tr.A05();
        }
        C0SV c0sv = this.A0S;
        if (c0sv != null) {
            C15230oI c15230oI = this.A0x;
            c0sv.A0U(c15230oI);
            this.A0S.A0V(c15230oI);
        }
        C15230oI c15230oI2 = this.A0x;
        c15230oI2.A04.clear();
        c15230oI2.A02();
    }

    public void A0R() {
        int i = this.A06 + 1;
        this.A06 = i;
        if (i != 1 || this.A0n) {
            return;
        }
        this.A0o = false;
    }

    public void A0S() {
        AbstractC15270oM abstractC15270oM;
        setScrollState(0);
        RunnableC15290oO runnableC15290oO = this.A10;
        runnableC15290oO.A06.removeCallbacks(runnableC15290oO);
        runnableC15290oO.A03.abortAnimation();
        C0SV c0sv = this.A0S;
        if (c0sv != null && (abstractC15270oM = c0sv.A06) != null) {
            abstractC15270oM.A01();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0055, code lost:
        if (r12.A0m == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0T() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0T():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r5.A0R == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0U() {
        /*
            r5 = this;
            r5.A0R()
            int r0 = r5.A09
            int r0 = r0 + 1
            r5.A09 = r0
            X.0Y0 r4 = r5.A0z
            r0 = 6
            r4.A01(r0)
            X.1U8 r0 = r5.A0J
            r0.A04()
            X.0Mh r0 = r5.A0N
            int r0 = r0.A0C()
            r4.A03 = r0
            r3 = 0
            r4.A00 = r3
            r4.A09 = r3
            X.0SV r1 = r5.A0S
            X.0oI r0 = r5.A0x
            r1.A0z(r0, r4)
            r4.A0D = r3
            r0 = 0
            r5.A0X = r0
            boolean r0 = r4.A0C
            r2 = 1
            if (r0 == 0) goto L37
            X.0TR r1 = r5.A0R
            r0 = 1
            if (r1 != 0) goto L38
        L37:
            r0 = 0
        L38:
            r4.A0C = r0
            r0 = 4
            r4.A04 = r0
            r5.A0t(r2)
            r5.A0v(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0U():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0034, code lost:
        if (r5.A0m != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0V() {
        /*
            r5 = this;
            boolean r0 = r5.A0e
            r3 = 0
            if (r0 == 0) goto L1c
            X.1U8 r1 = r5.A0J
            java.util.ArrayList r0 = r1.A04
            r1.A09(r0)
            java.util.ArrayList r0 = r1.A05
            r1.A09(r0)
            r1.A00 = r3
            boolean r0 = r5.A0f
            if (r0 == 0) goto L1c
            X.0SV r0 = r5.A0S
            r0.A12(r5)
        L1c:
            X.0TR r0 = r5.A0R
            if (r0 == 0) goto L72
            X.0SV r0 = r5.A0S
            boolean r0 = r0.A1D()
            if (r0 == 0) goto L72
            X.1U8 r0 = r5.A0J
            r0.A05()
        L2d:
            boolean r0 = r5.A0l
            if (r0 != 0) goto L36
            boolean r0 = r5.A0m
            r4 = 0
            if (r0 == 0) goto L37
        L36:
            r4 = 1
        L37:
            X.0Y0 r2 = r5.A0z
            boolean r0 = r5.A0h
            if (r0 == 0) goto L70
            X.0TR r0 = r5.A0R
            if (r0 == 0) goto L70
            boolean r1 = r5.A0e
            if (r1 != 0) goto L4d
            if (r4 != 0) goto L4d
            X.0SV r0 = r5.A0S
            boolean r0 = r0.A0F
            if (r0 == 0) goto L70
        L4d:
            if (r1 == 0) goto L55
            X.0Mh r0 = r5.A0N
            boolean r0 = r0.A00
            if (r0 == 0) goto L70
        L55:
            r0 = 1
        L56:
            r2.A0C = r0
            if (r0 == 0) goto L6d
            if (r4 == 0) goto L6d
            boolean r0 = r5.A0e
            if (r0 != 0) goto L6d
            X.0TR r0 = r5.A0R
            if (r0 == 0) goto L6d
            X.0SV r0 = r5.A0S
            boolean r0 = r0.A1D()
            if (r0 == 0) goto L6d
            r3 = 1
        L6d:
            r2.A0B = r3
            return
        L70:
            r0 = 0
            goto L56
        L72:
            X.1U8 r0 = r5.A0J
            r0.A04()
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0V():void");
    }

    public final void A0W() {
        VelocityTracker velocityTracker = this.A0D;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        AVB(0);
        EdgeEffect edgeEffect = this.A0F;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A0F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A0H;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.A0H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0G;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.A0G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A0E;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.A0E.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public void A0X(int i) {
        C0SV c0sv = this.A0S;
        if (c0sv == null) {
            return;
        }
        c0sv.A0u(i);
        awakenScrollBars();
    }

    public void A0Y(int i) {
        if (this.A0n) {
            return;
        }
        A0S();
        C0SV c0sv = this.A0S;
        if (c0sv == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        c0sv.A0u(i);
        awakenScrollBars();
    }

    public void A0Z(int i) {
        if (this.A0n) {
            return;
        }
        C0SV c0sv = this.A0S;
        if (c0sv == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            c0sv.A18(this, this.A0z, i);
        }
    }

    public void A0a(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.A0F;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A0F.onRelease();
            z = this.A0F.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A0G;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A0G.onRelease();
            z |= this.A0G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0H;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.A0H.onRelease();
            z |= this.A0H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A0E;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.A0E.onRelease();
            z |= this.A0E.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public void A0b(int i, int i2) {
        setMeasuredDimension(C0SV.A00(i, getPaddingRight() + getPaddingLeft(), getMinimumWidth()), C0SV.A00(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void A0c(int i, int i2) {
        this.A02++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        AbstractC15200oF abstractC15200oF = this.A0V;
        if (abstractC15200oF != null) {
            abstractC15200oF.A01(this, i, i2);
        }
        List list = this.A0b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC15200oF) this.A0b.get(size)).A01(this, i, i2);
            }
        }
        this.A02--;
    }

    public void A0d(int i, int i2) {
        C0SV c0sv = this.A0S;
        if (c0sv == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.A0n) {
        } else {
            if (!c0sv.A1A()) {
                i = 0;
            }
            if (!c0sv.A1B()) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return;
            }
            RunnableC15290oO runnableC15290oO = this.A10;
            runnableC15290oO.A02(i, i2, runnableC15290oO.A00(i, i2), A1C);
        }
    }

    public void A0e(int i, int i2, boolean z) {
        int i3 = i + i2;
        int A01 = this.A0K.A01();
        for (int i4 = 0; i4 < A01; i4++) {
            C0TS A012 = A01(this.A0K.A04(i4));
            if (A012 != null && !A012.A0B()) {
                int i5 = A012.A05;
                if (i5 >= i3) {
                    A012.A06(-i2, z);
                    this.A0z.A0D = true;
                } else if (i5 >= i) {
                    A012.A04(8);
                    A012.A06(-i2, z);
                    A012.A05 = i - 1;
                    this.A0z.A0D = true;
                }
            }
        }
        C15230oI c15230oI = this.A0x;
        ArrayList arrayList = c15230oI.A05;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0TS c0ts = (C0TS) arrayList.get(size);
                if (c0ts != null) {
                    int i6 = c0ts.A05;
                    if (i6 >= i3) {
                        c0ts.A06(-i2, z);
                    } else if (i6 >= i) {
                        c0ts.A04(8);
                        c15230oI.A04(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void A0f(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        C0TS c0ts;
        A0R();
        this.A09++;
        C003601s.A01("RV Scroll");
        C0Y0 c0y0 = this.A0z;
        A0o(c0y0);
        if (i != 0) {
            i3 = this.A0S.A0c(i, this.A0x, c0y0);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.A0S.A0d(i2, this.A0x, c0y0);
        } else {
            i4 = 0;
        }
        C003601s.A00();
        int A00 = this.A0K.A00();
        for (int i5 = 0; i5 < A00; i5++) {
            View A03 = this.A0K.A03(i5);
            C0TS A0E = A0E(A03);
            if (A0E != null && (c0ts = A0E.A0B) != null) {
                View view = c0ts.A0H;
                int left = A03.getLeft();
                int top = A03.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        A0t(true);
        A0v(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final void A0g(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0A) {
            int i = actionIndex == 0 ? 1 : 0;
            this.A0A = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.A07 = x;
            this.A04 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.A08 = y;
            this.A05 = y;
        }
    }

    public void A0h(View view) {
        C0TS A01 = A01(view);
        AbstractC04890Mh abstractC04890Mh = this.A0N;
        if (abstractC04890Mh != null && A01 != null) {
            abstractC04890Mh.A06(A01);
        }
        List list = this.A0a;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((InterfaceC09590eN) this.A0a.get(size)).AIR(view);
            }
        }
    }

    public final void A0i(View view, View view2) {
        View view3 = view;
        if (view2 != null) {
            view3 = view2;
        }
        Rect rect = this.A0t;
        rect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C15170oC) {
            C15170oC c15170oC = (C15170oC) layoutParams;
            if (!c15170oC.A01) {
                Rect rect2 = c15170oC.A03;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.A0S.A0b(this, view, rect, !this.A0h, view2 == null);
    }

    public final void A0j(AbstractC04890Mh abstractC04890Mh, boolean z, boolean z2) {
        AbstractC04890Mh abstractC04890Mh2 = this.A0N;
        if (abstractC04890Mh2 != null) {
            abstractC04890Mh2.A01.unregisterObserver(this.A0y);
            this.A0N.A0A(this);
        }
        if (!z || z2) {
            A0Q();
        }
        C1U8 c1u8 = this.A0J;
        c1u8.A09(c1u8.A04);
        c1u8.A09(c1u8.A05);
        c1u8.A00 = 0;
        AbstractC04890Mh abstractC04890Mh3 = this.A0N;
        this.A0N = abstractC04890Mh;
        if (abstractC04890Mh != null) {
            abstractC04890Mh.A01.registerObserver(this.A0y);
            abstractC04890Mh.A09(this);
        }
        C15230oI c15230oI = this.A0x;
        AbstractC04890Mh abstractC04890Mh4 = this.A0N;
        c15230oI.A04.clear();
        c15230oI.A02();
        C15220oH c15220oH = c15230oI.A02;
        if (c15220oH == null) {
            c15220oH = new C15220oH();
            c15230oI.A02 = c15220oH;
        }
        if (c15220oH != null) {
            if (abstractC04890Mh3 != null) {
                c15220oH.A00--;
            }
            if (!z && c15220oH.A00 == 0) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = c15220oH.A01;
                    if (i >= sparseArray.size()) {
                        break;
                    }
                    ((C15210oG) sparseArray.valueAt(i)).A03.clear();
                    i++;
                }
            }
            if (abstractC04890Mh4 != null) {
                c15220oH.A00++;
            }
            this.A0z.A0D = true;
            return;
        }
        throw null;
    }

    public void A0k(AbstractC08920cK abstractC08920cK) {
        C0SV c0sv = this.A0S;
        if (c0sv != null) {
            c0sv.A19("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A14;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC08920cK);
        A0O();
        requestLayout();
    }

    public void A0l(AbstractC08920cK abstractC08920cK) {
        C0SV c0sv = this.A0S;
        if (c0sv != null) {
            c0sv.A19("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A14;
        arrayList.remove(abstractC08920cK);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        A0O();
        requestLayout();
    }

    public void A0m(AbstractC15200oF abstractC15200oF) {
        List list = this.A0b;
        if (list == null) {
            list = new ArrayList();
            this.A0b = list;
        }
        list.add(abstractC15200oF);
    }

    public void A0n(AbstractC15200oF abstractC15200oF) {
        List list = this.A0b;
        if (list != null) {
            list.remove(abstractC15200oF);
        }
    }

    public final void A0o(C0Y0 c0y0) {
        if (this.A0B == 2) {
            OverScroller overScroller = this.A10.A03;
            c0y0.A06 = overScroller.getFinalX() - overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        c0y0.A06 = 0;
    }

    public final void A0p(C0TS c0ts) {
        View view = c0ts.A0H;
        boolean z = view.getParent() == this;
        this.A0x.A09(A0E(view));
        if (c0ts.A0A()) {
            this.A0K.A08(view, -1, view.getLayoutParams(), true);
            return;
        }
        C14640nL c14640nL = this.A0K;
        if (!z) {
            c14640nL.A09(view, -1, true);
            return;
        }
        int indexOfChild = ((C1UR) c14640nL.A01).A00.indexOfChild(view);
        if (indexOfChild >= 0) {
            c14640nL.A00.A04(indexOfChild);
            c14640nL.A06(view);
            return;
        }
        StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
        sb.append(view);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A0q(C0TS c0ts, int i) {
        if (this.A09 > 0) {
            c0ts.A04 = i;
            this.A16.add(c0ts);
            return;
        }
        C0AT.A0V(c0ts.A0H, i);
    }

    public void A0r(C0TS c0ts, C15140o9 c15140o9) {
        long j;
        c0ts.A05(0, 8192);
        if (this.A0z.A0E && (c0ts.A00 & 2) != 0 && !c0ts.A09() && !c0ts.A0B()) {
            if (this.A0N.A00) {
                j = c0ts.A08;
            } else {
                j = c0ts.A05;
            }
            this.A12.A01.A09(j, c0ts);
        }
        C006702y c006702y = this.A12.A00;
        C15410oa c15410oa = (C15410oa) c006702y.getOrDefault(c0ts, null);
        if (c15410oa == null) {
            c15410oa = C15410oa.A00();
            c006702y.put(c0ts, c15410oa);
        }
        c15410oa.A02 = c15140o9;
        c15410oa.A00 |= 4;
    }

    public void A0s(String str) {
        if (this.A09 > 0) {
            if (str == null) {
                throw new IllegalStateException(C000200d.A0C(this, C000200d.A0P("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.A02 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C000200d.A0C(this, C000200d.A0P(""))));
        }
    }

    public void A0t(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.A09 - 1;
        this.A09 = i2;
        if (i2 < 1) {
            this.A09 = 0;
            if (z) {
                int i3 = this.A03;
                this.A03 = 0;
                if (i3 != 0 && (accessibilityManager = this.A0w) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    if (Build.VERSION.SDK_INT >= 19) {
                        obtain.setContentChangeTypes(i3);
                    }
                    sendAccessibilityEventUnchecked(obtain);
                }
                List list = this.A16;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0TS c0ts = (C0TS) list.get(size);
                    if (c0ts.A0H.getParent() == this && !c0ts.A0B() && (i = c0ts.A04) != -1) {
                        C0AT.A0V(c0ts.A0H, i);
                        c0ts.A04 = -1;
                    }
                }
                list.clear();
            }
        }
    }

    public void A0u(boolean z) {
        this.A0f = z | this.A0f;
        this.A0e = true;
        int A01 = this.A0K.A01();
        for (int i = 0; i < A01; i++) {
            C0TS A012 = A01(this.A0K.A04(i));
            if (A012 != null && !A012.A0B()) {
                A012.A04(6);
            }
        }
        A0O();
        C15230oI c15230oI = this.A0x;
        ArrayList arrayList = c15230oI.A05;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0TS c0ts = (C0TS) arrayList.get(i2);
            if (c0ts != null) {
                c0ts.A04(6);
                c0ts.A04(1024);
            }
        }
        AbstractC04890Mh abstractC04890Mh = c15230oI.A07.A0N;
        if (abstractC04890Mh == null || !abstractC04890Mh.A00) {
            c15230oI.A02();
        }
    }

    public void A0v(boolean z) {
        int i = this.A06;
        if (i < 1) {
            this.A06 = 1;
            i = 1;
        }
        if (!z && !this.A0n) {
            this.A0o = false;
        }
        if (i == 1) {
            if (z && this.A0o && !this.A0n && this.A0S != null && this.A0N != null) {
                A0I();
            }
            if (!this.A0n) {
                this.A0o = false;
            }
        }
        this.A06--;
    }

    public final void A0w(int[] iArr) {
        int A00 = this.A0K.A00();
        if (A00 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        for (int i3 = 0; i3 < A00; i3++) {
            C0TS A01 = A01(this.A0K.A03(i3));
            if (!A01.A0B()) {
                int A012 = A01.A01();
                if (A012 < i) {
                    i = A012;
                }
                if (A012 > i2) {
                    i2 = A012;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public boolean A0x() {
        return getScrollingChildHelper().A00(1) != null;
    }

    public boolean A0y(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().A03(i, i2, i3, i4, iArr, i5, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x00ee, code lost:
        if (r4 == 0.0f) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0z(int r20, int r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0z(int, int, android.view.MotionEvent):boolean");
    }

    public boolean A10(int i, int i2, int[] iArr) {
        return getScrollingChildHelper().A04(i, i2, iArr, null, 1);
    }

    @Override // X.InterfaceC02860De
    public void AVB(int i) {
        getScrollingChildHelper().A01(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C15170oC) && this.A0S.A1E((C15170oC) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        C0SV c0sv = this.A0S;
        if (c0sv != null && c0sv.A1A()) {
            return c0sv.A0g(this.A0z);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        C0SV c0sv = this.A0S;
        if (c0sv != null && c0sv.A1A()) {
            return c0sv.A0h(this.A0z);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        C0SV c0sv = this.A0S;
        if (c0sv != null && c0sv.A1A()) {
            return c0sv.A0i(this.A0z);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        C0SV c0sv = this.A0S;
        if (c0sv != null && c0sv.A1B()) {
            return c0sv.A0j(this.A0z);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        C0SV c0sv = this.A0S;
        if (c0sv != null && c0sv.A1B()) {
            return c0sv.A0k(this.A0z);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        C0SV c0sv = this.A0S;
        if (c0sv != null && c0sv.A1B()) {
            return c0sv.A0l(this.A0z);
        }
        return 0;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent viewParent;
        C13110kc scrollingChildHelper = getScrollingChildHelper();
        if (!scrollingChildHelper.A02 || (viewParent = scrollingChildHelper.A01) == null) {
            return false;
        }
        return C07O.A15(viewParent, scrollingChildHelper.A04, f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent viewParent;
        C13110kc scrollingChildHelper = getScrollingChildHelper();
        if (!scrollingChildHelper.A02 || (viewParent = scrollingChildHelper.A01) == null) {
            return false;
        }
        return C07O.A14(viewParent, scrollingChildHelper.A04, f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A04(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().A03(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0078, code lost:
        if (r1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00ae, code lost:
        if (r1 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x004a, code lost:
        if (r0.draw(r8) == false) goto L71;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0013, code lost:
        if (r19.A0n != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0040, code lost:
        if (r14.findNextFocus(r19, r20, r21 == 2 ? 130 : 33) == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0042, code lost:
        A0H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0049, code lost:
        if (A0B(r20) != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x004b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x006d, code lost:
        if (r14.findNextFocus(r19, r20, (X.C0AT.A05(r1.A07) == 1) ^ (r21 == 2) ? 66 : 17) == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0070, code lost:
        A0R();
        r19.A0S.A0n(r20, r21, r19.A0x, r19.A0z);
        A0v(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00a6, code lost:
        if (r4 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x012d, code lost:
        if (r18 > 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0156, code lost:
        if (r2 <= r1) goto L51;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r20, int r21) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0SV c0sv = this.A0S;
        if (c0sv != null) {
            return c0sv.A0o();
        }
        throw new IllegalStateException(C000200d.A0C(this, C000200d.A0P("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0SV c0sv = this.A0S;
        if (c0sv != null) {
            return c0sv.A0p(getContext(), attributeSet);
        }
        throw new IllegalStateException(C000200d.A0C(this, C000200d.A0P("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0SV c0sv = this.A0S;
        if (c0sv != null) {
            return c0sv.A0q(layoutParams);
        }
        throw new IllegalStateException(C000200d.A0C(this, C000200d.A0P("RecyclerView has no LayoutManager")));
    }

    public AbstractC04890Mh getAdapter() {
        return this.A0N;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.A0S != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC15110o6 interfaceC15110o6 = this.A0O;
        if (interfaceC15110o6 == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        C1UK c1uk = (C1UK) interfaceC15110o6;
        C1UL c1ul = c1uk.A00;
        View view = c1ul.A0G;
        if (view != null) {
            int i3 = c1ul.A0A;
            if (i3 == -1) {
                i3 = c1ul.A0M.indexOfChild(view);
                c1uk.A00.A0A = i3;
            }
            if (i2 == i - 1) {
                return i3;
            }
            if (i2 >= i3) {
                return i2 + 1;
            }
        }
        return i2;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0d;
    }

    public C1UZ getCompatAccessibilityDelegate() {
        return this.A0Y;
    }

    public C15120o7 getEdgeEffectFactory() {
        return this.A0P;
    }

    public C0TR getItemAnimator() {
        return this.A0R;
    }

    public int getItemDecorationCount() {
        return this.A14.size();
    }

    public C0SV getLayoutManager() {
        return this.A0S;
    }

    public int getMaxFlingVelocity() {
        return this.A0r;
    }

    public int getMinFlingVelocity() {
        return this.A0s;
    }

    public long getNanoTime() {
        if (A1E) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC15180oD getOnFlingListener() {
        return this.A0T;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0q;
    }

    public C15220oH getRecycledViewPool() {
        C15230oI c15230oI = this.A0x;
        C15220oH c15220oH = c15230oI.A02;
        if (c15220oH == null) {
            C15220oH c15220oH2 = new C15220oH();
            c15230oI.A02 = c15220oH2;
            return c15220oH2;
        }
        return c15220oH;
    }

    public int getScrollState() {
        return this.A0B;
    }

    private C13110kc getScrollingChildHelper() {
        C13110kc c13110kc = this.A0I;
        if (c13110kc == null) {
            C13110kc c13110kc2 = new C13110kc(this);
            this.A0I = c13110kc2;
            return c13110kc2;
        }
        return c13110kc;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        C13110kc scrollingChildHelper = getScrollingChildHelper();
        ViewParent viewParent = null;
        if (0 != 0) {
            if (0 == 1) {
                viewParent = scrollingChildHelper.A00;
            }
        } else {
            viewParent = scrollingChildHelper.A01;
        }
        return viewParent != null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.A0k;
    }

    @Override // android.view.View, X.InterfaceC02870Df
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0012, code lost:
        if (isLayoutRequested() != false) goto L23;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r3 = 0
            r5.A09 = r3
            r2 = 1
            r5.A0k = r2
            boolean r0 = r5.A0h
            if (r0 == 0) goto L14
            boolean r1 = r5.isLayoutRequested()
            r0 = 1
            if (r1 == 0) goto L15
        L14:
            r0 = 0
        L15:
            r5.A0h = r0
            X.0SV r0 = r5.A0S
            if (r0 == 0) goto L1d
            r0.A0B = r2
        L1d:
            r5.A0p = r3
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A1E
            if (r0 == 0) goto L62
            java.lang.ThreadLocal r4 = X.RunnableC14880nj.A05
            java.lang.Object r0 = r4.get()
            X.0nj r0 = (X.RunnableC14880nj) r0
            r5.A0M = r0
            if (r0 != 0) goto L5b
            X.0nj r0 = new X.0nj
            r0.<init>()
            r5.A0M = r0
            android.view.Display r1 = X.C0AT.A0B(r5)
            r3 = 1114636288(0x42700000, float:60.0)
            boolean r0 = r5.isInEditMode()
            if (r0 != 0) goto L4f
            if (r1 == 0) goto L4f
            float r1 = r1.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L4f
            r3 = r1
        L4f:
            X.0nj r2 = r5.A0M
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0 / r3
            long r0 = (long) r0
            r2.A00 = r0
            r4.set(r2)
        L5b:
            X.0nj r0 = r5.A0M
            java.util.ArrayList r0 = r0.A02
            r0.add(r5)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC14880nj runnableC14880nj;
        super.onDetachedFromWindow();
        C0TR c0tr = this.A0R;
        if (c0tr != null) {
            c0tr.A05();
        }
        A0S();
        this.A0k = false;
        C0SV c0sv = this.A0S;
        if (c0sv != null) {
            C15230oI c15230oI = this.A0x;
            c0sv.A0B = false;
            c0sv.A17(this, c15230oI);
        }
        this.A16.clear();
        removeCallbacks(this.A0Z);
        if (this.A12 == null) {
            throw null;
        }
        do {
        } while (C15410oa.A03.A00() != null);
        if (!A1E || (runnableC14880nj = this.A0M) == null) {
            return;
        }
        runnableC14880nj.A02.remove(this);
        this.A0M = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.A14;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC08920cK) arrayList.get(i)).A00(canvas, this, this.A0z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x003c, code lost:
        if (r3 != 0.0f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0040, code lost:
        if (r2 != 0.0f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0042, code lost:
        A0z((int) (r2 * r6.A00), (int) (r3 * r6.A01), r7);
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.0SV r0 = r6.A0S
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            boolean r0 = r6.A0n
            if (r0 == 0) goto Lb
            return r5
        Lb:
            int r1 = r7.getAction()
            r0 = 8
            if (r1 != r0) goto L4d
            int r0 = r7.getSource()
            r0 = r0 & 2
            r4 = 0
            if (r0 == 0) goto L4e
            X.0SV r0 = r6.A0S
            boolean r0 = r0.A1B()
            r3 = 0
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r7.getAxisValue(r0)
            float r3 = -r0
        L2c:
            X.0SV r0 = r6.A0S
            boolean r0 = r0.A1A()
            if (r0 == 0) goto L66
            r0 = 10
            float r2 = r7.getAxisValue(r0)
        L3a:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 != 0) goto L42
        L3e:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L4d
        L42:
            float r0 = r6.A00
            float r2 = r2 * r0
            int r1 = (int) r2
            float r0 = r6.A01
            float r3 = r3 * r0
            int r0 = (int) r3
            r6.A0z(r1, r0, r7)
        L4d:
            return r5
        L4e:
            int r1 = r7.getSource()
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L4d
            r0 = 26
            float r2 = r7.getAxisValue(r0)
            X.0SV r1 = r6.A0S
            boolean r0 = r1.A1B()
            if (r0 == 0) goto L68
            float r3 = -r2
        L66:
            r2 = 0
            goto L3a
        L68:
            boolean r0 = r1.A1A()
            if (r0 == 0) goto L4d
            r3 = 0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x00eb, code lost:
        if (r4 != false) goto L58;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C003601s.A01("RV OnLayout");
        A0I();
        C003601s.A00();
        this.A0h = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C0Y0 c0y0;
        C0SV c0sv = this.A0S;
        if (c0sv == null) {
            A0b(i, i2);
        } else if (c0sv.A1C()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.A0S.A07.A0b(i, i2);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.A0N == null) {
                return;
            }
            C0Y0 c0y02 = this.A0z;
            if (c0y02.A04 == 1) {
                A0T();
            }
            this.A0S.A0K(i, i2);
            c0y02.A0A = true;
            A0U();
            this.A0S.A0L(i, i2);
            if (this.A0S.A0Z()) {
                this.A0S.A0K(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c0y02.A0A = true;
                A0U();
                this.A0S.A0L(i, i2);
            }
        } else if (this.A0i) {
            c0sv.A07.A0b(i, i2);
        } else {
            if (this.A0c) {
                A0R();
                this.A09++;
                A0V();
                A0t(true);
                c0y0 = this.A0z;
                if (c0y0.A0B) {
                    c0y0.A09 = true;
                } else {
                    this.A0J.A04();
                    c0y0.A09 = false;
                }
                this.A0c = false;
                A0v(false);
            } else {
                c0y0 = this.A0z;
                if (c0y0.A0B) {
                    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                    return;
                }
            }
            AbstractC04890Mh abstractC04890Mh = this.A0N;
            if (abstractC04890Mh != null) {
                c0y0.A03 = abstractC04890Mh.A0C();
            } else {
                c0y0.A03 = 0;
            }
            A0R();
            this.A0S.A07.A0b(i, i2);
            A0v(false);
            c0y0.A09 = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.A09 > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1UX)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1UX c1ux = (C1UX) parcelable;
        this.A0X = c1ux;
        super.onRestoreInstanceState(((AbstractC13390lB) c1ux).A00);
        C0SV c0sv = this.A0S;
        if (c0sv == null || (parcelable2 = this.A0X.A00) == null) {
            return;
        }
        c0sv.A0x(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1UX c1ux = new C1UX(super.onSaveInstanceState());
        C1UX c1ux2 = this.A0X;
        if (c1ux2 != null) {
            c1ux.A00 = c1ux2.A00;
            return c1ux;
        }
        C0SV c0sv = this.A0S;
        if (c0sv != null) {
            c1ux.A00 = c0sv.A0m();
            return c1ux;
        }
        c1ux.A00 = null;
        return c1ux;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.A0E = null;
            this.A0H = null;
            this.A0G = null;
            this.A0F = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x017b, code lost:
        if (r7 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x01f5, code lost:
        if (r13 != false) goto L128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x013b  */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        C0TS A01 = A01(view);
        if (A01 != null) {
            if (A01.A0A()) {
                A01.A00 &= -257;
            } else if (!A01.A0B()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(A01);
                throw new IllegalArgumentException(C000200d.A0C(this, sb));
            }
        }
        view.clearAnimation();
        A0h(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        AbstractC15270oM abstractC15270oM = this.A0S.A06;
        if ((abstractC15270oM == null || !abstractC15270oM.A05) && this.A09 <= 0 && view2 != null) {
            A0i(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A0S.A0b(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.A15;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC15190oE) arrayList.get(i)).ANv(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.A06 == 0 && !this.A0n) {
            super.requestLayout();
        } else {
            this.A0o = true;
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        C0SV c0sv = this.A0S;
        if (c0sv == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.A0n) {
        } else {
            boolean A1A = c0sv.A1A();
            boolean A1B = c0sv.A1B();
            if (A1A) {
                if (!A1B) {
                    i2 = 0;
                }
            } else if (!A1B) {
                return;
            } else {
                i = 0;
            }
            A0z(i, i2, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int contentChangeTypes;
        if (this.A09 > 0) {
            int i = 0;
            if (accessibilityEvent != null && Build.VERSION.SDK_INT >= 19 && (contentChangeTypes = accessibilityEvent.getContentChangeTypes()) != 0) {
                i = contentChangeTypes;
            }
            this.A03 |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1UZ c1uz) {
        this.A0Y = c1uz;
        C0AT.A0c(this, c1uz);
    }

    public void setAdapter(AbstractC04890Mh abstractC04890Mh) {
        setLayoutFrozen(false);
        A0j(abstractC04890Mh, false, true);
        A0u(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC15110o6 interfaceC15110o6) {
        if (interfaceC15110o6 == this.A0O) {
            return;
        }
        this.A0O = interfaceC15110o6;
        setChildrenDrawingOrderEnabled(interfaceC15110o6 != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.A0d) {
            this.A0E = null;
            this.A0H = null;
            this.A0G = null;
            this.A0F = null;
        }
        this.A0d = z;
        super.setClipToPadding(z);
        if (this.A0h) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C15120o7 c15120o7) {
        if (c15120o7 != null) {
            this.A0P = c15120o7;
            this.A0E = null;
            this.A0H = null;
            this.A0G = null;
            this.A0F = null;
            return;
        }
        throw null;
    }

    public void setHasFixedSize(boolean z) {
        this.A0i = z;
    }

    public void setItemAnimator(C0TR c0tr) {
        C0TR c0tr2 = this.A0R;
        if (c0tr2 != null) {
            c0tr2.A05();
            this.A0R.A04 = null;
        }
        this.A0R = c0tr;
        if (c0tr != null) {
            c0tr.A04 = this.A0Q;
        }
    }

    public void setItemViewCacheSize(int i) {
        C15230oI c15230oI = this.A0x;
        c15230oI.A00 = i;
        c15230oI.A03();
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.A0n) {
            A0s("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.A0n = false;
                if (this.A0o && this.A0S != null && this.A0N != null) {
                    requestLayout();
                }
                this.A0o = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.A0n = true;
            this.A0j = true;
            A0S();
        }
    }

    public void setLayoutManager(C0SV c0sv) {
        C15230oI c15230oI;
        if (c0sv == this.A0S) {
            return;
        }
        A0S();
        if (this.A0S != null) {
            C0TR c0tr = this.A0R;
            if (c0tr != null) {
                c0tr.A05();
            }
            C0SV c0sv2 = this.A0S;
            c15230oI = this.A0x;
            c0sv2.A0U(c15230oI);
            this.A0S.A0V(c15230oI);
            c15230oI.A04.clear();
            c15230oI.A02();
            if (this.A0k) {
                C0SV c0sv3 = this.A0S;
                c0sv3.A0B = false;
                c0sv3.A17(this, c15230oI);
            }
            C0SV c0sv4 = this.A0S;
            c0sv4.A07 = null;
            c0sv4.A05 = null;
            c0sv4.A03 = 0;
            c0sv4.A00 = 0;
            c0sv4.A04 = 1073741824;
            c0sv4.A01 = 1073741824;
            this.A0S = null;
        } else {
            c15230oI = this.A0x;
            c15230oI.A04.clear();
            c15230oI.A02();
        }
        C14640nL c14640nL = this.A0K;
        C14620nJ c14620nJ = c14640nL.A00;
        c14620nJ.A00 = 0L;
        C14620nJ c14620nJ2 = c14620nJ.A01;
        if (c14620nJ2 != null) {
            c14620nJ2.A00 = 0L;
            C14620nJ c14620nJ3 = c14620nJ2.A01;
            if (c14620nJ3 != null) {
                c14620nJ3.A00 = 0L;
                C14620nJ c14620nJ4 = c14620nJ3.A01;
                if (c14620nJ4 != null) {
                    c14620nJ4.A00 = 0L;
                    C14620nJ c14620nJ5 = c14620nJ4.A01;
                    if (c14620nJ5 != null) {
                        c14620nJ5.A01();
                    }
                }
            }
        }
        int size = c14640nL.A02.size();
        while (true) {
            size--;
            if (size >= 0) {
                InterfaceC14630nK interfaceC14630nK = c14640nL.A01;
                List list = c14640nL.A02;
                View view = (View) list.get(size);
                C1UR c1ur = (C1UR) interfaceC14630nK;
                if (c1ur != null) {
                    C0TS A01 = A01(view);
                    if (A01 != null) {
                        c1ur.A00.A0q(A01, A01.A07);
                        A01.A07 = 0;
                    }
                    list.remove(size);
                } else {
                    throw null;
                }
            } else {
                RecyclerView recyclerView = ((C1UR) c14640nL.A01).A00;
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    recyclerView.A0h(childAt);
                    childAt.clearAnimation();
                }
                recyclerView.removeAllViews();
                this.A0S = c0sv;
                if (c0sv != null) {
                    if (c0sv.A07 == null) {
                        c0sv.A07 = this;
                        c0sv.A05 = this.A0K;
                        c0sv.A03 = getWidth();
                        c0sv.A00 = getHeight();
                        c0sv.A04 = 1073741824;
                        c0sv.A01 = 1073741824;
                        if (this.A0k) {
                            this.A0S.A0B = true;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("LayoutManager ");
                        sb.append(c0sv);
                        sb.append(" is already attached to a RecyclerView:");
                        throw new IllegalArgumentException(C000200d.A0C(c0sv.A07, sb));
                    }
                }
                c15230oI.A03();
                requestLayout();
                return;
            }
        }
    }

    @Override // android.view.View, X.InterfaceC02870Df
    public void setNestedScrollingEnabled(boolean z) {
        C13110kc scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.A02) {
            C0AT.A0O(scrollingChildHelper.A04);
        }
        scrollingChildHelper.A02 = z;
    }

    public void setOnFlingListener(AbstractC15180oD abstractC15180oD) {
        this.A0T = abstractC15180oD;
    }

    public void setOnScrollListener(AbstractC15200oF abstractC15200oF) {
        this.A0V = abstractC15200oF;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0q = z;
    }

    public void setRecycledViewPool(C15220oH c15220oH) {
        C15220oH c15220oH2;
        C15230oI c15230oI = this.A0x;
        if (c15230oI.A02 != null) {
            c15220oH2.A00--;
        }
        c15230oI.A02 = c15220oH;
        if (c15220oH == null || c15230oI.A07.A0N == null) {
            return;
        }
        c15220oH.A00++;
    }

    public void setRecyclerListener(InterfaceC15240oJ interfaceC15240oJ) {
        this.A0W = interfaceC15240oJ;
    }

    public void setScrollState(int i) {
        AbstractC15270oM abstractC15270oM;
        if (i == this.A0B) {
            return;
        }
        this.A0B = i;
        if (i != 2) {
            RunnableC15290oO runnableC15290oO = this.A10;
            runnableC15290oO.A06.removeCallbacks(runnableC15290oO);
            runnableC15290oO.A03.abortAnimation();
            C0SV c0sv = this.A0S;
            if (c0sv != null && (abstractC15270oM = c0sv.A06) != null) {
                abstractC15270oM.A01();
            }
        }
        C0SV c0sv2 = this.A0S;
        if (c0sv2 != null) {
            c0sv2.A0t(i);
        }
        AbstractC15200oF abstractC15200oF = this.A0V;
        if (abstractC15200oF != null) {
            abstractC15200oF.A00(this, i);
        }
        List list = this.A0b;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((AbstractC15200oF) this.A0b.get(size)).A00(this, i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            } else {
                this.A0C = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.A0C = viewConfiguration.getScaledTouchSlop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A02(i, 0);
    }

    @Override // android.view.View, X.InterfaceC02870Df
    public void stopNestedScroll() {
        getScrollingChildHelper().A01(0);
    }
}
