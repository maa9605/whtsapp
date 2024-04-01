package com.whatsapp;

import X.AbstractC35331iy;
import X.C017708g;
import X.C0AT;
import X.C0SG;
import X.C1DD;
import X.C1DV;
import X.C1L2;
import X.C24921Dj;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.whatsapp.QrImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public class QrImageView extends AbstractC35331iy {
    public static final Random A07 = new Random();
    public int A00;
    public Paint A01;
    public RectF A02;
    public Drawable A03;
    public C0SG A04;
    public ArrayList A05;
    public boolean A06;

    public QrImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = new Paint();
        this.A02 = new RectF();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A1d);
            this.A06 = obtainStyledAttributes.getBoolean(1, true);
            this.A00 = obtainStyledAttributes.getInt(0, -16777216);
            this.A03 = obtainStyledAttributes.getDrawable(2);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            try {
                this.A04 = C24921Dj.A01("This is a sample QR Code", C1DV.M, null);
            } catch (C1DD e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void A00(final C1L2 c1l2) {
        ArrayList arrayList = this.A05;
        if (arrayList == null || arrayList.isEmpty()) {
            C017708g c017708g = this.A04.A04;
            int i = c017708g.A01 * c017708g.A00;
            ArrayList arrayList2 = new ArrayList(i);
            this.A05 = arrayList2;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(Integer.valueOf(i2));
            }
        }
        Animation animation = new Animation() { // from class: X.1L3
            {
                QrImageView.this = this;
            }

            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                float f2;
                QrImageView qrImageView = QrImageView.this;
                C0SG c0sg = qrImageView.A04;
                if (c0sg == null) {
                    return;
                }
                if (f == 1.0f) {
                    qrImageView.A05.clear();
                } else {
                    if (f > 0.25f) {
                        f2 = (f - 0.25f) / 0.75f;
                    } else {
                        f2 = 0.0f;
                    }
                    C017708g c017708g2 = c0sg.A04;
                    int i3 = (int) ((1.0f - f2) * c017708g2.A01 * c017708g2.A00);
                    while (true) {
                        ArrayList arrayList3 = qrImageView.A05;
                        if (arrayList3.size() <= i3) {
                            break;
                        }
                        arrayList3.remove(QrImageView.A07.nextInt(arrayList3.size()));
                    }
                }
                qrImageView.invalidate();
            }
        };
        animation.setDuration(1200L);
        animation.setInterpolator(new LinearInterpolator());
        if (c1l2 != null) {
            animation.setAnimationListener(new Animation.AnimationListener() { // from class: X.1L1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation2) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation2) {
                }

                {
                    QrImageView.this = this;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation2) {
                    c1l2.AIp(QrImageView.this);
                }
            });
        }
        startAnimation(animation);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.A06 || this.A04 == null) {
            return;
        }
        A00(null);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A05 = null;
        clearAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C0SG c0sg = this.A04;
        if (c0sg == null) {
            return;
        }
        C017708g c017708g = c0sg.A04;
        int i = c017708g.A01;
        int i2 = c017708g.A00;
        float width = this.A02.width();
        float f = width / i;
        float height = this.A02.height() / i2;
        this.A01.setColor(-1);
        canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.A01);
        this.A01.setColor(this.A00);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (c017708g.A02[i4][i3] == 1) {
                    RectF rectF = this.A02;
                    float f2 = rectF.left;
                    float f3 = rectF.top;
                    canvas.drawRect((int) ((i3 * f) + f2), (int) ((i4 * height) + f3), ((i3 + 1) * f) + f2, ((i4 + 1) * height) + f3, this.A01);
                }
            }
        }
        this.A01.setColor(-1);
        if (this.A05 != null && !isInEditMode()) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                int i5 = intValue % i;
                int i6 = intValue / i;
                RectF rectF2 = this.A02;
                float f4 = rectF2.left;
                float f5 = rectF2.top;
                canvas.drawRect((int) ((i5 * f) + f4), (int) ((i6 * height) + f5), ((i5 + 1) * f) + f4, ((i6 + 1) * height) + f5, this.A01);
            }
        }
        if (this.A03 != null) {
            ArrayList arrayList = this.A05;
            if (arrayList == null || arrayList.isEmpty() || isInEditMode()) {
                this.A03.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            super.onMeasure(r10, r11)
            int r6 = r9.getMeasuredWidth()
            int r0 = r9.getPaddingLeft()
            int r6 = r6 - r0
            int r0 = r9.getPaddingRight()
            int r6 = r6 - r0
            int r5 = r9.getMeasuredHeight()
            int r0 = r9.getPaddingTop()
            int r5 = r5 - r0
            int r0 = r9.getPaddingBottom()
            int r5 = r5 - r0
            r8 = 1073741824(0x40000000, float:2.0)
            r7 = 0
            if (r6 <= r5) goto L6d
            int r0 = r6 - r5
            float r4 = (float) r0
            float r4 = r4 / r8
            r2 = r5
        L29:
            r0 = 0
        L2a:
            android.graphics.RectF r1 = r9.A02
            float r3 = (float) r2
            r1.set(r7, r7, r3, r3)
            android.graphics.RectF r1 = r9.A02
            r1.offset(r4, r0)
            android.graphics.RectF r2 = r9.A02
            int r0 = r9.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r9.getPaddingTop()
            float r0 = (float) r0
            r2.offset(r1, r0)
            android.graphics.drawable.Drawable r0 = r9.A03
            if (r0 == 0) goto L6c
            r0 = 1049414861(0x3e8ccccd, float:0.275)
            float r3 = r3 * r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r1
            int r4 = (int) r3
            int r6 = r6 - r4
            float r0 = (float) r6
            float r0 = r0 / r8
            float r0 = r0 + r1
            int r0 = (int) r0
            int r3 = r9.getPaddingLeft()
            int r3 = r3 + r0
            int r5 = r5 - r4
            float r0 = (float) r5
            float r0 = r0 / r8
            float r0 = r0 + r1
            int r0 = (int) r0
            int r2 = r9.getPaddingTop()
            int r2 = r2 + r0
            int r1 = r3 + r4
            int r4 = r4 + r2
            android.graphics.drawable.Drawable r0 = r9.A03
            r0.setBounds(r3, r2, r1, r4)
        L6c:
            return
        L6d:
            if (r5 <= r6) goto L76
            int r0 = r5 - r6
            float r0 = (float) r0
            float r0 = r0 / r8
            r2 = r6
            r4 = 0
            goto L2a
        L76:
            r2 = r6
            r4 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.QrImageView.onMeasure(int, int):void");
    }

    public void setQrCode(C0SG c0sg) {
        setQrCode(c0sg, null);
    }

    public void setQrCode(C0SG c0sg, C1L2 c1l2) {
        this.A04 = c0sg;
        if (this.A06 && C0AT.A0g(this) && c0sg != null) {
            A00(c1l2);
        } else if (c1l2 == null) {
        } else {
            c1l2.AIp(this);
        }
    }
}
