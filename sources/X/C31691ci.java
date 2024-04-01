package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1ci */
/* loaded from: classes.dex */
public final class C31691ci extends C236717q implements C0SM {
    public C31691ci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // X.C0SM
    public final LatLng ACU() {
        Parcel A01 = A01(4, A00());
        LatLng latLng = (LatLng) C236917s.A00(A01, LatLng.CREATOR);
        A01.recycle();
        return latLng;
    }

    @Override // X.C0SM
    public final void AEc() {
        A02(12, A00());
    }

    @Override // X.C0SM
    public final void ATf(LatLng latLng) {
        Parcel A00 = A00();
        C236917s.A02(A00, latLng);
        A02(3, A00);
    }

    @Override // X.C0SM
    public final void AU1(String str) {
        Parcel A00 = A00();
        A00.writeString(str);
        A02(5, A00);
    }

    @Override // X.C0SM
    public final void AU9(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        A02(14, A00);
    }

    @Override // X.C0SM
    public final void AUE(float f) {
        Parcel A00 = A00();
        A00.writeFloat(f);
        A02(27, A00);
    }

    @Override // X.C0SM
    public final void AUi() {
        A02(11, A00());
    }

    @Override // X.C0SM
    public final void AXF(IObjectWrapper iObjectWrapper) {
        Parcel A00 = A00();
        C236917s.A01(A00, iObjectWrapper);
        A02(29, A00);
    }

    @Override // X.C0SM
    public final void AXH(IObjectWrapper iObjectWrapper) {
        Parcel A00 = A00();
        C236917s.A01(A00, iObjectWrapper);
        A02(18, A00);
    }

    @Override // X.C0SM
    public final int AXI() {
        Parcel A01 = A01(17, A00());
        int readInt = A01.readInt();
        A01.recycle();
        return readInt;
    }

    @Override // X.C0SM
    public final boolean AXJ(C0SM c0sm) {
        Parcel A00 = A00();
        C236917s.A01(A00, c0sm);
        Parcel A01 = A01(16, A00);
        boolean z = A01.readInt() != 0;
        A01.recycle();
        return z;
    }

    @Override // X.C0SM
    public final IObjectWrapper AXK() {
        Parcel A01 = A01(30, A00());
        IObjectWrapper A012 = BinderC06200Rx.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // X.C0SM
    public final String getId() {
        Parcel A01 = A01(2, A00());
        String readString = A01.readString();
        A01.recycle();
        return readString;
    }

    @Override // X.C0SM
    public final boolean isVisible() {
        Parcel A01 = A01(15, A00());
        boolean z = A01.readInt() != 0;
        A01.recycle();
        return z;
    }
}
