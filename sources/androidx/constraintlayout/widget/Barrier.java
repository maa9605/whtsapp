package androidx.constraintlayout.widget;

import X.AbstractC07040Wj;
import X.C0YF;
import X.C12420jO;
import X.C38411o6;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends AbstractC07040Wj {
    public int A00;
    public int A01;
    public C38411o6 A02;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // X.AbstractC07040Wj
    public void A04(AttributeSet attributeSet) {
        super.A04(attributeSet);
        this.A02 = new C38411o6();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C12420jO.A0I);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.A00 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 14) {
                    this.A02.A02 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.A02.A01 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        super.A02 = this.A02;
        A02();
    }

    @Override // X.AbstractC07040Wj
    public void A05(C0YF c0yf, boolean z) {
        int i = this.A00;
        this.A01 = i;
        if (Build.VERSION.SDK_INT < 17) {
            if (i == 5) {
                this.A01 = 0;
                i = 0;
            } else if (i == 6) {
                this.A01 = 1;
                i = 1;
            }
        } else if (z) {
            if (i == 5) {
                this.A01 = 1;
                i = 1;
            } else if (i == 6) {
                this.A01 = 0;
                i = 0;
            }
        } else if (i == 5) {
            this.A01 = 0;
            i = 0;
        } else if (i == 6) {
            this.A01 = 1;
            i = 1;
        }
        if (c0yf instanceof C38411o6) {
            ((C38411o6) c0yf).A00 = i;
        }
    }

    public int getMargin() {
        return this.A02.A01;
    }

    public int getType() {
        return this.A00;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.A02.A02 = z;
    }

    public void setDpMargin(int i) {
        this.A02.A01 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.A02.A01 = i;
    }

    public void setType(int i) {
        this.A00 = i;
    }
}
