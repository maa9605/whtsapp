package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: X.1f7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32951f7 extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.1CY
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            Bundle bundle = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                if ((65535 & readInt) != 2) {
                    C07K.A1H(parcel, readInt);
                } else {
                    bundle = C07K.A0T(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32951f7(bundle);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32951f7[i];
        }
    };
    public Bundle A00;
    public Map A01;

    public C32951f7(Bundle bundle) {
        this.A00 = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1J(parcel, 2, this.A00);
        AnonymousClass088.A1D(parcel, A03);
    }
}
