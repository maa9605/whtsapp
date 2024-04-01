package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2uJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60332uJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2uI
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C60332uJ(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C60332uJ[i];
        }
    };
    public String A00;
    public boolean A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C60332uJ() {
        this.A00 = "";
        this.A01 = true;
    }

    public C60332uJ(Parcel parcel) {
        this.A00 = "";
        this.A01 = true;
        this.A00 = parcel.readString();
        this.A01 = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
    }
}
