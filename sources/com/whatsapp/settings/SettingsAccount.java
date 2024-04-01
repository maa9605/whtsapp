package com.whatsapp.settings;

import X.C0U1;
import X.C2PB;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I0_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.account.delete.DeleteAccountActivity;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.report.ReportActivity;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;

/* loaded from: classes2.dex */
public class SettingsAccount extends C2PB {
    public /* synthetic */ void lambda$onCreate$2305$SettingsAccount(View view) {
        startActivity(new Intent(this, SettingsPrivacy.class));
    }

    public /* synthetic */ void lambda$onCreate$2306$SettingsAccount(View view) {
        startActivity(new Intent(this, SettingsSecurity.class));
    }

    public /* synthetic */ void lambda$onCreate$2307$SettingsAccount(View view) {
        startActivity(new Intent(this, SettingsTwoFactorAuthActivity.class));
    }

    public /* synthetic */ void lambda$onCreate$2308$SettingsAccount(View view) {
        startActivity(new Intent(this, ChangeNumberOverview.class));
    }

    public /* synthetic */ void lambda$onCreate$2309$SettingsAccount(View view) {
        startActivity(new Intent(this, DeleteAccountActivity.class));
    }

    public /* synthetic */ void lambda$onCreate$2310$SettingsAccount(View view) {
        startActivity(new Intent(this, ReportActivity.class));
    }

    @Override // X.C2PB, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.settings_account_info);
        setContentView(R.layout.preferences_account);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            findViewById(R.id.privacy_preference).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 17));
            findViewById(R.id.security_preference).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 14));
            findViewById(R.id.two_step_verification_preference).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 12));
            findViewById(R.id.change_number_preference).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 13));
            findViewById(R.id.delete_account_preference).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 16));
            findViewById(R.id.request_account_info_preference).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 15));
            return;
        }
        throw null;
    }
}
