package X;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0kp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13240kp {
    public final Object A00;

    public C13240kp(Object obj) {
        this.A00 = obj;
    }

    public static C13240kp A00(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 21) {
            return new C13240kp(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
        if (i5 >= 19) {
            return new C13240kp(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }
        return new C13240kp(null);
    }
}
