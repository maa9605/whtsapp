package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;

/* renamed from: X.1dT */
/* loaded from: classes.dex */
public class C32111dT extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19M
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32111dT[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            C32121dU[] c32121dUArr = null;
            int i = 0;
            int i2 = 0;
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 1:
                        i = C07K.A0A(parcel, readInt);
                        break;
                    case 2:
                        i2 = C07K.A0A(parcel, readInt);
                        break;
                    case 3:
                        f = C07K.A03(parcel, readInt);
                        break;
                    case 4:
                        f2 = C07K.A03(parcel, readInt);
                        break;
                    case 5:
                        f3 = C07K.A03(parcel, readInt);
                        break;
                    case 6:
                        f4 = C07K.A03(parcel, readInt);
                        break;
                    case 7:
                        f5 = C07K.A03(parcel, readInt);
                        break;
                    case 8:
                        f6 = C07K.A03(parcel, readInt);
                        break;
                    case 9:
                        c32121dUArr = (C32121dU[]) C07K.A1r(parcel, readInt, C32121dU.CREATOR);
                        break;
                    case 10:
                        f7 = C07K.A03(parcel, readInt);
                        break;
                    case GoogleMigrateImporterActivity.A0E /* 11 */:
                        f8 = C07K.A03(parcel, readInt);
                        break;
                    case 12:
                        f9 = C07K.A03(parcel, readInt);
                        break;
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new C32111dT(i, i2, f, f2, f3, f4, f5, f6, c32121dUArr, f7, f8, f9);
        }
    };
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final C32121dU[] A0B;

    public C32111dT(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, C32121dU[] c32121dUArr, float f7, float f8, float f9) {
        this.A0A = i;
        this.A09 = i2;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A07 = f5;
        this.A08 = f6;
        this.A0B = c32121dUArr;
        this.A04 = f7;
        this.A05 = f8;
        this.A06 = f9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A0A);
        AnonymousClass088.A1G(parcel, 2, this.A09);
        AnonymousClass088.A1F(parcel, 3, this.A00);
        AnonymousClass088.A1F(parcel, 4, this.A01);
        AnonymousClass088.A1F(parcel, 5, this.A03);
        AnonymousClass088.A1F(parcel, 6, this.A02);
        AnonymousClass088.A1F(parcel, 7, this.A07);
        AnonymousClass088.A1F(parcel, 8, this.A08);
        AnonymousClass088.A1R(parcel, 9, this.A0B, i);
        AnonymousClass088.A1F(parcel, 10, this.A04);
        AnonymousClass088.A1F(parcel, 11, this.A05);
        AnonymousClass088.A1F(parcel, 12, this.A06);
        AnonymousClass088.A1D(parcel, A03);
    }
}
