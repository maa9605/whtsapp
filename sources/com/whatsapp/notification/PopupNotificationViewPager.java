package com.whatsapp.notification;

import X.AbstractC76793hA;
import X.C0ZT;
import X.C649335g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public class PopupNotificationViewPager extends AbstractC76793hA {
    public Integer A00;
    public boolean A01;

    public PopupNotificationViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = true;
        this.A00 = null;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void A0B(int i, boolean z) {
        A0O(i, z, !z);
    }

    public void A0O(int i, boolean z, boolean z2) {
        int i2;
        if (this.A0V.A0B() > 0) {
            C0ZT c0zt = this.A0V;
            if (c0zt instanceof C649335g) {
                int A0B = ((C649335g) c0zt).A00.A0B();
                if (i < 0) {
                    i2 = -1;
                    while (i < 0) {
                        i += A0B;
                    }
                } else {
                    i2 = 0;
                    if (i >= A0B) {
                        i2 = 1;
                    }
                }
                i %= A0B;
                if (z2) {
                    if (Integer.MAX_VALUE - i > getDefaultOffsetBlocks() * A0B) {
                        i += getDefaultOffsetBlocks() * A0B;
                    }
                } else {
                    int currentOffsetBlocks = getCurrentOffsetBlocks() + i2;
                    int A0B2 = this.A0V.A0B() / ((C649335g) this.A0V).A00.A0B();
                    if (currentOffsetBlocks < 0 || currentOffsetBlocks >= A0B2) {
                        currentOffsetBlocks = getDefaultOffsetBlocks();
                        z = false;
                    }
                    int i3 = currentOffsetBlocks * A0B;
                    if (Integer.MAX_VALUE - i > i3) {
                        i += i3;
                    }
                }
            }
        }
        super.A0B(i, z);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        if (this.A0V.A0B() > 0 && (this.A0V instanceof C649335g)) {
            return super.getCurrentItem() % ((C649335g) this.A0V).A00.A0B();
        }
        return super.getCurrentItem();
    }

    private int getCurrentOffsetBlocks() {
        if (this.A0V.A0B() <= 0 || !(this.A0V instanceof C649335g)) {
            return 0;
        }
        return super.getCurrentItem() / ((C649335g) this.A0V).A00.A0B();
    }

    private int getDefaultOffsetBlocks() {
        return (this.A0V.A0B() <= 0 || !(this.A0V instanceof C649335g)) ? 0 : 5;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A01 = true;
        super.onAttachedToWindow();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0ZT c0zt = this.A0V;
        if (!(c0zt instanceof C649335g) || ((C649335g) c0zt).A00.A0B() > 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Integer num;
        super.onLayout(z, i, i2, i3, i4);
        this.A01 = false;
        if (0 == 0 && (num = this.A00) != null) {
            A0O(num.intValue(), true, false);
            this.A00 = null;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0ZT c0zt = this.A0V;
        if (!(c0zt instanceof C649335g) || ((C649335g) c0zt).A00.A0B() > 1) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(C0ZT c0zt) {
        this.A01 = true;
        super.setAdapter(c0zt);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        A0O(i, false, true);
    }
}
