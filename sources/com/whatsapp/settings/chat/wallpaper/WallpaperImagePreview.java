package com.whatsapp.settings.chat.wallpaper;

import X.AbstractC40441sG;
import X.AbstractC86263x9;
import X.C08540bf;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class WallpaperImagePreview extends AbstractC86263x9 {
    public boolean A00;
    public final Path A01;
    public final RectF A02;
    public final float[] A03;

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public WallpaperImagePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A01 = new Path();
        this.A02 = new RectF();
        this.A03 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.A00 = false;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.wallpaper_current_preview_corner_radius);
        float[] fArr = this.A03;
        float f = dimensionPixelSize;
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A31);
        try {
            this.A00 = obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.A00) {
            canvas.clipPath(this.A01);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00) {
            Path path = this.A01;
            path.reset();
            RectF rectF = this.A02;
            rectF.right = getMeasuredWidth();
            rectF.bottom = getMeasuredHeight();
            path.addRoundRect(rectF, this.A03, Path.Direction.CW);
            path.close();
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            Point A00 = AbstractC40441sG.A00(getContext());
            float f = A00.x;
            float f2 = A00.y;
            float f3 = (i3 - i) / f;
            float max = Math.max(f / intrinsicWidth, f2 / intrinsicHeight) * f3;
            Matrix imageMatrix = getImageMatrix();
            imageMatrix.setScale(max, max, 0.0f, 0.0f);
            imageMatrix.postTranslate(((f * f3) - (intrinsicWidth * max)) / 2.0f, getResources().getConfiguration().orientation != 2 ? ((f2 * f3) - (intrinsicHeight * max)) / 2.0f : 0.0f);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public void setRoundBottomCorners(boolean z) {
        this.A00 = z;
        invalidate();
    }
}
