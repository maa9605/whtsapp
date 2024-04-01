package X;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.30h */
/* loaded from: classes2.dex */
public abstract class AbstractC636430h {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final LinearLayoutManager A03;
    public final AbstractC15200oF A04 = new AbstractC15200oF() { // from class: X.3Hn
        {
            AbstractC636430h.this = this;
        }

        @Override // X.AbstractC15200oF
        public void A00(RecyclerView recyclerView, int i) {
            if (i == 1) {
                AbstractC636430h.this.A02 = true;
            } else if (i != 0) {
            } else {
                AbstractC636430h.this.A09.A0G();
            }
        }

        @Override // X.AbstractC15200oF
        public void A01(RecyclerView recyclerView, int i, int i2) {
            AbstractC636430h abstractC636430h = AbstractC636430h.this;
            if (!abstractC636430h.A02 || i2 == 0) {
                return;
            }
            abstractC636430h.A09.A0G();
        }
    };
    public final AbstractC15270oM A05;
    public final RecyclerView A06;
    public final C3HG A07;
    public final ShapePickerRecyclerView A08;
    public final C67973Ho A09;

    public AbstractC636430h(RecyclerView recyclerView, ShapePickerRecyclerView shapePickerRecyclerView, C3HG c3hg, boolean z) {
        C67973Ho c67973Ho = new C67973Ho(this);
        this.A09 = c67973Ho;
        c67973Ho.A0B(z);
        recyclerView.setItemAnimator(null);
        this.A08 = shapePickerRecyclerView;
        this.A07 = c3hg;
        shapePickerRecyclerView.A0m(this.A04);
        recyclerView.getContext();
        this.A03 = new LinearLayoutManager(0);
        this.A05 = new C1UM(recyclerView.getContext()) { // from class: X.3L8
            @Override // X.C1UM
            public int A05() {
                return -1;
            }

            @Override // X.C1UM
            public float A04(DisplayMetrics displayMetrics) {
                return 40.0f / TypedValue.applyDimension(1, 40.0f, displayMetrics);
            }
        };
        this.A06 = recyclerView;
        recyclerView.setAdapter(this.A09);
        this.A06.setLayoutManager(this.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0012, code lost:
        if (r5.A09.A0C() <= 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00() {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r4 = r5.A06
            int r3 = r4.getVisibility()
            boolean r0 = r5.A01
            r2 = 0
            if (r0 == 0) goto L14
            X.3Ho r0 = r5.A09
            int r1 = r0.A0C()
            r0 = 0
            if (r1 > 0) goto L16
        L14:
            r0 = 8
        L16:
            r4.setVisibility(r0)
            if (r3 == r0) goto L2d
            X.3HG r1 = r5.A07
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L24
            r2 = 1
        L24:
            X.2IP r0 = r1.A00
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView r1 = r0.A0b
            boolean r0 = r0.A0E
            r1.A13(r0, r2)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC636430h.A00():void");
    }

    public void A01(C67983Hp c67983Hp, boolean z) {
        View view = c67983Hp.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Resources resources = this.A06.getContext().getResources();
        int i = R.dimen.shape_picker_subcategory_selected_portrait_dimen;
        if (z) {
            i = R.dimen.shape_picker_subcategory_selected_landscape_dimen;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        view.setLayoutParams(layoutParams);
    }

    public void A02(boolean z) {
        RecyclerView recyclerView = this.A06;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Resources resources = recyclerView.getContext().getResources();
        int i = R.dimen.shape_picker_subcategories_portrait_height;
        if (z) {
            i = R.dimen.shape_picker_subcategories_landscape_height;
        }
        layoutParams.height = resources.getDimensionPixelSize(i);
        recyclerView.setLayoutParams(layoutParams);
        for (int i2 = 0; i2 < this.A09.A0C(); i2++) {
            C67983Hp c67983Hp = (C67983Hp) recyclerView.A0C(i2);
            if (c67983Hp != null) {
                A01(c67983Hp, z);
            }
        }
        this.A00 = z;
    }
}
