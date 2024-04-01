package com.whatsapp.registration;

import X.C02F;
import X.C2MG;
import X.C2P0;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class NotifyContactsSelector extends C2P0 {
    public C02F A00;
    public C2MG A01;

    @Override // X.AbstractActivityC40691si
    public void A1i(int i) {
        if (i <= 0) {
            A0c().A07(R.string.add_contacts_to_notify_change_number);
        } else {
            super.A1i(i);
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("listmembersselector/permissions denied");
            finish();
        }
    }

    @Override // X.C2P0, X.AbstractActivityC40691si, X.AbstractActivityC40701sj, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null || this.A00.A03()) {
            return;
        }
        RequestPermissionActivity.A04(this, R.string.permission_contacts_access_on_notify_contacts_change_number_request, R.string.permission_contacts_access_on_notify_contacts_change_number);
    }
}
