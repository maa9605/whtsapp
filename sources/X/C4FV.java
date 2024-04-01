package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.payments.ui.widget.PeerPaymentTransactionRow;

/* renamed from: X.4FV  reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C4FV extends LinearLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C4FV(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A2G((PeerPaymentTransactionRow) this);
        }
    }

    public C4FV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A2G((PeerPaymentTransactionRow) this);
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
