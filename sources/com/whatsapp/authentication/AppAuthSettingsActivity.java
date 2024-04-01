package com.whatsapp.authentication;

import X.AbstractC11700iC;
import X.AbstractC35891ju;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.C000200d;
import X.C005102h;
import X.C02160Ac;
import X.C03160Eo;
import X.C0U1;
import X.C0WV;
import X.C11730iF;
import X.C11740iG;
import X.C11750iH;
import X.C40301ry;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class AppAuthSettingsActivity extends C0WV {
    public View A00;
    public View A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public SwitchCompat A05;
    public SwitchCompat A06;
    public C11740iG A07;
    public C11750iH A08;
    public C03160Eo A09;
    public FingerprintBottomSheet A0A;
    public C005102h A0B;
    public C40301ry A0C;
    public final AbstractC35891ju A0D = new AbstractC35891ju() { // from class: X.1Q1
        {
            AppAuthSettingsActivity.this = this;
        }

        @Override // X.AbstractC27261Mr
        public void A00() {
            Log.i("AppAuthSettingsActivity/fingerprint-success-animation-end");
            AppAuthSettingsActivity appAuthSettingsActivity = AppAuthSettingsActivity.this;
            FingerprintBottomSheet fingerprintBottomSheet = appAuthSettingsActivity.A0A;
            if (fingerprintBottomSheet != null && fingerprintBottomSheet.A0Z()) {
                appAuthSettingsActivity.A0A.A11();
            }
            appAuthSettingsActivity.A05.setChecked(true);
            appAuthSettingsActivity.A1R(true);
        }

        @Override // X.AbstractC35891ju
        public void A01() {
            Log.i("AppAuthSettingsActivity/fingerprint-error");
            AppAuthSettingsActivity.this.A1P();
        }

        @Override // X.AbstractC35891ju
        public void A03(C0HE c0he, InterfaceC06550Tv interfaceC06550Tv) {
            Log.i("AppAuthSettingsActivity/authenticate");
            C03170Ep c03170Ep = ((ActivityC02270An) AppAuthSettingsActivity.this).A06;
            C000700j.A07(c03170Ep.A06());
            c03170Ep.A01.A5c(c0he, interfaceC06550Tv);
        }

        @Override // X.AbstractC35891ju
        public void A04(byte[] bArr) {
            Log.i("AppAuthSettingsActivity/fingerprint-success");
            AppAuthSettingsActivity appAuthSettingsActivity = AppAuthSettingsActivity.this;
            C000200d.A0j(((ActivityC02290Ap) appAuthSettingsActivity).A0F, "privacy_fingerprint_enabled", true);
            ((ActivityC02270An) appAuthSettingsActivity).A06.A03(false);
            appAuthSettingsActivity.A0C.A04();
            appAuthSettingsActivity.A09.A02();
        }
    };

    public final void A1P() {
        Log.i("AppAuthSettingsActivity/disable-setting");
        ((ActivityC02270An) this).A06.A03(true);
        C000200d.A0j(((ActivityC02290Ap) this).A0F, "privacy_fingerprint_enabled", false);
        this.A0C.A04();
        A1R(false);
        this.A05.setChecked(false);
        this.A09.A02();
        ((ActivityC02270An) this).A06.A01(this);
    }

    public /* synthetic */ void A1Q(long j) {
        C000200d.A0h(((ActivityC02290Ap) this).A0F, "privacy_fingerprint_timeout", j);
    }

    public final void A1R(boolean z) {
        Log.i("AppAuthSettingsActivity/update-dependent-views");
        this.A01.setVisibility(z ? 0 : 8);
        this.A00.setVisibility(z ? 0 : 8);
    }

    public void lambda$onCreate$986$AppAuthSettingsActivity(View view) {
        if (!this.A05.isChecked()) {
            if (((ActivityC02270An) this).A06.A04()) {
                Log.i("AppAuthSettingsActivity/show-bottom-sheet");
                if (((ActivityC02270An) this).A06.A07()) {
                    this.A08.A01(this.A07);
                    return;
                }
                FingerprintBottomSheet A00 = FingerprintBottomSheet.A00(R.string.fingerprint_bottom_sheet_title, R.string.fingerprint_bottom_sheet_negative_button, 0, 0);
                this.A0A = A00;
                A00.A04 = this.A0D;
                AUh(A00);
                return;
            }
            Log.i("AppAuthSettingsActivity/setup");
            AUh(new SetupDeviceAuthDialog());
            return;
        }
        A1P();
    }

    public void lambda$onCreate$987$AppAuthSettingsActivity(View view) {
        boolean z = !this.A06.isChecked();
        C000200d.A0j(((ActivityC02290Ap) this).A0F, "privacy_fingerprint_show_notification_content", z);
        this.A06.setChecked(z);
        this.A0B.A05(null, 1);
        this.A0C.A04();
        this.A09.A02();
    }

    @Override // X.C0WV, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.app_auth_settings);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            TextView textView = (TextView) findViewById(R.id.security_settings_title);
            TextView textView2 = (TextView) findViewById(R.id.security_settings_desc);
            if (((ActivityC02270An) this).A06.A07()) {
                setTitle(R.string.settings_privacy_security_section_biometric_title);
                textView.setText(R.string.settings_privacy_biometric);
                textView2.setText(R.string.settings_privacy_biometric_message);
                this.A08 = new C11750iH(this, C02160Ac.A05(this), new AbstractC11700iC() { // from class: X.1jq
                    {
                        AppAuthSettingsActivity.this = this;
                    }

                    @Override // X.AbstractC11700iC
                    public void A01(int i, CharSequence charSequence) {
                        if (i == 7) {
                            AppAuthSettingsActivity appAuthSettingsActivity = AppAuthSettingsActivity.this;
                            ((ActivityC02290Ap) appAuthSettingsActivity).A0A.A0E(appAuthSettingsActivity.getString(R.string.app_auth_lockout_error_short, 30), 1);
                        }
                        Log.i("AppAuthSettingsActivity/error");
                        AppAuthSettingsActivity.this.A1P();
                    }

                    @Override // X.AbstractC11700iC
                    public void A02(C11710iD c11710iD) {
                        Log.i("AppAuthSettingsActivity/success");
                        AppAuthSettingsActivity appAuthSettingsActivity = AppAuthSettingsActivity.this;
                        ((ActivityC02270An) appAuthSettingsActivity).A06.A03(false);
                        C000200d.A0j(((ActivityC02290Ap) appAuthSettingsActivity).A0F, "privacy_fingerprint_enabled", true);
                        appAuthSettingsActivity.A0C.A04();
                        appAuthSettingsActivity.A1R(true);
                        appAuthSettingsActivity.A05.setChecked(true);
                        appAuthSettingsActivity.A09.A02();
                        ((ActivityC02270An) appAuthSettingsActivity).A06.A01(appAuthSettingsActivity);
                    }
                });
                C11730iF c11730iF = new C11730iF();
                c11730iF.A00 = getString(R.string.biometric_prompt_negative_button);
                c11730iF.A01 = getString(R.string.biometric_prompt_title);
                c11730iF.A03 = false;
                c11730iF.A02 = false;
                this.A07 = c11730iF.A00();
            } else {
                setTitle(R.string.settings_privacy_security_section_title);
                textView.setText(R.string.settings_privacy_fingerprint);
                textView2.setText(R.string.settings_privacy_fingerprint_message);
                if (bundle != null) {
                    FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) A0N().A0Q.A01(FingerprintBottomSheet.class.getName());
                    this.A0A = fingerprintBottomSheet;
                    if (fingerprintBottomSheet != null) {
                        fingerprintBottomSheet.A04 = this.A0D;
                    }
                }
            }
            this.A01 = findViewById(R.id.timeout);
            this.A05 = (SwitchCompat) findViewById(R.id.app_auth_settings_switch);
            this.A00 = findViewById(R.id.notification_preference);
            this.A06 = (SwitchCompat) findViewById(R.id.notification_content_switch);
            findViewById(R.id.app_auth_settings_preference).setOnClickListener(new View.OnClickListener() { // from class: X.1Ma
                {
                    AppAuthSettingsActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppAuthSettingsActivity.this.lambda$onCreate$986$AppAuthSettingsActivity(view);
                }
            });
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: X.1MZ
                {
                    AppAuthSettingsActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppAuthSettingsActivity.this.lambda$onCreate$987$AppAuthSettingsActivity(view);
                }
            });
            this.A02 = (RadioButton) findViewById(R.id.timeout_immediately);
            this.A03 = (RadioButton) findViewById(R.id.timeout_one_min);
            this.A04 = (RadioButton) findViewById(R.id.timeout_thirty_min);
            this.A02.setText(R.string.app_auth_timeout_immediately);
            this.A03.setText(((ActivityC02310Ar) this).A01.A0A(R.plurals.app_auth_timeout_values, 1L, 1));
            this.A04.setText(((ActivityC02310Ar) this).A01.A0A(R.plurals.app_auth_timeout_values, 30L, 30));
            this.A02.setOnClickListener(new View.OnClickListener() { // from class: X.1MY
                {
                    AppAuthSettingsActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppAuthSettingsActivity.this.A1Q(r2);
                }
            });
            this.A03.setOnClickListener(new View.OnClickListener() { // from class: X.1MY
                {
                    AppAuthSettingsActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppAuthSettingsActivity.this.A1Q(r2);
                }
            });
            this.A04.setOnClickListener(new View.OnClickListener() { // from class: X.1MY
                {
                    AppAuthSettingsActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppAuthSettingsActivity.this.A1Q(r2);
                }
            });
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (((ActivityC02270An) this).A06.A07()) {
            this.A08.A00();
            return;
        }
        FingerprintBottomSheet fingerprintBottomSheet = this.A0A;
        if (fingerprintBottomSheet == null) {
            return;
        }
        fingerprintBottomSheet.A04 = null;
        this.A0A = null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        Log.i("AppAuthSettingsActivity/update-ui");
        boolean z = ((ActivityC02290Ap) this).A0F.A00.getBoolean("privacy_fingerprint_enabled", false);
        long j = ((ActivityC02290Ap) this).A0F.A00.getLong("privacy_fingerprint_timeout", 60000L);
        boolean z2 = ((ActivityC02290Ap) this).A0F.A00.getBoolean("privacy_fingerprint_show_notification_content", true);
        A1R(z);
        StringBuilder sb = new StringBuilder("AppAuthSettingsActivity/update-timeout: ");
        sb.append(j);
        Log.i(sb.toString());
        this.A02.setChecked(j == 0);
        this.A03.setChecked(j == 60000);
        this.A04.setChecked(j == 1800000);
        this.A05.setChecked(z);
        this.A06.setChecked(z2);
    }
}
