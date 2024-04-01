package com.whatsapp.mediacomposer.doodle.shapepicker;

import X.AbstractC04890Mh;
import X.AbstractC15270oM;
import X.C1UM;
import X.C2IQ;
import X.C2Y1;
import X.C3HT;
import X.C43811y1;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ShapePickerRecyclerView extends C2Y1 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public GridLayoutManager A06;
    public AbstractC15270oM A07;
    public C43811y1 A08;

    public ShapePickerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_size);
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_large_grid_size);
        this.A04 = context.getResources().getDimensionPixelOffset(R.dimen.shape_picker_new_shape_size);
        setShapeSpacing(getContext().getResources().getConfiguration().orientation == 1);
        this.A02 = -1;
        this.A03 = -1;
        this.A0i = true;
        this.A07 = new C1UM(context) { // from class: X.3L5
            @Override // X.C1UM
            public int A06() {
                return -1;
            }
        };
    }

    public Pair A11() {
        if (this.A08.A01) {
            A12();
            Integer valueOf = Integer.valueOf(this.A03);
            return new Pair(valueOf, valueOf);
        }
        int measuredWidth = getMeasuredWidth();
        int i = this.A01;
        int max = Math.max(1, ((i >> 1) + measuredWidth) / i);
        int measuredWidth2 = getMeasuredWidth();
        int i2 = this.A00;
        return new Pair(Integer.valueOf(max), Integer.valueOf(Math.max(1, ((i2 >> 1) + measuredWidth2) / i2)));
    }

    public final void A12() {
        if (this.A03 == -1) {
            int measuredWidth = getMeasuredWidth();
            int i = this.A04;
            int i2 = i + this.A05;
            int i3 = measuredWidth / i2;
            if ((i2 * i3) + i <= getMeasuredWidth()) {
                i3++;
            }
            this.A03 = Math.max(1, i3);
        }
    }

    public void A13(boolean z, boolean z2) {
        int i;
        if (this.A08.A01) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.shape_picker_recycler_view_horizontal_padding);
            Resources resources = getResources();
            int i2 = R.dimen.shape_picker_recycler_view_portrait_top_padding;
            if (z) {
                i2 = R.dimen.shape_picker_recycler_view_landscape_top_padding;
            }
            int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
            if (z2) {
                Resources resources2 = getResources();
                int i3 = R.dimen.shape_picker_recycler_view_portrait_bottom_padding;
                if (z) {
                    i3 = R.dimen.shape_picker_recycler_view_landscape_bottom_padding;
                }
                i = resources2.getDimensionPixelSize(i3);
            } else {
                i = 0;
            }
            setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, i);
        }
    }

    public int getAdapterItemCount() {
        AbstractC04890Mh abstractC04890Mh = this.A0N;
        if (abstractC04890Mh != null) {
            return abstractC04890Mh.A0C();
        }
        throw new IllegalStateException("Must set adapter first");
    }

    public int getShapePickerV2ColumnCount() {
        A12();
        return this.A03;
    }

    public int getShapePickerV2Spacing() {
        int i = this.A02;
        if (i == -1) {
            A12();
            if (this.A03 > 1) {
                int measuredWidth = getMeasuredWidth();
                int i2 = this.A03;
                int i3 = (measuredWidth - (this.A04 * i2)) / (i2 - 1);
                this.A02 = i3;
                return i3;
            }
            this.A02 = 0;
            return 0;
        }
        return i;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setShapeSpacing(configuration.orientation == 1);
        this.A02 = -1;
        this.A03 = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A01 <= 0 || this.A00 <= 0) {
            return;
        }
        this.A02 = -1;
        this.A03 = -1;
        Pair A11 = A11();
        int intValue = ((Number) A11.first).intValue();
        int intValue2 = ((Number) A11.second).intValue();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.A0S;
        gridLayoutManager.A1q(intValue * intValue2);
        AbstractC04890Mh abstractC04890Mh = this.A0N;
        if (abstractC04890Mh instanceof C2IQ) {
            C2IQ c2iq = (C2IQ) abstractC04890Mh;
            gridLayoutManager.A01 = new C3HT(c2iq, intValue2, intValue, gridLayoutManager);
            if (c2iq.A00 != intValue2) {
                c2iq.A00 = intValue2;
                if (c2iq.A02 == null) {
                    c2iq.A0I();
                }
            }
        }
        A0N();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC04890Mh abstractC04890Mh) {
        super.setAdapter(abstractC04890Mh);
        this.A02 = -1;
        this.A03 = -1;
        Pair A11 = A11();
        int intValue = ((Number) A11.first).intValue();
        int intValue2 = ((Number) A11.second).intValue();
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(intValue * intValue2);
        this.A06 = gridLayoutManager;
        if (abstractC04890Mh instanceof C2IQ) {
            C2IQ c2iq = (C2IQ) abstractC04890Mh;
            gridLayoutManager.A01 = new C3HT(c2iq, intValue2, intValue, gridLayoutManager);
            if (c2iq.A00 != intValue2) {
                c2iq.A00 = intValue2;
                if (c2iq.A02 == null) {
                    c2iq.A0I();
                }
            }
        }
        setLayoutManager(this.A06);
    }

    private void setShapeSpacing(boolean z) {
        Resources resources = getContext().getResources();
        int i = R.dimen.shape_picker_shape_landscape_spacing;
        if (z) {
            i = R.dimen.shape_picker_shape_portrait_spacing;
        }
        this.A05 = resources.getDimensionPixelSize(i);
    }
}
