package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Tx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28811Tx extends AbstractC08920cK {
    public int A00;
    public Drawable A01;
    public boolean A02 = true;
    public final /* synthetic */ PreferenceFragmentCompat A03;

    public C28811Tx(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.A03 = preferenceFragmentCompat;
    }

    @Override // X.AbstractC08920cK
    public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
        if (A03(view, recyclerView)) {
            rect.bottom = this.A00;
        }
    }

    @Override // X.AbstractC08920cK
    public void A02(Canvas canvas, RecyclerView recyclerView, C0Y0 c0y0) {
        if (this.A01 == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (A03(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.A01.setBounds(0, height, width, this.A00 + height);
                this.A01.draw(canvas);
            }
        }
    }

    public final boolean A03(View view, RecyclerView recyclerView) {
        C0TS A0E = recyclerView.A0E(view);
        if ((A0E instanceof C1U3) && ((C1U3) A0E).A01) {
            boolean z = this.A02;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                C0TS A0E2 = recyclerView.A0E(recyclerView.getChildAt(indexOfChild + 1));
                return (A0E2 instanceof C1U3) && ((C1U3) A0E2).A00;
            }
            return z;
        }
        return false;
    }
}
