package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarViewLegacy;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarViewWave1;

/* renamed from: X.2Gp */
/* loaded from: classes2.dex */
public abstract class AbstractC48772Gp extends RelativeLayout implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC48772Gp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        A00();
    }

    public void A00() {
        if (this instanceof C2Y5) {
            C2Y5 c2y5 = (C2Y5) this;
            if (c2y5.A00) {
                return;
            }
            c2y5.A00 = true;
            ((AbstractC07960aN) c2y5.generatedComponent()).A1x((TitleBarViewWave1) c2y5);
        } else if (!(this instanceof C2Y3)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            ((AbstractC07960aN) generatedComponent()).A1v((AbstractC48762Go) this);
        } else {
            C2Y3 c2y3 = (C2Y3) this;
            if (c2y3.A00) {
                return;
            }
            c2y3.A00 = true;
            ((AbstractC07960aN) c2y3.generatedComponent()).A1w((TitleBarViewLegacy) c2y3);
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
