package X;

import java.lang.ref.WeakReference;

/* renamed from: X.3lb */
/* loaded from: classes2.dex */
public class C79403lb implements InterfaceC010405f {
    public final C018508q A00;
    public final C05Y A01;
    public final WeakReference A02;
    public final boolean A03;

    public C79403lb(C018508q c018508q, C05Y c05y, InterfaceC458223w interfaceC458223w, boolean z) {
        this.A00 = c018508q;
        this.A01 = c05y;
        this.A02 = new WeakReference(interfaceC458223w);
        this.A03 = z;
    }

    public void A00(C011005l c011005l) {
        C05Y c05y = this.A01;
        String A02 = c05y.A02();
        boolean z = this.A03;
        c05y.A06(z ? 105 : 106, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "w:g2", null, (byte) 0), new C04P("type", z ? "set" : "get", null, (byte) 0), new C04P("to", c011005l)}, new C02590Ca("invite", null, null, null)), this, 32000L);
    }

    public final void A01(String str, int i) {
        Object obj = this.A02.get();
        if (obj != null) {
            C018508q c018508q = this.A00;
            c018508q.A02.post(new RunnableEBaseShape1S1201000_I1(this, obj, str, i, 0));
        }
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        A01(null, 0);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        A01(null, C40731sm.A01(c02590Ca));
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        String str2;
        C02590Ca A0C = c02590Ca.A0C(0);
        C02590Ca.A01(A0C, "invite");
        C04P A0A = A0C.A0A("code");
        if (A0A != null) {
            str2 = A0A.A03;
        } else {
            str2 = null;
        }
        A01(str2, 0);
    }
}
