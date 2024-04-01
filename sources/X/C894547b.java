package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.47b  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C894547b {
    public long A00;
    public long A01;
    public C466327p A02;
    public C894647c A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;

    public C894547b(C02590Ca c02590Ca) {
        String str;
        String str2;
        String str3;
        C466327p c466327p;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        this.A0A = true;
        C04P A0A = c02590Ca.A0A("mandate-no");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.A08 = str;
        }
        C04P A0A2 = c02590Ca.A0A("amount-rule");
        if (A0A2 != null) {
            str2 = A0A2.A03;
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.A05 = str2;
        }
        C04P A0A3 = c02590Ca.A0A("is-revocable");
        if (A0A3 != null) {
            String str9 = A0A3.A03;
            if (str9 != null) {
                this.A0B = AnonymousClass024.A01(str9, 0) == 1;
            }
        }
        C04P A0A4 = c02590Ca.A0A("start-ts");
        if (A0A4 != null) {
            str3 = A0A4.A03;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            this.A01 = AnonymousClass024.A03(str3, 0L) * 1000;
        }
        C04P A0A5 = c02590Ca.A0A("end-ts");
        if (A0A5 != null && (str8 = A0A5.A03) != null) {
            this.A00 = AnonymousClass024.A03(str8, 0L) * 1000;
        }
        C04P A0A6 = c02590Ca.A0A("error-code");
        if (A0A6 != null && (str7 = A0A6.A03) != null) {
            this.A06 = str7;
        }
        C02590Ca A0D = c02590Ca.A0D("original-amount");
        if (A0D == null) {
            C04P A0A7 = c02590Ca.A0A("original-amount");
            if (A0A7 != null && (str6 = A0A7.A03) != null) {
                this.A09 = str6;
            }
        } else {
            C02590Ca A0D2 = A0D.A0D("money");
            if (A0D2 != null) {
                try {
                    C04P A0A8 = A0D2.A0A("currency");
                    InterfaceC013706o A01 = C013606n.A01(A0A8 != null ? A0A8.A03 : null);
                    long A06 = A0D2.A06("value");
                    int A04 = A0D2.A04("offset");
                    if (A04 <= 0) {
                        c466327p = new C466327p(A06, 1, A01);
                    } else {
                        c466327p = new C466327p(A06, A04, A01);
                    }
                    this.A02 = c466327p;
                    this.A09 = c466327p.A02.A00.toString();
                } catch (Exception unused) {
                    Log.e("PAY: IndiaUpiMandateMetadata - and error occured while parsing the money node");
                }
            }
        }
        C04P A0A9 = c02590Ca.A0A("mandate-info");
        if (A0A9 != null && (str5 = A0A9.A03) != null) {
            this.A07 = str5;
        }
        C04P A0A10 = c02590Ca.A0A("frequency-rule");
        if (A0A10 != null && (str4 = A0A10.A03) != null) {
            if (str4.hashCode() == -602281453 && str4.equals("ONETIME")) {
                this.A04 = "ONETIME";
            } else {
                this.A04 = "UNKNOWN";
            }
        }
        C02590Ca A0D3 = c02590Ca.A0D("mandate-update");
        if (A0D3 != null) {
            this.A03 = new C894647c(A0D3);
        }
    }

    public C894547b(String str) {
        InterfaceC013706o A02;
        C466327p c466327p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.A0A = jSONObject.optBoolean("isMandate", false);
            this.A0B = jSONObject.optBoolean("isRevocable", false);
            this.A01 = jSONObject.optLong("mandateStartTs", this.A01);
            this.A00 = jSONObject.optLong("mandateEndTs", this.A00);
            this.A05 = jSONObject.optString("mandateAmountRule", this.A05);
            this.A09 = jSONObject.optString("originalAmount", this.A09);
            if (jSONObject.has("originalMoney")) {
                long j = 0;
                JSONObject optJSONObject = jSONObject.optJSONObject("originalMoney");
                if (optJSONObject == null) {
                    A02 = null;
                } else {
                    j = optJSONObject.optLong("value", -1L);
                    int optInt = optJSONObject.optInt("offset", -1);
                    A02 = C013606n.A02(optJSONObject.optJSONObject("currency"), optJSONObject.optInt("currencyType", -1));
                    if (optInt > 0) {
                        c466327p = new C466327p(j, optInt, A02);
                        this.A02 = c466327p;
                    }
                }
                c466327p = new C466327p(j, 1, A02);
                this.A02 = c466327p;
            }
            this.A08 = jSONObject.optString("mandateNo", this.A08);
            this.A06 = jSONObject.optString("mandateErrorCode", this.A06);
            this.A07 = jSONObject.optString("mandateInfo", this.A07);
            this.A04 = jSONObject.optString("frequencyRule", this.A04);
            if (jSONObject.has("pendingMandateUpdate")) {
                this.A03 = new C894647c(jSONObject.optString("pendingMandateUpdate", null));
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata threw: ", e);
        }
    }

    public String A00() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isMandate", this.A0A);
            jSONObject.put("isRevocable", this.A0B);
            long j = this.A01;
            if (j > 0) {
                jSONObject.put("mandateStartTs", j);
            }
            long j2 = this.A00;
            if (j2 > 0) {
                jSONObject.put("mandateEndTs", j2);
            }
            String str2 = this.A05;
            if (str2 != null) {
                jSONObject.put("mandateAmountRule", str2);
            }
            String str3 = this.A08;
            if (str3 != null) {
                jSONObject.put("mandateNo", str3);
            }
            String str4 = this.A06;
            if (str4 != null) {
                jSONObject.put("mandateErrorCode", str4);
            }
            String str5 = this.A09;
            if (str5 != null) {
                jSONObject.put("originalAmount", str5);
            }
            C466327p c466327p = this.A02;
            if (c466327p != null) {
                jSONObject.put("originalMoney", c466327p.A03());
            }
            C894647c c894647c = this.A03;
            if (c894647c != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    String str6 = c894647c.A08;
                    if (str6 != null) {
                        jSONObject2.put("pendingAmount", str6);
                    }
                    C466327p c466327p2 = c894647c.A01;
                    if (c466327p2 != null) {
                        jSONObject2.put("pendingMoney", c466327p2.A03());
                    }
                    String str7 = c894647c.A03;
                    if (str7 != null) {
                        jSONObject2.put("isRevocable", str7);
                    }
                    long j3 = c894647c.A00;
                    if (j3 > 0) {
                        jSONObject2.put("mandateEndTs", j3);
                    }
                    String str8 = c894647c.A04;
                    if (str8 != null) {
                        jSONObject2.put("mandateAmountRule", str8);
                    }
                    String str9 = c894647c.A09;
                    if (str9 != null) {
                        jSONObject2.put("seqNum", str9);
                    }
                    String str10 = c894647c.A02;
                    if (str10 != null) {
                        jSONObject2.put("errorCode", str10);
                    }
                    String str11 = c894647c.A07;
                    if (str11 != null) {
                        jSONObject2.put("mandateUpdateStatus", str11);
                    }
                    String str12 = c894647c.A05;
                    if (str12 != null) {
                        jSONObject2.put("mandateUpdateAction", str12);
                    }
                    String str13 = c894647c.A06;
                    if (str13 != null) {
                        jSONObject2.put("mandateUpdateInfo", str13);
                    }
                    str = jSONObject2.toString();
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata toJsonString threw: ", e);
                    str = null;
                }
                jSONObject.put("pendingMandateUpdate", str);
            }
            String str14 = this.A07;
            if (str14 != null) {
                jSONObject.put("mandateInfo", str14);
            }
            String str15 = this.A04;
            if (str15 != null) {
                jSONObject.put("frequencyRule", str15);
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e2);
            return null;
        }
    }

    public String toString() {
        C894647c c894647c = this.A03;
        String obj = c894647c == null ? "null" : c894647c.toString();
        StringBuilder A0P = C000200d.A0P("[ mandateNo: ");
        A0P.append(C40841sx.A0O(this.A08));
        A0P.append(" mandateErrorCode: ");
        A0P.append(this.A06);
        A0P.append(" mandateAmountRule: ");
        A0P.append(C40841sx.A0O(this.A05));
        A0P.append(" isMandate : ");
        A0P.append(this.A0A);
        A0P.append(" isRevocable: ");
        A0P.append(this.A0B);
        A0P.append(" mandateStartTs: ");
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        A0P.append(C40841sx.A0O(sb.toString()));
        A0P.append(" mandateEndTs: ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.A00);
        sb2.append("");
        A0P.append(C40841sx.A0O(sb2.toString()));
        A0P.append(" mandateInfo: ");
        A0P.append(C40841sx.A0O(this.A07));
        A0P.append(" frequencyRule: ");
        A0P.append(C40841sx.A0O(this.A04));
        A0P.append(" pendingMandateUpdate: {");
        A0P.append(obj);
        A0P.append("} ]");
        return A0P.toString();
    }
}
