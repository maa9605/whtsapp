package X;

import com.whatsapp.migration.android.integration.service.GoogleMigrateService;

/* renamed from: X.2H9  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2H9 extends C0IL {
    public boolean A00;

    public C2H9() {
        super("GoogleMigrateService", true);
        this.A00 = false;
    }

    @Override // X.C0IM
    public void A00() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0RY) generatedComponent()).A0C((GoogleMigrateService) this);
    }

    @Override // X.C0IL, X.C0IM, android.app.Service
    public void onCreate() {
        A00();
        super.onCreate();
    }
}
