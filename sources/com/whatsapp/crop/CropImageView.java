package com.whatsapp.crop;

import X.C2KN;
import X.C2KQ;
import X.RunnableC59812tS;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class CropImageView extends C2KN {
    public float A00;
    public float A01;
    public int A02;
    public C2KQ A03;
    public boolean A04;
    public final ArrayList A05;

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = new ArrayList();
        this.A03 = null;
    }

    @Override // X.C2KO
    public void A03(float f, float f2, float f3) {
        super.A03(f, f2, f3);
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            C2KQ c2kq = (C2KQ) it.next();
            c2kq.A03.set(getImageMatrix());
            c2kq.A04 = c2kq.A02();
        }
    }

    public void A06(C2KQ c2kq) {
        Rect rect = c2kq.A04;
        int max = Math.max(0, -rect.left);
        int min = Math.min(0, getWidth() - rect.right);
        int max2 = Math.max(0, -rect.top);
        int min2 = Math.min(0, getHeight() - rect.bottom);
        if (max == 0 && rect.width() <= getWidth()) {
            max = min;
        }
        if (max2 == 0 && rect.height() <= getHeight()) {
            max2 = min2;
        }
        if (max == 0 && max2 == 0) {
            return;
        }
        float f = max;
        float f2 = max2;
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        A02(f, f2);
        setImageMatrix(getImageViewMatrix());
    }

    public final void A07(C2KQ c2kq) {
        Rect rect = c2kq.A04;
        float max = Math.max(1.0f, getScale() * Math.min((getWidth() / rect.width()) * 0.6f, (getHeight() / rect.height()) * 0.6f));
        if (Math.abs(max - getScale()) / max > 0.1d) {
            float[] fArr = {c2kq.A05.centerX(), c2kq.A05.centerY()};
            getImageMatrix().mapPoints(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
            RunnableEBaseShape1S0200000_I0_1 runnableEBaseShape1S0200000_I0_1 = new RunnableEBaseShape1S0200000_I0_1(this, c2kq, 31);
            this.A09.post(new RunnableC59812tS(this, System.currentTimeMillis(), getScale(), (max - getScale()) / 300.0f, f, f2, runnableEBaseShape1S0200000_I0_1));
        }
    }

    @Override // android.view.View
    public void clearFocus() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A05;
            if (i >= arrayList.size()) {
                return;
            }
            C2KQ c2kq = (C2KQ) arrayList.get(i);
            c2kq.A09 = false;
            c2kq.A04 = c2kq.A02();
            i++;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        if (!this.A04) {
            super.onDraw(canvas);
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A05;
            if (i >= arrayList.size()) {
                return;
            }
            C2KQ c2kq = (C2KQ) arrayList.get(i);
            if (c2kq != null) {
                Path path = new Path();
                float f = c2kq.A07.getResources().getDisplayMetrics().density;
                c2kq.A0D.setStrokeWidth(0.5f + f);
                Rect rect = new Rect();
                c2kq.A07.getDrawingRect(rect);
                if (c2kq.A08) {
                    float width = c2kq.A04.width();
                    float height = c2kq.A04.height();
                    Rect rect2 = c2kq.A04;
                    float f2 = width / 2.0f;
                    path.addCircle(rect2.left + f2, (height / 2.0f) + rect2.top, f2, Path.Direction.CW);
                    c2kq.A0D.setColor(-1112874);
                } else {
                    path.addRect(new RectF(c2kq.A04), Path.Direction.CW);
                    c2kq.A0D.setColor(1728053247);
                    Rect rect3 = new Rect();
                    rect3.set(rect);
                    rect3.right = c2kq.A04.left;
                    if (c2kq.A09) {
                        paint = c2kq.A0B;
                    } else {
                        paint = c2kq.A0C;
                    }
                    canvas.drawRect(rect3, paint);
                    rect3.set(rect);
                    Rect rect4 = c2kq.A04;
                    rect3.right = rect4.right;
                    rect3.left = rect4.left;
                    rect3.bottom = rect4.top;
                    if (c2kq.A09) {
                        paint2 = c2kq.A0B;
                    } else {
                        paint2 = c2kq.A0C;
                    }
                    canvas.drawRect(rect3, paint2);
                    rect3.set(rect);
                    Rect rect5 = c2kq.A04;
                    rect3.right = rect5.right;
                    rect3.left = rect5.left;
                    rect3.top = rect5.bottom;
                    if (c2kq.A09) {
                        paint3 = c2kq.A0B;
                    } else {
                        paint3 = c2kq.A0C;
                    }
                    canvas.drawRect(rect3, paint3);
                    rect3.set(rect);
                    rect3.left = c2kq.A04.right;
                    if (c2kq.A09) {
                        paint4 = c2kq.A0B;
                    } else {
                        paint4 = c2kq.A0C;
                    }
                    canvas.drawRect(rect3, paint4);
                    int round = Math.round(f);
                    Rect rect6 = c2kq.A04;
                    int i2 = rect6.left + round;
                    int i3 = rect6.right - round;
                    int i4 = rect6.top;
                    int i5 = i4 + round;
                    int i6 = rect6.bottom;
                    int i7 = i6 - round;
                    float f3 = i2;
                    float f4 = ((i6 - i4) / 3) + i4;
                    float f5 = i3;
                    Paint paint5 = c2kq.A0D;
                    canvas.drawLine(f3, f4, f5, f4, paint5);
                    Rect rect7 = c2kq.A04;
                    int i8 = rect7.bottom;
                    float f6 = i8 - ((i8 - rect7.top) / 3);
                    canvas.drawLine(f3, f6, f5, f6, paint5);
                    Rect rect8 = c2kq.A04;
                    int i9 = rect8.left;
                    float f7 = ((rect8.right - i9) / 3) + i9;
                    float f8 = i5;
                    float f9 = i7;
                    canvas.drawLine(f7, f8, f7, f9, paint5);
                    Rect rect9 = c2kq.A04;
                    int i10 = rect9.right;
                    float f10 = i10 - ((i10 - rect9.left) / 3);
                    canvas.drawLine(f10, f8, f10, f9, paint5);
                }
                Paint paint6 = c2kq.A0D;
                canvas.drawPath(path, paint6);
                float f11 = 2.0f * f;
                int round2 = Math.round(f11);
                Rect rect10 = c2kq.A04;
                int i11 = rect10.left + round2;
                int i12 = rect10.right - round2;
                int i13 = rect10.top + round2;
                int i14 = rect10.bottom - round2;
                int i15 = (int) (f * 24.0f);
                int min = Math.min(i15, rect10.width() >> 2);
                int min2 = Math.min(i15, c2kq.A04.height() >> 2);
                Rect rect11 = c2kq.A04;
                int i16 = rect11.left;
                int i17 = ((rect11.right - i16) / 2) + i16;
                int i18 = rect11.top;
                int i19 = ((rect11.bottom - i18) / 2) + i18;
                paint6.setStrokeWidth(f11);
                paint6.setColor(-1);
                paint6.setStrokeCap(Paint.Cap.SQUARE);
                int i20 = min >> 1;
                float f12 = i17 - i20;
                float f13 = i13;
                float f14 = i17 + i20;
                canvas.drawLine(f12, f13, f14, f13, paint6);
                float f15 = i14;
                canvas.drawLine(f12, f15, f14, f15, paint6);
                float f16 = i11;
                int i21 = min2 >> 1;
                float f17 = i19 - i21;
                float f18 = i19 + i21;
                canvas.drawLine(f16, f17, f16, f18, paint6);
                float f19 = i12;
                canvas.drawLine(f19, f17, f19, f18, paint6);
                float f20 = i11 + min;
                canvas.drawLine(f16, f13, f20, f13, paint6);
                float f21 = i13 + min2;
                canvas.drawLine(f16, f13, f16, f21, paint6);
                float f22 = i12 - min;
                canvas.drawLine(f19, f13, f22, f13, paint6);
                canvas.drawLine(f19, f13, f19, f21, paint6);
                canvas.drawLine(f19, f15, f22, f15, paint6);
                float f23 = i14 - min2;
                canvas.drawLine(f19, f15, f19, f23, paint6);
                canvas.drawLine(f16, f15, f20, f15, paint6);
                canvas.drawLine(f16, f15, f16, f23, paint6);
                i++;
            } else {
                throw null;
            }
        }
    }

    @Override // X.C2KO, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0A.A00 != null) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                C2KQ c2kq = (C2KQ) it.next();
                c2kq.A03.set(getImageMatrix());
                c2kq.A04 = c2kq.A02();
                if (c2kq.A09) {
                    A07(c2kq);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x03d1, code lost:
        if (r12[1] != 0.0f) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
        if (r0 != 3) goto L213;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.crop.CropImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
