package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Hl */
/* loaded from: classes3.dex */
public class C92084Hl extends C4FI {
    public boolean A00;
    public final C01B A01;
    public final C45A A02;
    public final C894947f A03;
    public final C0EX A04;
    public final C4C8 A05;
    public final C2Ly A06;
    public final C90944Da A07;
    public final C0VZ A08;

    public C92084Hl(AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C001200o c001200o, InterfaceC002901k interfaceC002901k, C01B c01b, C013406l c013406l, C03750Gx c03750Gx, C05W c05w, C02E c02e, C002301c c002301c, C49682Lx c49682Lx, C0DV c0dv, C40261rr c40261rr, C0C9 c0c9, C0VZ c0vz, C900149i c900149i, C90944Da c90944Da, C0E7 c0e7, C0GZ c0gz, C894947f c894947f, C463026g c463026g, C0DW c0dw, C013606n c013606n, C013306k c013306k, C45A c45a, C28S c28s, C28O c28o, C0EX c0ex, C03090Ed c03090Ed, C2Ly c2Ly, Bundle bundle) {
        super(anonymousClass012, c018508q, c02l, c001200o, interfaceC002901k, c013406l, c03750Gx, c05w, c02e, c002301c, c0dv, c40261rr, c0c9, c900149i, c0gz, c0dw, c013306k, c28o, c0ex, c03090Ed, bundle);
        this.A01 = c01b;
        this.A08 = c0vz;
        this.A07 = c90944Da;
        this.A03 = c894947f;
        this.A02 = c45a;
        this.A04 = c0ex;
        this.A06 = c2Ly;
        this.A05 = new C4C8(c001200o.A00, c018508q, c49682Lx, c0e7, c894947f, c463026g, c013606n, c45a, c28s);
        this.A00 = bundle.getBoolean("extra_return_after_completion");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0011, code lost:
        if (r0 == false) goto L18;
     */
    @Override // X.C4FI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A02(X.AnonymousClass093 r3) {
        /*
            r2 = this;
            X.0K8 r1 = r3.A09
            X.4GJ r1 = (X.C4GJ) r1
            com.whatsapp.jid.UserJid r0 = r3.A0C
            if (r0 != 0) goto L13
            if (r1 == 0) goto L13
            java.lang.String r0 = r1.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 != 0) goto L14
        L13:
            r1 = 0
        L14:
            boolean r0 = r3.A0O()
            if (r0 == 0) goto L2a
            if (r1 == 0) goto L2a
            java.lang.String r0 = r3.A0D
            boolean r0 = X.AnonymousClass093.A0A(r0)
            if (r0 == 0) goto L27
            java.lang.String r0 = r3.A0D
            return r0
        L27:
            java.lang.String r0 = r3.A0I
            return r0
        L2a:
            java.lang.String r0 = super.A02(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92084Hl.A02(X.093):java.lang.String");
    }

    @Override // X.C4FI
    public void A03() {
        AnonymousClass093 anonymousClass093;
        final String str;
        C014406v c014406v = this.A0S;
        c014406v.A07(null, "IN- HANDLE_SEND_AGAIN start", null);
        C901849z c901849z = super.A03;
        if (c901849z != null && (anonymousClass093 = c901849z.A01) != null && anonymousClass093.A0N) {
            c014406v.A07(null, "IN- HANDLE_SEND_AGAIN transaction is not null and it's interop", null);
            C0K8 c0k8 = super.A03.A01.A09;
            if (c0k8 instanceof C4GJ) {
                str = ((C4GJ) c0k8).A09;
            } else {
                str = "";
            }
            if (C4AU.A01(str)) {
                if (!this.A02.A07(str)) {
                    A0H(true);
                    this.A05.A00(str, null, new InterfaceC53332eX() { // from class: X.3jw
                        {
                            C92084Hl.this = this;
                        }

                        @Override // X.InterfaceC53332eX
                        public final void AOF(boolean z, boolean z2, String str2, String str3, UserJid userJid, boolean z3, C28Q c28q) {
                            C92084Hl.this.A0S(str, z, str2, str3, userJid, z3, c28q);
                        }
                    });
                    return;
                }
                c014406v.A07(null, "IN- HANDLE_SEND_AGAIN user blocked checked locally", null);
                C901649x c901649x = new C901649x(13);
                c901649x.A0A = str;
                super.A05.A0B(c901649x);
                return;
            }
            c014406v.A07(null, "IN- HANDLE_SEND_AGAIN vpa valid check locally, incorrect vpa", null);
            C901649x c901649x2 = new C901649x(8);
            c901649x2.A07 = this.A0I.A06(R.string.payment_invalid_vpa_error_text);
            super.A05.A0B(c901649x2);
            return;
        }
        if (c901849z == null) {
            c014406v.A07(null, "IN- HANDLE_SEND_AGAIN transactionDetailData is null?", null);
        } else {
            AnonymousClass093 anonymousClass0932 = c901849z.A01;
            if (anonymousClass0932 == null) {
                c014406v.A07(null, "IN- HANDLE_SEND_AGAIN transactionInfo is null?", null);
            } else {
                StringBuilder A0P = C000200d.A0P("IN- HANDLE_SEND_AGAIN isInterop is ");
                A0P.append(anonymousClass0932.A0N);
                c014406v.A07(null, A0P.toString(), null);
            }
        }
        c014406v.A07(null, "IN- HANDLE_SEND_AGAIN calling super", null);
        super.A05();
    }

    /* renamed from: A0K */
    public final void A0L() {
        A0H(true);
        C2Ly c2Ly = this.A06;
        String str = super.A03.A01.A0I;
        C2OV c2ov = new C2OV() { // from class: X.3jx
            {
                C92084Hl.this = this;
            }

            @Override // X.C2OV
            public final void AJB(String str2) {
                C92084Hl.this.A0M();
            }
        };
        if (c2Ly != null) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            c2Ly.A07(arrayList, c2ov);
            return;
        }
        throw null;
    }

