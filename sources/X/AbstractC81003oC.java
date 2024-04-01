package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.3oC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81003oC extends LinearLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC81003oC(Context context) {
        super(context);
        A00();
    }

    public void A00() {
        if (this instanceof C3MH) {
            C3MH c3mh = (C3MH) this;
            if (c3mh.A00) {
                return;
            }
            c3mh.A00 = true;
            c3mh.generatedComponent();
        } else if (this instanceof C3NZ) {
            C3NZ c3nz = (C3NZ) this;
            if (c3nz.A00) {
                return;
            }
            c3nz.A00 = true;
            c3nz.generatedComponent();
        } else if (this instanceof C69073Na) {
            C69073Na c69073Na = (C69073Na) this;
            if (c69073Na.A00) {
                return;
            }
            c69073Na.A00 = true;
            c69073Na.generatedComponent();
        } else if (this instanceof C41U) {
            C41U c41u = (C41U) this;
            if (!(c41u instanceof AbstractC62002xB)) {
                if (c41u.A00) {
                    return;
                }
                c41u.A00 = true;
                c41u.generatedComponent();
                return;
            }
            AbstractC62002xB abstractC62002xB = (AbstractC62002xB) c41u;
            if (abstractC62002xB.A00) {
                return;
            }
            abstractC62002xB.A00 = true;
            abstractC62002xB.generatedComponent();
        } else if (this instanceof C3MG) {
            C3MG c3mg = (C3MG) this;
            if (c3mg.A01) {
                return;
            }
            c3mg.A01 = true;
            c3mg.generatedComponent();
        } else if (this instanceof C69083Nb) {
            C69083Nb c69083Nb = (C69083Nb) this;
            if (c69083Nb.A01) {
                return;
            }
            c69083Nb.A01 = true;
            c69083Nb.generatedComponent();
        } else if (this instanceof AbstractC69093Nc) {
            AbstractC69093Nc abstractC69093Nc = (AbstractC69093Nc) this;
            if (abstractC69093Nc.A00) {
                return;
            }
            abstractC69093Nc.A00 = true;
            abstractC69093Nc.generatedComponent();
        } else if (this instanceof AbstractC69103Nd) {
            AbstractC69103Nd abstractC69103Nd = (AbstractC69103Nd) this;
            if (abstractC69103Nd.A00) {
                return;
            }
            abstractC69103Nd.A00 = true;
            abstractC69103Nd.generatedComponent();
        } else if (!(this instanceof AbstractC69113Ne)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            generatedComponent();
        } else {
            AbstractC69113Ne abstractC69113Ne = (AbstractC69113Ne) this;
            if (abstractC69113Ne.A00) {
                return;
            }
            abstractC69113Ne.A00 = true;
            abstractC69113Ne.generatedComponent();
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
