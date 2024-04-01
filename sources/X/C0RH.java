package X;

import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0RH */
/* loaded from: classes.dex */
public class C0RH {
    public static final long A07 = TimeUnit.MINUTES.toNanos(1);
    public double A00;
    public double A01;
    public long A02;
    public C0RJ A04;
    public final double A06;
    public boolean A05 = false;
    public C0RI A03 = new C0RI(Choreographer.getInstance(), new C09910ez(this));

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        if (r5 > 80.0d) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0RH(X.C0RJ r13, android.content.Context r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r12.A05 = r0
            r12.A04 = r13
            X.0ez r2 = new X.0ez
            r2.<init>(r12)
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            X.0RI r0 = new X.0RI
            r0.<init>(r1, r2)
            r12.A03 = r0
            X.0f1 r11 = X.C09930f1.A01
            if (r11 != 0) goto L23
            X.0f1 r11 = new X.0f1
            r11.<init>()
            X.C09930f1.A01 = r11
        L23:
            long r5 = r11.A00
            r3 = 0
            r1 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L4e
            java.lang.String r0 = "window"
            java.lang.Object r0 = r14.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            float r0 = r0.getRefreshRate()
            double r5 = (double) r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L58
            r5 = 4633641066610819072(0x404e000000000000, double:60.0)
        L44:
            long r9 = X.C09930f1.A02
            double r7 = (double) r9
            double r7 = r7 / r5
            long r5 = java.lang.Math.round(r7)
            r11.A00 = r5
        L4e:
            double r7 = (double) r5
            r12.A06 = r7
            r12.A01 = r1
            r12.A00 = r1
            r12.A02 = r3
            return
        L58:
            r7 = 4629137466983448576(0x403e000000000000, double:30.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L64
            r7 = 4635329916471083008(0x4054000000000000, double:80.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L44
        L64:
            r5 = r7
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RH.<init>(X.0RJ, android.content.Context):void");
    }
}
