package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.1cy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31801cy extends C236717q implements ICameraUpdateFactoryDelegate {
    public C31801cy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper AGe(CameraPosition cameraPosition) {
        Parcel A00 = A00();
        C236917s.A02(A00, cameraPosition);
        Parcel A01 = A01(7, A00);
        IObjectWrapper A012 = BinderC06200Rx.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper AGg(LatLng latLng) {
        Parcel A00 = A00();
        C236917s.A02(A00, latLng);
        Parcel A01 = A01(8, A00);
        IObjectWrapper A012 = BinderC06200Rx.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper AGh(LatLngBounds latLngBounds, int i) {
        Parcel A00 = A00();
        C236917s.A02(A00, latLngBounds);
        A00.writeInt(i);
        Parcel A01 = A01(10, A00);
        IObjectWrapper A012 = BinderC06200Rx.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper AGi(LatLng latLng, float f) {
        Parcel A00 = A00();
        C236917s.A02(A00, latLng);
        A00.writeFloat(f);
        Parcel A01 = A01(9, A00);
        IObjectWrapper A012 = BinderC06200Rx.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper AWZ(float f) {
        Parcel A00 = A00();
        A00.writeFloat(f);
        Parcel A01 = A01(4, A00);
        IObjectWrapper A012 = BinderC06200Rx.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }
}
