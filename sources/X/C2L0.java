package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2L0  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2L0 implements InterfaceC010405f {
    public C2KY A00;
    public final C018508q A01;
    public final C56022ma A02;
    public final C05Y A03;

    public C2L0(C018508q c018508q, C05Y c05y, C56022ma c56022ma) {
        this.A01 = c018508q;
        this.A03 = c05y;
        this.A02 = c56022ma;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        this.A00.AJq(new Pair(2, "delivery failed"));
        Log.i("RefreshCart/onDeliveryFailure");
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        if (this.A00 == null) {
            return;
        }
        Pair A09 = C40731sm.A09(c02590Ca);
        C018508q c018508q = this.A01;
        c018508q.A02.post(new RunnableEBaseShape0S0200000_I0_0(this, A09, 18));
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        if (this.A00 == null) {
            return;
        }
        C56022ma c56022ma = this.A02;
        C49372Kb c49372Kb = null;
        if (c56022ma != null) {
            C02590Ca A0D = c02590Ca.A0D("cart");
            if (A0D != null) {
                List<C02590Ca> A0H = A0D.A0H("product");
                ArrayList arrayList = new ArrayList();
                for (C02590Ca c02590Ca2 : A0H) {
                    C468628o A01 = C2U0.A01(c02590Ca2);
                    if (A01 == null) {
                        if (c56022ma.A00 != null) {
                            C02590Ca A0D2 = c02590Ca2.A0D("id");
                            C02590Ca A0D3 = c02590Ca2.A0D("status");
                            String A0F = A0D2 == null ? null : A0D2.A0F();
                            C468728p c468728p = A0D3 == null ? null : new C468728p(3);
                            if (A0F != null) {
                                A01 = new C468628o(A0F, "", null, null, null, null, null, new ArrayList(), c468728p, null, null, 0, true, false);
                            }
                        } else {
                            throw null;
                        }
                    }
                    arrayList.add(A01);
                }
                c56022ma.A02.A01(A0D.A0D("price"));
                c49372Kb = new C49372Kb(arrayList);
            }
            this.A01.A02.post(new RunnableEBaseShape0S0200000_I0_0(this, c49372Kb, 17));
            return;
        }
        throw null;
    }
}
