package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* renamed from: X.0gS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10670gS extends Drawable.ConstantState {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A09;
    public int A0A;
    public int A0B;
    public ColorStateList A0C;
    public Resources A0D;
    public ColorFilter A0E;
    public PorterDuff.Mode A0F;
    public Rect A0G;
    public SparseArray A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public Drawable[] A0V;
    public final C10680gT A0W;
    public boolean A0U = false;
    public boolean A0P = false;
    public boolean A0Q = true;
    public int A07 = 0;
    public int A08 = 0;

    public abstract void A04();

    public AbstractC10670gS(AbstractC10670gS abstractC10670gS, C10680gT c10680gT, Resources resources) {
        Resources resources2;
        this.A06 = 160;
        this.A0W = c10680gT;
        if (resources != null) {
            resources2 = resources;
        } else {
            resources2 = abstractC10670gS != null ? abstractC10670gS.A0D : null;
        }
        this.A0D = resources2;
        int i = resources != null ? resources.getDisplayMetrics().densityDpi : abstractC10670gS != null ? 160 : 0;
        i = i == 0 ? 160 : i;
        this.A06 = i;
        if (abstractC10670gS != null) {
            this.A00 = abstractC10670gS.A00;
            this.A01 = abstractC10670gS.A01;
            this.A0L = true;
            this.A0J = true;
            this.A09 = abstractC10670gS.A09;
            this.A0I = abstractC10670gS.A0I;
            this.A0E = abstractC10670gS.A0E;
            this.A0R = abstractC10670gS.A0R;
            this.A0C = abstractC10670gS.A0C;
            this.A0F = abstractC10670gS.A0F;
            this.A0S = abstractC10670gS.A0S;
            this.A0T = abstractC10670gS.A0T;
            if (abstractC10670gS.A06 == i) {
                if (abstractC10670gS.A0N) {
                    this.A0G = new Rect(abstractC10670gS.A0G);
                    this.A0N = true;
                }
                if (abstractC10670gS.A0K) {
                    this.A05 = abstractC10670gS.A05;
                    this.A02 = abstractC10670gS.A02;
                    this.A04 = abstractC10670gS.A04;
                    this.A03 = abstractC10670gS.A03;
                    this.A0K = true;
                }
            }
            if (abstractC10670gS.A0M) {
                this.A0B = abstractC10670gS.A0B;
                this.A0M = true;
            }
            if (abstractC10670gS.A0O) {
                this.A0O = true;
            }
            Drawable[] drawableArr = abstractC10670gS.A0V;
            this.A0V = new Drawable[drawableArr.length];
            int i2 = abstractC10670gS.A0A;
            this.A0A = i2;
            SparseArray sparseArray = abstractC10670gS.A0H;
            if (sparseArray != null) {
                this.A0H = sparseArray.clone();
            } else {
                this.A0H = new SparseArray(i2);
            }
            int i3 = this.A0A;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    Drawable.ConstantState constantState = drawableArr[i4].getConstantState();
                    if (constantState != null) {
                        this.A0H.put(i4, constantState);
                    } else {
                        this.A0V[i4] = drawableArr[i4];
                    }
                }
            }
            return;
        }
        this.A0V = new Drawable[10];
        this.A0A = 0;
    }

    public final int A00(Drawable drawable) {
        int i = this.A0A;
        if (i >= this.A0V.length) {
            int i2 = i + 10;
            C28351Rl c28351Rl = (C28351Rl) this;
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(c28351Rl.A0V, 0, drawableArr, 0, i);
            c28351Rl.A0V = drawableArr;
            int[][] iArr = new int[i2];
            System.arraycopy(c28351Rl.A00, 0, iArr, 0, i);
            c28351Rl.A00 = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.A0W);
        this.A0V[i] = drawable;
        this.A0A++;
        this.A01 = drawable.getChangingConfigurations() | this.A01;
        this.A0M = false;
        this.A0O = false;
        this.A0G = null;
        this.A0N = false;
        this.A0K = false;
        this.A0L = false;
        return i;
    }

    public final Drawable A01(int i) {
        int indexOfKey;
        Drawable drawable = this.A0V[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.A0H;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.A0H.valueAt(indexOfKey)).newDrawable(this.A0D);
        if (Build.VERSION.SDK_INT >= 23) {
            newDrawable.setLayoutDirection(this.A09);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.A0W);
        this.A0V[i] = mutate;
        this.A0H.removeAt(indexOfKey);
        if (this.A0H.size() == 0) {
            this.A0H = null;
        }
        return mutate;
    }

    public void A02() {
        this.A0K = true;
        A03();
        int i = this.A0A;
        Drawable[] drawableArr = this.A0V;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A04 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.A05) {
                this.A05 = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.A02) {
                this.A02 = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.A04) {
                this.A04 = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.A03) {
                this.A03 = minimumHeight;
            }
        }
    }

    public final void A03() {
        SparseArray sparseArray = this.A0H;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.A0H.keyAt(i);
                Drawable[] drawableArr = this.A0V;
                Drawable newDrawable = ((Drawable.ConstantState) this.A0H.valueAt(i)).newDrawable(this.A0D);
                if (Build.VERSION.SDK_INT >= 23) {
                    newDrawable.setLayoutDirection(this.A09);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.A0W);
                drawableArr[keyAt] = mutate;
            }
            this.A0H = null;
        }
    }

    public final void A05(Resources resources) {
        if (resources != null) {
            this.A0D = resources;
            int i = resources.getDisplayMetrics().densityDpi;
            if (i == 0) {
                i = 160;
            }
            int i2 = this.A06;
            this.A06 = i;
            if (i2 != i) {
                this.A0K = false;
                this.A0N = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        int i = this.A0A;
        Drawable[] drawableArr = this.A0V;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.A0H.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.A00 | this.A01;
    }
}
