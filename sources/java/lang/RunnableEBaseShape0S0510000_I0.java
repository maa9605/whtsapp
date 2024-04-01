package java.lang;

import X.AbstractC005302j;
import X.AnonymousClass092;
import X.AnonymousClass097;
import X.AnonymousClass296;
import X.AnonymousClass297;
import X.C000200d;
import X.C04020Ic;
import X.C04130Ir;
import X.C04140Is;
import X.C09H;
import X.C22a;
import X.C2L8;
import X.C3FJ;
import X.C41771uU;
import X.C42441vk;
import X.C42451vl;
import X.C43211x2;
import X.C44551zG;
import X.C454422b;
import X.C454622d;
import X.C48282Eq;
import X.C49182Ix;
import X.C67433Fm;
import X.C87033z0;
import X.InterfaceC04070Ih;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0510000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    public RunnableEBaseShape0S0510000_I0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.A06) {
            case 0:
                ((C49182Ix) this.A00).A01((C2L8) this.A01, (AnonymousClass296) this.A02, (C87033z0) this.A03, (AnonymousClass297) this.A04, this.A05);
                return;
            case 1:
                C41771uU c41771uU = (C41771uU) this.A00;
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A01;
                Jid jid = (Jid) this.A02;
                AbstractC005302j abstractC005302j = (AbstractC005302j) this.A03;
                boolean z2 = this.A05;
                UserJid userJid = (UserJid) this.A04;
                StringBuilder A0P = C000200d.A0P("app/mediajobmanager/enqueuemediaresendupload enqueuing message: ");
                A0P.append(anonymousClass092.A0n);
                Log.i(A0P.toString());
                C04130Ir c04130Ir = new C04130Ir(Collections.singletonList(anonymousClass092));
                C454422b A00 = C454422b.A00(c41771uU.A0D, new C22a(false, c04130Ir.A04()), c04130Ir, c41771uU.A01, c41771uU.A0E, false);
                C44551zG c44551zG = c41771uU.A09;
                C454622d A06 = c44551zG.A06(A00, false);
                A06.A01().A03(3);
                C04140Is A002 = A06.A00();
                if (c41771uU.A07.A0C(475)) {
                    C48282Eq c48282Eq = c41771uU.A0C;
                    if (c48282Eq.A00.A01() - A002.A05 < 1800000 || !c48282Eq.A00(A002)) {
                        return;
                    }
                }
                c04130Ir.A02();
                c41771uU.A05(c04130Ir, A06);
                A06.A0S = "mms";
                A06.A09.A03(new C3FJ(c41771uU, c04130Ir, A06), c41771uU.A0L);
                c44551zG.A0A(A06, new C67433Fm(A06.A02(), A06, jid, abstractC005302j, z2, userJid));
                return;
            case 2:
                C42451vl c42451vl = (C42451vl) this.A00;
                C43211x2 c43211x2 = (C43211x2) this.A01;
                AnonymousClass097 anonymousClass097 = (AnonymousClass097) this.A02;
                InterfaceC04070Ih interfaceC04070Ih = (InterfaceC04070Ih) this.A04;
                boolean z3 = this.A05;
                C42451vl.A01(true, c43211x2, anonymousClass097);
                C42441vk c42441vk = c42451vl.A0R;
                C09H c09h = anonymousClass097.A02;
                HashMap hashMap = c42441vk.A00;
                synchronized (hashMap) {
                    hashMap.remove(c09h);
                }
                C04020Ic A01 = c43211x2.A01();
                if (A01 != null) {
                    if (interfaceC04070Ih != null) {
                        if (A01.A01 == 13) {
                            if (c43211x2.A04() != null) {
                                z = c43211x2.A04().booleanValue();
                            } else {
                                z = false;
                            }
                            interfaceC04070Ih.AJX(z);
                        } else {
                            interfaceC04070Ih.AJY(A01, c43211x2);
                        }
                    }
                    c42451vl.A09(z3, anonymousClass097, A01.A01);
                    return;
                }
                throw null;
            default:
                return;
        }
    }
}
