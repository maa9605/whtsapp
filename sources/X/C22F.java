package X;

import com.whatsapp.service.GcmFGService;

/* renamed from: X.22F  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C22F extends C0IL {
    public boolean A00;

    public C22F() {
        super("gcmfgservice", false);
        this.A00 = false;
    }

    @Override // X.C0IM
    public void A00() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0RY) generatedComponent()).A0L((GcmFGService) this);
    }

    @Override // X.C0IL, X.C0IM, android.app.Service
    public void onCreate() {
        A00();
        super.onCreate();
    }
}
