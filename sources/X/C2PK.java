package X;

import android.os.Bundle;
import com.whatsapp.settings.SettingsJidNotificationActivity;

/* renamed from: X.2PK  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2PK extends C0WC {
    public boolean A00 = false;

    @Override // X.C0WD, X.AbstractActivityC06990Vy
    public void A0o() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A4E((SettingsJidNotificationActivity) this);
    }

    @Override // X.C0WC, X.C0WD, X.ActivityC06980Vx, X.AbstractActivityC06990Vy, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0o();
        super.onCreate(bundle);
    }
}
