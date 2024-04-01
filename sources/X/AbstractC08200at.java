package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.0at  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08200at extends FrameLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC08200at(Context context) {
        super(context, null, 0);
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A07((C08190as) this);
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
