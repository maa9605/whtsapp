package X;

import android.os.Bundle;
import com.whatsapp.settings.SettingsChat;

/* renamed from: X.26D  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C26D extends C26E {
    public boolean A00 = false;

    @Override // X.C26F, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A4A((SettingsChat) this);
    }

    @Override // X.C26F, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}