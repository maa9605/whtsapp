package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: X.0Ar */
/* loaded from: classes.dex */
public class ActivityC02310Ar extends ActivityC02320As {
    public C0E2 A00;
    public C002301c A01;
    public C01V A02;
    public InterfaceC004201y A03;

    @Override // X.ActivityC02320As, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context);
        this.A01 = c0c5.A0h();
        this.A00 = c0c5.A0L();
        this.A02 = c0c5.A1Q();
        this.A03 = c0c5.A1U();
        super.attachBaseContext(new C0US(context, this.A01, this.A00));
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.A01.A0J();
        super.onConfigurationChanged(configuration);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.A01.A0J();
        super.onCreate(bundle);
    }
}
