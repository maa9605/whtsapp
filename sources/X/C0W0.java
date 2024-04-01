package X;

import android.os.Bundle;
import com.whatsapp.DocumentPickerActivity;

/* renamed from: X.0W0  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0W0 extends ActivityC02250Al {
    public boolean A00 = false;

    @Override // X.AbstractActivityC02260Am, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A14((DocumentPickerActivity) this);
    }

    @Override // X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
