package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/* renamed from: X.4FI */
/* loaded from: classes3.dex */
public class C4FI extends C0MU implements C2OS {
    public InterfaceC28001Pq A01;
    public C4FH A02;
    public C901849z A03;
    public AnonymousClass094 A04;
    public Boolean A06;
    public String A07;
    public String A08;
    public final Bundle A0A;
    public final C018508q A0B;
    public final C02L A0C;
    public final C40261rr A0D;
    public final C05W A0E;
    public final C02E A0F;
    public final AnonymousClass012 A0G;
    public final C001200o A0H;
    public final C002301c A0I;
    public final C0C9 A0J;
    public final C013306k A0K;
    public final C013406l A0L;
    public final C03090Ed A0M;
    public final C0GZ A0N;
    public final C0EX A0O;
    public final C0DW A0P;
    public final C0DV A0Q;
    public final C28O A0R;
    public final C900149i A0T;
    public final C03750Gx A0U;
    public final InterfaceC002901k A0V;
    public final C014406v A0S = C014406v.A00("PaymentTransactionDetailsViewModel", "payment-settings", "COMMON");
    public C0HK A00 = new C0HK(new ArrayList());
    public C461825l A05 = new C461825l();
    public boolean A09 = false;

    public C4FI(AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C001200o c001200o, InterfaceC002901k interfaceC002901k, C013406l c013406l, C03750Gx c03750Gx, C05W c05w, C02E c02e, C002301c c002301c, C0DV c0dv, C40261rr c40261rr, C0C9 c0c9, C900149i c900149i, C0GZ c0gz, C0DW c0dw, C013306k c013306k, C28O c28o, C0EX c0ex, C03090Ed c03090Ed, Bundle bundle) {
        InterfaceC28001Pq interfaceC28001Pq;
        this.A0G = anonymousClass012;
        this.A0B = c018508q;
        this.A0C = c02l;
        this.A0H = c001200o;
        this.A0V = interfaceC002901k;
        this.A0L = c013406l;
        this.A0U = c03750Gx;
        this.A0E = c05w;
        this.A0F = c02e;
        this.A0I = c002301c;
        this.A0Q = c0dv;
        this.A0D = c40261rr;
        this.A0J = c0c9;
        this.A0T = c900149i;
        this.A0N = c0gz;
        this.A0P = c0dw;
        this.A0K = c013306k;
        this.A0R = c28o;
        this.A0O = c0ex;
        this.A0M = c03090Ed;
        this.A0A = bundle;
        this.A04 = C0LD.A03(bundle, "");
        this.A07 = bundle.getString("extra_transaction_id");
        this.A08 = bundle.getString("extra_transaction_ref");
        this.A06 = Boolean.valueOf(bundle.getBoolean("extra_is_pending_request_saved_instance", false));
        if (!(this instanceof C92084Hl)) {
            interfaceC28001Pq = new InterfaceC28001Pq() { // from class: X.4FF
                {
                    C4FI.this = this;
                }

                public final void A00(AnonymousClass093 anonymousClass093) {
                    C4FI c4fi = C4FI.this;
                    if (c4fi != null) {
                        if (!TextUtils.isEmpty(anonymousClass093.A0I) && anonymousClass093.A0I.equals(c4fi.A07)) {
                            c4fi.A0I(false);
                            return;
                        } else if (!TextUtils.isEmpty(anonymousClass093.A0J) && anonymousClass093.A0J.equals(c4fi.A04.A01)) {
                            c4fi.A0I(false);
                            return;
                        } else if (TextUtils.isEmpty(anonymousClass093.A0K) || !anonymousClass093.A0K.equals(c4fi.A04.A01)) {
                            return;
                        } else {
                            c4fi.A0I(false);
                            return;
                        }
                    }
                    throw null;
                }

                @Override // X.InterfaceC28001Pq
                public void AMt(AnonymousClass093 anonymousClass093) {
                    A00(anonymousClass093);
                }

                @Override // X.InterfaceC28001Pq
                public void AMu(AnonymousClass093 anonymousClass093) {
                    A00(anonymousClass093);
                }
            };
        } else {
            final C92084Hl c92084Hl = (C92084Hl) this;
            interfaceC28001Pq = new InterfaceC28001Pq() { // from class: X.4FA
                @Override // X.InterfaceC28001Pq
                public void AMt(AnonymousClass093 anonymousClass093) {
                    C92084Hl c92084Hl2 = c92084Hl;
                    c92084Hl2.A0S.A07(null, "IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() trying to load the added txn", null);
                    c92084Hl2.A0I(false);
                }

                @Override // X.InterfaceC28001Pq
                public void AMu(AnonymousClass093 anonymousClass093) {
                    C92084Hl c92084Hl2 = c92084Hl;
                    C014406v c014406v = c92084Hl2.A0S;
                    c014406v.A07(null, "IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() txn update event is called", null);
                    if (c92084Hl2.A00 && anonymousClass093 != null && anonymousClass093.A0J()) {
                        C4FB c4fb = new C4FB(101);
                        c4fb.A00 = anonymousClass093.A0J;
                        c4fb.A02 = ((C4FI) c92084Hl2).A08;
                        c4fb.A01 = anonymousClass093.A0P() ? "SUCCESS" : "FAILURE";
                        C90944Da c90944Da = c92084Hl2.A07;
                        int A01 = AnonymousClass024.A01(anonymousClass093.A0H, 0);
                        if (c90944Da != null) {
                            c4fb.A01 = A01 == 0 ? "00" : "U13";
                            ((C4FI) c92084Hl2).A05.A0B(c4fb);
                            return;
                        }
                        throw null;
                    }
                    c014406v.A07(null, "IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() trying to reload the updated txn", null);
                    c92084Hl2.A0I(false);
                }
            };
        }
        this.A01 = interfaceC28001Pq;
        this.A0O.A01(interfaceC28001Pq);
    }

