package X;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0bU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C08440bU {
    public static final C08440bU A01;
    public static final C08440bU A02;
    public static final C08440bU A03;
    public static final C08440bU A04;
    public static final C08440bU A05;
    public static final C08440bU A06;
    public static final C08440bU A07;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(1, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(2, null);
        }
        A07 = new C08440bU(4, null);
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(8, null);
        }
        A01 = new C08440bU(16, null);
        A02 = new C08440bU(32, null);
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(64, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(128, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(256, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(512, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(1024, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(2048, null);
        }
        A05 = new C08440bU(4096, null);
        A03 = new C08440bU(8192, null);
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(16384, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(32768, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(65536, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(C42271vT.A09, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(262144, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(524288, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(1048576, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(2097152, null);
        }
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null;
        if (i >= 21 && accessibilityAction == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908342, null);
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null;
        if (i >= 21 && accessibilityAction2 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908343, null);
        }
        A06 = new C08440bU(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null;
        if (i >= 21 && accessibilityAction3 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908345, null);
        }
        A04 = new C08440bU(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null;
        if (i >= 21 && accessibilityAction4 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908347, null);
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5 = i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null;
        if (i >= 21 && accessibilityAction5 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908358, null);
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6 = i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null;
        if (i >= 21 && accessibilityAction6 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908359, null);
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7 = i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null;
        if (i >= 21 && accessibilityAction7 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908360, null);
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8 = i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null;
        if (i >= 21 && accessibilityAction8 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908361, null);
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null;
        if (i >= 21 && accessibilityAction9 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908348, null);
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10 = i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null;
        if (i >= 21 && accessibilityAction10 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908349, null);
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11 = i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null;
        if (i >= 21 && accessibilityAction11 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908354, null);
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12 = i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null;
        if (i >= 21 && accessibilityAction12 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908356, null);
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13 = i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null;
        if (i < 21 || accessibilityAction13 != null) {
            return;
        }
        new AccessibilityNodeInfo.AccessibilityAction(16908357, null);
    }

    public C08440bU(int i, CharSequence charSequence) {
        this(null, i, charSequence);
    }

    public C08440bU(Object obj, int i, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21 && obj == null) {
            this.A00 = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.A00 = obj;
        }
    }

    public int A00() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.A00).getId();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C08440bU)) {
            Object obj2 = this.A00;
            Object obj3 = ((C08440bU) obj).A00;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.A00;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
