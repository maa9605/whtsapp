package X;

import android.os.Handler;
import android.util.Log;

/* renamed from: X.0yt */
/* loaded from: classes.dex */
public final class C21160yt {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC21140yr A09;
    public final InterfaceC21150ys A0A;
    public final AbstractC21230z0 A0B;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public C21160yt(InterfaceC21140yr interfaceC21140yr, InterfaceC21150ys interfaceC21150ys, AbstractC21230z0 abstractC21230z0, int i, Handler handler) {
        this.A09 = interfaceC21140yr;
        this.A0A = interfaceC21150ys;
        this.A0B = abstractC21230z0;
        this.A03 = handler;
        this.A01 = i;
    }

    public void A00() {
        C002701i.A1K(!this.A08);
        this.A08 = true;
        C39201pk c39201pk = (C39201pk) this.A09;
        synchronized (c39201pk) {
            if (c39201pk.A0A) {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                A01(false);
                return;
            }
            c39201pk.A0Q.A00.obtainMessage(14, this).sendToTarget();
        }
    }

    public synchronized void A01(boolean z) {
        this.A06 = z | this.A06;
        this.A07 = true;
        notifyAll();
    }
}
