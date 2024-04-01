package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.1CR  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CR implements IInterface {
    public final IBinder A00;

    public C1CR(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.A00;
    }
}
