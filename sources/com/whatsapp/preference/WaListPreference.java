package com.whatsapp.preference;

import X.C1U3;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class WaListPreference extends ListPreference {
    public WaListPreference(Context context) {
        super(context);
    }

    public WaListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    public void A0S(C1U3 c1u3) {
        super.A0S(c1u3);
        ((DialogPreference) this).A04 = ((Preference) this).A05.getString(R.string.cancel);
        WaPreference.A00(c1u3.A0H);
    }
}
