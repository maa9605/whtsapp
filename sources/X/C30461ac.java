package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.1ac */
/* loaded from: classes.dex */
public class C30461ac extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.163
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            int i = 0;
            long j = -1;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i2 == 2) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    j = C07K.A0N(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C30461ac(str, i, j);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C30461ac[i];
        }
    };
    public final int A00;
    public final long A01;
    public final String A02;

    public C30461ac(String str, int i, long j) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = j;
    }

    public long A00() {
        long j = this.A01;
        return j == -1 ? this.A00 : j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C30461ac) {
            C30461ac c30461ac = (C30461ac) obj;
            String str = this.A02;
            if (((str != null && str.equals(c30461ac.A02)) || (str == null && c30461ac.A02 == null)) && A00() == c30461ac.A00()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, Long.valueOf(A00())});
    }

    public String toString() {
        C08L A0q = C07K.A0q(this);
        A0q.A00("name", this.A02);
        A0q.A00("version", Long.valueOf(A00()));
        return A0q.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 1, this.A02, false);
        AnonymousClass088.A1G(parcel, 2, this.A00);
        AnonymousClass088.A1I(parcel, 3, A00());
        AnonymousClass088.A1D(parcel, A03);
    }
}
