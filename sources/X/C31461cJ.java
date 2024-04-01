package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.1cJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31461cJ extends C233016b implements InterfaceC233816k {
    public C31461cJ(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // X.InterfaceC233816k
    public final Bundle AWd(Account account, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C233716j.A01(obtain, account);
        obtain.writeString(str);
        C233716j.A01(obtain, bundle);
        Parcel A00 = A00(5, obtain);
        Bundle bundle2 = (Bundle) C233716j.A00(A00, Bundle.CREATOR);
        A00.recycle();
        return bundle2;
    }

    @Override // X.InterfaceC233816k
    public final Bundle AWe(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        obtain.writeString(str);
        C233716j.A01(obtain, bundle);
        Parcel A00 = A00(2, obtain);
        Bundle bundle2 = (Bundle) C233716j.A00(A00, Bundle.CREATOR);
        A00.recycle();
        return bundle2;
    }
}
