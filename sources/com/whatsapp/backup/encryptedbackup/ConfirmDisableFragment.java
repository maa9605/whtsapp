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
import com.whatsapp.backup.encryptedbackup.ConfirmDisableFragment;
import com.whatsapp.base.WaFragment;
import com.whatsapp.components.Button;
import com.whatsapp.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public class ConfirmDisableFragment extends WaFragment {
    public Button A00;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.enc_backup_confirm_disable, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        super.A0v(bundle);
        final C36281kX c36281kX = (C36281kX) new C06570Tx(A0A()).A00(C36281kX.class);
        Button button = (Button) C0AT.A0D(view, R.id.confirm_disable_disable_button);
        this.A00 = button;
        button.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kF
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view2) {
                final C36281kX c36281kX2 = C36281kX.this;
                c36281kX2.A01.A0B(2);
                C03310Fe c03310Fe = c36281kX2.A05;
                c03310Fe.A01(new InterfaceC37941nI() { // from class: X.1NL
                    @Override // X.C1Q6
                    public void AJu(String str, int i) {
                        C36281kX.A03(C36281kX.this, i);
                    }

                    @Override // X.InterfaceC37941nI
                    public void APE() {
                        C36281kX.A03(C36281kX.this, 0);
                    }
                });
                C000200d.A0j(c03310Fe.A01, "encrypted_backup_enabled", false);
                AnonymousClass024.A0f(new File(c03310Fe.A00.A00.A00.getFilesDir(), "encrypted_backup.key"));
                Log.i("EncBackupManager/encrypted backup disabled");
            }
        });
        C0AT.A0D(view, R.id.confirm_disable_cancel_button).setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kG
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view2) {
                C36281kX.this.A05(0);
            }
        });
        c36281kX.A01.A05(A0D(), new InterfaceC05620Pl() { // from class: X.1k7
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                ConfirmDisableFragment.this.A0x(((Number) obj).intValue());
            }
        });
    }

    public final void A0x(int i) {
        if (i != 1) {
            if (i == 2) {
                this.A00.setText(R.string.encrypted_backup_disable_button_in_progress);
                return;
            } else if (i != 4) {
                return;
            }
        }
        this.A00.setText(R.string.encrypted_backup_disable_button);
    }
}
