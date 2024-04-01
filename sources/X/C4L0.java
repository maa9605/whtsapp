package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;

/* renamed from: X.4L0  reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C4L0 extends C4Kv {
    public boolean A00 = false;

    @Override // X.C4Ki, X.C4K9, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A2q((BrazilPaymentCardDetailsActivity) this);
    }

    @Override // X.C4Kv, X.C4Ki, X.C4KP, X.C4K9, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
