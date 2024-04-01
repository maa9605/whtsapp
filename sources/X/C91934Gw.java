package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Gw */
/* loaded from: classes3.dex */
public class C91934Gw extends C0K8 {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.48s
        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C91934Gw[0];
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            C91934Gw c91934Gw = new C91934Gw();
            c91934Gw.A0K(parcel);
            c91934Gw.A03 = parcel.readString();
            c91934Gw.A02 = parcel.readString();
            c91934Gw.A01 = parcel.readString();
            return c91934Gw;
        }
    };
    public long A00;
    public String A01;
    public String A02;
    public String A03;

    @Override // X.C0K9
    public String A01() {
        return null;
    }

    @Override // X.C0K9
    public void A03(C013606n c013606n, int i, C02590Ca c02590Ca) {
    }

    @Override // X.C0K8
    public int A05() {
        return 0;
    }

    @Override // X.C0K8
    public int A06() {
        return 0;
    }

    @Override // X.C0K8
    public long A08() {
        return 0L;
    }

    @Override // X.C0K8
    public String A09() {
        return null;
    }

    @Override // X.C0K8
    public String A0A() {
        return null;
    }

    @Override // X.C0K8
    public String A0B() {
        return null;
    }

    @Override // X.C0K8
    public String A0D() {
        return null;
    }

    @Override // X.C0K8
    public void A0F(int i) {
    }

    @Override // X.C0K8
    public void A0G(int i) {
    }

    @Override // X.C0K8
    public void A0H(int i) {
    }

    @Override // X.C0K8
    public void A0J(long j) {
    }

    @Override // X.C0K8
    public void A0M(String str) {
    }

    @Override // X.C0K8
    public void A0N(String str) {
    }

    @Override // X.C0K8
    public void A0O(String str) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.C0K9
    public void A02(int i, List list) {
        if (!TextUtils.isEmpty(this.A03)) {
            list.add(new C04P("nonce", this.A03, null, (byte) 0));
        }
        if (TextUtils.isEmpty(this.A02)) {
            return;
        }
        list.add(new C04P("device-id", this.A02, null, (byte) 0));
    }

    @Override // X.C0K8, X.C0K9
    public void A04(String str) {
        try {
            super.A04(str);
            JSONObject jSONObject = new JSONObject(str);
            this.A00 = jSONObject.optLong("expiryTs", this.A00);
            this.A03 = jSONObject.optString("nonce", this.A03);
            this.A02 = jSONObject.optString("deviceId", this.A02);
            this.A01 = jSONObject.optString("amount", this.A01);
        } catch (JSONException e) {
            Log.w("PAY: BrazilTransactionCountryData fromDBString threw: ", e);
        }
    }

    @Override // X.C0K8
    public long A07() {
        return this.A00;
    }

    @Override // X.C0K8
    public String A0C() {
        try {
            JSONObject A0E = A0E();
            long j = this.A00;
            if (j > 0) {
                A0E.put("expiryTs", j);
            }
            String str = this.A03;
            if (str != null) {
                A0E.put("nonce", str);
            }
            String str2 = this.A01;
            if (str2 != null) {
                A0E.put("amount", str2);
            }
            String str3 = this.A02;
            if (str3 != null) {
                A0E.put("deviceId", str3);
            }
            return A0E.toString();
        } catch (JSONException e) {
            Log.w("PAY: BrazilTransactionCountryData toDBString threw: ", e);
            return null;
        }
    }

    @Override // X.C0K8
    public void A0I(long j) {
        this.A00 = j;
    }

    @Override // X.C0K8
    public void A0L(C0K8 c0k8) {
        super.A0L(c0k8);
        C91934Gw c91934Gw = (C91934Gw) c0k8;
        long j = c91934Gw.A00;
        if (j > 0) {
            this.A00 = j;
        }
        String str = c91934Gw.A03;
        if (str != null) {
            this.A03 = str;
        }
        String str2 = c91934Gw.A02;
        if (str2 != null) {
            this.A02 = str2;
        }
        String str3 = c91934Gw.A01;
        if (str3 != null) {
            this.A01 = str3;
        }
    }

    @Override // X.C0K8, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(super.A01 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(super.A00, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
