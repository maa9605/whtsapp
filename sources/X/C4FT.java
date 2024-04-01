package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow;

/* renamed from: X.4FT  reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C4FT extends LinearLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C4FT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A2D((PaymentInteropShimmerRow) this);
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