    public static final Boolean A00(AnonymousClass093 anonymousClass093) {
        int i = anonymousClass093.A02;
        if (i == 1 || i == 100 || i == 20) {
            return Boolean.TRUE;
        }
        if (i == 2 || i == 200 || i == 10) {
            return Boolean.FALSE;
        }
        return null;
    }

    public String A02(AnonymousClass093 anonymousClass093) {
        return (anonymousClass093.A0O() || AnonymousClass093.A0A(anonymousClass093.A0D)) ? anonymousClass093.A0D : anonymousClass093.A0I;
    }

    /* renamed from: A03 */
    public void A05() {
        C014406v c014406v = this.A0S;
        c014406v.A07(null, "Parent- HANDLE_SEND_AGAIN child did not handle", null);
        C901849z c901849z = this.A03;
        AnonymousClass092 anonymousClass092 = c901849z != null ? c901849z.A02 : null;
        if (anonymousClass092 != null) {
            AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
            if (anonymousClass093 != null) {
                UserJid userJid = anonymousClass093.A0B;
                if (userJid != null) {
                    if (!this.A0D.A0H(userJid)) {
                        this.A05.A0B(new C901649x(12));
                        return;
                    }
                    C901649x c901649x = new C901649x(13);
                    c901649x.A05 = anonymousClass093.A0B;
                    this.A05.A0B(c901649x);
                    return;
                } else if (userJid == null) {
                    c014406v.A07(null, "Parent- HANDLE_SEND_AGAIN pmtTxnInfo.receiverJid is null", null);
                }
            } else {
                c014406v.A07(null, "Parent- HANDLE_SEND_AGAIN pmtTxnInfo is null", null);
            }
            C901649x c901649x2 = new C901649x(8);
            c901649x2.A07 = this.A0I.A06(R.string.payments_generic_error);
            this.A05.A0B(c901649x2);
            return;
        }
        c014406v.A07(null, "Parent- HANDLE_SEND_AGAIN FMessage is null", null);
        C901649x c901649x3 = new C901649x(8);
        c901649x3.A07 = this.A0I.A06(R.string.payments_generic_error);
        this.A05.A0B(c901649x3);
    }

