package com.whatsapp.camera;

import X.AbstractC52282aN;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class DragBottomSheetIndicator extends AbstractC52282aN {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public boolean A04;
    public final Paint A05;
    public final Paint A06;
    public final Path A07;

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = new Paint(1);
        this.A06 = new Paint(1);
        this.A07 = new Path();
        this.A05.setStyle(Paint.Style.STROKE);
        this.A05.setStrokeCap(Paint.Cap.SQUARE);
        this.A05.setStrokeWidth(context.getResources().getDisplayMetrics().density * 2.0f);
        this.A05.setColor(-1);
        this.A06.setStyle(Paint.Style.STROKE);
        this.A06.setStrokeCap(Paint.Cap.ROUND);
        this.A06.setStrokeJoin(Paint.Join.ROUND);
        this.A06.setStrokeWidth(context.getResources().getDisplayMetrics().density * 4.0f);
        this.A06.setColor(855638016);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float elapsedRealtime = ((this.A00 - this.A01) * 1000.0f) / ((float) (SystemClock.elapsedRealtime() - this.A03));
        if (elapsedRealtime > 1.0f) {
            elapsedRealtime = 1.0f;
        } else if (elapsedRealtime < -1.0f) {
            elapsedRealtime = -1.0f;
        }
        if (elapsedRealtime > 0.0f) {
            elapsedRealtime /= 2.0f;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        Path path = this.A07;
        path.reset();
        float f = ((height - paddingTop) * elapsedRealtime) + ((height + paddingTop) >> 1);
        path.moveTo(paddingLeft, f);
        path.lineTo((paddingLeft + width) >> 1, paddingTop);
        path.lineTo(width, f);
        canvas.drawPath(path, this.A06);
        canvas.drawPath(path, this.A05);
        canvas.translate(0.0f, getHeight());
        if (this.A04) {
            invalidate();
        }
    }

    public void setOffset(float f) {
        this.A03 = this.A02;
        this.A01 = this.A00;
        this.A02 = SystemClock.elapsedRealtime();
        this.A00 = f;
        invalidate();
    }

    public void setUpdating(boolean z) {
        this.A04 = z;
        if (z) {
            invalidate();
        }
    }
}
