package X;

import android.app.Service;
import android.content.Context;

/* renamed from: X.0IN  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0IN extends Service {
    public C0E2 A00;
    public C002301c A01;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A01 = c0c5.A0h();
        C0E2 A0L = c0c5.A0L();
        this.A00 = A0L;
        super.attachBaseContext(new C0US(context, this.A01, A0L));
    }
}
