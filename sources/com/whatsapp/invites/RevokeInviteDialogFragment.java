package com.whatsapp.invites;

import X.ActivityC02330At;
import X.C018708s;
import X.C019208x;
import X.C05W;
import X.C06C;
import X.C2H7;
import X.DialogInterfaceC019408z;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.invites.RevokeInviteDialogFragment;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public class RevokeInviteDialogFragment extends Hilt_RevokeInviteDialogFragment {
    public C05W A00;
    public C018708s A01;
    public C2H7 A02;

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0e() {
        super.A0e();
        this.A02 = null;
    }

    @Override // com.whatsapp.invites.Hilt_RevokeInviteDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (context instanceof C2H7) {
            this.A02 = (C2H7) context;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Bundle A02 = A02();
        ActivityC02330At A0A = A0A();
        final UserJid nullable = UserJid.getNullable(A02.getString("jid"));
        if (nullable != null) {
            C06C A0A2 = this.A00.A0A(nullable);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2xM
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C2H7 c2h7;
                    RevokeInviteDialogFragment revokeInviteDialogFragment = RevokeInviteDialogFragment.this;
                    UserJid userJid = nullable;
                    if (i == -1 && (c2h7 = revokeInviteDialogFragment.A02) != null) {
                        c2h7.AOI(userJid);
                    }
                }
            };
            C019208x c019208x = new C019208x(A0A);
            c019208x.A01.A0E = A0G(R.string.revoke_invite_confirm, this.A01.A04(A0A2));
            c019208x.A06(R.string.revoke, onClickListener);
            c019208x.A04(R.string.cancel, null);
            DialogInterfaceC019408z A00 = c019208x.A00();
            A00.setCanceledOnTouchOutside(true);
            return A00;
        }
        throw null;
    }
}
