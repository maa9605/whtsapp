package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.2mj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C56112mj extends Drawable implements Drawable.Callback {
    public int A00;
    public int A01;
    public final Drawable A02;
    public final Drawable A03;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C56112mj(Context context) {
        Drawable A03 = C02160Ac.A03(context, R.drawable.carousel_scrollbar_track);
        if (A03 != null) {
            this.A03 = A03;
            A03.setCallback(this);
            Drawable A032 = C02160Ac.A03(context, R.drawable.carousel_scrollbar_thumb);
            if (A032 != null) {
                this.A02 = A032;
                A032.setCallback(this);
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A00() {
        Rect bounds = getBounds();
        this.A03.setBounds(bounds);
        Drawable drawable = this.A02;
        int i = bounds.left + this.A01;
        drawable.setBounds(i, bounds.top, i + this.A00, bounds.bottom);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.A03.draw(canvas);
        this.A02.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        A00();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
