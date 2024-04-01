package X;

import android.graphics.PointF;

/* renamed from: X.30c  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C635930c {
    public long A01;
    public final C30Z A02;
    public final C636130e A05 = new C636130e();
    public final C636130e A04 = new C636130e();
    public final C636130e A06 = new C636130e();
    public final C636130e A03 = new C636130e();
    public double A00 = 3.0d;

    public C635930c(PointF pointF, long j) {
        this.A02 = new C30Z(pointF, j);
        this.A01 = j;
        this.A05.set(pointF);
        this.A06.set(0.0f, 0.0f);
    }

    public final void A00() {
        C636130e c636130e = this.A03;
        C636130e c636130e2 = this.A04;
        C636130e c636130e3 = this.A05;
        if (c636130e != null) {
            float f = ((PointF) c636130e2).x - ((PointF) c636130e3).x;
            ((PointF) c636130e).x = f;
            float f2 = ((PointF) c636130e2).y - ((PointF) c636130e3).y;
            ((PointF) c636130e).y = f2;
            float f3 = f * 0.05f;
            ((PointF) c636130e).x = f3;
            float f4 = f2 * 0.05f;
            ((PointF) c636130e).y = f4;
            C636130e c636130e4 = this.A06;
            float f5 = ((PointF) c636130e4).x + f3;
            ((PointF) c636130e4).x = f5;
            float f6 = ((PointF) c636130e4).y + f4;
            ((PointF) c636130e4).y = f6;
            float f7 = f5 * 0.7f;
            ((PointF) c636130e4).x = f7;
            float f8 = f6 * 0.7f;
            ((PointF) c636130e4).y = f8;
            ((PointF) c636130e3).x += f7;
            ((PointF) c636130e3).y += f8;
            long j = (long) (this.A01 + 3.0d);
            this.A01 = j;
            this.A02.A00(c636130e3, j);
            return;
        }
        throw null;
    }
}
