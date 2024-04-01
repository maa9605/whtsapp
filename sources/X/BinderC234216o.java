package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.16o  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class BinderC234216o extends Binder implements IInterface {
    public BinderC234216o(String str) {
        attachInterface(this, str);
    }

    public boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return A00(i, parcel, parcel2, i2);
    }
}
