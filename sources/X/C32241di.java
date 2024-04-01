package X;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1di */
/* loaded from: classes.dex */
public final class C32241di extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19n
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            IBinder iBinder = null;
            IntentFilter[] intentFilterArr = null;
            String str = null;
            String str2 = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    iBinder = C07K.A0U(parcel, readInt);
                } else if (i == 3) {
                    intentFilterArr = (IntentFilter[]) C07K.A1r(parcel, readInt, IntentFilter.CREATOR);
                } else if (i == 4) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i != 5) {
                    C07K.A1H(parcel, readInt);
                } else {
                    str2 = C07K.A0u(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32241di(iBinder, intentFilterArr, str, str2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32241di[i];
        }
    };
    public final InterfaceC241719t A00;
    public final String A01;
    public final String A02;
    public final IntentFilter[] A03;

    public C32241di() {
        this.A00 = null;
        throw null;
    }

    public C32241di(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        InterfaceC241719t c32411dz;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (queryLocalInterface instanceof InterfaceC241719t) {
                c32411dz = (InterfaceC241719t) queryLocalInterface;
            } else {
                c32411dz = new C32411dz(iBinder);
            }
            this.A00 = c32411dz;
        } else {
            this.A00 = null;
        }
        this.A03 = intentFilterArr;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        InterfaceC241719t interfaceC241719t = this.A00;
        AnonymousClass088.A1K(parcel, 2, interfaceC241719t == null ? null : interfaceC241719t.asBinder());
        AnonymousClass088.A1R(parcel, 3, this.A03, i);
        AnonymousClass088.A1M(parcel, 4, this.A01, false);
        AnonymousClass088.A1M(parcel, 5, this.A02, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
