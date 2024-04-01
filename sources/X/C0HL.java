package X;

import androidx.lifecycle.LiveData$LifecycleBoundObserver;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0HL */
/* loaded from: classes.dex */
public abstract class C0HL {
    public static final Object A09 = new Object();
    public int A00;
    public int A01;
    public C02550Bw A02;
    public boolean A03;
    public boolean A04;
    public final Object A05;
    public final Runnable A06;
    public volatile Object A07;
    public volatile Object A08;

    public void A02() {
    }

    public void A03() {
    }

    public C0HL() {
        this.A05 = new Object();
        this.A02 = new C02550Bw();
        this.A00 = 0;
        Object obj = A09;
        this.A08 = obj;
        this.A06 = new Runnable() { // from class: X.0HX
            {
                C0HL.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Object obj2;
                C0HL c0hl = C0HL.this;
                synchronized (c0hl.A05) {
                    obj2 = c0hl.A08;
                    c0hl.A08 = C0HL.A09;
                }
                c0hl.A0B(obj2);
            }
        };
        this.A07 = obj;
        this.A01 = -1;
    }

    public C0HL(Object obj) {
        this.A05 = new Object();
        this.A02 = new C02550Bw();
        this.A00 = 0;
        this.A08 = A09;
        this.A06 = new Runnable() { // from class: X.0HX
            {
                C0HL.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Object obj2;
                C0HL c0hl = C0HL.this;
                synchronized (c0hl.A05) {
                    obj2 = c0hl.A08;
                    c0hl.A08 = C0HL.A09;
                }
                c0hl.A0B(obj2);
            }
        };
        this.A07 = obj;
        this.A01 = 0;
    }

    public static void A00(String str) {
        if (!C07200Xg.A00().A03()) {
            throw new IllegalStateException(C000200d.A0I("Cannot invoke ", str, " on a background thread"));
        }
    }

    public Object A01() {
        Object obj = this.A07;
        if (obj != A09) {
            return obj;
        }
        return null;
    }

    public void A04(InterfaceC02360Aw interfaceC02360Aw) {
        A00("removeObservers");
        Iterator it = this.A02.iterator();
        while (true) {
            AbstractC09960f4 abstractC09960f4 = (AbstractC09960f4) it;
            if (!abstractC09960f4.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) abstractC09960f4.next();
            if (((AbstractC07250Xm) entry.getValue()).A03(interfaceC02360Aw)) {
                A09((InterfaceC05620Pl) entry.getKey());
            }
        }
    }

    public void A05(InterfaceC02360Aw interfaceC02360Aw, InterfaceC05620Pl interfaceC05620Pl) {
        A00("observe");
        if (((C02520Bt) interfaceC02360Aw.AAs()).A02 == EnumC02560Bx.DESTROYED) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, interfaceC02360Aw, interfaceC05620Pl);
        AbstractC07250Xm abstractC07250Xm = (AbstractC07250Xm) this.A02.A02(interfaceC05620Pl, liveData$LifecycleBoundObserver);
        if (abstractC07250Xm != null) {
            if (!abstractC07250Xm.A03(interfaceC02360Aw)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            return;
        }
        interfaceC02360Aw.AAs().A02(liveData$LifecycleBoundObserver);
    }

    public void A06(AbstractC07250Xm abstractC07250Xm) {
        if (this.A04) {
            this.A03 = true;
            return;
        }
        this.A04 = true;
        do {
            this.A03 = false;
            if (abstractC07250Xm != null) {
                A07(abstractC07250Xm);
                abstractC07250Xm = null;
            } else {
                C02550Bw c02550Bw = this.A02;
                C0YX c0yx = new C0YX(c02550Bw);
                c02550Bw.A03.put(c0yx, Boolean.FALSE);
                while (c0yx.hasNext()) {
                    A07((AbstractC07250Xm) ((Map.Entry) c0yx.next()).getValue());
                    if (this.A03) {
                        break;
                    }
                }
            }
        } while (this.A03);
        this.A04 = false;
    }

    public final void A07(AbstractC07250Xm abstractC07250Xm) {
        if (abstractC07250Xm.A01) {
            if (!abstractC07250Xm.A02()) {
                abstractC07250Xm.A01(false);
                return;
            }
            int i = abstractC07250Xm.A00;
            int i2 = this.A01;
            if (i >= i2) {
                return;
            }
            abstractC07250Xm.A00 = i2;
            abstractC07250Xm.A02.AIK(this.A07);
        }
    }

    public void A08(InterfaceC05620Pl interfaceC05620Pl) {
        A00("observeForever");
        AbstractC07250Xm abstractC07250Xm = new AbstractC07250Xm(this, interfaceC05620Pl) { // from class: X.0f5
            @Override // X.AbstractC07250Xm
            public boolean A02() {
                return true;
            }
        };
        Object A02 = this.A02.A02(interfaceC05620Pl, abstractC07250Xm);
        if (A02 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (A02 != null) {
            return;
        }
        abstractC07250Xm.A01(true);
    }

    public void A09(InterfaceC05620Pl interfaceC05620Pl) {
        A00("removeObserver");
        AbstractC07250Xm abstractC07250Xm = (AbstractC07250Xm) this.A02.A01(interfaceC05620Pl);
        if (abstractC07250Xm == null) {
            return;
        }
        abstractC07250Xm.A00();
        abstractC07250Xm.A01(false);
    }

    public void A0A(Object obj) {
        boolean z;
        synchronized (this.A05) {
            z = this.A08 == A09;
            this.A08 = obj;
        }
        if (z) {
            C07200Xg.A00().A02(this.A06);
        }
    }

    public void A0B(Object obj) {
        A00("setValue");
        this.A01++;
        this.A07 = obj;
        A06(null);
    }
}
