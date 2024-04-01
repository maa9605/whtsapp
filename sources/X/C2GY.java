package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.2GY */
/* loaded from: classes2.dex */
public abstract class C2GY extends C0S5 implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2GY(Context context) {
        super(context, null);
        A00();
    }

    public C2GY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!(this instanceof AbstractC68733Lh)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            generatedComponent();
            return;
        }
        AbstractC68733Lh abstractC68733Lh = (AbstractC68733Lh) this;
        if (abstractC68733Lh.A00) {
            return;
        }
        abstractC68733Lh.A00 = true;
        abstractC68733Lh.generatedComponent();
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
