package com.whatsapp.collections;

import X.AbstractC649435h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class MarginCorrectedViewPager extends AbstractC649435h {
    public boolean A00;

    public MarginCorrectedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A00) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                Log.e("Exception while intercepting touch event", e);
                return false;
            }
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = this.A0K;
        super.onSizeChanged(i - i5, i2, i3 - i5, i4);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A00) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setScrollEnabled(boolean z) {
        this.A00 = z;
    }
}
