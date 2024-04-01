package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Qs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28211Qs implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3aZ
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C28211Qs(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C28211Qs[i];
        }
    };
    public final long A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C28211Qs(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A01 = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.A02 = readString2;
                this.A00 = parcel.readLong();
                return;
            }
            throw null;
        }
        throw null;
    }

    public C28211Qs(String str, String str2, long j) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
    }
}
