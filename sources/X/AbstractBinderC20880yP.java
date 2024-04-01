package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.0yP  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC20880yP extends Binder implements IInterface {
    public static InterfaceC20890yR globalInterceptor;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public abstract boolean dispatchTransaction(int code, Parcel data, Parcel reply, int flags);

    public AbstractBinderC20880yP(String descriptor) {
        attachInterface(this, descriptor);
    }

    public static synchronized void installTransactionInterceptorPackagePrivate(InterfaceC20890yR interceptor) {
        synchronized (AbstractBinderC20880yP.class) {
            if (interceptor != null) {
                globalInterceptor = interceptor;
            } else {
                throw new IllegalArgumentException("null interceptor");
            }
        }
    }

    @Override // android.os.Binder
    public boolean onTransact(int code, Parcel data, Parcel reply, int flags) {
        if (routeToSuperOrEnforceInterface(code, data, reply, flags)) {
            return true;
        }
        return dispatchTransaction(code, data, reply, flags);
    }

    public boolean routeToSuperOrEnforceInterface(int code, Parcel data, Parcel reply, int flags) {
        if (code > 16777215) {
            return super.onTransact(code, data, reply, flags);
        }
        data.enforceInterface(getInterfaceDescriptor());
        return false;
    }
}
