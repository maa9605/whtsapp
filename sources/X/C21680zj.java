package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.0zj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21680zj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0zi
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C21680zj(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C21680zj[i];
        }
    };
    public int A00;
    public final String A01;
    public final String A02;
    public final UUID A03;
    public final boolean A04;
    public final byte[] A05;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C21680zj(Parcel parcel) {
        this.A03 = new UUID(parcel.readLong(), parcel.readLong());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = parcel.createByteArray();
        this.A04 = parcel.readByte() != 0;
    }

    public boolean A00(UUID uuid) {
        UUID uuid2 = C20910yU.A02;
        UUID uuid3 = this.A03;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C21680zj) {
            if (obj == this) {
                return true;
            }
            C21680zj c21680zj = (C21680zj) obj;
            return C08M.A08(this.A01, c21680zj.A01) && C08M.A08(this.A02, c21680zj.A02) && C08M.A08(this.A03, c21680zj.A03) && Arrays.equals(this.A05, c21680zj.A05);
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = this.A03.hashCode() * 31;
            String str = this.A01;
            int hashCode2 = Arrays.hashCode(this.A05) + ((this.A02.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
            this.A00 = hashCode2;
            return hashCode2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.A03;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A05);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
    }
}
