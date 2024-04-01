package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.0Rx */
/* loaded from: classes.dex */
public class BinderC06200Rx extends BinderC06130Rq implements IObjectWrapper {
    public BinderC06200Rx() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static IObjectWrapper A01(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof IObjectWrapper) {
            return (IObjectWrapper) queryLocalInterface;
        }
        return new C31271c0(iBinder);
    }
}
