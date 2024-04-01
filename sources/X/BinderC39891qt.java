package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.1qt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39891qt extends BinderC235917i implements InterfaceC235617f {
    public final C0NK A00;

    public BinderC39891qt(C0NK c0nk) {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        this.A00 = c0nk;
    }

    @Override // X.BinderC235917i
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ((BasePendingResult) this.A00).A07(((C31611cY) (parcel.readInt() == 0 ? null : (Parcelable) C31611cY.CREATOR.createFromParcel(parcel))).A00);
            return true;
        }
        return false;
    }
}
