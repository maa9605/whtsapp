package X;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Ub */
/* loaded from: classes.dex */
public abstract class AbstractC28841Ub extends AbstractC15180oD {
    public Scroller A00;
    public RecyclerView A01;
    public final AbstractC15200oF A02 = new AbstractC15200oF() { // from class: X.1Ua
        public boolean A00 = false;

        {
            AbstractC28841Ub.this = this;
        }

        @Override // X.AbstractC15200oF
        public void A00(RecyclerView recyclerView, int i) {
            if (i == 0 && this.A00) {
                this.A00 = false;
                AbstractC28841Ub.this.A00();
            }
        }

        @Override // X.AbstractC15200oF
        public void A01(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.A00 = true;
        }
    };

    public abstract int A02(C0SV c0sv, int i, int i2);

    public abstract View A03(C0SV c0sv);

    public abstract int[] A05(C0SV c0sv, View view);

    public void A00() {
        C0SV c0sv;
        View A03;
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null || (c0sv = recyclerView.A0S) == null || (A03 = A03(c0sv)) == null) {
            return;
        }
        int[] A05 = A05(c0sv, A03);
        int i = A05[0];
        if (i == 0 && A05[1] == 0) {
            return;
        }
        this.A01.A0d(i, A05[1]);
    }

    public void A01(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.A0n(this.A02);
            this.A01.A0T = null;
        }
        this.A01 = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.A0T == null) {
                recyclerView.A0m(this.A02);
                RecyclerView recyclerView3 = this.A01;
                recyclerView3.A0T = this;
                this.A00 = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
                A00();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public C1UM A04(C0SV c0sv) {
        if (c0sv instanceof C0SX) {
            return new C1UM(this.A01.getContext()) { // from class: X.1of
                {
                    AbstractC28841Ub.this = this;
                }

                @Override // X.C1UM, X.AbstractC15270oM
                public void A03(View view, C0Y0 c0y0, C15260oL c15260oL) {
                    AbstractC28841Ub abstractC28841Ub = AbstractC28841Ub.this;
                    RecyclerView recyclerView = abstractC28841Ub.A01;
                    if (recyclerView == null) {
                        return;
                    }
                    int[] A05 = abstractC28841Ub.A05(recyclerView.A0S, view);
                    int i = A05[0];
                    int i2 = A05[1];
                    int ceil = (int) Math.ceil(A07(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                    if (ceil > 0) {
                        DecelerateInterpolator decelerateInterpolator = ((C1UM) this).A04;
                        c15260oL.A02 = i;
                        c15260oL.A03 = i2;
                        c15260oL.A01 = ceil;
                        c15260oL.A05 = decelerateInterpolator;
                        c15260oL.A06 = true;
                    }
                }

                @Override // X.C1UM
                public float A04(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }
            };
        }
        return null;
    }
}
