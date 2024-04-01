package X;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.3HT  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3HT extends AbstractC14890nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ GridLayoutManager A02;
    public final /* synthetic */ C2IQ A03;

    public C3HT(C2IQ c2iq, int i, int i2, GridLayoutManager gridLayoutManager) {
        this.A03 = c2iq;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = gridLayoutManager;
    }

    @Override // X.AbstractC14890nk
    public int A00(int i) {
        int i2 = this.A03.A0G(i).A00;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return this.A02.A00;
                }
                throw new IllegalStateException("shapepickerrecyclerview/invalid grid size");
            }
            return this.A01;
        }
        return this.A00;
    }
}
