package X;

import android.os.Bundle;
import com.whatsapp.BusinessAppEducation;

/* renamed from: X.0Vl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC06880Vl extends ActivityC06890Vm {
    public boolean A00 = false;

    @Override // X.AbstractActivityC06900Vn, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A0v((BusinessAppEducation) this);
    }

    @Override // X.AbstractActivityC06900Vn, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}