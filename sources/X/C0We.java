package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.0We  reason: invalid class name */
/* loaded from: classes.dex */
public class C0We extends C07030Wf {
    public final C002301c A00;

    public C0We(C002301c c002301c, Drawable drawable) {
        super(drawable, c002301c.A0N());
        this.A00 = c002301c;
    }

    @Override // X.C07030Wf, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean A0N = this.A00.A0N();
        if (super.A00 != A0N) {
            super.A00 = A0N;
            invalidateSelf();
        }
        super.draw(canvas);
    }

    @Override // X.C07030Wf, android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean A0N = this.A00.A0N();
        if (super.A00 != A0N) {
            super.A00 = A0N;
            invalidateSelf();
        }
        return super.getPadding(rect);
    }
}
