package X;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.1bZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31011bZ extends C16r implements IAccountAccessor {
    public C31011bZ(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account A8F() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        Parcel A00 = A00(2, obtain);
        Account account = (Account) (A00.readInt() == 0 ? null : (Parcelable) Account.CREATOR.createFromParcel(A00));
        A00.recycle();
        return account;
    }
}
