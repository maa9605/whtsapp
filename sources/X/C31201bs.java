package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1bs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31201bs extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.15d
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            C31191br c31191br = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 != 2) {
                    C07K.A1H(parcel, readInt);
                } else {
                    c31191br = (C31191br) C07K.A0W(parcel, readInt, C31191br.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31201bs(i, c31191br);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31201bs[i];
        }
    };
    public final int A00;
    public final C31191br A01;

    public C31201bs(int i, C31191br c31191br) {
        this.A00 = i;
        this.A01 = c31191br;
    }

    public C31201bs(C31191br c31191br) {
        this.A00 = 1;
        this.A01 = c31191br;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        AnonymousClass088.A1L(parcel, 2, this.A01, i, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
