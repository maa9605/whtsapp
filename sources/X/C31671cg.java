package X;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.1cg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31671cg extends C236717q implements InterfaceC019509b {
    public C31671cg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // X.InterfaceC019509b
    public final IObjectWrapper AWf(int i) {
        Parcel A00 = A00();
        A00.writeInt(i);
        Parcel A01 = A01(1, A00);
        IObjectWrapper A012 = BinderC06200Rx.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // X.InterfaceC019509b
    public final IObjectWrapper AWg(Bitmap bitmap) {
        Parcel A00 = A00();
        C236917s.A02(A00, bitmap);
        Parcel A01 = A01(6, A00);
        IObjectWrapper A012 = BinderC06200Rx.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }
}
