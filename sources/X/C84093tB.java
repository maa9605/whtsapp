package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.TextureView;

/* renamed from: X.3tB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84093tB extends TextureView implements AnonymousClass005 {
    public int A00;
    public C2UB A01;
    public boolean A02;
    public boolean A03;

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    public C84093tB(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A01;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A01 = c2ub;
        }
        return c2ub.generatedComponent();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A03) {
            setTransform(null);
        } else {
            int i5 = this.A00;
            if (i5 == 90 || i5 == 270) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Matrix matrix = new Matrix();
                float f = i5;
                float f2 = measuredWidth;
                float f3 = f2 / 2.0f;
                float f4 = measuredHeight;
                float f5 = f4 / 2.0f;
                matrix.postRotate(f, f3, f5);
                matrix.postScale(f2 / f4, f4 / f2, f3, f5);
                setTransform(matrix);
            }
        }
        this.A03 = false;
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setRotationAngle(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            if (i != 90 && i != 270) {
                this.A00 = 0;
                this.A03 = true;
            }
            requestLayout();
        }
    }
}
