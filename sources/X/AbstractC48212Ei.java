package X;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: X.2Ei */
/* loaded from: classes2.dex */
public abstract class AbstractC48212Ei extends ViewGroup implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC48212Ei(Context context) {
        super(context);
        A01();
    }

    public void A01() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A0o((AbstractC48202Eh) this);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A00;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A00 = c2ub;
        }
        return c2ub.generatedComponent();
    }
}
