package com.whatsapp.settings.chat.wallpaper;

import X.AbstractActivityC50062Pm;
import X.C0HS;
import X.C3WZ;
import X.C71433Wc;
import X.C86343xH;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class WallpaperPreview extends AbstractActivityC50062Pm {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public MarginCorrectedViewPager A09;
    public List A0A;
    public List A0B;
    public boolean A0C;
    public Resources A04 = null;
    public final Map A0D = new HashMap();

    public final void A1R(int i) {
        int i2;
        int i3;
        this.A0C = true;
        MarginCorrectedViewPager marginCorrectedViewPager = this.A09;
        marginCorrectedViewPager.setScrollEnabled(false);
        StringBuilder sb = new StringBuilder("chatlayout-");
        sb.append(i);
        View findViewWithTag = marginCorrectedViewPager.findViewWithTag(sb.toString());
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        if (i != getIntent().getIntExtra("wallpaper_preview_intent_starting_pos", -1)) {
            this.A02 = 0;
            this.A03 = 0;
            i2 = this.A09.getWidth() >> 1;
            i3 = this.A09.getWidth() >> 1;
        } else {
            i2 = 0;
            i3 = 0;
        }
        this.A09.setPivotX(i2);
        this.A09.setPivotY(i3);
        int i4 = (int) (getResources().getDisplayMetrics().density * 20.0f);
        this.A06.setBackgroundColor(0);
        if (findViewWithTag != null) {
            findViewWithTag.animate().setDuration(250L).alpha(0.0f).translationY(i4).setInterpolator(decelerateInterpolator);
        }
        this.A07.animate().setDuration(250L).alpha(0.0f).setInterpolator(decelerateInterpolator).setListener(new C71433Wc(this, decelerateInterpolator));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (this.A0C) {
            overridePendingTransition(0, 0);
        }
    }

    public /* synthetic */ void lambda$onCreate$2373$WallpaperPreview(View view) {
        setResult(0, null);
        A1R(this.A09.getCurrentItem());
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        setResult(0, null);
        A1R(this.A09.getCurrentItem());
    }

    @Override // X.AbstractActivityC50062Pm, X.C2PT, X.C2PU, X.C2PR, X.C2PS, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.A04 = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("wallpaperpreview/com.whatsapp.wallpaper could not be found.", e);
        }
        this.A06 = findViewById(R.id.wallpaper_preview_container);
        this.A05 = findViewById(R.id.appbar);
        this.A08 = findViewById(R.id.transition_view);
        this.A0A = getIntent().getIntegerArrayListExtra("wallpaper_preview_intent_image_res_ids");
        this.A0B = getIntent().getIntegerArrayListExtra("wallpaper_preview_intent_thumb_res_ids");
        this.A09 = (MarginCorrectedViewPager) findViewById(R.id.wallpaper_preview);
        this.A09.setAdapter(new C86343xH(this, this, this.A04));
        this.A09.setPageMargin((int) (getResources().getDisplayMetrics().density * 15.0f));
        this.A07 = findViewById(R.id.control_holder);
        findViewById(R.id.cancel_button).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 15));
        this.A09.setCurrentItem(getIntent().getIntExtra("wallpaper_preview_intent_starting_pos", 0));
        this.A0C = false;
        overridePendingTransition(0, 0);
        Intent intent = getIntent();
        this.A0C = true;
        this.A09.setScrollEnabled(false);
        this.A08.getViewTreeObserver().addOnPreDrawListener(new C3WZ(this, intent.getIntExtra("wallpaper_preview_intent_extra_x", 0), intent.getIntExtra("wallpaper_preview_intent_extra_y", 0), intent.getIntExtra("wallpaper_preview_intent_extra_width", 0), intent.getIntExtra("wallpaper_preview_intent_extra_height", 0)));
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        for (Map.Entry entry : this.A0D.entrySet()) {
            ((C0HS) entry.getValue()).A05(true);
        }
        super.onDestroy();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, null);
        A1R(this.A09.getCurrentItem());
        return true;
    }
}
