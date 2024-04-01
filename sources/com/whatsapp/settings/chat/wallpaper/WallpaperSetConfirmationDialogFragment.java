package com.whatsapp.settings.chat.wallpaper;

import X.C019208x;
import X.C019308y;
import X.C0AT;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class WallpaperSetConfirmationDialogFragment extends Hilt_WallpaperSetConfirmationDialogFragment {
    @Override // com.whatsapp.SingleSelectionDialogFragment
    public C019208x A18() {
        C019208x A18 = super.A18();
        TextView textView = (TextView) LayoutInflater.from(A09()).inflate(R.layout.wallpaper_confirmation_explanation, (ViewGroup) null);
        textView.setText(R.string.wallpaper_dialog_set_wallpaper_for_all_chats_explanation);
        C019308y c019308y = A18.A01;
        c019308y.A0C = textView;
        c019308y.A01 = 0;
        View inflate = LayoutInflater.from(A09()).inflate(R.layout.wallpaper_confirmation_title, (ViewGroup) null);
        ((TextView) C0AT.A0D(inflate, R.id.wallpaper_confirmation_title_view)).setText(R.string.wallpaper_dialog_set_wallpaper);
        c019308y.A0B = inflate;
        return A18;
    }
}
