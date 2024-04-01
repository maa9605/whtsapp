package com.google.android.gms.maps.model;

import X.AnonymousClass088;
import X.C07K;
import X.C08G;
import X.C08L;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LatLngBounds extends C08G implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18f
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            LatLng latLng = null;
            LatLng latLng2 = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    latLng = (LatLng) C07K.A0W(parcel, readInt, LatLng.CREATOR);
                } else if (i != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    latLng2 = (LatLng) C07K.A0W(parcel, readInt, LatLng.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new LatLngBounds(latLng, latLng2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new LatLngBounds[i];
        }
    };
    public final LatLng A00;
    public final LatLng A01;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C07K.A1Q(latLng, "null southwest");
        C07K.A1Q(latLng2, "null northeast");
        double d = latLng2.A00;
        double d2 = latLng.A00;
        C07K.A1d(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(d));
        this.A01 = latLng;
        this.A00 = latLng2;
    }

    public final boolean A00(LatLng latLng) {
        double d = latLng.A00;
        LatLng latLng2 = this.A01;
        if (latLng2.A00 <= d) {
            LatLng latLng3 = this.A00;
            if (d <= latLng3.A00) {
                double d2 = latLng.A01;
                double d3 = latLng2.A01;
                double d4 = latLng3.A01;
                if (d3 <= d4) {
                    if (d3 <= d2 && d2 <= d4) {
                        return true;
                    }
                } else if (d3 <= d2 || d2 <= d4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngBounds) {
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            return this.A01.equals(latLngBounds.A01) && this.A00.equals(latLngBounds.A00);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final String toString() {
        C08L A0q = C07K.A0q(this);
        A0q.A00("southwest", this.A01);
        A0q.A00("northeast", this.A00);
        return A0q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1L(parcel, 2, this.A01, i, false);
        AnonymousClass088.A1L(parcel, 3, this.A00, i, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
