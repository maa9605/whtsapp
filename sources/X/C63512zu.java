package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;

/* renamed from: X.2zu */
/* loaded from: classes2.dex */
public class C63512zu {
    public float A00;
    public int A02;
    public int A03;
    public int A04;
    public Rect A05;
    public RectF A06;
    public RectF A07;
    public DisplayMetrics A08;
    public final Matrix A09 = new Matrix();
    public final Matrix A0A = new Matrix();
    public float A01 = 1.0f;
    public final RectF A0B = new RectF();

    public void A00(C2EK c2ek) {
        this.A06 = c2ek.A02;
        RectF rectF = c2ek.A01;
        this.A07 = rectF;
        int i = c2ek.A00;
        this.A02 = i;
        this.A05 = null;
        this.A01 = 1.0f;
        if (rectF != null) {
            C40841sx.A07(i, rectF, this.A09);
        }
    }
}
