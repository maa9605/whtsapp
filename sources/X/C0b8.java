package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.authentication.FingerprintView;

/* renamed from: X.0b8  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0b8 extends LinearLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C0b8(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A0L((FingerprintView) this);
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
