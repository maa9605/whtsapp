package com.whatsapp.gallerypicker;

import X.AbstractActivityC457623n;
import X.C02F;
import X.C03410Fp;
import X.C456723a;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;

/* loaded from: classes2.dex */
public class GalleryPickerLauncher extends AbstractActivityC457623n {
    public C02F A00;
    public C456723a A01;

    public final void A0c() {
        if (!this.A00.A06()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access;
            }
            RequestPermissionActivity.A05(this, R.string.permission_storage_need_write_access_request, i2);
            return;
        }
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("max_items", 1);
        boolean booleanExtra = intent.getBooleanExtra("is_in_multi_select_mode_only", false);
        Intent intent2 = new Intent(this, GalleryPicker.class);
        intent2.putExtra("include_media", 1);
        intent2.putExtra("max_items", intExtra);
        intent2.putExtra("is_in_multi_select_mode_only", booleanExtra);
        intent2.putExtra("preview", false);
        intent2.putExtra("output", Uri.fromFile(this.A01.A03()));
        startActivityForResult(intent2, 1);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            setResult(i2, intent);
            if (intent != null) {
                intent.putExtra("chat_jid", C03410Fp.A05(getIntent()));
                intent.putExtra("is_using_global_wallpaper", getIntent().getBooleanExtra("is_using_global_wallpaper", false));
            }
            finish();
        } else if (i != 151) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A0c();
        } else {
            finish();
        }
    }

    @Override // X.AbstractActivityC457623n, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.gallery_picker_label);
        if (bundle == null) {
            A0c();
        }
    }
}
