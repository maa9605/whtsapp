package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.1ix  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC35321ix extends View implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC35321ix(Context context) {
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
