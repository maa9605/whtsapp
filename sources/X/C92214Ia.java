package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Ia */
/* loaded from: classes3.dex */
public class C92214Ia extends C0N5 {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.48k
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            C92214Ia c92214Ia = new C92214Ia();
            c92214Ia.A05 = parcel.readString();
            c92214Ia.A02 = parcel.readString();
            c92214Ia.A00 = parcel.readInt();
            c92214Ia.A03 = parcel.readString();
            ((C0N5) c92214Ia).A01 = parcel.readString();
            c92214Ia.A04 = parcel.readInt() == 1;
            ((C0N5) c92214Ia).A03 = parcel.readString();
            ((C0N5) c92214Ia).A04 = parcel.readString();
            c92214Ia.A06 = parcel.readString();
            ((C0N5) c92214Ia).A00 = parcel.readLong();
            return c92214Ia;
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C92214Ia[i];
        }
    };
    public int A00;
    public int A01 = 1;
    public String A02;
    public String A03;
    public boolean A04;

    @Override // X.C0N0
    public String A06() {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.C0K9
    public String A01() {
        try {
            JSONObject A0C = A0C();
            A0C.put("v", this.A01);
            A0C.put("bankName", this.A05);
            A0C.put("bankCode", this.A02);
            A0C.put("verificationStatus", this.A00);
            return A0C.toString();
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("PAY: BrazilBankAccountMethodData toDBString threw: ");
            sb.append(e);
            Log.w(sb.toString());
            return null;
        }
    }

    @Override // X.C0K9
    public void A02(int i, List list) {
        throw new UnsupportedOperationException("PAY: BrazilBankAccountMethodData toNetwork unsupported");
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
        C04P A0A = c02590Ca.A0A("country");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        super.A03 = str;
        C04P A0A2 = c02590Ca.A0A("credential-id");
        if (A0A2 != null) {
            str2 = A0A2.A03;
        } else {
            str2 = null;
        }
        super.A04 = str2;
        C04P A0A3 = c02590Ca.A0A("account-number");
        if (A0A3 != null) {
            str3 = A0A3.A03;
        } else {
            str3 = null;
        }
        this.A06 = str3;
        C04P A0A4 = c02590Ca.A0A("bank-name");
        if (A0A4 != null) {
            str4 = A0A4.A03;
        } else {
            str4 = null;
        }
        this.A05 = str4;
        C04P A0A5 = c02590Ca.A0A("code");
        if (A0A5 != null) {
            str5 = A0A5.A03;
        } else {
            str5 = null;
        }
        this.A02 = str5;
        if (str5 == null) {
            C04P A0A6 = c02590Ca.A0A("bank-code");
            if (A0A6 != null) {
                str9 = A0A6.A03;
            } else {
                str9 = null;
            }
            this.A02 = str9;
        }
        C04P A0A7 = c02590Ca.A0A("verification-status");
        if (A0A7 != null) {
            str6 = A0A7.A03;
        } else {
            str6 = null;
        }
        this.A00 = C0N2.A00(str6);
        C04P A0A8 = c02590Ca.A0A("short-name");
        if (A0A8 != null) {
            str7 = A0A8.A03;
        } else {
            str7 = null;
        }
        this.A03 = str7;
        C04P A0A9 = c02590Ca.A0A("bank-image");
        if (A0A9 != null) {
            str8 = A0A9.A03;
        } else {
            str8 = null;
        }
        super.A01 = str8;
        C04P A0A10 = c02590Ca.A0A("accept-savings");
        this.A04 = "1".equals(A0A10 != null ? A0A10.A03 : null);
    }

    @Override // X.C0K9
    public void A04(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                super.A01 = jSONObject.optString("bankImageURL", null);
                super.A02 = jSONObject.optString("bankPhoneNumber", null);
                this.A01 = jSONObject.optInt("v", 1);
                this.A05 = jSONObject.optString("bankName");
                this.A02 = jSONObject.optString("bankCode");
                this.A00 = jSONObject.optInt("verificationStatus");
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("PAY: BrazilBankAccountMethodData fromDBString threw: ");
                sb.append(e);
                Log.w(sb.toString());
            }
        }
    }

    @Override // X.C0N0
    public C0N2 A05() {
        C03650Gn A00 = C03650Gn.A00("BR");
        if (A00 != null) {
            C0N6 c0n6 = new C0N6(A00, super.A04, super.A00, -1L, 0, 0, "", this.A05, null, this);
            c0n6.A02 = this.A00;
            return c0n6;
        }
        return null;
    }

    @Override // X.C0N0
    public LinkedHashSet A08() {
        return new LinkedHashSet(Collections.singletonList(C013806p.A04));
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[ credentialId: ");
        A0P.append(super.A04);
        A0P.append("maskedAccountNumber: ");
        A0P.append(this.A06);
        A0P.append(" bankName: ");
        A0P.append(this.A05);
        A0P.append(" bankCode: ");
        A0P.append(this.A02);
        A0P.append(" verificationStatus: ");
        A0P.append(this.A00);
        A0P.append(" bankShortName: ");
        A0P.append(this.A03);
        A0P.append(" acceptSavings: ");
        A0P.append(this.A04);
        A0P.append("]");
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(super.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(super.A03);
        parcel.writeString(super.A04);
        parcel.writeString(this.A06);
        parcel.writeLong(super.A00);
    }
}
