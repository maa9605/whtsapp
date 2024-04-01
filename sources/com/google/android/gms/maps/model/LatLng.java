package com.google.android.gms.maps.model;

import X.AnonymousClass088;
import X.C08G;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes.dex */
public final class LatLng extends C08G implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18g
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            double d = 0.0d;
            double d2 = 0.0d;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    d = C07K.A02(parcel, readInt);
                } else if (i != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    d2 = C07K.A02(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new LatLng(d, d2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new LatLng[i];
        }
    };
    public final double A00;
    public final double A01;

    public LatLng(double d, double d2) {
        if (-180.0d <= d2 && d2 < 180.0d) {
            this.A01 = d2;
        } else {
            this.A01 = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.A00 = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLng) {
            LatLng latLng = (LatLng) obj;
            return Double.doubleToLongBits(this.A00) == Double.doubleToLongBits(latLng.A00) && Double.doubleToLongBits(this.A01) == Double.doubleToLongBits(latLng.A01);
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A00);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.A01);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        double d = this.A00;
        double d2 = this.A01;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        double d = this.A00;
        AnonymousClass088.A1H(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.A01;
        AnonymousClass088.A1H(parcel, 3, 8);
        parcel.writeDouble(d2);
        AnonymousClass088.A1D(parcel, A03);
    }
}
