package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1cc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31651cc extends C08G {
    public static final List A07 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.17j
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31651cc[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            List list = C31651cc.A07;
            LocationRequest locationRequest = null;
            String str = null;
            String str2 = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i != 1) {
                    switch (i) {
                        case 5:
                            list = C07K.A0z(parcel, readInt, C30991bX.CREATOR);
                            continue;
                        case 6:
                            str = C07K.A0u(parcel, readInt);
                            continue;
                        case 7:
                            z = C07K.A1i(parcel, readInt);
                            continue;
                        case 8:
                            z2 = C07K.A1i(parcel, readInt);
                            continue;
                        case 9:
                            z3 = C07K.A1i(parcel, readInt);
                            continue;
                        case 10:
                            str2 = C07K.A0u(parcel, readInt);
                            continue;
                        default:
                            C07K.A1H(parcel, readInt);
                            continue;
                    }
                } else {
                    locationRequest = (LocationRequest) C07K.A0W(parcel, readInt, LocationRequest.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31651cc(locationRequest, list, str, z, z2, z3, str2);
        }
    };
    public LocationRequest A00;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public C31651cc(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.A00 = locationRequest;
        this.A03 = list;
        this.A02 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C31651cc) {
            C31651cc c31651cc = (C31651cc) obj;
            return C07K.A1k(this.A00, c31651cc.A00) && C07K.A1k(this.A03, c31651cc.A03) && C07K.A1k(this.A02, c31651cc.A02) && this.A04 == c31651cc.A04 && this.A05 == c31651cc.A05 && this.A06 == c31651cc.A06 && C07K.A1k(this.A01, c31651cc.A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        String str = this.A02;
        if (str != null) {
            sb.append(" tag=");
            sb.append(str);
        }
        String str2 = this.A01;
        if (str2 != null) {
            sb.append(" moduleId=");
            sb.append(str2);
        }
        sb.append(" hideAppOps=");
        sb.append(this.A04);
        sb.append(" clients=");
        sb.append(this.A03);
        sb.append(" forceCoarseLocation=");
        sb.append(this.A05);
        if (this.A06) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1L(parcel, 1, this.A00, i, false);
        AnonymousClass088.A1O(parcel, 5, this.A03, false);
        AnonymousClass088.A1M(parcel, 6, this.A02, false);
        AnonymousClass088.A1P(parcel, 7, this.A04);
        AnonymousClass088.A1P(parcel, 8, this.A05);
        AnonymousClass088.A1P(parcel, 9, this.A06);
        AnonymousClass088.A1M(parcel, 10, this.A01, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
