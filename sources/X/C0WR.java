package X;

import android.os.Bundle;
import com.whatsapp.accountsync.LoginActivity;

/* renamed from: X.0WR  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0WR extends C0WS {
    public boolean A00 = false;

    @Override // X.C0WT
    public void A0o() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A1S((LoginActivity) this);
    }

    @Override // X.C0WS, X.C0WT, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0o();
        super.onCreate(bundle);
    }
}
