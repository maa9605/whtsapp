package X;

import java.util.LinkedHashSet;

/* renamed from: X.0vF */
/* loaded from: classes.dex */
public class C19330vF {
    public final InterfaceC18820uO A00;
    public final C29661Xv A02;
    public final LinkedHashSet A03 = new LinkedHashSet();
    public final C29581Xl A01 = new C29581Xl(this);

    public C19330vF(InterfaceC18820uO interfaceC18820uO, C29661Xv c29661Xv) {
        this.A00 = interfaceC18820uO;
        this.A02 = c29661Xv;
    }

    public AbstractC19030uj A00(int i, AbstractC19030uj abstractC19030uj) {
        C19400vN c19400vN;
        AbstractC19030uj abstractC19030uj2;
        AbstractC19030uj abstractC19030uj3;
        C29661Xv c29661Xv = this.A02;
        C29591Xm c29591Xm = new C29591Xm(this.A00, i);
        C29581Xl c29581Xl = this.A01;
        c29661Xv.A04();
        synchronized (c29661Xv) {
            C19390vM c19390vM = c29661Xv.A04;
            c19400vN = (C19400vN) c19390vM.A02(c29591Xm);
            C19390vM c19390vM2 = c29661Xv.A03;
            C19400vN c19400vN2 = (C19400vN) c19390vM2.A02(c29591Xm);
            abstractC19030uj2 = null;
            if (c19400vN2 != null) {
                c29661Xv.A05(c19400vN2);
                abstractC19030uj3 = c29661Xv.A02(c19400vN2);
            } else {
                abstractC19030uj3 = null;
            }
            int ADB = c29661Xv.A05.ADB(abstractC19030uj.A04());
            if (ADB <= c29661Xv.A01.A01 && c19390vM2.A00() - c19390vM.A00() <= c29661Xv.A01.A00 - 1 && c19390vM2.A01() - c19390vM.A01() <= c29661Xv.A01.A02 - ADB) {
                C19400vN c19400vN3 = new C19400vN(c29591Xm, abstractC19030uj, c29581Xl);
                c19390vM2.A03(c29591Xm, c19400vN3);
                abstractC19030uj2 = c29661Xv.A01(c19400vN3);
            }
        }
        if (abstractC19030uj3 != null) {
            abstractC19030uj3.close();
        }
        C29661Xv.A00(c19400vN);
        c29661Xv.A03();
        return abstractC19030uj2;
    }
}
