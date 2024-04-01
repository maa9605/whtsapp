package com.whatsapp.status;

import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C05W;
import X.C06C;
import X.C25I;
import X.C2AL;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.StatusConfirmMuteDialogFragment;

/* loaded from: classes2.dex */
public class StatusConfirmMuteDialogFragment extends Hilt_StatusConfirmMuteDialogFragment {
    public C05W A00;
    public C018708s A01;
    public C25I A02;
    public C2AL A03;

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        try {
            this.A02 = (C25I) A08();
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        this.A02.AJM(this, true);
        final UserJid nullable = UserJid.getNullable(A02().getString("jid"));
        if (nullable != null) {
            C06C A0A = this.A00.A0A(nullable);
            C019208x c019208x = new C019208x(A00());
            String A0G = A0G(R.string.mute_status_confirmation_title, this.A01.A04(A0A));
            C019308y c019308y = c019208x.A01;
            c019308y.A0I = A0G;
            c019308y.A0E = A0G(R.string.mute_status_confirmation_message, this.A01.A08(A0A, false));
            c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Wt
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StatusConfirmMuteDialogFragment.this.A10();
                }
            });
            c019208x.A06(R.string.mute_status, new DialogInterface.OnClickListener() { // from class: X.3Ws
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment = StatusConfirmMuteDialogFragment.this;
                    UserJid userJid = nullable;
                    C000200d.A0x("statusesfragment/mute status for ", userJid);
                    statusConfirmMuteDialogFragment.A03.A01(userJid, true);
                    statusConfirmMuteDialogFragment.A10();
                }
            });
            return c019208x.A00();
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        this.A02.AJM(this, false);
    }
}
