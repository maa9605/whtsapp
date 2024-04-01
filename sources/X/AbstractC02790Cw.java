package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.0Cw */
/* loaded from: classes.dex */
public abstract class AbstractC02790Cw extends C0AS {
    public static final Rect A09 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, EditorInfoCompat.IME_FLAG_FORCE_ASCII, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
    public static final InterfaceC13400lC A0A = new InterfaceC13400lC() { // from class: X.1TU
    };
    public static final InterfaceC13410lD A0B = new InterfaceC13410lD() { // from class: X.1TV
    };
    public C1TW A02;
    public final View A06;
    public final AccessibilityManager A07;
    public final Rect A04 = new Rect();
    public final Rect A03 = new Rect();
    public final Rect A05 = new Rect();
    public final int[] A08 = new int[2];
    public int A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public int A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public int mHoveredVirtualViewId = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    public abstract int A06(float f, float f2);

    public abstract void A0A(int i, C08420bS c08420bS);

    public void A0B(C08420bS c08420bS) {
    }

    public abstract void A0C(List list);

    public abstract boolean A0F(int i, int i2, Bundle bundle);

    public AbstractC02790Cw(View view) {
        if (view != null) {
            this.A06 = view;
            this.A07 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (view.getImportantForAccessibility() == 0) {
                C0AT.A0V(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1TW, X.0bR] */
    @Override // X.C0AS
    public C08410bR A00(View view) {
        C1TW c1tw = this.A02;
        if (c1tw == null) {
            ?? r0 = new C08410bR() { // from class: X.1TW
                {
                    AbstractC02790Cw.this = this;
                }

                @Override // X.C08410bR
                public C08420bS A00(int i) {
                    return new C08420bS(AccessibilityNodeInfo.obtain(AbstractC02790Cw.this.A07(i).A02));
                }

                @Override // X.C08410bR
                public C08420bS A01(int i) {
                    AbstractC02790Cw abstractC02790Cw;
                    int i2;
                    if (i == 2) {
                        abstractC02790Cw = AbstractC02790Cw.this;
                        i2 = abstractC02790Cw.A00;
                    } else {
                        abstractC02790Cw = AbstractC02790Cw.this;
                        i2 = abstractC02790Cw.A01;
                    }
                    if (i2 == Integer.MIN_VALUE) {
                        return null;
                    }
                    return new C08420bS(AccessibilityNodeInfo.obtain(abstractC02790Cw.A07(i2).A02));
                }

                @Override // X.C08410bR
                public boolean A02(int i, int i2, Bundle bundle) {
                    int i3;
                    AbstractC02790Cw abstractC02790Cw = AbstractC02790Cw.this;
                    if (i != -1) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 64) {
                                    if (i2 != 128) {
                                        return abstractC02790Cw.A0F(i, i2, bundle);
                                    }
                                    if (abstractC02790Cw.A00 == i) {
                                        abstractC02790Cw.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                        abstractC02790Cw.A06.invalidate();
                                        abstractC02790Cw.A09(i, 65536);
                                        return true;
                                    }
                                    return false;
                                }
                                AccessibilityManager accessibilityManager = abstractC02790Cw.A07;
                                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = abstractC02790Cw.A00) != i) {
                                    if (i3 != Integer.MIN_VALUE && i3 == i3) {
                                        abstractC02790Cw.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                        abstractC02790Cw.A06.invalidate();
                                        abstractC02790Cw.A09(i3, 65536);
                                    }
                                    abstractC02790Cw.A00 = i;
                                    abstractC02790Cw.A06.invalidate();
                                    abstractC02790Cw.A09(i, 32768);
                                    return true;
                                }
                                return false;
                            }
                            return abstractC02790Cw.A0D(i);
                        }
                        return abstractC02790Cw.A0E(i);
                    }
                    return abstractC02790Cw.A06.performAccessibilityAction(i2, bundle);
                }
            };
            this.A02 = r0;
            return r0;
        }
        return c1tw;
    }

    @Override // X.C0AS
    public void A04(View view, C08420bS c08420bS) {
        super.A01.onInitializeAccessibilityNodeInfo(view, c08420bS.A02);
        A0B(c08420bS);
    }

    public C08420bS A07(int i) {
        if (i == -1) {
            View view = this.A06;
            C08420bS c08420bS = new C08420bS(AccessibilityNodeInfo.obtain(view));
            AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            ArrayList arrayList = new ArrayList();
            A0C(arrayList);
            if (accessibilityNodeInfo.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                accessibilityNodeInfo.addChild(view, ((Number) arrayList.get(i2)).intValue());
            }
            return c08420bS;
        }
        return A08(i);
    }

    public final C08420bS A08(int i) {
        boolean z;
        C08420bS c08420bS = new C08420bS(AccessibilityNodeInfo.obtain());
        AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setFocusable(true);
        accessibilityNodeInfo.setClassName("android.view.View");
        Rect rect = A09;
        accessibilityNodeInfo.setBoundsInParent(rect);
        accessibilityNodeInfo.setBoundsInScreen(rect);
        View view = this.A06;
        c08420bS.A00 = -1;
        accessibilityNodeInfo.setParent(view);
        A0A(i, c08420bS);
        if (c08420bS.A02() == null && accessibilityNodeInfo.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.A03;
        accessibilityNodeInfo.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = accessibilityNodeInfo.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    accessibilityNodeInfo.setPackageName(view.getContext().getPackageName());
                    c08420bS.A01 = i;
                    accessibilityNodeInfo.setSource(view, i);
                    if (this.A00 == i) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        accessibilityNodeInfo.addAction(128);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        accessibilityNodeInfo.addAction(64);
                    }
                    if (this.A01 == i) {
                        z = true;
                        accessibilityNodeInfo.addAction(2);
                    } else {
                        z = false;
                        if (accessibilityNodeInfo.isFocusable()) {
                            accessibilityNodeInfo.addAction(1);
                        }
                    }
                    accessibilityNodeInfo.setFocused(z);
                    int[] iArr = this.A08;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.A04;
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        accessibilityNodeInfo.getBoundsInParent(rect3);
                        if (c08420bS.A00 != -1) {
                            C08420bS c08420bS2 = new C08420bS(AccessibilityNodeInfo.obtain());
                            for (int i2 = c08420bS.A00; i2 != -1; i2 = c08420bS2.A00) {
                                c08420bS2.A00 = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo2 = c08420bS2.A02;
                                accessibilityNodeInfo2.setParent(view, -1);
                                accessibilityNodeInfo2.setBoundsInParent(rect);
                                A0A(i2, c08420bS2);
                                accessibilityNodeInfo2.getBoundsInParent(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                            c08420bS2.A02.recycle();
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.A05;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            accessibilityNodeInfo.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                ViewParent parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        accessibilityNodeInfo.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return c08420bS;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final void A09(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.A07.isEnabled() || (parent = (view = this.A06).getParent()) == null) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        if (i != -1) {
            C08420bS A07 = A07(i);
            obtain.getText().add(A07.A02());
            AccessibilityNodeInfo accessibilityNodeInfo = A07.A02;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }

    public final boolean A0D(int i) {
        if (this.A01 != i) {
            return false;
        }
        this.A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        A09(i, 8);
        return true;
    }

    public final boolean A0E(int i) {
        int i2;
        View view = this.A06;
        if ((view.isFocused() || view.requestFocus()) && (i2 = this.A01) != i) {
            if (i2 != Integer.MIN_VALUE) {
                A0D(i2);
            }
            this.A01 = i;
            A09(i, 8);
            return true;
        }
        return false;
    }

    public final boolean A0G(int i, Rect rect) {
        Object obj;
        int i2;
        ArrayList arrayList = new ArrayList();
        A0C(arrayList);
        C07270Xo c07270Xo = new C07270Xo(10);
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            c07270Xo.A05(i4, A08(i4));
        }
        int i5 = this.A01;
        Object A02 = i5 == Integer.MIN_VALUE ? null : c07270Xo.A02(i5, null);
        int i6 = -1;
        if (i == 1 || i == 2) {
            boolean z = C0AT.A05(this.A06) == 1;
            InterfaceC13400lC interfaceC13400lC = A0A;
            int A00 = c07270Xo.A00();
            ArrayList arrayList2 = new ArrayList(A00);
            for (int i7 = 0; i7 < A00; i7++) {
                if (c07270Xo.A01) {
                    c07270Xo.A03();
                }
                arrayList2.add(c07270Xo.A03[i7]);
            }
            Collections.sort(arrayList2, new Comparator(z, interfaceC13400lC) { // from class: X.0lE
                public final Rect A00 = new Rect();
                public final Rect A01 = new Rect();
                public final InterfaceC13400lC A02;
                public final boolean A03;

                {
                    this.A03 = z;
                    this.A02 = interfaceC13400lC;
                }

                @Override // java.util.Comparator
                public int compare(Object obj2, Object obj3) {
                    Rect rect2 = this.A00;
                    Rect rect3 = this.A01;
                    ((C08420bS) obj2).A02.getBoundsInParent(rect2);
                    ((C08420bS) obj3).A02.getBoundsInParent(rect3);
                    int i8 = rect2.top;
                    int i9 = rect3.top;
                    if (i8 < i9) {
                        return -1;
                    }
                    if (i8 > i9) {
                        return 1;
                    }
                    int i10 = rect2.left;
                    int i11 = rect3.left;
                    if (i10 < i11) {
                        return this.A03 ? 1 : -1;
                    } else if (i10 > i11) {
                        return !this.A03 ? 1 : -1;
                    } else {
                        int i12 = rect2.bottom;
                        int i13 = rect3.bottom;
                        if (i12 < i13) {
                            return -1;
                        }
                        if (i12 > i13) {
                            return 1;
                        }
                        int i14 = rect2.right;
                        int i15 = rect3.right;
                        if (i14 < i15) {
                            return this.A03 ? 1 : -1;
                        } else if (i14 > i15) {
                            return !this.A03 ? 1 : -1;
                        } else {
                            return 0;
                        }
                    }
                }
            });
            if (i != 1) {
                if (i == 2) {
                    int size = arrayList2.size();
                    int lastIndexOf = (A02 == null ? -1 : arrayList2.lastIndexOf(A02)) + 1;
                    if (lastIndexOf < size) {
                        obj = arrayList2.get(lastIndexOf);
                    }
                    i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
            } else {
                int size2 = arrayList2.size();
                if (A02 != null) {
                    size2 = arrayList2.indexOf(A02);
                }
                int i8 = size2 - 1;
                if (i8 >= 0) {
                    obj = arrayList2.get(i8);
                }
                i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
            return A0E(i2);
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i9 = this.A01;
            if (i9 != Integer.MIN_VALUE) {
                A07(i9).A02.getBoundsInParent(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view = this.A06;
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else if (i == 130) {
                    rect2.set(0, -1, width, -1);
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else if (i == 130) {
                rect3.offset(0, -(rect2.height() + 1));
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            int A002 = c07270Xo.A00();
            Rect rect4 = new Rect();
            obj = null;
            for (int i10 = 0; i10 < A002; i10++) {
                if (c07270Xo.A01) {
                    c07270Xo.A03();
                }
                Object obj2 = c07270Xo.A03[i10];
                if (obj2 != A02) {
                    ((C08420bS) obj2).A02.getBoundsInParent(rect4);
                    if (C07O.A12(rect2, rect4, i)) {
                        if (C07O.A12(rect2, rect3, i) && !C07O.A10(i, rect2, rect4, rect3)) {
                            if (!C07O.A10(i, rect2, rect3, rect4)) {
                                int A022 = C07O.A02(i, rect2, rect4);
                                int A03 = C07O.A03(i, rect2, rect4);
                                int i11 = (A03 * A03) + (A022 * 13 * A022);
                                int A023 = C07O.A02(i, rect2, rect3);
                                int A032 = C07O.A03(i, rect2, rect3);
                                if (i11 >= (A032 * A032) + (A023 * 13 * A023)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        obj = obj2;
                    }
                }
            }
        }
        if (obj != null) {
            if (c07270Xo.A01) {
                c07270Xo.A03();
            }
            while (true) {
                if (i3 >= c07270Xo.A00) {
                    break;
                } else if (c07270Xo.A03[i3] == obj) {
                    i6 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            if (c07270Xo.A01) {
                c07270Xo.A03();
            }
            i2 = c07270Xo.A02[i6];
            return A0E(i2);
        }
        i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        return A0E(i2);
    }

    public final boolean A0H(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case C0M6.A01 /* 20 */:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && A0G(i2, null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = this.A01;
                    if (i3 != Integer.MIN_VALUE) {
                        A0F(i3, 16, null);
                        return true;
                    }
                    return true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                return A0G(2, null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return A0G(1, null);
                }
            }
        }
        return false;
    }

    public final boolean A0I(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.A07;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int A06 = A06(motionEvent.getX(), motionEvent.getY());
                int i2 = this.mHoveredVirtualViewId;
                if (i2 != A06) {
                    this.mHoveredVirtualViewId = A06;
                    A09(A06, 128);
                    A09(i2, 256);
                }
                return A06 != Integer.MIN_VALUE;
            } else if (action == 10 && (i = this.mHoveredVirtualViewId) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    this.mHoveredVirtualViewId = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    A09(EditorInfoCompat.IME_FLAG_FORCE_ASCII, 128);
                    A09(i, 256);
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.mHoveredVirtualViewId = i;
        A09(i, 128);
        A09(i2, 256);
    }
}
