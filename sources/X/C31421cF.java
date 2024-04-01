package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1cF */
/* loaded from: classes.dex */
public final class C31421cF extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.16c
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            int i = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    C07K.A0A(parcel, readInt);
                } else if (i2 == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i2 != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    i = C07K.A0A(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31421cF(str, i);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31421cF[i];
        }
    };
    public final int A00;
    public final int A01 = 1;
    public final String A02;

    public C31421cF(int i) {
        C07K.A1P("com.whatsapp");
        this.A02 = "com.whatsapp";
        this.A00 = i;
    }

    public C31421cF(String str, int i) {
        C07K.A1P(str);
        this.A02 = str;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A01);
        AnonymousClass088.A1M(parcel, 2, this.A02, false);
        AnonymousClass088.A1G(parcel, 3, this.A00);
        AnonymousClass088.A1D(parcel, A03);
    }
}
