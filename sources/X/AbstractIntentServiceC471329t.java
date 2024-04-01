package X;

import com.whatsapp.backup.google.GoogleBackupService;

/* renamed from: X.29t  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractIntentServiceC471329t extends C0O9 {
    public boolean A00;

    public AbstractIntentServiceC471329t(String str) {
        super(str);
        this.A00 = false;
    }

    @Override // X.C0O9
    public void A02() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0RY) generatedComponent()).A04((GoogleBackupService) this);
    }

    @Override // X.C0O9, android.app.IntentService, android.app.Service
    public void onCreate() {
        A02();
        super.onCreate();
    }
}
