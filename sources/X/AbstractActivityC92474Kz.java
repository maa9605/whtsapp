package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;

/* renamed from: X.4Kz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC92474Kz extends C4Ku {
    public boolean A00 = false;

    @Override // X.C4Kh, X.C47U, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A2o((BrazilPayBloksActivity) this);
    }

    @Override // X.C4Ku, X.C4Kh, X.C47V, X.C47U, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
