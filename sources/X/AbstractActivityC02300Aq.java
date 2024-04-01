package X;

import android.os.Bundle;

/* renamed from: X.0Aq */
/* loaded from: classes.dex */
public abstract class AbstractActivityC02300Aq extends ActivityC02310Ar implements AnonymousClass005 {
    public volatile C49592Li A02;
    public final Object A01 = new Object();
    public boolean A00 = false;

    public C49592Li A0o() {
        return new C49592Li(this);
    }

    /* renamed from: A0p */
    public final C49592Li A0r() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = A0o();
                }
            }
        }
        return this.A02;
    }

    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A12((ActivityC02290Ap) this);
    }

    @Override // X.ActivityC02340Au, X.C0B1
    public C0CR A9l() {
        return AnonymousClass029.A0E(this);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        return A0r().generatedComponent();
    }

    @Override // X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
