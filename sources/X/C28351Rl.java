package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.1Rl */
/* loaded from: classes.dex */
public class C28351Rl extends AbstractC10670gS {
    public int[][] A00;

    public C28351Rl(C28351Rl c28351Rl, C28361Rm c28361Rm, Resources resources) {
        super(c28351Rl, c28361Rm, resources);
        if (c28351Rl != null) {
            this.A00 = c28351Rl.A00;
        } else {
            this.A00 = new int[this.A0V.length];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC10670gS
    public void A04() {
        int length = this.A00.length;
        int[][] iArr = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            int[][] iArr2 = this.A00;
            iArr[i] = iArr2[i] != null ? iArr2[i].clone() : null;
        }
        this.A00 = iArr;
    }

    public int A06(int[] iArr) {
        int[][] iArr2 = this.A00;
        int i = this.A0A;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new C28361Rm(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C28361Rm(this, resources);
    }
}
