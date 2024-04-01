package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.26g */
/* loaded from: classes2.dex */
public class C463026g {
    public static volatile C463026g A0M;
    public final C018508q A00;
    public final C02L A01;
    public final C0E7 A02;
    public final AnonymousClass012 A03;
    public final C001200o A04;
    public final C0C9 A05;
    public final C013406l A06;
    public final C05Y A07;
    public final C0GZ A08;
    public final C03540Gc A09;
    public final C28S A0A;
    public final C03550Gd A0B;
    public final C0EU A0C;
    public final C0GR A0D;
    public final C0DW A0E;
    public final C0DV A0F;
    public final C014406v A0G = C014406v.A00("PaymentsActionManager", "network", "COMMON");
    public final C28W A0H;
    public final C05V A0I;
    public final C0KR A0J;
    public final C05U A0K;
    public final AnonymousClass035 A0L;

    public C463026g(C001200o c001200o, AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C013406l c013406l, C05Y c05y, C05U c05u, C0DV c0dv, C0C9 c0c9, AnonymousClass035 anonymousClass035, C05V c05v, C0EU c0eu, C0E7 c0e7, C0GZ c0gz, C28W c28w, C0KR c0kr, C0DW c0dw, C0GR c0gr, C03540Gc c03540Gc, C28S c28s, C03550Gd c03550Gd) {
        this.A04 = c001200o;
        this.A03 = anonymousClass012;
        this.A00 = c018508q;
        this.A01 = c02l;
        this.A06 = c013406l;
        this.A07 = c05y;
        this.A0K = c05u;
        this.A0F = c0dv;
        this.A05 = c0c9;
        this.A0L = anonymousClass035;
        this.A0I = c05v;
        this.A0C = c0eu;
        this.A02 = c0e7;
        this.A08 = c0gz;
        this.A0H = c28w;
        this.A0J = c0kr;
        this.A0E = c0dw;
        this.A0D = c0gr;
        this.A09 = c03540Gc;
        this.A0A = c28s;
        this.A0B = c03550Gd;
    }

    public static C463026g A00() {
        if (A0M == null) {
            synchronized (C463026g.class) {
                if (A0M == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C018508q A002 = C018508q.A00();
                    C02L A003 = C02L.A00();
                    C013406l A004 = C013406l.A00();
                    C05Y A01 = C05Y.A01();
                    C05U A012 = C05U.A01();
                    C0DV A005 = C0DV.A00();
                    C0C9 A006 = C0C9.A00();
                    AnonymousClass035 A007 = AnonymousClass035.A00();
                    C05V A013 = C05V.A01();
                    C0EU A008 = C0EU.A00();
                    C0E7 A009 = C0E7.A00();
                    C0GZ A0010 = C0GZ.A00();
                    if (C28W.A02 == null) {
                        synchronized (C0EU.class) {
                            if (C28W.A02 == null) {
                                C28W.A02 = new C28W(C02O.A00());
                            }
                        }
                    }
                    C28W c28w = C28W.A02;
                    C0KR A0011 = C0KR.A00();
                    C0DW A0012 = C0DW.A00();
                    C013606n.A03();
                    A0M = new C463026g(c001200o, A00, A002, A003, A004, A01, A012, A005, A006, A007, A013, A008, A009, A0010, c28w, A0011, A0012, C0GR.A00(), C03540Gc.A04, C28S.A00(), C03550Gd.A00());
                }
            }
        }
        return A0M;
    }

    public final C466327p A01(C014006r c014006r, InterfaceC013706o interfaceC013706o) {
        int i;
        C0DX A02 = A02(interfaceC013706o);
        if (A02 != null) {
            i = A02.A9N(interfaceC013706o.A9K());
        } else {
            i = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        }
        long doubleValue = (int) (c014006r.A00.doubleValue() * i);
        if (i <= 0) {
            return new C466327p(doubleValue, 1, interfaceC013706o);
        }
        return new C466327p(doubleValue, i, interfaceC013706o);
    }

    public final C0DX A02(InterfaceC013706o interfaceC013706o) {
        return this.A0F.A02(this.A0D.A02().A02).ACJ(interfaceC013706o.A9K());
    }

