package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0eA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09480eA implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2pp
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C09480eA(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C09480eA[i];
        }
    };
    public final String A00;
    public final String A01;
    public final List A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C09480eA(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C09490eB.CREATOR);
        if (createTypedArrayList == null) {
            throw null;
        }
        this.A02 = createTypedArrayList;
    }

    public C09480eA(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C09480eA) {
            C09480eA c09480eA = (C09480eA) obj;
            return TextUtils.equals(this.A01, c09480eA.A01) && TextUtils.equals(this.A00, c09480eA.A00) && this.A02.equals(c09480eA.A02);
        }
        return false;
    }

    public int hashCode() {
        String str = this.A01;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.A00;
        return this.A02.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("timezone: ");
        A0P.append(this.A01);
        A0P.append(", note: ");
        A0P.append(this.A00);
        for (Object obj : this.A02) {
            A0P.append(obj.toString());
            A0P.append(";");
        }
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeTypedList(this.A02);
    }
}
