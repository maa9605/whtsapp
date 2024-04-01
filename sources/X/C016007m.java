package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.07m  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C016007m implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0uD
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C016007m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C016007m[i];
        }
    };
    public final double A00;
    public final double A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C016007m(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    public C016007m(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C016007m) {
            C016007m c016007m = (C016007m) obj;
            return Math.abs(this.A00 - c016007m.A00) < 0.002d && Math.abs(this.A01 - c016007m.A01) < 2.0E-4d;
        }
        return false;
    }

    public int hashCode() {
        return (int) (((527.0d + this.A00) * 31.0d) + this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LatLng");
        sb.append("{latitude=");
        sb.append(this.A00);
        sb.append(", longitude=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }
}
