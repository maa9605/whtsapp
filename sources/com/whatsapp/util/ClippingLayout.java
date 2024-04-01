package com.whatsapp.util;

import X.AbstractC83673sV;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class ClippingLayout extends AbstractC83673sV {
    public Rect A00;

    public ClippingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Rect rect = this.A00;
        if (rect != null) {
            canvas.clipRect(rect);
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public void setClipBounds(Rect rect) {
        Rect rect2 = this.A00;
        if (rect != rect2) {
            if (rect != null) {
                if (rect.equals(rect2)) {
                    return;
                }
                Rect rect3 = this.A00;
                if (rect3 == null) {
                    this.A00 = new Rect(rect);
                } else {
                    rect3.set(rect);
                }
            } else {
                this.A00 = null;
            }
            invalidate();
        }
    }
}
