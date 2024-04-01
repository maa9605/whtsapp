package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.1ch  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC31681ch extends BinderC236817r implements C0SM {
    public static C0SM A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof C0SM) {
            return (C0SM) queryLocalInterface;
        }
        return new C31691ci(iBinder);
    }
}
