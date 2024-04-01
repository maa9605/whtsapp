package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.2i6  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54112i6 extends AnonymousClass258 {
    public final /* synthetic */ C018508q A00;
    public final /* synthetic */ C2IY A01;
    public final /* synthetic */ C459824m A02;

    public C54112i6(C2IY c2iy, C459824m c459824m, C018508q c018508q) {
        this.A01 = c2iy;
        this.A02 = c459824m;
        this.A00 = c018508q;
    }

    @Override // X.AnonymousClass258
    public void A00(String str) {
        C000700j.A01();
        C2IY c2iy = this.A01;
        C49022Ia c49022Ia = c2iy.A0L;
        StringBuilder sb = new StringBuilder("app/startOutgoingCall/onCreateOutgoingConnection ");
        sb.append(str);
        sb.append(", pendingCallCommand: ");
        sb.append(c49022Ia);
        Log.i(sb.toString());
        if (c49022Ia != null && str.equals(c49022Ia.A03)) {
            long j = c2iy.A00;
            if (j > 0) {
                c49022Ia.A00 = SystemClock.elapsedRealtime() - j;
            } else {
                C000700j.A08(false, "selfManagedConnectionNewCallTs is not set");
            }
            c2iy.A0I.AS1(new RunnableEBaseShape4S0200000_I0_4(c2iy, c49022Ia, 47));
            c2iy.A0L = null;
            c2iy.A01.removeMessages(1);
            return;
        }
        this.A02.A05(str);
    }
}
