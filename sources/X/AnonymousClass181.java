package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.181  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass181 implements IInterface {
    public final IBinder A00;
    public final String A01;

    public AnonymousClass181(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.A00;
    }
}
