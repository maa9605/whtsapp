package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0SJ */
/* loaded from: classes.dex */
public final class C0SJ extends C0SK {
    public static final Matrix A0Y = new Matrix();
    public static final Paint A0Z = new Paint(1);
    public static final Path A0a = new Path();
    public static final C18630u3 A0b = new C18630u3();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public int A0F;
    public int A0G;
    public View A0H;
    public C0T5 A0I;
    public C18690uA A0J;
    public C016007m A0K;
    public Object A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final float A0S;
    public final float A0T;
    public final int A0U;
    public final float[] A0V;
    public final float[] A0W;
    public final float[] A0X;

    public C0SJ(C0T4 c0t4, C18750uG c18750uG) {
        super(c0t4);
        this.A0W = new float[2];
        this.A0V = new float[2];
        this.A0X = new float[2];
        C016007m c016007m = c18750uG.A02;
        this.A0K = c016007m;
        super.A00 = C18450tl.A02(c016007m.A01);
        super.A01 = C18450tl.A01(c016007m.A00);
        C18690uA c18690uA = c18750uG.A01;
        this.A0J = c18690uA == null ? C08N.A01("hue_240.0", new C1XA()) : c18690uA;
        this.A0N = c18750uG.A04;
        this.A0M = c18750uG.A03;
        this.A00 = 1.0f;
        super.A04 = true;
        super.A02 = 0.0f;
        float[] fArr = this.A0V;
        float[] fArr2 = c18750uG.A06;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        float[] fArr3 = this.A0W;
        float[] fArr4 = c18750uG.A07;
        fArr3[0] = fArr4[0];
        fArr3[1] = fArr4[1];
        float f = super.A06;
        this.A0T = 48.0f * f;
        this.A0U = (int) (8.0f * f);
        this.A0S = f * 5.0f;
        A0G();
    }

    @Override // X.C0SK
    public int A00(float f, float f2) {
        if (this.A0Q) {
            Matrix matrix = A0Y;
            matrix.setRotate(this.A06);
            float[] fArr = this.A0X;
            fArr[0] = this.A02 - this.A04;
            fArr[1] = this.A0B - this.A07;
            matrix.mapPoints(fArr);
            fArr[0] = fArr[0] + this.A0D;
            float f3 = (this.A0E - this.A0S) + fArr[1];
            fArr[1] = f3;
            int i = this.A0G;
            float f4 = this.A0F;
            float f5 = f3 - f4;
            float f6 = fArr[0];
            float f7 = i / 2;
            float f8 = f6 - f7;
            float f9 = f6 + f7;
            float f10 = this.A0T;
            if (f4 <= f10) {
                float f11 = this.A0C;
                f5 -= f11;
                f3 -= f11;
            }
            if (i <= f10) {
                float f12 = this.A03;
                f8 -= f12;
                f9 += f12;
            }
            if (f >= f8 && f <= f9 && f2 >= f5 && f2 <= f3) {
                this.A0O = true;
                return 2;
            }
        }
        this.A0O = false;
        if (A0J()) {
            long nanoTime = System.nanoTime();
            try {
                float[] fArr2 = this.A0X;
                fArr2[0] = f;
                fArr2[1] = f2;
                Matrix matrix2 = A0Y;
                matrix2.setRotate(-this.A06, this.A0D, this.A0E);
                matrix2.mapPoints(fArr2);
                float f13 = fArr2[0];
                float f14 = this.A0D;
                float f15 = f14 - this.A04;
                if (f13 >= f15 && f13 <= this.A05 + f14) {
                    float f16 = fArr2[1];
                    float f17 = this.A0E;
                    if (f16 >= f17 - this.A07 && f16 <= f17 + this.A01) {
                        return 2;
                    }
                }
                float f18 = this.A03;
                if (f13 >= f15 - f18 && f13 <= f14 + this.A05 + f18) {
                    float f19 = fArr2[1];
                    float f20 = this.A0E;
                    float f21 = this.A0C;
                    if (f19 >= (f20 - this.A07) - f21) {
                        if (f19 <= f20 + this.A01 + f21) {
                            return 1;
                        }
                    }
                }
                return 0;
            } finally {
                C18680u8.A0N.A03(System.nanoTime() - nanoTime);
            }
        }
        return 0;
    }

    @Override // X.C0SK
    public void A02() {
        A0D();
    }

    @Override // X.C0SK
    public void A03() {
        C0T5 c0t5 = this.A0I;
        if (c0t5 != null) {
            c0t5.AEF(this);
        }
    }

    @Override // X.C0SK
    public void A04(float f, float f2) {
        if (this.A0O) {
            this.A0P = true;
            A01();
        }
    }

    @Override // X.C0SK
    public void A05(float f, float f2) {
        if (this.A0O && this.A0P) {
            this.A0P = false;
            A01();
        }
    }

