package com.google.android.material.theme;

import X.C1SA;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.app.AppCompatViewInflater;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    public C1SA createButton(final Context context, final AttributeSet attributeSet) {
        return new C1SA(context, attributeSet) { // from class: X.1cs
            public int A00;
            public int A01;
            public int A02;
            public int A03;
            public ColorStateList A04;
            public PorterDuff.Mode A05;
            public Drawable A06;
            public final C24341Ak A07;

            {
                super(context, attributeSet, R.attr.materialButtonStyle);
                int i;
                Drawable insetDrawable;
                TypedArray A00 = C08560bh.A00(context, attributeSet, C08550bg.A0c, R.attr.materialButtonStyle, 2131952459, new int[0]);
                this.A02 = A00.getDimensionPixelSize(9, 0);
                this.A05 = AnonymousClass088.A0N(A00.getInt(12, -1), PorterDuff.Mode.SRC_IN);
                this.A04 = AnonymousClass088.A0L(getContext(), A00, 11);
                this.A06 = AnonymousClass088.A0O(getContext(), A00, 7);
                this.A00 = A00.getInteger(8, 1);
                this.A03 = A00.getDimensionPixelSize(10, 0);
                C24341Ak c24341Ak = new C24341Ak(this);
                this.A07 = c24341Ak;
                c24341Ak.A02 = A00.getDimensionPixelOffset(0, 0);
                c24341Ak.A03 = A00.getDimensionPixelOffset(1, 0);
                c24341Ak.A04 = A00.getDimensionPixelOffset(2, 0);
                c24341Ak.A01 = A00.getDimensionPixelOffset(3, 0);
                c24341Ak.A00 = A00.getDimensionPixelSize(6, 0);
                c24341Ak.A05 = A00.getDimensionPixelSize(15, 0);
                c24341Ak.A09 = AnonymousClass088.A0N(A00.getInt(5, -1), PorterDuff.Mode.SRC_IN);
                C31751cs c31751cs = c24341Ak.A0L;
                c24341Ak.A06 = AnonymousClass088.A0L(c31751cs.getContext(), A00, 4);
                c24341Ak.A08 = AnonymousClass088.A0L(c31751cs.getContext(), A00, 14);
                c24341Ak.A07 = AnonymousClass088.A0L(c31751cs.getContext(), A00, 13);
                Paint paint = c24341Ak.A0I;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(c24341Ak.A05);
                ColorStateList colorStateList = c24341Ak.A08;
                if (colorStateList != null) {
                    i = colorStateList.getColorForState(c31751cs.getDrawableState(), 0);
                } else {
                    i = 0;
                }
                paint.setColor(i);
                int A07 = C0AT.A07(c31751cs);
                int paddingTop = c31751cs.getPaddingTop();
                int A06 = C0AT.A06(c31751cs);
                int paddingBottom = c31751cs.getPaddingBottom();
                if (C24341Ak.A0M) {
                    insetDrawable = c24341Ak.A00();
                } else {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    c24341Ak.A0D = gradientDrawable;
                    gradientDrawable.setCornerRadius(c24341Ak.A00 + 1.0E-5f);
                    c24341Ak.A0D.setColor(-1);
                    Drawable A0I = C07O.A0I(c24341Ak.A0D);
                    c24341Ak.A0A = A0I;
                    C07O.A0Z(A0I, c24341Ak.A06);
                    PorterDuff.Mode mode = c24341Ak.A09;
                    if (mode != null) {
                        C07O.A0a(c24341Ak.A0A, mode);
                    }
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    c24341Ak.A0F = gradientDrawable2;
                    gradientDrawable2.setCornerRadius(c24341Ak.A00 + 1.0E-5f);
                    c24341Ak.A0F.setColor(-1);
                    Drawable A0I2 = C07O.A0I(c24341Ak.A0F);
                    c24341Ak.A0B = A0I2;
                    C07O.A0Z(A0I2, c24341Ak.A07);
                    insetDrawable = new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c24341Ak.A0A, c24341Ak.A0B}), c24341Ak.A02, c24341Ak.A04, c24341Ak.A03, c24341Ak.A01);
                }
                super.setBackgroundDrawable(insetDrawable);
                C0AT.A0Y(c31751cs, A07 + c24341Ak.A02, paddingTop + c24341Ak.A04, A06 + c24341Ak.A03, paddingBottom + c24341Ak.A01);
                A00.recycle();
                setCompoundDrawablePadding(this.A02);
                A00();
            }

            public final void A00() {
                Drawable drawable = this.A06;
                if (drawable != null) {
                    Drawable mutate = drawable.mutate();
                    this.A06 = mutate;
                    C07O.A0Z(mutate, this.A04);
                    PorterDuff.Mode mode = this.A05;
                    if (mode != null) {
                        C07O.A0a(this.A06, mode);
                    }
                    int i = this.A03;
                    if (i == 0) {
                        i = this.A06.getIntrinsicWidth();
                    }
                    int i2 = this.A03;
                    if (i2 == 0) {
                        i2 = this.A06.getIntrinsicHeight();
                    }
                    Drawable drawable2 = this.A06;
                    int i3 = this.A01;
                    drawable2.setBounds(i3, 0, i + i3, i2);
                }
                C07O.A0r(this, this.A06, null, null, null);
            }

            public final boolean A01() {
                C24341Ak c24341Ak = this.A07;
                return (c24341Ak == null || c24341Ak.A0H) ? false : true;
            }

            @Override // android.view.View
            public ColorStateList getBackgroundTintList() {
                return getSupportBackgroundTintList();
            }

            @Override // android.view.View
            public PorterDuff.Mode getBackgroundTintMode() {
                return getSupportBackgroundTintMode();
            }

            public int getCornerRadius() {
                if (A01()) {
                    return this.A07.A00;
                }
                return 0;
            }

            public Drawable getIcon() {
                return this.A06;
            }

            public int getIconGravity() {
                return this.A00;
            }

            public int getIconPadding() {
                return this.A02;
            }

            public int getIconSize() {
                return this.A03;
            }

            public ColorStateList getIconTint() {
                return this.A04;
            }

            public PorterDuff.Mode getIconTintMode() {
                return this.A05;
            }

            public ColorStateList getRippleColor() {
                if (A01()) {
                    return this.A07.A07;
                }
                return null;
            }

            public ColorStateList getStrokeColor() {
                if (A01()) {
                    return this.A07.A08;
                }
                return null;
            }

            public int getStrokeWidth() {
                if (A01()) {
                    return this.A07.A05;
                }
                return 0;
            }

            @Override // X.C1SA, X.InterfaceC02710Co
            public ColorStateList getSupportBackgroundTintList() {
                if (A01()) {
                    return this.A07.A06;
                }
                return super.getSupportBackgroundTintList();
            }

            @Override // X.C1SA, X.InterfaceC02710Co
            public PorterDuff.Mode getSupportBackgroundTintMode() {
                if (A01()) {
                    return this.A07.A09;
                }
                return super.getSupportBackgroundTintMode();
            }

            @Override // android.widget.TextView, android.view.View
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (Build.VERSION.SDK_INT < 21 && A01()) {
                    C24341Ak c24341Ak = this.A07;
                    if (c24341Ak != null) {
                        if (canvas != null && c24341Ak.A08 != null && c24341Ak.A05 > 0) {
                            Rect rect = c24341Ak.A0J;
                            rect.set(c24341Ak.A0L.getBackground().getBounds());
                            RectF rectF = c24341Ak.A0K;
                            float f = c24341Ak.A05 / 2.0f;
                            rectF.set(rect.left + f + c24341Ak.A02, rect.top + f + c24341Ak.A04, (rect.right - f) - c24341Ak.A03, (rect.bottom - f) - c24341Ak.A01);
                            float f2 = c24341Ak.A00 - (c24341Ak.A05 / 2.0f);
                            canvas.drawRoundRect(rectF, f2, f2, c24341Ak.A0I);
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            }

            @Override // X.C1SA, android.widget.TextView, android.view.View
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                C24341Ak c24341Ak;
                super.onLayout(z, i, i2, i3, i4);
                if (Build.VERSION.SDK_INT != 21 || (c24341Ak = this.A07) == null) {
                    return;
                }
                int i5 = i4 - i2;
                int i6 = i3 - i;
                GradientDrawable gradientDrawable = c24341Ak.A0E;
                if (gradientDrawable != null) {
                    gradientDrawable.setBounds(c24341Ak.A02, c24341Ak.A04, i6 - c24341Ak.A03, i5 - c24341Ak.A01);
                }
            }

            @Override // android.widget.TextView, android.view.View
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                if (this.A06 == null || this.A00 != 2) {
                    return;
                }
                int measureText = (int) getPaint().measureText(getText().toString());
                int i3 = this.A03;
                if (i3 == 0) {
                    i3 = this.A06.getIntrinsicWidth();
                }
                int measuredWidth = (((((getMeasuredWidth() - measureText) - C0AT.A06(this)) - i3) - this.A02) - C0AT.A07(this)) / 2;
                if (C0AT.A05(this) == 1) {
                    measuredWidth = -measuredWidth;
                }
                if (this.A01 != measuredWidth) {
                    this.A01 = measuredWidth;
                    A00();
                }
            }

            @Override // android.view.View
            public void setBackground(Drawable drawable) {
                setBackgroundDrawable(drawable);
            }

            @Override // android.view.View
            public void setBackgroundColor(int i) {
                GradientDrawable gradientDrawable;
                GradientDrawable gradientDrawable2;
                if (A01()) {
                    C24341Ak c24341Ak = this.A07;
                    if (c24341Ak != null) {
                        boolean z = C24341Ak.A0M;
                        if (z && (gradientDrawable2 = c24341Ak.A0C) != null) {
                            gradientDrawable2.setColor(i);
                            return;
                        } else if (z || (gradientDrawable = c24341Ak.A0D) == null) {
                            return;
                        } else {
                            gradientDrawable.setColor(i);
                            return;
                        }
                    }
                    throw null;
                }
                super.setBackgroundColor(i);
            }

            @Override // X.C1SA, android.view.View
            public void setBackgroundDrawable(Drawable drawable) {
                if (A01()) {
                    if (drawable != getBackground()) {
                        Log.i("MaterialButton", "Setting a custom background is not supported.");
                        C24341Ak c24341Ak = this.A07;
                        c24341Ak.A0H = true;
                        C31751cs c31751cs = c24341Ak.A0L;
                        c31751cs.setSupportBackgroundTintList(c24341Ak.A06);
                        c31751cs.setSupportBackgroundTintMode(c24341Ak.A09);
                        super.setBackgroundDrawable(drawable);
                        return;
                    }
                    getBackground().setState(drawable.getState());
                    return;
                }
                super.setBackgroundDrawable(drawable);
            }

            @Override // X.C1SA, android.view.View
            public void setBackgroundResource(int i) {
                Drawable drawable;
                if (i != 0) {
                    drawable = C09L.A01(getContext(), i);
                } else {
                    drawable = null;
                }
                setBackgroundDrawable(drawable);
            }

            @Override // android.view.View
            public void setBackgroundTintList(ColorStateList colorStateList) {
                setSupportBackgroundTintList(colorStateList);
            }

            @Override // android.view.View
            public void setBackgroundTintMode(PorterDuff.Mode mode) {
                setSupportBackgroundTintMode(mode);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void setCornerRadius(int r9) {
                /*
                    r8 = this;
                    boolean r0 = r8.A01()
                    if (r0 == 0) goto L87
                    X.1Ak r3 = r8.A07
                    int r0 = r3.A00
                    if (r0 == r9) goto L87
                    r3.A00 = r9
                    boolean r7 = X.C24341Ak.A0M
                    r6 = 925353388(0x3727c5ac, float:1.0E-5)
                    if (r7 == 0) goto L8a
                    android.graphics.drawable.GradientDrawable r0 = r3.A0C
                    if (r0 == 0) goto L8a
                    android.graphics.drawable.GradientDrawable r0 = r3.A0G
                    if (r0 == 0) goto L8a
                    android.graphics.drawable.GradientDrawable r0 = r3.A0E
                    if (r0 == 0) goto L8a
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r0 = 21
                    if (r1 != r0) goto L76
                    r5 = 0
                    r0 = 0
                    if (r7 == 0) goto L88
                    X.1cs r2 = r3.A0L
                    android.graphics.drawable.Drawable r1 = r2.getBackground()
                    if (r1 == 0) goto L88
                    android.graphics.drawable.Drawable r1 = r2.getBackground()
                    android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
                    android.graphics.drawable.Drawable r1 = r1.getDrawable(r5)
                    android.graphics.drawable.InsetDrawable r1 = (android.graphics.drawable.InsetDrawable) r1
                    android.graphics.drawable.Drawable r1 = r1.getDrawable()
                    android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
                    android.graphics.drawable.Drawable r1 = r1.getDrawable(r5)
                    android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
                L4b:
                    float r4 = (float) r9
                    float r4 = r4 + r6
                    r1.setCornerRadius(r4)
                    if (r7 == 0) goto L73
                    X.1cs r2 = r3.A0L
                    android.graphics.drawable.Drawable r1 = r2.getBackground()
                    if (r1 == 0) goto L73
                    android.graphics.drawable.Drawable r0 = r2.getBackground()
                    android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
                    android.graphics.drawable.Drawable r0 = r0.getDrawable(r5)
                    android.graphics.drawable.InsetDrawable r0 = (android.graphics.drawable.InsetDrawable) r0
                    android.graphics.drawable.Drawable r1 = r0.getDrawable()
                    android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
                    r0 = 1
                    android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
                    android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
                L73:
                    r0.setCornerRadius(r4)
                L76:
                    android.graphics.drawable.GradientDrawable r0 = r3.A0C
                    float r1 = (float) r9
                    float r1 = r1 + r6
                    r0.setCornerRadius(r1)
                    android.graphics.drawable.GradientDrawable r0 = r3.A0G
                    r0.setCornerRadius(r1)
                    android.graphics.drawable.GradientDrawable r0 = r3.A0E
                    r0.setCornerRadius(r1)
                L87:
                    return
                L88:
                    r1 = r0
                    goto L4b
                L8a:
                    if (r7 != 0) goto L87
                    android.graphics.drawable.GradientDrawable r2 = r3.A0D
                    if (r2 == 0) goto L87
                    android.graphics.drawable.GradientDrawable r0 = r3.A0F
                    if (r0 == 0) goto L87
                    float r1 = (float) r9
                    float r1 = r1 + r6
                    r2.setCornerRadius(r1)
                    android.graphics.drawable.GradientDrawable r0 = r3.A0F
                    r0.setCornerRadius(r1)
                    X.1cs r0 = r3.A0L
                    r0.invalidate()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C31751cs.setCornerRadius(int):void");
            }

            public void setCornerRadiusResource(int i) {
                if (A01()) {
                    setCornerRadius(getResources().getDimensionPixelSize(i));
                }
            }

            public void setIcon(Drawable drawable) {
                if (this.A06 != drawable) {
                    this.A06 = drawable;
                    A00();
                }
            }

            public void setIconGravity(int i) {
                this.A00 = i;
            }

            public void setIconPadding(int i) {
                if (this.A02 != i) {
                    this.A02 = i;
                    setCompoundDrawablePadding(i);
                }
            }

            public void setIconResource(int i) {
                Drawable drawable;
                if (i != 0) {
                    drawable = C09L.A01(getContext(), i);
                } else {
                    drawable = null;
                }
                setIcon(drawable);
            }

            public void setIconSize(int i) {
                if (i >= 0) {
                    if (this.A03 != i) {
                        this.A03 = i;
                        A00();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("iconSize cannot be less than 0");
            }

            public void setIconTint(ColorStateList colorStateList) {
                if (this.A04 != colorStateList) {
                    this.A04 = colorStateList;
                    A00();
                }
            }

            public void setIconTintMode(PorterDuff.Mode mode) {
                if (this.A05 != mode) {
                    this.A05 = mode;
                    A00();
                }
            }

            public void setIconTintResource(int i) {
                setIconTint(C09L.A00(getContext(), i));
            }

            public void setInternalBackground(Drawable drawable) {
                super.setBackgroundDrawable(drawable);
            }

            public void setRippleColor(ColorStateList colorStateList) {
                Drawable drawable;
                if (A01()) {
                    C24341Ak c24341Ak = this.A07;
                    if (c24341Ak.A07 != colorStateList) {
                        c24341Ak.A07 = colorStateList;
                        boolean z = C24341Ak.A0M;
                        if (z) {
                            C31751cs c31751cs = c24341Ak.A0L;
                            if (c31751cs.getBackground() instanceof RippleDrawable) {
                                ((RippleDrawable) c31751cs.getBackground()).setColor(colorStateList);
                                return;
                            }
                        }
                        if (z || (drawable = c24341Ak.A0B) == null) {
                            return;
                        }
                        C07O.A0Z(drawable, colorStateList);
                    }
                }
            }

            public void setRippleColorResource(int i) {
                if (A01()) {
                    setRippleColor(C09L.A00(getContext(), i));
                }
            }

            public void setStrokeColor(ColorStateList colorStateList) {
                if (A01()) {
                    C24341Ak c24341Ak = this.A07;
                    if (c24341Ak.A08 != colorStateList) {
                        c24341Ak.A08 = colorStateList;
                        c24341Ak.A0I.setColor(colorStateList != null ? colorStateList.getColorForState(c24341Ak.A0L.getDrawableState(), 0) : 0);
                        boolean z = C24341Ak.A0M;
                        if (z && c24341Ak.A0G != null) {
                            super.setBackgroundDrawable(c24341Ak.A00());
                        } else if (z) {
                        } else {
                            c24341Ak.A0L.invalidate();
                        }
                    }
                }
            }

            public void setStrokeColorResource(int i) {
                if (A01()) {
                    setStrokeColor(C09L.A00(getContext(), i));
                }
            }

            public void setStrokeWidth(int i) {
                if (A01()) {
                    C24341Ak c24341Ak = this.A07;
                    if (c24341Ak.A05 != i) {
                        c24341Ak.A05 = i;
                        c24341Ak.A0I.setStrokeWidth(i);
                        boolean z = C24341Ak.A0M;
                        if (z && c24341Ak.A0G != null) {
                            super.setBackgroundDrawable(c24341Ak.A00());
                        } else if (z) {
                        } else {
                            c24341Ak.A0L.invalidate();
                        }
                    }
                }
            }

            public void setStrokeWidthResource(int i) {
                if (A01()) {
                    setStrokeWidth(getResources().getDimensionPixelSize(i));
                }
            }

            @Override // X.C1SA, X.InterfaceC02710Co
            public void setSupportBackgroundTintList(ColorStateList colorStateList) {
                if (A01()) {
                    C24341Ak c24341Ak = this.A07;
                    if (c24341Ak.A06 != colorStateList) {
                        c24341Ak.A06 = colorStateList;
                        if (C24341Ak.A0M) {
                            c24341Ak.A01();
                            return;
                        }
                        Drawable drawable = c24341Ak.A0A;
                        if (drawable == null) {
                            return;
                        }
                        C07O.A0Z(drawable, colorStateList);
                    }
                } else if (this.A07 == null) {
                } else {
                    super.setSupportBackgroundTintList(colorStateList);
                }
            }

            @Override // X.C1SA, X.InterfaceC02710Co
            public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
                if (A01()) {
                    C24341Ak c24341Ak = this.A07;
                    if (c24341Ak.A09 != mode) {
                        c24341Ak.A09 = mode;
                        if (C24341Ak.A0M) {
                            c24341Ak.A01();
                            return;
                        }
                        Drawable drawable = c24341Ak.A0A;
                        if (drawable == null || mode == null) {
                            return;
                        }
                        C07O.A0a(drawable, mode);
                    }
                } else if (this.A07 == null) {
                } else {
                    super.setSupportBackgroundTintMode(mode);
                }
            }
        };
    }
}
