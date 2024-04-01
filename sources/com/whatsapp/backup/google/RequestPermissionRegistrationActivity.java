package com.whatsapp.backup.google;

import X.AbstractActivityC49782Mj;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;

/* loaded from: classes2.dex */
public class RequestPermissionRegistrationActivity extends AbstractActivityC49782Mj {
    public Intent A00 = new Intent();

    @Override // com.whatsapp.RequestPermissionActivity
    public void A0q(int i) {
        setResult(i, this.A00);
    }

    @Override // com.whatsapp.RequestPermissionActivity
    public void A0t(String[] strArr, boolean z) {
        super.A0t(strArr, z);
        if (z) {
            return;
        }
        View findViewById = findViewById(R.id.submit);
        if (findViewById != null) {
            findViewById.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(strArr, this, 0));
            return;
        }
        throw null;
    }

    @Override // X.AbstractActivityC49782Mj, com.whatsapp.RequestPermissionActivity, X.C0ME, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.cancel);
        if (findViewById != null) {
            findViewById.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 0));
            return;
        }
        throw null;
    }
}
