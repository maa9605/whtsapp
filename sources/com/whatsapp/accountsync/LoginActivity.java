package com.whatsapp.accountsync;

import X.C018508q;
import X.C02L;
import X.C0HS;
import X.C0WR;
import X.InterfaceC002901k;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.accountsync.LoginActivity;

/* loaded from: classes.dex */
public class LoginActivity extends C0WR {
    public C018508q A00;
    public C02L A01;
    public InterfaceC002901k A02;

    @Override // X.C0WR, X.C0WS, X.C0WT, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.app_name);
        setContentView(R.layout.login);
        boolean z = false;
        for (Account account : AccountManager.get(this).getAccounts()) {
            if ("com.whatsapp".contains(account.type)) {
                z = true;
            }
        }
        if (z) {
            this.A00.A07(R.string.account_sync_acct_added, 1);
            finish();
            return;
        }
        C02L c02l = this.A01;
        c02l.A05();
        if (c02l.A03 == null) {
            Intent intent = new Intent(this, Main.class);
            intent.putExtra("show_registration_first_dlg", true);
            startActivity(intent);
            finish();
            return;
        }
        this.A02.ARy(new C0HS(this) { // from class: X.1jl
            public final ProgressDialog A00;

            {
                LoginActivity.this = this;
                ProgressDialog show = ProgressDialog.show(this, "", this.getString(R.string.account_sync_authenticating), true, false);
                this.A00 = show;
                show.setCancelable(true);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                SystemClock.sleep(2000L);
                LoginActivity loginActivity = LoginActivity.this;
                Account account2 = new Account(loginActivity.getString(R.string.app_name), "com.whatsapp");
                if (AccountManager.get(loginActivity).addAccountExplicitly(account2, null, null)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("authAccount", account2.name);
                    bundle2.putString("accountType", account2.type);
                    ((C0WS) loginActivity).A01 = bundle2;
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                this.A00.dismiss();
                if (((Boolean) obj).booleanValue()) {
                    LoginActivity.this.finish();
                }
            }
        }, new Void[0]);
    }
}
