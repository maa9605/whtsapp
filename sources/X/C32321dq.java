package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1dq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32321dq extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19j
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 2) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 == 3) {
                    z = C07K.A1i(parcel, readInt);
                } else if (i2 != 4) {
                    C07K.A1H(parcel, readInt);
                } else {
                    z2 = C07K.A1i(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32321dq(i, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32321dq[i];
        }
    };
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public C32321dq(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 2, this.A00);
        AnonymousClass088.A1P(parcel, 3, this.A01);
        AnonymousClass088.A1P(parcel, 4, this.A02);
        AnonymousClass088.A1D(parcel, A03);
    }
}
