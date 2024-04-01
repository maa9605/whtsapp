package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import com.whatsapp.crop.CropImageView;
import java.util.ArrayList;

/* renamed from: X.2KO */
/* loaded from: classes2.dex */
public abstract class C2KO extends C2KP {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public InterfaceC59822tT A04;
    public Runnable A05;
    public final Matrix A06;
    public final Matrix A07;
    public final Matrix A08;
    public final Handler A09;
    public final C59832tU A0A;
    public final float[] A0B;

    public C2KO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = new Matrix();
        this.A08 = new Matrix();
        this.A07 = new Matrix();
        this.A0B = new float[9];
        this.A09 = new Handler(Looper.getMainLooper());
        this.A0A = new C59832tU(null);
        this.A03 = -1;
        this.A02 = -1;
        this.A00 = 3.0f;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0060, code lost:
        if (r1 < r2) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01() {
        /*
            r8 = this;
            X.2tU r3 = r8.A0A
            android.graphics.Bitmap r0 = r3.A00
            if (r0 != 0) goto L7
            return
        L7:
            android.graphics.Matrix r2 = r8.getImageViewMatrix()
            android.graphics.Bitmap r0 = r3.A00
            int r0 = r0.getWidth()
            float r1 = (float) r0
            android.graphics.Bitmap r0 = r3.A00
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r3 = 0
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r3, r3, r1, r0)
            r2.mapRect(r5)
            float r1 = r5.height()
            float r7 = r5.width()
            r6 = 1073741824(0x40000000, float:2.0)
            int r0 = r8.getHeight()
            float r4 = (float) r0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L63
            float r4 = r4 - r1
            float r4 = r4 / r6
            float r0 = r5.top
        L39:
            float r4 = r4 - r0
        L3a:
            int r0 = r8.getWidth()
            float r2 = (float) r0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L54
            float r2 = r2 - r7
            float r2 = r2 / r6
            float r1 = r5.left
        L47:
            float r3 = r2 - r1
        L49:
            r8.A02(r3, r4)
            android.graphics.Matrix r0 = r8.getImageViewMatrix()
            r8.setImageMatrix(r0)
            return
        L54:
            float r1 = r5.left
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5c
            float r3 = -r1
            goto L49
        L5c:
            float r1 = r5.right
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L49
            goto L47
        L63:
            float r1 = r5.top
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6b
            float r4 = -r1
            goto L3a
        L6b:
            float r0 = r5.bottom
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L79
            int r0 = r8.getHeight()
            float r4 = (float) r0
            float r0 = r5.bottom
            goto L39
        L79:
            r4 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2KO.A01():void");
    }

    public void A02(float f, float f2) {
        if (!(this instanceof CropImageView)) {
            this.A08.postTranslate(f, f2);
            return;
        }
        CropImageView cropImageView = (CropImageView) this;
        cropImageView.A08.postTranslate(f, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = cropImageView.A05;
            if (i >= arrayList.size()) {
                return;
            }
            C2KQ c2kq = (C2KQ) arrayList.get(i);
            c2kq.A03.postTranslate(f, f2);
            c2kq.A04 = c2kq.A02();
            i++;
        }
    }

    public void A03(float f, float f2, float f3) {
        float f4 = this.A01;
        if (f > f4) {
            f = f4;
        }
        float scale = f / getScale();
        this.A08.postScale(scale, scale, f2, f3);
        setImageMatrix(getImageViewMatrix());
        A01();
    }

    public final void A04(C59832tU c59832tU, Matrix matrix) {
        float width = getWidth();
        float height = getHeight();
        float A01 = c59832tU.A01();
        float A00 = c59832tU.A00();
        matrix.reset();
        float f = this.A00;
        float min = Math.min(Math.min(width / A01, f), Math.min(height / A00, f));
        Matrix matrix2 = new Matrix();
        if (c59832tU.A01 != null) {
            matrix2.preTranslate(-(c59832tU.A00.getWidth() >> 1), -(c59832tU.A00.getHeight() >> 1));
            matrix2.postConcat(c59832tU.A01);
            matrix2.postTranslate(c59832tU.A01() >> 1, c59832tU.A00() >> 1);
        }
        matrix.postConcat(matrix2);
        matrix.postScale(min, min);
        matrix.postTranslate((width - (A01 * min)) / 2.0f, (height - (A00 * min)) / 2.0f);
    }

    public void A05(C59832tU c59832tU, boolean z) {
        if (getWidth() <= 0) {
            this.A05 = new RunnableEBaseShape0S0210000_I0(this, c59832tU, z, 2);
            return;
        }
        if (c59832tU.A00 != null) {
            A04(c59832tU, this.A06);
            Bitmap bitmap = c59832tU.A00;
            Matrix matrix = c59832tU.A01;
            super.setImageBitmap(bitmap);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.setDither(true);
                drawable.setFilterBitmap(true);
            }
            C59832tU c59832tU2 = this.A0A;
            c59832tU2.A00 = bitmap;
            c59832tU2.A01 = matrix;
        } else {
            this.A06.reset();
            super.setImageBitmap(null);
        }
        if (z) {
            this.A08.reset();
        }
        setImageMatrix(getImageViewMatrix());
        C59832tU c59832tU3 = this.A0A;
        this.A01 = c59832tU3.A00 != null ? Math.max(1.0f, Math.max(c59832tU3.A01() / this.A03, c59832tU3.A00() / this.A02) * 4.0f) : 1.0f;
    }

    public Matrix getImageViewMatrix() {
        Matrix matrix = this.A07;
        matrix.set(this.A06);
        matrix.postConcat(this.A08);
        return matrix;
    }

    public float getScale() {
        Matrix matrix = this.A08;
        float[] fArr = this.A0B;
        matrix.getValues(fArr);
        return fArr[0];
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && getScale() > 1.0f) {
            A03(1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A03 = i3 - i;
        this.A02 = i4 - i2;
        Runnable runnable = this.A05;
        if (runnable != null) {
            this.A05 = null;
            runnable.run();
        }
        C59832tU c59832tU = this.A0A;
        if (c59832tU.A00 != null) {
            A04(c59832tU, this.A06);
            setImageMatrix(getImageViewMatrix());
        }
    }

    @Override // X.C0S5, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
        } else {
            A05(new C59832tU(bitmap), true);
        }
    }

    public void setMaxProperScale(float f) {
        this.A00 = f;
    }

    public void setRecycler(InterfaceC59822tT interfaceC59822tT) {
        this.A04 = interfaceC59822tT;
    }
}
