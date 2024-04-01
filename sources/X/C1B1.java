package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.view.View;

/* renamed from: X.1B1  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1B1 {
    public static final boolean A0j;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0G;
    public float A0H;
    public float A0I;
    public int A0J;
    public int A0L;
    public TimeInterpolator A0N;
    public TimeInterpolator A0O;
    public ColorStateList A0P;
    public ColorStateList A0Q;
    public Bitmap A0R;
    public Paint A0S;
    public Typeface A0T;
    public Typeface A0U;
    public Typeface A0V;
    public CharSequence A0W;
    public CharSequence A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int[] A0c;
    public final Rect A0d;
    public final Rect A0e;
    public final RectF A0f;
    public final TextPaint A0g;
    public final TextPaint A0h;
    public final View A0i;
    public int A0M = 16;
    public int A0K = 16;
    public float A0F = 15.0f;
    public float A05 = 15.0f;

    static {
        A0j = Build.VERSION.SDK_INT < 18;
    }

    public C1B1(View view) {
        this.A0i = view;
        TextPaint textPaint = new TextPaint(129);
        this.A0g = textPaint;
        this.A0h = new TextPaint(textPaint);
        this.A0d = new Rect();
        this.A0e = new Rect();
        this.A0f = new RectF();
    }

    public static int A00(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static boolean A01(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    public float A02() {
        if (this.A0W == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.A0h;
        textPaint.setTextSize(this.A05);
        textPaint.setTypeface(this.A0T);
        CharSequence charSequence = this.A0W;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public float A03() {
        TextPaint textPaint = this.A0h;
        textPaint.setTextSize(this.A05);
        textPaint.setTypeface(this.A0T);
        return -textPaint.ascent();
    }

    public int A04() {
        int[] iArr = this.A0c;
        if (iArr != null) {
            return this.A0P.getColorForState(iArr, 0);
        }
        return this.A0P.getDefaultColor();
    }

    public final Typeface A05(int i) {
        TypedArray obtainStyledAttributes = this.A0i.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r1.height() <= 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06() {
        /*
            r2 = this;
            android.graphics.Rect r1 = r2.A0d
            int r0 = r1.width()
            if (r0 <= 0) goto L1d
            int r0 = r1.height()
            if (r0 <= 0) goto L1d
            android.graphics.Rect r1 = r2.A0e
            int r0 = r1.width()
            if (r0 <= 0) goto L1d
            int r1 = r1.height()
            r0 = 1
            if (r1 > 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            r2.A0Z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B1.A06():void");
    }

    public void A07() {
        float f;
        Rect rect;
        Rect rect2;
        View view = this.A0i;
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            return;
        }
        float f2 = this.A08;
        A0A(this.A05);
        CharSequence charSequence = this.A0X;
        if (charSequence != null) {
            f = this.A0g.measureText(charSequence, 0, charSequence.length());
        } else {
            f = 0.0f;
        }
        int A01 = C07O.A01(this.A0K, this.A0a ? 1 : 0);
        int i = A01 & 112;
        if (i == 48) {
            rect = this.A0d;
            this.A01 = rect.top - this.A0g.ascent();
        } else if (i != 80) {
            TextPaint textPaint = this.A0g;
            float descent = ((textPaint.descent() - textPaint.ascent()) / 2.0f) - textPaint.descent();
            rect = this.A0d;
            this.A01 = rect.centerY() + descent;
        } else {
            rect = this.A0d;
            this.A01 = rect.bottom;
        }
        int i2 = A01 & 8388615;
        if (i2 == 1) {
            this.A00 = rect.centerX() - (f / 2.0f);
        } else if (i2 != 5) {
            this.A00 = rect.left;
        } else {
            this.A00 = rect.right - f;
        }
        A0A(this.A0F);
        CharSequence charSequence2 = this.A0X;
        float measureText = charSequence2 != null ? this.A0g.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int A012 = C07O.A01(this.A0M, this.A0a ? 1 : 0);
        int i3 = A012 & 112;
        if (i3 == 48) {
            rect2 = this.A0e;
            this.A0A = rect2.top - this.A0g.ascent();
        } else if (i3 != 80) {
            TextPaint textPaint2 = this.A0g;
            float descent2 = ((textPaint2.descent() - textPaint2.ascent()) / 2.0f) - textPaint2.descent();
            rect2 = this.A0e;
            this.A0A = rect2.centerY() + descent2;
        } else {
            rect2 = this.A0e;
            this.A0A = rect2.bottom;
        }
        int i4 = A012 & 8388615;
        if (i4 == 1) {
            this.A09 = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.A09 = rect2.left;
        } else {
            this.A09 = rect2.right - measureText;
        }
        Bitmap bitmap = this.A0R;
        if (bitmap != null) {
            bitmap.recycle();
            this.A0R = null;
        }
        A0B(f2);
        A09(this.A0B);
    }

    public void A08(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.A0B) {
            this.A0B = f;
            A09(f);
        }
    }

    public final void A09(float f) {
        TextPaint textPaint;
        int defaultColor;
        RectF rectF = this.A0f;
        Rect rect = this.A0e;
        float f2 = rect.left;
        Rect rect2 = this.A0d;
        float f3 = rect2.left;
        TimeInterpolator timeInterpolator = this.A0N;
        float f4 = f;
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f);
        }
        rectF.left = ((f3 - f2) * f4) + f2;
        float f5 = this.A0A;
        float f6 = this.A01;
        TimeInterpolator timeInterpolator2 = this.A0N;
        float f7 = f;
        if (timeInterpolator2 != null) {
            f7 = timeInterpolator2.getInterpolation(f);
        }
        rectF.top = ((f6 - f5) * f7) + f5;
        float f8 = rect.right;
        float f9 = rect2.right;
        TimeInterpolator timeInterpolator3 = this.A0N;
        float f10 = f;
        if (timeInterpolator3 != null) {
            f10 = timeInterpolator3.getInterpolation(f);
        }
        rectF.right = ((f9 - f8) * f10) + f8;
        float f11 = rect.bottom;
        float f12 = rect2.bottom;
        TimeInterpolator timeInterpolator4 = this.A0N;
        float f13 = f;
        if (timeInterpolator4 != null) {
            f13 = timeInterpolator4.getInterpolation(f);
        }
        rectF.bottom = ((f12 - f11) * f13) + f11;
        float f14 = this.A09;
        float f15 = this.A00;
        TimeInterpolator timeInterpolator5 = this.A0N;
        float f16 = f;
        if (timeInterpolator5 != null) {
            f16 = timeInterpolator5.getInterpolation(f);
        }
        this.A06 = ((f15 - f14) * f16) + f14;
        float f17 = this.A0A;
        float f18 = this.A01;
        TimeInterpolator timeInterpolator6 = this.A0N;
        float f19 = f;
        if (timeInterpolator6 != null) {
            f19 = timeInterpolator6.getInterpolation(f);
        }
        this.A07 = ((f18 - f17) * f19) + f17;
        float f20 = this.A0F;
        float f21 = this.A05;
        TimeInterpolator timeInterpolator7 = this.A0O;
        float f22 = f;
        if (timeInterpolator7 != null) {
            f22 = timeInterpolator7.getInterpolation(f);
        }
        A0B(((f21 - f20) * f22) + f20);
        ColorStateList colorStateList = this.A0P;
        ColorStateList colorStateList2 = this.A0Q;
        if (colorStateList != colorStateList2) {
            textPaint = this.A0g;
            int[] iArr = this.A0c;
            if (iArr != null) {
                defaultColor = colorStateList2.getColorForState(iArr, 0);
            } else {
                defaultColor = colorStateList2.getDefaultColor();
            }
            textPaint.setColor(A00(defaultColor, A04(), f));
        } else {
            textPaint = this.A0g;
            textPaint.setColor(A04());
        }
        float f23 = this.A0E;
        float f24 = this.A04;
        TimeInterpolator timeInterpolator8 = null;
        float f25 = f;
        if (0 != 0) {
            f25 = timeInterpolator8.getInterpolation(f);
        }
        float f26 = ((f24 - f23) * f25) + f23;
        float f27 = this.A0C;
        float f28 = this.A02;
        float f29 = f;
        if (0 != 0) {
            f29 = timeInterpolator8.getInterpolation(f);
        }
        float f30 = ((f28 - f27) * f29) + f27;
        float f31 = this.A0D;
        float f32 = this.A03;
        float f33 = f;
        if (0 != 0) {
            f33 = timeInterpolator8.getInterpolation(f);
        }
        textPaint.setShadowLayer(f26, f30, ((f32 - f31) * f33) + f31, A00(this.A0L, this.A0J, f));
        this.A0i.postInvalidateOnAnimation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r0 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A(float r11) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B1.A0A(float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r9.A0G == 1.0f) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0B(float r10) {
        /*
            r9 = this;
            r9.A0A(r10)
            boolean r0 = X.C1B1.A0j
            r2 = 0
            if (r0 == 0) goto L11
            float r1 = r9.A0G
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 != 0) goto L12
        L11:
            r0 = 0
        L12:
            r9.A0b = r0
            if (r0 == 0) goto L81
            android.graphics.Bitmap r0 = r9.A0R
            if (r0 != 0) goto L81
            android.graphics.Rect r0 = r9.A0e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L81
            java.lang.CharSequence r0 = r9.A0X
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L81
            r0 = 0
            r9.A09(r0)
            android.text.TextPaint r8 = r9.A0g
            float r0 = r8.ascent()
            r9.A0H = r0
            float r0 = r8.descent()
            r9.A0I = r0
            java.lang.CharSequence r1 = r9.A0X
            int r0 = r1.length()
            float r0 = r8.measureText(r1, r2, r0)
            int r2 = java.lang.Math.round(r0)
            float r1 = r9.A0I
            float r0 = r9.A0H
            float r1 = r1 - r0
            int r1 = java.lang.Math.round(r1)
            if (r2 <= 0) goto L81
            if (r1 <= 0) goto L81
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r9.A0R = r0
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            java.lang.CharSequence r3 = r9.A0X
            r4 = 0
            int r5 = r3.length()
            r6 = 0
            float r7 = (float) r1
            float r0 = r8.descent()
            float r7 = r7 - r0
            r2.drawText(r3, r4, r5, r6, r7, r8)
            android.graphics.Paint r0 = r9.A0S
            if (r0 != 0) goto L81
            r1 = 3
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r9.A0S = r0
        L81:
            android.view.View r0 = r9.A0i
            r0.postInvalidateOnAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B1.A0B(float):void");
    }

    public void A0C(int i) {
        Context context = this.A0i.getContext();
        C0V9 c0v9 = new C0V9(context, context.obtainStyledAttributes(i, C0UY.A0b));
        TypedArray typedArray = c0v9.A02;
        if (typedArray.hasValue(3)) {
            this.A0P = c0v9.A01(3);
        }
        if (typedArray.hasValue(0)) {
            this.A05 = typedArray.getDimensionPixelSize(0, (int) this.A05);
        }
        this.A0J = typedArray.getInt(6, 0);
        this.A02 = typedArray.getFloat(7, 0.0f);
        this.A03 = typedArray.getFloat(8, 0.0f);
        this.A04 = typedArray.getFloat(9, 0.0f);
        typedArray.recycle();
        this.A0T = A05(i);
        A07();
    }

    public void A0D(int i) {
        Context context = this.A0i.getContext();
        C0V9 c0v9 = new C0V9(context, context.obtainStyledAttributes(i, C0UY.A0b));
        TypedArray typedArray = c0v9.A02;
        if (typedArray.hasValue(3)) {
            this.A0Q = c0v9.A01(3);
        }
        if (typedArray.hasValue(0)) {
            this.A0F = typedArray.getDimensionPixelSize(0, (int) this.A0F);
        }
        this.A0L = typedArray.getInt(6, 0);
        this.A0C = typedArray.getFloat(7, 0.0f);
        this.A0D = typedArray.getFloat(8, 0.0f);
        this.A0E = typedArray.getFloat(9, 0.0f);
        typedArray.recycle();
        this.A0V = A05(i);
        A07();
    }

    public void A0E(ColorStateList colorStateList) {
        if (this.A0P != colorStateList) {
            this.A0P = colorStateList;
            A07();
        }
    }

    public void A0F(Canvas canvas) {
        boolean z;
        int save = canvas.save();
        if (this.A0X != null && this.A0Z) {
            float f = this.A06;
            float f2 = this.A07;
            if (this.A0b && this.A0R != null) {
                z = true;
                f2 += this.A0H * this.A0G;
            } else {
                z = false;
                TextPaint textPaint = this.A0g;
                textPaint.ascent();
                textPaint.descent();
            }
            float f3 = this.A0G;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.A0R, f, f2, this.A0S);
            } else {
                CharSequence charSequence = this.A0X;
                canvas.drawText(charSequence, 0, charSequence.length(), f, f2, this.A0g);
            }
        }
        canvas.restoreToCount(save);
    }

    public void A0G(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.A0W)) {
            this.A0W = charSequence;
            this.A0X = null;
            Bitmap bitmap = this.A0R;
            if (bitmap != null) {
                bitmap.recycle();
                this.A0R = null;
            }
            A07();
        }
    }
}
