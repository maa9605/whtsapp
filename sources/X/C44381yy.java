package X;

import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1yy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44381yy implements InterfaceC44391yz {
    public static volatile C44381yy A09;
    public C24J A00 = null;
    public final C44421z3 A01;
    public final C44341yu A02;
    public final C44331yt A03;
    public final C42961wc A04;
    public final C44311yr A05;
    public final C44321ys A06;
    public final C44431z4 A07;
    public final C44351yv A08;

    public C44381yy(C44311yr c44311yr, C44321ys c44321ys, C44331yt c44331yt, C44341yu c44341yu, C44351yv c44351yv, C42961wc c42961wc, C44421z3 c44421z3, C44431z4 c44431z4) {
        this.A05 = c44311yr;
        this.A06 = c44321ys;
        this.A03 = c44331yt;
        this.A02 = c44341yu;
        this.A08 = c44351yv;
        this.A04 = c42961wc;
        this.A01 = c44421z3;
        this.A07 = c44431z4;
    }

    public static C44381yy A00() {
        if (A09 == null) {
            synchronized (C44381yy.class) {
                if (A09 == null) {
                    A09 = new C44381yy(C44311yr.A00(), C44321ys.A00(), C44331yt.A00(), C44341yu.A00(), C44351yv.A00(), C42961wc.A00(), C44421z3.A00(), C44431z4.A00());
                }
            }
        }
        return A09;
    }

    public void A01() {
        C24J c24j;
        long j;
        long j2;
        C42961wc c42961wc = this.A04;
        int i = c42961wc.A03().getInt("syncd_bootstrap_state", 0);
        synchronized (this) {
            c24j = this.A00;
        }
        StringBuilder sb = new StringBuilder("SyncdBootstrapManager/onSyncdSuccess ");
        sb.append(c24j);
        sb.append("; bootstrapState: ");
        sb.append(i);
        Log.i(sb.toString());
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    HashSet hashSet = new HashSet(AbstractC44611zM.A08);
                    hashSet.removeAll(AbstractC44611zM.A09);
                    if (this.A08.A0K(hashSet)) {
                        A02(c24j);
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (!this.A08.A0K(AbstractC44611zM.A09)) {
            return;
        } else {
            c42961wc.A04(2);
            this.A07.A03(true);
            if (c24j != null) {
                C44331yt c44331yt = this.A03;
                String str = c24j.A02;
                synchronized (c24j) {
                    j = c24j.A00;
                }
                synchronized (c24j) {
                    j2 = c24j.A01;
                }
                c44331yt.A06(str, true, j, j2, 1);
            }
        }
        ArrayList A0Y = C000200d.A0Y("SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap");
        HashSet hashSet2 = new HashSet(AbstractC44611zM.A08);
        hashSet2.removeAll(AbstractC44611zM.A09);
        C44321ys c44321ys = this.A06;
        Iterator it = ((AbstractCollection) c44321ys.A03()).iterator();
        while (it.hasNext()) {
            AbstractC44571zI abstractC44571zI = (AbstractC44571zI) it.next();
            if (hashSet2.contains(abstractC44571zI.A00())) {
                A0Y.addAll(abstractC44571zI.A01());
                StringBuilder sb2 = new StringBuilder("SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap adding mutations for ");
                sb2.append(abstractC44571zI.getClass().getCanonicalName());
                Log.i(sb2.toString());
            }
        }
        c44321ys.A08(A0Y);
        c42961wc.A04(3);
        if (A0Y.isEmpty()) {
            A03(Collections.emptyList());
            A02(c24j);
        }
    }

    public final void A02(C24J c24j) {
        long j;
        long j2;
        this.A04.A04(4);
        if (c24j != null) {
            C44331yt c44331yt = this.A03;
            String str = c24j.A02;
            synchronized (c24j) {
                j = c24j.A00;
            }
            synchronized (c24j) {
                j2 = c24j.A01;
            }
            c44331yt.A06(str, true, j, j2, 2);
        }
        synchronized (this) {
            this.A00 = null;
        }
    }

    public void A03(List list) {
        C24J c24j;
        C24L c24l;
        synchronized (this) {
            c24j = this.A00;
        }
        if (c24j == null) {
            return;
        }
        synchronized (c24j) {
            Iterator it = list.iterator();
            long j = 0;
            long j2 = 0;
            while (it.hasNext()) {
                C24K c24k = (C24K) it.next();
                if ("critical_unblock_low".equals(c24k.A01)) {
                    for (AbstractC44611zM abstractC44611zM : c24k.A02) {
                        if (abstractC44611zM instanceof C44881zo) {
                            j2++;
                        }
                    }
                }
            }
            c24j.A00 = j2;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C24K c24k2 = (C24K) it2.next();
                if (c24k2 != null && (c24l = c24k2.A00) != null) {
                    j += c24l.AD4();
                    if ((c24l.A00 & 2) == 2) {
                        C24M c24m = c24l.A06;
                        if (c24m == null) {
                            c24m = C24M.A07;
                        }
                        j += c24m.A01;
                    }
                }
            }
            c24j.A01 = j;
        }
        StringBuilder sb = new StringBuilder("SyncdBootstrapManager/syncdRequestPrepared bootstrapSessionId: ");
        sb.append(c24j);
        Log.i(sb.toString());
        this.A03.A05(c24j.A02, true, this.A04.A03().getInt("syncd_bootstrap_state", 0) == 1 ? 1 : 2);
    }

    @Override // X.InterfaceC44391yz
    public void APV() {
        Log.i("SyncdBootstrapManager/onSyncdFailed");
        this.A07.A03(false);
    }

    @Override // X.InterfaceC44391yz
    public void APW() {
        A01();
    }
}
