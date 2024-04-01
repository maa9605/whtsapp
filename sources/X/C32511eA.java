package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1eA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32511eA extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.1A4
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            long j = 0;
            ArrayList arrayList = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 2) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 == 3) {
                    j = C07K.A0N(parcel, readInt);
                } else if (i2 != 4) {
                    C07K.A1H(parcel, readInt);
                } else {
                    arrayList = C07K.A0z(parcel, readInt, C32471e6.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32511eA(i, j, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32511eA[i];
        }
    };
    public final int A00;
    public final long A01;
    public final List A02;

    public C32511eA(int i, long j, List list) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 2, this.A00);
        AnonymousClass088.A1I(parcel, 3, this.A01);
        AnonymousClass088.A1O(parcel, 4, this.A02, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
