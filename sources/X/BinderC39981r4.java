package X;

import android.os.Parcel;

/* renamed from: X.1r4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39981r4 extends BinderC236817r implements InterfaceC237818c {
    public final /* synthetic */ C18H A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC39981r4(C18H c18h) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
        this.A00 = c18h;
    }

    @Override // X.BinderC236817r
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            this.A00.AIC(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
