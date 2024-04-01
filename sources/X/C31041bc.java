package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.1bc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C31041bc extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.15V
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            IBinder iBinder = null;
            C30451ab c30451ab = null;
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 == 2) {
                    iBinder = C07K.A0U(parcel, readInt);
                } else if (i2 == 3) {
                    c30451ab = (C30451ab) C07K.A0W(parcel, readInt, C30451ab.CREATOR);
                } else if (i2 == 4) {
                    z = C07K.A1i(parcel, readInt);
                } else if (i2 != 5) {
                    C07K.A1H(parcel, readInt);
                } else {
                    z2 = C07K.A1i(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31041bc(i, iBinder, c30451ab, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31041bc[i];
        }
    };
    public IBinder A00;
    public C30451ab A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public C31041bc(int i, IBinder iBinder, C30451ab c30451ab, boolean z, boolean z2) {
        this.A04 = i;
        this.A00 = iBinder;
        this.A01 = c30451ab;
        this.A02 = z;
        this.A03 = z2;
    }

    public IAccountAccessor A00() {
        IBinder iBinder = this.A00;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof IAccountAccessor) {
            return (IAccountAccessor) queryLocalInterface;
        }
        return new C31011bZ(iBinder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C31041bc) {
            C31041bc c31041bc = (C31041bc) obj;
            return this.A01.equals(c31041bc.A01) && A00().equals(c31041bc.A00());
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A04);
        AnonymousClass088.A1K(parcel, 2, this.A00);
        AnonymousClass088.A1L(parcel, 3, this.A01, i, false);
        AnonymousClass088.A1P(parcel, 4, this.A02);
        AnonymousClass088.A1P(parcel, 5, this.A03);
        AnonymousClass088.A1D(parcel, A03);
    }
}
