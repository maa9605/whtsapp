package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4FC */
/* loaded from: classes3.dex */
public abstract class C4FC extends C0MU {
    public C0N1 A01;
    public List A04;
    public final InterfaceC02360Aw A06;
    public final C018508q A07;
    public final C013306k A08;
    public final C013406l A09;
    public final C0DV A0A;
    public final InterfaceC002901k A0B;
    public C014406v A02 = C014406v.A00("MerchantDetailsViewModel", "merchant-settings", "COMMON");
    public List A05 = new ArrayList();
    public C0HK A00 = new C0HK(new ArrayList());
    public C461825l A03 = new C461825l();

    public C4FC(InterfaceC02360Aw interfaceC02360Aw, C018508q c018508q, InterfaceC002901k interfaceC002901k, C013406l c013406l, C0DV c0dv, C013306k c013306k) {
        this.A06 = interfaceC02360Aw;
        this.A07 = c018508q;
        this.A0B = interfaceC002901k;
        this.A09 = c013406l;
        this.A0A = c0dv;
        this.A08 = c013306k;
    }

    /* JADX WARN: Finally extract failed */
    public void A02() {
        C0N1 c0n1;
        C013406l c013406l = this.A09;
        if (((AbstractCollection) c013406l.A09()).size() > 0 && (c0n1 = (C0N1) ((AbstractList) c013406l.A09()).get(0)) != null) {
            C0CD A02 = c013406l.A01.A02();
            try {
                List emptyList = Collections.emptyList();
                A02.close();
                this.A07.A02.post(new RunnableC70213Rk(this, c0n1, emptyList, this.A08.A0Y(3, new Integer[0], new Integer[]{300})));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A02.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        }
    }

    public void A03(C0N1 c0n1, List list, List list2) {
        List list3;
        this.A01 = c0n1;
        this.A04 = list;
        this.A05 = list2;
        C0HK c0hk = this.A00;
        C92044Hh c92044Hh = (C92044Hh) this;
        ArrayList arrayList = new ArrayList();
        C92234Ic c92234Ic = (C92234Ic) ((C4FC) c92044Hh).A01.A06;
        if (c92234Ic != null) {
            String str = c92234Ic.A05;
            if ("NEEDS_MORE_INFO".equals(str)) {
                C91384Es c91384Es = new C91384Es();
                c91384Es.A00 = R.drawable.ic_verify;
                c91384Es.A01 = R.color.payment_method_verify_icon_tint;
                C001200o c001200o = c92044Hh.A05;
                c91384Es.A04 = c001200o.A00.getString(R.string.merchant_account_payout_method_verification_failed_description);
                c91384Es.A03 = c001200o.A00.getString(R.string.merchant_account_add_payout_method_action);
                c91384Es.A02 = new C3RQ(c92044Hh, c92234Ic);
                arrayList.add(c91384Es);
            } else if ("DISABLED".equals(str)) {
                C91384Es c91384Es2 = new C91384Es();
                c91384Es2.A00 = R.drawable.ic_alert;
                c91384Es2.A01 = R.color.payment_method_remove_card_icon_tint;
                C001200o c001200o2 = c92044Hh.A05;
                c91384Es2.A04 = c001200o2.A00.getString(R.string.merchant_account_payout_method_cannot_verify_description);
                c91384Es2.A03 = c001200o2.A00.getString(R.string.merchant_account_payout_method_contact_cielo_action);
                c91384Es2.A02 = new C3RR(c92044Hh, c92234Ic);
                arrayList.add(c91384Es2);
            } else if ("VERIFYING".equals(str) && ((list3 = ((C4FC) c92044Hh).A04) == null || list3.isEmpty())) {
                C91384Es c91384Es3 = new C91384Es();
                c91384Es3.A00 = R.drawable.ic_history;
                c91384Es3.A01 = R.color.warning_color_icon_tint;
                c91384Es3.A04 = c92044Hh.A05.A00.getString(R.string.merchant_account_payout_method_verifying_description);
                c91384Es3.A05 = true;
                arrayList.add(c91384Es3);
            }
        }
        List list4 = ((C4FC) c92044Hh).A04;
        if (list4 != null && !list4.isEmpty()) {
            C001200o c001200o3 = c92044Hh.A05;
            arrayList.add(new C91294Ej(c001200o3.A00.getString(R.string.payment_merchant_payout_method_title)));
            for (C0N2 c0n2 : ((C4FC) c92044Hh).A04) {
                if (c0n2 instanceof C0N6) {
                    C92214Ia c92214Ia = (C92214Ia) c0n2.A06;
                    C91354Ep c91354Ep = new C91354Ep();
                    if (c92214Ia != null) {
                        c91354Ep.A09 = c92214Ia.A09;
                        c91354Ep.A03 = c92214Ia.A05;
                        int i = c92214Ia.A00;
                        if (i == 1) {
                            c91354Ep.A08 = true;
                            c91354Ep.A07 = false;
                            c91354Ep.A04 = c001200o3.A00.getString(R.string.merchant_account_payout_method_verifying);
                            c91354Ep.A00 = R.drawable.ic_history;
                            c91354Ep.A01 = R.color.warning_color_icon_tint;
                            c91354Ep.A06 = c001200o3.A00.getString(R.string.merchant_account_payout_method_verifying_description);
                        } else if (i == 2) {
                            C92234Ic c92234Ic2 = (C92234Ic) ((C4FC) c92044Hh).A01.A06;
                            int i2 = ((AbstractC466427q) c92234Ic2).A00 & 4;
                            c91354Ep.A08 = true;
                            c91354Ep.A07 = true;
                            if (i2 > 0) {
                                c91354Ep.A04 = c001200o3.A00.getString(R.string.merchant_account_payout_method_unverified);
                                c91354Ep.A00 = R.drawable.ic_verify;
                                c91354Ep.A01 = R.color.payment_method_verify_icon_tint;
                                c91354Ep.A06 = c001200o3.A00.getString(R.string.merchant_account_payout_method_unverified_description);
                                c91354Ep.A05 = c001200o3.A00.getString(R.string.merchant_account_payout_method_verify_action);
                                c91354Ep.A02 = new C3RL(c92044Hh, c92234Ic2);
                            } else {
                                c91354Ep.A04 = c001200o3.A00.getString(R.string.merchant_account_payout_method_cannot_verify);
                                c91354Ep.A00 = R.drawable.ic_alert;
                                c91354Ep.A01 = R.color.payment_method_remove_card_icon_tint;
                                c91354Ep.A06 = c001200o3.A00.getString(R.string.merchant_account_payout_method_cannot_verify_description);
                                c91354Ep.A05 = c001200o3.A00.getString(R.string.merchant_account_payout_method_contact_cielo_action);
                                c91354Ep.A02 = new C3RP(c92044Hh);
                            }
                        }
                    }
                    arrayList.add(c91354Ep);
                } else if (c0n2 instanceof C0N7) {
                    C91364Eq c91364Eq = new C91364Eq();
                    c91364Eq.A00 = c001200o3.A00.getString(R.string.payment_merchant_payout_prepaid_card_title, C40841sx.A0M(c0n2.A0A));
                    arrayList.add(c91364Eq);
                }
            }
        }
        List list5 = ((C4FC) c92044Hh).A04;
        if (list5 != null && !list5.isEmpty()) {
            arrayList.add(new C91304Ek(103));
        }
        C001200o c001200o4 = c92044Hh.A05;
        arrayList.add(new C91294Ej(c001200o4.A00.getString(R.string.payment_merchant_payouts_title)));
        C91344Eo c91344Eo = new C91344Eo();
        c91344Eo.A02 = c001200o4.A00.getString(R.string.payments_settings_view_payment_history);
        c91344Eo.A01 = c001200o4.A00.getString(R.string.payments_no_payout_history);
        c91344Eo.A00 = new C3RN(c92044Hh);
        c91344Eo.A03.addAll(((C4FC) c92044Hh).A05);
        arrayList.add(c91344Eo);
        arrayList.add(new C91304Ek(103));
        C91284Ei c91284Ei = new C91284Ei();
        c91284Ei.A00 = R.drawable.ic_dashboard;
        c91284Ei.A01 = R.color.warning_color_icon_tint;
        c91284Ei.A03 = c001200o4.A00.getString(R.string.brazil_merchant_payout_detail_cielo_dashboard_cta);
        c91284Ei.A02 = new C3RM(c92044Hh);
        arrayList.add(c91284Ei);
        C91284Ei c91284Ei2 = new C91284Ei();
        c91284Ei2.A00 = R.drawable.ic_help;
        c91284Ei2.A01 = R.color.warning_color_icon_tint;
        c91284Ei2.A03 = c001200o4.A00.getString(R.string.settings_help);
        c91284Ei2.A02 = new C3RO(c92044Hh);
        arrayList.add(c91284Ei2);
        c0hk.A0B(arrayList);
    }

    public void A04(C901349u c901349u) {
        C901449v c901449v;
        int i = c901349u.A00;
        if (i != 0) {
            if (i == 1) {
                C0DV c0dv = this.A0A;
                c0dv.A04();
                List A0A = c0dv.A08.A0A();
                C014406v c014406v = this.A02;
                StringBuilder A0P = C000200d.A0P("Remove merchant account. #methods=");
                AbstractCollection abstractCollection = (AbstractCollection) A0A;
                A0P.append(abstractCollection.size());
                c014406v.A07(null, A0P.toString(), null);
                if (abstractCollection.size() <= 1) {
                    c901449v = new C901449v(0);
                } else {
                    c901449v = new C901449v(1);
                }
                this.A03.A0B(c901449v);
                return;
            } else if (i == 2) {
                boolean z = c901349u.A01;
                final C92044Hh c92044Hh = (C92044Hh) this;
                C900549m c900549m = new C900549m(5);
                c900549m.A08 = true;
                c900549m.A02 = R.string.register_wait_message;
                c92044Hh.A00.A0B(c900549m);
                InterfaceC03640Gm interfaceC03640Gm = new InterfaceC03640Gm() { // from class: X.4F2
                    @Override // X.InterfaceC03640Gm
                    public void ANw(C28Q c28q) {
                        C92044Hh c92044Hh2 = c92044Hh;
                        C92044Hh.A00(c92044Hh2);
                        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantDetailsViewModel removePayment/onRequestError. paymentNetworkError: ");
                        sb.append(c28q);
                        Log.w(sb.toString());
                        C92044Hh.A01(c92044Hh2, R.string.seller_account_cannot_be_removed);
                    }

                    @Override // X.InterfaceC03640Gm
                    public void AO1(C28Q c28q) {
                        C92044Hh c92044Hh2 = c92044Hh;
                        C92044Hh.A00(c92044Hh2);
                        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantDetailsViewModel removePayment/onResponseError. paymentNetworkError: ");
                        sb.append(c28q);
                        Log.i(sb.toString());
                        C92044Hh.A01(c92044Hh2, R.string.seller_account_cannot_be_removed);
                    }

                    @Override // X.InterfaceC03640Gm
                    public void AO2(C468228k c468228k) {
                        C92044Hh c92044Hh2 = c92044Hh;
                        C92044Hh.A00(c92044Hh2);
                        Log.i("PAY: BrazilMerchantDetailsViewModel removePayment Success");
                        C92044Hh.A01(c92044Hh2, R.string.seller_account_is_removed);
                    }
                };
                if (z) {
                    new C48I(c92044Hh.A05.A00, c92044Hh.A01, c92044Hh.A0G, c92044Hh.A0F, c92044Hh.A0E, c92044Hh.A06, c92044Hh.A0B, c92044Hh.A03, c92044Hh.A0C, c92044Hh.A0D, c92044Hh.A09).A00(interfaceC03640Gm);
                    return;
                }
                C896747z c896747z = new C896747z(c92044Hh.A04, c92044Hh.A05.A00, c92044Hh.A01, c92044Hh.A02, c92044Hh.A0G, c92044Hh.A0E, c92044Hh.A03, c92044Hh.A0C, c92044Hh.A09, c92044Hh.A0A);
                ArrayList arrayList = new ArrayList();
                C000200d.A1A("action", "br-remove-merchant-account", arrayList);
                byte[] A03 = C05V.A03(c896747z.A04, c896747z.A02, false);
                if (A03 != null) {
                    arrayList.add(new C04P("nonce", C02A.A03(A03), null, (byte) 0));
                    c896747z.A07.A0F("set", new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null), new C4GX(c896747z, c896747z.A00, c896747z.A01, c896747z.A03, c896747z.A05, interfaceC03640Gm), 0L);
                    return;
                }
                throw null;
            } else if (i != 3) {
                return;
            }
        }
        this.A0B.AS1(new RunnableC70203Rj(this));
    }
}
