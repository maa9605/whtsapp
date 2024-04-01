package X;

import android.os.Parcel;

/* renamed from: X.1r2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39971r2 extends BinderC236817r implements C18S {
    public final /* synthetic */ C18I A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC39971r2(C18I c18i) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        this.A00 = c18i;
    }

    @Override // X.BinderC236817r
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            this.A00.AL4(new C0SL(AbstractBinderC31681ch.A00(parcel.readStrongBinder())));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
