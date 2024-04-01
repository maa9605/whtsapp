package com.whatsapp.gif_search;

import X.ActivityC02330At;
import X.C019208x;
import X.C49292Jm;
import X.C49302Jn;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.gif_search.RemoveDownloadableGifFromFavoritesDialogFragment;

/* loaded from: classes2.dex */
public class RemoveDownloadableGifFromFavoritesDialogFragment extends Hilt_RemoveDownloadableGifFromFavoritesDialogFragment {
    public C49292Jm A00;
    public C49302Jn A01;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ActivityC02330At A0A = A0A();
        this.A01 = (C49302Jn) A02().getParcelable("gif");
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2vu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RemoveDownloadableGifFromFavoritesDialogFragment removeDownloadableGifFromFavoritesDialogFragment = RemoveDownloadableGifFromFavoritesDialogFragment.this;
                if (i == -1) {
                    C49292Jm c49292Jm = removeDownloadableGifFromFavoritesDialogFragment.A00;
                    C49302Jn c49302Jn = removeDownloadableGifFromFavoritesDialogFragment.A01;
                    C018508q c018508q = c49292Jm.A00;
                    c018508q.A02.post(new RunnableEBaseShape2S0200000_I0_2(c49292Jm, c49302Jn, 8));
                    c49292Jm.A01.A00(c49302Jn.A01.A02);
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
