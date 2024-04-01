package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1dK */
/* loaded from: classes.dex */
public final class C32021dK extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18x
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            C30451ab c30451ab = null;
            C31041bc c31041bc = null;
            int i = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 == 2) {
                    c30451ab = (C30451ab) C07K.A0W(parcel, readInt, C30451ab.CREATOR);
                } else if (i2 != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    c31041bc = (C31041bc) C07K.A0W(parcel, readInt, C31041bc.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32021dK(i, c30451ab, c31041bc);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32021dK[i];
        }
    };
    public final int A00;
    public final C30451ab A01;
    public final C31041bc A02;

    public C32021dK(int i, C30451ab c30451ab, C31041bc c31041bc) {
        this.A00 = i;
        this.A01 = c30451ab;
        this.A02 = c31041bc;
    }

    public C32021dK() {
        C30451ab c30451ab = new C30451ab(8, null);
        this.A00 = 1;
        this.A01 = c30451ab;
        this.A02 = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        AnonymousClass088.A1L(parcel, 2, this.A01, i, false);
        AnonymousClass088.A1L(parcel, 3, this.A02, i, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
