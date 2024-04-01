package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.0aQ */
/* loaded from: classes.dex */
public class C07990aQ {
    public Typeface A02;
    public C08020aT A03;
    public C08020aT A04;
    public C08020aT A05;
    public C08020aT A06;
    public C08020aT A07;
    public C08020aT A08;
    public C08020aT A09;
    public boolean A0A;
    public final TextView A0B;
    public final C08010aS A0C;
    public int A01 = 0;
    public int A00 = -1;

    public C07990aQ(TextView textView) {
        this.A0B = textView;
        this.A0C = new C08010aS(textView);
    }

    public static C08020aT A00(Context context, C0UV c0uv, int i) {
        ColorStateList A03 = c0uv.A03(context, i);
        if (A03 != null) {
            C08020aT c08020aT = new C08020aT();
            c08020aT.A02 = true;
            c08020aT.A00 = A03;
            return c08020aT;
        }
        return null;
    }

    public void A01() {
        if (this.A05 != null || this.A09 != null || this.A06 != null || this.A03 != null) {
            Drawable[] compoundDrawables = this.A0B.getCompoundDrawables();
            A06(compoundDrawables[0], this.A05);
            A06(compoundDrawables[1], this.A09);
            A06(compoundDrawables[2], this.A06);
            A06(compoundDrawables[3], this.A03);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.A07 == null && this.A04 == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.A0B.getCompoundDrawablesRelative();
            A06(compoundDrawablesRelative[0], this.A07);
            A06(compoundDrawablesRelative[2], this.A04);
        }
    }

