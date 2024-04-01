package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.2KP */
/* loaded from: classes2.dex */
public abstract class C2KP extends C0S5 implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2KP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!(this instanceof C2KN)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            generatedComponent();
            return;
        }
        C2KN c2kn = (C2KN) this;
        if (c2kn.A00) {
            return;
        }
        c2kn.A00 = true;
        c2kn.generatedComponent();
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
