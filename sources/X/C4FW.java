package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.4FW  reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C4FW extends C4AC implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C4FW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = true;
        generatedComponent();
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