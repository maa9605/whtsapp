package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.1Rm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28361Rm extends C10680gT {
    public C28351Rl A00;
    public boolean A01;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public C28361Rm() {
    }

    public C28361Rm(C28351Rl c28351Rl, Resources resources) {
        A04(new C28351Rl(c28351Rl, this, resources));
        onStateChange(getState());
    }

    @Override // X.C10680gT
    public void A04(AbstractC10670gS abstractC10670gS) {
        super.A04(abstractC10670gS);
        if (abstractC10670gS instanceof C28351Rl) {
            this.A00 = (C28351Rl) abstractC10670gS;
        }
    }

    @Override // X.C10680gT
    /* renamed from: A05 */
    public C28351Rl A03() {
        return new C28351Rl(this.A00, this, null);
    }

    @Override // X.C10680gT, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // X.C10680gT, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.A01) {
            super.mutate();
            if (this == this) {
                this.A00.A04();
                this.A01 = true;
            }
        }
        return this;
    }

    @Override // X.C10680gT, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A06 = this.A00.A06(iArr);
        if (A06 < 0) {
            A06 = this.A00.A06(StateSet.WILD_CARD);
        }
        return A02(A06) || onStateChange;
    }
}
