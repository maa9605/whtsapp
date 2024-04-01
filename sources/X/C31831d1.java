package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;

/* renamed from: X.1d1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31831d1 extends C236717q implements C18Z {
    public C31831d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // X.C18Z
    public final IMapViewDelegate AWk(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions) {
        IMapViewDelegate c31851d3;
        Parcel A00 = A00();
        C236917s.A01(A00, iObjectWrapper);
        C236917s.A02(A00, googleMapOptions);
        Parcel A01 = A01(3, A00);
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            c31851d3 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof IMapViewDelegate) {
                c31851d3 = (IMapViewDelegate) queryLocalInterface;
            } else {
                c31851d3 = new C31851d3(readStrongBinder);
            }
        }
        A01.recycle();
        return c31851d3;
    }

    @Override // X.C18Z
    public final void AWq(IObjectWrapper iObjectWrapper, int i) {
        Parcel A00 = A00();
        C236917s.A01(A00, iObjectWrapper);
        A00.writeInt(i);
        A02(6, A00);
    }

    @Override // X.C18Z
    public final ICameraUpdateFactoryDelegate AXD() {
        ICameraUpdateFactoryDelegate c31801cy;
        Parcel A01 = A01(4, A00());
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            c31801cy = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof ICameraUpdateFactoryDelegate) {
                c31801cy = (ICameraUpdateFactoryDelegate) queryLocalInterface;
            } else {
                c31801cy = new C31801cy(readStrongBinder);
            }
        }
        A01.recycle();
        return c31801cy;
    }

    @Override // X.C18Z
    public final InterfaceC019509b AXG() {
        InterfaceC019509b c31671cg;
        Parcel A01 = A01(5, A00());
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            c31671cg = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof InterfaceC019509b) {
                c31671cg = (InterfaceC019509b) queryLocalInterface;
            } else {
                c31671cg = new C31671cg(readStrongBinder);
            }
        }
        A01.recycle();
        return c31671cg;
    }
}
