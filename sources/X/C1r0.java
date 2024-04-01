package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

/* renamed from: X.1r0  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1r0 extends BinderC236817r implements C18U {
    public final /* synthetic */ C18L A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1r0(C18L c18l) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
        this.A00 = c18l;
    }

    @Override // X.BinderC236817r
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        IGoogleMapDelegate c31841d2;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c31841d2 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (queryLocalInterface instanceof IGoogleMapDelegate) {
                    c31841d2 = (IGoogleMapDelegate) queryLocalInterface;
                } else {
                    c31841d2 = new C31841d2(readStrongBinder);
                }
            }
            this.A00.ALk(new C0S8(c31841d2));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
