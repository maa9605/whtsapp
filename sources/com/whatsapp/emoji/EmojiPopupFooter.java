package com.whatsapp.emoji;

import X.C0AT;
import X.C3AT;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class EmojiPopupFooter extends C3AT {
    public int A00;

    public EmojiPopupFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getTopOffset() {
        return this.A00;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0AT.A0T(this, this.A00);
    }

    public void setTopOffset(int i) {
        C0AT.A0T(this, Math.max(Math.min(getHeight(), i), 0) - getTop());
        this.A00 = getTop();
    }
}
