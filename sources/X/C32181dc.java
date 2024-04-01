package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1dc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32181dc extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19V
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            ArrayList arrayList = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    arrayList = C07K.A0z(parcel, readInt, C32451e4.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32181dc(str, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32181dc[i];
        }
    };
    public final String A00;
    public final List A01;

    public C32181dc(String str, List list) {
        this.A00 = str;
        this.A01 = list;
        C07K.A1P(str);
        C07K.A1P(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C32181dc.class != obj.getClass()) {
            return false;
        }
        C32181dc c32181dc = (C32181dc) obj;
        String str = this.A00;
        if (str != null) {
            if (!str.equals(c32181dc.A00)) {
                return false;
            }
        } else if (c32181dc.A00 != null) {
            return false;
        }
        List list = this.A01;
        List list2 = c32181dc.A01;
        if (list != null) {
            if (!list.equals(list2)) {
                return false;
            }
        } else if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List list = this.A01;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(str).length() + 18);
        sb.append("CapabilityInfo{");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 2, this.A00, false);
        AnonymousClass088.A1O(parcel, 3, this.A01, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
