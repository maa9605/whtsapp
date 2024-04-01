package androidx.preference;

import X.C07O;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean A00;

    @Override // androidx.preference.PreferenceGroup
    public boolean A0X() {
        return false;
    }

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C07O.A04(context, R.attr.preferenceScreenStyle, 16842891));
        this.A00 = true;
    }

    @Override // androidx.preference.Preference
    public void A08() {
        if (((Preference) this).A06 == null && this.A0K == null) {
            ((PreferenceGroup) this).A02.size();
        }
    }
}
