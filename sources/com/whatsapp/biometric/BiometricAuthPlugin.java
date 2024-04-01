package com.whatsapp.biometric;

import X.AbstractC000600i;
import X.AbstractC11700iC;
import X.ActivityC02330At;
import X.AnonymousClass328;
import X.C003701t;
import X.C018508q;
import X.C02160Ac;
import X.C0C1;
import X.C0MW;
import X.C11690iB;
import X.C11730iF;
import X.C11740iG;
import X.C11750iH;
import X.C1SW;
import X.InterfaceC55912mO;
import android.app.KeyguardManager;
import android.os.Build;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class BiometricAuthPlugin implements C0MW {
    public C11690iB A00;
    public C11740iG A01;
    public C11750iH A02;
    public final int A03 = R.string.linked_device_unlock_to_link;
    public final ActivityC02330At A04;
    public final AbstractC000600i A05;
    public final AnonymousClass328 A06;
    public final C003701t A07;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.328] */
    public BiometricAuthPlugin(C003701t c003701t, final C018508q c018508q, final AbstractC000600i abstractC000600i, final ActivityC02330At activityC02330At, final InterfaceC55912mO interfaceC55912mO) {
        this.A07 = c003701t;
        this.A05 = abstractC000600i;
        this.A04 = activityC02330At;
        this.A06 = new AbstractC11700iC(c018508q, abstractC000600i, activityC02330At, interfaceC55912mO) { // from class: X.328
            public static final Set A04 = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 11, 12, 14)));
            public final ActivityC02330At A00;
            public final AbstractC000600i A01;
            public final C018508q A02;
            public final InterfaceC55912mO A03;

            {
                this.A02 = c018508q;
                this.A01 = abstractC000600i;
                this.A00 = activityC02330At;
                this.A03 = interfaceC55912mO;
            }

            @Override // X.AbstractC11700iC
            public void A00() {
                Log.i("BiometricAuthPlugin/AuthenticationCallback/failed");
            }

            @Override // X.AbstractC11700iC
            public void A01(int i, CharSequence charSequence) {
                C000200d.A0q("BiometricAuthPlugin/AuthenticationCallback/errorCode: ", i);
                if (A04.contains(Integer.valueOf(i))) {
                    this.A01.A09("BiometricAuthPlugin/HardwareProblem", String.valueOf(i), false);
                    this.A03.AHY(2);
                    return;
                }
                if (i == 7) {
                    this.A02.A0E(this.A00.getString(R.string.app_auth_lockout_error, 30), 1);
                }
                this.A03.AHY(1);
            }

            @Override // X.AbstractC11700iC
            public void A02(C11710iD c11710iD) {
                Log.i("BiometricAuthPlugin/AuthenticationCallback/succeeded");
                this.A03.AHY(0);
            }
        };
        activityC02330At.AAs().A02(this);
    }

    public void A00() {
        if (this.A02 != null && this.A01 != null) {
            Log.i("BiometricAuthPlugin/authentication-attempt");
            this.A02.A01(this.A01);
            return;
        }
        throw new IllegalStateException("BiometricAuthPlugin/authenticate: Have you check if you can authenticate? Check canAuthenticate()");
    }

    public boolean A01() {
        if (Build.VERSION.SDK_INT < 23 || !this.A07.A0C(482)) {
            return false;
        }
        C11690iB c11690iB = this.A00;
        if (c11690iB == null) {
            c11690iB = new C11690iB(new C1SW(this.A04));
            this.A00 = c11690iB;
        }
        if (c11690iB.A00() == 0) {
            KeyguardManager keyguardManager = (KeyguardManager) this.A04.getSystemService("keyguard");
            if (keyguardManager == null || !keyguardManager.isDeviceSecure()) {
                this.A05.A09("BiometricAuthPlugin/NoDeviceCredentials", String.valueOf(keyguardManager == null), false);
                return false;
            }
            return true;
        }
        return false;
    }

    @OnLifecycleEvent(C0C1.ON_CREATE)
    public void onCreate() {
        if (A01()) {
            ActivityC02330At activityC02330At = this.A04;
            this.A02 = new C11750iH(activityC02330At, C02160Ac.A05(activityC02330At), this.A06);
            C11730iF c11730iF = new C11730iF();
            c11730iF.A01 = activityC02330At.getString(this.A03);
            c11730iF.A03 = true;
            c11730iF.A02 = false;
            this.A01 = c11730iF.A00();
        }
    }
}
