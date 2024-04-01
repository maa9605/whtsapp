package X;

import android.os.Bundle;
import com.whatsapp.registration.NotifyContactsSelector;

/* renamed from: X.2P0  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2P0 extends AbstractActivityC40691si {
    public boolean A00 = false;

    @Override // X.AbstractActivityC40701sj, X.AbstractActivityC02260Am, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A3x((NotifyContactsSelector) this);
    }

    @Override // X.AbstractActivityC40691si, X.AbstractActivityC40701sj, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
