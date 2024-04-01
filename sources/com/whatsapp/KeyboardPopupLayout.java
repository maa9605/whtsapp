package com.whatsapp;

import X.AbstractC08230az;
import X.C02180Ae;
import X.C0R7;
import X.C2MB;
import X.InterfaceC08240b0;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class KeyboardPopupLayout extends AbstractC08230az implements InterfaceC08240b0 {
    public int A00;
    public int A01;
    public int A02;
    public Paint A03;
    public C0R7 A04;
    public C2MB A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;
    public final int[] A09;

    public KeyboardPopupLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = false;
        this.A02 = -1;
        this.A01 = -1;
        this.A08 = new Rect();
        this.A09 = new int[2];
    }

    @Override // X.InterfaceC08240b0
    public void A6B() {
        if (this.A04 != null) {
            this.A04 = null;
            requestLayout();
        }
    }

    @Override // X.InterfaceC08240b0
    public boolean AFV() {
        return this.A06;
    }

    private int getSizeWithKeyboard() {
        int i = getResources().getConfiguration().orientation;
        if (i != 1) {
            if (i != 2) {
                return -1;
            }
            return this.A01;
        }
        return this.A02;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.A06) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public void invalidate(int i, int i2, int i3, int i4) {
        if (this.A06) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        if (this.A06) {
            return;
        }
        super.invalidate(rect);
    }

    @Override // X.InterfaceC08240b0
    public void lock() {
        this.A06 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.A03 == null || this.A00 == getHeight()) {
            return;
        }
        Rect rect = this.A08;
        rect.set(0, this.A00, getWidth(), getHeight());
        canvas.drawRect(rect, this.A03);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A06) {
            return;
        }
        if (this.A04 != null) {
            super.onLayout(z, i, i2, i3, i2 + this.A00);
            int[] iArr = this.A09;
            getLocationInWindow(iArr);
            if (this.A07) {
                C0R7 c0r7 = this.A04;
                c0r7.update(getPaddingLeft() + iArr[0], 1000000, (i3 - i) - getPaddingRight(), c0r7.A01);
                return;
            }
            C0R7 c0r72 = this.A04;
            c0r72.update(getPaddingLeft() + iArr[0], iArr[1] + this.A00, (i3 - i) - getPaddingRight(), c0r72.A01);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        C0R7 c0r7;
        if (isInEditMode()) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = -1;
        boolean z = true;
        if (!this.A07) {
            int size = View.MeasureSpec.getSize(i2);
            Activity A0F = C02180Ae.A0F(getContext());
            if (A0F == null || Build.VERSION.SDK_INT < 24 || !A0F.isInMultiWindowMode()) {
                if (this.A05 != null && C2MB.A00(this) && ((c0r7 = this.A04) == null || !c0r7.isShowing())) {
                    int i4 = getResources().getConfiguration().orientation;
                    if (i4 == 1) {
                        this.A02 = size;
                    } else if (i4 == 2) {
                        this.A01 = size;
                    }
                }
                int sizeWithKeyboard = getSizeWithKeyboard();
                if (sizeWithKeyboard != -1) {
                    i3 = size - sizeWithKeyboard;
                }
            }
            this.A00 = size;
            C0R7 c0r72 = this.A04;
            if (c0r72 != null) {
                c0r72.A01 = c0r72.A01(i3);
                int mode = View.MeasureSpec.getMode(i2);
                if (mode != 0 && this.A05 != null && !C2MB.A00(this)) {
                    this.A00 -= this.A04.A01;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A00, mode));
                setMeasuredDimension(getMeasuredWidth(), size);
                return;
            }
            super.onMeasure(i, i2);
        } else if (this.A04 != null) {
            z = (this.A05 == null || C2MB.A00(this)) ? false : false;
            int size2 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            C0R7 c0r73 = this.A04;
            c0r73.A01 = c0r73.A01(-1);
            int i5 = this.A04.A01;
            if (mode2 == 1073741824) {
                if (z) {
                    size2 -= i5;
                }
                this.A00 = size2;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2, mode2));
                setMeasuredDimension(getMeasuredWidth(), this.A00);
            } else if (mode2 == Integer.MIN_VALUE) {
                int i6 = size2;
                if (z) {
                    i6 = size2 - i5;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i6, mode2));
                this.A00 = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                if (z) {
                    measuredHeight += i5;
                }
                setMeasuredDimension(measuredWidth, Math.min(measuredHeight, size2));
            } else {
                if (z) {
                    size2 -= i5;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2, mode2));
                this.A00 = getMeasuredHeight() + (z ? i5 : 0);
                setMeasuredDimension(getMeasuredWidth(), this.A00);
            }
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.A06) {
            return;
        }
        super.requestLayout();
    }

    public void setHeightShouldWrap(boolean z) {
        this.A07 = z;
    }

    @Override // X.InterfaceC08240b0
    public void setKeyboardPopup(C0R7 c0r7) {
        if (this.A04 != c0r7) {
            this.A04 = c0r7;
            requestLayout();
        }
    }

    public void setKeyboardPopupBackgroundColor(int i) {
        if (this.A03 == null) {
            this.A03 = new Paint(1);
        }
        setWillNotDraw(false);
        this.A03.setColor(i);
    }

    @Override // X.InterfaceC08240b0
    public void unlock() {
        this.A06 = false;
    }
}
