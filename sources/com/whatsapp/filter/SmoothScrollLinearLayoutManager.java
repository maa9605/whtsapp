package com.whatsapp.filter;

import X.AbstractC15270oM;
import X.C0Y0;
import X.C1UM;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class SmoothScrollLinearLayoutManager extends LinearLayoutManager {
    public SmoothScrollLinearLayoutManager() {
        super(0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0SV
    public void A18(RecyclerView recyclerView, C0Y0 c0y0, int i) {
        final Context context = recyclerView.getContext();
        C1UM c1um = new C1UM(context) { // from class: X.3K5
            @Override // X.C1UM
            public float A04(DisplayMetrics displayMetrics) {
                return 150.0f / displayMetrics.densityDpi;
            }
        };
        ((AbstractC15270oM) c1um).A00 = i;
        A0W(c1um);
    }
}
