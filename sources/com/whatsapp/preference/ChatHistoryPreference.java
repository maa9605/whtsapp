package com.whatsapp.preference;

import X.AnonymousClass029;
import X.C02180Ae;
import X.C1U3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ChatHistoryPreference extends WaPreference {
    public int A00;
    public int A01;

    public ChatHistoryPreference(Context context) {
        this(context, null);
    }

    public ChatHistoryPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChatHistoryPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = AnonymousClass029.A03(context, R.attr.settingsIconColor, R.color.settings_icon);
        this.A01 = AnonymousClass029.A03(context, R.attr.settingsTitleTextColor, R.color.settings_item_title_text);
    }

    @Override // com.whatsapp.preference.WaPreference, androidx.preference.Preference
    public void A0S(C1U3 c1u3) {
        super.A0S(c1u3);
        View view = c1u3.A0H;
        C02180Ae.A17((ImageView) view.findViewById(16908294), this.A00);
        ((TextView) view.findViewById(16908310)).setTextColor(this.A01);
    }
}
