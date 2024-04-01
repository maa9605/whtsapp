package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2E9  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2E9 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3VU
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C2E9(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C2E9[i];
        }
    };
    public final long A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C2E9(long j, String str, long j2, long j3, String str2) {
        this.A04 = str;
        this.A02 = j;
        this.A03 = str2;
        this.A00 = j2;
        this.A01 = j3;
    }

    public C2E9(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A04 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A03 = parcel.readString();
        this.A01 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A02);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
    }
}
