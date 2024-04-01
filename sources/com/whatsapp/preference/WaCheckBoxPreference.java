package com.whatsapp.preference;

import X.C1U3;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.CheckBoxPreference;

/* loaded from: classes2.dex */
public class WaCheckBoxPreference extends CheckBoxPreference {
    public WaCheckBoxPreference(Context context) {
        super(context);
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public void A0S(C1U3 c1u3) {
        super.A0S(c1u3);
        View view = c1u3.A0H;
        WaPreference.A00(view);
        View findViewById = view.findViewById(16908310);
        if (findViewById instanceof TextView) {
            TextView textView = (TextView) findViewById;
            textView.setSingleLine(false);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }
}
