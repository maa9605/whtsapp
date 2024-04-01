package X;

import android.graphics.Paint;
import android.graphics.RectF;
import org.json.JSONObject;

/* renamed from: X.3Hb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C67843Hb extends C2HG {
    public C67843Hb() {
        this.A02.setStyle(Paint.Style.STROKE);
    }

    public C67843Hb(JSONObject jSONObject) {
        this.A02.setStyle(Paint.Style.STROKE);
        super.A0B(jSONObject);
    }

    @Override // X.C2HG
    public void A0F(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float min = Math.min(f5, f6);
        RectF rectF2 = this.A03;
        float f7 = (f5 - min) / 2.0f;
        float f8 = (f6 - min) / 2.0f;
        rectF2.set(f + f7, f2 + f8, f3 - f7, f4 - f8);
        rectF2.sort();
    }
}
