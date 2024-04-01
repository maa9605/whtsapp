package com.whatsapp.invites;

import X.ActivityC02330At;
import X.C002301c;
import X.C003101m;
import X.C018708s;
import X.C019208x;
import X.DialogInterfaceC019408z;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.List;

/* loaded from: classes2.dex */
public class PromptSendGroupInviteDialogFragment extends Hilt_PromptSendGroupInviteDialogFragment {
    public C018708s A00;
    public C002301c A01;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Bundle A02 = A02();
        ActivityC02330At A0A = A0A();
        List A0F = C003101m.A0F(UserJid.class, A02.getStringArrayList("jids"));
        final Intent intent = (Intent) A02.getParcelable("invite_intent");
        final int i = A02.getInt("invite_intent_code");
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2xL
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC02330At A09;
                PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment = PromptSendGroupInviteDialogFragment.this;
                Intent intent2 = intent;
                int i3 = i;
                if (i2 == -1 && (A09 = promptSendGroupInviteDialogFragment.A09()) != null && !A09.isFinishing()) {
                    promptSendGroupInviteDialogFragment.A09().startActivityForResult(intent2, i3);
                }
            }
        };
        C019208x c019208x = new C019208x(A0A);
        C002301c c002301c = this.A01;
        c019208x.A01.A0E = c002301c.A0A(R.plurals.group_add_privacy_failure_prompt_invite, ((AbstractCollection) A0F).size(), c002301c.A0E(this.A00.A0B(A0F)));
        c019208x.A06(R.string.button_invite_to_group, onClickListener);
        c019208x.A04(R.string.cancel, null);
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.setCanceledOnTouchOutside(false);
        return A00;
    }
}
