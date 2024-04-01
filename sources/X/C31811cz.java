package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1cz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31811cz extends C236717q implements IProjectionDelegate {
    public C31811cz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final LatLng A86(IObjectWrapper iObjectWrapper) {
        Parcel A00 = A00();
        C236917s.A01(A00, iObjectWrapper);
        Parcel A01 = A01(1, A00);
        LatLng latLng = (LatLng) C236917s.A00(A01, LatLng.CREATOR);
        A01.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final C31881d6 ADx() {
        Parcel A01 = A01(3, A00());
        C31881d6 c31881d6 = (C31881d6) C236917s.A00(A01, C31881d6.CREATOR);
        A01.recycle();
        return c31881d6;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final IObjectWrapper AVa(LatLng latLng) {
        Parcel A00 = A00();
        C236917s.A02(A00, latLng);
        Parcel A01 = A01(2, A00);
        IObjectWrapper A012 = BinderC06200Rx.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }
}
