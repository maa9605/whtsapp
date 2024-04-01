package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.components.SegmentedProgressBar;

/* renamed from: X.2Vl */
/* loaded from: classes2.dex */
public abstract class AbstractC51252Vl extends View implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC51252Vl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A0e((SegmentedProgressBar) this);
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
