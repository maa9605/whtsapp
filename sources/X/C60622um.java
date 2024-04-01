package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.2um  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60622um extends InsetDrawable {
    public int A00;
    public final Drawable A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C60622um(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            android.graphics.drawable.Drawable r1 = X.C07O.A0I(r3)
            r0 = 0
            r2.<init>(r1, r0)
            r2.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60622um.<init>(android.graphics.drawable.Drawable):void");
    }

    public void A00(int i) {
        this.A00 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.A01;
        drawable.setBounds(bounds.left + 0, bounds.top + this.A00, bounds.right - 0, bounds.bottom - 0);
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        C07O.A0X(this.A01, i);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        C07O.A0Z(this.A01, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A01;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        C07O.A0a(drawable, mode);
    }
}
