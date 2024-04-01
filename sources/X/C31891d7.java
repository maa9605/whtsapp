package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1d7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C31891d7 extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18o
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31891d7[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            byte[] bArr = null;
            int i = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i2 == 3) {
                    bArr = C07K.A1o(parcel, readInt);
                } else if (i2 != 4) {
                    C07K.A1H(parcel, readInt);
                } else {
                    i = C07K.A0A(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31891d7(str, bArr, i);
        }
    };
    public final int A00;
    public final String A01;
    public final byte[] A02;

    public C31891d7(String str, byte[] bArr, int i) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 2, this.A01, false);
        AnonymousClass088.A1Q(parcel, 3, this.A02, false);
        AnonymousClass088.A1G(parcel, 4, this.A00);
        AnonymousClass088.A1D(parcel, A03);
    }
}
