package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: X.0kq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13250kq extends AccessibilityNodeProvider {
    public final C08410bR A00;

    public C13250kq(C08410bR c08410bR) {
        this.A00 = c08410bR;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C08420bS A00 = this.A00.A00(i);
        if (A00 == null) {
            return null;
        }
        return A00.A02;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i) {
        if (this.A00 != null) {
            return null;
        }
        throw null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.A00.A02(i, i2, bundle);
    }
}
