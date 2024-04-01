package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.0be */
/* loaded from: classes.dex */
public abstract class AbstractC08530be extends LinearLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC08530be(Context context) {
        super(context);
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
