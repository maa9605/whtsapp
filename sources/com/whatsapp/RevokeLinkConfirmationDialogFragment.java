package com.whatsapp;

import X.C011005l;
import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C05W;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.RevokeLinkConfirmationDialogFragment;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class RevokeLinkConfirmationDialogFragment extends Hilt_RevokeLinkConfirmationDialogFragment {
    public C05W A00;
    public C018708s A01;

    public static RevokeLinkConfirmationDialogFragment A00(C011005l c011005l, boolean z) {
        RevokeLinkConfirmationDialogFragment revokeLinkConfirmationDialogFragment = new RevokeLinkConfirmationDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", c011005l.getRawString());
        bundle.putBoolean("from_qr", z);
        revokeLinkConfirmationDialogFragment.A0P(bundle);
        return revokeLinkConfirmationDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Bundle A02 = A02();
        boolean z = A02.getBoolean("from_qr");
        C019208x c019208x = new C019208x(A00());
        int i = R.string.revoke_invite_link;
        if (z) {
            i = R.string.contact_qr_revoke_ok_button;
        }
        c019208x.A08(A0F(i), new DialogInterface.OnClickListener() { // from class: X.1IP
            {
                RevokeLinkConfirmationDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                RevokeLinkConfirmationDialogFragment revokeLinkConfirmationDialogFragment = RevokeLinkConfirmationDialogFragment.this;
                Log.i("invitelink/revoke/confirmation/ok");
                InterfaceC04550Kw interfaceC04550Kw = (InterfaceC04550Kw) revokeLinkConfirmationDialogFragment.A09();
                if (interfaceC04550Kw != null) {
                    interfaceC04550Kw.ARt();
                }
            }
        });
        String A0F = A0F(R.string.cancel);
        C019308y c019308y = c019208x.A01;
        c019308y.A0F = A0F;
        c019308y.A03 = null;
        if (z) {
            c019308y.A0I = A0F(R.string.contact_qr_revoke_title);
            c019308y.A0E = A0F(R.string.reset_group_invite_link_and_qr_code_confirmation);
        } else {
            Object[] objArr = new Object[1];
            C018708s c018708s = this.A01;
            C05W c05w = this.A00;
            String string = A02.getString("jid");
            if (string != null) {
                C011005l A04 = C011005l.A04(string);
                if (A04 != null) {
                    objArr[0] = c018708s.A08(c05w.A0A(A04), false);
                    c019308y.A0E = A0G(R.string.reset_link_confirmation, objArr);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return c019208x.A00();
    }
}
