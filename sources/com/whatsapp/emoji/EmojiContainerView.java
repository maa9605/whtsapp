package com.whatsapp.emoji;

import X.C3AS;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class EmojiContainerView extends C3AS {
    public Paint A00;
    public Path A01;
    public boolean A02;

    public EmojiContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A02) {
            if (this.A01 == null) {
                this.A01 = new Path();
            }
            Paint paint = this.A00;
            if (paint == null) {
                paint = new Paint();
                this.A00 = paint;
            }
            paint.setColor(285212672);
            this.A01.reset();
            this.A01.moveTo((getWidth() * 9) / 10, (getHeight() * 9) / 10);
            this.A01.lineTo((getWidth() * 9) / 10, (getHeight() * 3) >> 2);
            this.A01.lineTo((getWidth() * 3) >> 2, (getHeight() * 9) / 10);
            this.A01.lineTo((getWidth() * 9) / 10, (getHeight() * 9) / 10);
            this.A01.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.A01, this.A00);
        }
    }

    public void setIsSkinTone(boolean z) {
        this.A02 = z;
    }
}
