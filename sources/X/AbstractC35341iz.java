package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: X.1iz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC35341iz extends LinearLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC35341iz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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