package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.2If  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC49052If extends Toolbar implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC49052If(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0J();
    }

    public void A0J() {
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