    public /* synthetic */ void A0M() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C91324Em(new View$OnClickListenerC70193Ri(this)));
        ((C4FI) this).A00.A0B(arrayList);
        A0H(false);
    }

    public /* synthetic */ void A0N(AnonymousClass093 anonymousClass093) {
        C4FB c4fb = new C4FB(103);
        ((C901649x) c4fb).A04 = anonymousClass093;
        super.A05.A0B(c4fb);
    }

    public /* synthetic */ void A0O(C4GJ c4gj) {
        C4FB c4fb = new C4FB(102);
        c4fb.A03 = c4gj.A0H;
        super.A05.A0B(c4fb);
    }

    public void A0P(C4GJ c4gj, AnonymousClass093 anonymousClass093) {
        c4gj.A06.A03.A02 = null;
        this.A0K.A0i(anonymousClass093);
    }

    public /* synthetic */ void A0Q(C4GJ c4gj, AnonymousClass093 anonymousClass093) {
        C4FB c4fb = new C4FB(8);
        C002301c c002301c = this.A0I;
        c4fb.A0B = c002301c.A06(R.string.upi_mandate_accept_update_failed_title);
        c4fb.A07 = c002301c.A06(R.string.upi_mandate_accept_update_failed_description);
        super.A05.A0B(c4fb);
        this.A0V.AS1(new RunnableC70183Rh(this, c4gj, anonymousClass093));
        this.A04.A02(anonymousClass093);
    }

    public /* synthetic */ void A0R(C4GJ c4gj, AnonymousClass093 anonymousClass093) {
        c4gj.A06.A06 = "";
        this.A0K.A0i(anonymousClass093);
    }

    public void A0S(String str, boolean z, String str2, String str3, UserJid userJid, boolean z2, C28Q c28q) {
        C014406v c014406v = this.A0S;
        c014406v.A07(null, "IN- HANDLE_SEND_AGAIN vpa valid check response", null);
        A0H(false);
        if (z && c28q == null) {
            if (!z2) {
                c014406v.A07(null, "IN- HANDLE_SEND_AGAIN starting payment", null);
                C4FB c4fb = new C4FB(105);
                c4fb.A04 = str;
                c4fb.A09 = str3;
                c4fb.A08 = str2;
                super.A05.A0B(c4fb);
                return;
            }
        } else if (!z2) {
            if (c28q != null) {
                c014406v.A07(null, "IN- HANDLE_SEND_AGAIN error from server", null);
                C901649x c901649x = new C901649x(8);
                C002301c c002301c = this.A0I;
                String A06 = c002301c.A06(C90944Da.A00(c28q.A00, this.A03.A04));
                if (TextUtils.isEmpty(A06)) {
                    A06 = c002301c.A06(R.string.payment_invalid_vpa_error_text);
                }
                c901649x.A07 = A06;
                super.A05.A0B(c901649x);
                return;
            }
            c014406v.A04("Unable to validate the receiver to send payment again");
            return;
        }
        c014406v.A07(null, "IN- HANDLE_SEND_AGAIN server said user blocked", null);
        C901649x c901649x2 = new C901649x(13);
        c901649x2.A05 = userJid;
        c901649x2.A0A = str;
        super.A05.A0B(c901649x2);
    }

    public final void A0T(List list) {
        C4GJ c4gj = (C4GJ) super.A03.A01.A09;
        if (!this.A01.A0E(C01C.A1z) || TextUtils.isEmpty(c4gj.A0H)) {
            return;
        }
        C91454Ez c91454Ez = new C91454Ez();
        C002301c c002301c = this.A0I;
        c91454Ez.A04 = c002301c.A06(R.string.upi_url_reference_section_title);
        c91454Ez.A03 = c002301c.A06(R.string.upi_url_reference_section_description);
        c91454Ez.A01 = new View$OnClickListenerC70153Re(this, c4gj);
        list.add(c91454Ez);
    }

    public final void A0U(List list, final C4GJ c4gj) {
        C894547b c894547b = c4gj.A06;
        if (c894547b == null || TextUtils.isEmpty(c894547b.A08)) {
            return;
        }
        C91454Ez c91454Ez = new C91454Ez();
        c91454Ez.A04 = this.A0I.A06(R.string.upi_mandate_payment_transaction_detail_umn_row_title);
        c91454Ez.A03 = c4gj.A06.A08;
        c91454Ez.A02 = new View.OnLongClickListener() { // from class: X.3Rc
            {
                C92084Hl.this = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C92084Hl.this.A0V(c4gj);
            }
        };
        list.add(c91454Ez);
    }

    public /* synthetic */ boolean A0V(C4GJ c4gj) {
        ClipboardManager A06 = this.A0F.A06();
        if (A06 == null) {
            this.A0B.A07(R.string.view_contact_unsupport, 0);
            return true;
        }
        try {
            String str = c4gj.A06.A08;
            A06.setPrimaryClip(ClipData.newPlainText(str, str));
            this.A0B.A07(R.string.upi_mandate_number_copied, 0);
            return true;
        } catch (NullPointerException unused) {
            this.A0B.A07(R.string.view_contact_unsupport, 0);
            return true;
        }
    }
}
