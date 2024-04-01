package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.1e0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32421e0 extends AnonymousClass181 implements InterfaceC241819u {
    public C32421e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    @Override // X.InterfaceC241819u
    public final void AX9(InterfaceC241619s interfaceC241619s) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (interfaceC241619s == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(interfaceC241619s.asBinder());
        }
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
