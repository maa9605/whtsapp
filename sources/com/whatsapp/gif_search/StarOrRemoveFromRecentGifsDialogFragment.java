package com.whatsapp.gif_search;

import X.ActivityC02330At;
import X.AnonymousClass012;
import X.C019208x;
import X.C2BR;
import X.C47212Ai;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.gif_search.StarOrRemoveFromRecentGifsDialogFragment;

/* loaded from: classes2.dex */
public class StarOrRemoveFromRecentGifsDialogFragment extends Hilt_StarOrRemoveFromRecentGifsDialogFragment {
    public AnonymousClass012 A00;
    public C2BR A01;
    public C47212Ai A02;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ActivityC02330At A0A = A0A();
        C2BR c2br = (C2BR) A02().getParcelable("gif");
        if (c2br != null) {
            this.A01 = c2br;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2vx
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StarOrRemoveFromRecentGifsDialogFragment starOrRemoveFromRecentGifsDialogFragment = StarOrRemoveFromRecentGifsDialogFragment.this;
                    if (i == -3) {
                        C47212Ai c47212Ai = starOrRemoveFromRecentGifsDialogFragment.A02;
                        c47212Ai.A0A.execute(new RunnableEBaseShape2S0200000_I0_2(c47212Ai, starOrRemoveFromRecentGifsDialogFragment.A01, 14));
                    } else if (i == -1) {
                        C47212Ai c47212Ai2 = starOrRemoveFromRecentGifsDialogFragment.A02;
                        c47212Ai2.A0A.execute(new RunnableEBaseShape0S0200100_I0(c47212Ai2, starOrRemoveFromRecentGifsDialogFragment.A01, starOrRemoveFromRecentGifsDialogFragment.A00.A05(), 2));
                    }
                }
            };
            C019208x c019208x = new C019208x(A0A);
            c019208x.A02(R.string.gif_save_to_picker_title);
            c019208x.A06(R.string.gif_save_to_favorites, onClickListener);
            c019208x.A05(R.string.gif_remove_from_recents_option, onClickListener);
            c019208x.A04(R.string.cancel, onClickListener);
            return c019208x.A00();
        }
        throw null;
    }
}
