package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1bn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31151bn extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.15W
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            Bundle bundle = null;
            C30461ac[] c30461acArr = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 1) {
                    bundle = C07K.A0T(parcel, readInt);
                } else if (i != 2) {
                    C07K.A1H(parcel, readInt);
                } else {
                    c30461acArr = (C30461ac[]) C07K.A1r(parcel, readInt, C30461ac.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31151bn(bundle, c30461acArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31151bn[i];
        }
    };
    public Bundle A00;
    public C30461ac[] A01;

    public C31151bn(Bundle bundle, C30461ac[] c30461acArr) {
        this.A00 = bundle;
        this.A01 = c30461acArr;
    }

    public C31151bn() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1J(parcel, 1, this.A00);
        AnonymousClass088.A1R(parcel, 2, this.A01, i);
        AnonymousClass088.A1D(parcel, A03);
    }
}
