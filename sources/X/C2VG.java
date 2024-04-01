package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.biz.catalog.CatalogHeader;

/* renamed from: X.2VG */
/* loaded from: classes2.dex */
public abstract class C2VG extends FrameLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2VG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public void A00() {
        if (this instanceof C41W) {
            C41W c41w = (C41W) this;
            if (c41w.A00) {
                return;
            }
            c41w.A00 = true;
            c41w.generatedComponent();
        } else if (this instanceof C51902Yt) {
            C51902Yt c51902Yt = (C51902Yt) this;
            if (c51902Yt.A00) {
                return;
            }
            c51902Yt.A00 = true;
            ((AbstractC07960aN) c51902Yt.generatedComponent()).A2Z(c51902Yt);
        } else if (this instanceof AbstractC51922Yv) {
            AbstractC51922Yv abstractC51922Yv = (AbstractC51922Yv) this;
            if (abstractC51922Yv.A00) {
                return;
            }
            abstractC51922Yv.A00 = true;
            ((AbstractC07960aN) abstractC51922Yv.generatedComponent()).A2a((C51912Yu) abstractC51922Yv);
        } else if (this instanceof AbstractC51872Yq) {
            AbstractC51872Yq abstractC51872Yq = (AbstractC51872Yq) this;
            if (abstractC51872Yq.A00) {
                return;
            }
            abstractC51872Yq.A00 = true;
            ((AbstractC07960aN) abstractC51872Yq.generatedComponent()).A2Y((C2Yp) abstractC51872Yq);
        } else if (!(this instanceof C2VE)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            generatedComponent();
        } else {
            C2VE c2ve = (C2VE) this;
            if (c2ve.A00) {
                return;
            }
            c2ve.A00 = true;
            ((AbstractC07960aN) c2ve.generatedComponent()).A0Q((CatalogHeader) c2ve);
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
