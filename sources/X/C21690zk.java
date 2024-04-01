package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: X.0zk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21690zk implements Parcelable, Comparator {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0zh
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C21690zk(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C21690zk[i];
        }
    };
    public int A00;
    public final int A01;
    public final String A02;
    public final C21680zj[] A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C21690zk(Parcel parcel) {
        this.A02 = parcel.readString();
        C21680zj[] c21680zjArr = (C21680zj[]) parcel.createTypedArray(C21680zj.CREATOR);
        this.A03 = c21680zjArr;
        this.A01 = c21680zjArr.length;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        UUID uuid = C20910yU.A02;
        UUID uuid2 = ((C21680zj) obj).A03;
        boolean equals = uuid.equals(uuid2);
        UUID uuid3 = ((C21680zj) obj2).A03;
        if (equals) {
            return uuid.equals(uuid3) ? 0 : 1;
        }
        return uuid2.compareTo(uuid3);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21690zk.class != obj.getClass()) {
            return false;
        }
        C21690zk c21690zk = (C21690zk) obj;
        return C08M.A08(this.A02, c21690zk.A02) && Arrays.equals(this.A03, c21690zk.A03);
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            String str = this.A02;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.A03);
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }
}
