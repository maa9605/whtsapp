package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.06r */
/* loaded from: classes.dex */
public class C014006r implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.06s
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C014006r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C014006r[i];
        }
    };
    public final BigDecimal A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C014006r(Parcel parcel) {
        this.A00 = (BigDecimal) parcel.readSerializable();
    }

    public C014006r(BigDecimal bigDecimal, int i) {
        C000700j.A07(bigDecimal.compareTo(BigDecimal.ZERO) >= 0);
        this.A00 = bigDecimal.setScale(i, 6);
    }

    public static C014006r A00(String str, int i) {
        try {
            return new C014006r(new BigDecimal(str), i);
        } catch (NumberFormatException e) {
            Log.i("Pay: PaymentTransactionInfo.MethodInfo createFromParcel threw: ", e);
            return null;
        }
    }

    public JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("amount", toString());
            return jSONObject;
        } catch (JSONException e) {
            Log.e("PAY: BasePaymentCurrency toJsonObject threw: ", e);
            return jSONObject;
        }
    }

    public boolean A02() {
        BigDecimal bigDecimal = this.A00;
        return bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C014006r.class == obj.getClass()) {
            BigDecimal bigDecimal = this.A00;
            BigDecimal bigDecimal2 = ((C014006r) obj).A00;
            if (bigDecimal == null) {
                if (bigDecimal2 != null) {
                    return false;
                }
            } else if (bigDecimal.compareTo(bigDecimal2) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.A00;
        return 31 + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        return this.A00.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
    }
}
