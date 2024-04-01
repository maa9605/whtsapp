package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.06p */
/* loaded from: classes.dex */
public class C013806p extends AbstractC013906q {
    public static InterfaceC013706o A04;
    public static InterfaceC013706o A05;
    public static InterfaceC013706o A06;
    public static final BigDecimal A07 = new BigDecimal(1);
    public static final Parcelable.Creator CREATOR;
    public C014006r A00;
    public final C014006r A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        A06 = new C013806p("XXX", -1, "XXX", "#", "#", 10, 1, bigDecimal, bigDecimal);
        BigDecimal valueOf = BigDecimal.valueOf(5000L);
        BigDecimal bigDecimal2 = A07;
        A05 = new C013806p("INR", 0, "₹", "R", "r", 100, 2, valueOf, bigDecimal2);
        A04 = new C013806p("BRL", 0, "R$", "B", "b", 100, 2, BigDecimal.valueOf(1000L), bigDecimal2);
        CREATOR = new Parcelable.Creator() { // from class: X.06t
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C013806p(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C013806p[i];
            }
        };
    }

    public C013806p(Parcel parcel) {
        super(0, parcel);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = (C014006r) parcel.readParcelable(C014006r.class.getClassLoader());
        this.A01 = (C014006r) parcel.readParcelable(C014006r.class.getClassLoader());
    }

    public C013806p(String str, int i, String str2, String str3, String str4, int i2, int i3, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        super(str, str2, i, i2, i3);
        int log10 = (int) Math.log10(i2);
        this.A00 = new C014006r(bigDecimal, log10);
        this.A01 = new C014006r(bigDecimal2, log10);
        this.A02 = str3;
        this.A03 = str4;
    }

    public C013806p(JSONObject jSONObject) {
        super(jSONObject);
        this.A02 = jSONObject.optString("currencyIconText");
        this.A03 = jSONObject.optString("requestCurrencyIconText");
        JSONObject optJSONObject = jSONObject.optJSONObject("maxValue");
        int i = super.A01;
        this.A00 = C014006r.A00(optJSONObject.optString("amount", ""), i);
        this.A01 = C014006r.A00(jSONObject.optJSONObject("minValue").optString("amount", ""), i);
    }

    @Override // X.InterfaceC013706o
    public String A7z(C002301c c002301c, C014006r c014006r) {
        String str = this.A04;
        BigDecimal bigDecimal = c014006r.A00;
        return C002701i.A0k(c002301c, str, bigDecimal, bigDecimal.scale(), false);
    }

    @Override // X.InterfaceC013706o
    public String A80(C002301c c002301c, BigDecimal bigDecimal) {
        return C002701i.A0m(c002301c, this.A04, bigDecimal, false);
    }

    @Override // X.InterfaceC013706o
    public String A82(C002301c c002301c, C014006r c014006r, int i) {
        if (i == 1) {
            String str = this.A04;
            String str2 = this.A05;
            BigDecimal bigDecimal = c014006r.A00;
            return C002701i.A0j(c002301c, str, str2, bigDecimal, bigDecimal.scale(), true);
        } else if (i == 2) {
            String str3 = this.A04;
            String str4 = this.A05;
            BigDecimal bigDecimal2 = c014006r.A00;
            return C002701i.A0j(c002301c, str3, str4, bigDecimal2, bigDecimal2.scale(), false);
        } else {
            String str5 = this.A04;
            BigDecimal bigDecimal3 = c014006r.A00;
            return C002701i.A0k(c002301c, str5, bigDecimal3, bigDecimal3.scale(), true);
        }
    }

    @Override // X.InterfaceC013706o
    public String A84(C002301c c002301c, BigDecimal bigDecimal, int i) {
        if (i == 1) {
            String str = this.A04;
            String str2 = this.A05;
            C09R A0P = C002701i.A0P(str);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            return C000200d.A0M(sb, A0P.A03(c002301c, bigDecimal, false), " ", str);
        } else if (i == 2) {
            String str3 = this.A04;
            C09R A0P2 = C002701i.A0P(str3);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            return C000200d.A0M(sb2, A0P2.A03(c002301c, bigDecimal, false), " ", str3);
        } else {
            return C002701i.A0m(c002301c, this.A04, bigDecimal, true);
        }
    }

    @Override // X.InterfaceC013706o
    public BigDecimal A87(C002301c c002301c, String str) {
        return C002701i.A10(c002301c, this.A04, str);
    }

    @Override // X.InterfaceC013706o
    public CharSequence A9L(Context context) {
        return A9M(context, 0);
    }

    @Override // X.InterfaceC013706o
    public CharSequence A9M(Context context, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i == 1 ? this.A03 : this.A02);
        Typeface A0B = C002701i.A0B(context);
        if (A0B != null) {
            spannableStringBuilder.setSpan(new C27841Oz(A0B), 0, this.A02.length(), 0);
        }
        return spannableStringBuilder;
    }

    @Override // X.AbstractC013906q, X.InterfaceC013706o
    public String A9P(C002301c c002301c) {
        return C002701i.A0P(this.A04).A02(c002301c);
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
    public int ADP(C002301c c002301c) {
        return C002701i.A04(c002301c, this.A04);
    }

    @Override // X.InterfaceC013706o
    public void ATK(C014006r c014006r) {
        this.A00 = c014006r;
    }

    @Override // X.AbstractC013906q, X.InterfaceC013706o
    public JSONObject AVY() {
        JSONObject AVY = super.AVY();
        try {
            AVY.put("currencyIconText", this.A02);
            AVY.put("requestCurrencyIconText", this.A03);
            AVY.put("maxValue", this.A00.A01());
            AVY.put("minValue", this.A01.A01());
            return AVY;
        } catch (JSONException e) {
            Log.e("PAY: PaymentCurrency toJsonObject threw: ", e);
            return AVY;
        }
    }

    @Override // X.AbstractC013906q
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C013806p) {
            C013806p c013806p = (C013806p) obj;
            return super.equals(c013806p) && this.A02.equals(c013806p.A02) && this.A03.equals(c013806p.A03) && this.A01.equals(c013806p.A01) && this.A00.equals(c013806p.A00);
        }
        return false;
    }

    @Override // X.AbstractC013906q
    public int hashCode() {
        int hashCode = (this.A03.hashCode() * 31) + (this.A02.hashCode() * 31) + super.hashCode();
        return (this.A00.hashCode() * 31) + (this.A01.hashCode() * 31) + hashCode;
    }

    @Override // X.AbstractC013906q, X.InterfaceC013706o, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
