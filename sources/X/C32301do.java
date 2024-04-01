package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: X.1do  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32301do extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19h
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            ParcelFileDescriptor parcelFileDescriptor = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 2) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    parcelFileDescriptor = (ParcelFileDescriptor) C07K.A0W(parcel, readInt, ParcelFileDescriptor.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32301do(i, parcelFileDescriptor);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32301do[i];
        }
    };
    public final int A00;
    public final ParcelFileDescriptor A01;

    public C32301do(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.A00 = i;
        this.A01 = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 2, this.A00);
        AnonymousClass088.A1L(parcel, 3, this.A01, i, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
