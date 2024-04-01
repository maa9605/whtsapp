package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.1c8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31351c8 extends C16r implements C16I {
    public C31351c8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // X.C16I
    public final int AWb(IObjectWrapper iObjectWrapper, String str, boolean z) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C234516s.A00(obtain, iObjectWrapper);
        obtain.writeString(str);
        obtain.writeInt(z ? 1 : 0);
        Parcel A00 = A00(3, obtain);
        int readInt = A00.readInt();
        A00.recycle();
        return readInt;
    }

    @Override // X.C16I
    public final IObjectWrapper AWh(IObjectWrapper iObjectWrapper, String str, int i) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C234516s.A00(obtain, iObjectWrapper);
        obtain.writeString(str);
        obtain.writeInt(i);
        Parcel A00 = A00(2, obtain);
        IObjectWrapper A01 = BinderC06200Rx.A01(A00.readStrongBinder());
        A00.recycle();
        return A01;
    }

    @Override // X.C16I
    public final int AX1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        Parcel A00 = A00(6, obtain);
        int readInt = A00.readInt();
        A00.recycle();
        return readInt;
    }

    @Override // X.C16I
    public final int AX2(IObjectWrapper iObjectWrapper, String str, boolean z) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C234516s.A00(obtain, iObjectWrapper);
        obtain.writeString(str);
        obtain.writeInt(z ? 1 : 0);
        Parcel A00 = A00(5, obtain);
        int readInt = A00.readInt();
        A00.recycle();
        return readInt;
    }

    @Override // X.C16I
    public final IObjectWrapper AX4(IObjectWrapper iObjectWrapper, String str, int i) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C234516s.A00(obtain, iObjectWrapper);
        obtain.writeString(str);
        obtain.writeInt(i);
        Parcel A00 = A00(4, obtain);
        IObjectWrapper A01 = BinderC06200Rx.A01(A00.readStrongBinder());
        A00.recycle();
        return A01;
    }
}
