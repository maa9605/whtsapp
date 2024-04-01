package X;

import android.os.Bundle;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.backup.google.RequestPermissionRegistrationActivity;

/* renamed from: X.2Mj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC49782Mj extends RequestPermissionActivity {
    public boolean A00 = false;

    @Override // X.C0ME
    public void A0o() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A1Y((RequestPermissionRegistrationActivity) this);
    }

    @Override // com.whatsapp.RequestPermissionActivity, X.C0ME, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0o();
        super.onCreate(bundle);
    }
}
