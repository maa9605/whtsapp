package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.4F9  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4F9 extends C0MU {
    public InterfaceC02360Aw A00;
    public C0N2 A02;
    public AnonymousClass093 A03;
    public C4C5 A04;
    public String A06;
    public boolean A07;
    public final C018508q A08;
    public final C002301c A09;
    public final C013406l A0A;
    public final C0EX A0B;
    public final C0DV A0C;
    public final C4CE A0D;
    public final InterfaceC002901k A0F;
    public final C014406v A0E = C014406v.A00("IndiaUpiMandatePaymentViewModel", "payment-settings", "IN");
    public C0HK A01 = new C0HK();
    public C461825l A05 = new C461825l();

    public C4F9(InterfaceC02360Aw interfaceC02360Aw, C018508q c018508q, InterfaceC002901k interfaceC002901k, C013406l c013406l, C002301c c002301c, C0DV c0dv, C013306k c013306k, C0EX c0ex, String str, C0N2 c0n2, C4CE c4ce, C4C5 c4c5, boolean z, String str2) {
        this.A00 = interfaceC02360Aw;
        this.A08 = c018508q;
        this.A0F = interfaceC002901k;
        this.A0A = c013406l;
        this.A09 = c002301c;
        this.A0C = c0dv;
        this.A0B = c0ex;
        this.A03 = c013306k.A0O(str);
        this.A02 = c0n2;
        this.A0D = c4ce;
        this.A04 = c4c5;
        this.A07 = z;
        this.A06 = str2;
    }

    public void A02() {
        C0DV c0dv = this.A0C;
        c0dv.A04();
        C013306k c013306k = c0dv.A07;
        AnonymousClass093 anonymousClass093 = this.A03;
        c013306k.A0f(anonymousClass093.A0I, anonymousClass093.A02, anonymousClass093.A04, anonymousClass093.A05, 418);
        C018508q c018508q = this.A08;
        c018508q.A02.post(new RunnableC70123Rb(this));
    }

    public /* synthetic */ void A03() {
        C0HK c0hk = this.A01;
        C4A3 c4a3 = new C4A3();
        c4a3.A01 = true;
        c0hk.A0B(c4a3);
        this.A0B.A02(this.A03);
        this.A05.A0B(new C901149s(1));
    }

    public /* synthetic */ void A04() {
        this.A0B.A02(this.A03);
        this.A05.A0B(new C901149s(1));
    }

    public void A05(C894647c c894647c) {
        if (c894647c != null) {
            c894647c.A05 = "ACCEPT";
            c894647c.A07 = "PENDING";
            C0DV c0dv = this.A0C;
            c0dv.A04();
            c0dv.A07.A0i(this.A03);
        } else {
            C0DV c0dv2 = this.A0C;
            c0dv2.A04();
            C013306k c013306k = c0dv2.A07;
            AnonymousClass093 anonymousClass093 = this.A03;
            c013306k.A0f(anonymousClass093.A0I, anonymousClass093.A02, anonymousClass093.A04, anonymousClass093.A05, 401);
        }
        C018508q c018508q = this.A08;
        c018508q.A02.post(new C3RY(this));
    }

    public /* synthetic */ void A06(C894647c c894647c, C28Q c28q) {
        if (c28q == null) {
            C0HK c0hk = this.A01;
            C4A3 c4a3 = new C4A3();
            c4a3.A01 = true;
            c0hk.A0B(c4a3);
            this.A0F.AS1(new RunnableC70113Ra(this, c894647c));
            return;
        }
        this.A05.A0B(new C901149s(2));
    }

    public /* synthetic */ void A07(C28Q c28q) {
        if (c28q == null) {
            C0HK c0hk = this.A01;
            C4A3 c4a3 = new C4A3();
            c4a3.A01 = true;
            c0hk.A0B(c4a3);
            this.A0F.AS1(new C3RZ(this));
            return;
        }
        this.A05.A0B(new C901149s(2));
    }

    public void A08(C901049r c901049r) {
        C014006r c014006r;
        String str;
        String A01;
        String A012;
        int i = c901049r.A00;
        if (i == 0) {
            if (!this.A07) {
                C0N2 A08 = this.A0A.A08(this.A03.A0F);
                this.A02 = A08;
                if (A08 == null) {
                    C901149s c901149s = new C901149s(3);
                    C002301c c002301c = this.A09;
                    c901149s.A05 = c002301c.A06(R.string.upi_mandate_revoke_missing_payment_method_title);
                    c901149s.A04 = c002301c.A06(R.string.upi_mandate_revoke_missing_payment_method);
                    this.A05.A0B(c901149s);
                    return;
                }
            }
            C0HK c0hk = this.A01;
            String A06 = this.A09.A06(R.string.register_wait_message);
            C4A3 c4a3 = new C4A3();
            c4a3.A00 = A06;
            c0hk.A0B(c4a3);
            this.A0D.A00();
        } else if (i == 1) {
            String str2 = c901049r.A01;
            if (this.A07) {
                C4GJ c4gj = (C4GJ) this.A03.A09;
                C4IA c4ia = (C4IA) this.A02.A06;
                C014406v c014406v = this.A0E;
                C000700j.A04(c4ia, c014406v.A02(c014406v.A02, "onListKeys: Cannot get IndiaUpiMethodData").toString());
                C901149s c901149s2 = new C901149s(0);
                c901149s2.A07 = str2;
                c901149s2.A06 = this.A02.A08;
                c901149s2.A01 = c4ia.A04;
                c901149s2.A03 = c4gj;
                C894647c c894647c = c4gj.A06.A03;
                if (c894647c != null) {
                    c4gj.A0D = c894647c.A09;
                }
                if (c894647c != null && (str = c894647c.A08) != null) {
                    c014006r = C014006r.A00(str, C013806p.A05.A9i());
                } else {
                    c014006r = this.A03.A07;
                }
                c901149s2.A02 = c014006r;
                c901149s2.A09 = this.A02.A0A;
                c901149s2.A08 = c4gj.A09;
                this.A05.A0B(c901149s2);
                return;
            }
            C4GJ c4gj2 = (C4GJ) this.A03.A09;
            C4IA c4ia2 = (C4IA) this.A02.A06;
            C014406v c014406v2 = this.A0E;
            C000700j.A04(c4ia2, c014406v2.A02(c014406v2.A02, "onListKeys: Cannot get IndiaUpiMethodData").toString());
            C901149s c901149s3 = new C901149s(0);
            c901149s3.A07 = str2;
            C0N2 c0n2 = this.A02;
            c901149s3.A06 = c0n2.A08;
            c901149s3.A01 = c4ia2.A04;
            c901149s3.A03 = c4gj2;
            c4gj2.A0D = this.A06;
            c901149s3.A02 = this.A03.A07;
            c901149s3.A09 = c0n2.A0A;
            c901149s3.A08 = c4gj2.A09;
            this.A05.A0B(c901149s3);
        } else if (i == 2) {
            HashMap hashMap = c901049r.A02;
            this.A0E.A07(null, "handleCredentialBlob", null);
            C0HK c0hk2 = this.A01;
            String A062 = this.A09.A06(R.string.register_wait_message);
            C4A3 c4a32 = new C4A3();
            c4a32.A00 = A062;
            c0hk2.A0B(c4a32);
            AnonymousClass093 anonymousClass093 = this.A03;
            final C894647c c894647c2 = ((C4GJ) anonymousClass093.A09).A06.A03;
            if (this.A07) {
                C4C5 c4c5 = this.A04;
                C0N2 c0n22 = this.A02;
                final C48A c48a = new C48A() { // from class: X.3jv
                    @Override // X.C48A
                    public final void AO5(C28Q c28q) {
                        C4F9.this.A06(c894647c2, c28q);
                    }
                };
                if (c4c5 != null) {
                    ArrayList A0Y = C000200d.A0Y("PAY: acceptPayeeMandate called");
                    C000200d.A1A("action", "upi-accept-mandate-request", A0Y);
                    c4c5.A02(A0Y, anonymousClass093);
                    if (hashMap != null && (A012 = C894947f.A01(hashMap, "MPIN")) != null) {
                        C000200d.A1A("mpin", A012, A0Y);
                    }
                    if (c0n22 != null) {
                        A0Y.add(new C04P("credential-id", c0n22.A07, null, (byte) 0));
                        String str3 = ((C4IA) c0n22.A06).A0A;
                        if (str3 != null) {
                            C000200d.A1A("upi-bank-info", str3, A0Y);
                        }
                    }
                    C4C5.A00(A0Y, c894647c2, anonymousClass093, null);
                    C02590Ca[] A03 = c4c5.A03(anonymousClass093);
                    C463026g c463026g = ((C48B) c4c5).A01;
                    C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) A0Y.toArray(new C04P[0]), A03, null);
                    final Context context = c4c5.A00;
                    final C018508q c018508q = c4c5.A01;
                    final C0E7 c0e7 = c4c5.A02;
                    final C28S c28s = c4c5.A03;
                    final C3NV c3nv = ((C48B) c4c5).A00;
                    c463026g.A0F("set", c02590Ca, new C91754Gd(context, c018508q, c0e7, c28s, c3nv) { // from class: X.4IO
                        @Override // X.C91754Gd, X.C28V
                        public void A02(C28Q c28q) {
                            super.A02(c28q);
                            C48A c48a2 = c48a;
                            if (c48a2 != null) {
                                c48a2.AO5(c28q);
                            }
                        }

                        @Override // X.C91754Gd, X.C28V
                        public void A03(C28Q c28q) {
                            super.A03(c28q);
                            C48A c48a2 = c48a;
                            if (c48a2 != null) {
                                c48a2.AO5(c28q);
                            }
                        }

                        @Override // X.C91754Gd, X.C28V
                        public void A04(C02590Ca c02590Ca2) {
                            super.A04(c02590Ca2);
                            C48A c48a2 = c48a;
                            if (c48a2 != null) {
                                c48a2.AO5(null);
                            }
                        }
                    }, 0L);
                    return;
                }
                throw null;
            }
            C4C5 c4c52 = this.A04;
            C0N2 c0n23 = this.A02;
            String str4 = this.A06;
            final C48A c48a2 = new C48A() { // from class: X.3ju
                @Override // X.C48A
                public final void AO5(C28Q c28q) {
                    C4F9.this.A07(c28q);
                }
            };
            if (c4c52 != null) {
                ArrayList A0Y2 = C000200d.A0Y("PAY: revokePayerMandate called");
                C000200d.A1A("action", "upi-revoke-mandate", A0Y2);
                c4c52.A02(A0Y2, anonymousClass093);
                C4C5.A00(A0Y2, null, anonymousClass093, str4);
                if (hashMap != null && (A01 = C894947f.A01(hashMap, "MPIN")) != null) {
                    C000200d.A1A("mpin", A01, A0Y2);
                }
                if (c0n23 != null) {
                    A0Y2.add(new C04P("credential-id", c0n23.A07, null, (byte) 0));
                    String str5 = ((C4IA) c0n23.A06).A0A;
                    if (str5 != null) {
                        C000200d.A1A("upi-bank-info", str5, A0Y2);
                    }
                }
                final C3NV c3nv2 = ((C48B) c4c52).A00;
                if (c3nv2 != null) {
                    c3nv2.A04("upi-revoke-mandate");
                }
                C02590Ca[] A032 = c4c52.A03(anonymousClass093);
                C463026g c463026g2 = ((C48B) c4c52).A01;
                C02590Ca c02590Ca2 = new C02590Ca("account", (C04P[]) A0Y2.toArray(new C04P[0]), A032, null);
                final Context context2 = c4c52.A00;
                final C018508q c018508q2 = c4c52.A01;
                final C0E7 c0e72 = c4c52.A02;
                final C28S c28s2 = c4c52.A03;
                c463026g2.A0F("set", c02590Ca2, new C91754Gd(context2, c018508q2, c0e72, c28s2, c3nv2) { // from class: X.4IP
                    @Override // X.C91754Gd, X.C28V
                    public void A02(C28Q c28q) {
                        super.A02(c28q);
                        C48A c48a3 = c48a2;
                        if (c48a3 != null) {
                            c48a3.AO5(c28q);
                        }
                    }

                    @Override // X.C91754Gd, X.C28V
                    public void A03(C28Q c28q) {
                        super.A03(c28q);
                        C48A c48a3 = c48a2;
                        if (c48a3 != null) {
                            c48a3.AO5(c28q);
                        }
                    }

                    @Override // X.C91754Gd, X.C28V
                    public void A04(C02590Ca c02590Ca3) {
                        super.A04(c02590Ca3);
                        C48A c48a3 = c48a2;
                        if (c48a3 != null) {
                            c48a3.AO5(null);
                        }
                    }
                }, 0L);
                return;
            }
            throw null;
        }
    }
}
