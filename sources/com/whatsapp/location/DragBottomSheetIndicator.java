package com.whatsapp.location;

import X.AbstractC67113Eg;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class DragBottomSheetIndicator extends AbstractC67113Eg {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public final Paint A06;
    public final Paint A07;
    public final Path A08;

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = new Paint(1);
        this.A07 = new Paint(1);
        this.A08 = new Path();
        this.A06.setStyle(Paint.Style.STROKE);
        this.A06.setStrokeCap(Paint.Cap.SQUARE);
        this.A06.setStrokeWidth(context.getResources().getDisplayMetrics().density * 2.0f);
        this.A06.setColor(-1);
        this.A07.setStyle(Paint.Style.STROKE);
        this.A07.setStrokeCap(Paint.Cap.ROUND);
        this.A07.setStrokeJoin(Paint.Join.ROUND);
        this.A07.setStrokeWidth(context.getResources().getDisplayMetrics().density * 4.0f);
        this.A07.setColor(855638016);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
        if (r7.A04 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
        if (r4 >= 0.0f) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
        if (r7.A04 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
        r4 = (float) (r4 * 0.25d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (r4 > 0.0f) goto L16;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.onDraw(r8)
            float r5 = r7.A00
            float r0 = r7.A01
            float r4 = r5 - r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 * r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r7.A03
            long r2 = r2 - r0
            float r0 = (float) r2
            float r4 = r4 / r0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L71
            r4 = 0
        L1f:
            int r6 = r7.getPaddingLeft()
            int r2 = r7.getPaddingTop()
            int r5 = r7.getWidth()
            int r0 = r7.getPaddingRight()
            int r5 = r5 - r0
            int r1 = r7.getHeight()
            int r0 = r7.getPaddingBottom()
            int r1 = r1 - r0
            int r0 = r1 + r2
            int r0 = r0 >> 1
            float r3 = (float) r0
            int r1 = r1 - r2
            float r1 = (float) r1
            boolean r0 = r7.A04
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L48
            r2 = -1090519040(0xffffffffbf000000, float:-0.5)
        L48:
            float r2 = r2 + r4
            float r2 = r2 * r1
            float r2 = r2 + r3
            android.graphics.Path r1 = r7.A08
            r1.reset()
            float r0 = (float) r6
            r1.moveTo(r0, r2)
            int r6 = r6 + r5
            int r0 = r6 >> 1
            float r0 = (float) r0
            r1.lineTo(r0, r3)
            float r0 = (float) r5
            r1.lineTo(r0, r2)
            android.graphics.Paint r0 = r7.A07
            r8.drawPath(r1, r0)
            android.graphics.Paint r0 = r7.A06
            r8.drawPath(r1, r0)
            boolean r0 = r7.A05
            if (r0 == 0) goto L70
            r7.invalidate()
        L70:
            return
        L71:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L89
            r4 = 1065353216(0x3f800000, float:1.0)
        L77:
            boolean r0 = r7.A04
            if (r0 == 0) goto L83
        L7b:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1f
        L7f:
            boolean r0 = r7.A04
            if (r0 == 0) goto L1f
        L83:
            double r2 = (double) r4
            r0 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r2 = r2 * r0
            float r4 = (float) r2
            goto L1f
        L89:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L90
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L7f
        L90:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7b
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.DragBottomSheetIndicator.onDraw(android.graphics.Canvas):void");
    }

    public void setExpanded(boolean z) {
        this.A04 = z;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        invalidate();
    }

    public void setOffset(float f) {
        this.A03 = this.A02;
        this.A01 = this.A00;
        this.A02 = SystemClock.elapsedRealtime();
        this.A00 = f;
        invalidate();
    }

    public void setUpdating(boolean z) {
        this.A05 = z;
        if (z) {
            invalidate();
        }
    }
}
