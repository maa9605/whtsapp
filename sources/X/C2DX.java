package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2DX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2DX {
    public int A00;

    public C2DX(int i) {
        this.A00 = i;
    }

    public JSONObject A00() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("attempts", this.A00);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
