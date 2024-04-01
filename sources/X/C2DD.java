package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.2DD  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2DD {
    public C81713pL A00;
    public final int A01;
    public final C2EQ A02;
    public final C81773pR A03;
    public final C2DE A04;
    public final C47252Am A05;

    public C2DD(C47252Am c47252Am, C2EQ c2eq, int i, boolean z) {
        this.A05 = c47252Am;
        this.A02 = c2eq;
        this.A01 = i;
        boolean z2 = true;
        boolean z3 = !new ArrayList(c47252Am.A03.values()).isEmpty();
        this.A04 = new C2DE(z3, (z || !z3) ? false : false);
        this.A03 = new C81773pR(this);
    }

    public final void A00() {
        C81713pL c81713pL = this.A00;
        if (c81713pL != null) {
            C2DE c2de = this.A04;
            C54042hx c54042hx = c81713pL.A00;
            View view = c54042hx.A01;
            if (view != null) {
                boolean z = c2de.A00;
                if (z != (view.getVisibility() == 0)) {
                    c54042hx.A00(z, c2de.A01);
                }
            }
        }
    }

    public void A01(int i) {
        int i2 = this.A01;
        int i3 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new UnsupportedOperationException(C000200d.A0D("No Constant for Navigation Action: ", i));
            }
            i3 = 3;
        } else if (i2 != 0) {
            i3 = 4;
        }
        C48242Em c48242Em = this.A02.A00;
        if (c48242Em != null) {
            c48242Em.A00 = i3;
        }
    }
}
