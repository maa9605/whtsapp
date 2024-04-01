package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.1Ta */
/* loaded from: classes.dex */
public abstract class AbstractC28651Ta extends C1SA implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC28651Ta(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public AbstractC28651Ta(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public void A00() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        generatedComponent();
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
