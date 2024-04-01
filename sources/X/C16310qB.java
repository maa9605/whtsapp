package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.0qB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16310qB extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public C16310qB(Drawable.ConstantState constantState) {
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
        C38801p0 c38801p0 = new C38801p0(null);
        Drawable newDrawable = this.A00.newDrawable();
        ((AbstractC07290Xq) c38801p0).A00 = newDrawable;
        newDrawable.setCallback(c38801p0.A05);
        return c38801p0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        C38801p0 c38801p0 = new C38801p0(null);
        Drawable newDrawable = this.A00.newDrawable(resources);
        ((AbstractC07290Xq) c38801p0).A00 = newDrawable;
        newDrawable.setCallback(c38801p0.A05);
        return c38801p0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C38801p0 c38801p0 = new C38801p0(null);
        Drawable newDrawable = this.A00.newDrawable(resources, theme);
        ((AbstractC07290Xq) c38801p0).A00 = newDrawable;
        newDrawable.setCallback(c38801p0.A05);
        return c38801p0;
    }
}
