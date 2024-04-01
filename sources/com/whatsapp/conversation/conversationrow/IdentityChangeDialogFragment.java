package com.whatsapp.conversation.conversationrow;

import X.AbstractC005302j;
import X.C000700j;
import X.C06C;
import X.C0BA;
import X.C0EC;
import X.C0EE;
import X.InterfaceC002901k;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.Hilt_IdentityChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.IdentityChangeDialogFragment;
import com.whatsapp.identity.IdentityVerificationActivity;

/* loaded from: classes2.dex */
public class IdentityChangeDialogFragment extends Hilt_IdentityChangeDialogFragment {
    public C0EC A00;
    public C0EE A01;
    public InterfaceC002901k A02;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        A02();
        final String string = ((C0BA) this).A06.getString("participant_jid");
        AbstractC005302j A02 = AbstractC005302j.A02(string);
        StringBuilder sb = new StringBuilder("IdentityChangeDialogFragment/onCreateDialog/invalid remote resource jid=");
        sb.append(string);
        C000700j.A04(A02, sb.toString());
        final C06C A0A = ((SecurityNotificationDialogFragment) this).A02.A0A(A02);
        AlertDialog.Builder builder = new AlertDialog.Builder(((Hilt_IdentityChangeDialogFragment) this).A00);
        boolean A04 = this.A01.A04();
        int i = R.string.identity_change_info;
        if (A04) {
            i = R.string.identity_change_info_md;
        }
        AlertDialog.Builder neutralButton = builder.setMessage(A18(i, A0A)).setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null).setNeutralButton(R.string.learn_more, new DialogInterface.OnClickListener() { // from class: X.2rS
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                IdentityChangeDialogFragment identityChangeDialogFragment = IdentityChangeDialogFragment.this;
                identityChangeDialogFragment.A02.AS1(new RunnableEBaseShape1S0200000_I0_1(identityChangeDialogFragment, A0A, 14));
            }
        });
        boolean A042 = this.A01.A04();
        int i2 = R.string.identity_change_verify;
        if (A042) {
            i2 = R.string.verify_code;
        }
        return neutralButton.setPositiveButton(i2, new DialogInterface.OnClickListener() { // from class: X.2rT
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                IdentityChangeDialogFragment identityChangeDialogFragment = IdentityChangeDialogFragment.this;
                String str = string;
                Intent intent = new Intent(((Hilt_IdentityChangeDialogFragment) identityChangeDialogFragment).A00, IdentityVerificationActivity.class);
                intent.putExtra("jid", str);
                identityChangeDialogFragment.A0i(intent);
            }
        }).create();
    }
}
