package X;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: X.0Wv */
/* loaded from: classes.dex */
public class C07110Wv {
    public final Object A00;

    public C07110Wv(Object obj) {
        this.A00 = obj;
    }

    public static C07110Wv A00(WindowInsets windowInsets) {
        return new C07110Wv(windowInsets);
    }

    public int A01() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int A02() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int A03() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int A04() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetTop();
        }
        return 0;
    }

    public C07110Wv A05(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C07110Wv(((WindowInsets) this.A00).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public boolean A06() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.A00).isConsumed();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C07110Wv) {
            return C07O.A18(this.A00, ((C07110Wv) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.A00;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
