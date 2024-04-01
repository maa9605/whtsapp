package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.0yO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20870yO implements IInterface {
    public final String mDescriptor;
    public final IBinder mRemote;

    public AbstractC20870yO(IBinder remote, String descriptor) {
        this.mRemote = remote;
        this.mDescriptor = descriptor;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.mRemote;
    }

    public Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.mDescriptor);
        return obtain;
    }

    public Parcel transactAndReadException(int code, Parcel in) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.mRemote.transact(code, in, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            in.recycle();
        }
    }

    public void transactAndReadExceptionReturnVoid(int code, Parcel in) {
        Parcel obtain = Parcel.obtain();
        try {
            this.mRemote.transact(code, in, obtain, 0);
            obtain.readException();
        } finally {
            in.recycle();
            obtain.recycle();
        }
    }

    public void transactOneway(int code, Parcel in) {
        try {
            this.mRemote.transact(code, in, null, 1);
        } finally {
            in.recycle();
        }
    }
}
