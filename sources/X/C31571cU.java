package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

/* renamed from: X.1cU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31571cU implements IInterface, C17Q {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.analytics.internal.IAnalyticsService";

    public C31571cU(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // X.C17Q
    public final void AWz(Map map, long j, String str, List list) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
        obtain.writeMap(map);
        obtain.writeLong(j);
        obtain.writeString(str);
        obtain.writeTypedList(list);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.A00;
    }
}
