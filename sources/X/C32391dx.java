package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1dx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32391dx extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19r
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            C32451e4 c32451e4 = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 2) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    c32451e4 = (C32451e4) C07K.A0W(parcel, readInt, C32451e4.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32391dx(i, c32451e4);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32391dx[i];
        }
    };
    public final int A00;
    public final C32451e4 A01;

    public C32391dx(int i, C32451e4 c32451e4) {
        this.A00 = i;
        this.A01 = c32451e4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 2, this.A00);
        AnonymousClass088.A1L(parcel, 3, this.A01, i, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}