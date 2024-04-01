package X;

import android.content.Context;

/* renamed from: X.2Xl */
/* loaded from: classes2.dex */
public abstract class AbstractC51692Xl extends C0S5 implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC51692Xl(Context context) {
        super(context, null);
        A00();
    }

    public void A00() {
        if (this instanceof AbstractC51712Xn) {
            AbstractC51712Xn abstractC51712Xn = (AbstractC51712Xn) this;
            if (abstractC51712Xn.A00) {
                return;
            }
            abstractC51712Xn.A00 = true;
            ((AbstractC07960aN) abstractC51712Xn.generatedComponent()).A1j((C51702Xm) abstractC51712Xn);
        } else if (!(this instanceof AbstractC51672Xj)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A1i((C51682Xk) this);
        } else {
            AbstractC51672Xj abstractC51672Xj = (AbstractC51672Xj) this;
            if (!(abstractC51672Xj instanceof AbstractC51762Xv)) {
                if (abstractC51672Xj.A00) {
                    return;
                }
                abstractC51672Xj.A00 = true;
                ((AbstractC07960aN) abstractC51672Xj.generatedComponent()).A1h((C51662Xi) abstractC51672Xj);
                return;
            }
            AbstractC51762Xv abstractC51762Xv = (AbstractC51762Xv) abstractC51672Xj;
            if (abstractC51762Xv.A00) {
                return;
            }
            abstractC51762Xv.A00 = true;
            ((AbstractC07960aN) abstractC51762Xv.generatedComponent()).A1o((C2Xu) abstractC51762Xv);
        }
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
