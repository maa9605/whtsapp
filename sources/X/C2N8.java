package X;

import android.os.Bundle;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;

/* renamed from: X.2N8  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2N8 extends C2N4 {
    public boolean A00 = false;

    @Override // X.C2N5, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A1l((ProductDetailActivity) this);
    }

    @Override // X.C2N4, X.C2N5, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
