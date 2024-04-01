package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Ri  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50342Ri implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3TR
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C50342Ri(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C50342Ri[i];
        }
    };
    public final String A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C50342Ri(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public C50342Ri(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
