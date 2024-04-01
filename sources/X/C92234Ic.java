package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Ic */
/* loaded from: classes3.dex */
public class C92234Ic extends AbstractC466427q {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.48p
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            C92234Ic c92234Ic = new C92234Ic();
            ((AbstractC466427q) c92234Ic).A00 = parcel.readInt();
            c92234Ic.A06 = parcel.readString();
            c92234Ic.A08 = parcel.readString();
            ((AbstractC466427q) c92234Ic).A02 = parcel.readString();
            c92234Ic.A05 = parcel.readString();
            ((AbstractC466427q) c92234Ic).A03 = parcel.readString();
            ((AbstractC466427q) c92234Ic).A04 = parcel.readString();
            ((AbstractC466427q) c92234Ic).A01 = parcel.readLong();
            c92234Ic.A00 = parcel.readInt();
            c92234Ic.A03 = parcel.readString();
            c92234Ic.A02 = parcel.readString();
            c92234Ic.A04 = parcel.readString();
            return c92234Ic;
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C92234Ic[i];
        }
    };
    public String A02;
    public String A03;
    public String A04;
    public int A01 = 1;
    public int A00 = 0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.C0K9
    public String A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state", super.A00);
            if (!TextUtils.isEmpty(this.A06)) {
                jSONObject.put("merchantId", this.A06);
            }
            if (!TextUtils.isEmpty(this.A08)) {
                jSONObject.put("supportPhoneNumber", this.A08);
            }
            if (!TextUtils.isEmpty(super.A02)) {
                jSONObject.put("businessName", super.A02);
            }
            if (!TextUtils.isEmpty(this.A05)) {
                jSONObject.put("displayState", this.A05);
            }
            try {
                jSONObject.put("p2mReceive", this.A07);
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("PAY: PaymentMethodMerchantCountryData/addCapabilitiesToJson threw: ");
                sb.append(e);
                Log.w(sb.toString());
            }
        } catch (JSONException e2) {
            StringBuilder sb2 = new StringBuilder("PAY: MerchantMethodData toDBJSONObject threw: ");
            sb2.append(e2);
            Log.w(sb2.toString());
        }
        String str = null;
        try {
            jSONObject.put("v", 1);
            if (!TextUtils.isEmpty(this.A02)) {
                jSONObject.put("dashboardUrl", this.A02);
            }
            if (!TextUtils.isEmpty(this.A04)) {
                jSONObject.put("notificationType", this.A04);
            }
            str = jSONObject.toString();
            return str;
        } catch (JSONException e3) {
            StringBuilder sb3 = new StringBuilder("PAY: BrazilMerchantMethodData toDBString threw: ");
            sb3.append(e3);
            Log.w(sb3.toString());
            return str;
        }
    }

    @Override // X.C0K9
    public void A02(int i, List list) {
        throw new UnsupportedOperationException("PAY: BrazilMerchantMethodData toNetwork unsupported");
    }

    @Override // X.C0K9
    public void A03(C013606n c013606n, int i, C02590Ca c02590Ca) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        C04P A0A = c02590Ca.A0A("can-sell");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        boolean equals = "1".equals(str);
        C04P A0A2 = c02590Ca.A0A("can-payout");
        if (A0A2 != null) {
            str2 = A0A2.A03;
        } else {
            str2 = null;
        }
        boolean equals2 = "1".equals(str2);
        C04P A0A3 = c02590Ca.A0A("can-add-payout");
        if (A0A3 != null) {
            str3 = A0A3.A03;
        } else {
            str3 = null;
        }
        super.A00 = (equals ? 1 : 0) + (equals2 ? 2 : 0) + ("1".equals(str3) ? 4 : 0);
        C04P A0A4 = c02590Ca.A0A("display-state");
        if (A0A4 != null) {
            str4 = A0A4.A03;
        } else {
            str4 = null;
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = "VERIFIED";
        }
        this.A05 = str4;
        C04P A0A5 = c02590Ca.A0A("merchant-id");
        if (A0A5 != null) {
            str5 = A0A5.A03;
        } else {
            str5 = null;
        }
        this.A06 = str5;
        C04P A0A6 = c02590Ca.A0A("support-phone-number");
        if (A0A6 != null) {
            str6 = A0A6.A03;
        } else {
            str6 = null;
        }
        this.A08 = str6;
        C04P A0A7 = c02590Ca.A0A("business-name");
        if (A0A7 != null) {
            str7 = A0A7.A03;
        } else {
            str7 = null;
        }
        super.A02 = str7;
        C04P A0A8 = c02590Ca.A0A("country");
        if (A0A8 != null) {
            str8 = A0A8.A03;
        } else {
            str8 = null;
        }
        super.A03 = str8;
        C04P A0A9 = c02590Ca.A0A("credential-id");
        if (A0A9 != null) {
            str9 = A0A9.A03;
        } else {
            str9 = null;
        }
        super.A04 = str9;
        C04P A0A10 = c02590Ca.A0A("created");
        if (A0A10 != null) {
            str10 = A0A10.A03;
        } else {
            str10 = null;
        }
        super.A01 = AnonymousClass024.A03(str10, 0L);
        C04P A0A11 = c02590Ca.A0A("dashboard-url");
        if (A0A11 != null) {
            str11 = A0A11.A03;
        } else {
            str11 = null;
        }
        this.A02 = str11;
        this.A09 = new ArrayList();
        for (C02590Ca c02590Ca2 : c02590Ca.A0H("payout")) {
            C04P A0A12 = c02590Ca2.A0A("type");
            if (A0A12 != null) {
                str12 = A0A12.A03;
            } else {
                str12 = null;
            }
            if ("bank".equals(str12)) {
                C92214Ia c92214Ia = new C92214Ia();
                c92214Ia.A03(c013606n, 0, c02590Ca2);
                C0N2 A05 = c92214Ia.A05();
                if (A05 != null) {
                    A05.A02 = c92214Ia.A00;
                    A05.A09 = super.A04;
                    this.A09.add(A05);
                }
            } else if ("prepaid-card".equals(str12)) {
                C92224Ib c92224Ib = new C92224Ib();
                c92224Ib.A03(c013606n, 0, c02590Ca2);
                ((C0N8) c92224Ib).A00 = 8;
                C0N2 A052 = c92224Ib.A05();
                A052.A02 = c92224Ib.A01;
                A052.A09 = super.A04;
                this.A09.add(A052);
            }
        }
    }

    @Override // X.C0K9
    public void A04(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                super.A00 = jSONObject.optInt("state", 0);
                this.A06 = jSONObject.optString("merchantId", null);
                this.A08 = jSONObject.optString("supportPhoneNumber", null);
                super.A02 = jSONObject.optString("businessName", null);
                String optString = jSONObject.optString("displayState", null);
                if (TextUtils.isEmpty(optString)) {
                    optString = "VERIFIED";
                }
                this.A05 = optString;
                this.A07 = jSONObject.optString("p2mReceive", "WAIT_ACTIVE");
                super.A00 = jSONObject.optInt("state", 0);
                this.A06 = jSONObject.optString("merchantId", null);
                this.A08 = jSONObject.optString("supportPhoneNumber", null);
                this.A02 = jSONObject.optString("dashboardUrl", null);
                this.A04 = jSONObject.optString("notificationType", null);
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("PAY: BrazilMerchantMethodData fromDBString threw: ");
                sb.append(e);
                Log.w(sb.toString());
            }
        }
    }

    @Override // X.C0N0
    public C0N2 A05() {
        C03650Gn A00 = C03650Gn.A00("BR");
        if (A00 != null) {
            return new C0N1(A00, super.A04, this.A06, this);
        }
        return null;
    }

    @Override // X.C0N0
    public LinkedHashSet A08() {
        return new LinkedHashSet(Collections.singletonList(C013806p.A04));
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[ merchantId: ");
        String str = this.A06;
        A0P.append(str);
        A0P.append(" state: ");
        A0P.append(super.A00);
        A0P.append(" supportPhoneNumber: ");
        A0P.append(this.A08);
        A0P.append(" dashboardUrl: ");
        A0P.append(this.A02);
        A0P.append(" merchantId: ");
        A0P.append(str);
        A0P.append(" businessName: ");
        A0P.append(super.A02);
        A0P.append(" displayState: ");
        return C000200d.A0L(A0P, this.A05, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(super.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(super.A02);
        parcel.writeString(this.A05);
        parcel.writeString(super.A03);
        parcel.writeString(super.A04);
        parcel.writeLong(super.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
    }
}
