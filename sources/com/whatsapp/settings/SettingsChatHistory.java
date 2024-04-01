package com.whatsapp.settings;

import X.AbstractC02800Cx;
import X.ActivityC06980Vx;
import X.C02820Cz;
import X.C2PD;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaPreferenceFragment;

/* loaded from: classes2.dex */
public class SettingsChatHistory extends C2PD {
    @Override // X.C2PD, X.ActivityC06980Vx, X.AbstractActivityC06990Vy, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.preference_activity);
        if (bundle == null) {
            ((ActivityC06980Vx) this).A06 = new SettingsChatHistoryFragment();
            AbstractC02800Cx A0N = A0N();
            if (A0N != null) {
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A01(R.id.preference_fragment, ((ActivityC06980Vx) this).A06, "preferenceFragment");
                c02820Cz.A04();
                return;
            }
            throw null;
        }
        setTitle(bundle.getCharSequence("settingsChatHistoryTitle"));
        ((ActivityC06980Vx) this).A06 = (WaPreferenceFragment) A0N().A07(bundle, "preferenceFragment");
    }

    @Override // X.ActivityC06980Vx, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("settingsChatHistoryTitle", getTitle());
    }
}
