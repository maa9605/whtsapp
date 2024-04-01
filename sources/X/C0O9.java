package X;

import android.app.IntentService;
import android.content.Context;

/* renamed from: X.0O9 */
/* loaded from: classes.dex */
public abstract class C0O9 extends IntentService implements AnonymousClass005 {
    public C0E2 A00;
    public C002301c A01;
    public final Object A02;
    public volatile C2GL A03;

    public abstract void A02();

    public C0O9(String str) {
        super(str);
        this.A02 = new Object();
    }

    public C2GL A00() {
        return new C2GL(this);
    }

    public final C2GL A01() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = A00();
                }
            }
        }
        return this.A03;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A01 = c0c5.A0h();
        C0E2 A0L = c0c5.A0L();
        this.A00 = A0L;
        super.attachBaseContext(new C0US(context, this.A01, A0L));
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        return A01().generatedComponent();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        A02();
        super.onCreate();
    }
}
