package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.333  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass333 extends AbstractC08920cK {
    public int A00 = 0;
    public int A01;
    public final int A02;

    public AnonymousClass333(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // X.AbstractC08920cK
    public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
        int A00 = RecyclerView.A00(view);
        if (A00 == 0) {
            rect.set(0, this.A01, 0, 0);
        } else if (A00 != this.A02 - 1) {
        } else {
            rect.set(0, 0, 0, this.A00);
        }
    }
}
