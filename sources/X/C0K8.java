package X;

import android.os.Parcel;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0K8 */
/* loaded from: classes.dex */
public abstract class C0K8 extends C0K9 {
    public C466327p A00;
    public boolean A01;

    public abstract int A05();

    public abstract int A06();

    public abstract long A07();

    public abstract long A08();

    public abstract String A09();

    public abstract String A0A();

    public abstract String A0B();

    public abstract String A0C();

    public abstract String A0D();

    public abstract void A0F(int i);

    public abstract void A0G(int i);

    public abstract void A0H(int i);

    public abstract void A0I(long j);

    public abstract void A0J(long j);

    public abstract void A0M(String str);

    public abstract void A0N(String str);

    public abstract void A0O(String str);

    public boolean A0P(AnonymousClass093 anonymousClass093) {
        return false;
    }

    @Override // X.C0K9
    public void A04(String str) {
        C466327p c466327p;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.A01 = jSONObject.optBoolean("messageDeleted", false);
            JSONObject optJSONObject = jSONObject.optJSONObject("money");
            if (optJSONObject != null) {
                new C466327p(0L, 1, C013806p.A06);
                long optLong = optJSONObject.optLong("value", -1L);
                int optInt = optJSONObject.optInt("offset", -1);
                InterfaceC013706o A02 = C013606n.A02(optJSONObject.optJSONObject("currency"), optJSONObject.optInt("currencyType", -1));
                if (optInt <= 0) {
                    c466327p = new C466327p(optLong, 1, A02);
                } else {
                    c466327p = new C466327p(optLong, optInt, A02);
                }
                this.A00 = c466327p;
            }
        } catch (JSONException e) {
            Log.w("PAY: PaymentTransactionCountryData fromDBString threw: ", e);
        }
    }

    public JSONObject A0E() {
        JSONObject jSONObject = new JSONObject();
        boolean z = this.A01;
        if (z) {
            jSONObject.put("messageDeleted", z);
        }
        C466327p c466327p = this.A00;
        if (c466327p != null) {
            jSONObject.put("money", c466327p.A03());
        }
        return jSONObject;
    }

    public void A0K(Parcel parcel) {
        this.A01 = parcel.readByte() == 1;
        this.A00 = (C466327p) parcel.readParcelable(C466327p.class.getClassLoader());
    }

    public void A0L(C0K8 c0k8) {
        this.A01 = c0k8.A01;
        C466327p c466327p = c0k8.A00;
        if (c466327p != null) {
            this.A00 = c466327p;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A00, 0);
    }
}
