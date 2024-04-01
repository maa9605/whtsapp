package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.IndiaUpiBankAccountLinkingRetryActivity;

/* renamed from: X.4L5  reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C4L5 extends AbstractActivityC92444Kp {
    public boolean A00 = false;

    @Override // X.AbstractActivityC92384Kc, X.C4K0, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A2z((IndiaUpiBankAccountLinkingRetryActivity) this);
    }

    @Override // X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
