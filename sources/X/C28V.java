package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.28V  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C28V implements InterfaceC010405f {
    public final Context A00;
    public final C018508q A01;
    public final C0E7 A02;
    public final C28S A03;

    public abstract void A02(C28Q c28q);

    public abstract void A03(C28Q c28q);

    public abstract void A04(C02590Ca c02590Ca);

    public C28V(Context context, C018508q c018508q, C0E7 c0e7, C28S c28s) {
        this.A00 = context;
        this.A01 = c018508q;
        this.A02 = c0e7;
        this.A03 = c28s;
    }

    public static List A00(C02590Ca c02590Ca) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (C02590Ca c02590Ca2 : c02590Ca.A0H("error")) {
            if (c02590Ca2 != null) {
                C04P A0A = c02590Ca2.A0A("code");
                if (A0A != null) {
                    str = A0A.A03;
                } else {
                    str = null;
                }
                C04P A0A2 = c02590Ca2.A0A("text");
                String str2 = A0A2 != null ? A0A2.A03 : null;
                c02590Ca2.A0A("display_title");
                c02590Ca2.A0A("display_text");
                if (str != null) {
                    int parseInt = Integer.parseInt(str);
                    C28Q c28q = new C28Q();
                    c28q.A00 = parseInt;
                    c28q.A06 = str2;
                    arrayList.add(c28q);
                    if (parseInt == 454) {
                        c28q.A04 = c02590Ca2.A0D("step_up");
                    }
                }
            }
        }
        return arrayList;
    }

    public List A01(C02590Ca c02590Ca) {
        return A00(c02590Ca);
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        C28Q c28q = new C28Q();
        c28q.A00 = C0E7.A02(this.A00) ? -2 : 6;
        this.A01.A0G(new RunnableEBaseShape3S0200000_I0_3(this, c28q, 29));
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        for (C28Q c28q : A01(c02590Ca)) {
            C28S c28s = this.A03;
            int i = c28q.A00;
            C47302Ar c47302Ar = c28s.A00;
            if (c47302Ar != null && (i == 404 || i == 440 || i == 449)) {
                c47302Ar.A02(true, false);
            }
            this.A01.A0G(new RunnableEBaseShape3S0200000_I0_3(this, c28q, 28));
        }
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        this.A01.A0G(new RunnableEBaseShape3S0200000_I0_3(this, c02590Ca, 30));
    }
}
