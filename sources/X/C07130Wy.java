package X;

import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Wy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07130Wy extends AbstractC07120Wx {
    public C07130Wy() {
        super(R.id.tag_accessibility_heading);
    }

    @Override // X.AbstractC07120Wx
    public Object A01(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }

    @Override // X.AbstractC07120Wx
    public void A02(View view, Object obj) {
        view.setAccessibilityHeading(((Boolean) obj).booleanValue());
    }

    @Override // X.AbstractC07120Wx
    public boolean A03(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        return !((bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue()));
    }
}
