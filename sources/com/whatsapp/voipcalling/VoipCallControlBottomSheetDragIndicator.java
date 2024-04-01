package com.whatsapp.voipcalling;

import X.AnonymousClass088;
import X.C08540bf;
import X.C2Zv;
import X.InterfaceC74653dc;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I0_1;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class VoipCallControlBottomSheetDragIndicator extends C2Zv {
    public float A00;
    public float A01;
    public int A02;
    public final Paint A03;
    public final Path A04;

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Paint(1);
        this.A04 = new Path();
        this.A01 = -1.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A2r);
            try {
                int color = obtainStyledAttributes.getColor(0, -1);
                obtainStyledAttributes.recycle();
                this.A03.setStyle(Paint.Style.STROKE);
                this.A03.setStrokeCap(Paint.Cap.ROUND);
                this.A03.setStrokeWidth(context.getResources().getDisplayMetrics().density * 4.0f);
                this.A03.setColor(color);
                this.A00 = TypedValue.applyDimension(1, 2.5f, getResources().getDisplayMetrics());
                AnonymousClass088.A1U(this);
                setContentDescription(getContext().getString(this.A01 > 0.0f ? R.string.voip_joinable_minimize_participant_list_description : R.string.voip_joinable_expanding_participant_list_description));
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float width = getWidth() - getPaddingRight();
        float height = getHeight() - getPaddingBottom();
        float f = (height + paddingTop) / 2.0f;
        float f2 = this.A01;
        float f3 = (((height - paddingTop) / 2.0f) * f2) + f;
        float f4 = (this.A00 * (-f2)) + f;
        Path path = this.A04;
        path.reset();
        path.moveTo(paddingLeft, f4);
        path.lineTo((paddingLeft + width) / 2.0f, f3);
        path.lineTo(width, f4);
        canvas.drawPath(path, this.A03);
    }

    public void setOnClickListener(InterfaceC74653dc interfaceC74653dc) {
        super.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I0_1(this, interfaceC74653dc, 6));
    }

    public void setSlideOffset(float f) {
        float f2 = f > 1.0f ? 1.0f : f <= 0.0f ? -1.0f : (f - 0.5f) * 2.0f;
        this.A01 = f2;
        if (f2 == 1.0f || f2 == -1.0f) {
            Context context = getContext();
            int i = (this.A01 > 0.0f ? 1 : (this.A01 == 0.0f ? 0 : -1));
            int i2 = R.string.voip_joinable_expanding_participant_list_description;
            if (i > 0) {
                i2 = R.string.voip_joinable_minimize_participant_list_description;
            }
            setContentDescription(context.getString(i2));
        }
        invalidate();
    }
}
