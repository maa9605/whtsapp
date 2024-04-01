package com.whatsapp.stickers;

import X.ActivityC02330At;
import X.C019208x;
import X.C0JM;
import X.C2AM;
import X.C2AS;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import java.util.Collections;

/* loaded from: classes2.dex */
public class StarOrRemoveFromRecentsStickerDialogFragment extends Hilt_StarOrRemoveFromRecentsStickerDialogFragment {
    public C2AM A00;
    public C0JM A01;
    public C2AS A02;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ActivityC02330At A0A = A0A();
        C0JM c0jm = (C0JM) A02().getParcelable("sticker");
        if (c0jm != null) {
            this.A01 = c0jm;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3Xl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = StarOrRemoveFromRecentsStickerDialogFragment.this;
                    if (i == -3) {
                        C2AM c2am = starOrRemoveFromRecentsStickerDialogFragment.A00;
                        c2am.A09.execute(new RunnableEBaseShape4S0200000_I0_4(c2am, starOrRemoveFromRecentsStickerDialogFragment.A01, 19));
                    } else if (i == -1) {
                        C2AS c2as = starOrRemoveFromRecentsStickerDialogFragment.A02;
                        c2as.A0S.AS1(new RunnableEBaseShape4S0200000_I0_4(c2as, Collections.singleton(starOrRemoveFromRecentsStickerDialogFragment.A01), 26));
                    }
                }
            };
            C019208x c019208x = new C019208x(A0A);
            c019208x.A02(R.string.sticker_save_to_picker_title);
            c019208x.A06(R.string.sticker_save_to_picker, onClickListener);
            c019208x.A05(R.string.sticker_remove_from_recents_option, onClickListener);
            c019208x.A04(R.string.cancel, onClickListener);
            return c019208x.A00();
        }
        throw null;
    }
}
