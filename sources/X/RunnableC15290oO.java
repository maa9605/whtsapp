package X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0oO */
/* loaded from: classes.dex */
public class RunnableC15290oO implements Runnable {
    public int A00;
    public int A01;
    public Interpolator A02;
    public OverScroller A03;
    public boolean A04;
    public boolean A05;
    public final /* synthetic */ RecyclerView A06;

    public RunnableC15290oO(RecyclerView recyclerView) {
        this.A06 = recyclerView;
        Interpolator interpolator = RecyclerView.A1C;
        this.A02 = interpolator;
        this.A04 = false;
        this.A05 = false;
        this.A03 = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final int A00(int i, int i2) {
        int i3;
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        boolean z = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
        RecyclerView recyclerView = this.A06;
        int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
        float f = width;
        float f2 = width >> 1;
        float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
        if (sqrt > 0) {
            i3 = Math.round(Math.abs(sin / sqrt) * 1000.0f) << 2;
        } else {
            if (!z) {
                abs = abs2;
            }
            i3 = (int) (((abs / f) + 1.0f) * 300.0f);
        }
        return Math.min(i3, 2000);
    }

    public void A01() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        RecyclerView recyclerView = this.A06;
        recyclerView.removeCallbacks(this);
        recyclerView.postOnAnimation(this);
    }

    public void A02(int i, int i2, int i3, Interpolator interpolator) {
        if (this.A02 != interpolator) {
            this.A02 = interpolator;
            this.A03 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A06.setScrollState(2);
        this.A01 = 0;
        this.A00 = 0;
        this.A03.startScroll(0, 0, i, i2, i3);
        if (Build.VERSION.SDK_INT < 23) {
            this.A03.computeScrollOffset();
        }
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x00cf, code lost:
        if (r1 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00d7, code lost:
        if (r0.getFinalX() != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0101, code lost:
        if (r4 != r6) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x015f, code lost:
        if (r2 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x017a, code lost:
        if (r2 > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0182, code lost:
        if (r3 <= 0) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00b2  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC15290oO.run():void");
    }
}
