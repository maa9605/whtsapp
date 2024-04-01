package X;

import android.os.IBinder;
import android.support.v4.os.IResultReceiver;

/* renamed from: X.1Rb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28251Rb implements IResultReceiver {
    public IBinder A00;

    public C28251Rb(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.A00;
    }
}
