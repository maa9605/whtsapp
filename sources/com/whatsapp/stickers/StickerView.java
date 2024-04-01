package com.whatsapp.stickers;

import X.AbstractC09660eW;
import X.AbstractC86433xU;
import X.C44121yY;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.stickers.StickerView;

/* loaded from: classes2.dex */
public class StickerView extends AbstractC86433xU {
    public int A00;
    public AbstractC09660eW A01;
    public boolean A02;
    public boolean A03;
    public final AbstractC09660eW A04;

    public StickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = new AbstractC09660eW() { // from class: X.3r9
            @Override // X.AbstractC09660eW
            public void A00(Drawable drawable) {
                AbstractC09660eW abstractC09660eW = StickerView.this.A01;
                if (abstractC09660eW != null) {
                    abstractC09660eW.A00(drawable);
                }
            }
        };
    }

    public void A00() {
        Drawable drawable = getDrawable();
        if (drawable instanceof C44121yY) {
            C44121yY c44121yY = (C44121yY) drawable;
            c44121yY.A06 = this.A02;
            int i = this.A00;
            if (c44121yY.A07) {
                if (c44121yY.A01 < i) {
                    c44121yY.A01 = i;
                    c44121yY.A00 = 0;
                }
            } else {
                c44121yY.A01 = i;
            }
        }
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public void A01() {
        Drawable drawable = getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    public AbstractC09660eW getAnimationCallback() {
        return this.A01;
    }

    public boolean getLoopIndefinitely() {
        return this.A02;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A03 && this.A02) {
            A00();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A01();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            A01();
        } else if (this.A03 && this.A02) {
            A00();
        }
    }

    public void setAnimationCallback(AbstractC09660eW abstractC09660eW) {
        this.A01 = abstractC09660eW;
    }

    @Override // X.C0S5, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        Drawable drawable2 = getDrawable();
        if (drawable2 != drawable && (drawable2 instanceof C44121yY)) {
            C44121yY c44121yY = (C44121yY) drawable2;
            c44121yY.A0A.remove(this.A04);
            c44121yY.stop();
        }
        super.setImageDrawable(drawable);
        if (drawable instanceof C44121yY) {
            ((C44121yY) drawable).A0A.add(this.A04);
        }
    }

    public void setLoopIndefinitely(boolean z) {
        this.A02 = z;
    }

    public void setMaxLoops(int i) {
        this.A00 = i;
    }

    public void setUserVisibleForIndefiniteLoop(boolean z) {
        this.A03 = z;
    }
}
