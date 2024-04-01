package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.0Ck  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC02680Ck extends WaTextView {
    public boolean A00;

    public AbstractC02680Ck(Context context) {
        super(context);
        A00();
    }

    public AbstractC02680Ck(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    @Override // X.AbstractC02690Cm
    public void A00() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((AbstractC07960aN) generatedComponent()).A0F((TextEmojiLabel) this);
    }
}
