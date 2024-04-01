package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.IGmsCallbacks;

/* renamed from: X.1qR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39631qR extends BinderC06130Rq implements IGmsCallbacks {
    public AbstractC229914u A00;
    public final int A01;

    public BinderC39631qR(AbstractC229914u abstractC229914u, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.A00 = abstractC229914u;
        this.A01 = i;
    }

    @Override // X.BinderC06130Rq
    public final boolean A01(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Parcelable parcelable = parcel.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcel);
            C07K.A1Q(this.A00, "onPostInitComplete can be called only once per call to getRemoteService");
            this.A00.A07(readInt, readStrongBinder, (Bundle) parcelable, this.A01);
            this.A00 = null;
        } else if (i == 2) {
            parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                creator.createFromParcel(parcel);
            }
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i != 3) {
            return false;
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            C31151bn c31151bn = (C31151bn) (parcel.readInt() == 0 ? null : (Parcelable) C31151bn.CREATOR.createFromParcel(parcel));
            C07K.A1Q(this.A00, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C07K.A1P(c31151bn);
            this.A00.A0O = c31151bn;
            Bundle bundle = c31151bn.A00;
            C07K.A1Q(this.A00, "onPostInitComplete can be called only once per call to getRemoteService");
            this.A00.A07(readInt2, readStrongBinder2, bundle, this.A01);
            this.A00 = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
