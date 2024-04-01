package com.whatsapp.backup.encryptedbackup;

import X.C06570Tx;
import X.C0AT;
import X.C36281kX;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;
import com.whatsapp.components.Button;

/* loaded from: classes.dex */
public abstract class PasswordInputFragment extends Hilt_PasswordInputFragment {
    public int A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public CodeInputField A05;
    public C36281kX A06;
    public Button A07;

    public abstract void A0y();

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.enc_backup_password_input, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        super.A0v(bundle);
        C36281kX c36281kX = (C36281kX) new C06570Tx(A0A()).A00(C36281kX.class);
        this.A06 = c36281kX;
        Object A01 = c36281kX.A04.A01();
        if (A01 != null) {
            this.A00 = ((Number) A01).intValue();
            this.A04 = (TextView) C0AT.A0D(view, R.id.enc_backup_password_input_title);
            this.A03 = (TextView) C0AT.A0D(view, R.id.enc_backup_password_input_instruction);
            this.A01 = (TextView) C0AT.A0D(view, R.id.enc_backup_password_input_forgot_password);
            this.A05 = (CodeInputField) C0AT.A0D(view, R.id.enc_backup_password_input);
            this.A02 = (TextView) C0AT.A0D(view, R.id.enc_backup_password_input_requirement);
            this.A07 = (Button) C0AT.A0D(view, R.id.enc_backup_password_input_button);
            this.A01.setVisibility(8);
            this.A02.setText(A01().getQuantityString(R.plurals.encrypted_backup_password_input_requirement, 1, 6, 1));
            this.A05.requestFocus();
            A0y();
            this.A05.addTextChangedListener(new TextWatcher() { // from class: X.1N4
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                {
                    PasswordInputFragment.this = this;
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    PasswordInputFragment.this.A0y();
                }
            });
            return;
        }
        throw null;
    }
}
