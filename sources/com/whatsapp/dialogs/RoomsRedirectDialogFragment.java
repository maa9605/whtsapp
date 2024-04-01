package com.whatsapp.dialogs;

import X.AbstractC005302j;
import X.C000200d;
import X.C000500h;
import X.C019208x;
import X.C06950Vu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.dialogs.RoomsRedirectDialogFragment;

/* loaded from: classes2.dex */
public class RoomsRedirectDialogFragment extends Hilt_RoomsRedirectDialogFragment {
    public C06950Vu A00;

    public static RoomsRedirectDialogFragment A00(AbstractC005302j abstractC005302j, int i) {
        Bundle bundle = new Bundle();
        RoomsRedirectDialogFragment roomsRedirectDialogFragment = new RoomsRedirectDialogFragment();
        if (abstractC005302j != null) {
            bundle.putString("chat_jid", abstractC005302j.getRawString());
        }
        bundle.putInt("entry_point", i);
        roomsRedirectDialogFragment.A0P(bundle);
        return roomsRedirectDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Bundle A02 = A02();
        final AbstractC005302j A022 = AbstractC005302j.A02(A02.getString("chat_jid", null));
        final int i = A02.getInt("entry_point");
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2uc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                RoomsRedirectDialogFragment roomsRedirectDialogFragment = RoomsRedirectDialogFragment.this;
                roomsRedirectDialogFragment.A00.A04(A022, i);
                roomsRedirectDialogFragment.A16(false, false);
            }
        };
        C019208x c019208x = new C019208x(A00());
        c019208x.A02(R.string.rooms_create_link_in_messenger_continue);
        c019208x.A06(R.string.rooms_continue_in_messenger, onClickListener);
        c019208x.A04(R.string.cancel, null);
        return c019208x.A00();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        C06950Vu c06950Vu = this.A00;
        int i = A02().getInt("entry_point");
        C000500h c000500h = c06950Vu.A03;
        SharedPreferences sharedPreferences = c000500h.A00;
        C000200d.A0g(c000500h, "rooms_redirect_shown", (1 << i) | sharedPreferences.getInt("rooms_redirect_shown", 0));
        C000200d.A0g(c000500h, "rooms_dialogs_shown", sharedPreferences.getInt("rooms_dialogs_shown", 0) + 1);
    }
}
