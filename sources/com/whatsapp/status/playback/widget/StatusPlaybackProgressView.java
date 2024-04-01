package com.whatsapp.status.playback.widget;

import X.AbstractC82403qS;
import X.InterfaceC71733Xg;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class StatusPlaybackProgressView extends AbstractC82403qS {
    public float A00;
    public int A01;
    public int A02;
    public InterfaceC71733Xg A03;
    public final Paint A04;
    public final RectF A05;
    public final Set A06;

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = new HashSet();
        this.A05 = new RectF();
        this.A04 = new Paint(1);
    }

    public final int A00(int i, boolean z) {
        return this.A06.contains(Integer.valueOf(i)) ? z ? -376511 : 1727676737 : z ? -1 : 1728053247;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.A01 == 0) {
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f = width;
        float f2 = this.A01;
        float min = Math.min(height << 1, ((f * 1.0f) / f2) / 2.0f);
        float f3 = ((f - ((i - 1) * min)) * 1.0f) / f2;
        Paint paint = this.A04;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        float f4 = 0.0f;
        for (int i2 = 0; i2 < this.A01; i2++) {
            int i3 = this.A02;
            if (i2 == i3) {
                InterfaceC71733Xg interfaceC71733Xg = this.A03;
                if (interfaceC71733Xg != null) {
                    this.A00 = interfaceC71733Xg.ACb();
                }
                paint.setColor(A00(i2, false));
                RectF rectF = this.A05;
                float f5 = height;
                rectF.set(f4, 0.0f, f4 + f3, f5);
                float f6 = f5 / 2.0f;
                canvas.drawRoundRect(rectF, f6, f6, paint);
                paint.setColor(A00(i2, true));
                rectF.set(f4, 0.0f, ((this.A00 * f3) / 100.0f) + f4, f5);
                canvas.drawRoundRect(rectF, f6, f6, paint);
            } else {
                if (i2 < i3) {
                    paint.setColor(A00(i2, true));
                } else {
                    paint.setColor(A00(i2, false));
                }
                RectF rectF2 = this.A05;
                float f7 = height;
                rectF2.set(f4, 0.0f, f4 + f3, f7);
                float f8 = f7 / 2.0f;
                canvas.drawRoundRect(rectF2, f8, f8, paint);
            }
            f4 += f3 + min;
        }
        if (this.A03 != null) {
            invalidate();
        }
    }

    public void setCount(int i) {
        this.A01 = i;
        invalidate();
    }

    public void setPosition(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            this.A00 = 0.0f;
            invalidate();
        }
    }

    public void setProgressProvider(InterfaceC71733Xg interfaceC71733Xg) {
        this.A03 = interfaceC71733Xg;
        invalidate();
    }
}