    public void A04() {
        AnonymousClass093 anonymousClass093;
        C901849z c901849z = this.A03;
        if (c901849z == null || this.A09 || (anonymousClass093 = c901849z.A01) == null) {
            return;
        }
        this.A09 = true;
        if (!this.A0N.A09() || TextUtils.isEmpty(anonymousClass093.A0I) || anonymousClass093.A0O()) {
            return;
        }
        C014406v c014406v = this.A0S;
        StringBuilder A0P = C000200d.A0P("syncing pending transaction: ");
        A0P.append(anonymousClass093.A0I);
        A0P.append(" status: ");
        A0P.append(anonymousClass093.A01);
        c014406v.A07(null, A0P.toString(), null);
        final C28T AA9 = this.A0Q.A03().AA9();
        if (AA9 != null) {
            AA9.AV3();
        }
        this.A0R.A02(anonymousClass093.A0I, anonymousClass093.A0R(), new InterfaceC03640Gm() { // from class: X.4FG
            {
                C4FI.this = this;
            }

            @Override // X.InterfaceC03640Gm
            public void ANw(C28Q c28q) {
                C014406v c014406v2 = C4FI.this.A0S;
                StringBuilder sb = new StringBuilder("syncPendingTransaction onRequestError: ");
                sb.append(c28q);
                c014406v2.A07(null, sb.toString(), null);
                C28T c28t = AA9;
                if (c28t != null) {
                    c28t.AKp(c28q);
                }
            }

            @Override // X.InterfaceC03640Gm
            public void AO1(C28Q c28q) {
                C014406v c014406v2 = C4FI.this.A0S;
                StringBuilder sb = new StringBuilder("syncPendingTransaction onResponseError: ");
                sb.append(c28q);
                c014406v2.A07(null, sb.toString(), null);
                C28T c28t = AA9;
                if (c28t != null) {
                    c28t.AKp(c28q);
                }
            }

            @Override // X.InterfaceC03640Gm
            public void AO2(C468228k c468228k) {
                C4FI.this.A0S.A07(null, "syncPendingTransaction onResponseSuccess", null);
                C28T c28t = AA9;
                if (c28t != null) {
                    c28t.AKp(null);
                }
            }
        });
    }

    public void A06(C0N2 c0n2) {
        Class ACO = this.A0Q.A03().ACO();
        if (ACO != null && c0n2 != null) {
            C901649x c901649x = new C901649x(7);
            c901649x.A06 = ACO;
            c901649x.A03 = c0n2;
            this.A05.A0B(c901649x);
            return;
        }
        C901649x c901649x2 = new C901649x(8);
        c901649x2.A07 = this.A0I.A06(R.string.transaction_details_incorrect_pin_no_account_dialog);
        this.A05.A0B(c901649x2);
    }

    public /* synthetic */ void A07(C0N2 c0n2) {
        C901649x c901649x = new C901649x(9);
        c901649x.A03 = c0n2;
        this.A05.A0B(c901649x);
    }

    public /* synthetic */ void A08(C0N2 c0n2, AnonymousClass093 anonymousClass093) {
        C901649x c901649x = new C901649x(10);
        c901649x.A03 = c0n2;
        c901649x.A04 = anonymousClass093;
        this.A05.A0B(c901649x);
    }

    public /* synthetic */ void A09(C0N2 c0n2, AnonymousClass093 anonymousClass093) {
        C901649x c901649x = new C901649x(10);
        c901649x.A03 = c0n2;
        c901649x.A04 = anonymousClass093;
        this.A05.A0B(c901649x);
    }

