package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.1SH  reason: invalid class name */
/* loaded from: classes.dex */
public class C1SH extends C08780c3 {
    public boolean A00;

    public C1SH(Drawable drawable) {
        super(drawable);
        this.A00 = true;
    }

    @Override // X.C08780c3, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.A00) {
            super.A00.draw(canvas);
        }
    }

    @Override // X.C08780c3, android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        if (this.A00) {
            C07O.A0V(super.A00, f, f2);
        }
    }

    @Override // X.C08780c3, android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.A00) {
            C07O.A0Y(super.A00, i, i2, i3, i4);
        }
    }

    @Override // X.C08780c3, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (this.A00) {
            return super.A00.setState(iArr);
        }
        return false;
    }

    @Override // X.C08780c3, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.A00) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
