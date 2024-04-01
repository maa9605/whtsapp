package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

/* renamed from: X.1d6 */
/* loaded from: classes.dex */
public final class C31881d6 extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18j
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            LatLng latLng = null;
            LatLng latLng2 = null;
            LatLng latLng3 = null;
            LatLng latLng4 = null;
            LatLngBounds latLngBounds = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    latLng = (LatLng) C07K.A0W(parcel, readInt, LatLng.CREATOR);
                } else if (i == 3) {
                    latLng2 = (LatLng) C07K.A0W(parcel, readInt, LatLng.CREATOR);
                } else if (i == 4) {
                    latLng3 = (LatLng) C07K.A0W(parcel, readInt, LatLng.CREATOR);
                } else if (i == 5) {
                    latLng4 = (LatLng) C07K.A0W(parcel, readInt, LatLng.CREATOR);
                } else if (i != 6) {
                    C07K.A1H(parcel, readInt);
                } else {
                    latLngBounds = (LatLngBounds) C07K.A0W(parcel, readInt, LatLngBounds.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31881d6(latLng, latLng2, latLng3, latLng4, latLngBounds);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31881d6[i];
        }
    };
    public final LatLng A00;
    public final LatLng A01;
    public final LatLng A02;
    public final LatLng A03;
    public final LatLngBounds A04;

    public C31881d6(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.A02 = latLng;
        this.A03 = latLng2;
        this.A00 = latLng3;
        this.A01 = latLng4;
        this.A04 = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C31881d6) {
            C31881d6 c31881d6 = (C31881d6) obj;
            return this.A02.equals(c31881d6.A02) && this.A03.equals(c31881d6.A03) && this.A00.equals(c31881d6.A00) && this.A01.equals(c31881d6.A01) && this.A04.equals(c31881d6.A04);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A00, this.A01, this.A04});
    }

    public final String toString() {
        C08L A0q = C07K.A0q(this);
        A0q.A00("nearLeft", this.A02);
        A0q.A00("nearRight", this.A03);
        A0q.A00("farLeft", this.A00);
        A0q.A00("farRight", this.A01);
        A0q.A00("latLngBounds", this.A04);
        return A0q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1L(parcel, 2, this.A02, i, false);
        AnonymousClass088.A1L(parcel, 3, this.A03, i, false);
        AnonymousClass088.A1L(parcel, 4, this.A00, i, false);
        AnonymousClass088.A1L(parcel, 5, this.A01, i, false);
        AnonymousClass088.A1L(parcel, 6, this.A04, i, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
