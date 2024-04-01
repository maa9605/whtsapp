package X;

import android.text.TextUtils;
import android.view.View;

/* renamed from: X.0Ww  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Ww extends AbstractC07120Wx {
    @Override // X.AbstractC07120Wx
    public Object A01(View view) {
        return view.getAccessibilityPaneTitle();
    }

    @Override // X.AbstractC07120Wx
    public void A02(View view, Object obj) {
        view.setAccessibilityPaneTitle((CharSequence) obj);
    }

    @Override // X.AbstractC07120Wx
    public boolean A03(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
