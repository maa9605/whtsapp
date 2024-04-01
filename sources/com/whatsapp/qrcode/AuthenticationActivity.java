package com.whatsapp.qrcode;

import X.AbstractC27261Mr;
import X.C03170Ep;
import X.C0HE;
import X.C2Oi;
import X.InterfaceC06550Tv;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.FingerprintView;
import com.whatsapp.qrcode.AuthenticationActivity;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class AuthenticationActivity extends C2Oi implements InterfaceC06550Tv {
    public C0HE A00;
    public C03170Ep A01;
    public FingerprintView A02;
    public Runnable A03;

    public final void A1G() {
        Log.i("AuthenticationActivity/start-listening");
        this.A02.removeCallbacks(this.A03);
        C0HE c0he = new C0HE();
        this.A00 = c0he;
        this.A01.A02(c0he, this);
        FingerprintView fingerprintView = this.A02;
        fingerprintView.A03(fingerprintView.A04);
    }

    @Override // X.InterfaceC06550Tv
    public void AHZ(int i, CharSequence charSequence) {
        Log.i("AuthenticationActivity/fingerprint-error");
        if (i == 7) {
            Log.i("AuthenticationActivity/fingerprint-error-too-many-attempts");
            charSequence = getString(R.string.fingerprint_lockout_error, 30);
            this.A02.removeCallbacks(this.A03);
            this.A02.postDelayed(this.A03, 30000L);
        }
        this.A02.A04(charSequence);
    }

    @Override // X.InterfaceC06550Tv
    public void AHa() {
        Log.i("AuthenticationActivity/fingerprint-failed");
        this.A02.A00();
    }

    @Override // X.InterfaceC06550Tv
    public void AHb(int i, CharSequence charSequence) {
        Log.i("AuthenticationActivity/fingerprint-help");
        this.A02.A05(charSequence.toString());
    }

    @Override // X.InterfaceC06550Tv
    public void AHc(byte[] bArr) {
        Log.i("AuthenticationActivity/fingerprint-success");
        this.A02.A01();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    @Override // X.C2Oi, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A01.A04()) {
            Log.i("AuthenticationActivity/onCreate: setting not enabled");
            setResult(-1);
            finish();
            overridePendingTransition(0, 17432577);
            return;
        }
        setContentView(R.layout.activity_authentication);
        ((TextView) findViewById(R.id.auth_title)).setText(getIntent().getStringExtra("extra_auth_title"));
        FingerprintView fingerprintView = (FingerprintView) findViewById(R.id.fingerprint_view);
        this.A02 = fingerprintView;
        fingerprintView.A00 = new AbstractC27261Mr() { // from class: X.3le
            {
                AuthenticationActivity.this = this;
            }

            @Override // X.AbstractC27261Mr
            public void A00() {
                Log.i("AuthenticationActivity/fingerprint-success-animation-end");
                AuthenticationActivity authenticationActivity = AuthenticationActivity.this;
                authenticationActivity.setResult(-1);
                authenticationActivity.finish();
            }
        };
        this.A03 = new RunnableEBaseShape5S0100000_I0_5(this, 20);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        FingerprintView fingerprintView = this.A02;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        Log.i("AuthenticationActivity/stop-listening");
        this.A02.removeCallbacks(this.A03);
        C0HE c0he = this.A00;
        if (c0he != null) {
            try {
                try {
                    c0he.A01();
                } catch (NullPointerException e) {
                    e.getMessage();
                }
            } finally {
                this.A00 = null;
            }
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.A01.A04()) {
            Log.i("AuthenticationActivity/not-enrolled");
            setResult(-1);
            finish();
            return;
        }
        Log.i("AuthenticationActivity/start-listening");
        this.A02.removeCallbacks(this.A03);
        C0HE c0he = new C0HE();
        this.A00 = c0he;
        this.A01.A02(c0he, this);
        FingerprintView fingerprintView = this.A02;
        fingerprintView.A03(fingerprintView.A04);
    }
}
