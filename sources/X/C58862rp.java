package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.2rp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C58862rp extends InsetDrawable {
    public int A00;
    public final Drawable A01;
    public final boolean A02;

    public C58862rp(Drawable drawable, boolean z) {
        super(drawable, 0);
        this.A00 = -1;
        this.A01 = drawable;
        this.A02 = z;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        int i = this.A00;
        if (i >= 0) {
            int width = (i - bounds.width()) >> 1;
            if (this.A02) {
                drawable = this.A01;
                drawable.setBounds(bounds.left, bounds.top, (width << 1) + bounds.right, bounds.bottom);
            } else {
                drawable = this.A01;
                drawable.setBounds(bounds.left - width, bounds.top, bounds.right + width, bounds.bottom);
            }
            drawable.draw(canvas);
            return;
        }
        this.A01.setBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
        super.draw(canvas);
    }
}
