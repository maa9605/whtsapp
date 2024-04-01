package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1gI */
/* loaded from: classes.dex */
public class C33681gI extends AbstractC15200oF {
    public ValueAnimator A00;
    public Runnable A01;
    public boolean A02;
    public final C29831Yp A03;

    public C33681gI(C29831Yp c29831Yp) {
        this.A03 = c29831Yp;
        c29831Yp.A01 = this;
        this.A02 = c29831Yp.A00 != 0.0f;
    }

    @Override // X.AbstractC15200oF
    public void A00(RecyclerView recyclerView, int i) {
        if (i == 0) {
            C1EE c1ee = new C1EE(this, recyclerView);
            this.A01 = c1ee;
            recyclerView.postDelayed(c1ee, 1500L);
            return;
        }
        recyclerView.removeCallbacks(this.A01);
        if (this.A02) {
            return;
        }
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.A00.cancel();
        }
        C29831Yp c29831Yp = this.A03;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c29831Yp.A00, 1.0f);
        ofFloat.addUpdateListener(new C1EF(recyclerView, c29831Yp));
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.A02 = true;
    }
}
