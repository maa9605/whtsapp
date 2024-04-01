package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0KJ  reason: invalid class name */
/* loaded from: classes.dex */
public class C0KJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3O3
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0KJ(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0KJ[i];
        }
    };
    public final C77543iN A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0KJ(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readInt() == 1;
        this.A00 = (C77543iN) parcel.readParcelable(C77543iN.class.getClassLoader());
    }

    public C0KJ(String str, String str2, boolean z, C77543iN c77543iN) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = c77543iN;
    }

    public static C0KJ A00(C02590Ca c02590Ca) {
        C77543iN c77543iN;
        try {
            String A0G = c02590Ca.A0G("step_up_id");
            String A0G2 = c02590Ca.A0G("service");
            boolean z = c02590Ca.A05("sticky_service_hub_cta", 1) == 1;
            C02590Ca A0E = c02590Ca.A0E("step_up_challenge");
            String A0G3 = A0E.A0G("challenge_id");
            C02590Ca A0B = A0E.A0B();
            if (A0B.A00.equals("webview")) {
                try {
                    c77543iN = new C77543iN(A0G3, A0B.A05("auth_required", 1) == 1);
                } catch (C0L4 e) {
                    Log.e("PAY: Can't build WebViewChallenge ", e);
                }
                return new C0KJ(A0G2, A0G, z, c77543iN);
            }
            c77543iN = null;
            return new C0KJ(A0G2, A0G, z, c77543iN);
        } catch (C0L4 e2) {
            Log.e("PAY: PaymentStepUpInfo/fromProtocolTreeNode ", e2);
            return null;
        }
    }

    public static C0KJ A01(String str) {
        C77543iN c77543iN;
        if (!AnonymousClass024.A0j(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("service");
                String string2 = jSONObject.getString("step_up_id");
                boolean optBoolean = jSONObject.optBoolean("sticky_service_hub_cta", true);
                JSONObject jSONObject2 = jSONObject.getJSONObject("step_up_challenge");
                try {
                } catch (JSONException e) {
                    Log.e("PAY: PaymentStepUpChallenge fromJsonObject threw exception ", e);
                }
                if (jSONObject2.getString("type").equals("WEBVIEW")) {
                    try {
                        c77543iN = new C77543iN(jSONObject2.getString("challenge_id"), jSONObject2.getBoolean("auth_required"));
                    } catch (JSONException e2) {
                        Log.e("PAY: WebViewChallenge fromJsonObject threw exception ", e2);
                    }
                    return new C0KJ(string, string2, optBoolean, c77543iN);
                }
                c77543iN = null;
                return new C0KJ(string, string2, optBoolean, c77543iN);
            } catch (JSONException e3) {
                Log.e("PAY: PaymentStepUpInfo fromJsonString threw exception ", e3);
            }
        }
        return null;
    }

    public JSONObject A02() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("service", this.A01);
            jSONObject.put("step_up_id", this.A02);
            jSONObject.put("sticky_service_hub_cta", this.A03);
            C77543iN c77543iN = this.A00;
            if (c77543iN.A00.equals("WEBVIEW")) {
                if (c77543iN != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("challenge_id", c77543iN.A01);
                        jSONObject2.put("type", "WEBVIEW");
                        jSONObject2.put("auth_required", c77543iN.A02);
                    } catch (JSONException e) {
                        Log.e("PAY: WebViewChallenge toJson threw exception ", e);
                    }
                    jSONObject.put("step_up_challenge", jSONObject2);
                    return jSONObject;
                }
                throw null;
            }
        } catch (JSONException e2) {
            Log.e("PAY: PaymentStepUpInfo toJson threw exception ", e2);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A00, 0);
    }
}
