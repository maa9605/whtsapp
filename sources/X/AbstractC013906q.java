package X;

import android.os.Parcel;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.06q  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC013906q implements InterfaceC013706o {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public AbstractC013906q(int i, Parcel parcel) {
        this.A00 = i;
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
    }

    public AbstractC013906q(String str, String str2, int i, int i2, int i3) {
        C000700j.A08(true, "BasePaymentCurrency offset should be >= 1");
        C000700j.A08(true, "BasePaymentCurrency display exponent should be >= 0");
        this.A04 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A02 = i2;
        this.A03 = 0;
        this.A01 = i3;
    }

    public AbstractC013906q(JSONObject jSONObject) {
        this.A04 = jSONObject.optString("code");
        this.A05 = jSONObject.optString("symbol");
        this.A00 = jSONObject.optInt("currencyType");
        this.A02 = jSONObject.optInt("offset");
        this.A03 = jSONObject.optInt("weight");
        this.A01 = jSONObject.optInt("displayExponent");
    }

    @Override // X.InterfaceC013706o
    public /* synthetic */ String A81(C002301c c002301c, C014006r c014006r) {
        return A82(c002301c, c014006r, 0);
    }

    @Override // X.InterfaceC013706o
    public /* synthetic */ String A83(C002301c c002301c, BigDecimal bigDecimal) {
        return A84(c002301c, bigDecimal, 0);
    }

    @Override // X.InterfaceC013706o
    public String A9K() {
        return this.A04;
    }

    @Override // X.InterfaceC013706o
    public String A9O() {
        return this.A05;
    }

    @Override // X.InterfaceC013706o
    public String A9P(C002301c c002301c) {
        return this.A05;
    }

    @Override // X.InterfaceC013706o
    public int A9Q() {
        return this.A00;
    }

    @Override // X.InterfaceC013706o
    public int A9i() {
        return this.A01;
    }

    @Override // X.InterfaceC013706o
    public JSONObject AVY() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.A04);
            jSONObject.put("symbol", this.A05);
            jSONObject.put("offset", this.A02);
            jSONObject.put("displayExponent", this.A01);
            jSONObject.put("weight", this.A03);
            jSONObject.put("currencyType", this.A00);
            return jSONObject;
        } catch (JSONException e) {
            Log.e("PAY: BasePaymentCurrency toJsonObject threw: ", e);
            return jSONObject;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC013906q) {
            AbstractC013906q abstractC013906q = (AbstractC013906q) obj;
            return this.A04.equals(abstractC013906q.A04) && this.A05.equals(abstractC013906q.A05) && this.A00 == abstractC013906q.A00 && this.A02 == abstractC013906q.A02 && this.A01 == abstractC013906q.A01 && this.A03 == abstractC013906q.A03;
        }
        return false;
    }

    public int hashCode() {
        return (this.A05.hashCode() * 31) + (this.A04.hashCode() * 31) + this.A00 + this.A02 + this.A01 + this.A03;
    }

    @Override // X.InterfaceC013706o, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
    }
}
