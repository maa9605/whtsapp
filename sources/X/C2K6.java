package X;

import android.content.Context;

/* renamed from: X.2K6  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2K6 extends C06390Sx implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2K6(Context context, C18350tb c18350tb) {
        super(context, c18350tb);
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A1m((C2K5) this);
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
