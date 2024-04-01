package X;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.47W */
/* loaded from: classes3.dex */
public class C47W {
    public static volatile C47W A02;
    public final C001200o A00;
    public final C002301c A01;

    public C47W(C001200o c001200o, C002301c c002301c) {
        this.A00 = c001200o;
        this.A01 = c002301c;
    }

    public static C47W A00() {
        if (A02 == null) {
            synchronized (C47W.class) {
                if (A02 == null) {
                    A02 = new C47W(C001200o.A01, C002301c.A00());
                }
            }
        }
        return A02;
    }

    public static JSONArray A01(List list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C92214Ia c92214Ia = (C92214Ia) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bank_code", c92214Ia.A02);
                jSONObject.put("bank_name", c92214Ia.A05);
                jSONObject.put("short_name", c92214Ia.A03);
                jSONObject.put("accept_savings", c92214Ia.A04 ? "1" : "0");
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("PAY: BrazilPayBloksActivity payoutBanksToJsonArrayException: ");
            sb.append(e);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    public static boolean A02(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C898048m) it.next()).A0B) {
                return false;
            }
        }
        return true;
    }

    public JSONArray A03(List list) {
        Object obj;
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C898048m c898048m = (C898048m) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("card_verify_identifier", c898048m.A02);
                jSONObject.put("card_verify_type", c898048m.A0A);
                String str = c898048m.A0A;
                if (str != null) {
                    char c = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != -1302107194) {
                        if (hashCode != -119226117) {
                            if (hashCode == 110379 && str.equals("otp")) {
                                c = 0;
                            }
                        } else if (str.equals("app-to-app")) {
                            c = 2;
                        }
                    } else if (str.equals("customer-service")) {
                        c = 1;
                    }
                    String str2 = "";
                    if (c == 0) {
                        C002301c c002301c = this.A01;
                        String str3 = c898048m.A04;
                        char c2 = 65535;
                        switch (str3.hashCode()) {
                            case 82233:
                                if (str3.equals("SMS")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 2467610:
                                if (str3.equals("PUSH")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 66081660:
                                if (str3.equals("EMAIL")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 81425707:
                                if (str3.equals("VACAT")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        String str4 = "";
                        if (c2 == 0) {
                            str4 = c002301c.A06(R.string.brazil_verify_otp_sms_title);
                            str2 = c002301c.A0D(R.string.brazil_verify_otp_sms_description, c898048m.A03);
                        } else if (c2 == 1) {
                            str4 = c002301c.A06(R.string.brazil_verify_otp_email_title);
                            str2 = c002301c.A0D(R.string.brazil_verify_otp_email_description, c898048m.A03);
                        } else if (c2 == 2) {
                            str4 = c002301c.A06(R.string.brazil_verify_otp_sms_title);
                        } else if (c2 == 3) {
                            str4 = c002301c.A06(R.string.brazil_verify_otp_app_notification_title);
                            str2 = c002301c.A06(R.string.brazil_verify_otp_app_notification_description);
                        }
                        C0FK c0fk = new C0FK(str4, str2);
                        str2 = (String) c0fk.A00;
                        obj = c0fk.A01;
                        jSONObject.put("card_verify_otp_type", c898048m.A04);
                        if (!TextUtils.isEmpty(c898048m.A03)) {
                            jSONObject.put("card_verify_otp_receiver_info", c898048m.A03);
                        }
                        jSONObject.put("card_verify_otp_resend_interval_sec", String.valueOf(c898048m.A01));
                        jSONObject.put("otp_length", String.valueOf(c898048m.A00));
                        int i = c898048m.A00;
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < i; i2++) {
                            sb.append("#  ");
                        }
                        jSONObject.put("otp_mask", sb.toString().trim());
                        jSONObject.put("card_verify_method_disabled_state", c898048m.A0B);
                    } else if (c == 1) {
                        C002301c c002301c2 = this.A01;
                        str2 = c002301c2.A06(R.string.brazil_verify_customer_support_title);
                        obj = c002301c2.A0D(R.string.brazil_verify_customer_support_description, C40841sx.A0L(c898048m.A09));
                        jSONObject.put("support_phone_number", c898048m.A09);
                    } else if (c != 2) {
                        obj = "";
                    } else {
                        C0FK A08 = C40841sx.A08(c898048m.A06, c898048m.A07);
                        C002301c c002301c3 = this.A01;
                        str2 = c002301c3.A06(R.string.brazil_verify_app_to_app_title);
                        if (A08 != null) {
                            String str5 = c898048m.A08;
                            Intent intent = new Intent();
                            intent.putExtra("android.intent.extra.TEXT", str5);
                            intent.setPackage((String) A08.A00);
                            intent.setAction((String) A08.A01);
                            if (intent.resolveActivity(this.A00.A00.getPackageManager()) != null) {
                                obj = c898048m.A05;
                                jSONObject.put("app_to_app_request_payload", c898048m.A08);
                                jSONObject.put("app_to_app_partner_app_package", c898048m.A06);
                                jSONObject.put("app_to_app_partner_app_name", c898048m.A05);
                                jSONObject.put("app_to_app_partner_intent_action", c898048m.A07);
                            }
                        }
                        jSONObject.put("card_verify_method_disabled_state", true);
                        obj = c002301c3.A0D(R.string.brazil_verify_app_to_app_not_installed, c898048m.A05);
                        jSONObject.put("app_to_app_request_payload", c898048m.A08);
                        jSONObject.put("app_to_app_partner_app_package", c898048m.A06);
                        jSONObject.put("app_to_app_partner_app_name", c898048m.A05);
                        jSONObject.put("app_to_app_partner_intent_action", c898048m.A07);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("card_verify_method_title", str2);
                        jSONObject.put("card_verify_method_description", obj);
                    }
                    jSONArray.put(jSONObject);
                } else {
                    throw null;
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder("PAY: BrazilPayBloksActivity cardVerifyMethodsToJsonArray: ");
            sb2.append(e);
            Log.e(sb2.toString());
            return null;
        }
    }
}
