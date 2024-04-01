package com.whatsapp.payments.ui;

import X.AbstractActivityC92364Ka;
import X.C013606n;
import X.C0N2;
import X.C46Z;
import X.C49I;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class BrazilPaymentSettingsActivity extends AbstractActivityC92364Ka {
    public C46Z A00;
    public C013606n A01;
    public C49I A02;

    @Override // X.C4EB
    public String ABJ(C0N2 c0n2) {
        return null;
    }

    @Override // X.C49V
    public String ABM(C0N2 c0n2) {
        return null;
    }

    @Override // X.InterfaceC899549c
    public void AGy(boolean z) {
    }

    @Override // X.InterfaceC899549c
    public void AMp(C0N2 c0n2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
        if (((java.util.AbstractCollection) r0.A08.A0B()).isEmpty() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A1V() {
        /*
            r3 = this;
            X.0EU r0 = r3.A0K
            android.content.SharedPreferences r2 = r0.A04()
            java.lang.String r0 = "payment_brazil_nux_dismissed"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L2c
            X.49I r0 = r3.A02
            X.499 r0 = r0.A04
            boolean r0 = r0.A04()
            if (r0 == 0) goto L2d
            X.0DV r0 = r3.A0P
            r0.A04()
            X.06l r0 = r0.A08
            java.util.List r0 = r0.A0B()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L2c:
            return r1
        L2d:
            X.49I r0 = r3.A02
            X.499 r0 = r0.A04
            boolean r0 = r0.A04()
            if (r0 == 0) goto L39
            r0 = 2
            return r0
        L39:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentSettingsActivity.A1V():int");
    }

    @Override // X.C4KQ, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2 && i2 == -1) {
            startActivity(new Intent(this, BrazilFbPayHubActivity.class));
        }
    }

    @Override // X.AbstractActivityC92364Ka, X.C4KQ, X.C4KA, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C46Z c46z = this.A00;
        if (c46z.A07 != null) {
            if (!c46z.A03() || !c46z.A09()) {
                c46z.A08("payment_settings", true, null);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.C4KQ, X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A00 == null) {
            throw null;
        }
    }
}
