package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Y4 */
/* loaded from: classes.dex */
public class C0Y4 extends Drawable implements Drawable.Callback, C0Y5, C0DE {
    public static final PorterDuff.Mode A06 = PorterDuff.Mode.SRC_IN;
    public int A00;
    public PorterDuff.Mode A01;
    public Drawable A02;
    public C08730by A03;
    public boolean A04;
    public boolean A05;

    public boolean A01() {
        return true;
    }

    public C0Y4(C08730by c08730by, Resources resources) {
        this.A03 = c08730by;
        Drawable.ConstantState constantState = c08730by.A03;
        if (constantState != null) {
            AUC(constantState.newDrawable(resources));
        }
    }

    public C0Y4(Drawable drawable) {
        this.A03 = new C08730by(this.A03);
        AUC(drawable);
    }

    public final boolean A00(int[] iArr) {
        if (A01()) {
            C08730by c08730by = this.A03;
            ColorStateList colorStateList = c08730by.A01;
            PorterDuff.Mode mode = c08730by.A02;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.A04 || colorForState != this.A00 || mode != this.A01) {
                    setColorFilter(colorForState, mode);
                    this.A00 = colorForState;
                    this.A01 = mode;
                    this.A04 = true;
                    return true;
                }
            } else {
                this.A04 = false;
                clearColorFilter();
            }
            return false;
        }
        return false;
    }

    @Override // X.C0Y5
    public final Drawable AE4() {
        return this.A02;
    }

    @Override // X.C0Y5
    public final void AUC(Drawable drawable) {
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.A02 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C08730by c08730by = this.A03;
            if (c08730by != null) {
                c08730by.A03 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.A02.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        C08730by c08730by = this.A03;
        if (c08730by != null) {
            i = c08730by.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.A02.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C08730by c08730by = this.A03;
        if (c08730by == null || c08730by.A03 == null) {
            return null;
        }
        c08730by.A00 = getChangingConfigurations();
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.A02.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.A02.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.A02.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.A02.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.A02.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.A02.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.A02.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.A02.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.A02.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.A02.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C08730by c08730by;
        ColorStateList colorStateList;
        return (A01() && (c08730by = this.A03) != null && (colorStateList = c08730by.A01) != null && colorStateList.isStateful()) || this.A02.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.A02.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.A05 && super.mutate() == this) {
            this.A03 = new C08730by(this.A03);
            Drawable drawable = this.A02;
            if (drawable != null) {
                drawable.mutate();
            }
            C08730by c08730by = this.A03;
            if (c08730by != null) {
                Drawable drawable2 = this.A02;
                c08730by.A03 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.A05 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.A02.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.A02.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.A02.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.A02.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.A02.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return A00(iArr) || this.A02.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, X.C0DE
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, X.C0DE
    public void setTintList(ColorStateList colorStateList) {
        this.A03.A01 = colorStateList;
        A00(getState());
    }

    @Override // android.graphics.drawable.Drawable, X.C0DE
    public void setTintMode(PorterDuff.Mode mode) {
        this.A03.A02 = mode;
        A00(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.A02.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
