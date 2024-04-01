package X;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0bR */
/* loaded from: classes.dex */
public class C08410bR {
    public final Object A00;

    public C08420bS A00(int i) {
        return null;
    }

    public C08420bS A01(int i) {
        return null;
    }

    public boolean A02(int i, int i2, Bundle bundle) {
        return false;
    }

    public C08410bR() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A00 = new C13250kq(this) { // from class: X.1TN
                {
                    super(this);
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public AccessibilityNodeInfo findFocus(int i) {
                    C08420bS A01 = this.A00.A01(i);
                    if (A01 == null) {
                        return null;
                    }
                    return A01.A02;
                }
            };
        } else {
            this.A00 = new C13250kq(this);
        }
    }

    public C08410bR(Object obj) {
        this.A00 = obj;
    }
}
