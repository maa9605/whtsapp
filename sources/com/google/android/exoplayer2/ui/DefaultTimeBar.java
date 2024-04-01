package com.google.android.exoplayer2.ui;

import X.C002701i;
import X.C08M;
import X.C222811u;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class DefaultTimeBar extends View {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final Paint A0K;
    public final Paint A0L;
    public final Point A0M;
    public final Rect A0N;
    public final Rect A0O;
    public final Rect A0P;
    public final Rect A0Q;
    public final Drawable A0R;
    public final Runnable A0S;
    public final StringBuilder A0T;
    public final Formatter A0U;
    public final CopyOnWriteArraySet A0V;
    public final int[] A0W;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0Q = new Rect();
        this.A0O = new Rect();
        this.A0N = new Rect();
        this.A0P = new Rect();
        this.A0J = new Paint();
        this.A0H = new Paint();
        this.A0L = new Paint();
        this.A0G = new Paint();
        this.A0I = new Paint();
        Paint paint = new Paint();
        this.A0K = paint;
        paint.setAntiAlias(true);
        this.A0V = new CopyOnWriteArraySet();
        this.A0W = new int[2];
        this.A0M = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.A0A = (int) (((-50) * f) + 0.5f);
        int i = (int) ((4 * f) + 0.5f);
        int i2 = (int) ((26 * f) + 0.5f);
        int i3 = (int) ((12 * f) + 0.5f);
        int i4 = (int) ((0 * f) + 0.5f);
        int i5 = (int) ((16 * f) + 0.5f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C222811u.A01, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(9);
                this.A0R = drawable;
                if (drawable != null) {
                    int i6 = C08M.A00;
                    if (i6 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i6 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    i2 = Math.max(this.A0R.getMinimumHeight(), i2);
                }
                this.A09 = obtainStyledAttributes.getDimensionPixelSize(2, i);
                this.A0F = obtainStyledAttributes.getDimensionPixelSize(11, i2);
                this.A08 = obtainStyledAttributes.getDimensionPixelSize(1, i);
                this.A0D = obtainStyledAttributes.getDimensionPixelSize(10, i3);
                this.A0B = obtainStyledAttributes.getDimensionPixelSize(7, i4);
                this.A0C = obtainStyledAttributes.getDimensionPixelSize(8, i5);
                int i7 = obtainStyledAttributes.getInt(5, -1);
                int i8 = obtainStyledAttributes.getInt(6, (-16777216) | i7);
                int i9 = i7 & 16777215;
                int i10 = obtainStyledAttributes.getInt(3, (-872415232) | i9);
                int i11 = obtainStyledAttributes.getInt(12, i9 | 855638016);
                int i12 = obtainStyledAttributes.getInt(0, -1291845888);
                int i13 = obtainStyledAttributes.getInt(4, (16777215 & i12) | 855638016);
                this.A0J.setColor(i7);
                this.A0K.setColor(i8);
                this.A0H.setColor(i10);
                this.A0L.setColor(i11);
                this.A0G.setColor(i12);
                this.A0I.setColor(i13);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.A09 = i;
            this.A0F = i2;
            this.A08 = i;
            this.A0D = i3;
            this.A0B = i4;
            this.A0C = i5;
            this.A0J.setColor(-1);
            this.A0K.setColor(-1);
            this.A0H.setColor(-855638017);
            this.A0L.setColor(872415231);
            this.A0G.setColor(-1291845888);
            this.A0R = null;
        }
        StringBuilder sb = new StringBuilder();
        this.A0T = sb;
        this.A0U = new Formatter(sb, Locale.getDefault());
        this.A0S = new Runnable() { // from class: X.11o
            @Override // java.lang.Runnable
            public final void run() {
                DefaultTimeBar.this.A01();
            }
        };
        Drawable drawable2 = this.A0R;
        if (drawable2 != null) {
            this.A0E = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.A0E = (Math.max(this.A0B, Math.max(this.A0D, this.A0C)) + 1) / 2;
        }
        this.A03 = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        this.A00 = 20;
        setFocusable(true);
        if (C08M.A00 < 16 || getImportantForAccessibility() != 0) {
            return;
        }
        setImportantForAccessibility(1);
    }

    public final void A00() {
        this.A07 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.A0V.iterator();
        if (it.hasNext()) {
            it.next();
            getScrubberPosition();
            throw null;
        }
    }

    public final void A01() {
        this.A07 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.A0V.iterator();
        if (it.hasNext()) {
            it.next();
            getScrubberPosition();
            throw null;
        }
    }

    public final void A02() {
        Rect rect = this.A0N;
        Rect rect2 = this.A0O;
        rect.set(rect2);
        Rect rect3 = this.A0P;
        rect3.set(rect2);
        long j = this.A07 ? this.A06 : this.A05;
        if (this.A03 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.A02) / this.A03)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.A03)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.A0Q);
    }

    public final void A03(float f) {
        Rect rect = this.A0P;
        Rect rect2 = this.A0O;
        rect.right = Math.max(rect2.left, Math.min((int) f, rect2.right));
    }

    public final boolean A04(long j) {
        if (this.A03 <= 0) {
            return false;
        }
        long scrubberPosition = getScrubberPosition();
        long max = Math.max(0L, Math.min(scrubberPosition + j, this.A03));
        this.A06 = max;
        if (max == scrubberPosition) {
            return false;
        }
        if (!this.A07) {
            A00();
        }
        Iterator it = this.A0V.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
        A02();
        return true;
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0R;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    private long getPositionIncrement() {
        long j = this.A04;
        if (j == -9223372036854775807L) {
            long j2 = this.A03;
            if (j2 == -9223372036854775807L) {
                return 0L;
            }
            return j2 / this.A00;
        }
        return j;
    }

    private String getProgressText() {
        StringBuilder sb = this.A0T;
        Formatter formatter = this.A0U;
        long j = this.A05;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j2 = (j + 500) / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    private long getScrubberPosition() {
        Rect rect = this.A0O;
        if (rect.width() <= 0 || this.A03 == -9223372036854775807L) {
            return 0L;
        }
        return (this.A0P.width() * this.A03) / rect.width();
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0R;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        canvas.save();
        Rect rect = this.A0O;
        int height = rect.height();
        int centerY = rect.centerY() - (height >> 1);
        int i2 = height + centerY;
        if (this.A03 <= 0) {
            canvas.drawRect(rect.left, centerY, rect.right, i2, this.A0L);
        } else {
            Rect rect2 = this.A0N;
            int i3 = rect2.left;
            int i4 = rect2.right;
            int max = Math.max(rect.left, i4);
            Rect rect3 = this.A0P;
            int max2 = Math.max(max, rect3.right);
            int i5 = rect.right;
            if (max2 < i5) {
                canvas.drawRect(max2, centerY, i5, i2, this.A0L);
            }
            int max3 = Math.max(i3, rect3.right);
            if (i4 > max3) {
                canvas.drawRect(max3, centerY, i4, i2, this.A0H);
            }
            if (rect3.width() > 0) {
                canvas.drawRect(rect3.left, centerY, rect3.right, i2, this.A0J);
            }
        }
        if (this.A03 > 0) {
            Rect rect4 = this.A0P;
            int max4 = Math.max(rect4.left, Math.min(rect4.right, rect.right));
            int centerY2 = rect4.centerY();
            Drawable drawable = this.A0R;
            if (drawable == null) {
                if (!this.A07 && !isFocused()) {
                    if (isEnabled()) {
                        i = this.A0D;
                    } else {
                        i = this.A0B;
                    }
                } else {
                    i = this.A0C;
                }
                canvas.drawCircle(max4, centerY2, i >> 1, this.A0K);
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth() >> 1;
                int intrinsicHeight = drawable.getIntrinsicHeight() >> 1;
                drawable.setBounds(max4 - intrinsicWidth, centerY2 - intrinsicHeight, max4 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.A03 <= 0) {
            return;
        }
        int i = C08M.A00;
        if (i >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else if (i < 16) {
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L12
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L29
            switch(r5) {
                case 21: goto L17;
                case 22: goto L18;
                case 23: goto L29;
                default: goto L12;
            }
        L12:
            boolean r0 = super.onKeyDown(r5, r6)
            return r0
        L17:
            long r0 = -r0
        L18:
            boolean r0 = r4.A04(r0)
            if (r0 == 0) goto L12
            java.lang.Runnable r2 = r4.A0S
            r4.removeCallbacks(r2)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r2, r0)
            return r3
        L29:
            boolean r0 = r4.A07
            if (r0 == 0) goto L12
            java.lang.Runnable r0 = r4.A0S
            r4.removeCallbacks(r0)
            r0.run()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.A0F;
        int i6 = ((i4 - i2) - i5) >> 1;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int i7 = this.A09;
        int i8 = ((i5 - i7) / 2) + i6;
        Rect rect = this.A0Q;
        rect.set(paddingLeft, i6, paddingRight, i5 + i6);
        Rect rect2 = this.A0O;
        int i9 = rect.left;
        int i10 = this.A0E;
        rect2.set(i9 + i10, i8, rect.right - i10, i7 + i8);
        A02();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.A0F;
        } else if (mode != 1073741824) {
            size = Math.min(this.A0F, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.A0R;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.A0R;
        if (drawable == null || C08M.A00 < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r2 != 3) goto L33;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r6 = 0
            if (r0 == 0) goto L3c
            long r3 = r7.A03
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3c
            int[] r3 = r7.A0W
            r7.getLocationOnScreen(r3)
            android.graphics.Point r5 = r7.A0M
            float r0 = r8.getRawX()
            int r2 = (int) r0
            r0 = r3[r6]
            int r2 = r2 - r0
            float r0 = r8.getRawY()
            int r1 = (int) r0
            r4 = 1
            r0 = r3[r4]
            int r1 = r1 - r0
            r5.set(r2, r1)
            int r3 = r5.x
            int r5 = r5.y
            int r2 = r8.getAction()
            if (r2 == 0) goto L77
            r1 = 3
            if (r2 == r4) goto L6c
            r0 = 2
            if (r2 == r0) goto L3d
            if (r2 == r1) goto L6c
        L3c:
            return r6
        L3d:
            boolean r0 = r7.A07
            if (r0 == 0) goto L3c
            int r0 = r7.A0A
            if (r5 >= r0) goto L65
            int r0 = r7.A01
            int r3 = r3 - r0
            int r3 = r3 / r1
            int r3 = r3 + r0
            float r0 = (float) r3
            r7.A03(r0)
        L4e:
            long r0 = r7.getScrubberPosition()
            r7.A06 = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r7.A0V
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L96
            r1.next()
            r0 = 0
            throw r0
        L65:
            r7.A01 = r3
            float r0 = (float) r3
            r7.A03(r0)
            goto L4e
        L6c:
            boolean r0 = r7.A07
            if (r0 == 0) goto L3c
            r8.getAction()
            r7.A01()
            return r4
        L77:
            float r3 = (float) r3
            float r0 = (float) r5
            android.graphics.Rect r2 = r7.A0Q
            int r1 = (int) r3
            int r0 = (int) r0
            boolean r0 = r2.contains(r1, r0)
            if (r0 == 0) goto L3c
            r7.A03(r3)
            r7.A00()
            long r0 = r7.getScrubberPosition()
            r7.A06 = r0
            r7.A02()
            r7.invalidate()
            return r4
        L96:
            r7.A02()
            r7.invalidate()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.A03 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (A04(-getPositionIncrement())) {
                A01();
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (A04(getPositionIncrement())) {
                A01();
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.A0G.setColor(i);
        invalidate(this.A0Q);
    }

    public void setBufferedColor(int i) {
        this.A0H.setColor(i);
        invalidate(this.A0Q);
    }

    public void setBufferedPosition(long j) {
        this.A02 = j;
        A02();
    }

    public void setDuration(long j) {
        this.A03 = j;
        if (this.A07 && j == -9223372036854775807L) {
            A01();
        }
        A02();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.A07 || z) {
            return;
        }
        A01();
    }

    public void setKeyCountIncrement(int i) {
        C002701i.A1J(i > 0);
        this.A00 = i;
        this.A04 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        C002701i.A1J(j > 0);
        this.A00 = -1;
        this.A04 = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.A0I.setColor(i);
        invalidate(this.A0Q);
    }

    public void setPlayedColor(int i) {
        this.A0J.setColor(i);
        invalidate(this.A0Q);
    }

    public void setPosition(long j) {
        this.A05 = j;
        setContentDescription(getProgressText());
        A02();
    }

    public void setScrubberColor(int i) {
        this.A0K.setColor(i);
        invalidate(this.A0Q);
    }

    public void setUnplayedColor(int i) {
        this.A0L.setColor(i);
        invalidate(this.A0Q);
    }
}
