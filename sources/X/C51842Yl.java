package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Yl */
/* loaded from: classes2.dex */
public class C51842Yl extends AbstractC51852Ym {
    public C018708s A00;
    public C003401q A01;

    public C51842Yl(Context context) {
        super(context);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.3Vt
            {
                C51842Yl.this = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int maxChipWidth;
                if (i3 - i == i7 - i5) {
                    return;
                }
                C51842Yl c51842Yl = C51842Yl.this;
                if (c51842Yl.getWidth() > 0) {
                    C32651eT c32651eT = ((AbstractC51832Yh) c51842Yl).A01;
                    if (c32651eT.getChildCount() <= 0 || (maxChipWidth = C51842Yl.getMaxChipWidth(c51842Yl)) <= 0) {
                        return;
                    }
                    for (int i9 = 0; i9 < c32651eT.getChildCount(); i9++) {
                        ((TextView) c32651eT.getChildAt(i9)).setMaxWidth(maxChipWidth);
                    }
                    c51842Yl.measure(View.MeasureSpec.makeMeasureSpec(c51842Yl.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    c51842Yl.removeOnLayoutChangeListener(this);
                    c51842Yl.layout(i, i2, i3, c51842Yl.getMeasuredHeight() + i2);
                    c51842Yl.addOnLayoutChangeListener(this);
                }
            }
        });
        setBackgroundColor(C02160Ac.A00(getContext(), R.color.primary_surface));
    }

    public static int getMaxChipWidth(C51842Yl c51842Yl) {
        return (((c51842Yl.getWidth() - c51842Yl.getPaddingLeft()) - c51842Yl.getPaddingRight()) - ((AbstractC51832Yh) c51842Yl).A01.A01) >> 1;
    }
}
