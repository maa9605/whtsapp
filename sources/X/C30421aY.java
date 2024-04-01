package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: X.1aY  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30421aY extends C16X implements C13Z {
    public C30421aY(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // X.C13Z
    public final void AXE(C13Y c13y, GoogleSignInOptions googleSignInOptions) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (c13y == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(c13y.asBinder());
        }
        if (googleSignInOptions == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            googleSignInOptions.writeToParcel(obtain, 0);
        }
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(103, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
