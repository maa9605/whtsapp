package com.whatsapp;

import X.AbstractC28881Ug;
import X.C000200d;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class SquareImageView extends AbstractC28881Ug {
    public int A00;
    public Drawable A01;

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        this.A00 = 0;
        if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A1t)) == null) {
            return;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.A00 = obtainStyledAttributes.getInt(0, 0);
        }
        setSelector(obtainStyledAttributes.getDrawable(1));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // X.C0S5, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A01;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize;
        int i3 = this.A00;
        if (i3 == 0) {
            defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i);
        } else if (i3 == 1) {
            defaultSize = ImageView.getDefaultSize(getSuggestedMinimumHeight(), i2);
        } else {
            StringBuilder A0P = C000200d.A0P("Illegal value: ");
            A0P.append(i3);
            throw new IllegalArgumentException(A0P.toString());
        }
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.A01 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.A01 || super.verifyDrawable(drawable);
    }
}
