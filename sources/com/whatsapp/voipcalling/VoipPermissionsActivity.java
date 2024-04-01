package com.whatsapp.voipcalling;

import X.AbstractActivityC50142Qd;
import X.AbstractC005302j;
import X.C000200d;
import X.C000700j;
import X.C003101m;
import X.C011305p;
import X.C018508q;
import X.C02F;
import X.C05W;
import X.C06C;
import X.C07950aM;
import X.C0D3;
import X.C0HY;
import X.C2IY;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class VoipPermissionsActivity extends AbstractActivityC50142Qd {
    public int A00;
    public C018508q A01;
    public C05W A02;
    public C02F A03;
    public C0HY A04;
    public GroupJid A05;
    public C0D3 A06;
    public C2IY A07;
    public List A08 = new ArrayList();
    public boolean A09;
    public boolean A0A;

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder A0R = C000200d.A0R("VoipPermissionsActivity onActivityResult got result: ", i2, " for request: ", i, " data: ");
        A0R.append(intent);
        Log.i(A0R.toString());
        if (i != 152) {
            C000200d.A0t("VoipPermissionsActivity onActivityResult unhandled request: ", i, " result: ", i2);
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            if (this.A06 == null) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC005302j abstractC005302j : this.A08) {
                    C06C A09 = this.A02.A09(abstractC005302j);
                    if (A09 != null) {
                        arrayList.add(A09);
                    }
                }
                Log.i("VoipPermissionsActivity onActivityResult starting call");
                this.A07.A02(arrayList, this, this.A00, this.A09, this.A0A, this.A05);
            } else {
                this.A07.A04(this.A06, this, intent != null ? intent.getIntExtra("lobby_entry_point", 0) : 0);
            }
        }
        finish();
    }

    @Override // X.AbstractActivityC50142Qd, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        Log.i("voip/VoipPermissionsActivity/onCreate");
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("join_call_log", false)) {
            int intExtra = intent.getIntExtra("call_log_transaction_id", -1);
            String stringExtra = intent.getStringExtra("call_log_call_id");
            boolean booleanExtra = intent.getBooleanExtra("call_log_from_me", false);
            try {
                this.A06 = this.A04.A04(new C07950aM(UserJid.get(intent.getStringExtra("call_log_user_jid")), booleanExtra, stringExtra, intExtra));
            } catch (C011305p unused) {
                Log.e("voip/VoipPermissionsActivity/onCreate invalid jid");
                return;
            }
        } else {
            List A0F = C003101m.A0F(UserJid.class, intent.getStringArrayListExtra("jids"));
            this.A08 = A0F;
            C000700j.A08(!A0F.isEmpty(), "There must be at least one jid");
            this.A00 = intent.getIntExtra("call_from", -1);
            this.A09 = intent.getBooleanExtra("smaller_call_btn", false);
            if (intent.hasExtra("group_jid")) {
                this.A05 = GroupJid.getNullable(intent.getStringExtra("group_jid"));
            }
        }
        boolean booleanExtra2 = intent.getBooleanExtra("video_call", false);
        this.A0A = booleanExtra2;
        RequestPermissionActivity.A07(this, this.A01, this.A03, booleanExtra2);
    }
}
