package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.Group;

/* renamed from: X.1V4  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1V4 extends Group implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C1V4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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
