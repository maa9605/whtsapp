package com.whatsapp.settings.chat.wallpaper;

import X.C019208x;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class WallpaperDownloadFailedDialogFragment extends Hilt_WallpaperDownloadFailedDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        int i = A02().getInt("ERROR_STATE_KEY");
        C019208x c019208x = new C019208x(A09());
        c019208x.A03(R.string.wallpaper_thumbnails_download_failed_dialog_title);
        if (i == 5) {
            c019208x.A02(R.string.wallpaper_thumbnails_download_failed_dialog_content_storage_error);
        } else {
            c019208x.A02(R.string.wallpaper_thumbnails_download_failed_dialog_content_network_error);
        }
        c019208x.A06(R.string.ok, null);
        c019208x.A01.A0J = false;
        return c019208x.A00();
    }
}
