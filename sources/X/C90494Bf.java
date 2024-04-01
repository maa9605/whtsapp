package X;

import android.app.Activity;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.AbstractList;
import java.util.ArrayList;

/* renamed from: X.4Bf */
/* loaded from: classes3.dex */
public class C90494Bf extends C0HS {
    public final Activity A00;
    public final AnonymousClass093 A01;
    public final C3NS A02;
    public final /* synthetic */ C90504Bg A03;

    public C90494Bf(C90504Bg c90504Bg, AnonymousClass093 anonymousClass093, C3NS c3ns, Activity activity) {
        this.A03 = c90504Bg;
        this.A01 = anonymousClass093;
        this.A02 = c3ns;
        this.A00 = activity;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        C0DV c0dv = this.A03.A09;
        c0dv.A04();
        AbstractList abstractList = (AbstractList) C0N2.A03(c0dv.A08.A0B(), C03650Gn.A0E);
        if (abstractList.size() > 0) {
            return abstractList.get(0);
        }
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C3NS c3ns;
        C0N2 c0n2 = (C0N2) obj;
        if (c0n2 == null && (c3ns = this.A02) != null) {
            c3ns.ANl(new C28Q());
        }
        C90504Bg c90504Bg = this.A03;
        C4C2 c4c2 = new C4C2(c90504Bg.A02.A00, c90504Bg.A00, c90504Bg.A0A, c90504Bg.A01, c90504Bg.A06, c90504Bg.A08, c90504Bg.A07);
        final C3NS c3ns2 = new C3NS() { // from class: X.3hR
            {
                C90494Bf.this = this;
            }

            @Override // X.C3NS
            public final void ANl(C28Q c28q) {
                C90494Bf.this.A0B(c28q);
            }
        };
        AnonymousClass093 anonymousClass093 = this.A01;
        C4GJ c4gj = (C4GJ) anonymousClass093.A09;
        if (c4gj != null) {
            C4IA c4ia = (C4IA) c0n2.A06;
            if (c4ia != null) {
                String str = anonymousClass093.A0I;
                C014006r c014006r = anonymousClass093.A07;
                C02590Ca c02590Ca = null;
                if (c014006r == null) {
                    c014006r = null;
                }
                String str2 = c4gj.A0B;
                String str3 = c4gj.A0C;
                String str4 = c4gj.A09;
                String str5 = c4gj.A0A;
                String str6 = c4ia.A0A;
                ArrayList A0Y = C000200d.A0Y("PAY: rejectCollect called");
                A0Y.add(new C04P("action", "upi-reject-collect", null, (byte) 0));
                A0Y.add(new C04P("id", str, null, (byte) 0));
                A0Y.add(new C04P("device-id", c4c2.A04.A02(), null, (byte) 0));
                if (c014006r != null) {
                    c02590Ca = ((C48B) c4c2).A01.A03(c014006r, C013806p.A05);
                } else {
                    Log.e("PAY: IndiaUpiCollectVpaAction rejectCollect: amount is null");
                }
                C000200d.A1A("sender-vpa", str2, A0Y);
                if (!TextUtils.isEmpty(str3)) {
                    C000200d.A1A("sender-vpa-id", str3, A0Y);
                }
                C000200d.A1A("receiver-vpa", str4, A0Y);
                if (!TextUtils.isEmpty(str5)) {
                    C000200d.A1A("receiver-vpa-id", str5, A0Y);
                }
                C000200d.A1A("upi-bank-info", str6, A0Y);
                C3NV c3nv = ((C48B) c4c2).A00;
                if (c3nv != null) {
                    c3nv.A04("upi-reject-collect");
                }
                ((C48B) c4c2).A01.A0F("set", new C02590Ca("account", (C04P[]) A0Y.toArray(new C04P[0]), c02590Ca), new C91754Gd(c4c2.A00, c4c2.A01, c4c2.A02, c4c2.A03, c3nv) { // from class: X.4II
                    @Override // X.C91754Gd, X.C28V
                    public void A02(C28Q c28q) {
                        super.A02(c28q);
                        C3NS c3ns3 = c3ns2;
                        if (c3ns3 != null) {
                            c3ns3.ANl(c28q);
                        }
                    }

                    @Override // X.C91754Gd, X.C28V
                    public void A03(C28Q c28q) {
                        super.A03(c28q);
                        C3NS c3ns3 = c3ns2;
                        if (c3ns3 != null) {
                            c3ns3.ANl(c28q);
                        }
                    }

                    @Override // X.C91754Gd, X.C28V
                    public void A04(C02590Ca c02590Ca2) {
                        super.A04(c02590Ca2);
                        C3NS c3ns3 = c3ns2;
                        if (c3ns3 != null) {
                            c3ns3.ANl(null);
                        }
                    }
                }, 0L);
                return;
            }
            throw null;
        }
        throw null;
    }

    public /* synthetic */ void A0A() {
        StringBuilder A0P = C000200d.A0P("PAY: rejectCollect; request is expired; transaction id: ");
        AnonymousClass093 anonymousClass093 = this.A01;
        C000200d.A1N(A0P, anonymousClass093.A0I);
        this.A03.A03.A0d(anonymousClass093);
    }

    public /* synthetic */ void A0B(C28Q c28q) {
        int i;
        if (c28q != null && (i = c28q.A00) == 11495) {
            C000200d.A1F(C000200d.A0P("PAY: reject collect; error code: "), i);
            C90504Bg c90504Bg = this.A03;
            c90504Bg.A0B.AS1(new C3NP(this));
            c90504Bg.A00.A03();
            C002701i.A19(this.A00, 100);
            return;
        }
        C3NS c3ns = this.A02;
        if (c3ns == null) {
            return;
        }
        c3ns.ANl(c28q);
    }
}
