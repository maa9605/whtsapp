package X;

/* renamed from: X.0IM */
/* loaded from: classes.dex */
public abstract class C0IM extends C0IN implements AnonymousClass005 {
    public volatile C2GL A02;
    public final Object A01 = new Object();
    public boolean A00 = false;

    public void A00() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0RY) generatedComponent()).A0O((C0IL) this);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C2GL(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    @Override // android.app.Service
    public void onCreate() {
        A00();
        super.onCreate();
    }
}
