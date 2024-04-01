package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.28j  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C468128j implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2uG
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            C0N2 A01 = C0N2.A01(readInt, readString, C03650Gn.A00(readString2), parcel.readString(), parcel.readString());
            if (A01 instanceof C0N7) {
                ((C0N7) A01).A01 = parcel.readInt();
            }
            C014006r A00 = C014006r.A00(parcel.readString(), parcel.readInt());
            int readInt2 = parcel.readInt();
            if (A00 == null) {
                return null;
            }
            return new C468128j(A01, A00, readInt2);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C468128j[i];
        }
    };
    public int A00;
    public C0N2 A01;
    public final C014006r A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C468128j(C0N2 c0n2, C014006r c014006r, int i) {
        C000700j.A07(c014006r.A02());
        this.A02 = c014006r;
        this.A00 = i;
        this.A01 = c0n2;
    }

    public JSONObject A00(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.A01.A08());
            if (this.A01 != null) {
                jSONObject.put("st", (Object) null);
                jSONObject.put("cc", this.A01.A05.A02);
                if (!z) {
                    jSONObject.put("c", this.A01.A07);
                    jSONObject.put("n", this.A01.A0A);
                    jSONObject.put("a", this.A02.toString());
                }
                C0N2 c0n2 = this.A01;
                if (c0n2 instanceof C0N7) {
                    jSONObject.put("ci", ((C0N7) c0n2).A01);
                }
                jSONObject.put("sd", this.A00);
                return jSONObject;
            }
            throw null;
        } catch (JSONException e) {
            if (!z) {
                Log.w("PAY: PaymentTransaction:Source:toJsonString threw creating json string: ", e);
            }
            return null;
        }
    }

    public String toString() {
        JSONObject A00 = A00(true);
        if (A00 != null) {
            return A00.toString();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01.A08());
        if (this.A01 != null) {
            parcel.writeString(null);
            parcel.writeString(this.A01.A05.A02);
            parcel.writeString(this.A01.A07);
            parcel.writeString(this.A01.A0A);
            C0N2 c0n2 = this.A01;
            if (c0n2 instanceof C0N7) {
                parcel.writeInt(((C0N7) c0n2).A01);
            }
            BigDecimal bigDecimal = this.A02.A00;
            parcel.writeInt(bigDecimal.scale());
            parcel.writeString(bigDecimal.toString());
            parcel.writeInt(this.A00);
            return;
        }
        throw null;
    }
}
