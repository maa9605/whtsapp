package com.whatsapp.status.playback.widget;

import X.AbstractC86893yh;
import X.InterfaceC16360qH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public class StatusPlaybackPager extends AbstractC86893yh {
    public boolean A00;

    public StatusPlaybackPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = true;
        A0H(true, new InterfaceC16360qH() { // from class: X.3qR
            @Override // X.InterfaceC16360qH
            public final void AVg(View view, float f) {
                if (f >= -1.0f && f <= 1.0f) {
                    view.setPivotX(view.getWidth() * 0.5f);
                    view.setPivotY(view.getHeight());
                    view.setRotation(f * 18.75f);
                }
            }
        });
    }

    @Override // com.whatsapp.collections.MarginCorrectedViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A00) {
            if (motionEvent.getPointerCount() <= 1 || motionEvent.getActionMasked() != 2) {
                try {
                    return super.onInterceptTouchEvent(motionEvent);
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.whatsapp.collections.MarginCorrectedViewPager, androidx.viewpager.widget.ViewPager, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        if (i3 == 0 && i4 == 0) {
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).setRotation(0.0f);
        }
    }

    @Override // com.whatsapp.collections.MarginCorrectedViewPager, androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.A00) {
            try {
                z = super.onTouchEvent(motionEvent);
                return z;
            } catch (IllegalArgumentException unused) {
                return z;
            }
        }
        return false;
    }

    @Override // com.whatsapp.collections.MarginCorrectedViewPager
    public void setScrollEnabled(boolean z) {
        this.A00 = z;
    }
}
