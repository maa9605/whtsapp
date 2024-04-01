package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.02r */
/* loaded from: classes.dex */
public class C006002r extends C006102s {
    public static volatile C006002r A01;
    public final C000500h A00;

    public C006002r(C000500h c000500h) {
        this.A00 = c000500h;
        String string = c000500h.A00.getString("wam_client_errors", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.A0I = A03(jSONObject, 2);
                this.A0J = A03(jSONObject, 3);
                super.A00 = A02(jSONObject, 1);
                this.A0G = A02(jSONObject, 4);
                this.A0H = A02(jSONObject, 5);
                this.A0F = A02(jSONObject, 6);
                this.A0D = A02(jSONObject, 7);
                this.A04 = A02(jSONObject, 8);
                this.A09 = A02(jSONObject, 9);
                this.A0A = A02(jSONObject, 10);
                this.A07 = A02(jSONObject, 11);
                this.A0E = A02(jSONObject, 12);
                this.A0B = A02(jSONObject, 13);
                this.A08 = A02(jSONObject, 14);
                this.A03 = A02(jSONObject, 15);
                this.A02 = A02(jSONObject, 16);
                this.A05 = A02(jSONObject, 17);
                this.A01 = A02(jSONObject, 18);
                this.A06 = A02(jSONObject, 19);
                this.A0C = A02(jSONObject, 20);
                this.A0M = A03(jSONObject, 22);
                this.A0N = A03(jSONObject, 23);
                this.A0K = A03(jSONObject, 24);
                this.A0L = A03(jSONObject, 25);
            } catch (JSONException e) {
                Log.e(e);
            }
        }
    }

    public static Boolean A02(JSONObject jSONObject, int i) {
        String valueOf = String.valueOf(i);
        if (jSONObject.has(valueOf)) {
            try {
                return Boolean.valueOf(jSONObject.getBoolean(valueOf));
            } catch (JSONException e) {
                Log.e(e);
                return null;
            }
        }
        return null;
    }

    public static Long A03(JSONObject jSONObject, int i) {
        String valueOf = String.valueOf(i);
        if (jSONObject.has(valueOf)) {
            try {
                return Long.valueOf(jSONObject.getLong(valueOf));
            } catch (JSONException e) {
                Log.e(e);
                return null;
            }
        }
        return null;
    }

    public static void A04(JSONObject jSONObject, int i, Boolean bool) {
        if (bool != null) {
            try {
                jSONObject.put(String.valueOf(i), bool.booleanValue());
            } catch (JSONException e) {
                Log.e(e);
            }
        }
    }

    public static void A05(JSONObject jSONObject, int i, Long l) {
        if (l != null) {
            try {
                jSONObject.put(String.valueOf(i), l.longValue());
            } catch (JSONException e) {
                Log.e(e);
            }
        }
    }

    public void A06() {
        String str;
        if (!A00()) {
            JSONObject jSONObject = new JSONObject();
            A05(jSONObject, 2, this.A0I);
            A05(jSONObject, 3, this.A0J);
            A04(jSONObject, 1, super.A00);
            A04(jSONObject, 4, this.A0G);
            A04(jSONObject, 5, this.A0H);
            A04(jSONObject, 6, this.A0F);
            A04(jSONObject, 7, this.A0D);
            A04(jSONObject, 8, this.A04);
            A04(jSONObject, 9, this.A09);
            A04(jSONObject, 10, this.A0A);
            A04(jSONObject, 11, this.A07);
            A04(jSONObject, 12, this.A0E);
            A04(jSONObject, 13, this.A0B);
            A04(jSONObject, 14, this.A08);
            A04(jSONObject, 15, this.A03);
            A04(jSONObject, 16, this.A02);
            A04(jSONObject, 17, this.A05);
            A04(jSONObject, 18, this.A01);
            A04(jSONObject, 19, this.A06);
            A04(jSONObject, 20, this.A0C);
            A05(jSONObject, 22, this.A0M);
            A05(jSONObject, 23, this.A0N);
            A05(jSONObject, 24, this.A0K);
            A05(jSONObject, 25, this.A0L);
            str = jSONObject.toString();
        } else {
            str = null;
        }
        C000200d.A0i(this.A00, "wam_client_errors", str);
    }
}
