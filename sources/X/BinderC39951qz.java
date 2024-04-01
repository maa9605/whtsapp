package X;

import android.os.Parcel;

/* renamed from: X.1qz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39951qz extends BinderC236817r implements C18Y {
    public final C18E A00;

    public BinderC39951qz(C18E c18e) {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
        this.A00 = c18e;
    }

    @Override // X.BinderC236817r
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            this.A00.AKU();
        } else if (i != 2) {
            return false;
        } else {
            this.A00.AID();
        }
        parcel2.writeNoException();
        return true;
    }
}
