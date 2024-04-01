package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.json.JSONObject;

/* renamed from: X.3Hc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C67853Hc extends C2HG {
    public final Matrix A00;
    public final Paint A01;
    public final Path A02;
    public final Path A03;

    public C67853Hc() {
        this.A02 = new Path();
        this.A01 = new Paint(1);
        this.A00 = new Matrix();
        this.A03 = new Path();
        double radians = Math.toRadians(35.0d);
        float cos = (float) (Math.cos(radians) * 1000.0d);
        float sin = (float) (Math.sin(radians) * 1000.0d);
        double radians2 = Math.toRadians(55.0d);
        float cos2 = (float) (Math.cos(radians2) * 1000.0d);
        float sin2 = (float) (Math.sin(radians2) * 1000.0d);
        this.A02.addArc(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), 55.0f, 340.0f);
        this.A02.moveTo(cos, sin);
        this.A02.lineTo(1200.0f, 1200.0f);
        this.A02.lineTo(cos2, sin2);
    }

    public C67853Hc(JSONObject jSONObject) {
        this();
        super.A0B(jSONObject);
    }

    @Override // X.C2HG
    public float A00() {
        return (super.A00() * 3.0f) / 2.0f;
    }

    @Override // X.C2HG
    public void A0F(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = (f2 + f4) / 2.0f;
        float f6 = (((f3 - f) * 2.0f) / 3.0f) / 2.0f;
        super.A0F(rectF, f, f5 - f6, f3, f5 + f6);
    }
}
