package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Qo */
/* loaded from: classes2.dex */
public abstract class C2Qo {
    public C3C5 A00;
    public boolean A01;
    public final C0E7 A02;
    public final AnonymousClass012 A03;
    public final C002301c A04;
    public final C2Qq A05;
    public final C50202Qp A06;
    public final C50212Qr A07;
    public final AnonymousClass011 A08;
    public final InterfaceC42341va A09;
    public final InterfaceC002901k A0A;

    public C2Qo(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C002301c c002301c, InterfaceC42341va interfaceC42341va, C0E7 c0e7, C50202Qp c50202Qp, C2Qq c2Qq, C50212Qr c50212Qr) {
        this.A03 = anonymousClass012;
        this.A0A = interfaceC002901k;
        this.A08 = anonymousClass011;
        this.A04 = c002301c;
        this.A09 = interfaceC42341va;
        this.A02 = c0e7;
        this.A06 = c50202Qp;
        this.A05 = c2Qq;
        this.A07 = c50212Qr;
    }

    public C61482wE A00() {
        String string = this.A06.A00.A00.getString("emoji_dictionary_info", null);
        if (string == null) {
            return new C61482wE();
        }
        try {
            C61482wE c61482wE = new C61482wE();
            JSONObject jSONObject = new JSONObject(string);
            c61482wE.A04 = jSONObject.optString("request_etag", null);
            c61482wE.A00 = jSONObject.optLong("cache_fetch_time", 0L);
            c61482wE.A03 = jSONObject.optString("language", null);
            c61482wE.A01 = jSONObject.optLong("last_fetch_attempt_time", 0L);
            c61482wE.A05 = jSONObject.optString("language_attempted_to_fetch", null);
            return c61482wE;
        } catch (JSONException unused) {
            return new C61482wE();
        }
    }

    public boolean A01(C61482wE c61482wE) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_etag", c61482wE.A04);
            jSONObject.put("language", c61482wE.A03);
            jSONObject.put("cache_fetch_time", c61482wE.A00);
            jSONObject.put("last_fetch_attempt_time", c61482wE.A01);
            jSONObject.put("language_attempted_to_fetch", c61482wE.A05);
            this.A06.A00.A0D().putString("emoji_dictionary_info", jSONObject.toString()).apply();
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
