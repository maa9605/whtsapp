package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.1dX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32151dX extends C237417x implements C19O {
    public C32151dX(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    @Override // X.C19O
    public final C32111dT[] AXA(IObjectWrapper iObjectWrapper, C31731cm c31731cm) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        obtain.writeStrongBinder(iObjectWrapper == null ? null : iObjectWrapper.asBinder());
        if (c31731cm == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            c31731cm.writeToParcel(obtain, 0);
        }
        Parcel A00 = A00(obtain);
        C32111dT[] c32111dTArr = (C32111dT[]) A00.createTypedArray(C32111dT.CREATOR);
        A00.recycle();
        return c32111dTArr;
    }

    @Override // X.C19O
    public final void AXL() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
