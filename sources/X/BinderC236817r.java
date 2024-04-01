package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.17r  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class BinderC236817r extends Binder implements IInterface {
    public BinderC236817r(String str) {
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
