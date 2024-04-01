package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* renamed from: X.1Xv */
/* loaded from: classes.dex */
public class C29661Xv implements InterfaceC18970ud {
    public long A00;
    public C19420vP A01;
    public final InterfaceC18950ub A02;
    public final C19390vM A03;
    public final C19390vM A04;
    public final InterfaceC19440vR A05;

    public C29661Xv(final InterfaceC19440vR interfaceC19440vR, InterfaceC18950ub interfaceC18950ub) {
        new WeakHashMap();
        this.A05 = interfaceC19440vR;
        this.A04 = new C19390vM(new InterfaceC19440vR() { // from class: X.1Xt
            @Override // X.InterfaceC19440vR
            public int ADB(Object obj) {
                return interfaceC19440vR.ADB(((C19400vN) obj).A02.A04());
            }
        });
        this.A03 = new C19390vM(new InterfaceC19440vR() { // from class: X.1Xt
            @Override // X.InterfaceC19440vR
            public int ADB(Object obj) {
                return interfaceC19440vR.ADB(((C19400vN) obj).A02.A04());
            }
        });
        this.A02 = interfaceC18950ub;
        this.A01 = (C19420vP) interfaceC18950ub.get();
        this.A00 = SystemClock.uptimeMillis();
    }

    public static void A00(C19400vN c19400vN) {
        C29581Xl c29581Xl;
        if (c19400vN != null && (c29581Xl = c19400vN.A03) != null) {
            Object obj = c19400vN.A04;
            C19330vF c19330vF = c29581Xl.A00;
            synchronized (c19330vF) {
                c19330vF.A03.remove(obj);
            }
        }
    }

    public final synchronized AbstractC19030uj A01(final C19400vN c19400vN) {
        C07K.A1Z(c19400vN.A01 ? false : true);
        c19400vN.A00++;
        return AbstractC19030uj.A01(c19400vN.A02.A04(), new InterfaceC19050ul() { // from class: X.1Xu
            {
                C29661Xv.this = this;
            }

            @Override // X.InterfaceC19050ul
            public void ARD(Object obj) {
                boolean z;
                AbstractC19030uj A02;
                C29581Xl c29581Xl;
                C29661Xv c29661Xv = C29661Xv.this;
                C19400vN c19400vN2 = c19400vN;
                if (c19400vN2 != null) {
                    synchronized (c29661Xv) {
                        int i = c19400vN2.A00;
                        z = false;
                        C07K.A1Z(i > 0);
                        int i2 = i - 1;
                        c19400vN2.A00 = i2;
                        if (!c19400vN2.A01 && i2 == 0) {
                            c29661Xv.A04.A03(c19400vN2.A04, c19400vN2);
                            z = true;
                        }
                        A02 = c29661Xv.A02(c19400vN2);
                    }
                    if (A02 != null) {
                        A02.close();
                    }
                    if (z && (c29581Xl = c19400vN2.A03) != null) {
                        Object obj2 = c19400vN2.A04;
                        C19330vF c19330vF = c29581Xl.A00;
                        synchronized (c19330vF) {
                            c19330vF.A03.add(obj2);
                        }
                    }
                    c29661Xv.A04();
                    c29661Xv.A03();
                    return;
                }
                throw null;
            }
        }, AbstractC19030uj.A04);
    }

    public final synchronized AbstractC19030uj A02(C19400vN c19400vN) {
        AbstractC19030uj abstractC19030uj;
        abstractC19030uj = null;
        if (c19400vN != null) {
            if (c19400vN.A01 && c19400vN.A00 == 0) {
                abstractC19030uj = c19400vN.A02;
            }
        } else {
            throw null;
        }
        return abstractC19030uj;
    }

    public final void A03() {
        ArrayList arrayList;
        Object next;
        synchronized (this) {
            C19420vP c19420vP = this.A01;
            int i = c19420vP.A03;
            int i2 = c19420vP.A00;
            C19390vM c19390vM = this.A03;
            int A00 = c19390vM.A00();
            C19390vM c19390vM2 = this.A04;
            int min = Math.min(i, i2 - (A00 - c19390vM2.A00()));
            C19420vP c19420vP2 = this.A01;
            int min2 = Math.min(c19420vP2.A04, c19420vP2.A02 - (c19390vM.A01() - c19390vM2.A01()));
            int max = Math.max(min, 0);
            int max2 = Math.max(min2, 0);
            arrayList = null;
            if (c19390vM2.A00() > max || c19390vM2.A01() > max2) {
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (c19390vM2.A00() <= max && c19390vM2.A01() <= max2) {
                        break;
                    }
                    synchronized (c19390vM2) {
                        LinkedHashMap linkedHashMap = c19390vM2.A02;
                        next = linkedHashMap.isEmpty() ? null : linkedHashMap.keySet().iterator().next();
                    }
                    c19390vM2.A02(next);
                    arrayList2.add(c19390vM.A02(next));
                }
                arrayList = arrayList2;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    A05((C19400vN) it.next());
                }
            }
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC19030uj A02 = A02((C19400vN) it2.next());
                if (A02 != null) {
                    A02.close();
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                A00((C19400vN) it3.next());
            }
        }
    }

    public final synchronized void A04() {
        if (this.A00 + this.A01.A05 > SystemClock.uptimeMillis()) {
            return;
        }
        this.A00 = SystemClock.uptimeMillis();
        this.A01 = (C19420vP) this.A02.get();
    }

    public final synchronized void A05(C19400vN c19400vN) {
        if (c19400vN != null) {
            C07K.A1Z(c19400vN.A01 ? false : true);
            c19400vN.A01 = true;
        } else {
            throw null;
        }
    }
}
