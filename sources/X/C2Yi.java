package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.2Yi */
/* loaded from: classes2.dex */
public abstract class C2Yi extends FrameLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2Yi(Context context) {
        super(context);
        A00();
    }

    public void A00() {
        if (this instanceof AbstractC51862Yo) {
            AbstractC51862Yo abstractC51862Yo = (AbstractC51862Yo) this;
            if (abstractC51862Yo.A00) {
                return;
            }
            abstractC51862Yo.A00 = true;
            ((AbstractC07960aN) abstractC51862Yo.generatedComponent()).A2X((C2Yn) abstractC51862Yo);
        } else if (!(this instanceof AbstractC51852Ym)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A2U((AbstractC51832Yh) this);
        } else {
            AbstractC51852Ym abstractC51852Ym = (AbstractC51852Ym) this;
            if (abstractC51852Ym.A00) {
                return;
            }
            abstractC51852Ym.A00 = true;
            ((AbstractC07960aN) abstractC51852Ym.generatedComponent()).A2W((C51842Yl) abstractC51852Ym);
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
