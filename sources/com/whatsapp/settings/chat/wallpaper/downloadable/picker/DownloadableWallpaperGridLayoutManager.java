package com.whatsapp.settings.chat.wallpaper.downloadable.picker;

import X.AbstractC14890nk;
import X.C81613pB;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperGridLayoutManager;

/* loaded from: classes2.dex */
public class DownloadableWallpaperGridLayoutManager extends GridLayoutManager {
    public final C81613pB A00;

    public DownloadableWallpaperGridLayoutManager(C81613pB c81613pB) {
        super(3);
        this.A00 = c81613pB;
        ((GridLayoutManager) this).A01 = new AbstractC14890nk() { // from class: X.3pC
            @Override // X.AbstractC14890nk
            public int A00(int i) {
                int i2 = ((AbstractC71473Wg) DownloadableWallpaperGridLayoutManager.this.A00.A04.get(i)).A00;
                if (i2 == 0 || i2 == 1) {
                    return 1;
                }
                if (i2 == 2 || i2 == 3) {
                    return 3;
                }
                throw new UnsupportedOperationException(C000200d.A0D("Invalid viewType: ", i2));
            }
        };
    }
}
