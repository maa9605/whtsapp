package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.10x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C220710x implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.10w
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C220710x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C220710x[i];
        }
    };
    public int A00;
    public final int A01;
    public final C21030yg[] A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C220710x(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new C21030yg[readInt];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = parcel.readParcelable(C21030yg.class.getClassLoader());
        }
    }

    public C220710x(C21030yg... c21030ygArr) {
        int length = c21030ygArr.length;
        C002701i.A1K(length > 0);
        this.A02 = c21030ygArr;
        this.A01 = length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C220710x.class != obj.getClass()) {
            return false;
        }
        C220710x c220710x = (C220710x) obj;
        return this.A01 == c220710x.A01 && Arrays.equals(this.A02, c220710x.A02);
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = 527 + Arrays.hashCode(this.A02);
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable(this.A02[i3], 0);
        }
    }
}
