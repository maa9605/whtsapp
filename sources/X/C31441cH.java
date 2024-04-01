package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1cH */
/* loaded from: classes.dex */
public final class C31441cH extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.16e
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            byte[] bArr = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 1) {
                    C07K.A0A(parcel, readInt);
                } else if (i == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    bArr = C07K.A1o(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31441cH(str, bArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31441cH[i];
        }
    };
    public final int A00 = 1;
    public final String A01;
    public final byte[] A02;

    public C31441cH(String str, byte[] bArr) {
        C07K.A1P(str);
        this.A01 = str;
        C07K.A1P(bArr);
        this.A02 = bArr;
    }

    public C31441cH(byte[] bArr) {
        C07K.A1P("com.whatsapp");
        this.A01 = "com.whatsapp";
        C07K.A1P(bArr);
        this.A02 = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        AnonymousClass088.A1M(parcel, 2, this.A01, false);
        AnonymousClass088.A1Q(parcel, 3, this.A02, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
