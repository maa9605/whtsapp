package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* renamed from: X.1B4  reason: invalid class name */
/* loaded from: classes.dex */
public class C1B4 {
    public Typeface A00;
    public boolean A01 = false;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final ColorStateList A09;
    public final ColorStateList A0A;
    public final ColorStateList A0B;
    public final ColorStateList A0C;
    public final String A0D;

    public C1B4(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C08550bg.A0w);
        this.A05 = obtainStyledAttributes.getDimension(0, 0.0f);
        this.A0A = AnonymousClass088.A0L(context, obtainStyledAttributes, 3);
        this.A0B = AnonymousClass088.A0L(context, obtainStyledAttributes, 4);
        this.A0C = AnonymousClass088.A0L(context, obtainStyledAttributes, 5);
        this.A07 = obtainStyledAttributes.getInt(2, 0);
        this.A08 = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.A06 = obtainStyledAttributes.getResourceId(i2, 0);
        this.A0D = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.A09 = AnonymousClass088.A0L(context, obtainStyledAttributes, 6);
        this.A02 = obtainStyledAttributes.getFloat(7, 0.0f);
        this.A03 = obtainStyledAttributes.getFloat(8, 0.0f);
        this.A04 = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void A00() {
        Typeface typeface;
        Typeface typeface2 = this.A00;
        if (typeface2 == null) {
            typeface2 = Typeface.create(this.A0D, this.A07);
            this.A00 = typeface2;
        }
        if (typeface2 == null) {
            int i = this.A08;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
                this.A00 = typeface;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
                this.A00 = typeface;
            } else if (i != 3) {
                typeface = Typeface.DEFAULT;
                this.A00 = typeface;
            } else {
                typeface = Typeface.MONOSPACE;
                this.A00 = typeface;
            }
            if (typeface != null) {
                this.A00 = Typeface.create(typeface, this.A07);
            }
        }
    }

    public void A01(Context context, TextPaint textPaint, C0X1 c0x1) {
        int i;
        int i2;
        A02(context, textPaint, c0x1);
        ColorStateList colorStateList = this.A0A;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.A04;
        float f2 = this.A02;
        float f3 = this.A03;
        ColorStateList colorStateList2 = this.A09;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    public void A02(Context context, final TextPaint textPaint, final C0X1 c0x1) {
        if (this.A01) {
            A03(textPaint, this.A00);
        } else {
            A00();
            if (context.isRestricted()) {
                this.A01 = true;
                A03(textPaint, this.A00);
            } else {
                try {
                    int i = this.A06;
                    C0X1 c0x12 = new C0X1() { // from class: X.1ea
                        @Override // X.C0X1
                        public void A01(int i2) {
                            C1B4 c1b4 = C1B4.this;
                            c1b4.A00();
                            c1b4.A01 = true;
                            c0x1.A01(i2);
                        }

                        @Override // X.C0X1
                        public void A03(Typeface typeface) {
                            C1B4 c1b4 = C1B4.this;
                            c1b4.A00 = Typeface.create(typeface, c1b4.A07);
                            c1b4.A03(textPaint, typeface);
                            c1b4.A01 = true;
                            c0x1.A03(typeface);
                        }
                    };
                    if (!context.isRestricted()) {
                        C002701i.A0C(context, i, new TypedValue(), 0, c0x12, false);
                    } else {
                        c0x12.A00(-4);
                    }
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                } catch (Exception e) {
                    StringBuilder A0P = C000200d.A0P("Error loading font ");
                    A0P.append(this.A0D);
                    Log.d("TextAppearance", A0P.toString(), e);
                }
            }
        }
        if (this.A01) {
            return;
        }
        A03(textPaint, this.A00);
    }

    public void A03(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.A07;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.A05);
    }
}
