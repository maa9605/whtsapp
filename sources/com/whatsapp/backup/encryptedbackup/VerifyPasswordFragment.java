package com.whatsapp.backup.encryptedbackup;

import X.AbstractView$OnClickListenerC49532Ky;
import X.InterfaceC05620Pl;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;
import com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment;

/* loaded from: classes.dex */
public class VerifyPasswordFragment extends Hilt_VerifyPasswordFragment {
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment, X.C0BA
    public void A0w(View view, Bundle bundle) {
        super.A0w(view, bundle);
        ((PasswordInputFragment) this).A04.setText(A0E(R.string.encrypted_backup_verify_password_title));
        int i = ((PasswordInputFragment) this).A00;
        if (i == 3) {
            ((PasswordInputFragment) this).A03.setText(A0E(R.string.encrypted_backup_verify_password_disable_instruction));
        } else if (i == 4) {
            ((PasswordInputFragment) this).A03.setText(A0E(R.string.encrypted_backup_verify_password_change_password_instruction));
        }
        ((PasswordInputFragment) this).A01.setVisibility(0);
        ((PasswordInputFragment) this).A05.setHint(A0E(R.string.encrypted_backup_verify_password_input_hint));
        ((PasswordInputFragment) this).A07.setText(A0E(R.string.encrypted_backup_verify_password_action));
        ((PasswordInputFragment) this).A07.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1ka
            {
                VerifyPasswordFragment.this = this;
            }

            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view2) {
                VerifyPasswordFragment verifyPasswordFragment = VerifyPasswordFragment.this;
                if (((PasswordInputFragment) verifyPasswordFragment).A05.getText() != null) {
                    C36281kX c36281kX = ((PasswordInputFragment) verifyPasswordFragment).A06;
                    c36281kX.A02.A0B(((PasswordInputFragment) verifyPasswordFragment).A05.getText().toString());
                    final C36281kX c36281kX2 = ((PasswordInputFragment) verifyPasswordFragment).A06;
                    c36281kX2.A01.A0B(2);
                    C03310Fe c03310Fe = c36281kX2.A05;
                    Object A01 = c36281kX2.A02.A01();
                    if (A01 != null) {
                        c03310Fe.A02.A02(new C1NW(c03310Fe, (String) A01, false, new C1N1() { // from class: X.1kV
                            @Override // X.C1N1
                            public void AJw(String str, int i2, int i3, int i4) {
                                C36281kX.A02(c36281kX2, i2);
                            }

                            @Override // X.C1N1
                            public void APE() {
                                C36281kX.A02(c36281kX2, 0);
                            }
                        }));
                        return;
                    }
                    throw null;
                }
            }
        });
        ((PasswordInputFragment) this).A01.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kb
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view2) {
            }
        });
        ((PasswordInputFragment) this).A06.A01.A05(A0D(), new InterfaceC05620Pl() { // from class: X.1k8
            {
                VerifyPasswordFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                VerifyPasswordFragment.this.A0z(((Number) obj).intValue());
            }
        });
    }

    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    public void A0y() {
        ((PasswordInputFragment) this).A02.setText(A01().getQuantityString(R.plurals.encrypted_backup_password_input_requirement, 1, 6, 1));
        ((PasswordInputFragment) this).A02.setTextColor(A01().getColor(R.color.black));
        ((PasswordInputFragment) this).A07.setEnabled(((PasswordInputFragment) this).A05.getText().toString().length() > 0);
    }

    public final void A0z(int i) {
        if (i != 1) {
            if (i == 2) {
                ((PasswordInputFragment) this).A02.setText(A0E(R.string.encrypted_backup_verifying_password));
                ((PasswordInputFragment) this).A02.setTextColor(A01().getColor(R.color.status_button));
                ((PasswordInputFragment) this).A07.setEnabled(false);
                return;
            } else if (i != 4) {
                if (i == 5) {
                    ((PasswordInputFragment) this).A02.setText(A0E(R.string.encrypted_backup_incorrect_password));
                    ((PasswordInputFragment) this).A02.setTextColor(A01().getColor(R.color.red_error));
                    return;
                }
                return;
            }
        }
        ((PasswordInputFragment) this).A02.setText(A01().getQuantityString(R.plurals.encrypted_backup_password_input_requirement, 1, 6, 1));
        ((PasswordInputFragment) this).A02.setTextColor(A01().getColor(R.color.black));
    }
}
