package com.whatsapp.accountsync;

import X.AbstractServiceC35791jk;
import X.C27091Ly;
import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.whatsapp.accountsync.LoginActivity;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AccountAuthenticatorService extends AbstractServiceC35791jk {
    public static C27091Ly A00;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1Ly] */
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if ("android.accounts.AccountAuthenticator".equals(intent.getAction())) {
            C27091Ly c27091Ly = A00;
            C27091Ly c27091Ly2 = c27091Ly;
            if (c27091Ly == null) {
                ?? r0 = new AbstractAccountAuthenticator(this) { // from class: X.1Ly
                    public final Context A00;

                    {
                        super(this);
                        this.A00 = this;
                    }

                    @Override // android.accounts.AbstractAccountAuthenticator
                    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
                        Log.i("account/sync/addAccount");
                        Bundle bundle2 = new Bundle();
                        Intent intent2 = new Intent(this.A00, LoginActivity.class);
                        intent2.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
                        bundle2.putParcelable("intent", intent2);
                        return bundle2;
                    }

                    @Override // android.accounts.AbstractAccountAuthenticator
                    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
                        Log.i("account/sync/confirmCredentials");
                        return null;
                    }

                    @Override // android.accounts.AbstractAccountAuthenticator
                    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
                        Log.i("account/sync/editProperties");
                        return null;
                    }

                    @Override // android.accounts.AbstractAccountAuthenticator
                    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
                        Log.i("account/sync/getAuthToken");
                        return null;
                    }

                    @Override // android.accounts.AbstractAccountAuthenticator
                    public String getAuthTokenLabel(String str) {
                        Log.i("account/sync/getAuthTokenLabel");
                        return null;
                    }

                    @Override // android.accounts.AbstractAccountAuthenticator
                    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
                        C000200d.A1N(C000200d.A0P("account/sync/hasFeatures: "), Arrays.toString(strArr));
                        return null;
                    }

                    @Override // android.accounts.AbstractAccountAuthenticator
                    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
                        Log.i("account/sync/updateCredentials");
                        return null;
                    }
                };
                A00 = r0;
                c27091Ly2 = r0;
            }
            return c27091Ly2.getIBinder();
        }
        return null;
    }
}
