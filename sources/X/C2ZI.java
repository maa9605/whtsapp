package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;
import com.whatsapp.text.CondensedTextView;

/* renamed from: X.2ZI */
/* loaded from: classes2.dex */
public abstract class C2ZI extends WaTextView {
    public boolean A00;

    public C2ZI(Context context, int i) {
        super(context, null, i);
        A00();
    }

    public C2ZI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    @Override // X.AbstractC02690Cm
    public void A00() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((AbstractC07960aN) generatedComponent()).A2m((CondensedTextView) this);
    }
}
