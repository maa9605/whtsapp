package X;

import android.os.Bundle;
import com.whatsapp.biz.catalog.ShareProductLinkActivity;

/* renamed from: X.2Mt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC49842Mt extends AbstractActivityC04530Ku {
    public boolean A00 = false;

    @Override // X.AbstractActivityC04540Kv, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A1f((ShareProductLinkActivity) this);
    }

    @Override // X.AbstractActivityC04530Ku, X.AbstractActivityC04540Kv, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
