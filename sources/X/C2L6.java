package X;

import android.content.Context;
import android.view.TextureView;

/* renamed from: X.2L6  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2L6 extends TextureView implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2L6(Context context) {
        super(context, null, 0);
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A0U((C2L5) this);
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
