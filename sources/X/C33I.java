package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.33I */
/* loaded from: classes2.dex */
public abstract class C33I extends FrameLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C33I(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
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
