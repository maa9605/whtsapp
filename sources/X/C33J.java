package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.33J  reason: invalid class name */
/* loaded from: classes2.dex */
public class C33J implements InterfaceC010405f {
    public final C06K A00;
    public final C2L3 A01;
    public final AnonymousClass272 A02;
    public final C2U0 A03;
    public final C0E7 A04;
    public final C60052tq A05;
    public final C05Y A06;

    public C33J(C05Y c05y, C2L3 c2l3, C60052tq c60052tq, AnonymousClass272 anonymousClass272, C0E7 c0e7, C06K c06k, C2U0 c2u0) {
        this.A06 = c05y;
        this.A01 = c2l3;
        this.A05 = c60052tq;
        this.A02 = anonymousClass272;
        this.A04 = c0e7;
        this.A00 = c06k;
        this.A03 = c2u0;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("sendGetBizProduct/delivery-error");
        C2L3 c2l3 = this.A01;
        C60052tq c60052tq = this.A05;
        C018508q c018508q = c2l3.A06;
        c018508q.A02.post(new RunnableEBaseShape1S0201000_I1(c2l3, 0, c60052tq, 3));
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("sendGetBizProduct/response-error");
        C2L3 c2l3 = this.A01;
        C60052tq c60052tq = this.A05;
        int A01 = C40731sm.A01(c02590Ca);
        C018508q c018508q = c2l3.A06;
        c018508q.A02.post(new RunnableEBaseShape1S0201000_I1(c2l3, A01, c60052tq, 3));
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C2U0 c2u0 = this.A03;
        C59952tg A02 = c2u0.A02(c02590Ca);
        C60052tq c60052tq = this.A05;
        UserJid userJid = c60052tq.A00;
        c2u0.A03(c02590Ca, userJid, this.A00);
        if (A02 != null) {
            List list = A02.A01;
            if (!list.isEmpty()) {
                this.A02.A09((C468628o) list.get(0), userJid);
                C2L3 c2l3 = this.A01;
                String str2 = ((C468628o) list.get(0)).A09;
                C018508q c018508q = c2l3.A06;
                c018508q.A02.post(new RunnableEBaseShape1S1200000_I1(c2l3, c60052tq, str2, 0));
                return;
            }
        }
        Log.e("sendGetBizProduct/error: empty response");
    }
}
