package com.whatsapp.gif_search;

import X.ActivityC02330At;
import X.AnonymousClass012;
import X.C019208x;
import X.C49292Jm;
import X.C49302Jn;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.gif_search.StarDownloadableGifDialogFragment;

/* loaded from: classes2.dex */
public class StarDownloadableGifDialogFragment extends Hilt_StarDownloadableGifDialogFragment {
    public AnonymousClass012 A00;
    public C49292Jm A01;
    public C49302Jn A02;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ActivityC02330At A0A = A0A();
        C49302Jn c49302Jn = (C49302Jn) A02().getParcelable("gif");
        if (c49302Jn != null) {
            this.A02 = c49302Jn;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2vw
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StarDownloadableGifDialogFragment starDownloadableGifDialogFragment = StarDownloadableGifDialogFragment.this;
                    if (i == -1) {
                        C49292Jm c49292Jm = starDownloadableGifDialogFragment.A01;
                        C49302Jn c49302Jn2 = starDownloadableGifDialogFragment.A02;
                        long A05 = starDownloadableGifDialogFragment.A00.A05();
                        C018508q c018508q = c49292Jm.A00;
                        c018508q.A02.post(new RunnableEBaseShape3S0100000_I0_3(c49292Jm, 0));
                        C0CD c0cd = new C0CD(null, c49292Jm.A01.A00, true);
                        try {
                            C03790Hb A00 = c0cd.A00();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("gif_id", c49302Jn2.A04);
                            C61422w7 c61422w7 = c49302Jn2.A03;
                            contentValues.put("static_url", c61422w7.A02);
                            contentValues.put("static_height", Integer.valueOf(c61422w7.A00));
                            contentValues.put("static_width", Integer.valueOf(c61422w7.A01));
                            C61422w7 c61422w72 = c49302Jn2.A02;
                            contentValues.put("preview_url", c61422w72.A02);
                            contentValues.put("preview_height", Integer.valueOf(c61422w72.A00));
                            contentValues.put("preview_width", Integer.valueOf(c61422w72.A01));
                            C61422w7 c61422w73 = c49302Jn2.A01;
                            contentValues.put("content_url", c61422w73.A02);
                            contentValues.put("content_height", Integer.valueOf(c61422w73.A00));
                            contentValues.put("content_width", Integer.valueOf(c61422w73.A01));
                            contentValues.put("gif_attribution", Integer.valueOf(c49302Jn2.A00));
                            contentValues.put("timestamp", Long.valueOf(A05));
                            c0cd.A02.A06("downloadable_gifs", contentValues, 5);
                            A00.A00();
                            A00.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } finally {
                                try {
                                    c0cd.close();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                }
            };
            C019208x c019208x = new C019208x(A0A);
            c019208x.A02(R.string.gif_save_to_picker_title);
            c019208x.A06(R.string.gif_save_to_favorites, onClickListener);
            c019208x.A04(R.string.cancel, null);
            return c019208x.A00();
        }
        throw null;
    }
}
