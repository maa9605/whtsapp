package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.2YU */
/* loaded from: classes2.dex */
public abstract class C2YU extends LinearLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2YU(Context context) {
        super(context);
        A00();
    }

    public void A00() {
        if (this instanceof AbstractC51812Yc) {
            AbstractC51812Yc abstractC51812Yc = (AbstractC51812Yc) this;
            if (abstractC51812Yc.A00) {
                return;
            }
            abstractC51812Yc.A00 = true;
            ((AbstractC07960aN) abstractC51812Yc.generatedComponent()).A2Q((C51802Yb) abstractC51812Yc);
        } else if (!(this instanceof C2YS)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A2T((C2YT) this);
        } else {
            C2YS c2ys = (C2YS) this;
            if (c2ys.A00) {
                return;
            }
            c2ys.A00 = true;
            ((AbstractC07960aN) c2ys.generatedComponent()).A2N((C2YR) c2ys);
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
