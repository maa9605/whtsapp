package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.1ck  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31711ck implements IInterface, InterfaceC237317w {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.safetynet.internal.ISafetyNetService";

    public C31711ck(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final void A00(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.A00.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC237317w
    public final void AWw(InterfaceC237217v interfaceC237217v, byte[] bArr, String str) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
        obtain.writeStrongBinder(interfaceC237217v == null ? null : interfaceC237217v.asBinder());
        obtain.writeByteArray(bArr);
        obtain.writeString(str);
        A00(7, obtain);
    }

    @Override // X.InterfaceC237317w
    public final void AXC(InterfaceC237217v interfaceC237217v) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
        obtain.writeStrongBinder(interfaceC237217v == null ? null : interfaceC237217v.asBinder());
        A00(5, obtain);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.A00;
    }
}
