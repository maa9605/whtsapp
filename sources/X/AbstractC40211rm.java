package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.biz.BusinessProfileFieldView;

/* renamed from: X.1rm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC40211rm extends LinearLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC40211rm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A0O((BusinessProfileFieldView) this);
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
