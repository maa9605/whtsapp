package com.whatsapp.settings.chat.wallpaper;

import X.AbstractC86253x8;
import X.C000200d;
import X.C3WU;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class WallPaperView extends AbstractC86253x8 {
    public Rect A00;
    public C3WU A01;
    public boolean A02;

    public WallPaperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        C3WU c3wu;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.A00;
        boolean z = true;
        if (rect == null) {
            if (!isInEditMode()) {
                C000200d.A0t("redraw:", measuredWidth, " | ", measuredHeight);
            }
            this.A00 = new Rect(0, 0, measuredWidth, measuredHeight);
        } else if (rect.width() == measuredWidth && this.A00.height() == measuredHeight) {
            z = false;
        } else {
            this.A00.set(0, 0, measuredWidth, measuredHeight);
            if (!isInEditMode()) {
                C000200d.A0t("redraw changed:", measuredWidth, " | ", measuredHeight);
            }
        }
        super.onDraw(canvas);
        if ((z || this.A02) && measuredHeight > 0 && measuredWidth > 0 && (c3wu = this.A01) != null) {
            c3wu.AOj(measuredWidth, measuredHeight);
        }
    }

    public void setDrawable(Drawable drawable) {
        this.A02 = true;
        setImageDrawable(drawable);
        invalidate();
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            float max = Math.max((i3 - i) / drawable.getIntrinsicWidth(), (i4 - i2) / drawable.getIntrinsicHeight());
            imageMatrix.setScale(max, max, 0.0f, 0.0f);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public void setOnSizeChangedListener(C3WU c3wu) {
        this.A01 = c3wu;
    }
}
