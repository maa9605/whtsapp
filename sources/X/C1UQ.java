package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1UQ  reason: invalid class name */
/* loaded from: classes.dex */
public class C1UQ implements InterfaceC15420ob {
    public final /* synthetic */ RecyclerView A00;

    public C1UQ(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A00(C0TS c0ts, C15140o9 c15140o9, C15140o9 c15140o92) {
        boolean A0A;
        int i;
        int i2;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            c0ts.A07(false);
            C0TQ c0tq = (C0TQ) recyclerView.A0R;
            if (c0tq != null) {
                if (c15140o9 != null && ((i = c15140o9.A00) != (i2 = c15140o92.A00) || c15140o9.A01 != c15140o92.A01)) {
                    A0A = c0tq.A0C(c0ts, i, c15140o9.A01, i2, c15140o92.A01);
                } else {
                    A0A = c0tq.A0A(c0ts);
                }
                if (A0A) {
                    recyclerView.A0P();
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public void A01(C0TS c0ts, C15140o9 c15140o9, C15140o9 c15140o92) {
        int i;
        int i2;
        boolean A0B;
        RecyclerView recyclerView = this.A00;
        recyclerView.A0x.A09(c0ts);
        recyclerView.A0p(c0ts);
        c0ts.A07(false);
        C0TQ c0tq = (C0TQ) recyclerView.A0R;
        if (c0tq != null) {
            int i3 = c15140o9.A00;
            int i4 = c15140o9.A01;
            View view = c0ts.A0H;
            if (c15140o92 == null) {
                i = view.getLeft();
            } else {
                i = c15140o92.A00;
            }
            if (c15140o92 == null) {
                i2 = view.getTop();
            } else {
                i2 = c15140o92.A01;
            }
            if (!c0ts.A09() && (i3 != i || i4 != i2)) {
                view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
                A0B = c0tq.A0C(c0ts, i3, i4, i, i2);
            } else {
                A0B = c0tq.A0B(c0ts);
            }
            if (A0B) {
                recyclerView.A0P();
                return;
            }
            return;
        }
        throw null;
    }
}
