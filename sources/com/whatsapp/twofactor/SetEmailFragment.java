package com.whatsapp.twofactor;

import X.C000200d;
import X.C019208x;
import X.C02160Ac;
import X.C02770Cu;
import X.C02780Cv;
import X.C02E;
import X.C28E;
import X.C2JT;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.twofactor.SetEmailFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I0_3;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class SetEmailFragment extends Hilt_SetEmailFragment {
    public int A00;
    public TextWatcher A01 = new C2JT() { // from class: X.3sF
        {
            SetEmailFragment.this = this;
        }

        @Override // X.C2JT, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String trim = editable.toString().trim();
            SetEmailFragment setEmailFragment = SetEmailFragment.this;
            int i = setEmailFragment.A00;
            if (i == 1) {
                setEmailFragment.A06.A04 = trim;
            } else if (i == 2) {
                setEmailFragment.A04.setText("");
                setEmailFragment.A06.A05 = trim;
            }
            setEmailFragment.A0y();
        }
    };
    public Button A02;
    public EditText A03;
    public TextView A04;
    public C02E A05;
    public TwoFactorAuthActivity A06;

    /* loaded from: classes2.dex */
    public class ConfirmSkipEmailDialog extends Hilt_SetEmailFragment_ConfirmSkipEmailDialog {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            C019208x c019208x = new C019208x(((Hilt_SetEmailFragment_ConfirmSkipEmailDialog) this).A00);
            c019208x.A02(R.string.two_factor_auth_email_skip_confirm);
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3ZO
                {
                    SetEmailFragment.ConfirmSkipEmailDialog.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SetEmailFragment setEmailFragment = (SetEmailFragment) SetEmailFragment.ConfirmSkipEmailDialog.this.A07();
                    if (setEmailFragment != null) {
                        Log.i("setemailfragment/do-skip");
                        setEmailFragment.A03.setText("");
                        setEmailFragment.A06.A1Q();
                        return;
                    }
                    throw null;
                }
            });
            c019208x.A04(R.string.cancel, null);
            return c019208x.A00();
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_two_factor_auth_email, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0r() {
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A06 = null;
        this.A0U = true;
    }

    @Override // X.C0BA
    public void A0s() {
        String str;
        this.A0U = true;
        this.A03.removeTextChangedListener(this.A01);
        EditText editText = this.A03;
        if (this.A00 == 1) {
            str = this.A06.A04;
        } else {
            str = this.A06.A05;
        }
        editText.setText(str);
        this.A03.addTextChangedListener(this.A01);
        A0y();
        this.A03.requestFocus();
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        this.A00 = A02().getInt("type", 1);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        this.A06 = (TwoFactorAuthActivity) A09();
        Button button = (Button) view.findViewById(R.id.submit);
        this.A02 = button;
        button.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_3(this, 6));
        this.A03 = (EditText) view.findViewById(R.id.email);
        this.A04 = (TextView) view.findViewById(R.id.error);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view.findViewById(R.id.description);
        int i = this.A00;
        int i2 = 0;
        int i3 = 1;
        if (i == 1) {
            if (this.A06.A06[0] != 2) {
                textEmojiLabel.A07 = new C02770Cu();
                textEmojiLabel.setAccessibilityHelper(new C02780Cv(this.A05, textEmojiLabel));
                String A0F = A0F(R.string.two_factor_auth_email_info_with_skip);
                int A00 = C02160Ac.A00(((Hilt_SetEmailFragment) this).A00, R.color.link_color);
                TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(((Hilt_SetEmailFragment) this).A00, R.style.SettingsInlineLink);
                RunnableEBaseShape7S0100000_I0_7 runnableEBaseShape7S0100000_I0_7 = new RunnableEBaseShape7S0100000_I0_7(this, 18);
                HashMap hashMap = new HashMap();
                hashMap.put("skip", runnableEBaseShape7S0100000_I0_7);
                textEmojiLabel.setText(C28E.A07(A0F, hashMap, A00, textAppearanceSpan));
            } else {
                textEmojiLabel.setText(R.string.two_factor_auth_email_info);
            }
            this.A02.setText(R.string.next);
        } else if (i == 2) {
            textEmojiLabel.setText(R.string.two_factor_auth_email_confirmation);
            this.A02.setText(R.string.two_factor_auth_submit);
            i2 = 1;
        }
        TwoFactorAuthActivity twoFactorAuthActivity = this.A06;
        if (!twoFactorAuthActivity.A1T(this) || twoFactorAuthActivity.A06.length == 1) {
            i3 = i2;
        }
        twoFactorAuthActivity.A1R(view, i3);
    }

    public final void A0y() {
        Button button = this.A02;
        if (button != null) {
            String A0A = C000200d.A0A(this.A03);
            int indexOf = A0A.indexOf(64);
            boolean z = true;
            button.setEnabled((indexOf <= 0 || indexOf >= A0A.length() - 1 || indexOf != A0A.lastIndexOf(64)) ? false : false);
        }
    }
}
