package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.0Mh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04890Mh {
    public final C0S7 A01 = new C0S7();
    public boolean A00 = false;

    public long A00(int i) {
        return -1L;
    }

    public void A05(C0TS c0ts) {
    }

    public void A06(C0TS c0ts) {
    }

    public void A07(C0TS c0ts) {
    }

    public void A09(RecyclerView recyclerView) {
    }

    public void A0A(RecyclerView recyclerView) {
    }

    public abstract int A0C();

    public int A0D(int i) {
        return 0;
    }

    public abstract C0TS A0E(ViewGroup viewGroup, int i);

    public abstract void A0F(C0TS c0ts, int i);

    public final void A01() {
        this.A01.A00();
    }

    public final void A02(int i) {
        this.A01.A04(i, 1, null);
    }

    public final void A03(int i) {
        this.A01.A02(i, 1);
    }

    public final void A04(int i) {
        this.A01.A03(i, 1);
    }

    public void A08(C0TS c0ts, int i, List list) {
        A0F(c0ts, i);
    }

    public void A0B(boolean z) {
        if (!this.A01.A05()) {
            this.A00 = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
}
