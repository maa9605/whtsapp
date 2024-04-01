package X;

import android.os.Parcel;

/* renamed from: X.1r1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39961r1 extends BinderC236817r implements C18V {
    public final /* synthetic */ C18K A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC39961r1(C18K c18k) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        this.A00 = c18k;
    }

    @Override // X.BinderC236817r
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            boolean ALm = this.A00.ALm(new C0SL(AbstractBinderC31681ch.A00(parcel.readStrongBinder())));
            parcel2.writeNoException();
            parcel2.writeInt(ALm ? 1 : 0);
            return true;
        }
        return false;
    }
}
