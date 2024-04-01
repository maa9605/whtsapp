package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1NK  reason: invalid class name */
/* loaded from: classes.dex */
public class C1NK extends AbstractC013906q {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2u6
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C1NK(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C1NK[i];
        }
    };
    public C014006r A00;
    public final C014006r A01;
    public final String A02;
    public final boolean A03;
    public final String[] A04;

    @Override // X.InterfaceC013706o
    public int ADP(C002301c c002301c) {
        return 2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C1NK(Parcel parcel) {
        super(1, parcel);
        this.A03 = parcel.readInt() == 1;
        this.A02 = parcel.readString();
        String[] strArr = new String[parcel.readInt()];
        parcel.readStringArray(strArr);
        this.A04 = strArr;
        this.A00 = (C014006r) parcel.readParcelable(C014006r.class.getClassLoader());
        this.A01 = (C014006r) parcel.readParcelable(C014006r.class.getClassLoader());
    }

    public C1NK(JSONObject jSONObject) {
        super(jSONObject);
        String[] strArr;
        this.A03 = jSONObject.optBoolean("isStable");
        this.A02 = jSONObject.optString("defaultMatchingFiat");
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("matchingFiats");
            strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                strArr[i] = jSONArray.getString(i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            strArr = new String[0];
        }
        this.A04 = strArr;
        JSONObject optJSONObject = jSONObject.optJSONObject("maxValue");
        int i2 = super.A01;
        this.A00 = C014006r.A00(optJSONObject.optString("amount", ""), i2);
        this.A01 = C014006r.A00(jSONObject.optJSONObject("minValue").optString("amount", ""), i2);
    }

    @Override // X.InterfaceC013706o
    public String A7z(C002301c c002301c, C014006r c014006r) {
        return C002701i.A0l(c002301c, this.A05, c014006r.A00, false);
    }

    @Override // X.InterfaceC013706o
    public String A80(C002301c c002301c, BigDecimal bigDecimal) {
        return C002701i.A0l(c002301c, this.A05, bigDecimal, false);
    }

    @Override // X.InterfaceC013706o
    public String A82(C002301c c002301c, C014006r c014006r, int i) {
        return C002701i.A0l(c002301c, this.A05, c014006r.A00, true);
    }

    @Override // X.InterfaceC013706o
    public String A84(C002301c c002301c, BigDecimal bigDecimal, int i) {
        return C002701i.A0l(c002301c, this.A05, bigDecimal, true);
    }

    @Override // X.InterfaceC013706o
    public BigDecimal A87(C002301c c002301c, String str) {
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(c002301c.A0I());
        try {
            return new BigDecimal(decimalFormat.parse(str.replace(String.valueOf(decimalFormat.getDecimalFormatSymbols().getGroupingSeparator()), "")).toString());
        } catch (ParseException unused) {
            Log.e("PAY: CryptoCurrency/fromString: Currency parse threw: ");
            try {
                return new BigDecimal(str);
            } catch (NumberFormatException unused2) {
                Log.e("PAY: CryptoCurrency/fromString: Backup currency parse threw: ");
                return null;
            }
        }
    }

    @Override // X.InterfaceC013706o
    public CharSequence A9L(Context context) {
        return A9M(context, 0);
    }

    @Override // X.InterfaceC013706o
    public CharSequence A9M(Context context, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
        Typeface A0B = C002701i.A0B(context);
        if (A0B != null) {
            spannableStringBuilder.setSpan(new C27841Oz(A0B), 0, 1, 0);
        }
        return spannableStringBuilder;
    }

    @Override // X.InterfaceC013706o
    public C014006r AB6() {
        return this.A00;
    }

    @Override // X.InterfaceC013706o
    public C014006r ABR() {
        return this.A01;
    }

    @Override // X.InterfaceC013706o
    public void ATK(C014006r c014006r) {
        this.A00 = c014006r;
    }

    @Override // X.AbstractC013906q, X.InterfaceC013706o
    public JSONObject AVY() {
        JSONObject AVY = super.AVY();
        try {
            AVY.put("isStable", this.A03);
            AVY.put("defaultMatchingFiat", this.A02);
            String[] strArr = this.A04;
            AVY.put("matchingFiatsLength", strArr.length);
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            AVY.put("matchingFiats", jSONArray);
            AVY.put("maxValue", this.A00.A01());
            AVY.put("minValue", this.A01.A01());
            return AVY;
        } catch (JSONException e) {
            Log.e("PAY: CryptoCurrency toJsonObject threw: ", e);
            return AVY;
        }
    }

    @Override // X.AbstractC013906q
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1NK) {
            C1NK c1nk = (C1NK) obj;
            return super.equals(c1nk) && this.A03 == c1nk.A03 && this.A01.equals(c1nk.A01) && this.A00.equals(c1nk.A00) && this.A02.equals(c1nk.A02) && Arrays.equals(this.A04, c1nk.A04);
        }
        return false;
    }

    @Override // X.AbstractC013906q
    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.A04) * 31) + (this.A02.hashCode() * 31) + ((!this.A03 ? 1 : 0) * 31) + super.hashCode();
        return (this.A00.hashCode() * 31) + (this.A01.hashCode() * 31) + hashCode;
    }

    @Override // X.AbstractC013906q, X.InterfaceC013706o, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
        String[] strArr = this.A04;
        parcel.writeInt(strArr.length);
        parcel.writeStringArray(strArr);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
