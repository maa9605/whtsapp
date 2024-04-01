package com.whatsapp.backup.encryptedbackup;

import X.AbstractView$OnClickListenerC49532Ky;
import X.C06570Tx;
import X.C0AT;
import X.C36281kX;
import X.InterfaceC05620Pl;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.encryptedbackup.ConfirmChangePasswordFragment;
import com.whatsapp.components.Button;

/* loaded from: classes.dex */
public class ConfirmChangePasswordFragment extends Hilt_ConfirmChangePasswordFragment {
    public Button A00;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.enc_backup_confirm_change_password, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        super.A0v(bundle);
        final C36281kX c36281kX = (C36281kX) new C06570Tx(A0A()).A00(C36281kX.class);
        Button button = (Button) C0AT.A0D(view, R.id.confirm_change_password_change_button);
        this.A00 = button;
        button.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kD
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view2) {
                final C36281kX c36281kX2 = c36281kX;
                c36281kX2.A01.A0B(2);
                final C03310Fe c03310Fe = c36281kX2.A05;
                Object A01 = c36281kX2.A02.A01();
                if (A01 != null) {
                    final String str = (String) A01;
                    final C1N2 c1n2 = new C1N2() { // from class: X.1kU
                        @Override // X.C1N2
                        public void AJv(String str2, int i, int i2) {
                            C36281kX.A01(c36281kX2, i);
                        }

                        @Override // X.C1N2
                        public void APE() {
                            C36281kX.A01(c36281kX2, 0);
                        }
                    };
                    c03310Fe.A01(new InterfaceC37941nI() { // from class: X.1NX
                        @Override // X.C1Q6
                        public void AJu(String str2, int i) {
                            c1n2.AJv(str2, i, 5);
                        }

                        @Override // X.InterfaceC37941nI
                        public void APE() {
                            C03310Fe c03310Fe2 = c03310Fe;
                            c03310Fe2.A02.A01(new C1PL(c03310Fe2, str, c1n2));
                        }
                    });
                    return;
                }
                throw null;
            }
        });
        C0AT.A0D(view, R.id.confirm_change_password_cancel_button).setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kE
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view2) {
                c36281kX.A05(0);
            }
        });
        c36281kX.A01.A05(A0D(), new InterfaceC05620Pl() { // from class: X.1k9
            {
                ConfirmChangePasswordFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                ConfirmChangePasswordFragment.this.A0y(((Number) obj).intValue());
            }
        });
    }

    public final void A0y(int i) {
        if (i != 1) {
            if (i == 2) {
                this.A00.setText(R.string.encrypted_backup_change_password_button_in_progress);
                return;
            } else if (i != 4) {
                return;
            }
        }
        this.A00.setText(R.string.encrypted_backup_change_password_button);
    }
}
