package com.whatsapp.group;

import X.ActivityC02270An;
import X.C011005l;
import X.C02F;
import X.C05M;
import X.C2MG;
import X.C2O6;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class GroupMembersSelector extends C2O6 {
    public C02F A00;
    public C05M A01;
    public C2MG A02;

    @Override // X.AbstractActivityC40691si
    public void A1i(int i) {
        if (i <= 0) {
            A0c().A07(R.string.add_paticipants);
        } else {
            super.A1i(i);
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
            } else {
                Log.i("groupmembersselector/permissions denied");
                finish();
            }
        } else if (i2 != -1) {
        } else {
            if (intent != null) {
                C011005l A04 = C011005l.A04(intent.getStringExtra("group_jid"));
                if (A04 != null) {
                    Bundle bundleExtra = intent.getBundleExtra("invite_bundle");
                    StringBuilder sb = new StringBuilder("groupmembersselector/group created ");
                    sb.append(A04);
                    Log.i(sb.toString());
                    if (this.A01.A0E(A04) && !AFE()) {
                        StringBuilder sb2 = new StringBuilder("groupmembersselector/opening conversation");
                        sb2.append(A04);
                        Log.i(sb2.toString());
                        Intent A02 = Conversation.A02(this, A04);
                        if (bundleExtra != null) {
                            A02.putExtra("invite_bundle", bundleExtra);
                        }
                        ((ActivityC02270An) this).A00.A07(this, A02);
                        finish();
                        return;
                    }
                } else {
                    throw null;
                }
            }
            startActivity(new Intent(this, HomeActivity.class));
            finish();
        }
    }

    @Override // X.C2O6, X.AbstractActivityC40691si, X.AbstractActivityC40701sj, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null || this.A00.A03()) {
            return;
        }
        RequestPermissionActivity.A04(this, R.string.permission_contacts_access_on_new_group_request, R.string.permission_contacts_access_on_new_group);
    }
}
