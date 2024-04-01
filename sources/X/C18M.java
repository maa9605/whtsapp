package X;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.18M  reason: invalid class name */
/* loaded from: classes.dex */
public final class C18M {
    public final IProjectionDelegate A00;

    public C18M(IProjectionDelegate iProjectionDelegate) {
        this.A00 = iProjectionDelegate;
    }

    public final Point A00(LatLng latLng) {
        try {
            return (Point) BinderC06190Rw.A00(this.A00.AVa(latLng));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final C31881d6 A01() {
        try {
            return this.A00.ADx();
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }
}
