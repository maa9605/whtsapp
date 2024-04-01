package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1dU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32121dU extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19Q
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32121dU[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            float f = 0.0f;
            float f2 = 0.0f;
            int i = 0;
            int i2 = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i3 = 65535 & readInt;
                if (i3 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i3 == 2) {
                    f = C07K.A03(parcel, readInt);
                } else if (i3 == 3) {
                    f2 = C07K.A03(parcel, readInt);
                } else if (i3 != 4) {
                    C07K.A1H(parcel, readInt);
                } else {
                    i2 = C07K.A0A(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32121dU(i, f, f2, i2);
        }
    };
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public C32121dU(int i, float f, float f2, int i2) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A03);
        AnonymousClass088.A1F(parcel, 2, this.A00);
        AnonymousClass088.A1F(parcel, 3, this.A01);
        AnonymousClass088.A1G(parcel, 4, this.A02);
        AnonymousClass088.A1D(parcel, A03);
    }
}
