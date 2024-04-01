package com.whatsapp.settings.chat.wallpaper.downloadable.picker;

import X.AbstractActivityC50082Pq;
import X.AnonymousClass267;
import X.C02160Ac;
import X.C0HS;
import X.C0VJ;
import X.C0Z8;
import X.C2PR;
import X.C2PT;
import X.C81643pE;
import X.C86353xI;
import X.InterfaceC002901k;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class DownloadableWallpaperPreviewActivity extends AbstractActivityC50082Pq {
    public Resources A00;
    public MarginCorrectedViewPager A01;
    public AnonymousClass267 A02;
    public C86353xI A03;
    public InterfaceC002901k A05;
    public List A06;
    public List A07;
    public List A08;
    public Set A09 = new HashSet();
    public C81643pE A04 = new C81643pE(this);

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        setResult(0, null);
        finish();
    }

    @Override // X.AbstractActivityC50082Pq, X.C2PT, X.C2PU, X.C2PR, X.C2PS, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0VJ.A0A(this, R.id.wallpaper_preview_container).setBackgroundColor(C02160Ac.A00(this, R.color.primary_surface));
        ((C2PT) this).A00.setEnabled(false);
        try {
            this.A00 = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("DownloadableWallpaperPreviewActivity/com.whatsapp.wallpaper could not be found.", e);
        }
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("THUMBNAIL_URIS_KEY");
        if (parcelableArrayListExtra != null) {
            this.A06 = parcelableArrayListExtra;
            this.A08 = getIntent().getIntegerArrayListExtra("WHATSAPP_THUMBNAIL_RES_KEY");
            this.A07 = getIntent().getIntegerArrayListExtra("WHATSAPP_FULL_RES_KEY");
            this.A01 = (MarginCorrectedViewPager) C0VJ.A0A(this, R.id.wallpaper_preview);
            C86353xI c86353xI = new C86353xI(this, this.A05, this.A02, this.A00, this.A04, this.A06, this.A08, this.A07, ((C2PR) this).A00, ((C2PR) this).A01);
            this.A03 = c86353xI;
            this.A01.setAdapter(c86353xI);
            this.A01.setPageMargin(getResources().getDimensionPixelOffset(R.dimen.downloadable_wallpaper_pager_margin));
            this.A01.A0F(new C0Z8() { // from class: X.3pF
                @Override // X.C0Z8
                public void AMg(int i) {
                }

                @Override // X.C0Z8
                public void AMh(int i, float f, int i2) {
                }

                {
                    DownloadableWallpaperPreviewActivity.this = this;
                }

                @Override // X.C0Z8
                public void AMi(int i) {
                    DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = DownloadableWallpaperPreviewActivity.this;
                    ((C2PT) downloadableWallpaperPreviewActivity).A00.setEnabled(downloadableWallpaperPreviewActivity.A09.contains(Integer.valueOf(i)));
                }
            });
            this.A01.setCurrentItem(getIntent().getIntExtra("STARTING_POSITION_KEY", 0));
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        for (C0HS c0hs : this.A03.A07.values()) {
            c0hs.A05(true);
        }
        super.onDestroy();
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
