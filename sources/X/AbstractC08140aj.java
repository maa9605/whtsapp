package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageView;

/* renamed from: X.0aj */
/* loaded from: classes.dex */
public abstract class AbstractC08140aj extends C0S5 implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC08140aj(Context context) {
        super(context, null);
        A00();
    }

    public AbstractC08140aj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public AbstractC08140aj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public void A00() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A0I((WaImageView) this);
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