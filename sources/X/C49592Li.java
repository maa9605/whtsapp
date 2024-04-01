package X;

import android.app.Activity;
import android.app.Application;

/* renamed from: X.2Li */
/* loaded from: classes2.dex */
public class C49592Li implements AnonymousClass005 {
    public final Activity A00;
    public final AnonymousClass005 A01;
    public final Object A02 = new Object();
    public volatile Object A03;

    public C49592Li(Activity activity) {
        this.A00 = activity;
        this.A01 = new AnonymousClass005((ActivityC02340Au) activity) { // from class: X.2Lj
            public final C06570Tx A00;
            public final Object A01 = new Object();
            public volatile C0VS A02;

            {
                this.A00 = new C06570Tx(activity.ADv(), new C0CR() { // from class: X.2Lk
                    @Override // X.C0CR
                    public C0MU A6e(Class aClass) {
                        return new C2Ll(new C0VU(((C0C5) C02180Ae.A0f(activity.getApplication(), C0C5.class)).A0H().A00));
                    }
                });
            }

            @Override // X.AnonymousClass005
            public Object generatedComponent() {
                if (this.A02 == null) {
                    synchronized (this.A01) {
                        if (this.A02 == null) {
                            this.A02 = ((C2Ll) this.A00.A00(C2Ll.class)).A00;
                        }
                    }
                }
                return this.A02;
            }
        };
    }

    @Override // X.AnonymousClass005
    public Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    Activity activity = this.A00;
                    if (!(activity.getApplication() instanceof AnonymousClass005)) {
                        if (Application.class.equals(activity.getApplication().getClass())) {
                            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
                        }
                        StringBuilder A0P = C000200d.A0P("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: ");
                        A0P.append(activity.getApplication().getClass());
                        throw new IllegalStateException(A0P.toString());
                    }
                    C0VT A00 = ((C0VS) C02180Ae.A0f(this.A01, C0VS.class)).A00();
                    if (activity != null) {
                        A00.A00 = activity;
                        this.A03 = new C0VV(A00.A01);
                    } else {
                        throw null;
                    }
                }
            }
        }
        return this.A03;
    }
}
