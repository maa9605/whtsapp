package X;

import com.whatsapp.voipcalling.VoiceFGService;

/* renamed from: X.2U9  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2U9 extends C0IL {
    public boolean A00;

    public C2U9() {
        super("voicefgservice", true);
        this.A00 = false;
    }

    @Override // X.C0IM
    public void A00() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0RY) generatedComponent()).A0S((VoiceFGService) this);
    }

    @Override // X.C0IL, X.C0IM, android.app.Service
    public void onCreate() {
        A00();
        super.onCreate();
    }
}
