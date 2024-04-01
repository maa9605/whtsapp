package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1LQ  reason: invalid class name */
/* loaded from: classes.dex */
public class C1LQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public C1LQ(String str, String str2, int i, int i2, int i3, int i4) {
        this.A05 = str;
        this.A01 = i;
        this.A03 = i3;
        this.A04 = str2;
        this.A00 = i2;
        this.A02 = i4;
    }

    public static C1LQ A00(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C1LQ(jSONObject.optString("media_codec_encoder", null), jSONObject.optString("media_codec_decoder", null), jSONObject.optInt("color_format_encoder", -1), jSONObject.optInt("color_format_decoder", -1), jSONObject.optInt("forced_frame_conv_id_encoder", -1), jSONObject.optInt("forced_frame_conv_id_decoder", -1));
        } catch (JSONException unused) {
            return null;
        }
    }
}
