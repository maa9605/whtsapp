package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.whatsapp.KeyboardPopupLayout;

/* renamed from: X.0az  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08230az extends RelativeLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC08230az(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A0C((KeyboardPopupLayout) this);
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
