package com.whatsapp.conversation;

import X.C002301c;
import X.C011305p;
import X.C019208x;
import X.C04630Le;
import X.C05W;
import X.C06C;
import X.DialogInterface$OnClickListenerC58162qh;
import X.DialogInterfaceC019408z;
import X.InterfaceC04820Ly;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.conversation.ChangeNumberNotificationDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public final class ChangeNumberNotificationDialogFragment extends Hilt_ChangeNumberNotificationDialogFragment {
    public C05W A00;
    public InterfaceC04820Ly A01;
    public C002301c A02;

    public static ChangeNumberNotificationDialogFragment A00(UserJid userJid, UserJid userJid2, String str) {
        ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = new ChangeNumberNotificationDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("convo_jid", userJid.getRawString());
        bundle.putString("new_jid", userJid2.getRawString());
        bundle.putString("old_display_name", str);
        changeNumberNotificationDialogFragment.A0P(bundle);
        return changeNumberNotificationDialogFragment;
    }

    @Override // com.whatsapp.conversation.Hilt_ChangeNumberNotificationDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        try {
            this.A01 = (InterfaceC04820Ly) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement ChangeNumberNotificationDialogListener");
            throw new ClassCastException(sb.toString());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Bundle A02 = A02();
        try {
            UserJid userJid = UserJid.get(A02.getString("convo_jid"));
            UserJid userJid2 = UserJid.get(A02.getString("new_jid"));
            String string = A02.getString("old_display_name");
            if (string != null) {
                final C06C A0A = this.A00.A0A(userJid2);
                final boolean z = A0A.A08 != null;
                C019208x c019208x = new C019208x(((Hilt_ChangeNumberNotificationDialogFragment) this).A00);
                DialogInterface$OnClickListenerC58162qh dialogInterface$OnClickListenerC58162qh = new DialogInterface.OnClickListener() { // from class: X.2qh
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                };
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2qf
                    {
                        ChangeNumberNotificationDialogFragment.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = ChangeNumberNotificationDialogFragment.this;
                        ((WaDialogFragment) changeNumberNotificationDialogFragment).A00.A01(changeNumberNotificationDialogFragment, Conversation.A00(changeNumberNotificationDialogFragment.A09(), A0A));
                    }
                };
                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: X.2qg
                    {
                        ChangeNumberNotificationDialogFragment.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = ChangeNumberNotificationDialogFragment.this;
                        boolean z2 = z;
                        C06C c06c = A0A;
                        if (z2) {
                            dialogInterface.dismiss();
                            return;
                        }
                        InterfaceC04820Ly interfaceC04820Ly = changeNumberNotificationDialogFragment.A01;
                        if (interfaceC04820Ly == null) {
                            return;
                        }
                        Jid A03 = c06c.A03(UserJid.class);
                        if (A03 != null) {
                            interfaceC04820Ly.A5J(c06c, (AbstractC005302j) A03);
                            return;
                        }
                        throw null;
                    }
                };
                if (userJid.equals(userJid2)) {
                    if (z) {
                        c019208x.A01.A0E = A0G(R.string.change_number_dialog_text_already_added, this.A02.A0F(C04630Le.A00(A0A)));
                        c019208x.A06(R.string.ok_got_it, dialogInterface$OnClickListenerC58162qh);
                    } else {
                        c019208x.A01.A0E = A0G(R.string.change_number_notification_text_new, string, C04630Le.A00(A0A));
                        c019208x.A04(R.string.cancel, dialogInterface$OnClickListenerC58162qh);
                        c019208x.A06(R.string.add_contact, onClickListener2);
                    }
                } else if (z) {
                    c019208x.A01.A0E = A0G(R.string.change_number_dialog_text_already_added, this.A02.A0F(C04630Le.A00(A0A)));
                    c019208x.A06(R.string.got_it, dialogInterface$OnClickListenerC58162qh);
                    c019208x.A05(R.string.change_number_message_new_number, onClickListener);
                } else {
                    c019208x.A01.A0E = A0G(R.string.change_number_notification_text_old, string);
                    c019208x.A05(R.string.send_message_to_contact_button, onClickListener);
                    c019208x.A06(R.string.add_contact, onClickListener2);
                    c019208x.A04(R.string.cancel, dialogInterface$OnClickListenerC58162qh);
                }
                DialogInterfaceC019408z A00 = c019208x.A00();
                A00.setCanceledOnTouchOutside(true);
                return A00;
            }
            throw null;
        } catch (C011305p e) {
            throw new RuntimeException(e);
        }
    }
}
