package X;

import android.os.Bundle;
import com.whatsapp.authentication.AppAuthenticationActivity;

/* renamed from: X.0Tu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC06540Tu extends ActivityC02290Ap {
    public boolean A00 = false;

    @Override // X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A1V((AppAuthenticationActivity) this);
    }

    @Override // X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
