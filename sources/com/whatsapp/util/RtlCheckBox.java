package com.whatsapp.util;

import X.C002301c;
import X.C2ZY;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class RtlCheckBox extends C2ZY {
    public int A00;
    public int A01;
    public Drawable A02;
    public C002301c A03;

    public RtlCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || !this.A03.A0N()) {
            return;
        }
        setBackgroundDrawable(null);
        this.A00 = getPaddingLeft();
        int paddingRight = getPaddingRight();
        this.A01 = paddingRight;
        int min = Math.min(this.A00, paddingRight);
        setPadding(min, getPaddingTop(), min, getPaddingBottom());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!isInEditMode() && !C002301c.A00().A0M()) {
            return super.getPaddingLeft();
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (!isInEditMode() && !C002301c.A00().A0M()) {
            int paddingRight = super.getPaddingRight();
            Drawable drawable = this.A02;
            return drawable != null ? paddingRight + Math.max(this.A00, drawable.getIntrinsicWidth()) : paddingRight;
        }
        return super.getCompoundPaddingRight();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || !this.A03.A0N() || this.A02 == null) {
            return;
        }
        int gravity = getGravity() & 112;
        int intrinsicHeight = this.A02.getIntrinsicHeight();
        int intrinsicWidth = this.A02.getIntrinsicWidth();
        int i = 0;
        if (gravity == 16) {
            i = (getHeight() - intrinsicHeight) >> 1;
        } else if (gravity == 80) {
            i = getHeight() - intrinsicHeight;
        }
        int width = getWidth() - intrinsicWidth;
        int width2 = getWidth();
        this.A02.setBounds(width, i, width2, intrinsicHeight + i);
        this.A02.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(final Drawable drawable) {
        if (isInEditMode() || C002301c.A00().A0M()) {
            super.setButtonDrawable(drawable);
            return;
        }
        this.A02 = drawable;
        super.setButtonDrawable(new InsetDrawable(drawable) { // from class: X.3aK
            @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
            }
        });
    }
}
