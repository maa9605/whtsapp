package com.whatsapp.settings.chat.wallpaper.downloadable.picker;

import X.AbstractActivityC50072Po;
import X.ActivityC02290Ap;
import X.AnonymousClass267;
import X.C002301c;
import X.C03410Fp;
import X.C0FK;
import X.C0HS;
import X.C0VJ;
import X.C35301iv;
import X.C81613pB;
import X.C81633pD;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DownloadableWallpaperPickerActivity extends AbstractActivityC50072Po {
    public View A01;
    public View A02;
    public C0FK A03;
    public RecyclerView A04;
    public C002301c A05;
    public AnonymousClass267 A06;
    public C81613pB A07;
    public InterfaceC002901k A08;
    public List A09 = new ArrayList();
    public Resources A00 = null;

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 111) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(i2, intent);
            finish();
        }
    }

    @Override // X.AbstractActivityC50072Po, X.C2PR, X.C2PS, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        final boolean booleanExtra = getIntent().getBooleanExtra("IS_BRIGHT_KEY", true);
        if (booleanExtra) {
            string = getString(R.string.wallpaper_categories_bright);
        } else {
            string = getString(R.string.wallpaper_categories_dark);
        }
        setTitle(string);
        try {
            Resources resourcesForApplication = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
            this.A00 = resourcesForApplication;
            this.A03 = C03410Fp.A04(resourcesForApplication);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("WallpaperCurrentPreviewActivity/com.whatsapp.wallpaper could not be found.", e);
        }
        this.A02 = C0VJ.A0A(this, R.id.wallpaper_thumbnails_progress_container);
        this.A01 = C0VJ.A0A(this, R.id.wallpaper_thumbnail_error_container);
        this.A04 = (RecyclerView) C0VJ.A0A(this, R.id.wallpaper_thumbnail_recyclerview);
        C81613pB c81613pB = new C81613pB(((ActivityC02290Ap) this).A0I, this.A08, this.A00, new C81633pD(this));
        this.A07 = c81613pB;
        this.A04.setLayoutManager(new DownloadableWallpaperGridLayoutManager(c81613pB));
        this.A04.A0k(new C35301iv(this.A05, getResources().getDimensionPixelOffset(R.dimen.wallpaper_thumbnail_spacing)));
        this.A04.setAdapter(this.A07);
        if (this.A06.A00.A01() == null) {
            this.A06.A02();
        }
        final Button button = (Button) C0VJ.A0A(this, R.id.wallpaper_thumbnail_reload_button);
        button.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, button, 46));
        this.A06.A00.A05(this, new InterfaceC05620Pl() { // from class: X.3p4
            {
                DownloadableWallpaperPickerActivity.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                DownloadableWallpaperPickerActivity downloadableWallpaperPickerActivity = DownloadableWallpaperPickerActivity.this;
                boolean z = booleanExtra;
                Button button2 = button;
                C26A c26a = (C26A) obj;
                int i = c26a.A00;
                if (i == 2) {
                    AnonymousClass269 anonymousClass269 = c26a.A01;
                    if (z) {
                        if (anonymousClass269 == null) {
                            throw null;
                        }
                        downloadableWallpaperPickerActivity.A09 = anonymousClass269.A01;
                    } else if (anonymousClass269 == null) {
                        throw null;
                    } else {
                        downloadableWallpaperPickerActivity.A09 = anonymousClass269.A00;
                    }
                    downloadableWallpaperPickerActivity.A02.setVisibility(8);
                    downloadableWallpaperPickerActivity.A01.setVisibility(8);
                    downloadableWallpaperPickerActivity.A04.setVisibility(0);
                    button2.setEnabled(false);
                    C0FK c0fk = downloadableWallpaperPickerActivity.A03;
                    downloadableWallpaperPickerActivity.A07.A0G(downloadableWallpaperPickerActivity.A09, c0fk, c0fk == null ? 0 : 1);
                } else if (i == 1) {
                    button2.setEnabled(false);
                    downloadableWallpaperPickerActivity.A02.setVisibility(0);
                    downloadableWallpaperPickerActivity.A01.setVisibility(8);
                    downloadableWallpaperPickerActivity.A04.setVisibility(8);
                } else {
                    downloadableWallpaperPickerActivity.A02.setVisibility(8);
                    downloadableWallpaperPickerActivity.A01.setVisibility(0);
                    downloadableWallpaperPickerActivity.A04.setVisibility(8);
                    button2.setEnabled(true);
                }
            }
        });
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        for (C0HS c0hs : this.A07.A05.values()) {
            c0hs.A05(true);
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            setResult(0, null);
            finish();
            return true;
        }
        return false;
    }
}
