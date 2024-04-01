package com.whatsapp.settings.chat.wallpaper;

import X.C01B;
import X.C03410Fp;
import X.C0U1;
import X.C2Pc;
import X.C3WP;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class SolidColorWallpaper extends C2Pc {
    public static final int[] A03 = {R.string.color_name_cinder_black, R.string.color_name_midnight_express, R.string.color_name_mandarian_orange, R.string.color_name_buccaneer_brown, R.string.color_name_breaker_bay, R.string.color_name_fjord_gray, R.string.color_name_tory_blue, R.string.color_name_pelorus_blue, R.string.color_name_seagull_blue, R.string.color_name_downy_green, R.string.color_name_cruise_green, R.string.color_name_scandal_green, R.string.color_name_monte_carlo_green, R.string.color_name_cape_honey_yellow, R.string.color_name_canary_yellow, R.string.color_name_radical_red, R.string.color_name_bittersweet_orange, R.string.color_name_rose_bud, R.string.color_name_flamingo_red, R.string.color_name_caramel_yellow, R.string.color_name_tusk_green, R.string.color_name_orinoco_green, R.string.color_name_brook_green, R.string.color_name_hawkes_blue, R.string.color_name_quartz_blue, R.string.color_name_very_light_gray, R.string.color_name_solitude_gray};
    public static final int[] A04 = {R.string.color_name_cruise_green, R.string.color_name_scandal_green, R.string.color_name_monte_carlo_green, R.string.color_name_hawkes_blue, R.string.color_name_downy_green, R.string.color_name_seagull_blue, R.string.color_name_quartz_blue, R.string.color_name_very_light_gray, R.string.color_name_orinoco_green, R.string.color_name_tusk_green, R.string.color_name_cape_honey_yellow, R.string.color_name_caramel_yellow, R.string.color_name_rose_bud, R.string.color_name_bittersweet_orange, R.string.color_name_radical_red, R.string.color_name_mandarian_orange, R.string.color_name_flamingo_red, R.string.color_name_buccaneer_brown, R.string.color_name_breaker_bay, R.string.color_name_pelorus_blue, R.string.color_name_tory_blue, R.string.color_name_fjord_gray, R.string.color_name_cinder_black, R.string.color_name_midnight_express, R.string.color_name_solitude_gray, R.string.color_name_canary_yellow, R.string.color_name_brook_green};
    public C01B A00;
    public int[] A01;
    public int[] A02;

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            if (intent != null && intent.hasExtra("wallpaper_color_file")) {
                setResult(-1, intent);
                finish();
                return;
            }
            setResult(0, null);
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.C2Pc, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.solid_color_wallpaper);
        setContentView(R.layout.wallpaper_grid_preview);
        A0k((Toolbar) findViewById(R.id.toolbar));
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            if (Build.VERSION.SDK_INT >= 21) {
                View findViewById = findViewById(R.id.separator);
                if (findViewById == null) {
                    throw null;
                }
                findViewById.setVisibility(8);
            }
            View findViewById2 = findViewById(R.id.color_grid);
            if (findViewById2 != null) {
                AbsListView absListView = (AbsListView) findViewById2;
                int[] A09 = C03410Fp.A09(this, this.A00);
                int length = A09.length;
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = i;
                }
                Pair pair = new Pair(A09, iArr);
                this.A01 = (int[]) pair.first;
                this.A02 = (int[]) pair.second;
                absListView.setAdapter((ListAdapter) new C3WP(this, this));
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, null);
        finish();
        return true;
    }
}
