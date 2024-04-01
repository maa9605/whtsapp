package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.1nK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C37961nK implements InterfaceC010405f {
    public boolean A00;
    public final AbstractC005302j A01;
    public final C05Y A02;
    public final C04510Kl A03;
    public final C04500Kk A04;

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
    }

    public C37961nK(AbstractC005302j abstractC005302j, C04500Kk c04500Kk, C05Y c05y, C04510Kl c04510Kl) {
        this.A01 = abstractC005302j;
        this.A04 = c04500Kk;
        this.A02 = c05y;
        this.A03 = c04510Kl;
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        C04510Kl c04510Kl = this.A03;
        int A01 = C40731sm.A01(c02590Ca);
        if (c04510Kl != null) {
            StringBuilder A0Q = C000200d.A0Q("profilephotohandler/request failed : ", A01, " | ");
            AbstractC005302j abstractC005302j = c04510Kl.A0J;
            A0Q.append(abstractC005302j);
            Log.i(A0Q.toString());
            c04510Kl.A01(3);
            c04510Kl.A04 = true;
            c04510Kl.A01.cancel();
            C04510Kl.A0O.remove(c04510Kl.A02.toString());
            if (!c04510Kl.A05) {
                C06C A0A = c04510Kl.A0A.A0A(abstractC005302j);
                if (A01 == 401 && A0A.A0C() && !c04510Kl.A0G.A05((GroupJid) A0A.A03(GroupJid.class))) {
                    C018508q c018508q = c04510Kl.A08;
                    c018508q.A02.post(new RunnableEBaseShape1S0101000_I1(c04510Kl, A01, 5));
                } else {
                    C018508q c018508q2 = c04510Kl.A08;
                    c018508q2.A02.post(new RunnableEBaseShape1S0101000_I1(c04510Kl, A01, 6));
                }
            }
            C04500Kk c04500Kk = c04510Kl.A0L;
            if (c04500Kk != null) {
                c04510Kl.A0N.A0E(c04500Kk.A01, A01);
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.InterfaceC010405f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void APJ(java.lang.String r15, X.C02590Ca r16) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37961nK.APJ(java.lang.String, X.0Ca):void");
    }
}
