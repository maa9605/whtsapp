package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1qc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39721qc extends C16T implements C16W {
    public final /* synthetic */ C39711qb A00;

    public BinderC39721qc(C39711qb c39711qb) {
        this.A00 = c39711qb;
    }

    @Override // X.C16T
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Status status = (Status) (parcel.readInt() == 0 ? null : (Parcelable) Status.CREATOR.createFromParcel(parcel));
            C0NR c0nr = this.A00.A00;
            if (status.A01 <= 0) {
                c0nr.A00.A09(null);
                return true;
            }
            c0nr.A00.A08(new C08K(status));
            return true;
        }
        return false;
    }
}
