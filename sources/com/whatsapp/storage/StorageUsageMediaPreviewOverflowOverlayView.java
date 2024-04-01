package com.whatsapp.storage;

import X.AbstractC83173rh;
import X.C02160Ac;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class StorageUsageMediaPreviewOverflowOverlayView extends AbstractC83173rh {
    public Drawable A00;

    public StorageUsageMediaPreviewOverflowOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBackgroundColor(C02160Ac.A00(context, R.color.black_alpha_40));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.A00.draw(canvas);
        }
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A00 = drawable;
        invalidate();
    }
}