    @Override // X.C0SK
    public boolean A06(float f, float f2) {
        C0T5 c0t5 = this.A0I;
        if (c0t5 != null) {
            return c0t5.AEE(this);
        }
        return false;
    }

    @Override // X.C0SK
    public boolean A07(float f, float f2) {
        return false;
    }

    @Override // X.C0SK
    public boolean A08(float f, float f2) {
        C0T5 c0t5;
        C0T5 c0t52;
        C0T4 c0t4 = super.A0A;
        if (c0t4.A0E.A0U != null) {
            if ((!this.A0O || (c0t52 = this.A0I) == null || !c0t52.AEC(this)) && (c0t5 = this.A0I) != null && !c0t5.AED(this)) {
                A0E();
                c0t4.A08(C07K.A0h(A0C()), 500, null);
            }
            return true;
        }
        throw null;
    }

    @Override // X.C0SK
    public void A0B(Canvas canvas) {
        long nanoTime = System.nanoTime();
        try {
            Bitmap bitmap = this.A0J.A00;
            boolean z = this.A0Q && !(this.A0N == null && this.A0M == null);
            if (A0J()) {
                Paint paint = A0Z;
                paint.setAlpha((int) (this.A00 * 255.0f));
                Matrix matrix = A0Y;
                matrix.setTranslate(this.A0D - this.A04, this.A0E - this.A07);
                matrix.postRotate(this.A06, this.A0D, this.A0E);
                canvas.drawBitmap(bitmap, matrix, paint);
                paint.setAlpha(255);
                if (z) {
                    float[] fArr = this.A0X;
                    fArr[0] = this.A02;
                    fArr[1] = this.A0B;
                    matrix.mapPoints(fArr);
                    long nanoTime2 = System.nanoTime();
                    int i = this.A0G / 2;
                    if (this.A0R) {
                        Path path = A0a;
                        path.reset();
                        float f = i;
                        float f2 = fArr[1] - (this.A0F * 1);
                        float f3 = this.A0S;
                        float f4 = f3 * 1;
                        path.moveTo(fArr[0] - f, f2 - f4);
                        path.lineTo(fArr[0] + f, (fArr[1] - (this.A0F * 1)) - f4);
                        path.lineTo(fArr[0] + f, fArr[1] - f4);
                        path.lineTo(fArr[0] + f3, fArr[1] - f4);
                        path.lineTo(fArr[0], fArr[1]);
                        path.lineTo(fArr[0] - f3, fArr[1] - f4);
                        path.lineTo(fArr[0] - f, fArr[1] - f4);
                        path.close();
                        paint.setColor(-16777216);
                        paint.setShadowLayer(12.0f, 0.0f, 0.0f, -16777216);
                        canvas.drawPath(path, paint);
                        paint.setColor(this.A0P ? -2236963 : -1);
                        canvas.drawPath(path, paint);
                    }
                    matrix.setTranslate(fArr[0] - i, (fArr[1] - this.A0F) - this.A0S);
                    this.A0H.setDrawingCacheEnabled(true);
                    canvas.drawBitmap(this.A0H.getDrawingCache(), matrix, paint);
                    C18680u8.A0J.A03(System.nanoTime() - nanoTime2);
                }
            }
        } finally {
            C18680u8.A0M.A03(System.nanoTime() - nanoTime);
        }
    }

    public C016007m A0C() {
        return this.A0K;
    }

    public void A0D() {
        if (this.A0Q && super.A03 != 1) {
            super.A03 = 1;
            A03();
        }
        this.A0Q = false;
    }

    public void A0E() {
        A0F();
        if (super.A03 != 4) {
            super.A03 = 4;
            A03();
        }
        this.A0Q = true;
    }

