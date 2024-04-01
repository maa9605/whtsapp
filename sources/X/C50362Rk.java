package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Rk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50362Rk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3TS
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C50362Rk(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C50362Rk[i];
        }
    };
    public boolean A00;
    public final String A01;
    public final byte[] A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C50362Rk(Parcel parcel) {
        this.A00 = parcel.readInt() != 0;
        this.A02 = parcel.createByteArray();
        String readString = parcel.readString();
        if (readString == null) {
            throw null;
        }
        this.A01 = readString;
    }

    public C50362Rk(byte[] bArr, String str, boolean z) {
        this.A02 = bArr;
        this.A01 = str;
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A01);
    }
}
