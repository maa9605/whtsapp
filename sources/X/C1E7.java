package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1E7  reason: invalid class name */
/* loaded from: classes.dex */
public class C1E7 {
    public C30891bL A00;
    public final C20620xp A01;
    public final C30901bM A02;
    public final C1E8 A03;

    public C1E7(C1E8 c1e8, C20620xp c20620xp, C30901bM c30901bM) {
        this.A03 = c1e8;
        this.A01 = c20620xp;
        this.A02 = c30901bM;
    }

    public void A00(int i, boolean z) {
        if (C0AQ.A02()) {
            C1E8 c1e8 = this.A03;
            RecyclerView recyclerView = c1e8.A06;
            if (recyclerView == null) {
                c1e8.A00 = i;
                c1e8.A08 = z;
                return;
            } else if (z) {
                recyclerView.A0Z(i);
                return;
            } else {
                recyclerView.A0Y(i);
                return;
            }
        }
        throw new RuntimeException("Cannot doScrollTo off the main thread!");
    }
}
