package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.DefaultWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;

/* renamed from: X.2PR */
/* loaded from: classes2.dex */
public abstract class C2PR extends C2PS {
    public AbstractC005302j A00 = null;
    public boolean A01 = false;

    @Override // X.C2PS, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        View findViewById;
        super.onCreate(bundle);
        if (!(this instanceof DownloadableWallpaperPickerActivity)) {
            C2PT c2pt = (C2PT) this;
            if (c2pt instanceof GalleryWallpaperPreview) {
                boolean A08 = C03410Fp.A08(((ActivityC02290Ap) c2pt).A0B);
                i = R.layout.gallery_wallpaper_preview;
                if (A08) {
                    i = R.layout.gallery_wallpaper_preview_v2;
                }
            } else if (!(c2pt instanceof DefaultWallpaperPreview)) {
                boolean A082 = C03410Fp.A08(((ActivityC02290Ap) c2pt).A0B);
                i = R.layout.wallpaper_preview;
                if (A082) {
                    i = R.layout.wallpaper_preview_v2;
                }
            } else {
                i = R.layout.wallpaper_preview_default;
            }
        } else {
            i = R.layout.activity_downloadable_wallpaper_picker;
        }
        setContentView(i);
        this.A01 = getIntent().getBooleanExtra("is_using_global_wallpaper", false);
        this.A00 = C03410Fp.A05(getIntent());
        A0k((Toolbar) C0VJ.A0A(this, R.id.toolbar));
        A0c().A0L(true);
        if (Build.VERSION.SDK_INT < 21 || (findViewById = findViewById(R.id.separator)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }
}
