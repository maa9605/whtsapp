package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1dk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32261dk extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19d
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            int i2 = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i3 = 65535 & readInt;
                if (i3 == 2) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i3 != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    i2 = C07K.A0A(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32261dk(i, i2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32261dk[i];
        }
    };
    public final int A00;
    public final int A01;

    public C32261dk(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 2, this.A00);
        AnonymousClass088.A1G(parcel, 3, this.A01);
        AnonymousClass088.A1D(parcel, A03);
    }
}
