package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.conversation.conversationrow.WebPagePreviewView;

/* renamed from: X.2XV  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2XV extends FrameLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2XV(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A1a((WebPagePreviewView) this);
        }
    }

    public C2XV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A1a((WebPagePreviewView) this);
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