    public void A02(int i) {
        C08010aS c08010aS = this.A0C;
        if (!(c08010aS.A09 instanceof C04850Mb)) {
            if (i == 0) {
                c08010aS.A03 = 0;
                c08010aS.A01 = -1.0f;
                c08010aS.A00 = -1.0f;
                c08010aS.A02 = -1.0f;
                c08010aS.A07 = new int[0];
                c08010aS.A06 = false;
            } else if (i == 1) {
                DisplayMetrics displayMetrics = c08010aS.A08.getResources().getDisplayMetrics();
                c08010aS.A04(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (c08010aS.A06()) {
                    c08010aS.A03();
                }
            } else {
                throw new IllegalArgumentException(C000200d.A0D("Unknown auto-size text type: ", i));
            }
        }
    }

    public void A03(int i, int i2, int i3, int i4) {
        C08010aS c08010aS = this.A0C;
        if (!(c08010aS.A09 instanceof C04850Mb)) {
            DisplayMetrics displayMetrics = c08010aS.A08.getResources().getDisplayMetrics();
            c08010aS.A04(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c08010aS.A06()) {
                c08010aS.A03();
            }
        }
    }

    public void A04(Context context, int i) {
        String string;
        ColorStateList A01;
        C0V9 c0v9 = new C0V9(context, context.obtainStyledAttributes(i, C0UY.A0b));
        TypedArray typedArray = c0v9.A02;
        if (typedArray.hasValue(14)) {
            this.A0B.setAllCaps(typedArray.getBoolean(14, false));
        }
        if (Build.VERSION.SDK_INT < 23 && typedArray.hasValue(3) && (A01 = c0v9.A01(3)) != null) {
            this.A0B.setTextColor(A01);
        }
        if (typedArray.hasValue(0) && typedArray.getDimensionPixelSize(0, -1) == 0) {
            this.A0B.setTextSize(0, 0.0f);
        }
        A05(context, c0v9);
        if (Build.VERSION.SDK_INT >= 26 && typedArray.hasValue(13) && (string = typedArray.getString(13)) != null) {
            this.A0B.setFontVariationSettings(string);
        }
        typedArray.recycle();
        Typeface typeface = this.A02;
        if (typeface != null) {
            this.A0B.setTypeface(typeface, this.A01);
        }
    }

    public final void A05(Context context, C0V9 c0v9) {
        String string;
        Typeface A0C;
        int i = this.A01;
        TypedArray typedArray = c0v9.A02;
        this.A01 = typedArray.getInt(2, i);
        if (Build.VERSION.SDK_INT >= 28) {
            int i2 = typedArray.getInt(11, -1);
            this.A00 = i2;
            if (i2 != -1) {
                this.A01 = (this.A01 & 2) | 0;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.A0A = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 == 1) {
                    this.A02 = Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.A02 = Typeface.SERIF;
                    return;
                } else if (i3 == 3) {
                    this.A02 = Typeface.MONOSPACE;
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        this.A02 = null;
        int i4 = typedArray.hasValue(12) ? 12 : 10;
        int i5 = this.A00;
        int i6 = this.A01;
        if (!context.isRestricted()) {
            C0X1 c0x1 = new C0X1(this, i5, i6) { // from class: X.0aW
                public final int A00;
                public final int A01;
                public final WeakReference A02;

                @Override // X.C0X1
                public void A01(int i7) {
                }

                {
                    this.A02 = new WeakReference(this);
                    this.A00 = i5;
                    this.A01 = i6;
                }

                @Override // X.C0X1
                public void A03(Typeface typeface) {
                    int i7;
                    WeakReference weakReference = this.A02;
                    C07990aQ c07990aQ = (C07990aQ) weakReference.get();
                    if (c07990aQ == null) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 28 && (i7 = this.A00) != -1) {
                        typeface = Typeface.create(typeface, i7, (this.A01 & 2) != 0);
                    }
                    c07990aQ.A0B.post(new Runnable(weakReference, typeface) { // from class: X.0hD
                        public final Typeface A00;
                        public final WeakReference A01;

                        {
                            this.A01 = weakReference;
                            this.A00 = typeface;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            C07990aQ c07990aQ2 = (C07990aQ) this.A01.get();
                            if (c07990aQ2 == null) {
                                return;
                            }
                            Typeface typeface2 = this.A00;
                            if (c07990aQ2.A0A) {
                                c07990aQ2.A0B.setTypeface(typeface2);
                                c07990aQ2.A02 = typeface2;
                            }
                        }
                    });
                }
            };
            try {
                int i7 = this.A01;
                int resourceId = typedArray.getResourceId(i4, 0);
                if (resourceId != 0) {
                    TypedValue typedValue = c0v9.A00;
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        c0v9.A00 = typedValue;
                    }
                    Context context2 = c0v9.A01;
                    if (!context2.isRestricted() && (A0C = C002701i.A0C(context2, resourceId, typedValue, i7, c0x1, true)) != null) {
                        if (Build.VERSION.SDK_INT < 28 || this.A00 == -1) {
                            this.A02 = A0C;
                        } else {
                            this.A02 = Typeface.create(Typeface.create(A0C, 0), this.A00, (this.A01 & 2) != 0);
                        }
                    }
                }
                this.A0A = this.A02 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.A02 == null && (string = typedArray.getString(i4)) != null) {
            if (Build.VERSION.SDK_INT < 28 || this.A00 == -1) {
                this.A02 = Typeface.create(string, this.A01);
            } else {
                this.A02 = Typeface.create(Typeface.create(string, 0), this.A00, (this.A01 & 2) != 0);
            }
        }
    }

    public final void A06(Drawable drawable, C08020aT c08020aT) {
        if (drawable == null || c08020aT == null) {
            return;
        }
        C06720Us.A02(drawable, c08020aT, this.A0B.getDrawableState());
    }

    /* JADX WARN: Removed duplicated region for block: B:279:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:495:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07990aQ.A07(android.util.AttributeSet, int):void");
    }

    public void A08(int[] iArr, int i) {
        C08010aS c08010aS = this.A0C;
        if (!(c08010aS.A09 instanceof C04850Mb)) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c08010aS.A08.getResources().getDisplayMetrics();
                    do {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                        i2++;
                    } while (i2 < length);
                }
                c08010aS.A07 = C08010aS.A02(iArr2);
                if (!c08010aS.A07()) {
                    StringBuilder A0P = C000200d.A0P("None of the preset sizes is valid: ");
                    A0P.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(A0P.toString());
                }
            } else {
                c08010aS.A05 = false;
            }
            if (c08010aS.A06()) {
                c08010aS.A03();
            }
        }
    }

    public boolean A09() {
        C08010aS c08010aS = this.A0C;
        return ((c08010aS.A09 instanceof C04850Mb) ^ true) && c08010aS.A03 != 0;
    }
}
