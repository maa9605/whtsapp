package X;

import android.os.Build;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1PX  reason: invalid class name */
/* loaded from: classes.dex */
public class C1PX {
    public final int A01;
    public final String A04;
    public final int A00 = 210915004;
    public final String A03 = "2.21.9.15";
    public final String A02 = "Whatsapp";
    public final String A05 = "Main Process";
    public final String A06 = "1";

    public C1PX(int i, String str) {
        this.A01 = i;
        this.A04 = str;
    }

    public String A00() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_version_code", this.A00);
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("memclass", this.A01);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("android_version", Build.VERSION.RELEASE);
            jSONObject.put("app_version_name", this.A03);
            jSONObject.put("app", this.A02);
            jSONObject.put("process_name", this.A05);
            jSONObject.put("uid", this.A06);
            jSONObject.putOpt("dump_cause", this.A04);
            jSONObject.put("platform_abi", AnonymousClass024.A0A());
            return jSONObject.toString();
        } catch (JSONException e) {
            return String.format(Locale.US, "{ 'error' : '%s' }", e.getMessage());
        }
    }
}
