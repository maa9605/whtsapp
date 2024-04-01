package com.whatsapp.registration;

import X.AbstractC465527h;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.C000200d;
import X.C000800k;
import X.C001200o;
import X.C002301c;
import X.C005102h;
import X.C018808t;
import X.C019208x;
import X.C019308y;
import X.C02770Cu;
import X.C02780Cv;
import X.C02E;
import X.C02F;
import X.C0BA;
import X.C0E7;
import X.C0HS;
import X.C0U1;
import X.C28E;
import X.C2Aa;
import X.C2CQ;
import X.C2DT;
import X.C2LZ;
import X.C2P1;
import X.C34151h3;
import X.C3UN;
import X.C3VD;
import X.C3VI;
import X.C40071rX;
import X.C41451tw;
import X.C41911ui;
import X.C47922Dc;
import X.C49622Lq;
import X.C79863mL;
import X.C79873mM;
import X.InterfaceC001000m;
import X.InterfaceC002901k;
import X.InterfaceC26591Jv;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class VerifyTwoFactorAuth extends C2LZ {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public CountDownTimer A04;
    public ProgressBar A05;
    public TextView A06;
    public CodeInputField A07;
    public C000800k A08;
    public C0E7 A09;
    public C02E A0A;
    public AnonymousClass012 A0B;
    public C001200o A0C;
    public C005102h A0D;
    public C02F A0E;
    public C49622Lq A0F;
    public C41451tw A0G;
    public C018808t A0H;
    public C2P1 A0I;
    public C3VD A0J;
    public C3VI A0K;
    public C2DT A0L;
    public C2Aa A0M;
    public C2CQ A0N;
    public C79863mL A0O;
    public C79873mM A0P;
    public AbstractC465527h A0Q;
    public C40071rX A0R;
    public C41911ui A0S;
    public InterfaceC002901k A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final Handler A0a = new Handler(Looper.getMainLooper());
    public final Runnable A0c = new RunnableEBaseShape5S0100000_I0_5(this, 38);
    public final InterfaceC001000m A0b = new InterfaceC001000m() { // from class: X.3m1
        {
            VerifyTwoFactorAuth.this = this;
        }

        @Override // X.InterfaceC001000m
        public final void AIx(C05050Nc c05050Nc) {
            CodeInputField codeInputField;
            VerifyTwoFactorAuth verifyTwoFactorAuth = VerifyTwoFactorAuth.this;
            if (c05050Nc.A02 && (codeInputField = verifyTwoFactorAuth.A07) != null && codeInputField.getCode().length() == 6) {
                verifyTwoFactorAuth.A1S(verifyTwoFactorAuth.A07.getCode(), 0, false);
            }
        }
    };

    public static Intent A00(Context context, String str) {
        Intent intent = new Intent(context, VerifyTwoFactorAuth.class);
        intent.putExtra("callerScreen", str);
        intent.putExtra("actionTaken", "continue");
        return intent;
    }

    @Override // X.ActivityC02290Ap
    public void A10(int i) {
        if (i == R.string.two_factor_auth_wrong_code_message) {
            if (this.A07.isEnabled()) {
                InputMethodManager A0I = this.A0A.A0I();
                if (A0I != null) {
                    A0I.toggleSoftInput(1, 0);
                    return;
                }
                throw null;
            }
        } else if (i != R.string.register_stale && i != R.string.register_verify_again && i != R.string.two_factor_auth_too_many_tries) {
        } else {
            this.A0M.A0A();
            startActivity(new Intent(this, RegisterPhone.class));
            finish();
        }
    }

    public final int A1P() {
        if (((this.A03 * 1000) + this.A01) - this.A0B.A05() > 0) {
            return 1;
        }
        String str = this.A0X;
        if ("offline".equals(str)) {
            return 2;
        }
        return "full".equals(str) ? 3 : 1;
    }

    public final void A1Q(final long j) {
        if (j < 1000) {
            getPreferences(0).edit().remove("code_retry_time").apply();
            CountDownTimer countDownTimer = this.A04;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.A04 = null;
                return;
            }
            return;
        }
        getPreferences(0).edit().putLong("code_retry_time", this.A0B.A05() + j).apply();
        ((ActivityC02270An) this).A0F.A01(this.A07);
        this.A07.setEnabled(false);
        this.A05.setProgress(0);
        this.A06.setText(R.string.two_factor_auth_code_guessed_too_fast_message);
        this.A06.setVisibility(0);
        this.A04 = new CountDownTimer(j) { // from class: X.3VQ
            {
                VerifyTwoFactorAuth.this = this;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                VerifyTwoFactorAuth verifyTwoFactorAuth = VerifyTwoFactorAuth.this;
                CountDownTimer countDownTimer2 = verifyTwoFactorAuth.A04;
                if (countDownTimer2 != null) {
                    countDownTimer2.cancel();
                    verifyTwoFactorAuth.A04 = null;
                }
                verifyTwoFactorAuth.A07.setEnabled(true);
                verifyTwoFactorAuth.A05.setProgress(100);
                verifyTwoFactorAuth.A06.setVisibility(4);
                verifyTwoFactorAuth.A06.setText(verifyTwoFactorAuth.getString(R.string.two_factor_auth_enter_code_description_with_placeholder, 6));
                verifyTwoFactorAuth.getPreferences(0).edit().remove("code_retry_time").apply();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                ProgressBar progressBar = VerifyTwoFactorAuth.this.A05;
                long j3 = j;
                progressBar.setProgress((int) (((j3 - j2) * 100.0d) / j3));
            }
        }.start();
    }

    public void A1R(C47922Dc c47922Dc) {
        this.A0X = c47922Dc.A08;
        this.A0W = c47922Dc.A07;
        this.A03 = c47922Dc.A02;
        this.A00 = c47922Dc.A01;
        this.A02 = c47922Dc.A00;
        long A05 = this.A0B.A05();
        this.A01 = A05;
        ((ActivityC02290Ap) this).A0F.A0c(this.A0X, this.A0W, this.A03, this.A00, this.A02, A05);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.3mM, X.0HS] */
    public final void A1S(String str, int i, boolean z) {
        InterfaceC002901k interfaceC002901k = this.A0T;
        ?? r2 = new C0HS(((ActivityC02310Ar) this).A01, ((ActivityC02290Ap) this).A0F, this.A0L, this.A0V, this.A0U, str, this.A0W, i, z, this) { // from class: X.3mM
            public C47922Dc A00;
            public final int A01;
            public final int A02;
            public final C000500h A03;
            public final C002301c A04;
            public final C2DT A05;
            public final String A06;
            public final String A07;
            public final String A08;
            public final String A09;
            public final WeakReference A0A;
            public final boolean A0B;

            {
                this.A04 = r2;
                this.A03 = r3;
                this.A05 = r4;
                this.A08 = r5;
                this.A07 = r6;
                this.A06 = str;
                this.A09 = r8;
                this.A0B = z;
                this.A02 = i;
                this.A0A = new WeakReference(this);
                if (i == 1) {
                    this.A01 = 33;
                } else if (i != 2) {
                    this.A01 = 31;
                } else {
                    this.A01 = 34;
                }
            }

            @Override // X.C0HS
            public void A06() {
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A0A.get();
                if (verifyTwoFactorAuth != null) {
                    Log.i("verifytwofactorauth/verifycodetask/pre");
                    verifyTwoFactorAuth.A07.setEnabled(false);
                    verifyTwoFactorAuth.A05.setProgress(0);
                    C002701i.A19(verifyTwoFactorAuth, this.A01);
                }
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                try {
                    C000500h c000500h = this.A03;
                    int i2 = c000500h.A00.getInt("reg_attempts_verify_2fa", 0) + 1;
                    c000500h.A0D().putInt("reg_attempts_verify_2fa", i2).apply();
                    C2DX c2dx = new C2DX(i2);
                    String str2 = this.A06;
                    if (str2 != null) {
                        C2DT c2dt = this.A05;
                        String str3 = this.A07;
                        String str4 = this.A08;
                        c2dt.A05();
                        byte[] A09 = c2dt.A09(str3, str4);
                        Log.i("http/registration/wamsys/verifysecuritycode");
                        HashMap hashMap = new HashMap();
                        hashMap.put("client_metrics", c2dx.A00().toString().getBytes());
                        c2dt.A08(hashMap);
                        c2dt.A07(hashMap);
                        C47922Dc c47922Dc = (C47922Dc) C2DZ.A00(new C47912Db(c2dt.A0F, c2dt.A00, str2, 0, null, str3, str4, A09, hashMap, c2dt.A04()));
                        if (c47922Dc != null && c47922Dc.A03 == EnumC47932Dd.YES) {
                            c2dt.A06(c47922Dc.A04);
                        }
                        this.A00 = c47922Dc;
                    } else {
                        int i3 = this.A02;
                        if (i3 == 1) {
                            this.A00 = this.A05.A02(this.A07, this.A08, "email", null, c2dx);
                        } else if (i3 == 2) {
                            this.A00 = this.A05.A02(this.A07, this.A08, "wipe", this.A09, c2dx);
                        }
                    }
                    return this.A00.A03;
                } catch (Exception e) {
                    Log.e("verifytwofactorauth/verifycodetask/error ", e);
                    return EnumC47932Dd.ERROR_UNSPECIFIED;
                }
            }

            @Override // X.C0HS
            public void A08() {
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A0A.get();
                if (verifyTwoFactorAuth != null) {
                    verifyTwoFactorAuth.A07.setEnabled(true);
                    verifyTwoFactorAuth.A05.setProgress(100);
                }
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                EnumC47932Dd enumC47932Dd = (EnumC47932Dd) obj;
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A0A.get();
                if (verifyTwoFactorAuth != null) {
                    verifyTwoFactorAuth.A0P = null;
                    C002701i.A18(verifyTwoFactorAuth, this.A01);
                    verifyTwoFactorAuth.A07.setEnabled(true);
                    verifyTwoFactorAuth.A05.setProgress(100);
                    verifyTwoFactorAuth.A0Z = false;
                    C000800k c000800k = verifyTwoFactorAuth.A08;
                    InterfaceC001000m interfaceC001000m = verifyTwoFactorAuth.A0b;
                    c000800k.A00(interfaceC001000m);
                    switch (enumC47932Dd.ordinal()) {
                        case 0:
                            if (this.A02 == 1) {
                                Log.i("verifytwofactorauth/verifycodetask/reset-email-sent");
                                verifyTwoFactorAuth.AUj(R.string.two_factor_auth_reset_successful);
                                verifyTwoFactorAuth.A19("forgotPinDialogTag");
                                verifyTwoFactorAuth.A1R(this.A00);
                                verifyTwoFactorAuth.A1U(false);
                                verifyTwoFactorAuth.A0a.postDelayed(verifyTwoFactorAuth.A0c, 0L);
                                return;
                            } else if (TextUtils.isEmpty(this.A00.A06)) {
                                return;
                            } else {
                                Log.i("verifytwofactorauth/verifycodetask/verified");
                                verifyTwoFactorAuth.A1U(true);
                                C000200d.A0j(this.A03, "new_jid", this.A00.A09);
                                C47922Dc c47922Dc = this.A00;
                                verifyTwoFactorAuth.A1T(c47922Dc.A0A ? this.A06 : null, c47922Dc.A06);
                                return;
                            }
                        case 1:
                            Log.w("verifytwofactorauth/verifycodetask/unspecified");
                            if (!A04()) {
                                verifyTwoFactorAuth.A0Z = true;
                                try {
                                    verifyTwoFactorAuth.A08.A01(interfaceC001000m);
                                } catch (IllegalStateException unused) {
                                }
                            }
                            C002701i.A19(verifyTwoFactorAuth, 109);
                            return;
                        case 2:
                        case 9:
                            Log.w("verifytwofactorauth/verifycodetask/connectivity");
                            if (!verifyTwoFactorAuth.A0J.A02 && !verifyTwoFactorAuth.AFE()) {
                                C002701i.A19(verifyTwoFactorAuth, 32);
                                return;
                            } else {
                                C28E.A0E(verifyTwoFactorAuth, verifyTwoFactorAuth.A0D, 32);
                                return;
                            }
                        case 3:
                            Log.w("verifytwofactorauth/verifycodetask/incorrect");
                            verifyTwoFactorAuth.A1U(true);
                            verifyTwoFactorAuth.A0J.A02(R.string.register_verify_again);
                            return;
                        case 4:
                            boolean equals = this.A06.equals(this.A03.A00.getString("registration_code", null));
                            C000200d.A1C("verifytwofactorauth/verifycodetask/mismatch ", equals);
                            verifyTwoFactorAuth.A07.setText("");
                            if (equals) {
                                verifyTwoFactorAuth.A0J.A02(R.string.two_factor_auth_accidental_sms_error);
                            } else {
                                verifyTwoFactorAuth.A0J.A02(R.string.two_factor_auth_wrong_code_message);
                            }
                            try {
                                verifyTwoFactorAuth.A1Q(Long.parseLong(this.A00.A05) * 1000);
                                return;
                            } catch (NumberFormatException e) {
                                StringBuilder A0P = C000200d.A0P("verifytwofactorauth/verifycodetask/mismatch failed to parse: ");
                                A0P.append(this.A00.A05);
                                Log.w(A0P.toString(), e);
                                return;
                            }
                        case 5:
                            Log.w("verifytwofactorauth/verifycodetask/too-many-guesses");
                            verifyTwoFactorAuth.A1U(true);
                            verifyTwoFactorAuth.A0J.A02(R.string.two_factor_auth_too_many_tries);
                            return;
                        case 6:
                            Log.w("verifytwofactorauth/verifycodetask/guessed-too-fast");
                            try {
                                long parseLong = Long.parseLong(this.A00.A05) * 1000;
                                verifyTwoFactorAuth.A0J.A03(verifyTwoFactorAuth.getString(R.string.register_guessed_too_fast_with_time, AnonymousClass029.A0k(this.A04, parseLong)));
                                verifyTwoFactorAuth.A1Q(parseLong);
                                return;
                            } catch (NumberFormatException e2) {
                                StringBuilder A0P2 = C000200d.A0P("verifytwofactorauth/verifycodetask/too_fast failed to parse: ");
                                A0P2.append(this.A00.A05);
                                Log.w(A0P2.toString(), e2);
                                verifyTwoFactorAuth.A0J.A02(R.string.two_factor_auth_too_many_tries);
                                return;
                            }
                        case 7:
                            Log.w("verifytwofactorauth/verifycodetask/reset-too-soon");
                            verifyTwoFactorAuth.A0J.A02(R.string.two_factor_auth_reset_too_soon_message);
                            return;
                        case 8:
                            Log.w("verifytwofactorauth/verifycodetask/stale");
                            int A1P = verifyTwoFactorAuth.A1P();
                            verifyTwoFactorAuth.A1R(this.A00);
                            int A1P2 = verifyTwoFactorAuth.A1P();
                            if (!this.A0B && A1P == A1P2) {
                                verifyTwoFactorAuth.A1S(this.A06, this.A02, true);
                                return;
                            }
                            verifyTwoFactorAuth.A1U(true);
                            verifyTwoFactorAuth.A0J.A02(R.string.register_stale);
                            return;
                        case 10:
                            Log.w("verifytwofactorauth/verifycodetask/blocked");
                            verifyTwoFactorAuth.A1U(true);
                            C002701i.A19(verifyTwoFactorAuth, 124);
                            return;
                        default:
                            return;
                    }
                }
            }
        };
        this.A0P = r2;
        interfaceC002901k.ARy(r2, new String[0]);
    }

    public void A1T(String str, String str2) {
        this.A0M.A0D(this.A0U, this.A0V, str2);
        this.A0S.A05(str, null, 5);
        if (this.A0J.A02) {
            C28E.A0F(this, this.A0M, this.A0D, false);
            finish();
        } else if (!this.A0Y) {
            this.A0M.A0B(2);
            A16(new Intent(this, RegisterName.class), true);
        } else {
            this.A0M.A0E();
            finish();
        }
    }

    public final void A1U(boolean z) {
        C79863mL c79863mL = this.A0O;
        if (c79863mL != null) {
            c79863mL.A05(true);
        }
        if (z) {
            this.A00 = -1L;
            ((ActivityC02290Ap) this).A0F.A0c(this.A0X, this.A0W, this.A03, -1L, this.A02, this.A01);
        }
        this.A0a.removeCallbacks(this.A0c);
    }

    @Override // X.C2LZ, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0K = new C3VI(this.A0T, this.A0R, ((ActivityC02310Ar) this).A01, this.A0F, this.A0G);
        setTitle(R.string.two_factor_auth_verify_title);
        this.A0J = new C3VD(this, ((ActivityC02290Ap) this).A0F);
        Intent intent = getIntent();
        if (intent.getExtras() != null && intent.getBooleanExtra("changenumber", false)) {
            this.A0Y = true;
        }
        setContentView(R.layout.activity_two_factor_auth_verify);
        String stringExtra = intent.getStringExtra("callerScreen");
        String stringExtra2 = intent.getStringExtra("actionTaken");
        C2P1 c2p1 = this.A0I;
        if (c2p1.A03) {
            ((InterfaceC002901k) c2p1.A02.get()).AS1(new C3UN(c2p1, stringExtra, stringExtra2));
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
        if (!ViewConfiguration.get(getApplicationContext()).hasPermanentMenuKey()) {
            A0k(toolbar);
            C0U1 A0c = A0c();
            if (A0c != null) {
                A0c.A0L(false);
                A0c.A0O(false);
            }
        }
        this.A07 = (CodeInputField) findViewById(R.id.code);
        this.A07.A07(new InterfaceC26591Jv() { // from class: X.3mK
            @Override // X.InterfaceC26591Jv
            public void AMT(String str) {
            }

            {
                VerifyTwoFactorAuth.this = this;
            }

            @Override // X.InterfaceC26591Jv
            public void AIf(String str) {
                VerifyTwoFactorAuth verifyTwoFactorAuth = VerifyTwoFactorAuth.this;
                verifyTwoFactorAuth.A1S(verifyTwoFactorAuth.A07.getCode(), 0, false);
            }
        }, 6, '*', '*', null, new C34151h3(this), getString(R.string.accessibility_two_factor_auth_code_entry, 6));
        this.A07.setPasswordTransformationEnabled(true);
        this.A05 = (ProgressBar) findViewById(R.id.progress_bar_code_input_blocked);
        this.A07.setEnabled(true);
        this.A05.setProgress(100);
        this.A06 = (TextView) findViewById(R.id.description_bottom);
        this.A0U = ((ActivityC02290Ap) this).A0F.A0H();
        this.A0V = ((ActivityC02290Ap) this).A0F.A0J();
        this.A0X = ((ActivityC02290Ap) this).A0F.A00.getString("registration_wipe_type", null);
        this.A0W = ((ActivityC02290Ap) this).A0F.A00.getString("registration_wipe_token", null);
        this.A03 = ((ActivityC02290Ap) this).A0F.A00.getLong("registration_wipe_wait", -1L);
        this.A00 = ((ActivityC02290Ap) this).A0F.A00.getLong("registration_wipe_expiry", -1L);
        this.A02 = ((ActivityC02290Ap) this).A0F.A00.getLong("registration_wipe_server_time", -1L);
        this.A01 = ((ActivityC02290Ap) this).A0F.A00.getLong("registration_wipe_info_timestamp", -1L);
        if (this.A00 > 0) {
            A1U(false);
            this.A0a.postDelayed(this.A0c, 0L);
        }
        if (bundle == null || bundle.getBoolean("shouldShowTheForgetPinDialog", false)) {
            return;
        }
        A19("forgotPinDialogTag");
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 109) {
            if (i != 124) {
                if (i != 125) {
                    switch (i) {
                        case 31:
                            ProgressDialog progressDialog = new ProgressDialog(this);
                            progressDialog.setMessage(getString(R.string.register_voice_verifying));
                            progressDialog.setIndeterminate(true);
                            progressDialog.setCancelable(false);
                            return progressDialog;
                        case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                            C019208x c019208x = new C019208x(this);
                            c019208x.A01.A0E = getString(R.string.register_check_connectivity, getString(R.string.connectivity_self_help_instructions));
                            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3V1
                                {
                                    VerifyTwoFactorAuth.this = this;
                                }

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    C002701i.A18(VerifyTwoFactorAuth.this, 32);
                                }
                            });
                            return c019208x.A00();
                        case 33:
                            ProgressDialog progressDialog2 = new ProgressDialog(this);
                            progressDialog2.setMessage(getString(R.string.two_factor_auth_sending_email));
                            progressDialog2.setIndeterminate(true);
                            progressDialog2.setCancelable(false);
                            return progressDialog2;
                        case 34:
                            ProgressDialog progressDialog3 = new ProgressDialog(this);
                            progressDialog3.setMessage(getString(R.string.two_factor_auth_resetting_account));
                            progressDialog3.setIndeterminate(true);
                            progressDialog3.setCancelable(false);
                            return progressDialog3;
                        default:
                            return super.onCreateDialog(i);
                    }
                }
                return C28E.A04(this, this.A0H, this.A0U, this.A0V);
            }
            return C28E.A03(this, ((ActivityC02310Ar) this).A01, this.A0H, this.A0U, this.A0V, new RunnableEBaseShape5S0100000_I0_5(this, 37));
        }
        return C28E.A05(this, this.A0T, this.A0A, this.A0H, this.A09, this.A0E, this.A0L);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.registration_help);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        C79873mM c79873mM = this.A0P;
        if (c79873mM != null) {
            c79873mM.A05(true);
        }
        A1U(false);
        CountDownTimer countDownTimer = this.A04;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A04 = null;
        }
        this.A0Z = false;
        this.A08.A00(this.A0b);
        this.A0K.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder A0P = C000200d.A0P("register-2fa +");
        A0P.append(this.A0U);
        A0P.append(this.A0V);
        String obj = A0P.toString();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0N.A02("verify-2fa");
            this.A0K.A01(this, this.A0N, obj);
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0M.A0A();
            startActivity(EULA.A00(this));
            finishAffinity();
            return true;
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A04 == null) {
            long j = getPreferences(0).getLong("code_retry_time", -1L);
            if (j != -1) {
                A1Q(j - this.A0B.A05());
            }
        }
        this.A07.requestFocus();
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.description);
        textEmojiLabel.A07 = new C02770Cu();
        textEmojiLabel.setAccessibilityHelper(new C02780Cv(this.A0A, textEmojiLabel));
        textEmojiLabel.setText(C28E.A06(getString(R.string.two_factor_auth_verify_code_info), "forgot-pin", new RunnableEBaseShape5S0100000_I0_5(this, 36)));
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("shouldShowTheForgetPinDialog", A0N().A0Q.A01("forgotPinDialogTag") != null);
        super.onSaveInstanceState(bundle);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.A0Z) {
            this.A0Z = true;
            try {
                this.A08.A01(this.A0b);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        this.A0Z = true;
        this.A08.A00(this.A0b);
    }

    /* loaded from: classes2.dex */
    public class ConfirmResetCode extends Hilt_VerifyTwoFactorAuth_ConfirmResetCode {
        public C002301c A00;

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            String A0c;
            Bundle bundle2 = ((C0BA) this).A06;
            int i = bundle2.getInt("wipeStatus");
            long j = bundle2.getLong("timeToWaitInMillis");
            C019208x c019208x = new C019208x(((Hilt_VerifyTwoFactorAuth_ConfirmResetCode) this).A00);
            View inflate = LayoutInflater.from(((Hilt_VerifyTwoFactorAuth_ConfirmResetCode) this).A00).inflate(R.layout.two_fa_help_dialog, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.two_fa_help_dialog_text);
            View findViewById = inflate.findViewById(16908313);
            View findViewById2 = inflate.findViewById(16908314);
            View findViewById3 = inflate.findViewById(16908315);
            View findViewById4 = inflate.findViewById(R.id.spacer);
            findViewById.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 47));
            findViewById2.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 46));
            if (i == 1) {
                long millis = TimeUnit.DAYS.toMillis(1L);
                if (j > millis) {
                    A0c = AnonymousClass029.A0c(this.A00, (int) (j / millis), 3);
                } else {
                    long millis2 = TimeUnit.HOURS.toMillis(1L);
                    if (j > millis2) {
                        A0c = AnonymousClass029.A0c(this.A00, (int) (j / millis2), 2);
                    } else {
                        long millis3 = TimeUnit.MINUTES.toMillis(1L);
                        if (j > millis3) {
                            A0c = AnonymousClass029.A0c(this.A00, (int) (j / millis3), 1);
                        } else {
                            A0c = AnonymousClass029.A0c(this.A00, (int) (j / TimeUnit.SECONDS.toMillis(1L)), 0);
                        }
                    }
                }
                textView.setText(A0G(R.string.two_factor_auth_forgot_code_info_with_time, A0c));
            } else if (i == 2 || i == 3) {
                textView.setText(R.string.two_factor_auth_reset_info);
                findViewById3.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 45));
                findViewById3.setVisibility(0);
                findViewById4.setVisibility(0);
            }
            C019308y c019308y = c019208x.A01;
            c019308y.A0C = inflate;
            c019308y.A01 = 0;
            return c019208x.A00();
        }
    }

    /* loaded from: classes2.dex */
    public class ConfirmWipe extends Hilt_VerifyTwoFactorAuth_ConfirmWipe {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            int i = ((C0BA) this).A06.getInt("wipeStatus");
            final VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) A09();
            C019208x c019208x = new C019208x(verifyTwoFactorAuth);
            c019208x.A06(R.string.two_factor_auth_reset_account_label, new DialogInterface.OnClickListener() { // from class: X.3Uz
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    final VerifyTwoFactorAuth verifyTwoFactorAuth2 = verifyTwoFactorAuth;
                    C019208x c019208x2 = new C019208x(verifyTwoFactorAuth2);
                    c019208x2.A02(R.string.two_factor_auth_reset_wipe_secondary_confirmation);
                    c019208x2.A06(R.string.two_factor_auth_reset_account_label, new DialogInterface.OnClickListener() { // from class: X.3V0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i3) {
                            verifyTwoFactorAuth2.A1S(null, 2, false);
                        }
                    });
                    c019208x2.A04(R.string.cancel, null);
                    c019208x2.A01();
                }
            });
            c019208x.A04(R.string.cancel, null);
            if (i == 1 || i == 2) {
                c019208x.A02(R.string.two_factor_auth_reset_wipe_offline_info);
            } else if (i == 3) {
                c019208x.A02(R.string.two_factor_auth_reset_wipe_full_info);
            }
            return c019208x.A00();
        }
    }
}
