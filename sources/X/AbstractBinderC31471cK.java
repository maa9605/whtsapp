package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1cK */
/* loaded from: classes.dex */
public abstract class AbstractBinderC31471cK extends BinderC233616i implements InterfaceC233916l {
    @Override // X.BinderC233616i
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                C233716j.A00(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 2:
                C233716j.A00(parcel, Status.CREATOR);
                C233716j.A00(parcel, C1A7.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                C233716j.A00(parcel, Status.CREATOR);
                C233716j.A00(parcel, C1AB.CREATOR);
                throw new UnsupportedOperationException();
            case 4:
                AXB();
                return true;
            case 5:
                AKD((Status) C233716j.A00(parcel, Status.CREATOR));
                return true;
            case 6:
                AX0(parcel.createByteArray());
                return true;
            case 7:
                C233716j.A00(parcel, C30381aQ.CREATOR);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
