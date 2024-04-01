package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.10z */
/* loaded from: classes.dex */
public final class C220910z implements Parcelable {
    public static final C220910z A03 = new C220910z(new C220710x[0]);
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.10y
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C220910z(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C220910z[i];
        }
    };
    public int A00;
    public final int A01;
    public final C220710x[] A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C220910z(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new C220710x[readInt];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = parcel.readParcelable(C220710x.class.getClassLoader());
        }
    }

    public C220910z(C220710x... c220710xArr) {
        this.A02 = c220710xArr;
        this.A01 = c220710xArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C220910z.class != obj.getClass()) {
            return false;
        }
        C220910z c220910z = (C220910z) obj;
        return this.A01 == c220910z.A01 && Arrays.equals(this.A02, c220910z.A02);
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.A02);
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
