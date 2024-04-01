package com.whatsapp.voipcalling;

import X.AbstractC84603u1;
import X.C02160Ac;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class VoipCallControlRingingDotsIndicator extends AbstractC84603u1 {
    public int A00;
    public int A01;
    public Paint A02;
    public float[] A03;

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new float[3];
        this.A02 = new Paint(1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.call_control_bottom_ringing_dots_radius);
        this.A01 = dimensionPixelSize;
        this.A00 = dimensionPixelSize << 1;
        this.A02.setColor(C02160Ac.A00(getContext(), 17170443));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        do {
            this.A02.setAlpha((int) (this.A03[i] * 255.0f));
            int i2 = this.A00 << 1;
            int i3 = this.A01;
            float f = (i2 * i) + i3;
            float f2 = i3;
            canvas.drawCircle(f, f2, f2, this.A02);
            i++;
        } while (i < 3);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.A00;
        setMeasuredDimension(i3 * 5, i3);
    }
}
