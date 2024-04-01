package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.11h  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C221711h implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.11g
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C221711h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C221711h[i];
        }
    };
    public final int A00;
    public final int A01;
    public final int[] A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C221711h(int i, int... iArr) {
        this.A00 = i;
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length);
        this.A02 = copyOf;
        this.A01 = length;
        Arrays.sort(copyOf);
    }

    public C221711h(Parcel parcel) {
        this.A00 = parcel.readInt();
        int readByte = parcel.readByte();
        this.A01 = readByte;
        int[] iArr = new int[readByte];
        this.A02 = iArr;
        parcel.readIntArray(iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C221711h.class != obj.getClass()) {
            return false;
        }
        C221711h c221711h = (C221711h) obj;
        return this.A00 == c221711h.A00 && Arrays.equals(this.A02, c221711h.A02);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A02) + (this.A00 * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        int[] iArr = this.A02;
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(iArr);
    }
}
