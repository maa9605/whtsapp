package androidx.appcompat.widget;

import X.C0UY;
import X.C11310hX;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public View A04;
    public View A05;
    public View A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new Drawable(this) { // from class: X.0gq
            public final ActionBarContainer A00;

            @Override // android.graphics.drawable.Drawable
            public int getOpacity() {
                return 0;
            }

            @Override // android.graphics.drawable.Drawable
            public void setAlpha(int i) {
            }

            @Override // android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter colorFilter) {
            }

            {
                this.A00 = this;
            }

            @Override // android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
                ActionBarContainer actionBarContainer = this.A00;
                if (actionBarContainer.A07) {
                    Drawable drawable = actionBarContainer.A02;
                    if (drawable != null) {
                        drawable.draw(canvas);
                        return;
                    }
                    return;
                }
                Drawable drawable2 = actionBarContainer.A01;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
                Drawable drawable3 = actionBarContainer.A03;
                if (drawable3 == null || !actionBarContainer.A08) {
                    return;
                }
                drawable3.draw(canvas);
            }

            @Override // android.graphics.drawable.Drawable
            public void getOutline(Outline outline) {
                ActionBarContainer actionBarContainer = this.A00;
                if (actionBarContainer.A07) {
                    Drawable drawable = actionBarContainer.A02;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                        return;
                    }
                    return;
                }
                Drawable drawable2 = actionBarContainer.A01;
                if (drawable2 == null) {
                    return;
                }
                drawable2.getOutline(outline);
            }
        });
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0UY.A00);
        this.A01 = obtainStyledAttributes.getDrawable(0);
        this.A03 = obtainStyledAttributes.getDrawable(2);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        boolean z = true;
        if (getId() == R.id.split_action_bar) {
            this.A07 = true;
            this.A02 = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.A07 ? this.A01 != null || this.A03 != null : this.A02 != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A01;
        if (drawable != null && drawable.isStateful()) {
            this.A01.setState(getDrawableState());
        }
        Drawable drawable2 = this.A03;
        if (drawable2 != null && drawable2.isStateful()) {
            this.A03.setState(getDrawableState());
        }
        Drawable drawable3 = this.A02;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.A02.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.A06;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A03;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.A02;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.A04 = findViewById(R.id.action_bar);
        this.A05 = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A09 || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        r4 = getMeasuredHeight();
        r1 = r4 - r6.getMeasuredHeight();
        r0 = ((android.widget.FrameLayout.LayoutParams) r6.getLayoutParams()).bottomMargin;
        r6.layout(r9, r1 - r0, r11, r4 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r7.A07 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        r2 = r7.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r2 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        r2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r7.A01 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r7.A04.getVisibility() != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        r7.A01.setBounds(r7.A04.getLeft(), r7.A04.getTop(), r7.A04.getRight(), r7.A04.getBottom());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        r7.A08 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
        if (r5 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
        r4 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r4 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
        r4.setBounds(r6.getLeft(), r6.getTop(), r6.getRight(), r6.getBottom());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        r0 = r7.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (r0.getVisibility() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
        r7.A01.setBounds(r7.A05.getLeft(), r7.A05.getTop(), r7.A05.getRight(), r7.A05.getBottom());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
        r7.A01.setBounds(0, 0, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r6.getVisibility() == 8) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r6 != null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r6.getVisibility() == 8) goto L8;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            super.onLayout(r8, r9, r10, r11, r12)
            android.view.View r6 = r7.A06
            r1 = 8
            r3 = 0
            if (r6 == 0) goto L11
            int r0 = r6.getVisibility()
            r5 = 1
            if (r0 != r1) goto L14
        L11:
            r5 = 0
            if (r6 == 0) goto L31
        L14:
            int r0 = r6.getVisibility()
            if (r0 == r1) goto L31
            int r4 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r6.getMeasuredHeight()
            int r1 = r4 - r0
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            int r4 = r4 - r0
            r6.layout(r9, r1, r11, r4)
        L31:
            boolean r0 = r7.A07
            if (r0 == 0) goto L48
            android.graphics.drawable.Drawable r2 = r7.A02
            if (r2 == 0) goto L47
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            r2.setBounds(r3, r3, r1, r0)
        L44:
            r7.invalidate()
        L47:
            return
        L48:
            android.graphics.drawable.Drawable r0 = r7.A01
            if (r0 == 0) goto L72
            android.view.View r0 = r7.A04
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8e
            android.graphics.drawable.Drawable r4 = r7.A01
            android.view.View r0 = r7.A04
            int r3 = r0.getLeft()
            android.view.View r0 = r7.A04
            int r2 = r0.getTop()
            android.view.View r0 = r7.A04
            int r1 = r0.getRight()
            android.view.View r0 = r7.A04
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
        L71:
            r3 = 1
        L72:
            r7.A08 = r5
            if (r5 == 0) goto Lbc
            android.graphics.drawable.Drawable r4 = r7.A03
            if (r4 == 0) goto Lbc
            int r3 = r6.getLeft()
            int r2 = r6.getTop()
            int r1 = r6.getRight()
            int r0 = r6.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L44
        L8e:
            android.view.View r0 = r7.A05
            if (r0 == 0) goto Lb6
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lb6
            android.graphics.drawable.Drawable r4 = r7.A01
            android.view.View r0 = r7.A05
            int r3 = r0.getLeft()
            android.view.View r0 = r7.A05
            int r2 = r0.getTop()
            android.view.View r0 = r7.A05
            int r1 = r0.getRight()
            android.view.View r0 = r7.A05
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L71
        Lb6:
            android.graphics.drawable.Drawable r0 = r7.A01
            r0.setBounds(r3, r3, r3, r3)
            goto L71
        Lbc:
            if (r3 == 0) goto L47
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.A04 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.A00) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onMeasure(i, i2);
        if (this.A04 == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.A06;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view2 = this.A04;
        if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
            View view3 = this.A04;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
            i3 = view3.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        } else {
            View view4 = this.A05;
            if (view4 != null && view4.getVisibility() != 8 && view4.getMeasuredHeight() != 0) {
                View view5 = this.A05;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view5.getLayoutParams();
                i3 = view5.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
            } else {
                i3 = 0;
            }
        }
        if (mode == Integer.MIN_VALUE) {
            i4 = View.MeasureSpec.getSize(i2);
        } else {
            i4 = Integer.MAX_VALUE;
        }
        int measuredWidth = getMeasuredWidth();
        View view6 = this.A06;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view6.getLayoutParams();
        setMeasuredDimension(measuredWidth, Math.min(view6.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin + i3, i4));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.A01);
        }
        this.A01 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.A04;
            if (view != null) {
                this.A01.setBounds(view.getLeft(), this.A04.getTop(), this.A04.getRight(), this.A04.getBottom());
            }
        }
        boolean z = true;
        if (!this.A07 ? this.A01 != null || this.A03 != null : this.A02 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A02;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.A02);
        }
        this.A02 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A07 && (drawable2 = this.A02) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.A07 ? !(this.A01 != null || this.A03 != null) : this.A02 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A03;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.A03);
        }
        this.A03 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A08 && (drawable2 = this.A03) != null) {
                drawable2.setBounds(this.A06.getLeft(), this.A06.getTop(), this.A06.getRight(), this.A06.getBottom());
            }
        }
        boolean z = true;
        if (!this.A07 ? this.A01 != null || this.A03 != null : this.A02 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C11310hX c11310hX) {
        View view = this.A06;
        if (view != null) {
            removeView(view);
        }
        this.A06 = c11310hX;
        if (c11310hX != null) {
            addView(c11310hX);
            ViewGroup.LayoutParams layoutParams = c11310hX.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            throw null;
        }
    }

    public void setTransitioning(boolean z) {
        this.A09 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.A03;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.A02;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.A01 && !this.A07) || (drawable == this.A03 && this.A08) || ((drawable == this.A02 && this.A07) || super.verifyDrawable(drawable));
    }
}
