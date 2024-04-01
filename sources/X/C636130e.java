package X;

import android.graphics.PointF;

/* renamed from: X.30e  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C636130e extends PointF {
    public C636130e() {
        super(0.0f, 0.0f);
    }

    public C636130e(float f, float f2) {
        super(f, f2);
    }

    public C636130e(PointF pointF) {
        super(pointF.x, pointF.y);
    }

    public float A00(PointF pointF) {
        float f = ((PointF) this).x - pointF.x;
        float f2 = ((PointF) this).y - pointF.y;
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }
}
