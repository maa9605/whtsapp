package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.0Si */
/* loaded from: classes.dex */
public class C06260Si extends AbstractC06270Sj implements InterfaceC06290Sl {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Surface A04;
    public SurfaceHolder A05;
    public TextureView A06;
    public C21030yg A07;
    public C21030yg A08;
    public C21630ze A09;
    public C21630ze A0A;
    public InterfaceC219210i A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F;
    public final C39191pj A0G;
    public final C1Z7 A0H;
    public final C1Z9 A0I;
    public final C21390zG A0J;
    public final AnonymousClass122 A0K;
    public final CopyOnWriteArraySet A0L;
    public final CopyOnWriteArraySet A0M;
    public final CopyOnWriteArraySet A0N;
    public final CopyOnWriteArraySet A0O;
    public final CopyOnWriteArraySet A0P;
    public final CopyOnWriteArraySet A0Q;
    public final C1Z6[] A0R;

    public C06260Si(Context context, InterfaceC21190yw interfaceC21190yw, AbstractC222211m abstractC222211m, InterfaceC21060yj interfaceC21060yj, AnonymousClass122 anonymousClass122, Looper looper) {
        C12Q c12q = C12Q.A00;
        this.A0K = anonymousClass122;
        this.A0H = new C1Z7(this);
        this.A0Q = new CopyOnWriteArraySet();
        this.A0M = new CopyOnWriteArraySet();
        this.A0O = new CopyOnWriteArraySet();
        this.A0N = new CopyOnWriteArraySet();
        this.A0P = new CopyOnWriteArraySet();
        this.A0L = new CopyOnWriteArraySet();
        Handler handler = new Handler(looper);
        this.A0F = handler;
        C1Z7 c1z7 = this.A0H;
        this.A0R = interfaceC21190yw.A6v(handler, c1z7, c1z7, c1z7, c1z7, null);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A0C = Collections.emptyList();
        C39191pj c39191pj = new C39191pj(this.A0R, abstractC222211m, interfaceC21060yj, anonymousClass122, c12q, looper);
        this.A0G = c39191pj;
        C1Z9 c1z9 = new C1Z9(c39191pj, c12q);
        this.A0I = c1z9;
        A5D(c1z9);
        this.A0P.add(this.A0I);
        this.A0Q.add(this.A0I);
        this.A0L.add(this.A0I);
        this.A0M.add(this.A0I);
        this.A0N.add(this.A0I);
        anonymousClass122.A5C(this.A0F, this.A0I);
        this.A0J = new C21390zG(context, this.A0H);
    }

    public void A00() {
        A03();
        C39191pj c39191pj = this.A0G;
        C21110yo A00 = c39191pj.A00(false, false, 1);
        c39191pj.A02++;
        c39191pj.A0C.A0Q.A00.obtainMessage(6, 0, 0).sendToTarget();
        c39191pj.A01(A00, false, 4, 1, false, false);
        InterfaceC219210i interfaceC219210i = this.A0B;
        if (interfaceC219210i != null) {
            C1Z9 c1z9 = this.A0I;
            interfaceC219210i.ARM(c1z9);
            c1z9.A01();
        }
        C21390zG c21390zG = this.A0J;
        if (c21390zG.A02 != null) {
            c21390zG.A00();
        }
        this.A0C = Collections.emptyList();
    }

