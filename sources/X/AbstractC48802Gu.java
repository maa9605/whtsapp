package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.mediacomposer.doodle.DoodleView;

/* renamed from: X.2Gu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC48802Gu extends View implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC48802Gu(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A1s((DoodleView) this);
        }
    }

    public AbstractC48802Gu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A1s((DoodleView) this);
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
