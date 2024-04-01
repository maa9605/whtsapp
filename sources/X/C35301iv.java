package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1iv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35301iv extends AbstractC08920cK {
    public final int A00;
    public final C002301c A01;

    public C35301iv(C002301c c002301c, int i) {
        this.A01 = c002301c;
        this.A00 = i;
    }

    @Override // X.AbstractC08920cK
    public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
        int i;
        C1UH c1uh = (C1UH) view.getLayoutParams();
        int i2 = c1uh.A01;
        int i3 = ((GridLayoutManager) recyclerView.A0S).A00;
        int i4 = c1uh.A00;
        if (i2 != i3 && i3 != 0) {
            int i5 = i4 / i2;
            rect.top = 0;
            int i6 = this.A00;
            rect.bottom = i6;
            float f = i6;
            float f2 = i3 / i2;
            int floor = (int) Math.floor((i5 * f) / f2);
            int ceil = (int) Math.ceil((f * ((i - i5) - 1)) / f2);
            if (this.A01.A0N()) {
                rect.left = ceil;
                rect.right = floor;
                return;
            }
            rect.left = floor;
            rect.right = ceil;
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
