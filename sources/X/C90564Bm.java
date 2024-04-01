package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Bm */
/* loaded from: classes3.dex */
public class C90564Bm implements InterfaceC03660Go {
    public static volatile C90564Bm A03;
    public final AnonymousClass012 A00;
    public final C0GZ A01;
    public final C0EU A02;

    public C90564Bm(AnonymousClass012 anonymousClass012, C0EU c0eu, C0GZ c0gz) {
        this.A00 = anonymousClass012;
        this.A02 = c0eu;
        this.A01 = c0gz;
    }

    public static C90564Bm A00() {
        if (A03 == null) {
            synchronized (C90564Bm.class) {
                if (A03 == null) {
                    A03 = new C90564Bm(AnonymousClass012.A00(), C0EU.A00(), C0GZ.A00());
                }
            }
        }
        return A03;
    }

    public static final JSONObject A01(String str, JSONObject jSONObject, String str2) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str2);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                jSONObject.put(str2, optJSONObject);
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
            if (optJSONObject2 == null) {
                JSONObject jSONObject2 = new JSONObject();
                optJSONObject.put(str, jSONObject2);
                return jSONObject2;
            }
            return optJSONObject2;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("PAY: IndiaUpiPaymentSharedPrefs getOrInsertFieldByPsP for field: ");
            sb.append(str2);
            sb.append(" threw: ");
            Log.w(sb.toString(), e);
            return null;
        }
    }

    public String A02() {
        try {
            String A06 = this.A02.A06();
            if (!TextUtils.isEmpty(A06)) {
                return new JSONObject(A06).optString("sequenceNumberPrefix", "ICIWC");
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getPaymentSequenceNumberPrefix threw: ", e);
        }
        return "ICIWC";
    }

    public String A03() {
        try {
            String A06 = this.A02.A06();
            if (!TextUtils.isEmpty(A06)) {
                return new JSONObject(A06).optString("psp", null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getPsp threw: ", e);
        }
        return null;
    }

    public synchronized String A04() {
        String[] A0M;
        A0M = A0M("device_binding_sim_iccid");
        if (A0M[0] == null) {
            A0M = A0M("device_binding_sim_id");
        }
        return A0M[0];
    }

    public synchronized String A05() {
        String str;
        str = null;
        try {
            String A06 = this.A02.A06();
            if (!TextUtils.isEmpty(A06)) {
                str = new JSONObject(A06).optString("vpa", null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readAccountHandle threw: ", e);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.lang.String A06() {
        /*
            r10 = this;
            monitor-enter(r10)
            r6 = 0
            X.0EU r0 = r10.A02     // Catch: org.json.JSONException -> L3c java.lang.Throwable -> L49
            java.lang.String r1 = r0.A06()     // Catch: org.json.JSONException -> L3c java.lang.Throwable -> L49
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L3c java.lang.Throwable -> L49
            if (r0 != 0) goto L47
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3c java.lang.Throwable -> L49
            r3.<init>(r1)     // Catch: org.json.JSONException -> L3c java.lang.Throwable -> L49
            java.lang.String r0 = "listKeys"
            java.lang.String r9 = r3.optString(r0, r6)     // Catch: org.json.JSONException -> L3c java.lang.Throwable -> L49
            java.lang.String r2 = "listKeysTs"
            r0 = 0
            long r7 = r3.optLong(r2, r0)     // Catch: org.json.JSONException -> L3c java.lang.Throwable -> L49
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: org.json.JSONException -> L3c java.lang.Throwable -> L49
            r0 = 1
            long r4 = r2.toMillis(r0)     // Catch: org.json.JSONException -> L3c java.lang.Throwable -> L49
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: org.json.JSONException -> L3c java.lang.Throwable -> L49
            if (r0 != 0) goto L43
            X.012 r0 = r10.A00     // Catch: org.json.JSONException -> L3c java.lang.Throwable -> L49
            long r2 = r0.A05()     // Catch: org.json.JSONException -> L3c java.lang.Throwable -> L49
            long r2 = r2 - r7
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L44
            goto L43
        L3c:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readListKeys threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L49
            goto L47
        L43:
            r0 = 0
        L44:
            if (r0 == 0) goto L47
            r6 = r9
        L47:
            monitor-exit(r10)
            return r6
        L49:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90564Bm.A06():java.lang.String");
    }

    public synchronized String A07() {
        try {
            String A06 = this.A02.A06();
            if (!TextUtils.isEmpty(A06)) {
                return new JSONObject(A06).optString("smsVerifDataGateway", null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readSmsGateway threw: ", e);
        }
        return null;
    }

    public synchronized String A08() {
        try {
            String A06 = this.A02.A06();
            if (!TextUtils.isEmpty(A06)) {
                return new JSONObject(A06).optString("smsVerifDataGen", null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readSmsVerificationDataGenerated threw: ", e);
        }
        return null;
    }

    public synchronized String A09() {
        String str;
        str = null;
        try {
            String A06 = this.A02.A06();
            if (!TextUtils.isEmpty(A06)) {
                str = new JSONObject(A06).optString("vpaId", null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readVpaId threw: ", e);
        }
        return str;
    }

    public synchronized String A0A(String str) {
        String str2;
        String str3;
        String A06;
        str2 = null;
        if (str != null) {
            try {
                A06 = this.A02.A06();
            } catch (JSONException e) {
                e = e;
                str3 = null;
            }
            if (!TextUtils.isEmpty(A06)) {
                JSONObject jSONObject = new JSONObject(A06);
                JSONObject optJSONObject = jSONObject.optJSONObject("smsVerifDataSentToPsp");
                JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
                str3 = optJSONObject2 != null ? optJSONObject2.optString("smsVerifData", null) : null;
                try {
                    if (TextUtils.isEmpty(str3)) {
                        str2 = jSONObject.optString("smsVerifData", null);
                    }
                } catch (JSONException e2) {
                    e = e2;
                    Log.w("PAY: IndiaUpiPaymentSharedPrefs readSmsVerificationDataSent threw: ", e);
                    str2 = str3;
                    return str2;
                }
                str2 = str3;
            }
        } else {
            throw null;
        }
        return str2;
    }

    public synchronized void A0B() {
        try {
            C0EU c0eu = this.A02;
            String A06 = c0eu.A06();
            JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
            jSONObject.remove("listKeys");
            jSONObject.remove("listKeysTs");
            c0eu.A0H(jSONObject.toString());
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
    }

    public synchronized void A0C() {
        try {
            C0EU c0eu = this.A02;
            String A06 = c0eu.A06();
            JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
            jSONObject.remove("token");
            jSONObject.remove("tokenTs");
            jSONObject.remove("listKeys");
            jSONObject.remove("listKeysTs");
            c0eu.A0H(jSONObject.toString());
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
    }

    public synchronized void A0D(String str) {
        try {
            C0EU c0eu = this.A02;
            String A06 = c0eu.A06();
            if (!TextUtils.isEmpty(A06)) {
                JSONObject jSONObject = new JSONObject(A06);
                if (TextUtils.isEmpty(str)) {
                    jSONObject.remove("smsVerifDataSentToPsp");
                    jSONObject.remove("devBindingByPsp");
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("smsVerifDataSentToPsp");
                    if (optJSONObject != null) {
                        optJSONObject.remove(str);
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("devBindingByPsp");
                    if (optJSONObject2 != null) {
                        optJSONObject2.remove(str);
                    }
                }
                jSONObject.remove("psp");
                jSONObject.remove("sequenceNumberPrefix");
                jSONObject.remove("skipDevBinding");
                jSONObject.remove("smsVerifData");
                jSONObject.remove("smsVerifDataGateway");
                jSONObject.remove("devBinding");
                jSONObject.remove("smsVerifDataGen");
                jSONObject.remove("device_binding_sim_iccid");
                jSONObject.remove("device_binding_sim_id");
                c0eu.A0H(jSONObject.toString());
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteDeviceBinding threw: ", e);
        }
    }

    public synchronized void A0E(String str) {
        try {
            C0EU c0eu = this.A02;
            String A06 = c0eu.A06();
            long A05 = this.A00.A05();
            JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
            jSONObject.put("v", "2");
            jSONObject.put("listKeys", str);
            jSONObject.put("listKeysTs", A05);
            c0eu.A0H(jSONObject.toString());
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: IndiaUpiPaymentSharedPrefs storeListKeys at timestamp: ");
            sb.append(A05);
            Log.i(sb.toString());
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeListKeys threw: ", e);
        }
    }

    public synchronized void A0F(String str, String str2) {
        try {
            C0EU c0eu = this.A02;
            String A06 = c0eu.A06();
            JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
            A0I(jSONObject, str, str2);
            c0eu.A0H(jSONObject.toString());
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeVpaHandle threw: ", e);
        }
    }

    public synchronized void A0G(String str, String str2, String str3) {
        try {
            C0EU c0eu = this.A02;
            String A06 = c0eu.A06();
            JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
            A0H(jSONObject, str, str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("device_binding_sim_id", str3);
            }
            c0eu.A0H(jSONObject.toString());
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeDeviceBinding threw: ", e);
        }
    }

    public final synchronized void A0H(JSONObject jSONObject, String str, String str2) {
        jSONObject.put("v", "2");
        jSONObject.put("psp", str);
        jSONObject.put("sequenceNumberPrefix", str2);
        JSONObject A01 = A01(str, jSONObject, "devBindingByPsp");
        if (A01 != null) {
            A01.put("devBinding", true);
        }
    }

    public final synchronized void A0I(JSONObject jSONObject, String str, String str2) {
        jSONObject.put("v", "2");
        jSONObject.put("vpa", str);
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("vpaId", str2);
        }
        jSONObject.put("vpaTs", this.A00.A05());
    }

    public final synchronized boolean A0J(String str) {
        boolean z;
        boolean z2;
        String A06;
        JSONObject optJSONObject;
        z = false;
        try {
            A06 = this.A02.A06();
        } catch (JSONException e) {
            e = e;
            z2 = false;
        }
        if (!TextUtils.isEmpty(A06)) {
            JSONObject jSONObject = new JSONObject(A06);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("devBindingByPsp");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(str)) == null) {
                z2 = false;
            } else {
                z2 = optJSONObject.optBoolean("devBinding", false);
                if (!z2) {
                }
                z = z2;
            }
            try {
                z = jSONObject.optBoolean("devBinding", false);
            } catch (JSONException e2) {
                e = e2;
                Log.w("PAY: IndiaUpiPaymentSharedPrefs readDeviceBinding threw: ", e);
                z = z2;
                return z;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0039, code lost:
        if ((r10.A00.A05() - r8) >= r4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized byte[] A0K() {
        /*
            r10 = this;
            monitor-enter(r10)
            r6 = 0
            X.0EU r0 = r10.A02     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            java.lang.String r1 = r0.A06()     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            if (r0 != 0) goto L4a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            r3.<init>(r1)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            java.lang.String r0 = "token"
            java.lang.String r7 = r3.optString(r0, r6)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            java.lang.String r2 = "tokenTs"
            r0 = 0
            long r8 = r3.optLong(r2, r0)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            r0 = 20
            long r4 = r2.toMillis(r0)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            if (r0 != 0) goto L3b
            X.012 r0 = r10.A00     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            long r2 = r0.A05()     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            long r2 = r2 - r8
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L3c
        L3b:
            r0 = 0
        L3c:
            if (r0 == 0) goto L4a
            r0 = 0
            byte[] r6 = android.util.Base64.decode(r7, r0)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4c
            goto L4a
        L44:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readToken threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r10)
            return r6
        L4c:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90564Bm.A0K():byte[]");
    }

    public synchronized String[] A0L() {
        return A0M("signedQrCode", "signedQrCodeTs");
    }

    public final String[] A0M(String... strArr) {
        try {
            String A06 = this.A02.A06();
            if (!TextUtils.isEmpty(A06)) {
                JSONObject jSONObject = new JSONObject(A06);
                int length = strArr.length;
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr2[i] = jSONObject.optString(strArr[i], null);
                }
                return strArr2;
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readFromPaymentInfo for keys threw: ", e);
        }
        return new String[strArr.length];
    }

    @Override // X.InterfaceC03660Go
    public void A74() {
        try {
            C0EU c0eu = this.A02;
            String A06 = c0eu.A06();
            JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
            jSONObject.remove("token");
            jSONObject.remove("tokenTs");
            jSONObject.remove("vpa");
            jSONObject.remove("vpaId");
            jSONObject.remove("vpaTs");
            jSONObject.remove("listKeys");
            jSONObject.remove("listKeysTs");
            jSONObject.remove("skipDevBinding");
            jSONObject.remove("devBindingByPsp");
            jSONObject.remove("psp");
            jSONObject.remove("sequenceNumberPrefix");
            jSONObject.remove("devBinding");
            jSONObject.remove("signedQrCode");
            jSONObject.remove("signedQrCodeTs");
            c0eu.A0H(jSONObject.toString());
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
    }

    @Override // X.InterfaceC03660Go
    public boolean AUM(C0K8 c0k8) {
        return !this.A01.A09() && TextUtils.isEmpty(A05());
    }

    public String toString() {
        try {
            String A06 = this.A02.A06();
            JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
            jSONObject.put("listKeys", !TextUtils.isEmpty(jSONObject.optString("listKeys")) ? "[keys exist]" : "[no keys]");
            String optString = jSONObject.optString("vpa");
            if (!TextUtils.isEmpty(optString)) {
                jSONObject.put("vpa", C40841sx.A0Q(optString));
            }
            String optString2 = jSONObject.optString("smsVerifDataGateway");
            if (!TextUtils.isEmpty(optString2)) {
                jSONObject.put("smsVerifDataGateway", optString2);
            }
            String optString3 = jSONObject.optString("smsVerifDataGen");
            if (!TextUtils.isEmpty(optString3)) {
                jSONObject.put("smsVerifDataGen", C40841sx.A0O(optString3));
            }
            String optString4 = jSONObject.optString("smsVerifData");
            if (!TextUtils.isEmpty(optString3)) {
                jSONObject.put("smsVerifData", C40841sx.A0O(optString4));
            }
            String optString5 = jSONObject.optString("token");
            if (!TextUtils.isEmpty(optString5)) {
                jSONObject.put("token", C40841sx.A0O(optString5));
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("smsVerifDataSentToPsp");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(keys.next());
                    if (optJSONObject2 != null) {
                        String optString6 = optJSONObject2.optString("smsVerifData");
                        if (!TextUtils.isEmpty(optString6)) {
                            optJSONObject2.put("smsVerifData", C40841sx.A0O(optString6));
                        }
                    }
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs toString threw: ", e);
            return "";
        }
    }
}
