package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.0gT */
/* loaded from: classes.dex */
public class C10680gT extends Drawable implements Drawable.Callback {
    public int A00 = 255;
    public int A01 = -1;
    public long A02;
    public long A03;
    public Rect A04;
    public Drawable A05;
    public Drawable A06;
    public C10660gR A07;
    public AbstractC10670gS A08;
    public Runnable A09;
    public boolean A0A;
    public boolean A0B;

    public AbstractC10670gS A03() {
        throw null;
    }

    public final void A00(Drawable drawable) {
        C10660gR c10660gR = this.A07;
        if (c10660gR == null) {
            c10660gR = new C10660gR();
            this.A07 = c10660gR;
        }
        c10660gR.A00 = drawable.getCallback();
        drawable.setCallback(c10660gR);
        try {
            if (this.A08.A07 <= 0 && this.A0A) {
                drawable.setAlpha(this.A00);
            }
            AbstractC10670gS abstractC10670gS = this.A08;
            if (abstractC10670gS.A0R) {
                drawable.setColorFilter(abstractC10670gS.A0E);
            } else {
                if (abstractC10670gS.A0S) {
                    C07O.A0Z(drawable, abstractC10670gS.A0C);
                }
                AbstractC10670gS abstractC10670gS2 = this.A08;
                if (abstractC10670gS2.A0T) {
                    C07O.A0a(drawable, abstractC10670gS2.A0F);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.A08.A0Q);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i >= 19) {
                drawable.setAutoMirrored(this.A08.A0I);
            }
            Rect rect = this.A04;
            if (i >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C10660gR c10660gR2 = this.A07;
            Drawable.Callback callback = c10660gR2.A00;
            c10660gR2.A00 = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(boolean r14) {
        /*
            r13 = this;
            r8 = 1
            r13.A0A = r8
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r9 = r13.A05
            r11 = 255(0xff, double:1.26E-321)
            r7 = 0
            r3 = 0
            if (r9 == 0) goto L6e
            long r5 = r13.A02
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L21
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L5a
            int r0 = r13.A00
            r9.setAlpha(r0)
            r13.A02 = r3
        L21:
            r10 = 0
        L22:
            android.graphics.drawable.Drawable r9 = r13.A06
            if (r9 == 0) goto L57
            long r5 = r13.A03
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L38
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L46
            r9.setVisible(r7, r7)
            r0 = 0
            r13.A06 = r0
            r13.A03 = r3
        L38:
            r8 = r10
        L39:
            if (r14 == 0) goto L45
            if (r8 == 0) goto L45
            java.lang.Runnable r0 = r13.A09
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r0, r1)
        L45:
            return
        L46:
            long r5 = r5 - r1
            long r5 = r5 * r11
            int r3 = (int) r5
            X.0gS r0 = r13.A08
            int r0 = r0.A08
            int r3 = r3 / r0
            int r0 = r13.A00
            int r3 = r3 * r0
            int r0 = r3 / 255
            r9.setAlpha(r0)
            goto L39
        L57:
            r13.A03 = r3
            goto L38
        L5a:
            long r5 = r5 - r1
            long r5 = r5 * r11
            int r10 = (int) r5
            X.0gS r0 = r13.A08
            int r0 = r0.A07
            int r10 = r10 / r0
            int r5 = 255 - r10
            int r0 = r13.A00
            int r5 = r5 * r0
            int r0 = r5 / 255
            r9.setAlpha(r0)
            r10 = 1
            goto L22
        L6e:
            r13.A02 = r3
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10680gT.A01(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02(int r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            r3 = 0
            if (r9 != r0) goto L6
            return r3
        L6:
            long r5 = android.os.SystemClock.uptimeMillis()
            X.0gS r0 = r8.A08
            int r0 = r0.A08
            r7 = 0
            r1 = 0
            if (r0 <= 0) goto L75
            android.graphics.drawable.Drawable r0 = r8.A06
            if (r0 == 0) goto L1a
            r0.setVisible(r3, r3)
        L1a:
            android.graphics.drawable.Drawable r0 = r8.A05
            if (r0 == 0) goto L70
            r8.A06 = r0
            X.0gS r0 = r8.A08
            int r0 = r0.A08
            long r3 = (long) r0
            long r3 = r3 + r5
            r8.A03 = r3
        L28:
            if (r9 < 0) goto L6a
            X.0gS r3 = r8.A08
            int r0 = r3.A0A
            if (r9 >= r0) goto L6a
            android.graphics.drawable.Drawable r7 = r3.A01(r9)
            r8.A05 = r7
            r8.A01 = r9
            if (r7 == 0) goto L47
            X.0gS r0 = r8.A08
            int r0 = r0.A07
            if (r0 <= 0) goto L44
            long r3 = (long) r0
            long r5 = r5 + r3
            r8.A02 = r5
        L44:
            r8.A00(r7)
        L47:
            long r3 = r8.A02
            r5 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L54
            long r3 = r8.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L62
        L54:
            java.lang.Runnable r0 = r8.A09
            if (r0 != 0) goto L66
            X.0gQ r0 = new X.0gQ
            r0.<init>()
            r8.A09 = r0
        L5f:
            r8.A01(r5)
        L62:
            r8.invalidateSelf()
            return r5
        L66:
            r8.unscheduleSelf(r0)
            goto L5f
        L6a:
            r8.A05 = r7
            r0 = -1
            r8.A01 = r0
            goto L47
        L70:
            r8.A06 = r7
            r8.A03 = r1
            goto L28
        L75:
            android.graphics.drawable.Drawable r0 = r8.A05
            if (r0 == 0) goto L28
            r0.setVisible(r3, r3)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10680gT.A02(int):boolean");
    }

    public void A04(AbstractC10670gS abstractC10670gS) {
        this.A08 = abstractC10670gS;
        int i = this.A01;
        if (i >= 0) {
            Drawable A01 = abstractC10670gS.A01(i);
            this.A05 = A01;
            if (A01 != null) {
                A00(A01);
            }
        }
        this.A06 = null;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        AbstractC10670gS abstractC10670gS = this.A08;
        if (abstractC10670gS == null) {
            throw null;
        }
        if (theme != null) {
            abstractC10670gS.A03();
            int i = abstractC10670gS.A0A;
            Drawable[] drawableArr = abstractC10670gS.A0V;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    abstractC10670gS.A01 |= drawableArr[i2].getChangingConfigurations();
                }
            }
            abstractC10670gS.A05(theme.getResources());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.A08.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.A06;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.A08.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        AbstractC10670gS abstractC10670gS = this.A08;
        synchronized (abstractC10670gS) {
            if (abstractC10670gS.A0L) {
                boolean z = abstractC10670gS.A0J;
                if (!z) {
                    return null;
                }
            } else {
                abstractC10670gS.A03();
                abstractC10670gS.A0L = true;
                int i = abstractC10670gS.A0A;
                Drawable[] drawableArr = abstractC10670gS.A0V;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getConstantState() == null) {
                        abstractC10670gS.A0J = false;
                        return null;
                    }
                }
                abstractC10670gS.A0J = true;
            }
            this.A08.A00 = getChangingConfigurations();
            return this.A08;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.A04;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        AbstractC10670gS abstractC10670gS = this.A08;
        if (abstractC10670gS.A0P) {
            if (!abstractC10670gS.A0K) {
                abstractC10670gS.A02();
            }
            return abstractC10670gS.A02;
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        AbstractC10670gS abstractC10670gS = this.A08;
        if (abstractC10670gS.A0P) {
            if (!abstractC10670gS.A0K) {
                abstractC10670gS.A02();
            }
            return abstractC10670gS.A05;
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        AbstractC10670gS abstractC10670gS = this.A08;
        if (abstractC10670gS.A0P) {
            if (!abstractC10670gS.A0K) {
                abstractC10670gS.A02();
            }
            return abstractC10670gS.A03;
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        AbstractC10670gS abstractC10670gS = this.A08;
        if (abstractC10670gS.A0P) {
            if (!abstractC10670gS.A0K) {
                abstractC10670gS.A02();
            }
            return abstractC10670gS.A04;
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.A05;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        AbstractC10670gS abstractC10670gS = this.A08;
        if (abstractC10670gS.A0M) {
            return abstractC10670gS.A0B;
        }
        abstractC10670gS.A03();
        int i = abstractC10670gS.A0A;
        Drawable[] drawableArr = abstractC10670gS.A0V;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        abstractC10670gS.A0B = opacity;
        abstractC10670gS.A0M = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        AbstractC10670gS abstractC10670gS = this.A08;
        Rect rect2 = null;
        if (!abstractC10670gS.A0U) {
            Rect rect3 = abstractC10670gS.A0G;
            if (rect3 == null && !abstractC10670gS.A0N) {
                abstractC10670gS.A03();
                Rect rect4 = new Rect();
                int i = abstractC10670gS.A0A;
                Drawable[] drawableArr = abstractC10670gS.A0V;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                abstractC10670gS.A0N = true;
                abstractC10670gS.A0G = rect2;
            } else {
                rect2 = rect3;
            }
            if (rect2 != null) {
                rect.set(rect2);
                padding = false;
                if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                    padding = true;
                }
                if (this.A08.A0I && C07O.A08(this) == 1) {
                    int i7 = rect.left;
                    rect.left = rect.right;
                    rect.right = i7;
                }
                return padding;
            }
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            padding = drawable.getPadding(rect);
        } else {
            padding = super.getPadding(rect);
        }
        if (this.A08.A0I) {
            int i72 = rect.left;
            rect.left = rect.right;
            rect.right = i72;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC10670gS abstractC10670gS = this.A08;
        if (abstractC10670gS != null) {
            abstractC10670gS.A0M = false;
            abstractC10670gS.A0O = false;
        }
        if (drawable != this.A05 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.A08.A0I;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.A06 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.A05;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.A0A) {
                this.A05.setAlpha(this.A00);
            }
        }
        if (this.A03 != 0) {
            this.A03 = 0L;
            z = true;
        }
        if (this.A02 != 0) {
            this.A02 = 0L;
        } else if (!z) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.A0B && super.mutate() == this) {
            AbstractC10670gS A03 = A03();
            A03.A04();
            A04(A03);
            this.A0B = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.A05;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        AbstractC10670gS abstractC10670gS = this.A08;
        int i2 = this.A01;
        int i3 = abstractC10670gS.A0A;
        Drawable[] drawableArr = abstractC10670gS.A0V;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        abstractC10670gS.A09 = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.A06;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.A05;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A06;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.A05;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.A05 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (!this.A0A || this.A00 != i) {
            this.A0A = true;
            this.A00 = i;
            Drawable drawable = this.A05;
            if (drawable != null) {
                if (this.A02 == 0) {
                    drawable.setAlpha(i);
                } else {
                    A01(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC10670gS abstractC10670gS = this.A08;
        if (abstractC10670gS.A0I != z) {
            abstractC10670gS.A0I = z;
            Drawable drawable = this.A05;
            if (drawable != null) {
                C07O.A0b(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC10670gS abstractC10670gS = this.A08;
        abstractC10670gS.A0R = true;
        if (abstractC10670gS.A0E != colorFilter) {
            abstractC10670gS.A0E = colorFilter;
            Drawable drawable = this.A05;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC10670gS abstractC10670gS = this.A08;
        if (abstractC10670gS.A0Q != z) {
            abstractC10670gS.A0Q = z;
            Drawable drawable = this.A05;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.A05;
        if (drawable != null) {
            C07O.A0V(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.A04;
        if (rect == null) {
            this.A04 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            C07O.A0Y(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC10670gS abstractC10670gS = this.A08;
        abstractC10670gS.A0S = true;
        if (abstractC10670gS.A0C != colorStateList) {
            abstractC10670gS.A0C = colorStateList;
            C07O.A0Z(this.A05, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC10670gS abstractC10670gS = this.A08;
        abstractC10670gS.A0T = true;
        if (abstractC10670gS.A0F != mode) {
            abstractC10670gS.A0F = mode;
            C07O.A0a(this.A05, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.A05;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.A05 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
