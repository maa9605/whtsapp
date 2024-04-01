package com.whatsapp.contact.picker;

import X.AbstractC652336k;
import X.InterfaceC58072qX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public class SharedTextPreviewScrollView extends AbstractC652336k {
    public InterfaceC58072qX A00;
    public boolean A01;
    public boolean A02;

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        super.fling(i);
        this.A01 = true;
    }

    public InterfaceC58072qX getOnEndScrollListener() {
        return this.A00;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.A01 || !this.A02) {
            if (Math.abs(i2 - i4) < 1.0f || i2 >= getMeasuredHeight() || i2 == 0) {
                InterfaceC58072qX interfaceC58072qX = this.A00;
                if (interfaceC58072qX != null) {
                    interfaceC58072qX.AJn();
                }
                this.A01 = false;
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.A02 = false;
            if (!this.A01) {
                this.A00.AJn();
            }
        } else if (motionEvent.getActionMasked() == 2) {
            this.A02 = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setOnEndScrollListener(InterfaceC58072qX interfaceC58072qX) {
        this.A00 = interfaceC58072qX;
    }
}
