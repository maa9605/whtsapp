package com.whatsapp.backup.encryptedbackup;

import X.AbstractView$OnClickListenerC49532Ky;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment;
import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;

/* loaded from: classes.dex */
public class ConfirmPasswordFragment extends Hilt_ConfirmPasswordFragment {
    public String A00;

    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment, X.C0BA
    public void A0w(View view, Bundle bundle) {
        super.A0w(view, bundle);
        this.A00 = (String) ((PasswordInputFragment) this).A06.A02.A01();
        int i = ((PasswordInputFragment) this).A00;
        if (i == 1) {
            ((PasswordInputFragment) this).A04.setText(A0E(R.string.encrypted_backup_confirm_password_title_enable));
        } else if (i == 4) {
            ((PasswordInputFragment) this).A04.setText(A0E(R.string.encrypted_backup_confirm_password_title_change_password));
        }
        ((PasswordInputFragment) this).A03.setText(A0E(R.string.encrypted_backup_confirm_password_instruction));
        ((PasswordInputFragment) this).A05.setHint(A0E(R.string.encrypted_backup_confirm_password_input_hint));
        ((PasswordInputFragment) this).A07.setText(A0E(R.string.encrypted_backup_confirm_password_action));
        ((PasswordInputFragment) this).A07.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kJ
            {
                ConfirmPasswordFragment.this = this;
            }

            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view2) {
                ConfirmPasswordFragment confirmPasswordFragment = ConfirmPasswordFragment.this;
                int i2 = ((PasswordInputFragment) confirmPasswordFragment).A00;
                if (i2 == 1) {
                    ((PasswordInputFragment) confirmPasswordFragment).A06.A06(500);
                } else if (i2 != 4) {
                } else {
                    ((PasswordInputFragment) confirmPasswordFragment).A06.A06(302);
                }
            }
        });
        A0y();
    }

    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    public void A0y() {
        String obj = ((PasswordInputFragment) this).A05.getText().toString();
        boolean equals = obj.equals(this.A00);
        if (!obj.equals("") && !equals) {
            ((PasswordInputFragment) this).A02.setText(A0E(R.string.encrypted_backup_confirm_password_mismatch_error));
            ((PasswordInputFragment) this).A02.setTextColor(A01().getColor(R.color.red_error));
        } else {
            ((PasswordInputFragment) this).A02.setText(A0E(R.string.encrypted_backup_confirm_password_input_requirement));
            ((PasswordInputFragment) this).A02.setTextColor(A01().getColor(R.color.black));
        }
        ((PasswordInputFragment) this).A07.setEnabled(equals);
    }
}
