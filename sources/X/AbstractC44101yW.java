package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.1yW */
/* loaded from: classes2.dex */
public abstract class AbstractC44101yW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C0JM A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public AbstractC44101yW(C0JM c0jm, String str, int i, int i2, boolean z, int i3, boolean z2) {
        this.A03 = c0jm;
        this.A04 = str;
        this.A02 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A01 = i3;
        this.A06 = z2;
    }

    public Context A00() {
        if (!(this instanceof C44181ye)) {
            return ((C82573qj) this).A00;
        }
        return ((C44181ye) this).A00.getContext();
    }

    public void A01(Drawable drawable, C018508q c018508q) {
        if (this instanceof C44181ye) {
            if (c018508q != null) {
                c018508q.A02.post(new RunnableEBaseShape4S0200000_I0_4(this, drawable, 20));
                return;
            }
            throw null;
        }
        C82573qj c82573qj = (C82573qj) this;
        if (drawable != null) {
            drawable.setBounds(0, 0, c82573qj.A02, ((AbstractC44101yW) c82573qj).A00);
            C3L7 c3l7 = c82573qj.A01;
            c3l7.A01 = drawable;
            if (drawable instanceof C44121yY) {
                ((C44121yY) drawable).A03 = c3l7.A05;
            }
            RectF rectF = ((C2HG) c3l7).A03;
            c3l7.A0F(rectF, rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public boolean A02() {
        if (!(this instanceof C44181ye)) {
            return true;
        }
        C44181ye c44181ye = (C44181ye) this;
        return c44181ye.A04.equals(c44181ye.A00.getTag());
    }
}
