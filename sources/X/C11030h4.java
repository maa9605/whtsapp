package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.google.android.search.verification.client.R;

/* renamed from: X.0h4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11030h4 extends RatingBar {
    public final C11020h3 A00;

    public C11030h4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        C11020h3 c11020h3 = new C11020h3(this);
        this.A00 = c11020h3;
        c11020h3.A01(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.A00.A00;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
