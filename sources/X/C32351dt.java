package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.1dt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32351dt extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19m
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            ConnectionConfiguration[] connectionConfigurationArr = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 2) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    connectionConfigurationArr = (ConnectionConfiguration[]) C07K.A1r(parcel, readInt, ConnectionConfiguration.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32351dt(i, connectionConfigurationArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32351dt[i];
        }
    };
    public final int A00;
    public final ConnectionConfiguration[] A01;

    public C32351dt(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.A00 = i;
        this.A01 = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 2, this.A00);
        AnonymousClass088.A1R(parcel, 3, this.A01, i);
        AnonymousClass088.A1D(parcel, A03);
    }
}
