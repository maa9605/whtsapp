package com.whatsapp.contact.picker;

import X.ActivityC02330At;
import X.AnonymousClass029;
import X.C000700j;
import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C01B;
import X.C02160Ac;
import X.C05W;
import X.DialogInterfaceC019408z;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.InviteToGroupCallConfirmationFragment;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public class InviteToGroupCallConfirmationFragment extends Hilt_InviteToGroupCallConfirmationFragment {
    public C01B A00;
    public C05W A01;
    public C018708s A02;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        int i;
        final UserJid nullable = UserJid.getNullable(A02().getString("peer_id"));
        C000700j.A04(nullable, "null peer jid");
        ActivityC02330At A09 = A09();
        C019208x c019208x = new C019208x(A09);
        String A04 = this.A02.A04(this.A01.A0A(nullable));
        if (AnonymousClass029.A1N(this.A00)) {
            String A0G = A0G(R.string.invite_to_group_call_confirmation_title, A04);
            C019308y c019308y = c019208x.A01;
            c019308y.A0I = A0G;
            c019308y.A0E = Html.fromHtml(A0G(R.string.invite_to_group_call_confirmation_description, String.format("%06X", Integer.valueOf(C02160Ac.A00(A09, R.color.accent_light) & 16777215))));
            i = R.string.invite_to_group_call_confirmation_positive_button_label;
        } else {
            c019208x.A01.A0E = A0G(R.string.invite_to_group_call_confirmation_text, A04);
            i = R.string.invite_to_group_call_confirmation_positive_button_label;
        }
        c019208x.A06(i, new DialogInterface.OnClickListener() { // from class: X.2q8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                InviteToGroupCallConfirmationFragment inviteToGroupCallConfirmationFragment = InviteToGroupCallConfirmationFragment.this;
                UserJid userJid = nullable;
                C0BA c0ba = inviteToGroupCallConfirmationFragment.A0D;
                if (c0ba != null) {
                    ContactPickerFragment contactPickerFragment = (ContactPickerFragment) c0ba;
                    Intent intent = new Intent();
                    intent.putExtra("contact", userJid.getRawString());
                    contactPickerFragment.A0a.A01(intent);
                    contactPickerFragment.A0a.A00();
                }
            }
        });
        c019208x.A04(R.string.cancel, null);
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.setCanceledOnTouchOutside(true);
        return A00;
    }
}
