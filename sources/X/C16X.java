package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.16X  reason: invalid class name */
/* loaded from: classes.dex */
public class C16X implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C16X(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.A00;
    }
}
