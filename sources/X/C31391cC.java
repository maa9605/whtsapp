package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.1cC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31391cC implements IInterface, C16V {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    public C31391cC(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // X.C16V
    public final void AWr(C16W c16w) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        obtain.writeStrongBinder(c16w == null ? null : c16w.asBinder());
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.A00;
    }
}
