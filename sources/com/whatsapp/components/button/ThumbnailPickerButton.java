package com.whatsapp.components.button;

import X.AbstractC51272Vs;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ThumbnailPickerButton extends AbstractC51272Vs {
    public Path A00;

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new Path();
    }

    @Override // com.whatsapp.components.button.ThumbnailButton
    public void A02(Canvas canvas) {
        super.A02(canvas);
        if (isEnabled()) {
            float f = this.A02;
            if (f > 0.0f) {
                float f2 = f * 7.0f;
                this.A00.reset();
                this.A05.setStyle(Paint.Style.FILL);
                Path path = this.A00;
                RectF rectF = this.A09;
                path.moveTo(rectF.right, rectF.bottom - f2);
                this.A00.lineTo(rectF.right, rectF.bottom - this.A02);
                Path path2 = this.A00;
                float f3 = rectF.right;
                float f4 = this.A02 * 2.0f;
                float f5 = rectF.bottom;
                path2.arcTo(new RectF(f3 - f4, f5 - f4, f3, f5), 0.0f, 90.0f);
                this.A00.lineTo(rectF.right - f2, rectF.bottom);
                this.A00.lineTo(rectF.right, rectF.bottom - f2);
                this.A05.setColor(1409286144);
                canvas.drawPath(this.A00, this.A05);
                this.A00.reset();
                this.A00.moveTo(rectF.right, rectF.bottom - f2);
                this.A00.lineTo(rectF.right - f2, rectF.bottom);
                this.A05.setStyle(Paint.Style.STROKE);
                this.A05.setStrokeJoin(Paint.Join.ROUND);
                this.A05.setStrokeCap(Paint.Cap.ROUND);
                this.A05.setStrokeWidth(getResources().getDimension(R.dimen.thumbnail_picker_button_stroke_width));
                this.A05.setColor(-570425345);
                canvas.drawPath(this.A00, this.A05);
            }
        }
    }
}
