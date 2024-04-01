package com.whatsapp.ui.voip;

import X.C000200d;
import X.C000700j;
import X.C002301c;
import X.C06C;
import X.C08540bf;
import X.C0Zn;
import X.C2ZQ;
import X.InterfaceC52362ab;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.List;

/* loaded from: classes2.dex */
public class MultiContactThumbnail extends C2ZQ {
    public float A00;
    public int A01;
    public int A02;
    public Canvas A03;
    public Paint A04;
    public RectF A05;
    public C002301c A06;

    public MultiContactThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A00 = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C08540bf.A1f);
            this.A00 = obtainStyledAttributes.getDimension(1, 0.0f);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(0, this.A02);
            obtainStyledAttributes.recycle();
        }
        int i = ((int) this.A00) << 1;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        this.A03 = new Canvas(createBitmap);
        float f = i;
        this.A05 = new RectF(0.0f, 0.0f, f, f);
        this.A04 = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A04.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        setWillNotDraw(false);
    }

    public void A00(List list, C0Zn c0Zn, InterfaceC52362ab interfaceC52362ab) {
        boolean z = list.size() >= 1;
        StringBuilder A0P = C000200d.A0P("Value %d out of bounds for numImages");
        A0P.append(this.A01);
        C000700j.A08(z, A0P.toString());
        int size = list.size() <= 4 ? list.size() : 4;
        setNumImages(size);
        for (int i = 0; i < size; i++) {
            c0Zn.A04((C06C) list.get(i), (ImageView) getChildAt(i), false, interfaceC52362ab);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.A03.drawColor(0, PorterDuff.Mode.CLEAR);
        super.draw(this.A03);
        RectF rectF = this.A05;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0043, code lost:
        if (r0 <= 1) goto L33;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            int r0 = r14.A01
            r11 = 1
            if (r0 >= r11) goto L6
            return
        L6:
            int r7 = r14.getPaddingLeft()
            int r10 = r14.getPaddingTop()
            int r6 = r14.getMeasuredWidth()
            int r0 = r14.getPaddingRight()
            int r6 = r6 - r0
            int r9 = r14.getMeasuredHeight()
            int r0 = r14.getPaddingBottom()
            int r9 = r9 - r0
            X.01c r0 = r14.A06
            boolean r13 = r0.A0N()
            int r6 = r6 - r7
            int r9 = r9 - r10
            int r12 = r6 >> 1
            int r0 = r14.A02
            int r1 = r12 - r0
            int r5 = r9 >> 1
            int r4 = r5 - r0
            int r12 = r12 + r7
            int r12 = r12 + r0
            int r5 = r5 + r10
            int r5 = r5 + r0
            int r0 = r14.A01
            if (r0 == r11) goto L3b
            r6 = r1
        L3b:
            r8 = 3
            r3 = r4
            if (r0 > r8) goto L40
            r3 = r9
        L40:
            if (r13 == 0) goto L45
            r2 = r12
            if (r0 > r11) goto L46
        L45:
            r2 = r7
        L46:
            r0 = 0
            android.view.View r1 = r14.getChildAt(r0)
            int r0 = r2 + r6
            int r3 = r3 + r10
            r1.layout(r2, r10, r0, r3)
            int r0 = r14.A01
            if (r0 != r11) goto L56
            return
        L56:
            r3 = r12
            if (r13 == 0) goto L5a
            r3 = r7
        L5a:
            r2 = 2
            if (r0 <= r2) goto L5e
            r9 = r4
        L5e:
            android.view.View r0 = r14.getChildAt(r11)
            int r1 = r3 + r6
            int r9 = r9 + r10
            r0.layout(r3, r10, r1, r9)
            int r0 = r14.A01
            if (r0 != r2) goto L6d
            return
        L6d:
            android.view.View r0 = r14.getChildAt(r2)
            int r4 = r4 + r5
            r0.layout(r3, r5, r1, r4)
            int r0 = r14.A01
            if (r0 != r8) goto L7a
            return
        L7a:
            if (r13 == 0) goto L7d
            r7 = r12
        L7d:
            android.view.View r0 = r14.getChildAt(r8)
            int r6 = r6 + r7
            r0.layout(r7, r5, r6, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ui.voip.MultiContactThumbnail.onLayout(boolean, int, int, int, int):void");
    }

    private void setNumImages(int i) {
        if (i == this.A01) {
            invalidate();
            return;
        }
        if (i <= getChildCount()) {
            int childCount = getChildCount() - i;
            int childCount2 = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt((childCount2 - 1) - i2).setVisibility(8);
            }
        } else {
            int childCount3 = i - getChildCount();
            for (int i3 = 0; i3 < childCount3; i3++) {
                ImageView imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                addView(imageView);
            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 0) {
                childAt.setVisibility(0);
            }
        }
        this.A01 = i;
    }
}
