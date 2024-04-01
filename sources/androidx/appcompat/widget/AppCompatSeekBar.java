package androidx.appcompat.widget;

import X.C1SD;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {
    public final C1SD A00;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        C1SD c1sd = new C1SD(this);
        this.A00 = c1sd;
        c1sd.A01(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1SD c1sd = this.A00;
        Drawable drawable = c1sd.A02;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = c1sd.A05;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A00.A02;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C1SD c1sd = this.A00;
        if (c1sd.A02 != null) {
            SeekBar seekBar = c1sd.A05;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = c1sd.A02.getIntrinsicWidth();
                int intrinsicHeight = c1sd.A02.getIntrinsicHeight();
                int i = intrinsicWidth >> 1;
                if (intrinsicWidth < 0) {
                    i = 1;
                }
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight >> 1 : 1;
                c1sd.A02.setBounds(-i, -i2, i, i2);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() >> 1);
                for (int i3 = 0; i3 <= max; i3++) {
                    c1sd.A02.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
