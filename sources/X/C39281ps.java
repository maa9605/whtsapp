package X;

import android.net.Uri;
import java.util.concurrent.ExecutorService;

/* renamed from: X.1ps  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39281ps extends AbstractC29941Zc implements InterfaceC218810d {
    public long A00;
    public C12L A01;
    public boolean A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC21770zs A05;
    public final AnonymousClass124 A06;
    public final C12B A07;

    @Override // X.AbstractC29941Zc
    public void A00() {
    }

    @Override // X.InterfaceC219210i
    public void AGU() {
    }

    public C39281ps(Uri uri, AnonymousClass124 anonymousClass124, InterfaceC21770zs interfaceC21770zs) {
        C12B c12b = new C12B() { // from class: X.1aA
            public final int A00 = -1;
        };
        this.A04 = uri;
        this.A06 = anonymousClass124;
        this.A05 = interfaceC21770zs;
        this.A07 = c12b;
        this.A03 = 1048576;
        this.A00 = -9223372036854775807L;
    }

    @Override // X.AbstractC29941Zc
    public void A02(C12L c12l) {
        this.A01 = c12l;
        long j = this.A00;
        boolean z = this.A02;
        this.A00 = j;
        this.A02 = z;
        A01(new C30041Zm(j, z), null);
    }

    public void A03(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 == j && this.A02 == z) {
            return;
        }
        this.A00 = j;
        this.A02 = z;
        A01(new C30041Zm(j, z), null);
    }

    @Override // X.InterfaceC219210i
    public InterfaceC30011Zj A6u(C219010g c219010g, AnonymousClass127 anonymousClass127, long j) {
        InterfaceC06380Sv A6k = this.A06.A6k();
        C12L c12l = this.A01;
        if (c12l != null) {
            A6k.A5K(c12l);
        }
        return new C39271pr(this.A04, A6k, this.A05.A6m(), this.A07, new C219410k(super.A03.A02, 0, c219010g), this, anonymousClass127);
    }

    @Override // X.InterfaceC219210i
    public void ARE(InterfaceC30011Zj interfaceC30011Zj) {
        final C39271pr c39271pr = (C39271pr) interfaceC30011Zj;
        if (c39271pr.A0F) {
            for (C30021Zk c30021Zk : c39271pr.A0K) {
                c30021Zk.A04();
            }
        }
        C12J c12j = c39271pr.A0U;
        C12E c12e = c12j.A00;
        if (c12e != null) {
            c12e.A01(true);
        }
        ExecutorService executorService = c12j.A02;
        executorService.execute(new Runnable(c39271pr) { // from class: X.12H
            public final C12G A00;

            {
                this.A00 = c39271pr;
            }

            @Override // java.lang.Runnable
            public void run() {
                C39271pr c39271pr2 = (C39271pr) this.A00;
                for (C30021Zk c30021Zk2 : c39271pr2.A0K) {
                    c30021Zk2.A05();
                }
                C218710c c218710c = c39271pr2.A0O;
                if (c218710c.A00 != null) {
                    c218710c.A00 = null;
                }
            }
        });
        executorService.shutdown();
        c39271pr.A0N.removeCallbacksAndMessages(null);
        c39271pr.A09 = null;
        c39271pr.A0G = true;
        c39271pr.A0Q.A03();
    }
}
