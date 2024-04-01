package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1dD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31951dD extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18q
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31951dD[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                if ((65535 & readInt) != 2) {
                    C07K.A1H(parcel, readInt);
                } else {
                    str = C07K.A0u(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31951dD(str);
        }
    };
    public final String A00;

    public C31951dD(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 2, this.A00, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
