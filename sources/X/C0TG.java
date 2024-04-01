package X;

import com.whatsapp.data.ConversationDeleteService;

/* renamed from: X.0TG  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0TG extends C0O9 {
    public boolean A00;

    public C0TG(String str) {
        super(str);
        this.A00 = false;
    }

    @Override // X.C0O9
    public void A02() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0RY) generatedComponent()).A06((ConversationDeleteService) this);
    }

    @Override // X.C0O9, android.app.IntentService, android.app.Service
    public void onCreate() {
        A02();
        super.onCreate();
    }
}
