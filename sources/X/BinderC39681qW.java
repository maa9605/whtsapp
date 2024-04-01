package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.1qW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39681qW extends BinderC234216o implements C15R {
    public final C0NK A00;

    public BinderC39681qW(C0NK c0nk) {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
        this.A00 = c0nk;
    }

    @Override // X.BinderC234216o
    public boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            ((BasePendingResult) this.A00).A07(new Status(1, readInt, null, null));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
