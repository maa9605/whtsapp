package X;

import com.whatsapp.service.MDSyncService;

/* renamed from: X.1zh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC44811zh extends C0IL {
    public boolean A00;

    public AbstractServiceC44811zh() {
        super("md-sync-service", true);
        this.A00 = false;
    }

    @Override // X.C0IM
    public void A00() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0RY) generatedComponent()).A0M((MDSyncService) this);
    }

    @Override // X.C0IL, X.C0IM, android.app.Service
    public void onCreate() {
        A00();
        super.onCreate();
    }
}
