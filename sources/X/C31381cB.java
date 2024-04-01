package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.1cB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31381cB implements IInterface, C16S {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public C31381cB(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final Parcel A00(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.A00.transact(i, parcel, obtain, 0);
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

    @Override // X.C16S
    public final boolean AX7(boolean z) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        obtain.writeInt(1);
        Parcel A00 = A00(2, obtain);
        boolean z2 = A00.readInt() != 0;
        A00.recycle();
        return z2;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.A00;
    }

    @Override // X.C16S
    public final String getId() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel A00 = A00(1, obtain);
        String readString = A00.readString();
        A00.recycle();
        return readString;
    }
}
