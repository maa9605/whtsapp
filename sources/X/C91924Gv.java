package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Gv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C91924Gv extends C0TN {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.48n
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C91924Gv(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C91924Gv[i];
        }
    };
    public int A00;

    public C91924Gv() {
        this.A00 = 1;
    }

    public C91924Gv(Parcel parcel) {
        super(parcel);
        this.A00 = 1;
    }

    @Override // X.C0TN, X.C0K9
    public String A01() {
        JSONObject jSONObject;
        try {
            String A01 = super.A01();
            if (A01 != null) {
                jSONObject = new JSONObject(A01);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("v", this.A00);
            long j = this.A01;
            if (j != -1) {
                jSONObject.put("nextSyncTimeMillis", j);
            }
            if (!TextUtils.isEmpty(this.A04)) {
                jSONObject.put("dataHash", this.A04);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("PAY: BrazilContactData toDBString threw: ", e);
            return null;
        }
    }

    @Override // X.C0TN, X.C0K9
    public void A02(int i, List list) {
        throw new UnsupportedOperationException("BrazilContactData toNetwork not supported");
    }

    @Override // X.C0TN, X.C0K9
    public void A04(String str) {
        super.A04(str);
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("v", 1);
                this.A00 = optInt;
                if (optInt == 1) {
                    this.A01 = jSONObject.optLong("nextSyncTimeMillis", -1L);
                }
                this.A04 = jSONObject.optString("dataHash");
            } catch (JSONException e) {
                Log.w("PAY: BrazilContactData fromDBString threw: ", e);
            }
        }
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[ ver: ");
        A0P.append(this.A00);
        A0P.append(" jid: ");
        A0P.append(this.A03);
        A0P.append(" isMerchant: ");
        A0P.append(this.A05);
        A0P.append(" defaultPaymentType: ");
        return C000200d.A0K(A0P, super.A00, " ]");
    }
}
