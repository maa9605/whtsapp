package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.IResultReceiver;

/* renamed from: X.1ng  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class BinderC38181ng extends Binder implements IResultReceiver {
    public final /* synthetic */ C10380fx A00;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public BinderC38181ng(C10380fx c10380fx) {
        this.A00 = c10380fx;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    public void A00(int i, Bundle bundle) {
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
        parcel.enforceInterface("android.support.v4.os.IResultReceiver");
        parcel.readInt();
        if (parcel.readInt() != 0) {
            Bundle.CREATOR.createFromParcel(parcel);
        }
        return true;
    }
}
