package X;

import android.os.Parcel;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2u9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60232u9 {
    public long A00;
    public final Map A01;

    public C60232u9() {
        this.A00 = 0L;
        this.A01 = new HashMap();
    }

    public C60232u9(Parcel parcel) {
        this.A00 = parcel.readLong();
        HashMap hashMap = new HashMap();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
        this.A01 = hashMap;
    }

    public static String A00(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "upi";
                }
                throw new AssertionError(C000200d.A0D("PAY: ConsumerStatusData/getPaymentServiceEnumName/invalid service enum: ", i));
            }
            return "novi";
        }
        return "fbpay";
    }

    public JSONObject A01() {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.A01.entrySet()) {
            hashMap.put(A00(((Number) entry.getKey()).intValue()), entry.getValue());
            try {
                jSONObject.putOpt(A00(((Number) entry.getKey()).intValue()), entry.getValue());
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("PAY: ConsumerStatusData/getDataHashesDbString/exception: ");
                sb.append(e);
                Log.e(sb.toString());
            }
        }
        return new JSONObject(hashMap);
    }

    public void A02(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                int i = 1;
                if (next != null) {
                    int hashCode = next.hashCode();
                    if (hashCode != 116014) {
                        if (hashCode != 3387444) {
                            if (hashCode == 97229420 && next.equals("fbpay")) {
                                this.A01.put(Integer.valueOf(i), jSONObject.optString(next));
                            }
                        } else if (next.equals("novi")) {
                            i = 2;
                            this.A01.put(Integer.valueOf(i), jSONObject.optString(next));
                        }
                    } else if (next.equals("upi")) {
                        i = 3;
                        this.A01.put(Integer.valueOf(i), jSONObject.optString(next));
                    }
                }
            }
        }
    }
}
