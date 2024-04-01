package com.whatsapp.settings.chat.wallpaper;

import X.AbstractC04890Mh;
import X.AbstractC14890nk;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.settings.chat.wallpaper.WallpaperGridLayoutManager;

/* loaded from: classes2.dex */
public class WallpaperGridLayoutManager extends GridLayoutManager {
    public final AbstractC04890Mh A00;

    public WallpaperGridLayoutManager(AbstractC04890Mh abstractC04890Mh) {
        super(2);
        this.A00 = abstractC04890Mh;
        ((GridLayoutManager) this).A01 = new AbstractC14890nk() { // from class: X.3oy
            @Override // X.AbstractC14890nk
            public int A00(int i) {
                int A0D = WallpaperGridLayoutManager.this.A00.A0D(i);
                if (A0D == 0 || A0D == 1 || A0D == 2 || A0D == 3) {
                    return 1;
                }
                if (A0D == 4 || A0D == 5) {
                    return 2;
                }
                throw new UnsupportedOperationException(C000200d.A0D("Invalid viewType: ", A0D));
            }
        };
    }
}
