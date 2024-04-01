package X;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;

/* renamed from: X.0K6  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0K6 {
    public static boolean A00;

    public static synchronized int A00(Context context) {
        synchronized (C0K6.class) {
            C07K.A1Q(context, "Context is null");
            if (A00) {
                return 0;
            }
            try {
                C18Z A01 = C18X.A01(context);
                try {
                    ICameraUpdateFactoryDelegate AXD = A01.AXD();
                    C07K.A1P(AXD);
                    AnonymousClass088.A02 = AXD;
                    InterfaceC019509b AXG = A01.AXG();
                    if (AnonymousClass088.A01 == null) {
                        C07K.A1P(AXG);
                        AnonymousClass088.A01 = AXG;
                    }
                    A00 = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new C09Y(e);
                }
            } catch (C226813n e2) {
                return e2.errorCode;
            }
        }
    }
}
