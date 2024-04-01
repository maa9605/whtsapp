package com.google.android.gms.auth.api.signin.internal;

import X.ActivityC02330At;
import X.C07K;
import X.C0m3;
import X.C13U;
import X.C13X;
import X.C13b;
import X.C30401aW;
import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends ActivityC02330At {
    public static boolean A05;
    public int A00;
    public Intent A01;
    public SignInConfiguration A02;
    public boolean A03 = false;
    public boolean A04;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void A0c(int i) {
        Status status = new Status(1, i, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        A05 = false;
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.A03) {
            return;
        }
        setResult(0);
        if (i == 40962) {
            if (intent != null) {
                SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                if (signInAccount != null && (googleSignInAccount = signInAccount.A00) != null) {
                    C13X A00 = C13X.A00(this);
                    GoogleSignInOptions googleSignInOptions = this.A02.A00;
                    synchronized (A00) {
                        C13U c13u = A00.A00;
                        C07K.A1P(googleSignInAccount);
                        C07K.A1P(googleSignInOptions);
                        c13u.A06("defaultGoogleSignInAccount", googleSignInAccount.A07);
                        C07K.A1P(googleSignInAccount);
                        C07K.A1P(googleSignInOptions);
                        String str = googleSignInAccount.A07;
                        String A01 = C13U.A01("googleSignInAccount", str);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            String str2 = googleSignInAccount.A02;
                            if (str2 != null) {
                                jSONObject.put("id", str2);
                            }
                            String str3 = googleSignInAccount.A03;
                            if (str3 != null) {
                                jSONObject.put("tokenId", str3);
                            }
                            String str4 = googleSignInAccount.A04;
                            if (str4 != null) {
                                jSONObject.put("email", str4);
                            }
                            String str5 = googleSignInAccount.A05;
                            if (str5 != null) {
                                jSONObject.put("displayName", str5);
                            }
                            String str6 = googleSignInAccount.A08;
                            if (str6 != null) {
                                jSONObject.put("givenName", str6);
                            }
                            String str7 = googleSignInAccount.A09;
                            if (str7 != null) {
                                jSONObject.put("familyName", str7);
                            }
                            Uri uri = googleSignInAccount.A01;
                            if (uri != null) {
                                jSONObject.put("photoUrl", uri.toString());
                            }
                            String str8 = googleSignInAccount.A06;
                            if (str8 != null) {
                                jSONObject.put("serverAuthCode", str8);
                            }
                            jSONObject.put("expirationTime", googleSignInAccount.A00);
                            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.A07);
                            JSONArray jSONArray = new JSONArray();
                            List list = googleSignInAccount.A0A;
                            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
                            Arrays.sort(scopeArr, C13b.A00);
                            int i3 = 0;
                            for (Scope scope : scopeArr) {
                                jSONArray.put(scope.A01);
                            }
                            jSONObject.put("grantedScopes", jSONArray);
                            jSONObject.remove("serverAuthCode");
                            c13u.A06(A01, jSONObject.toString());
                            String A012 = C13U.A01("googleSignInOptions", str);
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                JSONArray jSONArray2 = new JSONArray();
                                ArrayList arrayList = googleSignInOptions.A06;
                                Collections.sort(arrayList, GoogleSignInOptions.A09);
                                int size = arrayList.size();
                                while (i3 < size) {
                                    Object obj = arrayList.get(i3);
                                    i3++;
                                    jSONArray2.put(((Scope) obj).A01);
                                }
                                jSONObject2.put("scopes", jSONArray2);
                                Account account = googleSignInOptions.A00;
                                if (account != null) {
                                    jSONObject2.put("accountName", account.name);
                                }
                                jSONObject2.put("idTokenRequested", googleSignInOptions.A04);
                                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.A07);
                                jSONObject2.put("serverAuthRequested", googleSignInOptions.A08);
                                if (!TextUtils.isEmpty(googleSignInOptions.A01)) {
                                    jSONObject2.put("serverClientId", googleSignInOptions.A01);
                                }
                                if (!TextUtils.isEmpty(googleSignInOptions.A02)) {
                                    jSONObject2.put("hostedDomain", googleSignInOptions.A02);
                                }
                                c13u.A06(A012, jSONObject2.toString());
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (JSONException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", googleSignInAccount);
                    this.A04 = true;
                    this.A00 = i2;
                    this.A01 = intent;
                    C0m3.A00(this).A01(0, null, new C30401aW(this));
                    A05 = false;
                    return;
                } else if (intent.hasExtra("errorCode")) {
                    int intExtra = intent.getIntExtra("errorCode", 8);
                    if (intExtra == 13) {
                        intExtra = 12501;
                    }
                    A0c(intExtra);
                    return;
                }
            }
            A0c(8);
        }
    }

    @Override // X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            A0c(12500);
            return;
        }
        boolean equals = action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        if (!equals && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
        this.A02 = signInConfiguration;
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
        } else if (bundle == null) {
            if (A05) {
                setResult(0);
                A0c(12502);
                return;
            }
            A05 = true;
            Intent intent2 = new Intent(action);
            if (equals) {
                intent2.setPackage("com.google.android.gms");
            } else {
                intent2.setPackage(getPackageName());
            }
            intent2.putExtra("config", this.A02);
            try {
                startActivityForResult(intent2, 40962);
            } catch (ActivityNotFoundException unused) {
                this.A03 = true;
                Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                A0c(17);
            }
        } else {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.A04 = z;
            if (z) {
                this.A00 = bundle.getInt("signInResultCode");
                this.A01 = (Intent) bundle.getParcelable("signInResultData");
                C0m3.A00(this).A01(0, null, new C30401aW(this));
                A05 = false;
            }
        }
    }

    @Override // X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.A04);
        if (this.A04) {
            bundle.putInt("signInResultCode", this.A00);
            bundle.putParcelable("signInResultData", this.A01);
        }
    }
}
