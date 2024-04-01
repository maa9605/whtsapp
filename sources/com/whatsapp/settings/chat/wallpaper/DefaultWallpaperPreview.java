package com.whatsapp.settings.chat.wallpaper;

import X.ActivityC02290Ap;
import X.C03410Fp;
import X.C0VJ;
import X.C2PY;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class DefaultWallpaperPreview extends C2PY {
    public ImageView A00;
    public WallpaperMockChatView A01;

    @Override // X.C2PY, X.C2PT, X.C2PU, X.C2PR, X.C2PS, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Drawable A01 = C03410Fp.A01(this, getResources(), ((ActivityC02290Ap) this).A0I);
        ImageView imageView = (ImageView) C0VJ.A0A(this, R.id.wallpaper_preview_default_view);
        this.A00 = imageView;
        imageView.setImageDrawable(A01);
        WallpaperMockChatView wallpaperMockChatView = (WallpaperMockChatView) C0VJ.A0A(this, R.id.wallpaper_preview_default_chat_view);
        this.A01 = wallpaperMockChatView;
        wallpaperMockChatView.setMessages(getString(R.string.wallpaper_bubble_this_is_the_default_whatsapp_wallpaper), A1P());
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            setResult(0);
            finish();
            return true;
        }
        return false;
    }
}
