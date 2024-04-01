package X;

import android.os.Bundle;

/* renamed from: X.0Vy */
/* loaded from: classes.dex */
public abstract class AbstractActivityC06990Vy extends ActivityC02310Ar implements AnonymousClass005 {
    public volatile C49592Li A02;
    public final Object A01 = new Object();
    public boolean A00 = false;

    public void A0o() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A13((ActivityC06980Vx) this);
    }

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

    @Override // X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0o();
        super.onCreate(bundle);
    }
}
