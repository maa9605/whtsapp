package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.2VV */
/* loaded from: classes2.dex */
public abstract class C2VV extends View implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2VV(Context context) {
        super(context);
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A0W((C2VU) this);
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
