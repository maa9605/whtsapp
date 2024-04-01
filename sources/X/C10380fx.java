package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver;

/* renamed from: X.0fx */
/* loaded from: classes.dex */
public class C10380fx implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C10370fw();
    public IResultReceiver A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C10380fx(Parcel parcel) {
        IResultReceiver c28251Rb;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c28251Rb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IResultReceiver)) {
                c28251Rb = (IResultReceiver) queryLocalInterface;
            } else {
                c28251Rb = new C28251Rb(readStrongBinder);
            }
        }
        this.A00 = c28251Rb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            IResultReceiver iResultReceiver = this.A00;
            if (iResultReceiver == null) {
                iResultReceiver = new BinderC38181ng(this);
                this.A00 = iResultReceiver;
            }
            parcel.writeStrongBinder(iResultReceiver.asBinder());
        }
    }
}
