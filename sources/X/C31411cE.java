package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.1cE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31411cE extends C233016b implements InterfaceC234016m {
    public C31411cE(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    @Override // X.InterfaceC234016m
    public final void AWs(InterfaceC233916l interfaceC233916l, C31421cF c31421cF) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (interfaceC233916l == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(interfaceC233916l.asBinder());
        }
        C233716j.A01(obtain, c31421cF);
        A01(9, obtain);
    }

    @Override // X.InterfaceC234016m
    public final void AWt(InterfaceC233916l interfaceC233916l, C31431cG c31431cG) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (interfaceC233916l == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(interfaceC233916l.asBinder());
        }
        C233716j.A01(obtain, c31431cG);
        A01(6, obtain);
    }

    @Override // X.InterfaceC234016m
    public final void AWu(InterfaceC233916l interfaceC233916l, C31441cH c31441cH) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (interfaceC233916l == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(interfaceC233916l.asBinder());
        }
        C233716j.A01(obtain, c31441cH);
        A01(5, obtain);
    }
}
