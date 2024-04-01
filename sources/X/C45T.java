package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.45T */
/* loaded from: classes3.dex */
public class C45T {
    public boolean A00 = true;
    public final C09P A01;
    public final C021209s A02;
    public final C45U A03;

    public C45T(C021209s c021209s, C45U c45u, C09P c09p) {
        this.A02 = c021209s;
        this.A03 = c45u;
        this.A01 = c09p;
    }

    public void A00(String str) {
        A03(str, new HashMap());
    }

    public void A01(String str, Map map) {
        ArrayList arrayList = new ArrayList();
        InterfaceC020509l A0f = AnonymousClass088.A0f(str);
        if (arrayList.size() == 0) {
            arrayList.add(A0f);
            if (map != null) {
                InterfaceC020509l A0f2 = AnonymousClass088.A0f(C45Q.A08(map));
                if (arrayList.size() == 1) {
                    arrayList.add(A0f2);
                } else {
                    throw new IllegalArgumentException("arguments have to be continuous");
                }
            }
            C25011Ds.A00(this.A01, new C021109r(arrayList), new C25011Ds(this.A02).A00);
            return;
        }
        throw new IllegalArgumentException("arguments have to be continuous");
    }

    public void A02(String str, Map map) {
        ArrayList arrayList = new ArrayList();
        InterfaceC020509l A0f = AnonymousClass088.A0f(str);
        if (arrayList.size() == 0) {
            arrayList.add(A0f);
            if (map != null) {
                InterfaceC020509l A0f2 = AnonymousClass088.A0f(map);
                if (arrayList.size() == 1) {
                    arrayList.add(A0f2);
                } else {
                    throw new IllegalArgumentException("arguments have to be continuous");
                }
            }
            C25011Ds.A00(this.A01, new C021109r(arrayList), new C25011Ds(this.A02).A00);
            return;
        }
        throw new IllegalArgumentException("arguments have to be continuous");
    }

    public void A03(String str, Map map) {
        if (this.A00) {
            C45U c45u = this.A03;
            RunnableC56582na runnableC56582na = new RunnableC56582na(this, str, map);
            if (c45u.A00) {
                runnableC56582na.run();
            } else {
                c45u.A01.add(runnableC56582na);
            }
        }
    }

    public void A04(String str, Map map) {
        if (this.A00) {
            C45U c45u = this.A03;
            RunnableC56592nb runnableC56592nb = new RunnableC56592nb(this, str, map);
            if (c45u.A00) {
                runnableC56592nb.run();
            } else {
                c45u.A01.add(runnableC56592nb);
            }
        }
    }
}
