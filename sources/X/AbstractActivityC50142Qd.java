package X;

import android.os.Bundle;
import com.whatsapp.voipcalling.VoipPermissionsActivity;

/* renamed from: X.2Qd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC50142Qd extends ActivityC02320As implements AnonymousClass005 {
    public volatile C49592Li A02;
    public final Object A01 = new Object();
    public boolean A00 = false;

    @Override // X.ActivityC02340Au, X.C0B1
    public C0CR A9l() {
        return AnonymousClass029.A0E(this);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C49592Li(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!this.A00) {
            this.A00 = true;
            ((C0CQ) generatedComponent()).A4y((VoipPermissionsActivity) this);
        }
        super.onCreate(bundle);
    }
}
