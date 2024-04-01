package X;

import com.whatsapp.service.WebClientService;

/* renamed from: X.1wn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC43061wn extends C0IL {
    public boolean A00;

    public AbstractServiceC43061wn() {
        super("webclientservice", true);
        this.A00 = false;
    }

    @Override // X.C0IM
    public void A00() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0RY) generatedComponent()).A0P((WebClientService) this);
    }

    @Override // X.C0IL, X.C0IM, android.app.Service
    public void onCreate() {
        A00();
        super.onCreate();
    }
}
