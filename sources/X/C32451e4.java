package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1e4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32451e4 extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19x
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            String str = null;
            String str2 = null;
            boolean z = false;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i2 == 3) {
                    str2 = C07K.A0u(parcel, readInt);
                } else if (i2 == 4) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 != 5) {
                    C07K.A1H(parcel, readInt);
                } else {
                    z = C07K.A1i(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32451e4(str, str2, i, z);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32451e4[i];
        }
    };
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C32451e4(String str, String str2, int i, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32451e4) {
            return ((C32451e4) obj).A02.equals(this.A02);
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public final String toString() {
        String str = this.A01;
        String str2 = this.A02;
        int i = this.A00;
        boolean z = this.A03;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 45);
        sb.append("Node{");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", hops=");
        sb.append(i);
        sb.append(", isNearby=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 2, this.A02, false);
        AnonymousClass088.A1M(parcel, 3, this.A01, false);
        AnonymousClass088.A1G(parcel, 4, this.A00);
        AnonymousClass088.A1P(parcel, 5, this.A03);
        AnonymousClass088.A1D(parcel, A03);
    }
}
