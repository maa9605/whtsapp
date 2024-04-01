package X;

import android.os.Parcel;

/* renamed from: X.1qH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39531qH extends BinderC236817r implements C18b {
    public final /* synthetic */ C18G A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC39531qH(C18G c18g) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
        this.A00 = c18g;
    }

    @Override // X.BinderC236817r
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            this.A00.AIA();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
