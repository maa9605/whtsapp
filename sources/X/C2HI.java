package X;

import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.2HI  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2HI extends C2HG {
    @Override // X.C2HG
    public void A0F(RectF rectF, float f, float f2, float f3, float f4) {
        float width;
        if (this instanceof C3L7) {
            C3L7 c3l7 = (C3L7) this;
            Drawable drawable = c3l7.A01;
            if (drawable == null) {
                width = 0.0f;
            } else if (drawable instanceof C44121yY) {
                width = drawable.getBounds().right / c3l7.A01.getBounds().bottom;
            } else {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                width = bitmapDrawable.getBitmap().getWidth() / bitmapDrawable.getBitmap().getHeight();
            }
        } else if (this instanceof C3L6) {
            C3L6 c3l6 = (C3L6) this;
            BitmapDrawable bitmapDrawable2 = c3l6.A00;
            width = bitmapDrawable2 == null ? 0.0f : bitmapDrawable2.getBitmap().getWidth() / c3l6.A00.getBitmap().getHeight();
        } else if (!(this instanceof C2HH)) {
            C2HK c2hk = (C2HK) this;
            if (!(c2hk instanceof C68693Lb)) {
                if (c2hk instanceof C2HJ) {
                    C2HJ c2hj = (C2HJ) c2hk;
                    Picture picture = c2hj.A04;
                    width = ((picture == null && (picture = c2hj.A05) == null) || picture.getHeight() == 0) ? 0.0f : picture.getWidth() / picture.getHeight();
                } else {
                    width = 0.0f;
                }
            } else {
                C68693Lb c68693Lb = (C68693Lb) c2hk;
                Picture picture2 = c68693Lb.A03;
                width = (picture2 == null || picture2.getHeight() == 0) ? 0.0f : c68693Lb.A03.getWidth() / c68693Lb.A03.getHeight();
            }
        } else {
            width = ((C2HH) this).A00 / 116.0f;
        }
        if (width != 0.0f) {
            float f5 = f3 - f;
            float f6 = f4 - f2;
            if (f5 / f6 < width) {
                f6 = f5 / width;
            } else {
                f5 = f6 * width;
            }
            float f7 = (f + f3) / 2.0f;
            float f8 = (f2 + f4) / 2.0f;
            float f9 = f5 / 2.0f;
            float f10 = f6 / 2.0f;
            super.A0F(rectF, f7 - f9, f8 - f10, f7 + f9, f8 + f10);
            return;
        }
        super.A0F(rectF, f, f2, f3, f4);
    }
}
