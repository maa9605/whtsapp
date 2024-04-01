package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;

/* renamed from: X.1d5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31871d5 extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18i
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            LatLng latLng = null;
            String str = null;
            String str2 = null;
            IBinder iBinder = null;
            float f = 0.0f;
            float f2 = 0.0f;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            float f3 = 0.0f;
            float f4 = 0.5f;
            float f5 = 0.0f;
            float f6 = 1.0f;
            float f7 = 0.0f;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 2:
                        latLng = (LatLng) C07K.A0W(parcel, readInt, LatLng.CREATOR);
                        break;
                    case 3:
                        str = C07K.A0u(parcel, readInt);
                        break;
                    case 4:
                        str2 = C07K.A0u(parcel, readInt);
                        break;
                    case 5:
                        iBinder = C07K.A0U(parcel, readInt);
                        break;
                    case 6:
                        f = C07K.A03(parcel, readInt);
                        break;
                    case 7:
                        f2 = C07K.A03(parcel, readInt);
                        break;
                    case 8:
                        z = C07K.A1i(parcel, readInt);
                        break;
                    case 9:
                        z2 = C07K.A1i(parcel, readInt);
                        break;
                    case 10:
                        z3 = C07K.A1i(parcel, readInt);
                        break;
                    case GoogleMigrateImporterActivity.A0E /* 11 */:
                        f3 = C07K.A03(parcel, readInt);
                        break;
                    case 12:
                        f4 = C07K.A03(parcel, readInt);
                        break;
                    case 13:
                        f5 = C07K.A03(parcel, readInt);
                        break;
                    case 14:
                        f6 = C07K.A03(parcel, readInt);
                        break;
                    case 15:
                        f7 = C07K.A03(parcel, readInt);
                        break;
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new C31871d5(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31871d5[i];
        }
    };
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public C019609c A07;
    public LatLng A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;

    public C31871d5() {
        this.A02 = 0.5f;
        this.A03 = 1.0f;
        this.A0B = true;
        this.A0D = false;
        this.A04 = 0.0f;
        this.A05 = 0.5f;
        this.A06 = 0.0f;
        this.A00 = 1.0f;
    }

    public C31871d5(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.A02 = 0.5f;
        this.A03 = 1.0f;
        this.A0B = true;
        this.A0D = false;
        this.A04 = 0.0f;
        this.A05 = 0.5f;
        this.A06 = 0.0f;
        this.A00 = 1.0f;
        this.A08 = latLng;
        this.A09 = str;
        this.A0A = str2;
        if (iBinder == null) {
            this.A07 = null;
        } else {
            this.A07 = new C019609c(BinderC06200Rx.A01(iBinder));
        }
        this.A02 = f;
        this.A03 = f2;
        this.A0C = z;
        this.A0B = z2;
        this.A0D = z3;
        this.A04 = f3;
        this.A05 = f4;
        this.A06 = f5;
        this.A00 = f6;
        this.A01 = f7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1L(parcel, 2, this.A08, i, false);
        AnonymousClass088.A1M(parcel, 3, this.A09, false);
        AnonymousClass088.A1M(parcel, 4, this.A0A, false);
        C019609c c019609c = this.A07;
        AnonymousClass088.A1K(parcel, 5, c019609c == null ? null : c019609c.A00.asBinder());
        AnonymousClass088.A1F(parcel, 6, this.A02);
        AnonymousClass088.A1F(parcel, 7, this.A03);
        AnonymousClass088.A1P(parcel, 8, this.A0C);
        AnonymousClass088.A1P(parcel, 9, this.A0B);
        AnonymousClass088.A1P(parcel, 10, this.A0D);
        AnonymousClass088.A1F(parcel, 11, this.A04);
        AnonymousClass088.A1F(parcel, 12, this.A05);
        AnonymousClass088.A1F(parcel, 13, this.A06);
        AnonymousClass088.A1F(parcel, 14, this.A00);
        AnonymousClass088.A1F(parcel, 15, this.A01);
        AnonymousClass088.A1D(parcel, A03);
    }
}
