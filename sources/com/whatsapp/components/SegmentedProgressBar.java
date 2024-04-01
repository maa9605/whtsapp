package com.whatsapp.components;

import X.AbstractC51252Vl;
import X.C002301c;
import X.C49582Lf;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* loaded from: classes2.dex */
public class SegmentedProgressBar extends AbstractC51252Vl {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public AnimatorSet A08;
    public Bitmap A09;
    public C002301c A0A;
    public float[] A0B;
    public int[] A0C;
    public final Paint A0D;
    public final RectF A0E;

    public SegmentedProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A0D = new Paint(1);
        this.A0E = new RectF();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A1n);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.A07 = dimensionPixelSize;
            if (dimensionPixelSize % 2 == 1) {
                this.A07 = dimensionPixelSize + 1;
            }
            this.A05 = obtainStyledAttributes.getInteger(2, 0);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A03 = obtainStyledAttributes.getInteger(0, 0);
            this.A02 = obtainStyledAttributes.getInteger(3, 0);
            obtainStyledAttributes.recycle();
        }
        this.A01 = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        this.A00 = 300;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int paddingRight;
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight2 = (width - paddingLeft) - getPaddingRight();
        int height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) >> 1) + getPaddingTop();
        Paint paint = this.A0D;
        paint.setColor(this.A02);
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = this.A0E;
        rectF.set(0.0f, height - (this.A07 >> 1), getWidth(), (this.A07 >> 1) + height);
        canvas.drawRect(rectF, paint);
        if (this.A0B != null && this.A0C != null) {
            int i = 0;
            float f = 0.0f;
            while (true) {
                float[] fArr = this.A0B;
                if (i >= fArr.length) {
                    break;
                }
                if (fArr[i] != 0.0f) {
                    paint.setColor(this.A0C[i]);
                    float f2 = (this.A0B[i] / 100.0f) * paddingRight2;
                    if (!isInEditMode() && !this.A0A.A0M()) {
                        float f3 = (width - paddingRight) - f;
                        float f4 = f3 - f2;
                        int i2 = this.A07 >> 1;
                        rectF.set(f4, height - i2, f3, i2 + height);
                        canvas.drawRect(rectF, paint);
                        if (i != this.A0B.length - 1 || this.A06 != 100) {
                            paint.setColor(this.A03);
                            int i3 = this.A07 >> 1;
                            rectF.set(f4, height - i3, this.A04 + f4, i3 + height);
                            canvas.drawRect(rectF, paint);
                        }
                    } else {
                        float f5 = paddingLeft;
                        int i4 = this.A07 >> 1;
                        rectF.set(f5 + f, height - i4, f5 + f2 + f, i4 + height);
                        canvas.drawRect(rectF, paint);
                        if (i != this.A0B.length - 1 || this.A06 != 100) {
                            paint.setColor(this.A03);
                            float f6 = f2 + f;
                            int i5 = this.A07 >> 1;
                            rectF.set(f6 - this.A04, height - i5, f6, i5 + height);
                            canvas.drawRect(rectF, paint);
                        }
                    }
                    f += f2;
                }
                i++;
            }
        }
        paint.setColor(this.A05);
        if (this.A09 == null) {
            int width2 = getWidth();
            int i6 = this.A07;
            float height2 = rectF.height() / 2.0f;
            Bitmap createBitmap = Bitmap.createBitmap(width2, i6, Bitmap.Config.ARGB_8888);
            this.A09 = createBitmap;
            Canvas canvas2 = new Canvas(createBitmap);
            Paint paint2 = new Paint(1);
            paint2.setColor(this.A05);
            paint2.setXfermode(null);
            float f7 = width2;
            float f8 = i6;
            canvas2.drawRect(0.0f, 0.0f, f7, f8, paint2);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas2.drawRoundRect(new RectF(0.0f, 0.0f, f7, f8), height2, height2, paint2);
        }
        canvas.drawBitmap(this.A09, 0.0f, 0.0f, paint);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size;
        if (View.MeasureSpec.getMode(i2) == 0) {
            size = getPaddingBottom() + getPaddingTop() + this.A07;
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A09 = null;
    }
}