    public void A0A(final C91424Ew c91424Ew) {
        InterfaceC467528c AC0;
        AnonymousClass093 anonymousClass093 = this.A03.A01;
        Boolean A00 = A00(anonymousClass093);
        if (c91424Ew.A03 != null) {
            C901649x c901649x = new C901649x(4);
            c901649x.A02 = c91424Ew.A03;
            this.A05.A0B(c901649x);
        } else if (A00 == null) {
        } else {
            C0K8 c0k8 = anonymousClass093.A09;
            if (c0k8 != null) {
                final String A0A = A00.booleanValue() ? c0k8.A0A() : c0k8.A0B();
                if (A0A == null || !this.A0N.A08() || (AC0 = this.A0Q.A03().AC0()) == null || c91424Ew.A01 == 0) {
                    return;
                }
                c91424Ew.A00 = 4;
                c91424Ew.A01 = 0;
                C0HK c0hk = this.A00;
                c0hk.A0B(c0hk.A01());
                AC0.AVz(A0A, new InterfaceC53332eX() { // from class: X.3jy
                    {
                        C4FI.this = this;
                    }

                    @Override // X.InterfaceC53332eX
                    public final void AOF(boolean z, boolean z2, String str, String str2, UserJid userJid, boolean z3, C28Q c28q) {
                        C4FI.this.A0B(c91424Ew, A0A, z, str, str2, userJid, z3, c28q);
                    }
                });
                return;
            }
            throw null;
        }
    }

    public void A0B(C91424Ew c91424Ew, String str, boolean z, String str2, String str3, UserJid userJid, boolean z2, C28Q c28q) {
        c91424Ew.A00 = 0;
        c91424Ew.A01 = 8;
        C0HK c0hk = this.A00;
        c0hk.A0B(c0hk.A01());
        if (c28q != null || !z) {
            C014406v c014406v = this.A0S;
            StringBuilder sb = new StringBuilder("viewContactInfo error: ");
            sb.append(c28q);
            c014406v.A04(sb.toString());
            this.A05.A0B(new C901649x(6));
        } else if (userJid != null) {
            C014406v c014406v2 = this.A0S;
            StringBuilder sb2 = new StringBuilder("viewContactInfo jid: ");
            sb2.append(userJid);
            sb2.append(" blocked: ");
            sb2.append(z2);
            c014406v2.A07(null, sb2.toString(), null);
            C40261rr c40261rr = this.A0D;
            UserJid of = UserJid.of(userJid);
            if (of != null) {
                if (z2 != c40261rr.A0H(of)) {
                    c40261rr.A0D(null);
                }
                C901649x c901649x = new C901649x(4);
                c901649x.A02 = this.A0E.A0A(userJid);
                this.A05.A0B(c901649x);
                return;
            }
            throw null;
        } else {
            C901649x c901649x2 = new C901649x(5);
            c901649x2.A0A = str;
            c901649x2.A09 = str3;
            c901649x2.A08 = str2;
            this.A05.A0B(c901649x2);
        }
    }

