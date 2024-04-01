package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Kk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04500Kk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3Ta
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C04500Kk(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C04500Kk[i];
        }
    };
    public final String A00;
    public final String A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C04500Kk(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public C04500Kk(String str) {
        if (str != null) {
            this.A01 = str;
            this.A00 = "set";
            return;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
