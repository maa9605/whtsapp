package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1bx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31251bx extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.15j
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            C31211bt c31211bt = null;
            int i = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i2 != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    c31211bt = (C31211bt) C07K.A0W(parcel, readInt, C31211bt.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31251bx(i, str, c31211bt);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31251bx[i];
        }
    };
    public final int A00;
    public final C31211bt A01;
    public final String A02;

    public C31251bx(int i, String str, C31211bt c31211bt) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = c31211bt;
    }

    public C31251bx(String str, C31211bt c31211bt) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = c31211bt;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        AnonymousClass088.A1M(parcel, 2, this.A02, false);
        AnonymousClass088.A1L(parcel, 3, this.A01, i, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
