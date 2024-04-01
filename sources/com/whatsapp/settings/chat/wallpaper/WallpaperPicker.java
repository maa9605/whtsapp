package com.whatsapp.settings.chat.wallpaper;

import X.AbstractActivityC50052Pk;
import X.AbstractC005302j;
import X.C002701i;
import X.C019208x;
import X.C02E;
import X.C03410Fp;
import X.C0FK;
import X.C3WW;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperPicker;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public class WallpaperPicker extends AbstractActivityC50052Pk {
    public C02E A01;
    public C3WW A03;
    public final ArrayList A06 = new ArrayList();
    public final ArrayList A05 = new ArrayList();
    public Resources A00 = null;
    public AbstractC005302j A02 = null;
    public boolean A04 = false;

    public static Intent A00(Context context) {
        return new Intent(context, WallpaperPicker.class).putExtra("chat_jid", (Parcelable) null).putExtra("is_using_global_wallpaper", true);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            if (intent != null && intent.hasExtra("selected_res_id")) {
                setResult(-1, intent);
            } else {
                setResult(0, null);
            }
            finish();
        }
    }

    @Override // X.AbstractActivityC50052Pk, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.wallpaper_package);
        setContentView(R.layout.wallpaper_grid_preview);
        A0k((Toolbar) findViewById(R.id.toolbar));
        A0c().A0L(true);
        if (Build.VERSION.SDK_INT >= 21) {
            findViewById(R.id.separator).setVisibility(8);
        }
        this.A02 = C03410Fp.A05(getIntent());
        this.A04 = getIntent().getBooleanExtra("is_using_global_wallpaper", false);
        C3WW c3ww = new C3WW(this, this);
        this.A03 = c3ww;
        ((AbsListView) findViewById(R.id.color_grid)).setAdapter((ListAdapter) c3ww);
        try {
            this.A00 = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("wallpaperpicker/no application found for com.whatsapp.wallpaper", e);
            C002701i.A19(this, 1);
        }
    }

    @Override // android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            C019208x c019208x = new C019208x(this);
            c019208x.A02(R.string.install_app_ineligible);
            c019208x.A06(R.string.allow, new DialogInterface.OnClickListener() { // from class: X.3WO
                {
                    WallpaperPicker.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    WallpaperPicker.this.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
                }
            });
            c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3WM
                {
                    WallpaperPicker.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    WallpaperPicker.this.finish();
                }
            });
            return c019208x.A00();
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3WL
            {
                WallpaperPicker.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                boolean z;
                WallpaperPicker wallpaperPicker = WallpaperPicker.this;
                try {
                    wallpaperPicker.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.whatsapp.wallpaper")));
                    z = true;
                } catch (ActivityNotFoundException e) {
                    Log.e("wallpaperpicker/activity for install uri not found", e);
                    z = false;
                }
                if (!z) {
                    try {
                        ContentResolver A07 = wallpaperPicker.A01.A07();
                        if (A07 != null && Settings.Secure.getInt(A07, "install_non_market_apps") == 1) {
                            try {
                                wallpaperPicker.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.whatsapp.com/android/WhatsAppWallpaper.apk")));
                            } catch (ActivityNotFoundException e2) {
                                Log.e("wallpaperpicker/activity for install uri not found", e2);
                            }
                        } else {
                            C002701i.A18(wallpaperPicker, 1);
                            C002701i.A19(wallpaperPicker, 2);
                            return;
                        }
                    } catch (Settings.SettingNotFoundException e3) {
                        Log.e("wallpaperpicker/can't find setting", e3);
                    }
                }
                C002701i.A18(wallpaperPicker, 1);
                wallpaperPicker.finish();
            }
        };
        C019208x c019208x2 = new C019208x(this);
        c019208x2.A02(R.string.download_from_market);
        c019208x2.A06(R.string.ok, onClickListener);
        c019208x2.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3WK
            {
                WallpaperPicker.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WallpaperPicker wallpaperPicker = WallpaperPicker.this;
                C002701i.A18(wallpaperPicker, 1);
                wallpaperPicker.finish();
            }
        });
        c019208x2.A01.A02 = new DialogInterface.OnCancelListener() { // from class: X.3WN
            {
                WallpaperPicker.this = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                WallpaperPicker wallpaperPicker = WallpaperPicker.this;
                C002701i.A18(wallpaperPicker, 1);
                wallpaperPicker.finish();
            }
        };
        return c019208x2.A00();
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

    @Override // X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        ArrayList arrayList = this.A05;
        if (arrayList.size() > 0) {
            Log.i("wallpaperpicker/wallpapers already loaded.");
            return;
        }
        Resources resources = this.A00;
        if (resources == null) {
            Log.e("wallpaperpicker/resource is null");
            C002701i.A19(this, 1);
        } else {
            C0FK A04 = C03410Fp.A04(resources);
            ArrayList arrayList2 = this.A06;
            Object obj = A04.A00;
            if (obj != null) {
                arrayList2.addAll((Collection) obj);
                Object obj2 = A04.A01;
                if (obj2 == null) {
                    throw null;
                }
                arrayList.addAll((Collection) obj2);
            } else {
                throw null;
            }
        }
        if (arrayList.size() == 0) {
            C002701i.A19(this, 1);
        } else {
            this.A03.notifyDataSetChanged();
        }
    }
}
