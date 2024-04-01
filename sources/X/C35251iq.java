package X;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1iq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35251iq implements InterfaceC227813z, AnonymousClass140 {
    public final /* synthetic */ C0IK A00;

    @Override // X.AnonymousClass140
    public void AIv(C30451ab c30451ab) {
    }

    @Override // X.InterfaceC227813z
    public void AIw(int i) {
    }

    public C35251iq(C0IK c0ik) {
        this.A00 = c0ik;
    }

    @Override // X.InterfaceC227813z
    public void AIu(Bundle bundle) {
        C0IK c0ik = this.A00;
        if (c0ik.A07.A04()) {
            Map map = c0ik.A02;
            if (map != null) {
                for (C35261ir c35261ir : map.values()) {
                    LocationRequest A00 = C0IK.A00(c35261ir);
                    try {
                        C0NE c0ne = c0ik.A01;
                        C07K.A1Q(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                        c0ne.A07(new C11830iP(c0ne, A00, c35261ir));
                    } catch (SecurityException e) {
                        Log.w("FusedLocationManager/GmsConnectionCallbacks/onConnected/unable to request location updates", e);
                    }
                }
                if (c0ik.A02.isEmpty()) {
                    C0NE c0ne2 = c0ik.A01;
                    if (c0ne2 != null) {
                        c0ne2.A0A();
                        return;
                    }
                    throw null;
                }
                return;
            }
            throw null;
        }
    }
}
