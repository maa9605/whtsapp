package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Ha  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C67833Ha extends C2HG {
    public int A00;
    public Bitmap A01;
    public PointF A02;
    public C636030d A03;
    public boolean A04;
    public final float A05;

    public C67833Ha(float f) {
        this.A00 = 1;
        this.A04 = false;
        super.A02.setStyle(Paint.Style.STROKE);
        this.A05 = f;
    }

    public C67833Ha(JSONObject jSONObject, float f) {
        this.A00 = 1;
        this.A04 = false;
        Paint paint = super.A02;
        paint.setStyle(Paint.Style.STROKE);
        this.A05 = f;
        super.A0B(jSONObject);
        this.A04 = true;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("points");
            JSONArray jSONArray2 = jSONObject.getJSONArray("times");
            float f2 = jSONObject.getInt("width") / 100.0f;
            if (jSONArray != null && jSONArray2 != null && f2 > 0.0f) {
                Bitmap bitmap = this.A01;
                PointF pointF = this.A02;
                int i = this.A00;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                float f3 = jSONObject.getInt("width") / 100.0f;
                JSONArray jSONArray3 = jSONObject.getJSONArray("points");
                for (int i2 = 0; i2 < jSONArray3.length(); i2 += 2) {
                    arrayList.add(new PointF(jSONArray3.getInt(i2) / 100.0f, jSONArray3.getInt(i2 + 1) / 100.0f));
                }
                JSONArray jSONArray4 = jSONObject.getJSONArray("times");
                for (int i3 = 0; i3 < jSONArray4.length(); i3++) {
                    arrayList2.add(Long.valueOf(jSONArray4.getLong(i3)));
                }
                C636030d c636030d = new C636030d((PointF) arrayList.get(0), ((Number) arrayList2.get(0)).longValue(), bitmap, pointF, i, paint, f3, f);
                for (int i4 = 1; i4 < arrayList.size(); i4++) {
                    c636030d.A03((PointF) arrayList.get(i4), ((Number) arrayList2.get(i4)).longValue());
                }
                int size = arrayList.size() - 1;
                c636030d.A02((PointF) arrayList.get(size), ((Number) arrayList2.get(size)).longValue());
                this.A03 = c636030d;
                return;
            }
        } catch (JSONException unused) {
        }
        throw new IllegalArgumentException("Json is not valid for PenBrushModel");
    }

    @Override // X.C2HG
    public void A0G(JSONObject jSONObject) {
        super.A0G(jSONObject);
        C636030d c636030d = this.A03;
        if (c636030d != null) {
            JSONArray jSONArray = new JSONArray();
            for (PointF pointF : c636030d.A0B) {
                jSONArray.put((int) (pointF.x * 100.0f));
                jSONArray.put((int) (pointF.y * 100.0f));
            }
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj : c636030d.A0C) {
                jSONArray2.put(obj);
            }
            jSONObject.put("points", jSONArray);
            jSONObject.put("times", jSONArray2);
            jSONObject.put("width", (int) (c636030d.A05 * 100.0f));
            return;
        }
        throw null;
    }
}
