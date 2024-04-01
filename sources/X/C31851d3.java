package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IMapViewDelegate;

/* renamed from: X.1d3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31851d3 extends C236717q implements IMapViewDelegate {
    public C31851d3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void AB3(C18U c18u) {
        Parcel A00 = A00();
        C236917s.A01(A00, c18u);
        A02(9, A00);
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final IObjectWrapper ADt() {
        Parcel A01 = A01(8, A00());
        IObjectWrapper A012 = BinderC06200Rx.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void AJ4(Bundle bundle) {
        Parcel A00 = A00();
        C236917s.A02(A00, bundle);
        A02(2, A00);
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void AMk() {
        A02(4, A00());
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void AOH() {
        A02(3, A00());
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void AOJ(Bundle bundle) {
        Parcel A00 = A00();
        C236917s.A02(A00, bundle);
        Parcel A01 = A01(7, A00);
        if (A01.readInt() != 0) {
            bundle.readFromParcel(A01);
        }
        A01.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void onDestroy() {
        A02(5, A00());
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void onLowMemory() {
        A02(6, A00());
    }
}
