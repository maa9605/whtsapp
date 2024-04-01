package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1cj */
/* loaded from: classes.dex */
public abstract class AbstractBinderC31701cj extends BinderC237017t implements InterfaceC237217v {
    @Override // X.BinderC237017t
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            AWo((Status) C237117u.A00(parcel, Status.CREATOR), (C31931dB) C237117u.A00(parcel, C31931dB.CREATOR));
            return true;
        } else if (i == 2) {
            parcel.readString();
            throw new UnsupportedOperationException();
        } else if (i == 3) {
            C237117u.A00(parcel, Status.CREATOR);
            C237117u.A00(parcel, C31901d8.CREATOR);
            throw new UnsupportedOperationException();
        } else if (i == 4) {
            C237117u.A00(parcel, Status.CREATOR);
            parcel.readInt();
            throw new UnsupportedOperationException();
        } else if (i == 6) {
            C237117u.A00(parcel, Status.CREATOR);
            C237117u.A00(parcel, C31951dD.CREATOR);
            throw new UnsupportedOperationException();
        } else if (i == 8) {
            AWp((Status) C237117u.A00(parcel, Status.CREATOR), (C31941dC) C237117u.A00(parcel, C31941dC.CREATOR));
            return true;
        } else if (i == 15) {
            C237117u.A00(parcel, Status.CREATOR);
            C237117u.A00(parcel, C31961dE.CREATOR);
            throw new UnsupportedOperationException();
        } else if (i == 10) {
            C237117u.A00(parcel, Status.CREATOR);
            parcel.readInt();
            throw new UnsupportedOperationException();
        } else if (i != 11) {
            return false;
        } else {
            C237117u.A00(parcel, Status.CREATOR);
            throw new UnsupportedOperationException();
        }
    }
}
