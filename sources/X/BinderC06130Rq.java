package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.0Rq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class BinderC06130Rq extends Binder implements IInterface {
    public BinderC06130Rq(String str) {
        attachInterface(this, str);
    }

    public boolean A01(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
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
        return A01(i, parcel, parcel2, i2);
    }
}
