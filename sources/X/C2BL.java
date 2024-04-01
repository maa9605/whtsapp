package X;

import com.whatsapp.media.transcode.MediaTranscodeService;

/* renamed from: X.2BL  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2BL extends C0IN implements AnonymousClass005 {
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

    @Override // android.app.Service
    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            ((C0RY) generatedComponent()).A0A((MediaTranscodeService) this);
        }
        super.onCreate();
    }
}
