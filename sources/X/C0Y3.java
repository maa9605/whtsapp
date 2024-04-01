package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.0Y3  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Y3 extends C0Y4 {
    public static Method A00;

    public C0Y3(C08730by c08730by, Resources resources) {
        super(c08730by, resources);
        A00();
    }

    public C0Y3(Drawable drawable) {
        super(drawable);
        A00();
    }

    public static final void A00() {
        if (A00 == null) {
            try {
                A00 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // X.C0Y4
    public boolean A01() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.A02;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.A02.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.A02.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.A02;
        if (drawable != null && (method = A00) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.A02.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.A02.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // X.C0Y4, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // X.C0Y4, android.graphics.drawable.Drawable, X.C0DE
    public void setTint(int i) {
        if (A01()) {
            super.setTint(i);
        } else {
            this.A02.setTint(i);
        }
    }

    @Override // X.C0Y4, android.graphics.drawable.Drawable, X.C0DE
    public void setTintList(ColorStateList colorStateList) {
        if (!A01()) {
            this.A02.setTintList(colorStateList);
            return;
        }
        this.A03.A01 = colorStateList;
        A00(getState());
    }

    @Override // X.C0Y4, android.graphics.drawable.Drawable, X.C0DE
    public void setTintMode(PorterDuff.Mode mode) {
        if (!A01()) {
            this.A02.setTintMode(mode);
            return;
        }
        this.A03.A02 = mode;
        A00(getState());
    }
}