    public final void A0F() {
        int i;
        int i2;
        View view = null;
        this.A0H = null;
        C0T4 c0t4 = super.A0A;
        InterfaceC18280tT interfaceC18280tT = c0t4.A08;
        if (interfaceC18280tT != null) {
            view = interfaceC18280tT.AAc(this);
            this.A0H = view;
            if (view != null) {
                this.A0R = false;
            } else {
                view = interfaceC18280tT.AAa(this);
                this.A0H = view;
                this.A0R = true;
            }
        }
        if (view != null) {
            if (view.getLayoutParams() == null) {
                this.A0H.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
        } else {
            this.A0R = true;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            Context context = super.A09;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            String str = this.A0N;
            if (str != null && this.A0M != null) {
                i2 = this.A0U;
                i = i2 / 3;
            } else {
                i = this.A0U;
                i2 = i;
            }
            if (str != null) {
                TextView textView = new TextView(context);
                textView.setPadding(i2, i2, i2, i);
                textView.setText(this.A0N);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMaxLines(1);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.setGravity(17);
                textView.setTextColor(-16777216);
                layoutParams.width = -1;
                linearLayout.addView(textView, layoutParams);
            }
            if (this.A0M != null) {
                TextView textView2 = new TextView(context);
                textView2.setPadding(i2, i, i2, i2);
                textView2.setText(this.A0M);
                textView2.setMaxLines(5);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTextColor(-12303292);
                layoutParams.gravity = 3;
                linearLayout.addView(textView2, layoutParams);
            }
            this.A0H = linearLayout;
        }
        this.A0H.measure(View.MeasureSpec.makeMeasureSpec(c0t4.A0E.getWidth(), EditorInfoCompat.IME_FLAG_FORCE_ASCII), View.MeasureSpec.makeMeasureSpec(c0t4.A0E.getHeight(), EditorInfoCompat.IME_FLAG_FORCE_ASCII));
        this.A0G = this.A0H.getMeasuredWidth();
        int measuredHeight = this.A0H.getMeasuredHeight();
        this.A0F = measuredHeight;
        this.A0H.layout(0, 0, this.A0G, measuredHeight);
        A0G();
        A01();
    }

    public final void A0G() {
        Bitmap bitmap = this.A0J.A00;
        float width = bitmap.getWidth();
        float[] fArr = this.A0V;
        float f = fArr[0] * width;
        this.A04 = f;
        this.A05 = width - f;
        float height = bitmap.getHeight();
        float f2 = fArr[1] * height;
        this.A07 = f2;
        this.A01 = height - f2;
        float[] fArr2 = this.A0W;
        this.A02 = fArr2[0] * width;
        this.A0B = fArr2[1] * height;
        float f3 = this.A0T;
        if (width < f3) {
            this.A03 = (f3 - width) / 2.0f;
        } else {
            this.A03 = 0.0f;
        }
        if (height < f3) {
            this.A0C = (f3 - height) / 2.0f;
        } else {
            this.A0C = 0.0f;
        }
        Matrix matrix = A0Y;
        matrix.setRotate(0.0f);
        float[] fArr3 = super.A0D;
        fArr3[0] = this.A04 - this.A02;
        fArr3[1] = this.A07 - this.A0B;
        matrix.mapPoints(fArr3);
        this.A0A = this.A0F + this.A0S + fArr3[1];
        float f4 = this.A0G >> 1;
        float f5 = fArr3[0];
        this.A08 = f4 + f5;
        this.A09 = f4 - f5;
    }

    public void A0H(C18690uA c18690uA) {
        if (c18690uA == null) {
            c18690uA = C08N.A01("hue_240.0", new C1XA());
        }
        this.A0J = c18690uA;
        A0G();
        A01();
    }

    public void A0I(C016007m c016007m) {
        this.A0K = c016007m;
        super.A00 = C18450tl.A02(c016007m.A01);
        super.A01 = C18450tl.A01(c016007m.A00);
        A01();
    }

    public final boolean A0J() {
        boolean z = this.A0Q && !(this.A0N == null && this.A0M == null);
        this.A06 = 0.0f + 0.0f;
        C18630u3 c18630u3 = A0b;
        double d = super.A00;
        C18450tl c18450tl = super.A0B;
        double A03 = d - c18450tl.A03(this.A04);
        c18630u3.A01 = A03;
        double A032 = c18450tl.A03(this.A05) + d;
        c18630u3.A02 = A032;
        double d2 = super.A01;
        double A033 = d2 - c18450tl.A03(this.A07);
        c18630u3.A03 = A033;
        c18630u3.A00 = c18450tl.A03(this.A01) + d2;
        if (z) {
            double A034 = d2 - c18450tl.A03(this.A0A);
            if (A034 < A033) {
                c18630u3.A03 = A034;
            }
            double A035 = d - c18450tl.A03(this.A08);
            if (A035 < A03) {
                c18630u3.A01 = A035;
            }
            double A036 = c18450tl.A03(this.A09) + d;
            if (A032 < A036) {
                c18630u3.A02 = A036;
            }
        }
        float[] fArr = super.A0D;
        C18630u3 c18630u32 = super.A0C;
        c18450tl.A0A(c18630u32);
        if (c18630u3.A00 >= c18630u32.A03 && c18630u3.A03 <= c18630u32.A00) {
            fArr[0] = (int) Math.ceil(c18630u32.A01 - c18630u3.A02);
            float floor = (int) Math.floor(c18630u32.A02 - c18630u3.A01);
            fArr[1] = floor;
            float f = fArr[0];
            if (f <= floor) {
                c18450tl.A07(d + f, d2, fArr);
                this.A0D = fArr[0];
                this.A0E = fArr[1];
                return true;
            }
            return false;
        }
        return false;
    }
}
