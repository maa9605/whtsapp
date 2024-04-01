package com.whatsapp.instrumentation.ui;

import X.AbstractC02800Cx;
import X.ActivityC02290Ap;
import X.AnonymousClass088;
import X.C005002g;
import X.C00C;
import X.C00E;
import X.C00G;
import X.C01C;
import X.C02820Cz;
import X.C07000Wb;
import X.C2OF;
import X.C2OG;
import X.C2OH;
import X.C40291rx;
import X.C40301ry;
import X.InterfaceC55912mO;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.search.verification.client.R;
import com.whatsapp.biometric.BiometricAuthPlugin;
import com.whatsapp.instrumentation.ui.InstrumentationAuthActivity;
import com.whatsapp.util.Log;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public class InstrumentationAuthActivity extends C2OF implements C2OG, C2OH {
    public C005002g A00;
    public BiometricAuthPlugin A01;
    public C00C A02;
    public DisclosureFragment A03;
    public C07000Wb A04;
    public C00G A05;
    public C40291rx A06;
    public C40301ry A07;
    public String A08;

    public final void A1P(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("error_code", i);
        intent.putExtra("error_message", str);
        setResult(0, intent);
        finish();
    }

    public final void A1Q(String str) {
        Intent intent = new Intent();
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            C07000Wb c07000Wb = this.A04;
            synchronized (c07000Wb) {
                if (c07000Wb.A02(callingPackage, str)) {
                    C00E c00e = c07000Wb.A00;
                    String A01 = C00E.A01(callingPackage, "request/token");
                    c00e.A02().edit().remove(A01).remove(C00E.A01(callingPackage, "request/token_ts")).apply();
                    c00e.A02().edit().remove(C00E.A01(callingPackage, "auth/encryption_key")).apply();
                    byte[] bArr = new byte[16];
                    new SecureRandom().nextBytes(bArr);
                    String encodeToString = Base64.encodeToString(bArr, 11);
                    String A012 = C00E.A01(callingPackage, "auth/token");
                    String A013 = C00E.A01(callingPackage, "auth/token_ts");
                    String A014 = C00E.A01(callingPackage, "metadata/last_active_time");
                    long A05 = c00e.A01.A05();
                    c00e.A02().edit().putString(A012, encodeToString).putLong(A013, A05).putLong(A014, A05).apply();
                    if (encodeToString != null) {
                        intent.putExtra("authorization_token", encodeToString);
                        setResult(-1, intent);
                        finish();
                        return;
                    }
                }
            }
            A1P(4, "Request is not authorized!");
            return;
        }
        throw null;
    }

    @Override // X.C2OG
    public void AGs() {
        if (((ActivityC02290Ap) this).A0B.A0E(C01C.A1F) && this.A01.A01()) {
            this.A01.A00();
        } else {
            A1Q(this.A08);
        }
    }

    @Override // X.C2OH
    public void AMR() {
        AbstractC02800Cx A0N = A0N();
        if (A0N != null) {
            C02820Cz c02820Cz = new C02820Cz(A0N);
            c02820Cz.A01(R.id.fragment_container, this.A03, null);
            c02820Cz.A03(null);
            c02820Cz.A04();
            return;
        }
        throw null;
    }

    @Override // X.C2OF, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setTitle(R.string.instrumentation_auth_title_activity);
        if (!this.A02.A01()) {
            A1P(3, "Feature is disabled!");
            return;
        }
        ComponentName callingActivity = getCallingActivity();
        if (callingActivity == null) {
            A1P(8, "Not started for result.");
            return;
        }
        String packageName = callingActivity.getPackageName();
        try {
            if (this.A05.A02(packageName).A03) {
                Intent intent = getIntent();
                if (intent != null && getCallingPackage() != null) {
                    str = intent.getStringExtra("request_token");
                } else {
                    str = null;
                }
                this.A08 = str;
                if (!this.A04.A02(packageName, str)) {
                    Log.e("InstrumentationAuthActivity/onCreate no correct request token!");
                    A1P(4, "Request is not authorized!");
                    return;
                }
                setContentView(R.layout.instrumentation_auth);
                this.A01 = new BiometricAuthPlugin(((ActivityC02290Ap) this).A0I, ((ActivityC02290Ap) this).A0A, ((ActivityC02290Ap) this).A08, this, new InterfaceC55912mO() { // from class: X.3DC
                    {
                        InstrumentationAuthActivity.this = this;
                    }

                    @Override // X.InterfaceC55912mO
                    public final void AHY(int i) {
                        InstrumentationAuthActivity instrumentationAuthActivity = InstrumentationAuthActivity.this;
                        if (i != 1) {
                            instrumentationAuthActivity.A1Q(instrumentationAuthActivity.A08);
                        }
                    }
                });
                this.A03 = new DisclosureFragment();
                if (bundle == null) {
                    AbstractC02800Cx A0N = A0N();
                    if (A0N != null) {
                        C02820Cz c02820Cz = new C02820Cz(A0N);
                        c02820Cz.A00(R.id.fragment_container, new PermissionsFragment());
                        c02820Cz.A04();
                    } else {
                        throw null;
                    }
                }
                if (this.A00.A04()) {
                    Log.w("InstrumentationAuthActivity/onCreate/clock-wrong");
                    AnonymousClass088.A23(this, this.A06, this.A07);
                    return;
                } else if (!this.A00.A03()) {
                    return;
                } else {
                    Log.w("InstrumentationAuthActivity/onCreate/sw-expired");
                    AnonymousClass088.A24(this, this.A06, this.A07);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        StringBuilder sb = new StringBuilder("Untrusted caller: ");
        sb.append(packageName);
        A1P(8, sb.toString());
    }
}
