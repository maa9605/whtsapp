package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1cm */
/* loaded from: classes.dex */
public final class C31731cm extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.180
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31731cm[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            long j = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i5 = 65535 & readInt;
                if (i5 == 2) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i5 == 3) {
                    i2 = C07K.A0A(parcel, readInt);
                } else if (i5 == 4) {
                    i3 = C07K.A0A(parcel, readInt);
                } else if (i5 == 5) {
                    j = C07K.A0N(parcel, readInt);
                } else if (i5 != 6) {
                    C07K.A1H(parcel, readInt);
                } else {
                    i4 = C07K.A0A(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31731cm(i, i2, i3, j, i4);
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    public C31731cm() {
    }

    public C31731cm(int i, int i2, int i3, long j, int i4) {
        this.A03 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = j;
        this.A02 = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 2, this.A03);
        AnonymousClass088.A1G(parcel, 3, this.A00);
        AnonymousClass088.A1G(parcel, 4, this.A01);
        AnonymousClass088.A1I(parcel, 5, this.A04);
        AnonymousClass088.A1G(parcel, 6, this.A02);
        AnonymousClass088.A1D(parcel, A03);
    }
}
