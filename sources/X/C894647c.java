package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.47c */
/* loaded from: classes3.dex */
public class C894647c {
    public long A00;
    public C466327p A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C894647c(C02590Ca c02590Ca) {
        String str;
        C466327p c466327p;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C02590Ca A0D = c02590Ca.A0D("amount");
        if (A0D == null) {
            C04P A0A = c02590Ca.A0A("amount");
            if (A0A != null && (str7 = A0A.A03) != null) {
                this.A08 = str7;
            }
        } else {
            C02590Ca A0D2 = A0D.A0D("money");
            if (A0D2 != null) {
                try {
                    C04P A0A2 = A0D2.A0A("currency");
                    if (A0A2 != null) {
                        str = A0A2.A03;
                    } else {
                        str = null;
                    }
                    InterfaceC013706o A01 = C013606n.A01(str);
                    long A06 = A0D2.A06("value");
                    int A04 = A0D2.A04("offset");
                    if (A04 <= 0) {
                        c466327p = new C466327p(A06, 1, A01);
                    } else {
                        c466327p = new C466327p(A06, A04, A01);
                    }
                    this.A01 = c466327p;
                    this.A08 = c466327p.A02.toString();
                } catch (Exception unused) {
                    Log.e("PAY: IndiaUpiMandateMetadata - and error occured while parsing the money node");
                }
            }
        }
        C04P A0A3 = c02590Ca.A0A("amount-rule");
        String str8 = A0A3 != null ? A0A3.A03 : null;
        if (!TextUtils.isEmpty(str8)) {
            this.A04 = str8;
        }
        C04P A0A4 = c02590Ca.A0A("is-revocable");
        if (A0A4 != null && (str6 = A0A4.A03) != null) {
            this.A03 = str6;
        }
        C04P A0A5 = c02590Ca.A0A("end-ts");
        if (A0A5 != null && (str5 = A0A5.A03) != null) {
            this.A00 = AnonymousClass024.A03(str5, 0L) * 1000;
        }
        C04P A0A6 = c02590Ca.A0A("seq-no");
        if (A0A6 != null && (str4 = A0A6.A03) != null) {
            this.A09 = str4;
        }
        C04P A0A7 = c02590Ca.A0A("error-code");
        if (A0A7 != null && (str3 = A0A7.A03) != null) {
            this.A02 = str3;
        }
        C04P A0A8 = c02590Ca.A0A("mandate-update-info");
        if (A0A8 != null && (str2 = A0A8.A03) != null) {
            this.A06 = str2;
        }
        C04P A0A9 = c02590Ca.A0A("status");
        this.A07 = (A0A9 == null || (r0 = A0A9.A03) == null) ? "INIT" : "INIT";
        C04P A0A10 = c02590Ca.A0A("action");
        this.A05 = (A0A10 == null || (r0 = A0A10.A03) == null) ? "UNKNOWN" : "UNKNOWN";
    }

    public C894647c(String str) {
        C466327p c466327p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.A08 = jSONObject.optString("pendingAmount", this.A08);
            if (jSONObject.optJSONObject("pendingMoney") != null) {
                InterfaceC013706o interfaceC013706o = null;
                long j = 0;
                JSONObject optJSONObject = jSONObject.optJSONObject("pendingMoney");
                if (optJSONObject != null) {
                    j = optJSONObject.optLong("value", -1L);
                    int optInt = optJSONObject.optInt("offset", -1);
                    interfaceC013706o = C013606n.A02(optJSONObject.optJSONObject("currency"), optJSONObject.optInt("currencyType", -1));
                    if (optInt > 0) {
                        c466327p = new C466327p(j, optInt, interfaceC013706o);
                        this.A01 = c466327p;
                    }
                }
                c466327p = new C466327p(j, 1, interfaceC013706o);
                this.A01 = c466327p;
            }
            this.A03 = jSONObject.optString("isRevocable", this.A03);
            this.A00 = jSONObject.optLong("mandateEndTs", this.A00);
            this.A04 = jSONObject.optString("mandateAmountRule", this.A04);
            this.A09 = jSONObject.optString("seqNum", this.A09);
            this.A02 = jSONObject.optString("errorCode", this.A02);
            this.A07 = jSONObject.optString("mandateUpdateStatus", this.A07);
            this.A05 = jSONObject.optString("mandateUpdateAction", this.A05);
            this.A06 = jSONObject.optString("mandateUpdateInfo", this.A06);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata threw: ", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0038 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A00() {
        /*
            r5 = this;
            java.lang.String r4 = r5.A05
            int r1 = r4.hashCode()
            r0 = 433141802(0x19d1382a, float:2.1632778E-23)
            r3 = 0
            r2 = 1
            if (r1 == r0) goto L25
            r0 = 1924835592(0x72baa908, float:7.3943754E30)
            if (r1 != r0) goto L39
            java.lang.String r0 = "ACCEPT"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L39
            java.lang.String r1 = r5.A07
            java.lang.String r0 = "PENDING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L38
            return r2
        L25:
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L39
            java.lang.String r1 = r5.A07
            java.lang.String r0 = "INIT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L38
            return r2
        L38:
            return r3
        L39:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C894647c.A00():boolean");
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[ pendingAmount: ");
        A0P.append(C40841sx.A0O(this.A08));
        A0P.append(" errorCode: ");
        A0P.append(this.A02);
        A0P.append(" mandateAmountRule: ");
        A0P.append(C40841sx.A0O(this.A04));
        A0P.append(" isRevocable: ");
        A0P.append(C40841sx.A0O(this.A03));
        A0P.append(" seqNum: ");
        A0P.append(C40841sx.A0O(this.A09));
        A0P.append(" mandateUpdateInfo: ");
        A0P.append(this.A06);
        A0P.append(" mandateUpdateAction: ");
        A0P.append(this.A05);
        A0P.append(" mandateUpdateStatus: ");
        return C000200d.A0L(A0P, this.A07, "]");
    }
}
