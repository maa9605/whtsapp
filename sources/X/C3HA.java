package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3HA  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3HA extends AnonymousClass308 {
    public float A00;
    public int A01;
    public PointF A02;
    public boolean A03;

    public C3HA(Handler handler, ViewGroup viewGroup, RectF rectF, Vibrator vibrator) {
        super(handler, viewGroup, rectF, vibrator);
        this.A01 = -1;
        this.A03 = false;
        this.A00 = 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r1 == 3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(float r8) {
        /*
            r6 = 1
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r7 = 0
            if (r0 >= 0) goto L8
            r7 = 1
        L8:
            float r5 = java.lang.Math.abs(r8)
            r0 = 1127481344(0x43340000, float:180.0)
            float r5 = r5 % r0
            r4 = 1110704128(0x42340000, float:45.0)
            float r0 = r5 / r4
            double r0 = (double) r0
            double r2 = java.lang.Math.floor(r0)
            int r1 = (int) r2
            float r5 = r5 % r4
            r0 = 1108869120(0x42180000, float:38.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L30
            int r1 = r1 + 1
        L22:
            r0 = 3
            if (r7 == 0) goto L2e
            if (r1 != r6) goto L2b
            r6 = 3
        L28:
            int r0 = r6 % 4
            return r0
        L2b:
            if (r1 != r0) goto L2e
            goto L28
        L2e:
            r6 = r1
            goto L28
        L30:
            r0 = 1088421888(0x40e00000, float:7.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L22
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3HA.A00(float):int");
    }

    @Override // X.AnonymousClass308
    public void A01() {
        super.A01();
        View view = this.A06;
        if (view.getVisibility() == 0) {
            view.invalidate();
        }
    }
}
