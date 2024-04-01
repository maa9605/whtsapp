package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1dC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31941dC extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18p
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31941dC[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            C31891d7[] c31891d7Arr = null;
            long j = 0;
            int i = 0;
            boolean z = false;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 2) {
                    j = C07K.A0N(parcel, readInt);
                } else if (i2 == 3) {
                    c31891d7Arr = (C31891d7[]) C07K.A1r(parcel, readInt, C31891d7.CREATOR);
                } else if (i2 == 4) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 != 5) {
                    C07K.A1H(parcel, readInt);
                } else {
                    z = C07K.A1i(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31941dC(j, c31891d7Arr, i, z);
        }
    };
    public final int A00;
    public final long A01;
    public final boolean A02;
    public final C31891d7[] A03;

    public C31941dC(long j, C31891d7[] c31891d7Arr, int i, boolean z) {
        this.A01 = j;
        this.A03 = c31891d7Arr;
        this.A02 = z;
        if (z) {
            this.A00 = i;
        } else {
            this.A00 = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1I(parcel, 2, this.A01);
        AnonymousClass088.A1R(parcel, 3, this.A03, i);
        AnonymousClass088.A1G(parcel, 4, this.A00);
        AnonymousClass088.A1P(parcel, 5, this.A02);
        AnonymousClass088.A1D(parcel, A03);
    }
}
