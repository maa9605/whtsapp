package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.mediacomposer.doodle.ColorPickerView;

/* renamed from: X.2Xx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC51772Xx extends View implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC51772Xx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A1q((ColorPickerView) this);
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