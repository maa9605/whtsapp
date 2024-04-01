package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3GL  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3GL implements InterfaceC05060Nd {
    public C48162Eb A00;
    public final C04000Ia A01;
    public final C0HW A02;
    public final C63252zU A03;
    public final String A04;

    @Override // X.InterfaceC05060Nd
    public void AJD(long j) {
    }

    public C3GL(C0HW c0hw, C04000Ia c04000Ia, String str, C63252zU c63252zU) {
        this.A02 = c0hw;
        this.A01 = c04000Ia;
        this.A04 = str;
        this.A03 = c63252zU;
    }

    @Override // X.InterfaceC05060Nd
    public void AJz(Map map, String str) {
        C000200d.A13("httpresumecheck/error = ", str);
    }

    @Override // X.InterfaceC05060Nd
    public void AO0(Map map, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("resume")) {
                if ("complete".equals(jSONObject.optString("resume"))) {
                    this.A00.A06 = jSONObject.optString("url");
                    this.A00.A04 = jSONObject.optString("direct_path");
                    this.A00.A03 = C0Qt.COMPLETE;
                    return;
                }
                this.A00.A02 = jSONObject.optInt("resume");
                this.A00.A03 = C0Qt.RESUME;
            }
        } catch (JSONException e) {
            Log.w("mediaupload/MMS upload resume form post failed to parse JSON response; ", e);
            this.A00.A03 = C0Qt.FAILURE;
        }
    }
}
