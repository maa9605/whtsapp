package X;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.2Gz  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Gz {
    public C18450tl A00;
    public C18M A01;

    public C2Gz(C18450tl c18450tl) {
        this.A00 = c18450tl;
        float[] fArr = c18450tl.A02;
        c18450tl.A07(C18450tl.A02(0.0d), C18450tl.A01(0.0d), fArr);
        new Point((int) fArr[0], (int) fArr[1]);
    }

    public C2Gz(C18M c18m) {
        this.A01 = c18m;
        c18m.A00(new LatLng(0.0d, 0.0d));
    }

    public Point A00(LatLng latLng) {
        C18M c18m = this.A01;
        if (c18m != null) {
            return c18m.A00(latLng);
        }
        C18450tl c18450tl = this.A00;
        double d = latLng.A00;
        double d2 = latLng.A01;
        c18450tl.A07(C18450tl.A02(d2), C18450tl.A01(d), c18450tl.A02);
        float[] fArr = c18450tl.A02;
        return new Point((int) fArr[0], (int) fArr[1]);
    }

    public LatLng A01(Point point) {
        C18M c18m = this.A01;
        if (c18m != null) {
            try {
                return c18m.A00.A86(new BinderC06190Rw(point));
            } catch (RemoteException e) {
                throw new C09Y(e);
            }
        }
        C18450tl c18450tl = this.A00;
        if (c18450tl != null) {
            C016007m A05 = c18450tl.A05(point.x, point.y);
            return new LatLng(A05.A00, A05.A01);
        }
        throw null;
    }
}
