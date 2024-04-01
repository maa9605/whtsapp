package X;

import android.graphics.PointF;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: X.30b */
/* loaded from: classes2.dex */
public class C635830b {
    public static final PointF A09 = new C636130e();
    public float A05;
    public C635730a A06;
    public C635730a A07;
    public final NavigableMap A08 = new TreeMap();
    public float A03 = 0.0f;
    public float A04 = 1.0f;
    public float A02 = 0.0f;
    public float A01 = 1.0f;
    public float A00 = 0.0f;

    public void A00(PointF pointF, PointF pointF2, float f) {
        C635730a c635730a = this.A07;
        if (c635730a == null) {
            PointF pointF3 = A09;
            float f2 = pointF3.x;
            float[] fArr = {f2, f2, pointF2.x, pointF.x};
            float f3 = pointF3.y;
            this.A07 = new C635730a(fArr, new float[]{f3, f3, pointF2.y, pointF.y});
            this.A05 = f;
            return;
        }
        float[] fArr2 = c635730a.A01;
        float[] fArr3 = {fArr2[3], fArr2[2], pointF2.x, pointF.x};
        float[] fArr4 = c635730a.A02;
        C635730a c635730a2 = new C635730a(fArr3, new float[]{fArr4[3], fArr4[2], pointF2.y, pointF.y});
        this.A07 = c635730a2;
        this.A08.put(Float.valueOf(this.A03), c635730a2);
        this.A03 = this.A07.A00() + this.A03;
        this.A02 = f - this.A05;
    }
}
