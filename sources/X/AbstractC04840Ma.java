package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaEditText;

/* renamed from: X.0Ma */
/* loaded from: classes.dex */
public abstract class AbstractC04840Ma extends C04850Mb implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC04840Ma(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A0G((WaEditText) this);
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
