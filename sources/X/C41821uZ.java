package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1uZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41821uZ implements InterfaceC001000m, C0EM {
    public static volatile C41821uZ A0B;
    public boolean A00;
    public boolean A01;
    public final C018508q A02;
    public final C000800k A03;
    public final C010605h A04;
    public final C0GZ A05;
    public final C03540Gc A06;
    public final C0EU A07;
    public final C28P A08;
    public final C28O A09;
    public final C014406v A0A = C014406v.A00("PaymentsConnectivityManager", "network", "COMMON");

    public C41821uZ(C018508q c018508q, C0EU c0eu, C0GZ c0gz, C03540Gc c03540Gc, C28O c28o, C000800k c000800k, C010605h c010605h, C28P c28p) {
        this.A02 = c018508q;
        this.A07 = c0eu;
        this.A05 = c0gz;
        this.A06 = c03540Gc;
        this.A09 = c28o;
        this.A03 = c000800k;
        this.A04 = c010605h;
        this.A08 = c28p;
    }

    public static C41821uZ A00() {
        if (A0B == null) {
            synchronized (C41821uZ.class) {
                if (A0B == null) {
                    A0B = new C41821uZ(C018508q.A00(), C0EU.A00(), C0GZ.A00(), C03540Gc.A04, C28O.A00(), C000800k.A02, C010605h.A03, C28P.A00());
                }
            }
        }
        return A0B;
    }

    public final void A01() {
        Map map;
        Set keySet;
        InterfaceC03640Gm interfaceC03640Gm;
        C03540Gc c03540Gc = this.A06;
        synchronized (c03540Gc) {
            map = c03540Gc.A00;
            keySet = map.keySet();
        }
        for (Object obj : keySet) {
            synchronized (c03540Gc) {
                interfaceC03640Gm = (InterfaceC03640Gm) map.get(obj);
            }
            C28Q c28q = new C28Q(7);
            synchronized (c03540Gc) {
                c03540Gc.A02.remove(obj);
            }
            interfaceC03640Gm.AO1(c28q);
        }
        c03540Gc.A00();
        this.A01 = false;
    }

    @Override // X.C0EM
    public synchronized void AIL(boolean z) {
        C014406v c014406v = this.A0A;
        StringBuilder sb = new StringBuilder();
        sb.append("ChatConnectivity connected: ");
        sb.append(z);
        c014406v.A07(null, sb.toString(), null);
        if (this.A00) {
            if (!z) {
                A01();
            } else {
                C0GZ c0gz = this.A05;
                if (c0gz != null && c0gz.A09()) {
                    C0EU c0eu = this.A07;
                    if (c0eu.A01.A05() - c0eu.A04().getLong("payments_pending_transactions_last_sync_time", 0L) > TimeUnit.DAYS.toMillis(1L)) {
                        this.A08.A01(new C28R() { // from class: X.3hb
                            @Override // X.C28R
                            public final void AVM(AnonymousClass093 anonymousClass093) {
                                C41821uZ c41821uZ = C41821uZ.this;
                                c41821uZ.A09.A02(anonymousClass093.A0I, anonymousClass093.A0R(), c41821uZ.A08);
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC001000m
    public synchronized void AIx(C05050Nc c05050Nc) {
        C014406v c014406v = this.A0A;
        StringBuilder sb = new StringBuilder();
        sb.append("Connectivity connected: ");
        boolean z = c05050Nc.A02;
        sb.append(z);
        c014406v.A07(null, sb.toString(), null);
        if (this.A00 && !z) {
            A01();
        }
    }
}
