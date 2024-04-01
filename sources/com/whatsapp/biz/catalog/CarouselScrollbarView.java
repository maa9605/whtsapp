package com.whatsapp.biz.catalog;

import X.C33H;
import X.C56112mj;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class CarouselScrollbarView extends C33H {
    public RecyclerView A00;
    public boolean A01;
    public final C56112mj A02;

    public CarouselScrollbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C56112mj c56112mj = new C56112mj(context);
        this.A02 = c56112mj;
        c56112mj.setCallback(this);
        this.A01 = false;
    }

    public final void A00() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            int computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            int computeHorizontalScrollOffset = this.A00.computeHorizontalScrollOffset();
            int computeHorizontalScrollRange = this.A00.computeHorizontalScrollRange();
            if (computeHorizontalScrollExtent < computeHorizontalScrollRange) {
                int width = (getWidth() * computeHorizontalScrollExtent) / computeHorizontalScrollRange;
                int width2 = ((getWidth() - width) * computeHorizontalScrollOffset) / (computeHorizontalScrollRange - computeHorizontalScrollExtent);
                C56112mj c56112mj = this.A02;
                if (c56112mj.A01 != width2 || c56112mj.A00 != width) {
                    c56112mj.A00 = width;
                    c56112mj.A01 = width2;
                    c56112mj.A00();
                }
                this.A01 = true;
                return;
            }
            C56112mj c56112mj2 = this.A02;
            if (c56112mj2.A01 != 0 || c56112mj2.A00 != 0) {
                c56112mj2.A00 = 0;
                c56112mj2.A01 = 0;
                c56112mj2.A00();
            }
            this.A01 = false;
            return;
        }
        throw null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.A01) {
            C56112mj c56112mj = this.A02;
            c56112mj.A03.draw(canvas);
            c56112mj.A02.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.A02.setBounds(0, 0, i, i2);
        A00();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.A02 == drawable;
    }
}
