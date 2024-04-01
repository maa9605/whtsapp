package com.whatsapp.status;

import X.AnonymousClass092;
import X.C002301c;
import X.C018508q;
import X.C018608r;
import X.C019208x;
import X.C0C9;
import X.C0LD;
import X.C40081rY;
import X.C40731sm;
import X.InterfaceC53402gr;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.Collections;

/* loaded from: classes2.dex */
public class StatusDeleteDialogFragment extends Hilt_StatusDeleteDialogFragment {
    public C018508q A00;
    public C018608r A01;
    public C002301c A02;
    public C0C9 A03;
    public C40081rY A04;
    public StatusPlaybackContactFragment A05;

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        try {
            this.A05 = (StatusPlaybackContactFragment) A08();
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        this.A05.AJM(this, true);
        AnonymousClass092 A0F = this.A03.A0F(C0LD.A03(A02(), ""));
        Dialog A07 = C40731sm.A07(A09(), this.A00, this.A04, this.A01, this.A02, A0F == null ? null : Collections.singleton(A0F), new InterfaceC53402gr() { // from class: X.3pK
            @Override // X.InterfaceC53402gr
            public final void AJE() {
            }
        });
        if (A07 == null) {
            C019208x c019208x = new C019208x(A09());
            c019208x.A02(R.string.status_deleted);
            return c019208x.A00();
        }
        return A07;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        this.A05.AJM(this, false);
    }
}
