package androidx.constraintlayout.widget;

import X.C0Wg;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class Guideline extends View {
    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0Wg c0Wg = (C0Wg) getLayoutParams();
        c0Wg.A0Q = i;
        setLayoutParams(c0Wg);
    }

    public void setGuidelineEnd(int i) {
        C0Wg c0Wg = (C0Wg) getLayoutParams();
        c0Wg.A0R = i;
        setLayoutParams(c0Wg);
    }

    public void setGuidelinePercent(float f) {
        C0Wg c0Wg = (C0Wg) getLayoutParams();
        c0Wg.A01 = f;
        setLayoutParams(c0Wg);
    }
}
