package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.1dI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32001dI extends C234116n implements InterfaceC239318v {
    public C32001dI(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // X.InterfaceC239318v
    public final void AWM(IAccountAccessor iAccountAccessor, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (iAccountAccessor == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(iAccountAccessor.asBinder());
        }
        obtain.writeInt(i);
        obtain.writeInt(z ? 1 : 0);
        A00(9, obtain);
    }

    @Override // X.InterfaceC239318v
    public final void AWR(C32011dJ c32011dJ, InterfaceC239218u interfaceC239218u) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (c32011dJ == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            c32011dJ.writeToParcel(obtain, 0);
        }
        if (interfaceC239218u == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(interfaceC239218u.asBinder());
        }
        A00(12, obtain);
    }

    @Override // X.InterfaceC239318v
    public final void AWY(int i) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        obtain.writeInt(i);
        A00(7, obtain);
    }
}
