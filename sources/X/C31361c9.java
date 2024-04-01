package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.1c9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31361c9 extends C16r implements C16J {
    public C31361c9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // X.C16J
    public final IObjectWrapper AWi(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C234516s.A00(obtain, iObjectWrapper);
        obtain.writeString(str);
        obtain.writeInt(i);
        C234516s.A00(obtain, iObjectWrapper2);
        Parcel A00 = A00(2, obtain);
        IObjectWrapper A01 = BinderC06200Rx.A01(A00.readStrongBinder());
        A00.recycle();
        return A01;
    }

    @Override // X.C16J
    public final IObjectWrapper AX5(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C234516s.A00(obtain, iObjectWrapper);
        obtain.writeString(str);
        obtain.writeInt(i);
        C234516s.A00(obtain, iObjectWrapper2);
        Parcel A00 = A00(3, obtain);
        IObjectWrapper A01 = BinderC06200Rx.A01(A00.readStrongBinder());
        A00.recycle();
        return A01;
    }
}
