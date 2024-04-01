package X;

/* renamed from: X.46M */
/* loaded from: classes3.dex */
public abstract class C46M {
    public final C06F A00;

    public C46M() {
        C894146x c894146x = new C894146x(10);
        this.A00 = c894146x;
        c894146x.A00 = new C46N() { // from class: X.34p
        };
    }

    public final C46L A00(String str) {
        C46L c46l;
        int i;
        C06F c06f = this.A00;
        C46L c46l2 = (C46L) c06f.A04(str);
        if (c46l2 == null) {
            synchronized (c06f) {
                c46l = (C46L) c06f.A04(str);
                if (c46l == null) {
                    C91694Fx c91694Fx = (C91694Fx) this;
                    int A07 = AnonymousClass029.A07((C02O) c91694Fx.A00.get(), (C02E) c91694Fx.A01.get());
                    if (A07 >= 2016) {
                        i = 50;
                    } else {
                        i = 10;
                        if (A07 >= 2014) {
                            i = 30;
                        }
                    }
                    c46l = new C46L(str, i);
                    c06f.A08(str, c46l);
                }
            }
            return c46l;
        }
        return c46l2;
    }

    public Object A01(String str, String str2) {
        C46K c46k = (C46K) A00(str).A00.A04(str2);
        if (c46k != null) {
            long j = c46k.A01;
            if (j != -1 && System.currentTimeMillis() >= c46k.A00 + j) {
                C46L c46l = (C46L) this.A00.A04(str);
                if (c46l != null) {
                    c46l.A00.A05(str2);
                }
            } else {
                Object obj = c46k.A02;
                if (obj != null) {
                    return obj;
                }
            }
        }
        return null;
    }

    public void A02(String str, String str2, Object obj) {
        C46L A00 = A00(str);
        A00.A00.A08(str2, new C46K(obj, null));
    }
}
