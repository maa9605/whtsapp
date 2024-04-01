package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1bX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30991bX extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.15T
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            String str = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 != 2) {
                    C07K.A1H(parcel, readInt);
                } else {
                    str = C07K.A0u(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C30991bX(i, str);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C30991bX[i];
        }
    };
    public final int A00;
    public final String A01;

    public C30991bX(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof C30991bX)) {
            C30991bX c30991bX = (C30991bX) obj;
            if (c30991bX.A00 == this.A00 && C07K.A1k(c30991bX.A01, this.A01)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        int i = this.A00;
        String str = this.A01;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        AnonymousClass088.A1M(parcel, 2, this.A01, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
