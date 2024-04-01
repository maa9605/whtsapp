package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.1j4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35391j4 extends C07030Wf {
    public final C002301c A00;

    public C35391j4(C002301c c002301c, Drawable drawable) {
        super(drawable, A00(c002301c));
        this.A00 = c002301c;
    }

    public static boolean A00(C002301c c002301c) {
        return c002301c.A0N() && !c002301c.A04().equals("iw");
    }

    @Override // X.C07030Wf, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean A00 = A00(this.A00);
        if (super.A00 != A00) {
            super.A00 = A00;
            invalidateSelf();
        }
        super.draw(canvas);
    }

    @Override // X.C07030Wf, android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean A00 = A00(this.A00);
        if (super.A00 != A00) {
            super.A00 = A00;
            invalidateSelf();
        }
        return super.getPadding(rect);
    }
}
