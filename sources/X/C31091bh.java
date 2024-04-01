package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.1bh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31091bh extends C234116n implements C15S {
    public C31091bh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    @Override // X.C15S
    public final void AWO(C15R c15r) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (c15r == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(c15r.asBinder());
        }
        try {
            this.A00.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
