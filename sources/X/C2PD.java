package X;

import android.os.Bundle;
import com.whatsapp.settings.SettingsChatHistory;

/* renamed from: X.2PD  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2PD extends ActivityC06980Vx {
    public boolean A00 = false;

    @Override // X.AbstractActivityC06990Vy
    public void A0o() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A4B((SettingsChatHistory) this);
    }

    @Override // X.ActivityC06980Vx, X.AbstractActivityC06990Vy, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0o();
        super.onCreate(bundle);
    }
}
