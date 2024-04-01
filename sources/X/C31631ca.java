package X;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1ca  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31631ca extends C235417d implements InterfaceC235717g {
    public C31631ca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // X.InterfaceC235717g
    public final Location AWc(String str) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        obtain.writeString(str);
        obtain = Parcel.obtain();
        try {
            this.A00.transact(21, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Location) (obtain.readInt() == 0 ? null : (Parcelable) Location.CREATOR.createFromParcel(obtain));
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC235717g
    public final void AWv(C31661cd c31661cd) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (c31661cd == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            c31661cd.writeToParcel(obtain, 0);
        }
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(59, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
