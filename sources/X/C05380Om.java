package X;

import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.0Om  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05380Om implements InterfaceC010405f {
    public long A00 = 0;
    public final AnonymousClass012 A01;
    public final C05Y A02;
    public final C0IY A03;

    public C05380Om(AnonymousClass012 anonymousClass012, C05Y c05y, C0IY c0iy) {
        this.A01 = anonymousClass012;
        this.A02 = c05y;
        this.A03 = c0iy;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        synchronized (this) {
            this.A00 = 0L;
        }
        Log.w("routeselector/on delivery failure");
        this.A03.A09(0, 0);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        synchronized (this) {
            this.A00 = 0L;
        }
        Pair A00 = C2GM.A00(c02590Ca);
        if (A00 != null) {
            this.A03.A09(((Number) A00.first).intValue(), ((Number) A00.second).intValue());
        }
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        long j;
        synchronized (this) {
            j = this.A00;
            this.A00 = 0L;
        }
        C0IY c0iy = this.A03;
        C02600Cb A01 = C2GM.A01(c02590Ca, j);
        C0J3 c0j3 = c0iy.A0B;
        synchronized (c0j3) {
            c0j3.A00 = 0L;
            Log.i("ChatdMediaThrottleManager/resetThrottle");
        }
        c0iy.A0A(A01);
        if (c0iy.A0C()) {
            c0iy.A0C.A01("route_selector_prefs").edit().putString("media_conn", AnonymousClass029.A0a(c0iy.A08, c0iy.A03())).apply();
        }
    }
}
