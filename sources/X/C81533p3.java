package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.whatsapp.settings.chat.wallpaper.WallpaperDownloadFailedDialogFragment;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;

/* renamed from: X.3p3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C81533p3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2Z4 A01;
    public final /* synthetic */ C86353xI A02;

    public /* synthetic */ C81533p3(C86353xI c86353xI, C2Z4 c2z4, int i) {
        this.A02 = c86353xI;
        this.A01 = c2z4;
        this.A00 = i;
    }

    public final void A00(C71463Wf c71463Wf) {
        C86353xI c86353xI = this.A02;
        C2Z4 c2z4 = this.A01;
        int i = this.A00;
        Bitmap bitmap = c71463Wf.A01;
        if (bitmap != null) {
            c2z4.setWallpaper(bitmap);
        }
        int i2 = c71463Wf.A00;
        if (i2 == 2) {
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = c86353xI.A02.A01;
            downloadableWallpaperPreviewActivity.A09.add(Integer.valueOf(i));
            if (downloadableWallpaperPreviewActivity.A01.getCurrentItem() == i) {
                ((C2PT) downloadableWallpaperPreviewActivity).A00.setEnabled(true);
            }
            c2z4.A02.setVisibility(8);
        } else if (i2 == 1) {
            c2z4.A02.setVisibility(0);
            c2z4.A03.setVisibility(0);
            c2z4.A01.setVisibility(8);
        } else {
            C81643pE c81643pE = c86353xI.A02;
            if (!c81643pE.A00) {
                c81643pE.A00 = true;
                DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity2 = c81643pE.A01;
                if (downloadableWallpaperPreviewActivity2 != null) {
                    WallpaperDownloadFailedDialogFragment wallpaperDownloadFailedDialogFragment = new WallpaperDownloadFailedDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("ERROR_STATE_KEY", i2);
                    wallpaperDownloadFailedDialogFragment.A0P(bundle);
                    downloadableWallpaperPreviewActivity2.AUh(wallpaperDownloadFailedDialogFragment);
                } else {
                    throw null;
                }
            }
            c2z4.A02.setVisibility(0);
            c2z4.A03.setVisibility(8);
            c2z4.A01.setVisibility(0);
        }
    }
}
