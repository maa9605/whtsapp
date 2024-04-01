package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1KQ */
/* loaded from: classes.dex */
public class C1KQ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.1KP
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C1KQ(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C1KQ[i];
        }
    };
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C1KQ(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public C1KQ(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("DeviceSimInfo{countryCode='");
        C000200d.A1P(A0P, this.A00, '\'', ", phoneNumber='");
        C000200d.A1P(A0P, this.A02, '\'', ", networkOperatorName='");
        A0P.append(this.A01);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
