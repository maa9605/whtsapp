package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.1dY  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32161dY extends C237417x implements C19P {
    public C32161dY(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    @Override // X.C19P
    public final C19O AWl(IObjectWrapper iObjectWrapper, C32141dW c32141dW) {
        C19O c32151dX;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        obtain.writeStrongBinder(iObjectWrapper == null ? null : iObjectWrapper.asBinder());
        if (c32141dW == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            c32141dW.writeToParcel(obtain, 0);
        }
        Parcel A00 = A00(obtain);
        IBinder readStrongBinder = A00.readStrongBinder();
        if (readStrongBinder == null) {
            c32151dX = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            c32151dX = queryLocalInterface instanceof C19O ? (C19O) queryLocalInterface : new C32151dX(readStrongBinder);
        }
        A00.recycle();
        return c32151dX;
    }
}
