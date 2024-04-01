package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.27p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C466327p implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2uE
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C466327p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C466327p[i];
        }
    };
    public final int A00;
    public final InterfaceC013706o A01;
    public final C014006r A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C466327p(long j, int i, InterfaceC013706o interfaceC013706o) {
        C000700j.A09(j >= 0, "value must be a number greater or equal to zero");
        C000700j.A09(true, "offset must be a number greater or equal to zero");
        this.A00 = i;
        this.A01 = interfaceC013706o;
        this.A02 = new C014006r(new BigDecimal(j / i), interfaceC013706o.A9i());
    }

    public C466327p(Parcel parcel) {
        this.A02 = (C014006r) parcel.readParcelable(C014006r.class.getClassLoader());
        this.A00 = parcel.readInt();
        this.A01 = C013606n.A00(parcel);
    }

    public int A00() {
        return this.A00;
    }

    public int A01() {
        return (int) (this.A02.A00.doubleValue() * this.A00);
    }

    public InterfaceC013706o A02() {
        return this.A01;
    }

    public JSONObject A03() {
        JSONObject jSONObject = new JSONObject();
        try {
            double doubleValue = this.A02.A00.doubleValue();
            int i = this.A00;
            jSONObject.put("value", (int) (doubleValue * i));
            jSONObject.put("offset", i);
            InterfaceC013706o interfaceC013706o = this.A01;
            jSONObject.put("currencyType", interfaceC013706o.A9Q());
            jSONObject.put("currency", interfaceC013706o.AVY());
            return jSONObject;
        } catch (JSONException e) {
            Log.w("PAY: PaymentMoney toJson threw: ", e);
            return jSONObject;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C466327p.class != obj.getClass()) {
            return false;
        }
        C466327p c466327p = (C466327p) obj;
        return this.A00 == c466327p.A00 && this.A01.equals(c466327p.A01) && this.A02.equals(c466327p.A02);
    }

    public int hashCode() {
        return this.A01.hashCode() + (this.A02.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("PaymentMoney{amount=");
        A0P.append(this.A02);
        A0P.append(", offset=");
        A0P.append(this.A00);
        A0P.append(", currency=");
        A0P.append(this.A01.A9K());
        A0P.append('}');
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, 1);
        parcel.writeInt(this.A00);
        this.A01.writeToParcel(parcel, i);
    }
}
