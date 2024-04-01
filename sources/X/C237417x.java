package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.17x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C237417x implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C237417x(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public final Parcel A00(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.A00.transact(1, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.A00;
    }
}
