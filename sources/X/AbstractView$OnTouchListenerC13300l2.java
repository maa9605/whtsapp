package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* renamed from: X.0l2 */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC13300l2 implements View.OnTouchListener {
    public static final int A0G = ViewConfiguration.getTapTimeout();
    public int A00;
    public int A01;
    public Runnable A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final View A0D;
    public final C13280l0 A0F = new C13280l0();
    public final Interpolator A0E = new AccelerateInterpolator();
    public float[] A0B = {0.0f, 0.0f};
    public float[] A08 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] A0C = {0.0f, 0.0f};
    public float[] A0A = {0.0f, 0.0f};
    public float[] A09 = {Float.MAX_VALUE, Float.MAX_VALUE};

    public AbstractView$OnTouchListenerC13300l2(View view) {
        this.A0D = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.A09;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.A0A;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.A01 = 1;
        float[] fArr3 = this.A08;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.A0B;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.A0C;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.A00 = A0G;
        C13280l0 c13280l0 = this.A0F;
        c13280l0.A07 = 500;
        c13280l0.A06 = 500;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0085, code lost:
        if (r6.A04 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x005f, code lost:
        if (r2 == 0.0f) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0071, code lost:
        if (r6.A04 == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float A00(int r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            float[] r0 = r6.A0B
            r3 = r0[r7]
            float[] r0 = r6.A08
            r1 = r0[r7]
            float r3 = r3 * r9
            r5 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L89
            r3 = r1
        Lf:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L75
            r1 = r5
        L14:
            float r9 = r9 - r8
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L62
            r2 = r5
        L1a:
            float r2 = r2 - r1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L4d
            android.view.animation.Interpolator r1 = r6.A0E
            float r0 = -r2
            float r0 = r1.getInterpolation(r0)
            float r2 = -r0
        L27:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L58
            r1 = 1065353216(0x3f800000, float:1.0)
        L31:
            float[] r0 = r6.A0C
            r4 = r0[r7]
            float[] r0 = r6.A0A
            r3 = r0[r7]
            float[] r0 = r6.A09
            r2 = r0[r7]
            float r4 = r4 * r10
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L90
            float r1 = r1 * r4
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L8f
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = r1
            if (r0 >= 0) goto L8f
            return r3
        L4d:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L61
            android.view.animation.Interpolator r0 = r6.A0E
            float r2 = r0.getInterpolation(r2)
            goto L27
        L58:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L31
            r1 = r2
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L31
        L61:
            return r5
        L62:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L73
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 < 0) goto L6f
            float r9 = r9 / r3
            float r2 = r2 - r9
            goto L1a
        L6f:
            boolean r0 = r6.A04
            if (r0 != 0) goto L1a
        L73:
            r2 = r5
            goto L1a
        L75:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L87
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 < 0) goto L83
            float r0 = r8 / r3
            float r1 = r1 - r0
            goto L14
        L83:
            boolean r0 = r6.A04
            if (r0 != 0) goto L14
        L87:
            r1 = r5
            goto L14
        L89:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lf
            r3 = 0
            goto Lf
        L8f:
            return r2
        L90:
            float r1 = -r1
            float r1 = r1 * r4
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L9c
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = r1
            if (r0 >= 0) goto L9c
            r2 = r3
        L9c:
            float r0 = -r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractView$OnTouchListenerC13300l2.A00(int, float, float, float):float");
    }

    public final void A01() {
        int i = 0;
        if (this.A07) {
            this.A04 = false;
            return;
        }
        C13280l0 c13280l0 = this.A0F;
        if (c13280l0 != null) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i2 = (int) (currentAnimationTimeMillis - c13280l0.A09);
            int i3 = c13280l0.A06;
            if (i2 > i3) {
                i = i3;
            } else if (i2 >= 0) {
                i = i2;
            }
            c13280l0.A05 = i;
            c13280l0.A00 = c13280l0.A00(currentAnimationTimeMillis);
            c13280l0.A0A = currentAnimationTimeMillis;
            return;
        }
        throw null;
    }

    public boolean A02() {
        ListView listView;
        int count;
        float f = this.A0F.A02;
        int abs = (int) (f / Math.abs(f));
        if (abs != 0 && (count = (listView = ((C1TQ) this).A00).getCount()) != 0) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs > 0) {
                if (i < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                    return true;
                }
            } else if (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0013, code lost:
        if (r1 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.A05
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            int r1 = r9.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L16
            if (r1 == r4) goto L72
            r0 = 2
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 == r0) goto L72
        L15:
            return r5
        L16:
            r7.A06 = r4
            r7.A03 = r5
        L1a:
            float r2 = r9.getX()
            int r0 = r8.getWidth()
            float r1 = (float) r0
            android.view.View r3 = r7.A0D
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r6 = r7.A00(r5, r2, r1, r0)
            float r2 = r9.getY()
            int r0 = r8.getHeight()
            float r1 = (float) r0
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r1 = r7.A00(r4, r2, r1, r0)
            X.0l0 r0 = r7.A0F
            r0.A01 = r6
            r0.A02 = r1
            boolean r0 = r7.A04
            if (r0 != 0) goto L15
            boolean r0 = r7.A02()
            if (r0 == 0) goto L15
            java.lang.Runnable r2 = r7.A02
            if (r2 != 0) goto L5b
            X.0l1 r2 = new X.0l1
            r2.<init>()
            r7.A02 = r2
        L5b:
            r7.A04 = r4
            r7.A07 = r4
            boolean r0 = r7.A03
            if (r0 != 0) goto L6e
            int r0 = r7.A00
            if (r0 <= 0) goto L6e
            long r0 = (long) r0
            r3.postOnAnimationDelayed(r2, r0)
        L6b:
            r7.A03 = r4
            return r5
        L6e:
            r2.run()
            goto L6b
        L72:
            r7.A01()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractView$OnTouchListenerC13300l2.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
