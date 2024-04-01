package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.1cA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31371cA implements IInterface, C16Q {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.flags.IFlagProvider";

    public C31371cA(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.A00;
    }
}
