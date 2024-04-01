package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.35h */
/* loaded from: classes2.dex */
public abstract class AbstractC649435h extends ViewPager implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC649435h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0O();
    }

    public void A0O() {
        if (this instanceof AbstractC86893yh) {
            AbstractC86893yh abstractC86893yh = (AbstractC86893yh) this;
            if (abstractC86893yh.A00) {
                return;
            }
            abstractC86893yh.A00 = true;
            abstractC86893yh.generatedComponent();
        } else if (!(this instanceof C3LO)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            generatedComponent();
        } else {
            C3LO c3lo = (C3LO) this;
            if (c3lo.A00) {
                return;
            }
            c3lo.A00 = true;
            c3lo.generatedComponent();
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
