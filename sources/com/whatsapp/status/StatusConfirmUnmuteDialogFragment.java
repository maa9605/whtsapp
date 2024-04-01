package com.whatsapp.status;

import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C05W;
import X.C06C;
import X.C25K;
import X.C2AL;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.StatusConfirmUnmuteDialogFragment;

/* loaded from: classes2.dex */
public class StatusConfirmUnmuteDialogFragment extends Hilt_StatusConfirmUnmuteDialogFragment {
    public C05W A00;
    public C018708s A01;
    public C25K A02;
    public C2AL A03;

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        try {
            this.A02 = (C25K) A08();
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
            String A0G = A0G(R.string.unmute_status_confirmation_title, this.A01.A04(A0A));
            C019308y c019308y = c019208x.A01;
            c019308y.A0I = A0G;
            c019308y.A0E = A0G(R.string.unmute_status_confirmation_message, this.A01.A08(A0A, false));
            c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Wu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StatusConfirmUnmuteDialogFragment.this.A10();
                }
            });
            c019208x.A06(R.string.unmute_status, new DialogInterface.OnClickListener() { // from class: X.3Wv
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment = StatusConfirmUnmuteDialogFragment.this;
                    UserJid userJid = nullable;
                    C000200d.A0x("statusesfragment/unmute status for ", userJid);
                    statusConfirmUnmuteDialogFragment.A03.A02(userJid, true);
                    statusConfirmUnmuteDialogFragment.A10();
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
