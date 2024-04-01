package com.whatsapp.preference;

import X.C1U3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class WaPreference extends Preference {
    public WaPreference(Context context) {
        super(context);
    }

    public WaPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void A00(View view) {
        View findViewById = view.findViewById(16908310);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setTextColor(view.getContext().getResources().getColorStateList(R.color.palette_onsurface_primary_color_selector));
        }
    }

    @Override // androidx.preference.Preference
    public void A0S(C1U3 c1u3) {
        super.A0S(c1u3);
        A00(c1u3.A0H);
    }
}
