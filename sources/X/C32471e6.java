package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1e6  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32471e6 extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19z
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            long j = 0;
            String str2 = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i == 3) {
                    str2 = C07K.A0u(parcel, readInt);
                } else if (i != 4) {
                    C07K.A1H(parcel, readInt);
                } else {
                    j = C07K.A0N(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32471e6(str, str2, j);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32471e6[i];
        }
    };
    public final long A00;
    public final String A01;
    public final String A02;

    public C32471e6(String str, String str2, long j) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 2, this.A02, false);
        AnonymousClass088.A1M(parcel, 3, this.A01, false);
        AnonymousClass088.A1I(parcel, 4, this.A00);
        AnonymousClass088.A1D(parcel, A03);
    }
}
