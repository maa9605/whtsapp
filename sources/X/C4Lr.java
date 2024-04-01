package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;

/* renamed from: X.4Lr  reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C4Lr extends AbstractActivityC92484Li {
    public boolean A00 = false;

    @Override // X.C4LI, X.AbstractActivityC92384Kc, X.C4K0, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A3M((IndiaUpiResetPinActivity) this);
    }

    @Override // X.AbstractActivityC92484Li, X.C4LI, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
