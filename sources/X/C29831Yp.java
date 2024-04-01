package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Yp */
/* loaded from: classes.dex */
public class C29831Yp extends AbstractC08920cK {
    public float A00;
    public C33681gI A01;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06 = new Paint();
    public final RectF A07 = new RectF();
    public boolean A02 = false;

    public C29831Yp(int i, int i2, int i3, boolean z) {
        this.A06.setColor(i);
        this.A05 = Color.alpha(i);
        this.A04 = i2;
        this.A03 = i3;
        if (z) {
            this.A00 = 1.0f;
        }
    }

    @Override // X.AbstractC08920cK
    public void A02(Canvas canvas, RecyclerView recyclerView, C0Y0 c0y0) {
        RectF rectF;
        int width;
        C33681gI c33681gI = this.A01;
        if (c33681gI != null && !this.A02 && c33681gI.A02) {
            C1EE c1ee = new C1EE(c33681gI, recyclerView);
            c33681gI.A01 = c1ee;
            recyclerView.postDelayed(c1ee, 1500L);
        }
        this.A02 = true;
        float f = this.A00;
        if (f == 0.0f) {
            return;
        }
        Paint paint = this.A06;
        paint.setAlpha((int) (f * this.A05));
        C0SV c0sv = recyclerView.A0S;
        if (c0sv instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0sv;
            if (linearLayoutManager.A01 == 1) {
                int A1M = linearLayoutManager.A1M(c0y0);
                int A1O = linearLayoutManager.A1O(c0y0);
                int height = recyclerView.getHeight();
                int A1N = linearLayoutManager.A1N(c0y0);
                int round = Math.round((height * A1M) / A1O);
                int i = height >> 1;
                if (round > i) {
                    round = i;
                }
                int round2 = Math.round(((height - round) * A1N) / (A1O - A1M));
                boolean z = C0AT.A05(((C0SV) linearLayoutManager).A07) == 1;
                rectF = this.A07;
                rectF.left = z ? 0.0f : recyclerView.getWidth() - this.A04;
                rectF.top = round2;
                if (z) {
                    width = this.A04;
                } else {
                    width = recyclerView.getWidth();
                }
                rectF.right = width;
                rectF.bottom = round2 + round;
            } else {
                int A1M2 = linearLayoutManager.A1M(c0y0);
                int A1O2 = linearLayoutManager.A1O(c0y0);
                int width2 = recyclerView.getWidth();
                int A1N2 = linearLayoutManager.A1N(c0y0);
                int round3 = Math.round((width2 * A1M2) / A1O2);
                int i2 = width2 >> 1;
                if (round3 > i2) {
                    round3 = i2;
                }
                int round4 = Math.round(((width2 - round3) * A1N2) / (A1O2 - A1M2));
                rectF = this.A07;
                rectF.left = round4;
                rectF.top = recyclerView.getHeight() - this.A04;
                rectF.right = round4 + round3;
                rectF.bottom = recyclerView.getHeight();
            }
            float f2 = this.A03;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }
}
