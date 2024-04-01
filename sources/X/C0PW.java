package X;

import com.whatsapp.notification.AndroidWear;

/* renamed from: X.0PW  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0PW extends C0O9 {
    public boolean A00;

    public C0PW() {
        super("AndroidWear");
        this.A00 = false;
    }

    @Override // X.C0O9
    public void A02() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0RY) generatedComponent()).A0D((AndroidWear) this);
    }

    @Override // X.C0O9, android.app.IntentService, android.app.Service
    public void onCreate() {
        A02();
        super.onCreate();
    }
}
