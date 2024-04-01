package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;

/* renamed from: X.4KY  reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C4KY extends C4KK {
    public boolean A00 = false;

    @Override // X.C4K4, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A2m((BrazilFbPayHubActivity) this);
    }

    @Override // X.C4KK, X.C4K4, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
