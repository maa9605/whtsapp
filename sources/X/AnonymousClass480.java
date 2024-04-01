package X;

import android.content.Context;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.480  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass480 {
    public String A00;
    public final Context A01;
    public final C018508q A02;
    public final C0E7 A03;
    public final C28S A04;
    public final C463026g A05;
    public final C899048w A06;
    public final C49682Lx A07;

    public AnonymousClass480(Context context, C018508q c018508q, C49682Lx c49682Lx, C0E7 c0e7, C463026g c463026g, C28S c28s, C899048w c899048w, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11 = str3;
        this.A01 = context;
        this.A02 = c018508q;
        this.A07 = c49682Lx;
        this.A03 = c0e7;
        this.A05 = c463026g;
        this.A04 = c28s;
        this.A06 = c899048w;
        if (str11.length() == 12) {
            StringBuilder sb = new StringBuilder();
            sb.append(str11.substring(0, 4));
            sb.append("9");
            sb.append(str11.substring(4));
            str11 = sb.toString();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fullName", str);
            jSONObject.put("personalID", str2);
            jSONObject.put("phone", str11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("address", str4);
            jSONObject2.put("addressNumber", str5 != null ? str5 : "");
            jSONObject2.put("extraLine", str6 != null ? str6 : "");
            jSONObject2.put("neighborhood", str7 != null ? str7 : "");
            jSONObject2.put("city", str8);
            jSONObject2.put("state", str9);
            jSONObject2.put("addressCode", str10);
            jSONObject2.put("country", "BR");
            jSONObject.put("address", jSONObject2);
            this.A00 = jSONObject.toString();
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder("PAY: BrazilSendKYCAction Exception: ");
            sb2.append(e);
            Log.e(sb2.toString());
        }
    }

    public final void A00(C77343i3 c77343i3, C48M c48m) {
        C48N c48n = new C48N(this.A01, this.A02, this.A07, this.A03, this.A05, this.A04, this.A06);
        try {
            byte[] A7c = c77343i3.A7c(this.A00.getBytes("UTF-8"), C02A.A0C(16));
            C014406v c014406v = c48n.A06;
            StringBuilder sb = new StringBuilder();
            sb.append("sendKyc Text Blob : ");
            sb.append(Base64.encodeToString(A7c, 2));
            c014406v.A07(null, sb.toString(), null);
            C02590Ca[] c02590CaArr = {new C02590Ca("text", new C04P[]{new C04P("key-type", c77343i3.A03, null, (byte) 0)}, null, A7c)};
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C04P("action", "send-kyc-data", null, (byte) 0));
            String str = c77343i3.A05;
            arrayList.add(new C04P("provider", str, null, (byte) 0));
            arrayList.add(new C04P("key-version", c77343i3.A04, null, (byte) 0));
            arrayList.add(new C04P("device-id", c48n.A07.A02(), null, (byte) 0));
            c48n.A04.A0F("set", new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), c02590CaArr, null), new C91844Gn(c48n, c48n.A00, c48n.A01, c48n.A02, c48n.A03, "send-kyc-data", c48m, str), 0L);
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }
}
