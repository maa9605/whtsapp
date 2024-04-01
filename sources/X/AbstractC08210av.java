package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.whatsapp.EmptyTellAFriendView;

/* renamed from: X.0av  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08210av extends ScrollView implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC08210av(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A08((EmptyTellAFriendView) this);
        }
    }

    public AbstractC08210av(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A08((EmptyTellAFriendView) this);
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
