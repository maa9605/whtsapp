package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.1nl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38231nl extends C28351Rl {
    public C05I A00;
    public C07270Xo A01;

    public C38231nl(C38231nl c38231nl, C38241nm c38241nm, Resources resources) {
        super(c38231nl, c38241nm, resources);
        if (c38231nl != null) {
            this.A00 = c38231nl.A00;
            this.A01 = c38231nl.A01;
            return;
        }
        this.A00 = new C05I();
        this.A01 = new C07270Xo(10);
    }

    @Override // X.C28351Rl, X.AbstractC10670gS
    public void A04() {
        this.A00 = this.A00.clone();
        this.A01 = this.A01.clone();
    }

    public int A07(int[] iArr) {
        int A06 = super.A06(iArr);
        return A06 >= 0 ? A06 : super.A06(StateSet.WILD_CARD);
    }

    @Override // X.C28351Rl, android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new C38241nm(this, null);
    }

    @Override // X.C28351Rl, android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C38241nm(this, resources);
    }
}
