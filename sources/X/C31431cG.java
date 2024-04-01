package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1cG */
/* loaded from: classes.dex */
public final class C31431cG extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.16d
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 1) {
                    C07K.A0A(parcel, readInt);
                } else if (i != 2) {
                    C07K.A1H(parcel, readInt);
                } else {
                    str = C07K.A0u(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31431cG(str);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31431cG[i];
        }
    };
    public final int A00 = 1;
    public final String A01;

    public C31431cG() {
        C07K.A1P("com.whatsapp");
        this.A01 = "com.whatsapp";
    }

    public C31431cG(String str) {
        C07K.A1P(str);
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        AnonymousClass088.A1M(parcel, 2, this.A01, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