    public void A0C(List list) {
        C894547b c894547b;
        SpannableStringBuilder spannableStringBuilder;
        String A0D;
        String A06;
        if (!(this instanceof C92084Hl)) {
            A0F(list);
            A0G(list);
            A0E(list);
            return;
        }
        C92084Hl c92084Hl = (C92084Hl) this;
        C901849z c901849z = ((C4FI) c92084Hl).A03;
        AnonymousClass093 anonymousClass093 = c901849z.A01;
        C0K8 c0k8 = anonymousClass093.A09;
        if (c0k8 != null) {
            C4GJ c4gj = (C4GJ) c0k8;
            if (c901849z != null) {
                C0N2 c0n2 = c901849z.A00;
                int i = 0;
                if (anonymousClass093.A02 == 40 && (c894547b = c4gj.A06) != null && c894547b.A0A) {
                    C894647c c894647c = c894547b.A03;
                    if (c894647c != null) {
                        String str = c894647c.A05;
                        int hashCode = str.hashCode();
                        if (hashCode != 433141802) {
                            if (hashCode == 1924835592 && str.equals("ACCEPT")) {
                                String str2 = c894647c.A07;
                                if (str2.equals("PENDING")) {
                                    String A062 = c92084Hl.A0I.A06(R.string.upi_mandate_transaction_detail_processing_update_header);
                                    C92004Hd c92004Hd = new C92004Hd();
                                    c92004Hd.A01 = A062;
                                    c92004Hd.A00 = new View$OnClickListenerC70163Rf(c92084Hl, anonymousClass093);
                                    list.add(c92004Hd);
                                } else if (str2.equals("FAILURE") && !TextUtils.isEmpty(c894647c.A02)) {
                                    C92004Hd c92004Hd2 = new C92004Hd();
                                    c92004Hd2.A01 = c92084Hl.A0I.A06(R.string.upi_mandate_transaction_detail_processing_update_failed_bottom_sheet_header);
                                    c92004Hd2.A00 = new View$OnClickListenerC70173Rg(c92084Hl, c4gj, anonymousClass093);
                                    list.add(c92004Hd2);
                                }
                            }
                        } else if (str.equals("UNKNOWN") && c894647c.A07.equals("INIT")) {
                            String A0D2 = c92084Hl.A0I.A0D(R.string.upi_mandate_transaction_detail_pending_update_header, c4gj.A09);
                            C92004Hd c92004Hd3 = new C92004Hd();
                            c92004Hd3.A01 = A0D2;
                            c92004Hd3.A00 = new View$OnClickListenerC70163Rf(c92084Hl, anonymousClass093);
                            list.add(c92004Hd3);
                        }
                    }
                    C014006r c014006r = anonymousClass093.A07;
                    if (c014006r != null) {
                        spannableStringBuilder = C03750Gx.A01(c92084Hl.A0I, c014006r, anonymousClass093.A0B());
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    C91994Hc c91994Hc = new C91994Hc(spannableStringBuilder);
                    if ("MAX".equals(c4gj.A06.A05)) {
                        c91994Hc.A00 = c92084Hl.A0I.A06(R.string.upi_mandate_payment_transaction_detail_amount_max);
                    }
                    list.add(c91994Hc);
                    C91414Ev c91414Ev = new C91414Ev();
                    C0VZ c0vz = c92084Hl.A08;
                    String str3 = c4gj.A09;
                    C894547b c894547b2 = c4gj.A06;
                    long j = c894547b2.A01;
                    long j2 = c894547b2.A00;
                    if (C0VZ.A01(j).equals(C0VZ.A01(j2))) {
                        C002301c c002301c = c0vz.A01;
                        A0D = c002301c.A0D(R.string.upi_mandate_payment_transaction_detail_payee_payment_note, str3, C000200d.A09(j2, c0vz.A00, c002301c));
                    } else {
                        C002301c c002301c2 = c0vz.A01;
                        AnonymousClass012 anonymousClass012 = c0vz.A00;
                        A0D = c002301c2.A0D(R.string.upi_mandate_payment_transaction_detail_payee_payment_note_date_range, str3, C000200d.A09(j, anonymousClass012, c002301c2), C000200d.A09(j2, anonymousClass012, c002301c2));
                    }
                    c91414Ev.A04 = A0D;
                    c91414Ev.A00 = 0;
                    c91414Ev.A03 = ((C4FI) c92084Hl).A03;
                    c91414Ev.A02 = c92084Hl;
                    C0DV c0dv = c92084Hl.A0Q;
                    c91414Ev.A01 = c0dv.A03().A9Z();
                    list.add(c91414Ev);
                    C91444Ey c91444Ey = new C91444Ey();
                    c91444Ey.A00 = C03750Gx.A00(anonymousClass093);
                    c91444Ey.A01 = anonymousClass093.A0B().A9M(c92084Hl.A0H.A00, 1);
                    C002301c c002301c3 = c92084Hl.A0I;
                    boolean A0O = anonymousClass093.A0O();
                    int i2 = R.string.payment;
                    if (A0O) {
                        i2 = R.string.payment_request;
                    }
                    c91444Ey.A02 = c002301c3.A06(i2);
                    C03750Gx c03750Gx = c92084Hl.A0U;
                    c91444Ey.A03 = c03750Gx.A0D(anonymousClass093);
                    int i3 = anonymousClass093.A01;
                    if (i3 != 20) {
                        if (i3 != 401 && i3 != 415) {
                            if (i3 == 417) {
                                A06 = c002301c3.A0D(R.string.upi_mandate_payment_request_status_schedule_payment_sent_time, C002501g.A0B(c002301c3, c92084Hl.A0G.A06(c4gj.A06.A00 - TimeZone.getTimeZone("Asia/Kolkata").getRawOffset())));
                            } else if (i3 != 418) {
                                A06 = "";
                            }
                        }
                        A06 = c92084Hl.A0T.A01(anonymousClass093, c0dv.A03().A9D());
                    } else {
                        Pair A05 = c03750Gx.A05(c4gj.A04 - c03750Gx.A03.A05());
                        if (A05 != null) {
                            A06 = c002301c3.A0A(R.plurals.upi_mandate_payment_request_status_time_remaining_to_approve, ((Number) A05.first).intValue(), A05.second);
                        } else {
                            A06 = c002301c3.A06(R.string.payments_request_status_request_expired);
                        }
                    }
                    c91444Ey.A06 = A06;
                    list.add(c91444Ey);
                    c92084Hl.A0D(list);
                    list.add(new C4F1());
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    if (anonymousClass093.A01 == 417) {
                        z = true;
                        if (c0n2 != null) {
                            C91454Ez c91454Ez = new C91454Ez();
                            c91454Ez.A04 = c002301c3.A06(R.string.transaction_sender_payment_method_label);
                            c91454Ez.A03 = C40841sx.A0G(c0dv, c002301c3, c0n2);
                            arrayList.add(c91454Ez);
                        }
                    }
                    C91454Ez c91454Ez2 = new C91454Ez();
                    c91454Ez2.A04 = c002301c3.A06(R.string.upi_mandate_payment_transaction_detail_date_row_title);
                    C894547b c894547b3 = c4gj.A06;
                    c91454Ez2.A03 = c0vz.A02(c894547b3.A01, c894547b3.A00);
                    arrayList.add(c91454Ez2);
                    if (z) {
                        C91454Ez c91454Ez3 = new C91454Ez();
                        c91454Ez3.A04 = c002301c3.A06(R.string.upi_mandate_bottom_row_item_frequency);
                        c91454Ez3.A03 = c002301c3.A06(R.string.upi_mandate_bottom_row_item_frequency_once);
                        arrayList.add(c91454Ez3);
                    }
                    c92084Hl.A0U(arrayList, c4gj);
                    c92084Hl.A0T(arrayList);
                    while (i < arrayList.size()) {
                        list.add(arrayList.get(i));
                        if (i != arrayList.size() - 1) {
                            list.add(new C91334En());
                        }
                        i++;
                    }
                    c92084Hl.A0E(list);
                    list.add(new C4F1());
                    if (!TextUtils.isEmpty(c4gj.A06.A06) && anonymousClass093.A01 == 417) {
                        C4FB c4fb = new C4FB(8);
                        c4fb.A07 = c002301c3.A06(R.string.upi_mandate_processing_cancel_failed);
                        ((C4FI) c92084Hl).A05.A0B(c4fb);
                        c92084Hl.A0V.AS1(new RunnableC70143Rd(c92084Hl, c4gj, anonymousClass093));
                        return;
                    }
                    return;
                }
                c92084Hl.A0F(list);
                c92084Hl.A0G(list);
                c92084Hl.A0E(list);
                if (anonymousClass093.A0O()) {
                    synchronized (anonymousClass093) {
                        if (anonymousClass093.A0O()) {
                            if (anonymousClass093.A01 == 17) {
                                i = 1;
                            }
                        }
                    }
                    if (i == 0) {
                        return;
                    }
                }
                list.add(new C91314El(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                return;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0D(java.util.List r11) {
        /*
            r10 = this;
            X.4Ew r2 = new X.4Ew
            r2.<init>()
            X.49z r0 = r10.A03
            X.093 r3 = r0.A01
            int r1 = r3.A02
            r5 = 1
            if (r1 == r5) goto Lb2
            r0 = 2
            if (r1 == r0) goto La7
            r0 = 10
            if (r1 == r0) goto L9d
            r0 = 20
            if (r1 == r0) goto L93
            r0 = 40
            if (r1 == r0) goto L93
            r0 = 100
            if (r1 == r0) goto Lb2
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto La7
            java.lang.String r0 = ""
        L27:
            r2.A05 = r0
            X.0Gx r0 = r10.A0U
            java.lang.String r0 = r0.A0G(r3)
            r2.A04 = r0
            long r0 = r3.A04
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L61
            X.01c r6 = r10.A0I
            r4 = 2131890129(0x7f120fd1, float:1.9414941E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r9 = 0
            X.012 r8 = r10.A0G
            long r0 = r8.A06(r0)
            java.lang.String r7 = X.C002501g.A0A(r6, r0)
            long r0 = r3.A04
            long r0 = r8.A06(r0)
            java.lang.String r0 = X.AbstractC40621sZ.A00(r6, r0)
            java.lang.String r0 = X.C02620Cd.A05(r6, r7, r0)
            r5[r9] = r0
            java.lang.String r0 = r6.A0D(r4, r5)
            r2.A06 = r0
        L61:
            java.lang.Boolean r0 = A00(r3)
            if (r0 == 0) goto L79
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L84
            com.whatsapp.jid.UserJid r1 = r3.A0B
            if (r1 == 0) goto L84
            X.05W r0 = r10.A0E
            X.06C r0 = r0.A0A(r1)
            r2.A03 = r0
        L79:
            X.3Rp r0 = new X.3Rp
            r0.<init>(r10, r2)
            r2.A02 = r0
            r11.add(r2)
            return
        L84:
            if (r0 != 0) goto L79
            com.whatsapp.jid.UserJid r1 = r3.A0C
            if (r1 == 0) goto L79
            X.05W r0 = r10.A0E
            X.06C r0 = r0.A0A(r1)
            r2.A03 = r0
            goto L79
        L93:
            X.01c r1 = r10.A0I
            r0 = 2131890152(0x7f120fe8, float:1.9414988E38)
            java.lang.String r0 = r1.A06(r0)
            goto L27
        L9d:
            X.01c r1 = r10.A0I
            r0 = 2131890153(0x7f120fe9, float:1.941499E38)
            java.lang.String r0 = r1.A06(r0)
            goto L27
        La7:
            X.01c r1 = r10.A0I
            r0 = 2131890154(0x7f120fea, float:1.9414992E38)
            java.lang.String r0 = r1.A06(r0)
            goto L27
        Lb2:
            X.01c r1 = r10.A0I
            r0 = 2131890151(0x7f120fe7, float:1.9414986E38)
            java.lang.String r0 = r1.A06(r0)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4FI.A0D(java.util.List):void");
    }

    public void A0E(List list) {
        C901849z c901849z = this.A03;
        AnonymousClass093 anonymousClass093 = c901849z.A01;
        C0N2 c0n2 = c901849z.A00;
        C4F0 c4f0 = new C4F0();
        c4f0.A00 = new View$OnClickListenerC70273Rq(this, c0n2, anonymousClass093);
        list.add(new C4F1());
        list.add(c4f0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00ba, code lost:
        if (r9 == 17) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(java.util.List r15) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4FI.A0F(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0187 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0G(java.util.List r11) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4FI.A0G(java.util.List):void");
    }

    public void A0H(boolean z) {
        C901649x c901649x = new C901649x(1);
        c901649x.A0D = z;
        this.A05.A0B(c901649x);
    }

    public void A0I(boolean z) {
        C4FH c4fh = this.A02;
        if (c4fh != null) {
            c4fh.A05(true);
        }
        C4FH c4fh2 = new C4FH(this, this.A04, this.A07, z);
        this.A02 = c4fh2;
        this.A0V.ARy(c4fh2, new Void[0]);
    }

    public boolean A0J(String str) {
        ClipboardManager A06 = this.A0F.A06();
        if (A06 == null) {
            this.A0B.A07(R.string.view_contact_unsupport, 0);
            return true;
        }
        try {
            A06.setPrimaryClip(ClipData.newPlainText(str, str));
            this.A0B.A07(R.string.transaction_payment_method_id_copied, 0);
            return true;
        } catch (NullPointerException e) {
            this.A0S.A08("getTransactionIdRow paymentTransactionID", e);
            this.A0B.A07(R.string.view_contact_unsupport, 0);
            return true;
        }
    }

    @Override // X.C2OS
    public void AMs() {
        A0I(false);
    }
}
