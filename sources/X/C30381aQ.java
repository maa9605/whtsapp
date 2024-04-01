package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1aQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30381aQ extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.13R
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            long j = 0;
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 == 2) {
                    z = C07K.A1i(parcel, readInt);
                } else if (i2 == 3) {
                    j = C07K.A0N(parcel, readInt);
                } else if (i2 != 4) {
                    C07K.A1H(parcel, readInt);
                } else {
                    z2 = C07K.A1i(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C30381aQ(i, z, j, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C30381aQ[i];
        }
    };
    public long A00;
    public boolean A01;
    public final int A02;
    public final boolean A03;

    public C30381aQ(int i, boolean z, long j, boolean z2) {
        this.A02 = i;
        this.A01 = z;
        this.A00 = j;
        this.A03 = z2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A02);
        AnonymousClass088.A1P(parcel, 2, this.A01);
        AnonymousClass088.A1I(parcel, 3, this.A00);
        AnonymousClass088.A1P(parcel, 4, this.A03);
        AnonymousClass088.A1D(parcel, A03);
    }
}
