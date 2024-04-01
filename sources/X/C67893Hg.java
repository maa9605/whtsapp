package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.json.JSONObject;

/* renamed from: X.3Hg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C67893Hg extends C2HG {
    public static final C30W[] A07 = {new C30W(68.0f, 47.0f, 309.0f, 266.0f, 164.0f, 156.0f), new C30W(246.0f, 17.0f, 419.0f, 142.0f, 196.0f, 124.0f), new C30W(390.0f, 0.0f, 546.0f, 155.0f, 195.0f, 128.0f), new C30W(507.0f, 1.0f, 686.0f, 179.0f, 208.0f, 146.0f), new C30W(575.0f, 64.0f, 750.0f, 235.0f, 284.0f, 122.0f), new C30W(530.0f, 141.0f, 769.0f, 357.0f, 324.0f, 118.0f), new C30W(459.0f, 261.0f, 664.0f, 449.0f, 300.0f, 180.0f), new C30W(275.0f, 316.0f, 510.0f, 512.0f, 0.0f, 164.0f), new C30W(97.0f, 286.0f, 346.0f, 482.0f, 56.0f, 100.0f), new C30W(17.0f, 279.0f, 174.0f, 419.0f, 67.0f, 152.0f), new C30W(0.0f, 171.0f, 157.0f, 311.0f, 91.0f, 170.0f)};
    public final Matrix A00;
    public final Paint A01;
    public final Path A02;
    public final Path A03;
    public final Path A04;
    public final RectF A05;
    public final RectF A06;

    public C67893Hg() {
        this.A01 = new Paint(1);
        this.A00 = new Matrix();
        this.A05 = new RectF();
        this.A04 = new Path();
        this.A06 = new RectF();
        Path path = new Path();
        C30W[] c30wArr = A07;
        for (C30W c30w : c30wArr) {
            path.addArc(new RectF(c30w.A01, c30w.A05, c30w.A02, c30w.A00), c30w.A03, c30w.A04);
        }
        this.A03 = path;
        Path path2 = new Path();
        for (C30W c30w2 : c30wArr) {
            path2.addOval(new RectF(c30w2.A01, c30w2.A05, c30w2.A02, c30w2.A00), Path.Direction.CW);
        }
        path2.addRect(120.0f, 80.0f, 580.0f, 430.0f, Path.Direction.CW);
        this.A02 = path2;
        this.A03.setFillType(Path.FillType.WINDING);
        this.A03.computeBounds(this.A05, true);
        super.A00 = 120.0f;
    }

    public C67893Hg(JSONObject jSONObject) {
        this();
        super.A0B(jSONObject);
    }

    @Override // X.C2HG
    public float A00() {
        return (super.A00() * 5.0f) / 3.0f;
    }

    @Override // X.C2HG
    public void A0F(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        RectF rectF2 = this.A05;
        if (f5 / f6 < rectF2.width() / rectF2.height()) {
            f6 = (rectF2.height() * f5) / rectF2.width();
        } else {
            f5 = (rectF2.width() * f6) / rectF2.height();
        }
        float f7 = (f + f3) / 2.0f;
        float f8 = (f2 + f4) / 2.0f;
        float f9 = f5 / 2.0f;
        float f10 = f6 / 2.0f;
        super.A0F(rectF, f7 - f9, f8 - f10, f7 + f9, f8 + f10);
    }

    public final void A0H(Canvas canvas, float f, float f2) {
        RectF rectF = super.A03;
        float width = rectF.width() / this.A05.width();
        float f3 = 60.0f * width * f2;
        float f4 = width * 30.0f * f2;
        float cos = (((float) ((Math.cos(Math.toRadians(super.A00)) * rectF.width()) / 2.0d)) * f) + rectF.centerX();
        float sin = (f * ((float) ((Math.sin(Math.toRadians(super.A00)) * rectF.height()) / 2.0d))) + rectF.centerY();
        RectF rectF2 = this.A06;
        rectF2.set(cos - f3, sin - f4, cos + f3, sin + f4);
        canvas.drawOval(rectF2, this.A01);
        canvas.drawOval(rectF2, super.A02);
    }
}
