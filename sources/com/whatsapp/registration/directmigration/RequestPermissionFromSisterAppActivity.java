package com.whatsapp.registration.directmigration;

import X.C25E;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;

/* loaded from: classes2.dex */
public class RequestPermissionFromSisterAppActivity extends C25E {
    public static final String[] A00 = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    public static boolean A0T(Context context, String[] strArr) {
        PackageManager packageManager;
        for (String str : strArr) {
            if (Build.VERSION.SDK_INT >= 23 && ((packageManager = context.getPackageManager()) == null || packageManager.checkPermission(str, "com.whatsapp.w4b") != 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.whatsapp.RequestPermissionActivity
    public void A0r(Bundle bundle, String str) {
        super.A0r(bundle, A0p(bundle, true));
    }

    @Override // com.whatsapp.RequestPermissionActivity
    public void A0t(String[] strArr, boolean z) {
        View findViewById = findViewById(R.id.submit);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            textView.setText(R.string.permission_settings_open);
            textView.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 18));
            return;
        }
        throw null;
    }

    @Override // com.whatsapp.RequestPermissionActivity
    public boolean A0u(String[] strArr) {
        return A0T(this, strArr);
    }
}
