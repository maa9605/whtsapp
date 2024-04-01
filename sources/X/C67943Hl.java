package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3Hl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67943Hl extends AbstractC08920cK {
    public boolean A00;
    public final int A01;
    public final int A02;

    public C67943Hl(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.AbstractC08920cK
    public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
        int i;
        int length;
        view.getLayoutParams();
        rect.set(0, 0, 0, 0);
        int A00 = RecyclerView.A00(view);
        if (this.A00) {
            int width = recyclerView.getWidth();
            int i2 = this.A01;
            length = C67953Hm.A01.length;
            i = (width - (i2 * length)) >> 1;
        } else {
            int width2 = recyclerView.getWidth();
            i = this.A02;
            length = C67953Hm.A01.length;
            int width3 = ((width2 - (i << 1)) - (view.getWidth() * length)) / ((length << 1) - 2);
            rect.left = width3;
            rect.right = width3;
        }
        if (A00 == 0) {
            rect.left = i;
        } else if (A00 != length - 1) {
        } else {
            rect.right = i;
        }
    }
}
