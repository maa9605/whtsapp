package com.whatsapp.contact.picker;

import X.C02F;
import X.C02L;
import X.C0CA;
import X.C0ES;
import X.C0U1;
import X.C2MG;
import X.C2NR;
import X.C41521u3;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class ListMembersSelector extends C2NR {
    public C02L A00;
    public C02F A01;
    public C0CA A02;
    public C0ES A03;
    public C41521u3 A04;
    public C2MG A05;

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("listmembersselector/permissions denied");
            finish();
        }
    }

    @Override // X.C2NR, X.AbstractActivityC40691si, X.AbstractActivityC40701sj, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0U1 A0c = A0c();
        A0c.A0L(true);
        A0c.A08(R.string.new_list);
        if (bundle != null || this.A01.A03()) {
            return;
        }
        RequestPermissionActivity.A04(this, R.string.permission_contacts_access_on_new_broadcast_request, R.string.permission_contacts_access_on_new_broadcast);
    }
}
