package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.whatsapp.biz.profile.ParallaxImageLayout;

/* renamed from: X.2VR  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2VR extends RelativeLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2VR(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (!this.A01) {
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A0T((ParallaxImageLayout) this);
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