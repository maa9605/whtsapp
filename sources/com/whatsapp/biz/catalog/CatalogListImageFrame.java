package com.whatsapp.biz.catalog;

import X.C33I;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class CatalogListImageFrame extends C33I {
    public final Drawable A00;
    public final Drawable A01;

    public CatalogListImageFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A01 = getResources().getDrawable(R.drawable.album_card_top);
        this.A00 = getResources().getDrawable(R.drawable.album_card_bottom);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.A01;
        drawable.setBounds(0, getPaddingTop() - drawable.getIntrinsicHeight(), getWidth(), getPaddingTop());
        drawable.draw(canvas);
        Drawable drawable2 = this.A00;
        drawable2.setBounds(0, getHeight() - getPaddingBottom(), getWidth(), drawable2.getIntrinsicHeight() + (getHeight() - getPaddingBottom()));
        drawable2.draw(canvas);
        super.onDraw(canvas);
    }
}
