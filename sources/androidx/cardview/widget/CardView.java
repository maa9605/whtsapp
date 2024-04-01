package androidx.cardview.widget;

import X.C11940ia;
import X.C1Sg;
import X.C1Si;
import X.C28481Se;
import X.InterfaceC11950ic;
import X.InterfaceC11960id;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final InterfaceC11960id A07;
    public static final int[] A08 = {16842801};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final Rect A04;
    public final Rect A05;
    public final InterfaceC11950ic A06;

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        InterfaceC11960id c1Si;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            c1Si = new InterfaceC11960id() { // from class: X.1Sg
                @Override // X.InterfaceC11960id
                public void AEw() {
                }

                @Override // X.InterfaceC11960id
                public ColorStateList A8U(InterfaceC11950ic interfaceC11950ic) {
                    return ((C11970ie) ((C28481Se) interfaceC11950ic).A00).A02;
                }

                @Override // X.InterfaceC11960id
                public float A9u(InterfaceC11950ic interfaceC11950ic) {
                    return ((C28481Se) interfaceC11950ic).A01.getElevation();
                }

                @Override // X.InterfaceC11960id
                public float AB4(InterfaceC11950ic interfaceC11950ic) {
                    return ((C11970ie) ((C28481Se) interfaceC11950ic).A00).A00;
                }

                @Override // X.InterfaceC11960id
                public float ABQ(InterfaceC11950ic interfaceC11950ic) {
                    return ((C11970ie) ((C28481Se) interfaceC11950ic).A00).A01 * 2.0f;
                }

                @Override // X.InterfaceC11960id
                public float ABS(InterfaceC11950ic interfaceC11950ic) {
                    return ((C11970ie) ((C28481Se) interfaceC11950ic).A00).A01 * 2.0f;
                }

                @Override // X.InterfaceC11960id
                public float ACh(InterfaceC11950ic interfaceC11950ic) {
                    return ((C11970ie) ((C28481Se) interfaceC11950ic).A00).A01;
                }

                @Override // X.InterfaceC11960id
                public void AF0(InterfaceC11950ic interfaceC11950ic, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
                    C11970ie c11970ie = new C11970ie(colorStateList, f);
                    C28481Se c28481Se = (C28481Se) interfaceC11950ic;
                    c28481Se.A00 = c11970ie;
                    CardView cardView = c28481Se.A01;
                    cardView.setBackgroundDrawable(c11970ie);
                    cardView.setClipToOutline(true);
                    cardView.setElevation(f2);
                    ATJ(interfaceC11950ic, f3);
                }

                @Override // X.InterfaceC11960id
                public void AIj(InterfaceC11950ic interfaceC11950ic) {
                    ATJ(interfaceC11950ic, ((C11970ie) ((C28481Se) interfaceC11950ic).A00).A00);
                }

                @Override // X.InterfaceC11960id
                public void ANI(InterfaceC11950ic interfaceC11950ic) {
                    ATJ(interfaceC11950ic, ((C11970ie) ((C28481Se) interfaceC11950ic).A00).A00);
                }

                @Override // X.InterfaceC11960id
                public void ASj(InterfaceC11950ic interfaceC11950ic, ColorStateList colorStateList) {
                    C11970ie c11970ie = (C11970ie) ((C28481Se) interfaceC11950ic).A00;
                    c11970ie.A01(colorStateList);
                    c11970ie.invalidateSelf();
                }

                @Override // X.InterfaceC11960id
                public void AT0(InterfaceC11950ic interfaceC11950ic, float f) {
                    ((C28481Se) interfaceC11950ic).A01.setElevation(f);
                }

                @Override // X.InterfaceC11960id
                public void ATJ(InterfaceC11950ic interfaceC11950ic, float f) {
                    C28481Se c28481Se = (C28481Se) interfaceC11950ic;
                    C11970ie c11970ie = (C11970ie) c28481Se.A00;
                    CardView cardView = c28481Se.A01;
                    boolean z = cardView.A02;
                    boolean z2 = cardView.A03;
                    if (f != c11970ie.A00 || c11970ie.A06 != z || c11970ie.A07 != z2) {
                        c11970ie.A00 = f;
                        c11970ie.A06 = z;
                        c11970ie.A07 = z2;
                        c11970ie.A02(null);
                        c11970ie.invalidateSelf();
                    }
                    if (!cardView.A02) {
                        c28481Se.A00(0, 0, 0, 0);
                        return;
                    }
                    C11970ie c11970ie2 = (C11970ie) c28481Se.A00;
                    float f2 = c11970ie2.A00;
                    float f3 = c11970ie2.A01;
                    boolean z3 = cardView.A03;
                    float f4 = f2;
                    if (z3) {
                        f4 = (float) (((1.0d - C11990ig.A0H) * f3) + f2);
                    }
                    int ceil = (int) Math.ceil(f4);
                    int ceil2 = (int) Math.ceil(C11990ig.A00(f2, f3, z3));
                    c28481Se.A00(ceil, ceil2, ceil, ceil2);
                }

                @Override // X.InterfaceC11960id
                public void ATk(InterfaceC11950ic interfaceC11950ic, float f) {
                    C11970ie c11970ie = (C11970ie) ((C28481Se) interfaceC11950ic).A00;
                    if (f != c11970ie.A01) {
                        c11970ie.A01 = f;
                        c11970ie.A02(null);
                        c11970ie.invalidateSelf();
                    }
                }
            };
            A07 = c1Si;
        } else if (i >= 17) {
            c1Si = new C1Si() { // from class: X.1o1
                @Override // X.C1Si, X.InterfaceC11960id
                public void AEw() {
                    C11990ig.A0G = new InterfaceC11980if() { // from class: X.1Sf
                        @Override // X.InterfaceC11980if
                        public void A7U(Canvas canvas, RectF rectF, float f, Paint paint) {
                            canvas.drawRoundRect(rectF, f, f, paint);
                        }
                    };
                }
            };
            A07 = c1Si;
        } else {
            c1Si = new C1Si();
            A07 = c1Si;
        }
        c1Si.AEw();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        int color;
        ColorStateList valueOf;
        this.A04 = new Rect();
        this.A05 = new Rect();
        this.A06 = new C28481Se(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11940ia.A00, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(A08);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.cardview_light_background);
            } else {
                color = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.A02 = obtainStyledAttributes.getBoolean(7, false);
        this.A03 = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.A04.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        this.A04.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        this.A04.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        this.A04.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        A07.AF0(this.A06, context, valueOf, dimension, dimension2, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return A07.A8U(this.A06);
    }

    public float getCardElevation() {
        return A07.A9u(this.A06);
    }

    public int getContentPaddingBottom() {
        return this.A04.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A04.left;
    }

    public int getContentPaddingRight() {
        return this.A04.right;
    }

    public int getContentPaddingTop() {
        return this.A04.top;
    }

    public float getMaxCardElevation() {
        return A07.AB4(this.A06);
    }

    public boolean getPreventCornerOverlap() {
        return this.A03;
    }

    public float getRadius() {
        return A07.ACh(this.A06);
    }

    public boolean getUseCompatPadding() {
        return this.A02;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        InterfaceC11960id interfaceC11960id = A07;
        if (!(interfaceC11960id instanceof C1Sg)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC11960id.ABS(this.A06)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC11960id.ABQ(this.A06)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        A07.ASj(this.A06, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A07.ASj(this.A06, colorStateList);
    }

    public void setCardElevation(float f) {
        A07.AT0(this.A06, f);
    }

    public void setMaxCardElevation(float f) {
        A07.ATJ(this.A06, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.A00 = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.A01 = i;
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            A07.ANI(this.A06);
        }
    }

    public void setRadius(float f) {
        A07.ATk(this.A06, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            A07.AIj(this.A06);
        }
    }
}
