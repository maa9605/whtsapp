package X;

import com.whatsapp.perf.ProfiloUploadService;

/* renamed from: X.1ML  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1ML extends C0NZ implements AnonymousClass005 {
    public volatile C2GL A02;
    public final Object A01 = new Object();
    public boolean A00 = false;

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

    @Override // X.AbstractServiceC05030Na, android.app.Service
    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            ((C0RY) generatedComponent()).A0F((ProfiloUploadService) this);
        }
        super.onCreate();
    }
}