    public C02590Ca A03(C014006r c014006r, InterfaceC013706o interfaceC013706o) {
        int A9N = A02(interfaceC013706o).A9N(interfaceC013706o.A9K());
        return A04("amount", (int) (c014006r.A00.doubleValue() * A9N), A9N, interfaceC013706o);
    }

    public C02590Ca A04(String str, long j, int i, InterfaceC013706o interfaceC013706o) {
        C466327p c466327p;
        C0DX A02 = A02(interfaceC013706o);
        if (i <= 0) {
            c466327p = new C466327p(j, 1, interfaceC013706o);
        } else {
            c466327p = new C466327p(j, i, interfaceC013706o);
        }
        return new C02590Ca(str, (C04P[]) null, A02 != null ? A02.ABU(c466327p) : null);
    }

    public void A05(int i, final InterfaceC03640Gm interfaceC03640Gm) {
        SharedPreferences sharedPreferences;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("version", i));
        arrayList.add(new C04P("action", "get-methods", null, (byte) 0));
        final C28Y c28y = new C28Y(new C28X((C04P[]) arrayList.toArray(new C04P[0])));
        C28W c28w = this.A0H;
        synchronized (c28w) {
            sharedPreferences = c28w.A00;
            if (sharedPreferences == null) {
                sharedPreferences = c28w.A01.A01("com.whatsapp_payment_sync_preferences");
                c28w.A00 = sharedPreferences;
            }
        }
        final String string = sharedPreferences.getString(c28y.A01.A00(), null);
        if (string != null) {
            arrayList.add(new C04P("instance-id", string, null, (byte) 0));
        }
        C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null);
        C28T AA9 = this.A0F.A03().AA9();
        if (AA9 != null) {
            AA9.AV3();
        }
        A0F("get", c02590Ca, new C28V(this.A04.A00, this.A00, this.A02, this.A0A) { // from class: X.28Z
            {
                C463026g.this = this;
            }

            @Override // X.C28V
            public void A02(C28Q c28q) {
                C463026g c463026g = C463026g.this;
                C014406v c014406v = c463026g.A0G;
                StringBuilder sb = new StringBuilder("get-methods: on-request-error=");
                sb.append(c28q);
                c014406v.A04(sb.toString());
                C28T AA92 = c463026g.A0F.A03().AA9();
                if (AA92 != null) {
                    AA92.AKk(c28q);
                }
                InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                if (interfaceC03640Gm2 != null) {
                    interfaceC03640Gm2.ANw(c28q);
                }
            }

            @Override // X.C28V
            public void A03(C28Q c28q) {
                C463026g c463026g = C463026g.this;
                C014406v c014406v = c463026g.A0G;
                StringBuilder sb = new StringBuilder("get-methods: on-response-error=");
                sb.append(c28q);
                c014406v.A04(sb.toString());
                C28T AA92 = c463026g.A0F.A03().AA9();
                if (AA92 != null) {
                    AA92.AKk(c28q);
                }
                InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                if (interfaceC03640Gm2 != null) {
                    interfaceC03640Gm2.AO1(c28q);
                }
            }

            @Override // X.C28V
            public void A04(C02590Ca c02590Ca2) {
                String str;
                C463026g c463026g = C463026g.this;
                c463026g.A0G.A05("get-methods: on-response-success");
                C0DV c0dv = c463026g.A0F;
                C28T AA92 = c0dv.A03().AA9();
                if (AA92 != null) {
                    AA92.AKk(null);
                }
                C02590Ca A0D = c02590Ca2.A0D("account");
                C04P A0A = A0D.A0A("instance-id");
                if (A0A != null) {
                    str = A0A.A03;
                    if (str != null && str.equals(string)) {
                        C04P A0A2 = A0D.A0A("wa-support-phone-number");
                        String str2 = A0A2 != null ? A0A2.A03 : null;
                        if (!TextUtils.isEmpty(str2)) {
                            C000200d.A0k(c463026g.A0C, "payments_support_phone_number", str2);
                        }
                        InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                        if (interfaceC03640Gm2 != null) {
                            C77113hg c77113hg = new C77113hg();
                            c0dv.A04();
                            c77113hg.A00 = c0dv.A08.A0A();
                            interfaceC03640Gm2.AO2(c77113hg);
                            return;
                        }
                        return;
                    }
                } else {
                    str = null;
                }
                AbstractC013506m.A04(c463026g.A0J.A05(A0D));
                c463026g.A0E.A01();
                final InterfaceC03640Gm interfaceC03640Gm3 = interfaceC03640Gm;
                c463026g.A06(interfaceC03640Gm3 != null ? new C28N() { // from class: X.3hY
                    @Override // X.C28N
                    public final void AH2(List list) {
                        InterfaceC03640Gm interfaceC03640Gm4 = interfaceC03640Gm3;
                        C77113hg c77113hg2 = new C77113hg();
                        c77113hg2.A00 = list;
                        interfaceC03640Gm4.AO2(c77113hg2);
                    }
                } : null, c02590Ca2, false);
                C28W c28w2 = c463026g.A0H;
                C28Y c28y2 = c28y;
                if (str == null) {
                    str = "";
                }
                c28w2.A00(c28y2, str);
            }
        }, 0L);
    }

    public void A06(C28N c28n, C02590Ca c02590Ca, boolean z) {
        C0EU c0eu;
        ArrayList A05 = this.A0J.A05(c02590Ca.A0D("account"));
        if (A05 != null && !A05.isEmpty()) {
            if (AbstractC013506m.A04(A05)) {
                this.A0F.A01().A03(A05, c28n);
            } else if (z) {
                A05(2, null);
                return;
            } else {
                return;
            }
        } else {
            final C03560Ge A01 = this.A0F.A01();
            InterfaceC002901k interfaceC002901k = A01.A03;
            interfaceC002901k.ARy(new C28b(interfaceC002901k, A01.A01, A01.A02, c28n) { // from class: X.28a
                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    return new C60012tm(A01.A01.A0G(), new ArrayList(0));
                }
            }, new Void[0]);
        }
        if (A05 != null && A05.size() > 0) {
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                C0N2 c0n2 = (C0N2) it.next();
                if ((c0n2 instanceof C0N7) && c0n2.A01 == 2) {
                    c0eu = this.A0C;
                    C000200d.A0l(c0eu, "payments_card_can_receive_payment", true);
                    break;
                }
            }
        }
        c0eu = this.A0C;
        C000200d.A0l(c0eu, "payments_card_can_receive_payment", false);
        long A052 = c0eu.A01.A05();
        c0eu.A04().edit().putLong("payments_methods_last_sync_time", A052).apply();
        C014406v c014406v = c0eu.A02;
        StringBuilder sb = new StringBuilder("updateMethodsLastSyncTimeMilli to: ");
        sb.append(A052);
        c014406v.A07(null, sb.toString(), null);
    }

    public void A07(AnonymousClass092 anonymousClass092) {
        if (!this.A0E.A02()) {
            C014406v c014406v = this.A0G;
            StringBuilder A0P = C000200d.A0P("decline/cancelPaymentRequest is not enabled for country: ");
            A0P.append(this.A0D.A02());
            c014406v.A07(null, A0P.toString(), null);
        } else if (anonymousClass092.A0n.A00 == null) {
            this.A0G.A07(null, "requestPayment found null or empty args jid", null);
        } else {
            this.A0G.A07(null, "userActionHandlePaymentRequest", null);
            this.A05.A0j(anonymousClass092);
        }
    }

    public void A08(AnonymousClass092 anonymousClass092, UserJid userJid, C014006r c014006r) {
        if (!this.A0E.A02()) {
            C014406v c014406v = this.A0G;
            StringBuilder A0P = C000200d.A0P("requestPayment is not enabled for country: ");
            A0P.append(this.A0D.A02());
            c014406v.A07(null, A0P.toString(), null);
            return;
        }
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        if (abstractC005302j != null && ((!C003101m.A0U(abstractC005302j) || userJid != null) && c014006r != null)) {
            C0GR c0gr = this.A0D;
            C03650Gn A02 = c0gr.A02();
            if (A02 != null) {
                InterfaceC013706o interfaceC013706o = A02.A09;
                C0DX A022 = A02(interfaceC013706o);
                C02L c02l = this.A01;
                c02l.A05();
                C0K1 c0k1 = c02l.A01;
                if (c0k1 != null) {
                    String A9K = c0gr.A01().A9K();
                    InterfaceC013706o A01 = c0gr.A01();
                    C05V c05v = this.A0I;
                    String str = C05V.A00(c05v.A01, c05v.A00, userJid, true).A01;
                    String str2 = c0gr.A02().A02;
                    AnonymousClass093 A023 = AnonymousClass093.A02(10, 11, userJid, (UserJid) c0k1.A09, A9K, c014006r, A01, -1L, str, str2, AnonymousClass093.A01(str2), A022.AD6());
                    C0K8 AEp = A022.AEp();
                    AEp.A00 = A01(c014006r, interfaceC013706o);
                    A023.A09 = AEp;
                    C014406v c014406v2 = this.A0G;
                    c014406v2.A07(null, "userActionRequestPayment", null);
                    long A05 = this.A03.A05();
                    anonymousClass092.A0E = A05;
                    anonymousClass092.A0b = "UNSET";
                    anonymousClass092.A0F = A023;
                    A023.A04 = A05;
                    A023.A01 = 12;
                    A023.A0I = A023.A0I;
                    A023.A0E(A023.A09, this.A0F.A03().AC0().ACH() + A05);
                    c014406v2.A07(null, "userActionHandlePaymentRequest", null);
                    this.A05.A0j(anonymousClass092);
                    return;
                }
                throw null;
            }
            throw null;
        }
        C014406v c014406v3 = this.A0G;
        StringBuilder A0P2 = C000200d.A0P("requestPayment found null or empty args jid: ");
        A0P2.append(abstractC005302j);
        A0P2.append(" receiver: ");
        A0P2.append(userJid);
        c014406v3.A07(null, A0P2.toString(), null);
    }

    public void A09(C05190Nr c05190Nr, C04420Kc c04420Kc, C02590Ca c02590Ca, C467628d c467628d) {
        AnonymousClass093 A04 = this.A0J.A04(c02590Ca);
        if (c05190Nr != null) {
            c05190Nr.A05 = A04;
        } else if (c467628d != null) {
            StringBuilder sb = new StringBuilder("xmpp/reader/on-recv-payment-transaction-update: stanzaKey:");
            sb.append(c04420Kc);
            sb.append(" paymentTransactionInfo id:");
            C000200d.A1N(sb, A04.A0I);
            InterfaceC467728e interfaceC467728e = c467628d.A00;
            Message obtain = Message.obtain(null, 0, 133, 0);
            Bundle data = obtain.getData();
            data.putParcelable("stanzaKey", c04420Kc);
            data.putParcelable("paymentTransactionInfo", A04);
            ((HandlerC467828f) interfaceC467728e).A00(obtain);
        } else {
            throw null;
        }
    }

    public void A0A(C02590Ca c02590Ca, final InterfaceC03640Gm interfaceC03640Gm) {
        A0F("set", c02590Ca, new C28V(this.A04.A00, this.A00, this.A02, this.A0A) { // from class: X.28g
            {
                C463026g.this = this;
            }

            @Override // X.C28V
            public void A02(C28Q c28q) {
                InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                if (interfaceC03640Gm2 != null) {
                    interfaceC03640Gm2.ANw(c28q);
                }
            }

            @Override // X.C28V
            public void A03(C28Q c28q) {
                InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                if (interfaceC03640Gm2 != null) {
                    interfaceC03640Gm2.AO1(c28q);
                }
            }

            @Override // X.C28V
            public void A04(C02590Ca c02590Ca2) {
                try {
                    C28Q A00 = C28Q.A00(c02590Ca2.A0E("account"));
                    if (A00 != null) {
                        interfaceC03640Gm.AO1(A00);
                        return;
                    }
                    final InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                    C463026g.this.A06(interfaceC03640Gm2 != null ? new C28N() { // from class: X.3ha
                        @Override // X.C28N
                        public final void AH2(List list) {
                            interfaceC03640Gm2.AO2(new C77103hf());
                        }
                    } : null, c02590Ca2, true);
                } catch (C0L4 e) {
                    C014406v c014406v = C463026g.this.A0G;
                    StringBuilder sb = new StringBuilder("removePaymentMethod/onResponseSuccess/corrupt stream exception: ");
                    sb.append(e);
                    c014406v.A04(sb.toString());
                    interfaceC03640Gm.AO1(new C28Q(500));
                }
            }
        }, 30000L);
    }

    public void A0B(C02590Ca c02590Ca, final InterfaceC03640Gm interfaceC03640Gm) {
        A0F("set", c02590Ca, new C28V(this.A04.A00, this.A00, this.A02, this.A0A) { // from class: X.28h
            {
                C463026g.this = this;
            }

            @Override // X.C28V
            public void A02(C28Q c28q) {
                InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                if (interfaceC03640Gm2 != null) {
                    interfaceC03640Gm2.ANw(c28q);
                }
            }

            @Override // X.C28V
            public void A03(C28Q c28q) {
                InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                if (interfaceC03640Gm2 != null) {
                    interfaceC03640Gm2.AO1(c28q);
                }
            }

            @Override // X.C28V
            public void A04(C02590Ca c02590Ca2) {
                C28N c28n;
                final InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                if (interfaceC03640Gm2 != null) {
                    c28n = new C28N() { // from class: X.3hZ
                        @Override // X.C28N
                        public final void AH2(List list) {
                            interfaceC03640Gm2.AO2(new C77103hf());
                        }
                    };
                } else {
                    c28n = null;
                }
                C463026g.this.A06(c28n, c02590Ca2, true);
            }
        }, 30000L);
    }

    public void A0C(C0JJ c0jj, C014006r c014006r, InterfaceC013706o interfaceC013706o, C0N2 c0n2, C0K8 c0k8, String str, String str2, boolean z) {
        boolean A0U;
        C0N2 c0n22;
        C0N2 c0n23 = c0n2;
        C02L c02l = this.A01;
        c02l.A05();
        C0K1 c0k1 = c02l.A01;
        if (c0k1 != null) {
            C468028i c468028i = new C468028i();
            if (!this.A0E.A02()) {
                C014406v c014406v = this.A0G;
                StringBuilder A0P = C000200d.A0P("sendPayment is not enabled for country: ");
                A0P.append(this.A0D.A02());
                c014406v.A07(null, A0P.toString(), null);
                c468028i.A00 = 1;
                return;
            }
            AnonymousClass094 anonymousClass094 = c0jj.A0n;
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (abstractC005302j == null || ((A0U = C003101m.A0U(abstractC005302j)) && c0jj.A0G == null)) {
                C014406v c014406v2 = this.A0G;
                StringBuilder A0P2 = C000200d.A0P("sendPayment found null or empty args jid: ");
                A0P2.append(abstractC005302j);
                A0P2.append(" receiver: ");
                A0P2.append(c0jj.A0G);
                A0P2.append(" payment methods: ");
                c014406v2.A07(null, A0P2.toString(), null);
                c468028i.A00 = 2;
                return;
            } else if (c014006r.A02()) {
                C0DX A02 = A02(interfaceC013706o);
                c0k8.A00 = A01(c014006r, interfaceC013706o);
                try {
                    C014406v c014406v3 = this.A0G;
                    c014406v3.A07(null, "sendPayment building payment to send amount", null);
                    UserJid userJid = (UserJid) c0k1.A09;
                    if (A0U) {
                        abstractC005302j = c0jj.A0G;
                    }
                    UserJid of = UserJid.of(abstractC005302j);
                    String A9K = interfaceC013706o.A9K();
                    C0GR c0gr = this.A0D;
                    String str3 = c0gr.A02().A02;
                    AnonymousClass093 A022 = AnonymousClass093.A02(z ? 100 : 1, 401, userJid, of, A9K, c014006r, interfaceC013706o, -1L, null, str3, AnonymousClass093.A01(str3), A02.AD6());
                    C013406l c013406l = this.A06;
                    List A0B = c013406l.A0B();
                    if (((ArrayList) A0B).size() <= 0) {
                        StringBuilder sb = new StringBuilder("sendPayment not sending payment; got no methods: ");
                        sb.append(A0B);
                        c014406v3.A07(null, sb.toString(), null);
                        c468028i.A00 = 7;
                    } else {
                        Iterator it = ((ArrayList) c013406l.A0B()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                c0n22 = (C0N2) it.next();
                                if (c0n22.A01 == 1) {
                                    break;
                                }
                            } else {
                                c0n22 = null;
                                break;
                            }
                        }
                        if (c0n22 != null && !TextUtils.isEmpty(c0n22.A07)) {
                            if (c0n22.A08() != c0gr.A02().A00) {
                                StringBuilder A0P3 = C000200d.A0P("sendPayment not sending payment; primary methods type ");
                                A0P3.append(c0n22.A08());
                                A0P3.append(" does not match primary account type for country: ");
                                A0P3.append(c0gr.A02().A00);
                                c014406v3.A07(null, A0P3.toString(), null);
                                c468028i.A00 = 3;
                            } else {
                                int A08 = c0n22.A08();
                                if (A08 != 3) {
                                    StringBuilder sb2 = new StringBuilder("sendPayment not sending payment; primary method type unsupported: ");
                                    sb2.append(A08);
                                    c014406v3.A07(null, sb2.toString(), null);
                                    c468028i.A00 = 6;
                                } else {
                                    C0N4 c0n4 = (C0N4) c0n22;
                                    C014006r c014006r2 = c0n4.A01;
                                    if (c014006r2 != null && c014006r2.A02()) {
                                        ArrayList arrayList = new ArrayList(2);
                                        BigDecimal bigDecimal = c014006r2.A00;
                                        BigDecimal bigDecimal2 = c014006r.A00;
                                        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                                            arrayList.add(new C468128j(c0n4, c014006r, 1));
                                        } else {
                                            BigDecimal bigDecimal3 = BigDecimal.ZERO;
                                            if (bigDecimal.compareTo(bigDecimal3) > 0) {
                                                arrayList.add(new C468128j(c0n4, c014006r2, 1));
                                            }
                                            BigDecimal subtract = bigDecimal2.subtract(bigDecimal);
                                            if (subtract.compareTo(bigDecimal3) > 0) {
                                                if ((c0n2 != null || (c0n23 = c013406l.A06()) != null) && !TextUtils.isEmpty(c0n23.A07)) {
                                                    if (AnonymousClass029.A1a(c0gr.A02().A06, c0n23.A08())) {
                                                        arrayList.add(new C468128j(c0n23, new C014006r(subtract, bigDecimal2.scale()), 1));
                                                    }
                                                }
                                                StringBuilder sb3 = new StringBuilder("sendPayment not sending payment; got invalid secondary methods with insufficient balance: ");
                                                sb3.append(c014006r2);
                                                c014406v3.A07(null, sb3.toString(), null);
                                                c468028i.A00 = 9;
                                            }
                                        }
                                        if (arrayList.size() <= 0) {
                                            c014406v3.A07(null, "sendPayment found 0 sources", null);
                                            c468028i.A00 = 11;
                                        } else {
                                            c468028i.A00 = 0;
                                            c468028i.A01 = arrayList;
                                            StringBuilder sb4 = new StringBuilder("findSourcesForTransfer returning sources: ");
                                            sb4.append(arrayList);
                                            sb4.append(" for amount");
                                            c014406v3.A07(null, sb4.toString(), null);
                                        }
                                    } else {
                                        StringBuilder sb5 = new StringBuilder("sendPayment not sending payment; got invalid balance: ");
                                        sb5.append(c014006r2);
                                        c014406v3.A07(null, sb5.toString(), null);
                                        c468028i.A00 = 5;
                                    }
                                }
                            }
                        } else if (c0gr.A02().A05) {
                            if ((c0n2 != null || (c0n23 = c013406l.A06()) != null) && !TextUtils.isEmpty(c0n23.A07)) {
                                if (AnonymousClass029.A1a(c0gr.A02().A06, c0n23.A08())) {
                                    ArrayList arrayList2 = new ArrayList(1);
                                    arrayList2.add(new C468128j(c0n23, c014006r, 1));
                                    c468028i.A00 = 0;
                                    c468028i.A01 = arrayList2;
                                    StringBuilder sb6 = new StringBuilder("PAY PaymentsActionManager:findSourcesForTransfer found no primary but found secondary: ");
                                    sb6.append(arrayList2);
                                    sb6.append(" for amount");
                                    Log.i(sb6.toString());
                                }
                            }
                            c014406v3.A07(null, "sendPayment not sending payment; got invalid secondary methods and no primary methods", null);
                            c468028i.A00 = 9;
                        } else {
                            StringBuilder sb7 = new StringBuilder("sendPayment not sending payment; got null primary methods or empty credential id: ");
                            sb7.append(c0n22);
                            c014406v3.A07(null, sb7.toString(), null);
                            c468028i.A00 = 4;
                        }
                    }
                    A022.A0K = str;
                    A022.A0I = str2;
                    if (c468028i.A00 == 0) {
                        A022.A0H(c468028i.A01);
                        A022.A09 = c0k8;
                        if (A022.A0L.size() == 1) {
                            c0jj.A0d(null);
                            A022.A0F = ((C468128j) A022.A0L.get(0)).A01.A07;
                            c014406v3.A07(null, "userActionSendPayment", null);
                            long A05 = this.A03.A05();
                            c0jj.A0E = A05;
                            c0jj.A0F = A022;
                            A022.A04 = A05;
                            c0jj.A0b = AnonymousClass093.A0A(A022.A0I) ? A022.A0I : "UNSET";
                            this.A05.A0j(c0jj);
                            C03540Gc c03540Gc = this.A09;
                            String str4 = anonymousClass094.A01;
                            synchronized (c03540Gc) {
                                c03540Gc.A03.put(str4, A022);
                            }
                            c468028i.A00 = 0;
                            return;
                        }
                        c014406v3.A07(null, "PaymentsActionManager sendPayment could not send. no correct sources found.", null);
                        c468028i.A00 = 7;
                        return;
                    }
                    return;
                } catch (Exception e) {
                    this.A0G.A08("sendPayment blew up creating transaction info: ", e);
                    c468028i.A00 = 10;
                    return;
                }
            } else {
                this.A0G.A07(null, "sendPayment not sending payment; got invalid amount", null);
                c468028i.A00 = 8;
                return;
            }
        }
        throw null;
    }

    public void A0D(String str, InterfaceC03640Gm interfaceC03640Gm, C02590Ca c02590Ca, String str2) {
        C02590Ca c02590Ca2;
        if (TextUtils.isEmpty(str2)) {
            byte[] A03 = C05V.A03(this.A03, this.A01, false);
            if (A03 != null) {
                str2 = C02A.A03(A03);
            } else {
                throw null;
            }
        }
        C04P[] c04pArr = {new C04P("action", "remove-credential", null, (byte) 0), new C04P("credential-id", str, null, (byte) 0), new C04P("version", "2", null, (byte) 0), new C04P("nonce", str2, null, (byte) 0)};
        if (c02590Ca == null) {
            c02590Ca2 = new C02590Ca("account", c04pArr, null, null);
        } else {
            c02590Ca2 = new C02590Ca("account", c04pArr, c02590Ca);
        }
        A0A(c02590Ca2, interfaceC03640Gm);
    }

    public void A0E(String str, C02590Ca c02590Ca, InterfaceC010405f interfaceC010405f) {
        A0G(str, "w:pay", c02590Ca, interfaceC010405f, 30000L);
    }

    public void A0F(String str, C02590Ca c02590Ca, InterfaceC010405f interfaceC010405f, long j) {
        A0G(str, "w:pay", c02590Ca, interfaceC010405f, j);
    }

    public void A0G(String str, String str2, C02590Ca c02590Ca, InterfaceC010405f interfaceC010405f, long j) {
        C05Y c05y = this.A07;
        String A02 = c05y.A02();
        c05y.A06(204, A02, new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("type", str, null, (byte) 0), new C04P("id", A02, null, (byte) 0), new C04P("xmlns", str2, null, (byte) 0)}, c02590Ca), interfaceC010405f, j);
    }
}
