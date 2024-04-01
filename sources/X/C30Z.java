package X;

import android.graphics.PointF;

/* renamed from: X.30Z  reason: invalid class name */
/* loaded from: classes2.dex */
public class C30Z {
    public C636130e A00;
    public C636130e A01;
    public final long A02;
    public final C635830b A03 = new C635830b();
    public final C636130e A04 = new C636130e();

    public C30Z(PointF pointF, long j) {
        C636130e c636130e = new C636130e(pointF);
        this.A00 = c636130e;
        this.A01 = c636130e;
        this.A02 = j;
        this.A03.A00(c636130e, this.A04, (float) j);
    }

    public void A00(PointF pointF, long j) {
        if (j >= this.A02) {
            C636130e c636130e = this.A00;
            C636130e c636130e2 = this.A01;
            if (c636130e == c636130e2) {
                this.A00 = new C636130e(pointF);
                return;
            }
            C636130e c636130e3 = this.A04;
            if (c636130e3 != null) {
                float f = pointF.x - ((PointF) c636130e2).x;
                ((PointF) c636130e3).x = f;
                float f2 = pointF.y - ((PointF) c636130e2).y;
                ((PointF) c636130e3).y = f2;
                ((PointF) c636130e3).x = f * 0.5f;
                ((PointF) c636130e3).y = f2 * 0.5f;
                this.A03.A00(c636130e, c636130e3, (float) j);
                this.A01.set(this.A00);
                this.A00.set(pointF);
                return;
            }
            throw null;
        }
        throw new IllegalStateException("events must deliver in order");
    }
}
