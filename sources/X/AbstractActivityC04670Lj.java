package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.0Lj */
/* loaded from: classes.dex */
public abstract class AbstractActivityC04670Lj extends AbstractActivityC04680Lk {
    public C2KU A00;

    public abstract int A1R();

    public void A1S() {
    }

    public final void A1T() {
        C001800u c001800u = this.A00.A01;
        c001800u.A03.AGI(c001800u.A01.A00, (short) 3);
    }

    @Override // X.ActivityC02310Ar, X.ActivityC02320As, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        C03050Dy A0G = ((C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class)).A0G();
        String simpleName = getClass().getSimpleName();
        C004301z c004301z = new C004301z(A1R());
        C02950Dn c02950Dn = A0G.A00;
        if (c02950Dn != null) {
            this.A00 = new C2KU(new C35161ih(c02950Dn), simpleName, c004301z);
            super.attachBaseContext(context);
            return;
        }
        throw null;
    }

    @Override // X.AbstractActivityC04680Lk, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!getIntent().getBooleanExtra("key_perf_tracked", false)) {
            getIntent().getLongExtra("perf_start_time_ns", -1L);
            getIntent().getStringExtra("perf_origin");
            C2KU c2ku = this.A00;
            View decorView = getWindow().getDecorView();
            InterfaceC70393Sc interfaceC70393Sc = new InterfaceC70393Sc() { // from class: X.1hi
                {
                    AbstractActivityC04670Lj.this = this;
                }

                @Override // X.InterfaceC70393Sc
                public final boolean AH1() {
                    AbstractActivityC04670Lj.this.A1S();
                    return true;
                }
            };
            if (c2ku != null) {
                C70383Sb c70383Sb = new C70383Sb(decorView);
                c2ku.A00 = c70383Sb;
                C78613kE c78613kE = new C78613kE(interfaceC70393Sc);
                C000700j.A01();
                C000700j.A01();
                if (c70383Sb.A01) {
                    c78613kE.A00();
                } else {
                    c70383Sb.A03.add(c78613kE);
                }
            } else {
                throw null;
            }
        }
        super.onCreate(bundle);
    }
}
