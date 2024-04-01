package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1dW */
/* loaded from: classes.dex */
public final class C32141dW extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19N
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32141dW[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            boolean z2 = false;
            float f = -1.0f;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 2:
                        i = C07K.A0A(parcel, readInt);
                        break;
                    case 3:
                        i2 = C07K.A0A(parcel, readInt);
                        break;
                    case 4:
                        i3 = C07K.A0A(parcel, readInt);
                        break;
                    case 5:
                        z = C07K.A1i(parcel, readInt);
                        break;
                    case 6:
                        z2 = C07K.A1i(parcel, readInt);
                        break;
                    case 7:
                        f = C07K.A03(parcel, readInt);
                        break;
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new C32141dW(i, i2, i3, z, z2, f);
        }
    };
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    public C32141dW() {
    }

    public C32141dW(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 2, this.A01);
        AnonymousClass088.A1G(parcel, 3, this.A02);
        AnonymousClass088.A1G(parcel, 4, this.A03);
        AnonymousClass088.A1P(parcel, 5, this.A04);
        AnonymousClass088.A1P(parcel, 6, this.A05);
        AnonymousClass088.A1F(parcel, 7, this.A00);
        AnonymousClass088.A1D(parcel, A03);
    }
}
