package com.whatsapp.stickers;

import X.AbstractC82553qh;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public class TouchDiscardLayout extends AbstractC82553qh {
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public TouchDiscardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
