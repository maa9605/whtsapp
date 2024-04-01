package com.whatsapp.stickers;

import X.ActivityC02330At;
import X.C019208x;
import X.C0JM;
import X.C2AS;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;
import java.util.Collections;

/* loaded from: classes2.dex */
public class RemoveStickerFromFavoritesDialogFragment extends Hilt_RemoveStickerFromFavoritesDialogFragment {
    public C0JM A00;
    public C2AS A01;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ActivityC02330At A0A = A0A();
        this.A00 = (C0JM) A02().getParcelable("sticker");
        C019208x c019208x = new C019208x(A0A);
        c019208x.A02(R.string.sticker_remove_from_tray_title);
        c019208x.A06(R.string.sticker_remove_from_tray, new DialogInterface.OnClickListener() { // from class: X.3Xk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RemoveStickerFromFavoritesDialogFragment removeStickerFromFavoritesDialogFragment = RemoveStickerFromFavoritesDialogFragment.this;
                C2AS c2as = removeStickerFromFavoritesDialogFragment.A01;
                c2as.A0S.AS1(new RunnableEBaseShape4S0200000_I0_4(c2as, Collections.singleton(removeStickerFromFavoritesDialogFragment.A00), 27));
            }
        });
        c019208x.A04(R.string.cancel, null);
        return c019208x.A00();
    }
}
