package com.whatsapp.authentication;

import X.AbstractActivityC06540Tu;
import X.AbstractC11700iC;
import X.AbstractC27261Mr;
import X.C02160Ac;
import X.C03160Eo;
import X.C03170Ep;
import X.C0HE;
import X.C11730iF;
import X.C11740iG;
import X.C11750iH;
import X.C42271vT;
import X.InterfaceC06550Tv;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class AppAuthenticationActivity extends AbstractActivityC06540Tu implements InterfaceC06550Tv {
    public int A00;
    public C11740iG A01;
    public C11750iH A02;
    public C0HE A03;
    public C03160Eo A04;
    public C03170Ep A05;
    public FingerprintView A06;
    public Runnable A07;

    public static Intent A00(Context context) {
        Intent intent = new Intent(context, AppAuthenticationActivity.class);
        intent.setFlags(C42271vT.A09);
        return intent;
    }

    public final void A1G() {
        if (this.A00 == 0) {
            setResult(-1);
            return;
        }
        this.A04.A02();
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.A00);
        setResult(-1, intent);
    }

    public final void A1H() {
        Log.i("AuthenticationActivity/start-listening");
        if (this.A05.A07()) {
            this.A02.A01(this.A01);
            return;
        }
        this.A06.removeCallbacks(this.A07);
        C0HE c0he = new C0HE();
        this.A03 = c0he;
        this.A05.A02(c0he, this);
        FingerprintView fingerprintView = this.A06;
        fingerprintView.A03(fingerprintView.A04);
    }

    @Override // X.InterfaceC06550Tv
    public void AHZ(int i, CharSequence charSequence) {
        Log.i("AppAuthenticationActivity/fingerprint-error");
        this.A05.A03(true);
        if (i == 7) {
            Log.i("AppAuthenticationActivity/fingerprint-error-too-many-attempts");
            charSequence = getString(R.string.fingerprint_lockout_error, 30);
            this.A06.removeCallbacks(this.A07);
            this.A06.postDelayed(this.A07, 30000L);
        }
        this.A06.A04(charSequence);
    }

    @Override // X.InterfaceC06550Tv
    public void AHa() {
        Log.i("AppAuthenticationActivity/fingerprint-failed");
        this.A06.A00();
    }

    @Override // X.InterfaceC06550Tv
    public void AHb(int i, CharSequence charSequence) {
        Log.i("AppAuthenticationActivity/fingerprint-help");
        this.A06.A05(charSequence.toString());
    }

    @Override // X.InterfaceC06550Tv
    public void AHc(byte[] bArr) {
        Log.i("AppAuthenticationActivity/fingerprint-success");
        this.A05.A03(false);
        this.A06.A01();
    }

    public /* synthetic */ void lambda$onCreate$989$AppAuthenticationActivity(View view) {
        this.A02.A01(this.A01);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        ActivityManager A01 = this.A0E.A01();
        if (A01 == null || A01.getLockTaskModeState() != 2) {
            setResult(0);
            finishAffinity();
        }
    }

    @Override // X.AbstractActivityC06540Tu, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.A00 = extras.getInt("appWidgetId", 0);
        }
        if (!this.A05.A05()) {
            Log.i("AppAuthenticationActivity/onCreate: setting not enabled");
            A1G();
            finish();
            overridePendingTransition(0, 17432577);
            return;
        }
        setContentView(R.layout.activity_authentication);
        ((TextView) findViewById(R.id.auth_title)).setText(R.string.app_auth_locked_title);
        View findViewById = findViewById(R.id.app_unlock);
        this.A06 = (FingerprintView) findViewById(R.id.fingerprint_view);
        if (this.A05.A07()) {
            findViewById.setVisibility(0);
            this.A06.setVisibility(8);
            this.A02 = new C11750iH(this, C02160Ac.A05(this), new AbstractC11700iC() { // from class: X.1jr
                {
                    AppAuthenticationActivity.this = this;
                }

                @Override // X.AbstractC11700iC
                public void A01(int i, CharSequence charSequence) {
                    Log.i("AppAuthenticationActivity/error");
                    AppAuthenticationActivity appAuthenticationActivity = AppAuthenticationActivity.this;
                    appAuthenticationActivity.A05.A03(true);
                    if (i == 7) {
                        Log.i("AppAuthenticationActivity/error-too-many-attempts");
                        appAuthenticationActivity.A0A.A0E(appAuthenticationActivity.getString(R.string.app_auth_lockout_error, 30), 1);
                    }
                }

                @Override // X.AbstractC11700iC
                public void A02(C11710iD c11710iD) {
                    Log.i("AppAuthenticationActivity/success");
                    AppAuthenticationActivity appAuthenticationActivity = AppAuthenticationActivity.this;
                    appAuthenticationActivity.A05.A03(false);
                    appAuthenticationActivity.A1G();
                    appAuthenticationActivity.finish();
                }
            });
            C11730iF c11730iF = new C11730iF();
            c11730iF.A01 = getString(R.string.app_locked_biometric_prompt_title);
            c11730iF.A03 = true;
            c11730iF.A02 = false;
            this.A01 = c11730iF.A00();
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: X.1Mb
                {
                    AppAuthenticationActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppAuthenticationActivity.this.lambda$onCreate$989$AppAuthenticationActivity(view);
                }
            });
            return;
        }
        findViewById.setVisibility(8);
        this.A06.setVisibility(0);
        this.A06.A00 = new AbstractC27261Mr() { // from class: X.1js
            {
                AppAuthenticationActivity.this = this;
            }

            @Override // X.AbstractC27261Mr
            public void A00() {
                Log.i("AppAuthenticationActivity/fingerprint-success-animation-end");
                AppAuthenticationActivity appAuthenticationActivity = AppAuthenticationActivity.this;
                appAuthenticationActivity.A1G();
                appAuthenticationActivity.finish();
            }
        };
        this.A07 = new Runnable() { // from class: X.1Mo
            {
                AppAuthenticationActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AppAuthenticationActivity.this.A1H();
            }
        };
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        FingerprintView fingerprintView = this.A06;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        Log.i("AuthenticationActivity/stop-listening");
        if (this.A05.A07()) {
            this.A02.A00();
            return;
        }
        this.A06.removeCallbacks(this.A07);
        C0HE c0he = this.A03;
        if (c0he == null) {
            return;
        }
        try {
            try {
                c0he.A01();
            } catch (NullPointerException e) {
                e.getMessage();
            }
        } finally {
            this.A03 = null;
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.A05.A04()) {
            Log.i("AppAuthenticationActivity/not-enrolled");
            setResult(-1);
            finish();
            return;
        }
        Log.i("AuthenticationActivity/start-listening");
        if (this.A05.A07()) {
            this.A02.A01(this.A01);
            return;
        }
        this.A06.removeCallbacks(this.A07);
        C0HE c0he = new C0HE();
        this.A03 = c0he;
        this.A05.A02(c0he, this);
        FingerprintView fingerprintView = this.A06;
        fingerprintView.A03(fingerprintView.A04);
    }
}
