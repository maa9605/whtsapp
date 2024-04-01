package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.499  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass499 {
    public static volatile AnonymousClass499 A02;
    public final C0EU A00;
    public final C014406v A01 = C014406v.A00("PaymentPinSharedPrefs", "infra", "COMMON");

    public AnonymousClass499(C0EU c0eu) {
        this.A00 = c0eu;
    }

    public static AnonymousClass499 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass499.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass499(C0EU.A00());
                }
            }
        }
        return A02;
    }

    public synchronized long A01() {
        long j;
        JSONObject optJSONObject;
        j = 0;
        try {
            String A06 = this.A00.A06();
            if (!TextUtils.isEmpty(A06) && (optJSONObject = new JSONObject(A06).optJSONObject("pin")) != null) {
                j = optJSONObject.optLong("pin_next_retry_ts");
            }
        } catch (JSONException e) {
            C014406v c014406v = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("getNextRetryTs threw: ");
            sb.append(e);
            c014406v.A04(sb.toString());
        }
        return j;
    }

    public synchronized void A02() {
        try {
            C0EU c0eu = this.A00;
            String A06 = c0eu.A06();
            JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
            JSONObject optJSONObject = jSONObject.optJSONObject("pin");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", "1");
            optJSONObject.put("pinSet", true);
            jSONObject.put("pin", optJSONObject);
            c0eu.A0H(jSONObject.toString());
        } catch (JSONException e) {
            C014406v c014406v = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("setPinSet threw: ");
            sb.append(e);
            c014406v.A04(sb.toString());
        }
    }

    public synchronized void A03(long j) {
        try {
            C0EU c0eu = this.A00;
            String A06 = c0eu.A06();
            JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
            JSONObject optJSONObject = jSONObject.optJSONObject("pin");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", "1");
            optJSONObject.put("pin_next_retry_ts", j);
            jSONObject.put("pin", optJSONObject);
            c0eu.A0H(jSONObject.toString());
        } catch (JSONException e) {
            C014406v c014406v = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("setPinSet threw: ");
            sb.append(e);
            c014406v.A04(sb.toString());
        }
    }

    public synchronized boolean A04() {
        boolean z;
        JSONObject optJSONObject;
        z = false;
        try {
            String A06 = this.A00.A06();
            if (!TextUtils.isEmpty(A06) && (optJSONObject = new JSONObject(A06).optJSONObject("pin")) != null) {
                z = optJSONObject.optBoolean("pinSet");
            }
        } catch (JSONException e) {
            C014406v c014406v = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("isPinSet threw: ");
            sb.append(e);
            c014406v.A04(sb.toString());
        }
        return z;
    }
}
