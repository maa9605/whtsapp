package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.2bY */
/* loaded from: classes2.dex */
public class C52912bY implements AnonymousClass005 {
    public final C0BA A00;
    public final Object A01 = new Object();
    public volatile Object A02;

    public C52912bY(C0BA fragment) {
        this.A00 = fragment;
    }

    public static final Context A00(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // X.AnonymousClass005
    public Object generatedComponent() {
        ActivityC02330At activityC02330At;
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    C0BA c0ba = this.A00;
                    C0UG c0ug = c0ba.A0F;
                    if (c0ug != null) {
                        activityC02330At = ((C0UF) c0ug).A00;
                    } else {
                        activityC02330At = null;
                    }
                    if (activityC02330At != null) {
                        AnonymousClass029.A1J(activityC02330At instanceof AnonymousClass005, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", activityC02330At.getClass());
                        C0UG c0ug2 = c0ba.A0F;
                        C06820Vd A0p = ((C0CQ) C02180Ae.A0f(c0ug2 == null ? null : ((C0UF) c0ug2).A00, C0CQ.class)).A0p();
                        if (c0ba != null) {
                            A0p.A00 = c0ba;
                            this.A02 = new C09420dF(A0p.A01);
                        } else {
                            throw null;
                        }
                    } else {
                        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
                    }
                }
            }
        }
        return this.A02;
    }
}
