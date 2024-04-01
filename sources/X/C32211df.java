package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1df  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32211df extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19Y
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                if ((65535 & readInt) != 2) {
                    C07K.A1H(parcel, readInt);
                } else {
                    i = C07K.A0A(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32211df(i);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32211df[i];
        }
    };
    public final int A00;

    public C32211df(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 2, this.A00);
        AnonymousClass088.A1D(parcel, A03);
    }
}
