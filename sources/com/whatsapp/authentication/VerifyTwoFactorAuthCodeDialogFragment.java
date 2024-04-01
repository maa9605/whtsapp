package com.whatsapp.authentication;

import X.AbstractC02800Cx;
import X.ActivityC02330At;
import X.C000700j;
import X.C018508q;
import X.C02770Cu;
import X.C02780Cv;
import X.C02820Cz;
import X.C02E;
import X.C28E;
import X.C2E8;
import X.C34151h3;
import X.C41911ui;
import X.InterfaceC26591Jv;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.authentication.Hilt_VerifyTwoFactorAuthCodeDialogFragment;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class VerifyTwoFactorAuthCodeDialogFragment extends Hilt_VerifyTwoFactorAuthCodeDialogFragment implements C2E8 {
    public ProgressBar A01;
    public TextView A02;
    public CodeInputField A03;
    public C018508q A04;
    public C02E A05;
    public C41911ui A06;
    public final Runnable A08 = new Runnable() { // from class: X.1Mp
        {
            VerifyTwoFactorAuthCodeDialogFragment.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            VerifyTwoFactorAuthCodeDialogFragment.this.APy();
        }
    };
    public int A00 = 0;
    public final Handler A07 = new Handler(Looper.getMainLooper()) { // from class: X.1Ms
        {
            VerifyTwoFactorAuthCodeDialogFragment.this = this;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = VerifyTwoFactorAuthCodeDialogFragment.this;
                if (verifyTwoFactorAuthCodeDialogFragment.A00 == 0) {
                    if (verifyTwoFactorAuthCodeDialogFragment.A06.A02().equals(message.obj)) {
                        verifyTwoFactorAuthCodeDialogFragment.A00 = 2;
                        verifyTwoFactorAuthCodeDialogFragment.A06.A06(true);
                        verifyTwoFactorAuthCodeDialogFragment.A1A();
                        return;
                    }
                    verifyTwoFactorAuthCodeDialogFragment.A06.A06(false);
                    verifyTwoFactorAuthCodeDialogFragment.A02.setText(R.string.two_factor_auth_wrong_code_message);
                    verifyTwoFactorAuthCodeDialogFragment.A03.setCode("");
                    verifyTwoFactorAuthCodeDialogFragment.A03.setEnabled(true);
                    verifyTwoFactorAuthCodeDialogFragment.A01.setProgress(100);
                    C018508q c018508q = verifyTwoFactorAuthCodeDialogFragment.A04;
                    c018508q.A02.post(new RunnableC27151Mg(verifyTwoFactorAuthCodeDialogFragment));
                }
            }
        }
    };

    @Override // X.C0BA
    public void A0f() {
        this.A0U = true;
        C41911ui c41911ui = this.A06;
        C000700j.A07(c41911ui.A06.contains(this));
        c41911ui.A06.remove(this);
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        this.A06.A03(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Dialog dialog = new Dialog(A09());
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setContentView(R.layout.fragment_two_factor_auth_nag);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) dialog.findViewById(R.id.nag_text);
        textEmojiLabel.A07 = new C02770Cu();
        textEmojiLabel.setAccessibilityHelper(new C02780Cv(this.A05, textEmojiLabel));
        textEmojiLabel.setText(C28E.A06(A0F(R.string.two_factor_auth_code_nag_explanation), "forgot-pin", new Runnable() { // from class: X.1MX
            {
                VerifyTwoFactorAuthCodeDialogFragment.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = VerifyTwoFactorAuthCodeDialogFragment.this;
                C019208x c019208x = new C019208x(((Hilt_VerifyTwoFactorAuthCodeDialogFragment) verifyTwoFactorAuthCodeDialogFragment).A00);
                c019208x.A02(R.string.settings_two_factor_auth_disable_confirm);
                DialogInterfaceC019408z A00 = c019208x.A00();
                A00.A03(-1, verifyTwoFactorAuthCodeDialogFragment.A0F(R.string.settings_two_factor_auth_disable), new DialogInterface.OnClickListener() { // from class: X.1Ml
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        verifyTwoFactorAuthCodeDialogFragment.A19();
                    }
                });
                A00.A03(-2, verifyTwoFactorAuthCodeDialogFragment.A0F(R.string.cancel), new DialogInterface.OnClickListener() { // from class: X.1Mj
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                A00.show();
            }
        }));
        this.A02 = (TextView) dialog.findViewById(R.id.error);
        this.A03 = (CodeInputField) dialog.findViewById(R.id.code);
        String A0G = A0G(R.string.accessibility_two_factor_auth_code_entry, 6);
        CodeInputField codeInputField = this.A03;
        codeInputField.A07(new InterfaceC26591Jv() { // from class: X.1jx
            {
                VerifyTwoFactorAuthCodeDialogFragment.this = this;
            }

            @Override // X.InterfaceC26591Jv
            public void AIf(String str) {
                VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = VerifyTwoFactorAuthCodeDialogFragment.this;
                verifyTwoFactorAuthCodeDialogFragment.A03.setEnabled(false);
                verifyTwoFactorAuthCodeDialogFragment.A01.setProgress(0);
                Handler handler = verifyTwoFactorAuthCodeDialogFragment.A07;
                handler.removeMessages(0);
                handler.sendMessageDelayed(handler.obtainMessage(0, str), 400L);
            }

            @Override // X.InterfaceC26591Jv
            public void AMT(String str) {
                VerifyTwoFactorAuthCodeDialogFragment.this.A02.setText("");
            }
        }, 6, '*', '*', null, new C34151h3(codeInputField.getContext()), A0G);
        this.A03.setPasswordTransformationEnabled(true);
        this.A01 = (ProgressBar) dialog.findViewById(R.id.progress_bar_code_input_blocked);
        this.A03.setEnabled(true);
        this.A01.setProgress(100);
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.1Mk
            {
                VerifyTwoFactorAuthCodeDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = VerifyTwoFactorAuthCodeDialogFragment.this;
                C018508q c018508q = verifyTwoFactorAuthCodeDialogFragment.A04;
                c018508q.A02.post(new RunnableC27151Mg(verifyTwoFactorAuthCodeDialogFragment));
            }
        });
        return dialog;
    }

    public void A18() {
        this.A00 = 4;
        C41911ui c41911ui = this.A06;
        c41911ui.A01().edit().putLong("two_factor_auth_nag_time", c41911ui.A03.A05()).putInt("two_factor_auth_nag_interval", Math.max(c41911ui.A01().getInt("two_factor_auth_nag_interval", 0), 2)).putBoolean("two_factor_auth_last_code_correctness", true).apply();
        A1A();
    }

    public void A19() {
        this.A00 = 1;
        this.A04.A06(0, R.string.two_factor_auth_disabling);
        C018508q c018508q = this.A04;
        c018508q.A02.postDelayed(this.A08, 5000L);
        C41911ui c41911ui = this.A06;
        if (c41911ui != null) {
            Log.i("twofactorauthmanager/disable-two-factor-auth");
            c41911ui.A04("", null);
            return;
        }
        throw null;
    }

    public final void A1A() {
        ActivityC02330At A09 = A09();
        if (A09 != null) {
            AbstractC02800Cx A0N = A09.A0N();
            if (A0N != null) {
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A06(this);
                c02820Cz.A06 = 8194;
                c02820Cz.A05();
                return;
            }
            throw null;
        }
    }

    @Override // X.C2E8
    public synchronized void APy() {
        if (this.A00 != 1) {
            return;
        }
        this.A00 = 0;
        C018508q c018508q = this.A04;
        c018508q.A02.removeCallbacks(this.A08);
        C018508q c018508q2 = this.A04;
        c018508q2.A02.postDelayed(new Runnable() { // from class: X.1Mi
            {
                VerifyTwoFactorAuthCodeDialogFragment.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = VerifyTwoFactorAuthCodeDialogFragment.this;
                verifyTwoFactorAuthCodeDialogFragment.A04.A03();
                C019208x c019208x = new C019208x(((Hilt_VerifyTwoFactorAuthCodeDialogFragment) verifyTwoFactorAuthCodeDialogFragment).A00);
                c019208x.A02(R.string.two_factor_auth_save_error);
                DialogInterfaceC019408z A00 = c019208x.A00();
                A00.A03(-1, verifyTwoFactorAuthCodeDialogFragment.A0F(R.string.retry), new DialogInterface.OnClickListener() { // from class: X.1Mn
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        verifyTwoFactorAuthCodeDialogFragment.A19();
                    }
                });
                A00.A03(-2, verifyTwoFactorAuthCodeDialogFragment.A0F(R.string.cancel), new DialogInterface.OnClickListener() { // from class: X.1Mm
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        verifyTwoFactorAuthCodeDialogFragment.A18();
                    }
                });
                A00.show();
            }
        }, 500L);
    }

    @Override // X.C2E8
    public synchronized void APz() {
        if (this.A00 != 1) {
            return;
        }
        this.A00 = 3;
        C018508q c018508q = this.A04;
        c018508q.A02.removeCallbacks(this.A08);
        C018508q c018508q2 = this.A04;
        c018508q2.A02.postDelayed(new Runnable() { // from class: X.1Mh
            {
                VerifyTwoFactorAuthCodeDialogFragment.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = VerifyTwoFactorAuthCodeDialogFragment.this;
                verifyTwoFactorAuthCodeDialogFragment.A04.A03();
                verifyTwoFactorAuthCodeDialogFragment.A04.A07(R.string.two_factor_auth_disabled, 0);
                verifyTwoFactorAuthCodeDialogFragment.A1A();
            }
        }, 500L);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        ActivityC02330At A09;
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        int i = this.A00;
        if (i == 2 || i == 4 || (A09 = A09()) == null) {
            return;
        }
        A09.finish();
    }
}
