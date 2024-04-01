package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: X.1UF  reason: invalid class name */
/* loaded from: classes.dex */
public class C1UF implements InterfaceC15150oA {
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    public void A00(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 >= 0) {
            int i3 = this.A00 << 1;
            int[] iArr = this.A03;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.A03 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 << 1];
                this.A03 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.A03;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.A00++;
            return;
        }
        throw new IllegalArgumentException("Pixel distance must be non-negative");
    }

    public void A01(RecyclerView recyclerView, boolean z) {
        this.A00 = 0;
        int[] iArr = this.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        C0SV c0sv = recyclerView.A0S;
        AbstractC04890Mh abstractC04890Mh = recyclerView.A0N;
        if (abstractC04890Mh == null || c0sv == null) {
            return;
        }
        if (z) {
            if (!(recyclerView.A0J.A04.size() > 0)) {
                c0sv.A0M(abstractC04890Mh.A0C(), this);
            }
        } else if (recyclerView.A0h && !recyclerView.A0e) {
            if (!(recyclerView.A0J.A04.size() > 0)) {
                c0sv.A0v(this.A01, this.A02, recyclerView.A0z, this);
            }
        }
        int i = this.A00;
        if (i > c0sv.A02) {
            c0sv.A02 = i;
            c0sv.A0E = z;
            recyclerView.A0x.A03();
        }
    }
}
