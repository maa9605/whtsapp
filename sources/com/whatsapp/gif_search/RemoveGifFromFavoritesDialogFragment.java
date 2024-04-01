package com.whatsapp.gif_search;

import X.ActivityC02330At;
import X.C019208x;
import X.C2BR;
import X.C47212Ai;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.gif_search.RemoveGifFromFavoritesDialogFragment;

/* loaded from: classes2.dex */
public class RemoveGifFromFavoritesDialogFragment extends Hilt_RemoveGifFromFavoritesDialogFragment {
    public C2BR A00;
    public C47212Ai A01;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ActivityC02330At A0A = A0A();
        this.A00 = (C2BR) A02().getParcelable("gif");
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2vv
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RemoveGifFromFavoritesDialogFragment removeGifFromFavoritesDialogFragment = RemoveGifFromFavoritesDialogFragment.this;
                if (i == -1) {
                    C47212Ai c47212Ai = removeGifFromFavoritesDialogFragment.A01;
                    c47212Ai.A0A.execute(new RunnableEBaseShape2S0200000_I0_2(c47212Ai, removeGifFromFavoritesDialogFragment.A00, 13));
                }
            }
        };
        C019208x c019208x = new C019208x(A0A);
        c019208x.A02(R.string.gif_remove_from_title_tray);
        c019208x.A06(R.string.gif_remove_from_tray, onClickListener);
        c019208x.A04(R.string.cancel, null);
        return c019208x.A00();
    }
}
