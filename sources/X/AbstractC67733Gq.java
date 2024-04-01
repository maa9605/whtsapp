package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: X.3Gq */
/* loaded from: classes2.dex */
public abstract class AbstractC67733Gq extends RelativeLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC67733Gq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!(this instanceof C3LY)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            generatedComponent();
            return;
        }
        C3LY c3ly = (C3LY) this;
        if (c3ly.A00) {
            return;
        }
        c3ly.A00 = true;
        c3ly.generatedComponent();
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
