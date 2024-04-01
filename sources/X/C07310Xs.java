package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Xs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07310Xs extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public C07310Xs(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C07280Xp c07280Xp = new C07280Xp();
        ((AbstractC07290Xq) c07280Xp).A00 = this.A00.newDrawable();
        return c07280Xp;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        C07280Xp c07280Xp = new C07280Xp();
        ((AbstractC07290Xq) c07280Xp).A00 = this.A00.newDrawable(resources);
        return c07280Xp;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C07280Xp c07280Xp = new C07280Xp();
        ((AbstractC07290Xq) c07280Xp).A00 = this.A00.newDrawable(resources, theme);
        return c07280Xp;
    }
}
