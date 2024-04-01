package com.whatsapp;

import X.ActivityC06980Vx;
import X.C002701i;
import X.C0PA;
import X.C0U1;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public abstract class WaPreferenceFragment extends Hilt_WaPreferenceFragment {
    public ActivityC06980Vx A00;

    public Dialog A10(int i) {
        return null;
    }

    @Override // X.C0BA
    public void A0e() {
        this.A0U = true;
        this.A00 = null;
    }

    @Override // com.whatsapp.Hilt_WaPreferenceFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        this.A00 = (ActivityC06980Vx) A09();
    }

    public void A11() {
        ActivityC06980Vx activityC06980Vx = this.A00;
        if (activityC06980Vx != null) {
            activityC06980Vx.A01 = R.string.processing;
            activityC06980Vx.A00 = R.string.register_wait_message;
            C002701i.A19(activityC06980Vx, 501);
        }
    }

    public void A12(int i) {
        C0PA c0pa = ((PreferenceFragmentCompat) this).A02;
        if (c0pa != null) {
            PreferenceScreen A04 = c0pa.A04(A0a(), i, c0pa.A07);
            C0PA c0pa2 = ((PreferenceFragmentCompat) this).A02;
            PreferenceScreen preferenceScreen = c0pa2.A07;
            if (A04 != preferenceScreen) {
                if (preferenceScreen != null) {
                    preferenceScreen.A09();
                }
                c0pa2.A07 = A04;
                ((PreferenceFragmentCompat) this).A04 = true;
                if (((PreferenceFragmentCompat) this).A05 && !((PreferenceFragmentCompat) this).A01.hasMessages(1)) {
                    ((PreferenceFragmentCompat) this).A01.obtainMessage(1).sendToTarget();
                }
            }
            ActivityC06980Vx activityC06980Vx = this.A00;
            if (activityC06980Vx != null) {
                CharSequence title = activityC06980Vx.getTitle();
                C0U1 A0c = activityC06980Vx.A0c();
                if (TextUtils.isEmpty(title) || A0c == null) {
                    return;
                }
                A0c.A0H(title);
                return;
            }
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }
}
