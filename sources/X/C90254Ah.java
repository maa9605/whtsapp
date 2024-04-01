package X;

/* renamed from: X.4Ah  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90254Ah {
    public int A00 = 0;
    public C46P A01;
    public C46R A02;
    public C46S A03;
    public final C91704Fy A04;

    public C90254Ah(C91704Fy c91704Fy) {
        this.A04 = c91704Fy;
    }

    public void A00() {
        C91704Fy c91704Fy = this.A04;
        C46S c46s = this.A03;
        C46P c46p = this.A01;
        C46R c46r = this.A02;
        int i = this.A00;
        if (c91704Fy != null) {
            C46O c46o = new C46O();
            if (c46s != null) {
                try {
                    c46s.ANA(c46o);
                } catch (Exception e) {
                    c46o.A00 = e;
                }
            }
            if (1 == i) {
                if (!((C0E7) c91704Fy.A01.get()).A05()) {
                    c46o.A00 = new C46Q("Require Internet");
                }
            } else if (2 == i && !((C0E7) c91704Fy.A01.get()).A05()) {
                c46o.A00 = new C46Q() { // from class: X.46y
                };
            }
            if (c46o.A00 == null && c46p != null) {
                ((InterfaceC002901k) c91704Fy.A02.get()).AS1(new C2o5(c91704Fy, c46o, c46p, c46r));
                return;
            } else {
                c91704Fy.A02(c46r, c46o);
                return;
            }
        }
        throw null;
    }
}
