package X;

import android.os.Parcel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0TN */
/* loaded from: classes.dex */
public abstract class C0TN extends C0K9 {
    public int A00;
    public long A01;
    public C60232u9 A02;
    public UserJid A03;
    public String A04;
    public boolean A05;

    @Override // X.C0K9
    public void A02(int i, List list) {
    }

    @Override // X.C0K9
    public void A03(C013606n c013606n, int i, C02590Ca c02590Ca) {
    }

    public String A09() {
        return "";
    }

    public void A0C(String str) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0TN() {
        this.A01 = -1L;
    }

    public C0TN(Parcel parcel) {
        this.A01 = -1L;
        this.A03 = UserJid.getNullable(parcel.readString());
        this.A05 = parcel.readInt() == 1;
        this.A00 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = new C60232u9(parcel);
    }

    @Override // X.C0K9
    public String A01() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("consumer_status", A08().A01());
            return jSONObject.toString();
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("PAY: PaymentContactInfoCountryData/toDBString/exception: ");
            sb.append(e);
            Log.e(sb.toString());
            return null;
        }
    }

    @Override // X.C0K9
    public void A04(String str) {
        if (str != null) {
            try {
                A08().A02(new JSONObject(str).optJSONObject("consumer_status"));
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("PAY: PaymentContactInfoCountryData/fromDbString/exception: ");
                sb.append(e);
                Log.e(sb.toString());
            }
        }
    }

    public int A05() {
        return this.A00;
    }

    public int A06(int i) {
        return (int) ((A08().A00 >> (i << 2)) & 15);
    }

    public long A07() {
        return A08().A00;
    }

    public final C60232u9 A08() {
        C60232u9 c60232u9 = this.A02;
        if (c60232u9 == null) {
            C60232u9 c60232u92 = new C60232u9();
            this.A02 = c60232u92;
            return c60232u92;
        }
        return c60232u9;
    }

    public void A0A(int i) {
        this.A00 = i;
    }

    public void A0B(long j) {
        A08().A00 = j;
    }

    public void A0D(boolean z) {
        this.A05 = z;
    }

    public boolean A0E() {
        return this.A05;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(C003101m.A07(this.A03));
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        C60232u9 A08 = A08();
        parcel.writeLong(A08.A00);
        Map map = A08.A01;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeInt(((Number) entry.getKey()).intValue());
            parcel.writeString((String) entry.getValue());
        }
    }
}
