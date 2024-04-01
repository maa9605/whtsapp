package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0AT */
/* loaded from: classes.dex */
public class C0AT {
    public static ThreadLocal A00;
    public static Field A01;
    public static Method A02;
    public static Method A03;
    public static WeakHashMap A04;
    public static WeakHashMap A05;
    public static boolean A06;
    public static boolean A07;
    public static final AtomicInteger A08 = new AtomicInteger(1);

    static {
        new WeakHashMap();
    }

    public static float A00(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static float A01(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static int A02() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = A08;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static int A03(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static int A04(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static int A05(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int A06(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static int A07(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static ColorStateList A08(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof InterfaceC02710Co) {
            return ((InterfaceC02710Co) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static Rect A09() {
        ThreadLocal threadLocal = A00;
        if (threadLocal == null) {
            threadLocal = new ThreadLocal();
            A00 = threadLocal;
        }
        Rect rect = (Rect) threadLocal.get();
        if (rect == null) {
            rect = new Rect();
            A00.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static Rect A0A(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static Display A0B(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (A0g(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static View.AccessibilityDelegate A0C(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (!A06) {
            if (A01 == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    A01 = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    A06 = true;
                    return null;
                }
            }
            try {
                Object obj = A01.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
            } catch (Throwable unused2) {
                A06 = true;
            }
        }
        return null;
    }

    public static View A0D(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return view.requireViewById(i);
        }
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static C0TT A0E(View view) {
        WeakHashMap weakHashMap = A05;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            A05 = weakHashMap;
        }
        C0TT c0tt = (C0TT) weakHashMap.get(view);
        if (c0tt == null) {
            C0TT c0tt2 = new C0TT(view);
            A05.put(view, c0tt2);
            return c0tt2;
        }
        return c0tt;
    }

    public static C07110Wv A0F(View view, C07110Wv c07110Wv) {
        if (Build.VERSION.SDK_INT >= 21) {
            WindowInsets windowInsets = (WindowInsets) c07110Wv.A00;
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (!onApplyWindowInsets.equals(windowInsets)) {
                windowInsets = new WindowInsets(onApplyWindowInsets);
            }
            return C07110Wv.A00(windowInsets);
        }
        return c07110Wv;
    }

    public static String A0G(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap weakHashMap = A04;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    public static void A0H() {
        try {
            A03 = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            A02 = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e) {
            Log.e("ViewCompat", "Couldn't find method", e);
        }
        A07 = true;
    }

    public static void A0I(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchFinishTemporaryDetach();
            return;
        }
        if (!A07) {
            A0H();
        }
        Method method = A02;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception e) {
                Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", e);
                return;
            }
        }
        view.onFinishTemporaryDetach();
    }

    public static void A0J(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchStartTemporaryDetach();
            return;
        }
        if (!A07) {
            A0H();
        }
        Method method = A03;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception e) {
                Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", e);
                return;
            }
        }
        view.onStartTemporaryDetach();
    }

    public static void A0K(View view) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = new C0Ww().A00(view) != null;
            if ((Build.VERSION.SDK_INT >= 19 && view.getAccessibilityLiveRegion() != 0) || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(0);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, 0);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), e);
                }
            }
        }
    }

    public static void A0L(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else {
            view.requestFitSystemWindows();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0030, code lost:
        if (r0 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0M(android.view.View r4) {
        /*
            r0 = 1
            X.0Wy r3 = new X.0Wy
            r3.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            int r0 = r3.A00
            if (r1 < r0) goto L14
            r3.A02(r4, r2)
        L13:
            return
        L14:
            r0 = 19
            if (r1 < r0) goto L13
            java.lang.Object r0 = r3.A00(r4)
            boolean r0 = r3.A03(r0, r2)
            if (r0 == 0) goto L13
            android.view.View$AccessibilityDelegate r1 = A0C(r4)
            if (r1 == 0) goto L32
            boolean r0 = r1 instanceof X.C07140Wz
            if (r0 == 0) goto L43
            X.0Wz r1 = (X.C07140Wz) r1
            X.0AS r0 = r1.A00
            if (r0 != 0) goto L37
        L32:
            X.0AS r0 = new X.0AS
            r0.<init>()
        L37:
            A0c(r4, r0)
            int r0 = r3.A01
            r4.setTag(r0, r2)
            A0K(r4)
            return
        L43:
            X.0AS r0 = new X.0AS
            r0.<init>(r1)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0AT.A0M(android.view.View):void");
    }

    public static void A0N(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(8);
        }
    }

    public static void A0O(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (!(view instanceof InterfaceC02870Df)) {
        } else {
            ((InterfaceC02870Df) view).stopNestedScroll();
        }
    }

    public static void A0P(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    public static void A0Q(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                float translationY2 = view2.getTranslationY();
                view2.setTranslationY(1.0f + translationY2);
                view2.setTranslationY(translationY2);
            }
        }
    }

    public static void A0R(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                float translationY2 = view2.getTranslationY();
                view2.setTranslationY(1.0f + translationY2);
                view2.setTranslationY(translationY2);
            }
        }
    }

    public static void A0S(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect A09 = A09();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                A09.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !A09.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            A0Q(view, i);
            if (!z || !A09.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                return;
            }
            ((View) parent).invalidate(A09);
        } else {
            A0Q(view, i);
        }
    }

    public static void A0T(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect A09 = A09();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                A09.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !A09.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            A0R(view, i);
            if (!z || !A09.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                return;
            }
            ((View) parent).invalidate(A09);
        } else {
            A0R(view, i);
        }
    }

    public static void A0U(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    public static void A0V(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setImportantForAccessibility(i);
            return;
        }
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    public static void A0W(View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    public static void A0X(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, 3);
        }
    }

    public static void A0Y(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x001a, code lost:
        if (r3.getBackgroundTintMode() != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0Z(android.view.View r3, android.content.res.ColorStateList r4) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L32
            r3.setBackgroundTintList(r4)
            if (r1 != r0) goto L31
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.content.res.ColorStateList r0 = r3.getBackgroundTintList()
            if (r0 != 0) goto L1c
            android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
            r0 = 0
            if (r1 == 0) goto L1d
        L1c:
            r0 = 1
        L1d:
            if (r2 == 0) goto L31
            if (r0 == 0) goto L31
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L2e
            int[] r0 = r3.getDrawableState()
            r2.setState(r0)
        L2e:
            r3.setBackground(r2)
        L31:
            return
        L32:
            boolean r0 = r3 instanceof X.InterfaceC02710Co
            if (r0 == 0) goto L31
            X.0Co r3 = (X.InterfaceC02710Co) r3
            r3.setSupportBackgroundTintList(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0AT.A0Z(android.view.View, android.content.res.ColorStateList):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x001a, code lost:
        if (r3.getBackgroundTintMode() != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0a(android.view.View r3, android.graphics.PorterDuff.Mode r4) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L32
            r3.setBackgroundTintMode(r4)
            if (r1 != r0) goto L31
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.content.res.ColorStateList r0 = r3.getBackgroundTintList()
            if (r0 != 0) goto L1c
            android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
            r0 = 0
            if (r1 == 0) goto L1d
        L1c:
            r0 = 1
        L1d:
            if (r2 == 0) goto L31
            if (r0 == 0) goto L31
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L2e
            int[] r0 = r3.getDrawableState()
            r2.setState(r0)
        L2e:
            r3.setBackground(r2)
        L31:
            return
        L32:
            boolean r0 = r3 instanceof X.InterfaceC02710Co
            if (r0 == 0) goto L31
            X.0Co r3 = (X.InterfaceC02710Co) r3
            r3.setSupportBackgroundTintMode(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0AT.A0a(android.view.View, android.graphics.PorterDuff$Mode):void");
    }

    public static void A0b(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static void A0c(View view, C0AS c0as) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c0as == null) {
            if (A0C(view) instanceof C07140Wz) {
                c0as = new C0AS();
            } else {
                accessibilityDelegate = null;
                view.setAccessibilityDelegate(accessibilityDelegate);
            }
        }
        accessibilityDelegate = c0as.A00;
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void A0d(View view, final C0V5 c0v5) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (c0v5 == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: X.0kg
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        return (WindowInsets) c0v5.AHK(view2, new C07110Wv(windowInsets)).A00;
                    }
                });
            }
        }
    }

    public static void A0e(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        WeakHashMap weakHashMap = A04;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            A04 = weakHashMap;
        }
        weakHashMap.put(view, str);
    }

    public static void A0f(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (!(view instanceof InterfaceC02870Df)) {
        } else {
            ((InterfaceC02870Df) view).setNestedScrollingEnabled(z);
        }
    }

    public static boolean A0g(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean A0h(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean A0i(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof InterfaceC02870Df) {
            return ((InterfaceC02870Df) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean A0j(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static boolean A0k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        C0X0 c0x0 = (C0X0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c0x0 == null) {
            c0x0 = new C0X0();
            view.setTag(R.id.tag_unhandled_key_event_manager, c0x0);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c0x0.A02;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = C0X0.A03;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (c0x0.A02 == null) {
                        c0x0.A02 = new WeakHashMap();
                    }
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) arrayList.get(size)).get();
                        if (view2 == null) {
                            arrayList.remove(size);
                        } else {
                            c0x0.A02.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                c0x0.A02.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View A002 = c0x0.A00(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (A002 == null) {
                return false;
            }
            if (!KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = c0x0.A00;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    c0x0.A00 = sparseArray;
                }
                sparseArray.put(keyCode, new WeakReference(A002));
            }
        } else if (A002 == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0052, code lost:
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x005e, code lost:
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0060, code lost:
        r1 = (android.view.View) r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0066, code lost:
        if (r1 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x006c, code lost:
        if (A0g(r1) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006e, code lost:
        r1 = (java.util.AbstractList) r1.getTag(com.google.android.search.verification.client.R.id.tag_unhandled_key_listeners);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0077, code lost:
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0079, code lost:
        r0 = r1.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x007e, code lost:
        if (r0 < 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0080, code lost:
        r1.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0084, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0085, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0l(android.view.View r5, android.view.KeyEvent r6) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r0 = 28
            if (r1 < r0) goto L8
            return r4
        L8:
            r0 = 2131364824(0x7f0a0bd8, float:1.8349496E38)
            java.lang.Object r1 = r5.getTag(r0)
            X.0X0 r1 = (X.C0X0) r1
            if (r1 != 0) goto L1b
            X.0X0 r1 = new X.0X0
            r1.<init>()
            r5.setTag(r0, r1)
        L1b:
            java.lang.ref.WeakReference r0 = r1.A01
            r3 = 1
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.get()
            if (r0 != r6) goto L27
        L26:
            return r4
        L27:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r1.A01 = r0
            android.util.SparseArray r2 = r1.A00
            if (r2 != 0) goto L39
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.A00 = r2
        L39:
            int r0 = r6.getAction()
            if (r0 != r3) goto L54
            int r0 = r6.getKeyCode()
            int r1 = r2.indexOfKey(r0)
            if (r1 < 0) goto L54
            java.lang.Object r0 = r2.valueAt(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            r2.removeAt(r1)
            if (r0 != 0) goto L60
        L54:
            int r0 = r6.getKeyCode()
            java.lang.Object r0 = r2.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L26
        L60:
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L85
            boolean r0 = A0g(r1)
            if (r0 == 0) goto L85
            r0 = 2131364825(0x7f0a0bd9, float:1.8349498E38)
            java.lang.Object r1 = r1.getTag(r0)
            java.util.AbstractList r1 = (java.util.AbstractList) r1
            if (r1 == 0) goto L85
            int r0 = r1.size()
            int r0 = r0 - r3
            if (r0 < 0) goto L85
            r1.get(r0)
            r0 = 0
            throw r0
        L85:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0AT.A0l(android.view.View, android.view.KeyEvent):boolean");
    }
}
