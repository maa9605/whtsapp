package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;

/* renamed from: X.4Kb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC92374Kb extends C4KP {
    public boolean A00 = false;

    @Override // X.C4K9, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A2x((IndiaUpiBankAccountDetailsActivity) this);
    }

    @Override // X.C4KP, X.C4K9, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
