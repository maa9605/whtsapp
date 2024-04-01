package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;

/* renamed from: X.4Ke  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC92404Ke extends C4KQ {
    public boolean A00 = false;

    @Override // X.C4KA, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A3F((IndiaUpiPaymentSettingsActivity) this);
    }

    @Override // X.C4KQ, X.C4KA, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
