package com.facebook.redex;

import X.AbstractC005302j;
import X.AbstractC461425c;
import X.C03410Fp;
import X.C3WP;
import X.C3WW;
import X.C66533Bk;
import X.C67753Gs;
import android.content.Intent;
import android.view.View;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperPicker;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape1S0101000_I1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public ViewOnClickEBaseShape1S0101000_I1(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.A02) {
            case 0:
                int i = this.A00;
                AbstractC461425c abstractC461425c = ((C66533Bk) this.A01).A02.A0A;
                if (abstractC461425c != null) {
                    abstractC461425c.A02(i, true);
                    return;
                }
                return;
            case 1:
                int i2 = this.A00;
                MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) ((C67753Gs) this.A01).A09.A02;
                mediaComposerActivity.A0Y.setCurrentItem(mediaComposerActivity.A0f.A0L(i2));
                return;
            case 2:
                int i3 = this.A00;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                SolidColorWallpaper solidColorWallpaper = ((C3WP) this.A01).A01;
                int i4 = solidColorWallpaper.A02[i3];
                AbstractC005302j A05 = C03410Fp.A05(solidColorWallpaper.getIntent());
                boolean booleanExtra = solidColorWallpaper.getIntent().getBooleanExtra("is_using_global_wallpaper", false);
                Intent intent = new Intent(solidColorWallpaper, SolidColorWallpaperPreview.class);
                intent.putExtra("chat_jid", A05);
                intent.putExtra("is_using_global_wallpaper", booleanExtra);
                intent.putExtra("scw_preview_color", i4);
                intent.putExtra("wallpaper_preview_intent_extra_animate", true);
                intent.putExtra("wallpaper_preview_intent_extra_x", iArr[0]);
                intent.putExtra("wallpaper_preview_intent_extra_y", iArr[1]);
                intent.putExtra("wallpaper_preview_intent_extra_width", view.getWidth());
                intent.putExtra("wallpaper_preview_intent_extra_height", view.getHeight());
                solidColorWallpaper.startActivityForResult(intent, 1);
                return;
            case 3:
                int i5 = this.A00;
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                WallpaperPicker wallpaperPicker = ((C3WW) this.A01).A01;
                AbstractC005302j abstractC005302j = wallpaperPicker.A02;
                boolean z = wallpaperPicker.A04;
                ArrayList arrayList = wallpaperPicker.A05;
                ArrayList arrayList2 = wallpaperPicker.A06;
                Intent intent2 = new Intent(wallpaperPicker, WallpaperPreview.class);
                intent2.putExtra("wallpaper_preview_intent_starting_pos", i5);
                intent2.putExtra("wallpaper_preview_intent_image_res_ids", arrayList);
                intent2.putExtra("wallpaper_preview_intent_thumb_res_ids", arrayList2);
                intent2.putExtra("chat_jid", abstractC005302j);
                intent2.putExtra("is_using_global_wallpaper", z);
                intent2.putExtra("wallpaper_preview_intent_extra_x", iArr2[0]);
                intent2.putExtra("wallpaper_preview_intent_extra_y", iArr2[1]);
                intent2.putExtra("wallpaper_preview_intent_extra_width", view.getWidth());
                intent2.putExtra("wallpaper_preview_intent_extra_height", view.getHeight());
                wallpaperPicker.startActivityForResult(intent2, 1);
                return;
            default:
                return;
        }
    }
}