    public final void A01() {
        TextureView textureView = this.A06;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0H) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.A06.setSurfaceTextureListener(null);
            }
            this.A06 = null;
        }
        SurfaceHolder surfaceHolder = this.A05;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.A0H);
            this.A05 = null;
        }
    }

    public final void A02() {
        C1Z6[] c1z6Arr;
        float f = this.A00 * this.A0J.A00;
        for (C1Z6 c1z6 : this.A0R) {
            if (c1z6.ADa() == 1) {
                C39191pj c39191pj = this.A0G;
                C21160yt c21160yt = new C21160yt(c39191pj.A0C, c1z6, c39191pj.A04.A03, c39191pj.A9Y(), c39191pj.A0B);
                boolean z = !c21160yt.A08;
                C002701i.A1K(z);
                c21160yt.A00 = 2;
                Float valueOf = Float.valueOf(f);
                C002701i.A1K(z);
                c21160yt.A04 = valueOf;
                c21160yt.A00();
            }
        }
    }

    public final void A03() {
        if (Looper.myLooper() != this.A0G.A0A.getLooper()) {
            Log.w("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://google.github.io/ExoPlayer/faqs.html#what-do-player-is-accessed-on-the-wrong-thread-warnings-mean", this.A0D ? null : new IllegalStateException());
            this.A0D = true;
        }
    }

    public void A04(float f) {
        A03();
        float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.A00 == max) {
            return;
        }
        this.A00 = max;
        A02();
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            ((InterfaceC21400zH) it.next()).AQQ(max);
        }
    }

    public final void A05(int i, int i2) {
        if (i == this.A03 && i2 == this.A02) {
            return;
        }
        this.A03 = i;
        this.A02 = i2;
        Iterator it = this.A0Q.iterator();
        while (it.hasNext()) {
            ((AnonymousClass135) it.next()).APO(i, i2);
        }
    }

    public final void A06(Surface surface, boolean z) {
        C1Z6[] c1z6Arr;
        ArrayList arrayList = new ArrayList();
        for (C1Z6 c1z6 : this.A0R) {
            if (c1z6.ADa() == 2) {
                C39191pj c39191pj = this.A0G;
                C21160yt c21160yt = new C21160yt(c39191pj.A0C, c1z6, c39191pj.A04.A03, c39191pj.A9Y(), c39191pj.A0B);
                boolean z2 = !c21160yt.A08;
                C002701i.A1K(z2);
                c21160yt.A00 = 1;
                C002701i.A1K(z2);
                c21160yt.A04 = surface;
                c21160yt.A00();
                arrayList.add(c21160yt);
            }
        }
        Surface surface2 = this.A04;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C21160yt c21160yt2 = (C21160yt) it.next();
                    synchronized (c21160yt2) {
                        C002701i.A1K(c21160yt2.A08);
                        C002701i.A1K(c21160yt2.A03.getLooper().getThread() != Thread.currentThread());
                        while (!c21160yt2.A07) {
                            c21160yt2.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0E) {
                this.A04.release();
            }
        }
        this.A04 = surface;
        this.A0E = z;
    }

    public void A07(InterfaceC219210i interfaceC219210i, boolean z, boolean z2) {
        int i;
        A03();
        InterfaceC219210i interfaceC219210i2 = this.A0B;
        if (interfaceC219210i2 != null) {
            C1Z9 c1z9 = this.A0I;
            interfaceC219210i2.ARM(c1z9);
            c1z9.A01();
        }
        this.A0B = interfaceC219210i;
        interfaceC219210i.A5B(this.A0F, this.A0I);
        C21390zG c21390zG = this.A0J;
        boolean ACR = ACR();
        if (c21390zG.A02 != null) {
            if (ACR) {
                if (c21390zG.A01 != 0) {
                    c21390zG.A00();
                }
            } else {
                i = -1;
                A08(ACR(), i);
                C39191pj c39191pj = this.A0G;
                C21110yo A00 = c39191pj.A00(z, z2, 2);
                c39191pj.A06 = true;
                c39191pj.A02++;
                c39191pj.A0C.A0Q.A00.obtainMessage(0, z ? 1 : 0, z2 ? 1 : 0, interfaceC219210i).sendToTarget();
                c39191pj.A01(A00, false, 4, 1, false, false);
            }
        }
        i = 1;
        A08(ACR(), i);
        C39191pj c39191pj2 = this.A0G;
        C21110yo A002 = c39191pj2.A00(z, z2, 2);
        c39191pj2.A06 = true;
        c39191pj2.A02++;
        c39191pj2.A0C.A0Q.A00.obtainMessage(0, z ? 1 : 0, z2 ? 1 : 0, interfaceC219210i).sendToTarget();
        c39191pj2.A01(A002, false, 4, 1, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0008, code lost:
        if (r7 == (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08(boolean r6, int r7) {
        /*
            r5 = this;
            X.1pj r4 = r5.A0G
            r3 = 0
            r2 = 1
            if (r6 == 0) goto La
            r1 = -1
            r0 = 1
            if (r7 != r1) goto Lb
        La:
            r0 = 0
        Lb:
            if (r7 == r2) goto Le
            r3 = 1
        Le:
            r4.A02(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06260Si.A08(boolean, int):void");
    }

    @Override // X.InterfaceC06280Sk
    public void A5D(InterfaceC21130yq interfaceC21130yq) {
        A03();
        this.A0G.A0H.add(interfaceC21130yq);
    }

    @Override // X.InterfaceC06280Sk
    public long A8b() {
        A03();
        return this.A0G.A8b();
    }

    @Override // X.InterfaceC06280Sk
    public long A98() {
        A03();
        return this.A0G.A98();
    }

    @Override // X.InterfaceC06280Sk
    public int A9R() {
        A03();
        C39191pj c39191pj = this.A0G;
        if (c39191pj.A03()) {
            return c39191pj.A04.A05.A00;
        }
        return -1;
    }

    @Override // X.InterfaceC06280Sk
    public int A9S() {
        A03();
        C39191pj c39191pj = this.A0G;
        if (c39191pj.A03()) {
            return c39191pj.A04.A05.A01;
        }
        return -1;
    }

    @Override // X.InterfaceC06280Sk
    public long A9U() {
        A03();
        return this.A0G.A9U();
    }

    @Override // X.InterfaceC06280Sk
    public AbstractC21230z0 A9X() {
        A03();
        return this.A0G.A04.A03;
    }

    @Override // X.InterfaceC06280Sk
    public int A9Y() {
        A03();
        return this.A0G.A9Y();
    }

    @Override // X.InterfaceC06280Sk
    public long A9q() {
        A03();
        return this.A0G.A9q();
    }

    @Override // X.InterfaceC06280Sk
    public boolean ACR() {
        A03();
        return this.A0G.A09;
    }

    @Override // X.InterfaceC06280Sk
    public int ACT() {
        A03();
        return this.A0G.A04.A00;
    }

    @Override // X.InterfaceC06280Sk
    public long ADX() {
        A03();
        return Math.max(0L, C20910yU.A01(this.A0G.A04.A0C));
    }

    @Override // X.InterfaceC06280Sk
    public void ARO(InterfaceC21130yq interfaceC21130yq) {
        A03();
        this.A0G.A0H.remove(interfaceC21130yq);
    }

    @Override // X.InterfaceC06280Sk
    public void ASI(int i, long j) {
        A03();
        C1Z9 c1z9 = this.A0I;
        C21260z3 c21260z3 = c1z9.A02;
        if (!c21260z3.A03) {
            c1z9.A00();
            c21260z3.A03 = true;
            Iterator it = c1z9.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
        }
        this.A0G.ASI(i, j);
    }

    @Override // X.InterfaceC06280Sk
    public void ATc(boolean z) {
        A03();
        C21390zG c21390zG = this.A0J;
        int ACT = ACT();
        int i = 1;
        if (c21390zG.A02 != null) {
            if (!z) {
                c21390zG.A00();
                i = -1;
            } else if (ACT != 1 && c21390zG.A01 != 0) {
                c21390zG.A00();
            }
        }
        A08(z, i);
    }
}
