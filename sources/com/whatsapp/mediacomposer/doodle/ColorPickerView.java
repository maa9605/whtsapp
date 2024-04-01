package com.whatsapp.mediacomposer.doodle;

import X.AbstractC51772Xx;
import X.C002301c;
import X.C003701t;
import X.C02160Ac;
import X.C08540bf;
import X.C63462zp;
import X.C68693Lb;
import X.InterfaceC63442zn;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class ColorPickerView extends AbstractC51772Xx {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Bitmap A08;
    public C002301c A09;
    public C003701t A0A;
    public InterfaceC63442zn A0B;
    public boolean A0C;
    public int[] A0D;
    public final Paint A0E;
    public final Paint A0F;

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0E = new Paint();
        this.A0F = new Paint(1);
        this.A03 = -13381889;
        this.A01 = 1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A0f);
            this.A05 = (int) obtainStyledAttributes.getDimension(2, 1.0f);
            this.A07 = (int) obtainStyledAttributes.getDimension(1, 1.0f);
            this.A06 = (int) obtainStyledAttributes.getDimension(0, 1.0f);
            this.A00 = this.A07;
            obtainStyledAttributes.recycle();
        }
    }

    public final void A00() {
        int i = this.A01;
        if (i == 3) {
            int i2 = (this.A02 / 5) + 1;
            for (int i3 = 0; i3 < this.A02; i3++) {
                int i4 = i3 / i2;
                int i5 = i3 % i2;
                int[] iArr = C68693Lb.A08;
                int i6 = iArr[i4];
                int i7 = iArr[i4 + 1];
                float f = i2 - i5;
                float f2 = i2;
                float f3 = i5;
                this.A0D[i3] = Color.argb(255, (int) ((((Color.red(i7) * 1.0f) * f3) / f2) + (((Color.red(i6) * 1.0f) * f) / f2)), (int) ((((Color.green(i7) * 1.0f) * f3) / f2) + (((Color.green(i6) * 1.0f) * f) / f2)), (int) ((((Color.blue(i7) * 1.0f) * f3) / f2) + (((Color.blue(i6) * 1.0f) * f) / f2)));
            }
        } else {
            int i8 = this.A02;
            int i9 = i8 / 10;
            int i10 = i8 / (i == 2 ? 50 : 30);
            int i11 = i == 2 ? i8 >> 2 : 0;
            int i12 = (((i8 - i9) - i10) - i9) - i11;
            for (int i13 = 0; i13 < i9; i13++) {
                int i14 = (i13 * 255) / i9;
                if (this.A01 == 2) {
                    int i15 = i9 - i13;
                    this.A0D[i13] = Color.argb(255, ((i15 * 255) / i9) + i14, ((i15 * 204) / i9) + i14, ((i15 * 77) / i9) + i14);
                } else {
                    this.A0D[i13] = i14 | (-16777216) | (i14 << 16) | (i14 << 8);
                }
            }
            for (int i16 = 0; i16 < i10; i16++) {
                this.A0D[i9 + i16] = -1;
            }
            float[] fArr = new float[3];
            fArr[0] = 0.0f;
            fArr[2] = 1.0f;
            for (int i17 = 0; i17 < i9; i17++) {
                fArr[1] = i17 / i9;
                this.A0D[i9 + i10 + i17] = Color.HSVToColor(fArr);
            }
            fArr[1] = 0.8f;
            fArr[2] = 1.0f;
            for (int i18 = 0; i18 < i12; i18++) {
                fArr[0] = (i18 * 360.0f) / i12;
                this.A0D[i9 + i10 + i9 + i18] = Color.HSVToColor(fArr);
            }
            for (int i19 = 0; i19 < i11; i19++) {
                this.A0D[i9 + i10 + i9 + i12 + i19] = Color.argb(255, 255, (i19 * 204) / i11, (i19 * 77) / i11);
            }
        }
        Path path = new Path();
        path.setFillType(Path.FillType.WINDING);
        float[] fArr2 = new float[8];
        Arrays.fill(fArr2, this.A05 / 0.8f);
        path.addRoundRect(new RectF(1.0f, 1.0f, this.A05 - 1, this.A02 - 1), fArr2, Path.Direction.CW);
        Bitmap bitmap = this.A08;
        if (bitmap == null || bitmap.getWidth() != this.A05 || this.A08.getHeight() != this.A02) {
            this.A08 = Bitmap.createBitmap(this.A05, this.A02, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(this.A08);
        Paint paint = this.A0E;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        canvas.save();
        canvas.clipPath(path);
        paint.setStrokeWidth(1.0f);
        for (int i20 = 0; i20 < this.A02; i20++) {
            paint.setColor(this.A0D[i20]);
            float f4 = i20;
            canvas.drawLine(0.0f, f4, this.A05, f4, paint);
        }
        canvas.restore();
        Paint paint2 = this.A0F;
        paint2.setColor(C02160Ac.A00(getContext(), R.color.color_picker_border_color));
        paint2.setStyle(style);
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.status_color_picker_border_width));
        canvas.drawPath(path, paint2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        int width;
        int i;
        super.draw(canvas);
        if (this.A0A.A0C(279)) {
            if (this.A09.A0M()) {
                width = getWidth();
                i = getPaddingRight();
                paddingLeft = width - i;
            } else {
                paddingLeft = this.A05 + getPaddingRight();
            }
        } else if (this.A09.A0M()) {
            width = getWidth() - getPaddingRight();
            i = this.A05;
            paddingLeft = width - i;
        } else {
            paddingLeft = getPaddingLeft();
        }
        canvas.drawBitmap(this.A08, paddingLeft, getPaddingTop(), this.A0E);
    }

    public int getColor() {
        return this.A03;
    }

    public float getMinSize() {
        return this.A07;
    }

    public float getSize() {
        return this.A00;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A04 == 0 || getMeasuredHeight() <= this.A04) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), this.A04);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C63462zp c63462zp = (C63462zp) parcelable;
        this.A03 = c63462zp.A01;
        this.A00 = c63462zp.A00;
        super.onRestoreInstanceState(c63462zp.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new C63462zp(super.onSaveInstanceState(), this.A03, this.A00);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int max = Math.max(1, (i2 - getPaddingTop()) - getPaddingBottom());
        this.A02 = max;
        int[] iArr = this.A0D;
        if (iArr == null || iArr.length < max) {
            this.A0D = new int[max];
        }
        A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x004a, code lost:
        if (r9.A09.A0N() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0059, code lost:
        if (r7 != 6) goto L16;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.ColorPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void setColor(int i) {
        this.A03 = i;
    }

    public void setColorAndInvalidate(int i) {
        this.A03 = i;
        invalidate();
    }

    public void setColorPaletteAndInvalidate(int i) {
        this.A01 = i;
        A00();
        invalidate();
    }

    public void setListener(InterfaceC63442zn interfaceC63442zn) {
        this.A0B = interfaceC63442zn;
    }

    public void setMaxHeight(int i) {
        this.A04 = i;
    }

    private void setSize(float f) {
        this.A00 = f;
    }

    public void setSizeAndInvalidate(float f) {
        this.A00 = f;
        invalidate();
    }
}
