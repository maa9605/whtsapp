package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0N5  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0N5 extends C0N0 {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public byte[] A09;

    @Override // X.C0N0
    public String A07() {
        return this.A02;
    }

    public String A0A() {
        return this.A01;
    }

    public String A0B() {
        return this.A05;
    }

    public JSONObject A0C() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.A01;
            if (str != null) {
                jSONObject.put("bankImageURL", str);
            }
            String str2 = this.A02;
            if (str2 != null) {
                jSONObject.put("bankPhoneNumber", str2);
                return jSONObject;
            }
        } catch (JSONException e) {
            Log.w("PAY: PaymentMethodBankAccountCountryData toJSONObject threw: ", e);
        }
        return jSONObject;
    }
}
