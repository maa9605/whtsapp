package com.whatsapp.profile;

import X.AbstractActivityC457723p;
import X.C018508q;
import X.C02F;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class CapturePhoto extends AbstractActivityC457723p {
    public C018508q A00;
    public C02F A01;

    public final void A0c() {
        if (RequestPermissionActivity.A0N(this, this.A01, 30)) {
            try {
                startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", getIntent().getParcelableExtra("target_file_uri")).setFlags(2), 1);
            } catch (ActivityNotFoundException e) {
                Log.e("capturephoto/start-activity ", e);
                this.A00.A07(R.string.activity_not_found, 0);
            }
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            setResult(i2, intent);
            finish();
        } else if (i != 30) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A0c();
        } else {
            finish();
        }
    }

    @Override // X.AbstractActivityC457723p, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.capture_photo);
        if (getCallingPackage() == null || !getCallingPackage().equals(getPackageName())) {
            finish();
        } else if (bundle == null) {
            A0c();
        }
    }
}
