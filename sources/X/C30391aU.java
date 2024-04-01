package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1aU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30391aU extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.13V
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            Bundle bundle = null;
            int i2 = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i3 = 65535 & readInt;
                if (i3 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i3 == 2) {
                    i2 = C07K.A0A(parcel, readInt);
                } else if (i3 != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    bundle = C07K.A0T(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C30391aU(i, i2, bundle);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C30391aU[i];
        }
    };
    public int A00;
    public Bundle A01;
    public final int A02;

    public C30391aU(int i, int i2, Bundle bundle) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A02);
        AnonymousClass088.A1G(parcel, 2, this.A00);
        AnonymousClass088.A1J(parcel, 3, this.A01);
        AnonymousClass088.A1D(parcel, A03);
    }
}
