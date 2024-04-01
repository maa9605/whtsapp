package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.AbstractActivityC92484Li;
import X.AbstractC005302j;
import X.ActivityC02290Ap;
import X.AnonymousClass008;
import X.AnonymousClass024;
import X.AnonymousClass093;
import X.AnonymousClass485;
import X.AnonymousClass490;
import X.C000200d;
import X.C000700j;
import X.C002301c;
import X.C002701i;
import X.C003101m;
import X.C013306k;
import X.C013606n;
import X.C013806p;
import X.C014006r;
import X.C014406v;
import X.C018508q;
import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C01C;
import X.C02590Ca;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03630Gl;
import X.C03650Gn;
import X.C04630Le;
import X.C04P;
import X.C05U;
import X.C05V;
import X.C06C;
import X.C0C9;
import X.C0DK;
import X.C0EU;
import X.C0EX;
import X.C0GA;
import X.C0JJ;
import X.C0K1;
import X.C0L5;
import X.C0L7;
import X.C0N0;
import X.C0N2;
import X.C0U1;
import X.C0Zn;
import X.C28Q;
import X.C28S;
import X.C2GW;
import X.C2OT;
import X.C3NV;
import X.C3PN;
import X.C3PO;
import X.C3PP;
import X.C3PS;
import X.C3PV;
import X.C40081rY;
import X.C40261rr;
import X.C40841sx;
import X.C41751uS;
import X.C45A;
import X.C463026g;
import X.C48B;
import X.C48D;
import X.C48E;
import X.C49K;
import X.C4A5;
import X.C4AG;
import X.C4AH;
import X.C4AI;
import X.C4AJ;
import X.C4AK;
import X.C4AL;
import X.C4AM;
import X.C4AT;
import X.C4C2;
import X.C4C8;
import X.C4CE;
import X.C4GI;
import X.C4GJ;
import X.C4I1;
import X.C4IA;
import X.C4KG;
import X.C4Lq;
import X.C78273je;
import X.C90944Da;
import X.C91004Dg;
import X.C91024Di;
import X.C91044Dk;
import X.C91054Dl;
import X.C91474Fb;
import X.C91504Fe;
import X.C91754Gd;
import X.InterfaceC013706o;
import X.InterfaceC40271rs;
import X.InterfaceC53332eX;
import X.RunnableC69683Pj;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.widget.$$Lambda$cfXOxw_xiRBPGdEVyDTISt7ZSk;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class IndiaUpiPaymentActivity extends C4Lq implements C48E, C4AH, C4AG, C4A5, AnonymousClass485, C48D {
    public C40261rr A00;
    public C0L7 A01;
    public AnonymousClass008 A02;
    public C018708s A03;
    public C0Zn A04;
    public C0L5 A05;
    public C02E A06;
    public C02F A07;
    public C002301c A08;
    public C0DK A09;
    public C0C9 A0A;
    public C013306k A0B;
    public C06C A0C;
    public InterfaceC013706o A0D;
    public C014006r A0E;
    public C013606n A0F;
    public C0N2 A0G;
    public C40081rY A0H;
    public UserJid A0I;
    public C45A A0J;
    public C4GJ A0K;
    public C41751uS A0L;
    public C28S A0M;
    public C0EU A0N;
    public C0EX A0O;
    public C2OT A0P;
    public C4C2 A0Q;
    public C4C8 A0R;
    public AnonymousClass490 A0S;
    public C91044Dk A0T;
    public C91054Dl A0U;
    public C4I1 A0V;
    public PaymentView A0W;
    public C4AT A0X;
    public C02O A0Y;
    public C05U A0Z;
    public String A0a;
    public List A0b;
    public boolean A0c;
    public boolean A0e;
    public boolean A0f;
    public boolean A0d = false;
    public final C014406v A0i = C014406v.A00("IndiaUpiPaymentActivity", "payment", "IN");
    public final C0GA A0g = new C0GA() { // from class: X.4Dd
        {
            IndiaUpiPaymentActivity.this = this;
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            if (abstractC005302j != null) {
                IndiaUpiPaymentActivity indiaUpiPaymentActivity = IndiaUpiPaymentActivity.this;
                if (abstractC005302j.equals(indiaUpiPaymentActivity.A0I)) {
                    indiaUpiPaymentActivity.A1u();
                }
            }
        }

        @Override // X.C0GA
        public void A02(AbstractC005302j abstractC005302j) {
            if (abstractC005302j != null) {
                IndiaUpiPaymentActivity indiaUpiPaymentActivity = IndiaUpiPaymentActivity.this;
                if (abstractC005302j.equals(indiaUpiPaymentActivity.A0I)) {
                    indiaUpiPaymentActivity.A1u();
                }
            }
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            if (userJid != null) {
                IndiaUpiPaymentActivity indiaUpiPaymentActivity = IndiaUpiPaymentActivity.this;
                if (userJid.equals(indiaUpiPaymentActivity.A0I)) {
                    indiaUpiPaymentActivity.A1u();
                }
            }
        }
    };
    public final C2GW A0h = new C2GW() { // from class: X.4De
        {
            IndiaUpiPaymentActivity.this = this;
        }

        @Override // X.C2GW
        public void A00() {
            IndiaUpiPaymentActivity indiaUpiPaymentActivity = IndiaUpiPaymentActivity.this;
            C91054Dl c91054Dl = indiaUpiPaymentActivity.A0U;
            if (c91054Dl != null) {
                c91054Dl.A05(true);
                indiaUpiPaymentActivity.A0U = null;
            }
            C91054Dl c91054Dl2 = new C91054Dl(indiaUpiPaymentActivity);
            indiaUpiPaymentActivity.A0U = c91054Dl2;
            ((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A06.ARy(c91054Dl2, new Void[0]);
        }
    };

    @Override // X.C4AH
    public Activity A8I() {
        return this;
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap
    public void A10(int i) {
        if (i == R.string.payments_send_insufficient_funds || i == R.string.payments_amount_cannot_edit) {
            return;
        }
        A1W();
        finish();
    }

    @Override // X.C4KG
    public void A1S() {
        ((AbstractActivityC92444Kp) this).A0E = null;
        ((AbstractActivityC92444Kp) this).A0F = null;
        super.A1S();
    }

    public final C0JJ A1n() {
        PaymentView paymentView = this.A0W;
        String paymentNote = paymentView != null ? paymentView.getPaymentNote() : null;
        C05U c05u = this.A0Z;
        AbstractC005302j abstractC005302j = ((C4KG) this).A08;
        if (AnonymousClass024.A0j(paymentNote)) {
            paymentNote = "";
        }
        List mentionedJids = this.A0W.getMentionedJids();
        long j = ((C4KG) this).A01;
        C0JJ A04 = c05u.A04(abstractC005302j, paymentNote, 0L, null, mentionedJids, j != 0 ? this.A0A.A0C(j) : null);
        if (C003101m.A0U(((C4KG) this).A08)) {
            A04.A0d(((C4KG) this).A0A);
        }
        return A04;
    }

    public final String A1o() {
        if (!AFm() || TextUtils.isEmpty(((AbstractActivityC92444Kp) this).A0A)) {
            C06C c06c = this.A0C;
            return c06c == null ? ((AbstractActivityC92444Kp) this).A0E : this.A03.A06(c06c);
        }
        return ((AbstractActivityC92444Kp) this).A0A;
    }

    public final String A1p() {
        if (!TextUtils.isEmpty(((AbstractActivityC92444Kp) this).A07)) {
            C014406v c014406v = this.A0i;
            StringBuilder A0P = C000200d.A0P("getSeqNum/incomingPayRequestId");
            A0P.append(((AbstractActivityC92444Kp) this).A07);
            c014406v.A07(null, A0P.toString(), null);
            return ((AbstractActivityC92444Kp) this).A07;
        } else if (!TextUtils.isEmpty(super.A0P)) {
            C014406v c014406v2 = this.A0i;
            StringBuilder A0P2 = C000200d.A0P("getSeqNum/transactionId");
            A0P2.append(super.A0P);
            c014406v2.A07(null, A0P2.toString(), null);
            return super.A0P;
        } else {
            String A1U = A1U(((AbstractActivityC92484Li) this).A05.A02());
            C014406v c014406v3 = this.A0i;
            StringBuilder A0P3 = C000200d.A0P("getSeqNum/seqNum generated:");
            A0P3.append(C40841sx.A0O(A1U));
            c014406v3.A07(null, A0P3.toString(), null);
            return A1U;
        }
    }

    public void A1q() {
        C002701i.A18(this, 10);
        A12(R.string.register_wait_message);
        String A06 = ((AbstractActivityC92484Li) this).A05.A06();
        boolean isEmpty = TextUtils.isEmpty(A06);
        C4GJ c4gj = this.A0K;
        boolean z = c4gj == null;
        if (isEmpty) {
            ((AbstractActivityC92484Li) this).A0E.A00();
        } else if (!z) {
            c4gj.A0D = A1p();
            ((AbstractActivityC92484Li) this).A09.A03("upi-get-credential");
            C0N2 c0n2 = this.A0G;
            String str = c0n2.A08;
            int i = ((C4IA) this.A0G.A06).A04;
            C4GJ c4gj2 = this.A0K;
            C014006r c014006r = this.A0E;
            String str2 = c0n2.A0A;
            String A1o = A1o();
            C06C c06c = this.A0C;
            A1l(A06, str, i, c4gj2, c014006r, str2, A1o, c06c == null ? null : C04630Le.A00(c06c));
        } else {
            A1g();
        }
    }

    public void A1r() {
        String str = super.A0P;
        if (str != null) {
            C014406v c014406v = this.A0i;
            StringBuilder A0P = C000200d.A0P("onPayRequestFromNonWa; request is paid; transaction id: ");
            A0P.append(str);
            c014406v.A07(null, A0P.toString(), null);
            this.A0B.A0f(super.A0P, 1, ((C4KG) this).A05.A05(), ((C4KG) this).A05.A05(), 401);
            AnonymousClass093 A0P2 = this.A0B.A0P(null, super.A0P);
            C018508q c018508q = ((ActivityC02290Ap) this).A0A;
            c018508q.A02.post(new C3PP(this, A0P2));
            return;
        }
        throw null;
    }

    public void A1s() {
        C014406v c014406v = this.A0i;
        StringBuilder A0P = C000200d.A0P("onPayRequestFromNonWa; request is expired; transaction id: ");
        A0P.append(super.A0P);
        c014406v.A07(null, A0P.toString(), null);
        this.A0B.A0d(this.A0B.A0P(null, super.A0P));
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x024b, code lost:
        if (r5 == false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1t() {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentActivity.A1t():void");
    }

    public final void A1u() {
        AbstractC005302j abstractC005302j = ((C4KG) this).A08;
        this.A0I = C003101m.A0U(abstractC005302j) ? ((C4KG) this).A0A : UserJid.of(abstractC005302j);
        C06C A02 = AFm() ? null : this.A09.A02(this.A0I);
        this.A0C = A02;
        PaymentView paymentView = this.A0W;
        if (paymentView != null) {
            if (A02 != null) {
                String A08 = A02 == null ? ((AbstractActivityC92444Kp) this).A0E : this.A03.A08(A02, false);
                paymentView.A0i = A08;
                paymentView.A09.setText(A08);
                paymentView.A0M.A02(A02, paymentView.A0K);
                return;
            }
            String str = ((AbstractActivityC92444Kp) this).A0E;
            String str2 = ((AbstractActivityC92444Kp) this).A0A;
            if (!TextUtils.isEmpty(str2)) {
                paymentView.A0i = str2;
                paymentView.A0A.setText(str);
            } else {
                paymentView.A0i = str;
            }
            paymentView.A09.setText(paymentView.A0i);
            paymentView.A0L.A05(paymentView.A0K, R.drawable.avatar_contact);
        }
    }

    public final void A1v() {
        PaymentView paymentView;
        if (this.A0f) {
            return;
        }
        if (((ActivityC02290Ap) this).A04 == null) {
            setContentView(this.A0W);
        }
        A1u();
        String str = this.A0a;
        if (str != null && (paymentView = this.A0W) != null) {
            paymentView.A0j = str;
        }
        List list = this.A0b;
        if (list != null) {
            list.clear();
        }
        if (this.A0U == null) {
            C91054Dl c91054Dl = new C91054Dl(this);
            this.A0U = c91054Dl;
            ((AbstractActivityC92444Kp) this).A06.ARy(c91054Dl, new Void[0]);
        }
    }

    public final void A1w() {
        if (AFm() && TextUtils.isEmpty(((AbstractActivityC92444Kp) this).A0A)) {
            String A05 = ((AbstractActivityC92484Li) this).A05.A05();
            if (A05 != null && A05.equals(((AbstractActivityC92444Kp) this).A0E)) {
                A26(R.string.payment_self_vpa_error_text, new Object[0]);
                return;
            }
            A12(R.string.payment_vpa_verify_in_progress);
            this.A0R.A00(((AbstractActivityC92444Kp) this).A0E, null, new InterfaceC53332eX() { // from class: X.3j2
                {
                    IndiaUpiPaymentActivity.this = this;
                }

                @Override // X.InterfaceC53332eX
                public final void AOF(boolean z, boolean z2, String str, String str2, UserJid userJid, boolean z3, C28Q c28q) {
                    IndiaUpiPaymentActivity.this.A2M(z, z2, str, str2, userJid, z3, c28q);
                }
            });
            return;
        }
        A1v();
    }

    public /* synthetic */ void A1x() {
        C002701i.A18(this, 10);
        Intent intent = new Intent(this, IndiaUpiResetPinActivity.class);
        intent.putExtra("extra_bank_account", this.A0G);
        startActivity(intent);
        A1W();
        finish();
    }

    public /* synthetic */ void A1y() {
        C002701i.A18(this, 10);
        A1W();
        finish();
    }

    public /* synthetic */ void A1z() {
        C002701i.A18(this, 11);
        Intent intent = new Intent(this, IndiaUpiResetPinActivity.class);
        intent.putExtra("extra_bank_account", this.A0G);
        startActivity(intent);
        A1W();
        finish();
    }

    public /* synthetic */ void A20() {
        C002701i.A18(this, 11);
        A1W();
        finish();
    }

    public /* synthetic */ void A21() {
        C002701i.A18(this, 12);
        Intent intent = new Intent(this, IndiaUpiResetPinActivity.class);
        intent.putExtra("extra_bank_account", this.A0G);
        startActivity(intent);
        A1W();
        finish();
    }

    public /* synthetic */ void A22() {
        C002701i.A18(this, 12);
        A1W();
        finish();
    }

    public /* synthetic */ void A23() {
        C002701i.A18(this, 13);
        ((AbstractActivityC92484Li) this).A07.A00();
    }

    public /* synthetic */ void A24() {
        C002701i.A18(this, 13);
        A1W();
        finish();
    }

    public /* synthetic */ void A25() {
        C002701i.A18(this, 22);
        A1W();
        finish();
    }

    public final void A26(int i, Object... objArr) {
        ARS();
        ((AbstractActivityC92484Li) this).A0L = false;
        if (i == 0) {
            i = R.string.payments_transfer_not_init;
        } else if (i == R.string.payments_receiver_not_in_region || i == R.string.payments_receiver_disabled_in_country || i == R.string.payments_receiver_app_version_unsupported || i == R.string.payments_receiver_generic_error || i == R.string.payments_receiver_not_in_group) {
            Object[] objArr2 = new Object[1];
            C06C c06c = this.A0C;
            objArr2[0] = c06c == null ? ((AbstractActivityC92444Kp) this).A0E : this.A03.A08(c06c, false);
            AUl(0, i, objArr2);
            return;
        }
        AUl(0, i, objArr);
    }

    public /* synthetic */ void A27(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        A1W();
        finish();
    }

    public /* synthetic */ void A28(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        A12(R.string.register_wait_message);
        ALJ(((AbstractActivityC92484Li) this).A05.A06(), null);
    }

    public /* synthetic */ void A29(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        A1W();
        finish();
    }

    public final void A2A(C0N2 c0n2) {
        this.A0G = c0n2;
        PaymentView paymentView = this.A0W;
        if (paymentView != null) {
            paymentView.setBankLogo(c0n2.A04());
            this.A0W.setPaymentMethodText(C40841sx.A0H(((AbstractActivityC92484Li) this).A0C, this.A08, this.A0G, false));
        }
    }

    public final void A2B(AnonymousClass093 anonymousClass093) {
        Intent intent = new Intent(this, IndiaUpiPaymentTransactionDetailsActivity.class);
        AbstractC005302j abstractC005302j = anonymousClass093.A0A;
        boolean z = anonymousClass093.A0O;
        String str = anonymousClass093.A0J;
        if (!intent.hasExtra("fMessageKeyJid") && !intent.hasExtra("fMessageKeyFromMe") && !intent.hasExtra("fMessageKeyId")) {
            intent.putExtra("fMessageKeyId", str).putExtra("fMessageKeyFromMe", z).putExtra("fMessageKeyJid", C003101m.A07(abstractC005302j));
            intent.putExtra("extra_transaction_id", anonymousClass093.A0I);
            intent.putExtra("extra_transaction_ref", ((AbstractActivityC92444Kp) this).A0D);
            if (this.A0e) {
                intent.setFlags(33554432);
                intent.putExtra("extra_return_after_completion", true);
            }
            A14(intent);
            ARS();
            A1W();
            finish();
            return;
        }
        throw new IllegalArgumentException("Intent already contains key.");
    }

    public /* synthetic */ void A2C(AnonymousClass093 anonymousClass093) {
        this.A0O.A02(anonymousClass093);
        A2B(anonymousClass093);
    }

    public /* synthetic */ void A2D(AnonymousClass093 anonymousClass093) {
        this.A0O.A02(anonymousClass093);
        A2B(anonymousClass093);
    }

    public final void A2E(C28Q c28q) {
        String string;
        ARS();
        if (c28q == null) {
            A1W();
            ((AbstractActivityC92444Kp) this).A06.AS1(new C3PS(this));
            return;
        }
        int i = c28q.A00;
        if (i == 11495) {
            C014406v c014406v = this.A0i;
            StringBuilder A0P = C000200d.A0P("collect request expired; showErrorAndFinish; error code: ");
            A0P.append(i);
            c014406v.A07(null, A0P.toString(), null);
            if (((AbstractActivityC92484Li) this).A0B.A01() != null) {
                string = ((AbstractActivityC92484Li) this).A0B.A01().A81(this.A08, this.A0E);
            } else {
                string = getString(R.string.unknown_amount_payment);
            }
            ((AbstractActivityC92444Kp) this).A06.AS1(new C3PN(this));
            A26(R.string.payments_request_system_message_to_me_expired, ((AbstractActivityC92444Kp) this).A0E, string);
        } else if (C90944Da.A03(this, "upi-accept-collect", i, false)) {
        } else {
            C014406v c014406v2 = this.A0i;
            StringBuilder A0P2 = C000200d.A0P("onPayRequestFromNonWa; error code: ");
            A0P2.append(c28q.A00);
            c014406v2.A08(A0P2.toString(), null);
            A1g();
        }
    }

    public final void A2F(C28Q c28q, boolean z) {
        ARS();
        if (c28q == null) {
            A1W();
            ((AbstractActivityC92444Kp) this).A06.AS1(new RunnableC69683Pj(this, z));
        } else if (C90944Da.A03(this, "upi-send-to-vpa", c28q.A00, false)) {
        } else {
            A1g();
        }
    }

    public /* synthetic */ void A2G(C0JJ c0jj) {
        C463026g c463026g = ((C4KG) this).A0C;
        UserJid userJid = this.A0I;
        if (userJid != null) {
            c463026g.A08(c0jj, userJid, this.A0E);
            return;
        }
        throw null;
    }

    public /* synthetic */ void A2H(C0JJ c0jj) {
        ((C4KG) this).A0C.A0C(c0jj, this.A0E, this.A0D, this.A0G, this.A0K, ((C4KG) this).A0O, null, false);
    }

    public void A2I(boolean z) {
        boolean z2;
        AnonymousClass093 A02;
        C02L c02l = ((AbstractActivityC92484Li) this).A01;
        c02l.A05();
        C0K1 c0k1 = c02l.A01;
        if (c0k1 != null) {
            if (z) {
                InterfaceC013706o interfaceC013706o = this.A0D;
                String A9K = interfaceC013706o.A9K();
                C014006r c014006r = this.A0E;
                String str = C03650Gn.A0E.A02;
                z2 = true;
                A02 = AnonymousClass093.A02(10, 11, null, (UserJid) c0k1.A09, A9K, c014006r, interfaceC013706o, -1L, null, str, AnonymousClass093.A01(str), 1);
            } else {
                InterfaceC013706o interfaceC013706o2 = this.A0D;
                String A9K2 = interfaceC013706o2.A9K();
                C014006r c014006r2 = this.A0E;
                String str2 = C03650Gn.A0E.A02;
                z2 = true;
                A02 = AnonymousClass093.A02(1, 401, (UserJid) c0k1.A09, null, A9K2, c014006r2, interfaceC013706o2, -1L, null, str2, AnonymousClass093.A01(str2), 1);
            }
            A02.A04 = ((C4KG) this).A05.A05();
            A02.A0D = "UNSET";
            C4GJ c4gj = this.A0K;
            A02.A09 = c4gj;
            A02.A0N = z2;
            if (z) {
                c4gj.A0O(((AbstractActivityC92444Kp) this).A0E);
            } else {
                c4gj.A0N(((AbstractActivityC92444Kp) this).A0E);
            }
            String str3 = c4gj.A08;
            C000700j.A03(str3);
            AnonymousClass093 A0P = this.A0B.A0P(str3, null);
            C014406v c014406v = this.A0i;
            if (A0P == null) {
                c014406v.A07(null, "IN- HANDLE_SEND_AGAIN Old txn is null", null);
            } else {
                StringBuilder A0P2 = C000200d.A0P("IN- HANDLE_SEND_AGAIN Old txn is not null, interop is ");
                A0P2.append(A0P.A0N);
                c014406v.A07(null, A0P2.toString(), null);
            }
            this.A0B.A0k(str3, A02, A0P);
            StringBuilder A0P3 = C000200d.A0P("getPayNonWaVpaCallback added new transaction with trans id: ");
            A0P3.append(A02.A0I);
            c014406v.A07(null, A0P3.toString(), null);
            C018508q c018508q = ((ActivityC02290Ap) this).A0A;
            c018508q.A02.post(new C3PV(this, A02));
            return;
        }
        throw null;
    }

    public final void A2J(boolean z) {
        Intent intent = new Intent(this, IndiaUpiEducationActivity.class);
        intent.putExtra("extra_use_pin_education_type", 2);
        intent.putExtra("extra_bank_account", C40841sx.A0M(this.A0G.A0A));
        intent.putExtra("extra_education_type", 1);
        if (!z) {
            intent.addFlags(65536);
        }
        startActivityForResult(intent, 1002);
    }

    public /* synthetic */ void A2K(boolean z) {
        if (z) {
            A1v();
        } else {
            C002701i.A19(this, 22);
        }
    }

    public /* synthetic */ void A2L(boolean z) {
        if (z) {
            A1w();
        } else {
            C002701i.A19(this, 22);
        }
    }

    public /* synthetic */ void A2M(boolean z, boolean z2, String str, String str2, UserJid userJid, boolean z3, C28Q c28q) {
        this.A0d = z2;
        ARS();
        if (z && c28q == null) {
            ((AbstractActivityC92444Kp) this).A0A = str;
            ((AbstractActivityC92444Kp) this).A0F = str2;
            this.A0I = userJid;
            if (z3) {
                this.A0P.A01(this, userJid, ((AbstractActivityC92444Kp) this).A0E, true, false, new InterfaceC40271rs() { // from class: X.3j3
                    {
                        IndiaUpiPaymentActivity.this = this;
                    }

                    @Override // X.InterfaceC40271rs
                    public final void AOE(boolean z4) {
                        IndiaUpiPaymentActivity.this.A2K(z4);
                    }
                });
                return;
            } else {
                A1v();
                return;
            }
        }
        AUl(0, R.string.payment_id_cannot_verify_error_text_default, getString(R.string.india_upi_payment_id_name));
    }

    public final boolean A2N(C4GI c4gi) {
        if (!c4gi.A03 || c4gi.A04) {
            return false;
        }
        ARS();
        if (c4gi.A05) {
            Intent intent = new Intent(this, IndiaUpiInvitePaymentActivity.class);
            intent.putExtra("extra_receiver_jid", C003101m.A07(this.A0I));
            intent.putExtra("extra_receiver", this.A03.A06(this.A0C));
            A15(intent, 1004);
            return true;
        }
        C002701i.A19(this, 15);
        return true;
    }

    @Override // X.C4AH
    public String AC7() {
        return ((AbstractActivityC92444Kp) this).A0E;
    }

    @Override // X.C4AH
    public boolean AFc() {
        return ((C4KG) this).A0N != null || ((C4KG) this).A0M == null;
    }

    @Override // X.C4AH
    public boolean AFm() {
        return ((C4KG) this).A0A == null && ((C4KG) this).A08 == null && !TextUtils.isEmpty(((AbstractActivityC92444Kp) this).A0E);
    }

    @Override // X.C4AG
    public void AH5(String str) {
        C4I1 c4i1 = this.A0V;
        boolean z = !str.isEmpty();
        c4i1.A00.setEnabled(z);
        c4i1.A00.setClickable(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x00e6, code lost:
        if (r39.A0E.A00.compareTo(r42.A00) >= 0) goto L28;
     */
    @Override // X.C48E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AIO(boolean r40, boolean r41, X.C014006r r42, X.C014006r r43, X.C4GI r44, X.C4GI r45, X.C28Q r46) {
        /*
            Method dump skipped, instructions count: 1528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentActivity.AIO(boolean, boolean, X.06r, X.06r, X.4GI, X.4GI, X.28Q):void");
    }

    @Override // X.C48E
    public void ALJ(String str, C28Q c28q) {
        Integer num;
        ((AbstractActivityC92484Li) this).A0F.A03(1, this.A0G, c28q);
        ((AbstractActivityC92484Li) this).A0G.A03(1, this.A0G, c28q);
        if (!TextUtils.isEmpty(str)) {
            C014406v c014406v = this.A0i;
            StringBuilder A0P = C000200d.A0P("starting sendPaymentToVpa for jid: ");
            A0P.append(((C4KG) this).A08);
            A0P.append(" vpa: ");
            A0P.append(C40841sx.A0Q(((AbstractActivityC92444Kp) this).A0E));
            c014406v.A07(null, A0P.toString(), null);
            C4IA c4ia = (C4IA) this.A0G.A06;
            C000700j.A04(c4ia, c014406v.A02(c014406v.A02, "onListKeys: Cannot get IndiaUpiMethodData").toString());
            C4GJ c4gj = new C4GJ();
            c4gj.A0D = A1p();
            c4gj.A07 = ((AbstractActivityC92484Li) this).A0I;
            c4gj.A0B = ((AbstractActivityC92484Li) this).A05.A05();
            c4gj.A0C = ((AbstractActivityC92484Li) this).A05.A09();
            c4gj.A09 = ((AbstractActivityC92444Kp) this).A0E;
            c4gj.A0A = ((AbstractActivityC92444Kp) this).A0F;
            c4gj.A05 = ((C4KG) this).A05.A05();
            c4gj.A0F = c4ia.A0A;
            this.A0K = c4gj;
            ((AbstractActivityC92484Li) this).A09.A03("upi-get-credential");
            C0N2 c0n2 = this.A0G;
            String str2 = c0n2.A08;
            int i = c4ia.A04;
            C014006r c014006r = this.A0E;
            String str3 = c0n2.A0A;
            String A1o = A1o();
            C06C c06c = this.A0C;
            A1l(str, str2, i, c4gj, c014006r, str3, A1o, c06c != null ? C04630Le.A00(c06c) : null);
        } else if (c28q == null || C90944Da.A03(this, "upi-list-keys", c28q.A00, false)) {
        } else {
            if (((AbstractActivityC92484Li) this).A09.A07("upi-list-keys")) {
                ((AbstractActivityC92484Li) this).A05.A0B();
                ARS();
                A12(R.string.payments_still_working);
                ((AbstractActivityC92484Li) this).A0E.A00();
                return;
            }
            C014406v c014406v2 = this.A0i;
            StringBuilder A0P2 = C000200d.A0P("onListKeys: ");
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0P2.append(num);
            A0P2.append(" failed; ; showErrorAndFinish");
            c014406v2.A07(null, A0P2.toString(), null);
            A1g();
        }
    }

    @Override // X.C4AG
    public void AMm() {
        if (C003101m.A0U(((C4KG) this).A08) && ((C4KG) this).A00 == 0) {
            A1S();
        }
    }

    @Override // X.C4AG
    public void AMn() {
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        PaymentMethodsListPickerFragment A00 = PaymentMethodsListPickerFragment.A00(this.A0b);
        A00.A07 = new C91024Di(this);
        A00.A05 = new C78273je(this);
        paymentBottomSheet.A01 = A00;
        AUg(paymentBottomSheet, "18");
    }

    @Override // X.C4AG
    public void ANx(String str, C014006r c014006r) {
        String str2;
        if (this.A0G == null) {
            return;
        }
        this.A0E = c014006r;
        if (AFm()) {
            A12(R.string.register_wait_message);
            C4GJ c4gj = new C4GJ();
            this.A0K = c4gj;
            c4gj.A08 = C05V.A02(((C4KG) this).A05, ((AbstractActivityC92484Li) this).A01, false);
            this.A0K.A0D = !TextUtils.isEmpty(super.A0P) ? super.A0P : A1U(((AbstractActivityC92484Li) this).A05.A02());
            C4IA c4ia = (C4IA) this.A0G.A06;
            C014406v c014406v = this.A0i;
            C000700j.A04(c4ia, c014406v.A02(c014406v.A02, "IndiaUpiPaymentActivity onRequestPayment: Cannot get IndiaUpiMethodData").toString());
            this.A0K.A0F = c4ia.A0A;
            C4C2 c4c2 = this.A0Q;
            String str3 = ((AbstractActivityC92444Kp) this).A0E;
            String str4 = ((AbstractActivityC92444Kp) this).A0F;
            String A05 = ((AbstractActivityC92484Li) this).A05.A05();
            String A09 = ((AbstractActivityC92484Li) this).A05.A09();
            String str5 = c4ia.A0A;
            C014006r c014006r2 = this.A0E;
            C4GJ c4gj2 = this.A0K;
            String str6 = c4gj2.A0D;
            String str7 = c4gj2.A08;
            String str8 = this.A0G.A07;
            if (c4c2 != null) {
                ArrayList A0Y = C000200d.A0Y("PAY: collectFromVpa called");
                A0Y.add(new C04P("action", "upi-collect-from-vpa", null, (byte) 0));
                C000200d.A1A("sender-vpa", str3, A0Y);
                if (str4 != null) {
                    C000200d.A1A("sender-vpa-id", str4, A0Y);
                }
                if (A05 != null) {
                    C000200d.A1A("receiver-vpa", A05, A0Y);
                } else {
                    Log.e("PAY: IndiaUpiCollectVpaAction collectFromVpa: receiverVpa is null");
                }
                if (A09 != null) {
                    C000200d.A1A("receiver-vpa-id", A09, A0Y);
                }
                A0Y.add(new C04P("upi-bank-info", str5, null, (byte) 0));
                A0Y.add(new C04P("device-id", c4c2.A04.A02(), null, (byte) 0));
                C463026g c463026g = ((C48B) c4c2).A01;
                C02590Ca A03 = c463026g.A03(c014006r2, C013806p.A05);
                A0Y.add(new C04P("seq-no", str6, null, (byte) 0));
                A0Y.add(new C04P("message-id", str7, null, (byte) 0));
                C000200d.A1A("credential-id", str8, A0Y);
                C3NV c3nv = ((C48B) c4c2).A00;
                if (c3nv != null) {
                    c3nv.A04("upi-collect-from-vpa");
                }
                c463026g.A0F("set", new C02590Ca("account", (C04P[]) A0Y.toArray(new C04P[0]), A03), new C91754Gd(c4c2.A00, c4c2.A01, c4c2.A02, c4c2.A03, c3nv) { // from class: X.4IJ
                    @Override // X.C91754Gd, X.C28V
                    public void A02(C28Q c28q) {
                        super.A02(c28q);
                        AnonymousClass485 anonymousClass485 = this;
                        if (anonymousClass485 != null) {
                            ((IndiaUpiPaymentActivity) anonymousClass485).A2F(c28q, true);
                        }
                    }

                    @Override // X.C91754Gd, X.C28V
                    public void A03(C28Q c28q) {
                        super.A03(c28q);
                        AnonymousClass485 anonymousClass485 = this;
                        if (anonymousClass485 != null) {
                            ((IndiaUpiPaymentActivity) anonymousClass485).A2F(c28q, true);
                        }
                    }

                    @Override // X.C91754Gd, X.C28V
                    public void A04(C02590Ca c02590Ca) {
                        super.A04(c02590Ca);
                        AnonymousClass485 anonymousClass485 = this;
                        if (anonymousClass485 != null) {
                            ((IndiaUpiPaymentActivity) anonymousClass485).A2F(null, true);
                        }
                    }
                }, 0L);
                return;
            }
            throw null;
        }
        C0JJ A1n = A1n();
        C014406v c014406v2 = this.A0i;
        C03630Gl[] c03630GlArr = new C03630Gl[1];
        UserJid userJid = ((C4KG) this).A0A;
        if (userJid != null) {
            str2 = userJid.getObfuscatedString();
        } else {
            str2 = "";
        }
        c03630GlArr[0] = new C03630Gl("receiver_jid", str2);
        c014406v2.A07(null, "requesting payment ", c03630GlArr);
        ((AbstractActivityC92444Kp) this).A06.AS1(new C3PO(this, A1n));
        ARS();
        A1W();
        A1Q();
    }

    @Override // X.C4AG
    public void AOV(String str, final C014006r c014006r) {
        if (this.A0G == null) {
            return;
        }
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        InterfaceC013706o A01 = C013606n.A01("INR");
        final ConfirmPaymentFragment A00 = ConfirmPaymentFragment.A00(this.A0G, null, A01.A9K(), c014006r, !this.A0d ? 1 : 0);
        A00.A0J = new C91004Dg(this, paymentBottomSheet, A01, c014006r);
        A00.A0K = new C49K() { // from class: X.4Dh
            @Override // X.C49K
            public void AMr(int i, PaymentBottomSheet paymentBottomSheet2) {
            }

            @Override // X.C49K
            public void AMv(int i, PaymentBottomSheet paymentBottomSheet2) {
            }

            {
                IndiaUpiPaymentActivity.this = this;
            }

            @Override // X.C49K
            public void AIt(View view, View view2, C0N2 c0n2, C0TN c0tn, PaymentBottomSheet paymentBottomSheet2) {
                IndiaUpiPaymentActivity indiaUpiPaymentActivity = IndiaUpiPaymentActivity.this;
                indiaUpiPaymentActivity.A0E = c014006r;
                C4IA c4ia = (C4IA) indiaUpiPaymentActivity.A0G.A06;
                if (c4ia != null && !c4ia.A0G) {
                    Intent intent = new Intent(indiaUpiPaymentActivity, IndiaUpiResetPinActivity.class);
                    intent.putExtra("extra_bank_account", indiaUpiPaymentActivity.A0G);
                    indiaUpiPaymentActivity.A1Z(intent);
                    intent.putExtra("extra_bank_account_link_completed_send_payment_default_action", 1);
                    indiaUpiPaymentActivity.startActivityForResult(intent, 1003);
                    return;
                }
                int i = 0;
                if (paymentBottomSheet2 != null) {
                    paymentBottomSheet2.A16(false, false);
                }
                String[] split = indiaUpiPaymentActivity.A0N.A04().getString("payments_sent_payment_with_account", "").split(";");
                int length = split.length;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (split[i].equalsIgnoreCase(indiaUpiPaymentActivity.A0G.A07)) {
                        indiaUpiPaymentActivity.A0c = true;
                        break;
                    } else {
                        i++;
                    }
                }
                indiaUpiPaymentActivity.A1t();
            }

            @Override // X.C49K
            public void AMo(PaymentBottomSheet paymentBottomSheet2, int i) {
                IndiaUpiPaymentActivity indiaUpiPaymentActivity = IndiaUpiPaymentActivity.this;
                PaymentMethodsListPickerFragment A002 = PaymentMethodsListPickerFragment.A00(indiaUpiPaymentActivity.A0b);
                A002.A07 = new C91024Di(indiaUpiPaymentActivity);
                A002.A05 = new C78273je(indiaUpiPaymentActivity);
                A002.A0S(A00, 0);
                paymentBottomSheet2.A19(A002);
            }

            @Override // X.C49K
            public void AMq(C0N2 c0n2, PaymentMethodRow paymentMethodRow) {
                IndiaUpiPaymentActivity indiaUpiPaymentActivity = IndiaUpiPaymentActivity.this;
                indiaUpiPaymentActivity.A0G = c0n2;
                PaymentView paymentView = indiaUpiPaymentActivity.A0W;
                if (paymentView != null) {
                    paymentView.setBankLogo(c0n2.A04());
                    indiaUpiPaymentActivity.A0W.setPaymentMethodText(C40841sx.A0H(((AbstractActivityC92484Li) indiaUpiPaymentActivity).A0C, indiaUpiPaymentActivity.A08, indiaUpiPaymentActivity.A0G, false));
                }
            }
        };
        paymentBottomSheet.A01 = A00;
        AUh(paymentBottomSheet);
    }

    @Override // X.C4AG
    public void AOW() {
        AUl(0, R.string.payments_cancel, this.A03.A06(this.A0C));
    }

    @Override // X.C48E
    public void AOZ(C28Q c28q) {
        C014406v c014406v = this.A0i;
        throw new UnsupportedOperationException(c014406v.A02(c014406v.A02, "onSetPin unsupported").toString());
    }

    @Override // X.C4A5
    public Object AQu() {
        C014006r ABR;
        C014006r AB6;
        InterfaceC013706o A01 = C013606n.A01("INR");
        AnonymousClass490 anonymousClass490 = this.A0S;
        if (anonymousClass490.A00) {
            anonymousClass490.A00 = false;
            if (TextUtils.isEmpty(((C4KG) this).A0L)) {
                ((C4KG) this).A0L = getString(R.string.settings_quick_tip_payment_note);
            }
            if (TextUtils.isEmpty(((C4KG) this).A0N)) {
                ((C4KG) this).A0N = A01.ABR().toString();
            }
        }
        if (!TextUtils.isEmpty(((C4KG) this).A0N)) {
            ABR = new C014006r(new BigDecimal(((C4KG) this).A0N), A01.A9i());
        } else {
            ABR = A01.ABR();
        }
        if (!TextUtils.isEmpty(((C4KG) this).A0N) && !TextUtils.isEmpty(((C4KG) this).A0M)) {
            AB6 = new C014006r(new BigDecimal(((C4KG) this).A0M), A01.A9i());
        } else {
            AB6 = A01.AB6();
        }
        C014006r c014006r = new C014006r(new BigDecimal(((ActivityC02290Ap) this).A0B.A07(C01C.A3m)), A01.A9i());
        AbstractC005302j abstractC005302j = ((C4KG) this).A08;
        String str = ((C4KG) this).A0L;
        String str2 = super.A0P;
        C4AL c4al = new C4AL(!super.A0R ? 1 : 0);
        C4AK c4ak = new C4AK(super.A0Q, NumberEntryKeyboard.A00(this.A08));
        String str3 = ((C4KG) this).A0O;
        String str4 = ((C4KG) this).A0M;
        String str5 = ((C4KG) this).A0N;
        C4AJ c4aj = new C4AJ(A01);
        C002301c c002301c = this.A08;
        return new C4AM(abstractC005302j, true, str, str2, this, c4al, c4ak, this, new C4AI(str3, str4, R.style.IndiaSendPaymentAmountInput, false, str5, false, false, c4aj, R.style.IndiaSendPaymentCurrencySymbolAmount, R.style.IndiaSendPaymentCurrencySymbolAmount, new C91504Fe(A01, c002301c, AB6, ABR, c014006r)), new C91474Fb(this, this.A0H, this.A06, c002301c, this.A0Y, this.A0V));
    }

    @Override // X.AbstractActivityC92484Li, X.AbstractActivityC92444Kp, X.C4KG, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 155) {
            if (i2 != -1) {
                return;
            }
            A1t();
            return;
        }
        switch (i) {
            case SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS /* 1000 */:
                HashMap hashMap = ((AbstractActivityC92484Li) this).A04.A08;
                if (i2 == -1 && hashMap != null) {
                    ARS();
                    A12(R.string.register_wait_message);
                    C4CE c4ce = ((AbstractActivityC92484Li) this).A0E;
                    String str = this.A0G.A07;
                    UserJid userJid = this.A0I;
                    C4GJ c4gj = this.A0K;
                    c4ce.A01(str, userJid, c4gj.A0B, c4gj.A0C, c4gj.A09, c4gj.A0A, hashMap, c4gj.A0D, this.A0E, ((AbstractActivityC92484Li) this).A0J);
                    return;
                }
                this.A0i.A08("REQUEST_TOS_UPDATED but found null credentialBlobs", null);
                A1W();
                finish();
                return;
            case 1001:
                if (i2 == -1) {
                    ((C4KG) this).A0A = UserJid.getNullable(intent.getStringExtra("extra_receiver_jid"));
                    return;
                } else if (i2 != 0 || ((C4KG) this).A0A != null) {
                    return;
                } else {
                    A1W();
                    finish();
                    return;
                }
            case 1002:
                if (i2 == -1) {
                    C0EU c0eu = this.A0N;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c0eu.A04().getString("payments_sent_payment_with_account", ""));
                    sb.append(";");
                    sb.append(this.A0G.A07);
                    C000200d.A0k(c0eu, "payments_sent_payment_with_account", sb.toString());
                    ((AbstractActivityC92484Li) this).A0E.A00();
                    return;
                } else if (i2 != 100) {
                    if (i2 != 0) {
                        return;
                    }
                    ((AbstractActivityC92484Li) this).A0L = false;
                    return;
                } else {
                    this.A0f = true;
                    Intent intent2 = new Intent(this, IndiaUpiResetPinActivity.class);
                    A1Z(intent2);
                    intent2.putExtra("extra_bank_account", this.A0G);
                    intent2.putExtra("extra_in_setup", false);
                    startActivityForResult(intent2, 1003);
                    return;
                }
            case 1003:
                if (i2 != -1) {
                    if (i2 != 0) {
                        return;
                    }
                    ((AbstractActivityC92484Li) this).A0L = false;
                    if (!((C4KG) this).A0B.A08() || this.A0c) {
                        return;
                    }
                    A2J(false);
                    return;
                }
                C0EU c0eu2 = this.A0N;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c0eu2.A04().getString("payments_sent_payment_with_account", ""));
                sb2.append(";");
                sb2.append(this.A0G.A07);
                C000200d.A0k(c0eu2, "payments_sent_payment_with_account", sb2.toString());
                this.A0c = true;
                A1t();
                return;
            case 1004:
                if (!C003101m.A0U(((C4KG) this).A08)) {
                    A1W();
                    finish();
                    return;
                }
                ((C4KG) this).A0A = null;
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        PaymentView paymentView = this.A0W;
        if (paymentView != null && paymentView.A0A()) {
            return;
        }
        if (C003101m.A0U(((C4KG) this).A08) && ((C4KG) this).A00 == 0) {
            ((C4KG) this).A0A = null;
            A1S();
            return;
        }
        A1W();
        finish();
    }

    @Override // X.C4Lq, X.AbstractActivityC92484Li, X.C4LI, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02.A01(this.A0g);
        this.A0L.A01(this.A0h);
        this.A04 = this.A05.A04(this);
        this.A0e = getIntent().getBooleanExtra("return-after-pay", false);
        C0U1 A0c = A0c();
        if (A0c != null) {
            boolean z = super.A0R;
            int i = R.string.new_payment;
            if (z) {
                i = R.string.payments_send_payment_text;
            }
            A0c.A08(i);
            A0c.A0L(true);
            if (!super.A0R) {
                A0c.A06(0.0f);
            }
        }
        PaymentView paymentView = (PaymentView) LayoutInflater.from(this).inflate(R.layout.send_payment_screen, (ViewGroup) null, false);
        this.A0W = paymentView;
        if (paymentView != null) {
            paymentView.A0Z = this;
            AAs().A02(new $$Lambda$cfXOxw_xiRBPGdEVyDTISt7ZSk(paymentView));
            this.A0V = new C4I1();
            this.A0D = C013606n.A01("INR");
            if (AFm()) {
                this.A0R = new C4C8(this, ((ActivityC02290Ap) this).A0A, ((AbstractActivityC92484Li) this).A0H, ((ActivityC02290Ap) this).A0D, ((AbstractActivityC92484Li) this).A04, ((C4KG) this).A0C, this.A0F, this.A0J, this.A0M);
            }
            this.A0Q = new C4C2(this, ((ActivityC02290Ap) this).A0A, ((AbstractActivityC92484Li) this).A0H, ((ActivityC02290Ap) this).A0D, ((AbstractActivityC92484Li) this).A04, ((C4KG) this).A0C, this.A0M);
            return;
        }
        throw null;
    }

    @Override // X.AbstractActivityC92484Li, X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 15) {
            C019208x c019208x = new C019208x(this);
            String string = getString(R.string.payments_nodal_not_allowed, this.A03.A06(this.A0C));
            C019308y c019308y = c019208x.A01;
            c019308y.A0E = string;
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Pi
                {
                    IndiaUpiPaymentActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    IndiaUpiPaymentActivity.this.A27(dialogInterface);
                }
            });
            c019308y.A0J = false;
            c019308y.A02 = new DialogInterface.OnCancelListener() { // from class: X.3PR
                {
                    IndiaUpiPaymentActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C002701i.A18(IndiaUpiPaymentActivity.this, 15);
                }
            };
            return c019208x.A00();
        } else if (i == 22) {
            C019208x c019208x2 = new C019208x(this);
            String string2 = getString(R.string.unblock_payment_id_error_default, getString(R.string.india_upi_payment_id_name));
            C019308y c019308y2 = c019208x2.A01;
            c019308y2.A0E = string2;
            c019208x2.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3PQ
                {
                    IndiaUpiPaymentActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    IndiaUpiPaymentActivity.this.A25();
                }
            });
            c019308y2.A0J = false;
            return c019208x2.A00();
        } else if (i != 26) {
            switch (i) {
                case 10:
                    C019208x c019208x3 = new C019208x(this);
                    c019208x3.A02(R.string.payments_check_pin_invalid_pin_retry);
                    c019208x3.A05(R.string.forgot_upi_pin, new DialogInterface.OnClickListener() { // from class: X.3Pd
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IndiaUpiPaymentActivity.this.A1x();
                        }
                    });
                    c019208x3.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3PY
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IndiaUpiPaymentActivity.this.A1y();
                        }
                    });
                    c019208x3.A06(R.string.payments_try_again, new DialogInterface.OnClickListener() { // from class: X.3PT
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IndiaUpiPaymentActivity.this.A1q();
                        }
                    });
                    C019308y c019308y3 = c019208x3.A01;
                    c019308y3.A0J = true;
                    c019308y3.A02 = new DialogInterface.OnCancelListener() { // from class: X.3PU
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            C002701i.A18(IndiaUpiPaymentActivity.this, 10);
                        }
                    };
                    return c019208x3.A00();
                case GoogleMigrateImporterActivity.A0E /* 11 */:
                    C019208x c019208x4 = new C019208x(this);
                    c019208x4.A02(R.string.payments_pin_max_retries);
                    c019208x4.A06(R.string.forgot_upi_pin, new DialogInterface.OnClickListener() { // from class: X.3Pl
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IndiaUpiPaymentActivity.this.A1z();
                        }
                    });
                    c019208x4.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Pk
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IndiaUpiPaymentActivity.this.A20();
                        }
                    });
                    C019308y c019308y4 = c019208x4.A01;
                    c019308y4.A0J = true;
                    c019308y4.A02 = new DialogInterface.OnCancelListener() { // from class: X.3Pf
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            C002701i.A18(IndiaUpiPaymentActivity.this, 11);
                        }
                    };
                    return c019208x4.A00();
                case 12:
                    C019208x c019208x5 = new C019208x(this);
                    c019208x5.A02(R.string.payments_pin_no_pin_set);
                    c019208x5.A06(R.string.yes, new DialogInterface.OnClickListener() { // from class: X.3Pb
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IndiaUpiPaymentActivity.this.A21();
                        }
                    });
                    c019208x5.A04(R.string.no, new DialogInterface.OnClickListener() { // from class: X.3Pc
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IndiaUpiPaymentActivity.this.A22();
                        }
                    });
                    C019308y c019308y5 = c019208x5.A01;
                    c019308y5.A0J = true;
                    c019308y5.A02 = new DialogInterface.OnCancelListener() { // from class: X.3Pe
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            C002701i.A18(IndiaUpiPaymentActivity.this, 12);
                        }
                    };
                    return c019208x5.A00();
                case 13:
                    ((AbstractActivityC92484Li) this).A05.A0C();
                    C019208x c019208x6 = new C019208x(this);
                    c019208x6.A02(R.string.payments_pin_encryption_error);
                    c019208x6.A06(R.string.yes, new DialogInterface.OnClickListener() { // from class: X.3PZ
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IndiaUpiPaymentActivity.this.A23();
                        }
                    });
                    c019208x6.A04(R.string.no, new DialogInterface.OnClickListener() { // from class: X.3Pg
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IndiaUpiPaymentActivity.this.A24();
                        }
                    });
                    C019308y c019308y6 = c019208x6.A01;
                    c019308y6.A0J = true;
                    c019308y6.A02 = new DialogInterface.OnCancelListener() { // from class: X.3Ph
                        {
                            IndiaUpiPaymentActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            C002701i.A18(IndiaUpiPaymentActivity.this, 13);
                        }
                    };
                    return c019208x6.A00();
                default:
                    return super.onCreateDialog(i);
            }
        } else {
            BigDecimal bigDecimal = new BigDecimal(((ActivityC02290Ap) this).A0B.A07(C01C.A3i));
            C019208x c019208x7 = new C019208x(this);
            String string3 = getString(R.string.upi_twenty_four_hour_send_limit_error, C013806p.A05.A83(this.A08, bigDecimal));
            C019308y c019308y7 = c019208x7.A01;
            c019308y7.A0E = string3;
            c019208x7.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3PX
                {
                    IndiaUpiPaymentActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    IndiaUpiPaymentActivity indiaUpiPaymentActivity = IndiaUpiPaymentActivity.this;
                    C002701i.A18(indiaUpiPaymentActivity, 26);
                    indiaUpiPaymentActivity.finish();
                }
            });
            c019308y7.A0J = false;
            return c019208x7.A00();
        }
    }

    @Override // X.AbstractActivityC92484Li, X.C4KG, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C91054Dl c91054Dl = this.A0U;
        if (c91054Dl != null) {
            c91054Dl.A05(true);
        }
        C91044Dk c91044Dk = this.A0T;
        if (c91044Dk != null) {
            c91044Dk.A05(true);
        }
        this.A04.A00();
        this.A02.A00(this.A0g);
        this.A0L.A00(this.A0h);
        C014406v c014406v = this.A0i;
        StringBuilder A0P = C000200d.A0P("onDestroy states: ");
        A0P.append(((AbstractActivityC92484Li) this).A09);
        c014406v.A07(null, A0P.toString(), null);
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.A0i.A07(null, "action bar home", null);
        if (C003101m.A0U(((C4KG) this).A08) && ((C4KG) this).A00 == 0) {
            ((C4KG) this).A0A = null;
            A1S();
            return true;
        }
        A1W();
        finish();
        return true;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        PaymentView paymentView = this.A0W;
        if (paymentView != null) {
            paymentView.A02 = paymentView.A0d.A8I().getCurrentFocus();
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0G = (C0N2) bundle.getParcelable("paymentMethodSavedInst");
        ((C4KG) this).A08 = UserJid.getNullable(bundle.getString("extra_jid"));
        ((C4KG) this).A0A = UserJid.getNullable(bundle.getString("extra_receiver_jid"));
        ((AbstractActivityC92484Li) this).A0L = bundle.getBoolean("sending_payment");
        ((AbstractActivityC92444Kp) this).A07 = bundle.getString("extra_incoming_pay_request_id");
        if (this.A0G != null) {
            this.A0G.A06 = (C0N0) bundle.getParcelable("countryDataSavedInst");
        }
        C4GJ c4gj = (C4GJ) bundle.getParcelable("countryTransDataSavedInst");
        if (c4gj != null) {
            this.A0K = c4gj;
        }
        String string = bundle.getString("sendAmountSavedInst");
        if (string != null) {
            this.A0E = C014006r.A00(string, this.A0D.A9i());
        }
        ((C4KG) this).A01 = bundle.getLong("quotedMessageRowIdSavedInst");
        ((C4KG) this).A0L = bundle.getString("paymentNoteSavedInst");
        super.A0Q = C003101m.A0F(UserJid.class, bundle.getStringArrayList("paymentNoteMentionsSavedInst"));
        ((AbstractActivityC92444Kp) this).A0E = bundle.getString("receiverVpaSavedInst");
        ((AbstractActivityC92444Kp) this).A0F = bundle.getString("receiverVpaIdSavedInst");
        PaymentView paymentView = this.A0W;
        if (paymentView != null) {
            paymentView.A0m = bundle.getString("extra_payment_preset_amount");
        } else {
            this.A0a = bundle.getString("restoredPaymentAmount");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x002f, code lost:
        if (((X.C4KG) r15).A0B.A09() != false) goto L21;
     */
    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r15 = this;
            r4 = r15
            super.onResume()
            X.06v r3 = r15.A0i
            java.lang.String r0 = "onResume states: "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            X.3NV r0 = r15.A09
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2 = 0
            r3.A07(r2, r0, r2)
            boolean r0 = r15.isFinishing()
            if (r0 == 0) goto L20
            return
        L20:
            X.0GZ r0 = r15.A0B
            boolean r0 = r0.A08()
            if (r0 != 0) goto L31
            X.0GZ r0 = r15.A0B
            boolean r1 = r0.A09()
            r0 = 0
            if (r1 == 0) goto L32
        L31:
            r0 = 1
        L32:
            X.C000700j.A07(r0)
            X.3NV r0 = r15.A09
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A06
            java.lang.String r1 = "upi-get-challenge"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L5f
            X.4Bm r0 = r15.A05
            byte[] r0 = r0.A0K()
            if (r0 != 0) goto L5f
            java.lang.String r0 = "onResume getChallenge"
            r3.A07(r2, r0, r2)
            r0 = 2131889387(0x7f120ceb, float:1.9413436E38)
            r15.A12(r0)
            X.3NV r0 = r15.A09
            r0.A03(r1)
            X.47h r0 = r15.A07
            r0.A00()
            return
        L5f:
            X.4Bm r0 = r15.A05
            java.lang.String r0 = r0.A05()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L99
            X.08q r5 = r15.A0A
            X.02L r6 = r15.A01
            X.0DV r7 = r15.A0C
            X.0E7 r8 = r15.A0D
            X.26g r9 = r15.A0C
            X.06n r10 = r15.A0F
            X.4CV r11 = r15.A0F
            X.28S r12 = r15.A0M
            X.4Bm r13 = r15.A05
            X.3NV r14 = r15.A09
            X.4C4 r3 = new X.4C4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.4Df r2 = new X.4Df
            r2.<init>()
            X.02L r0 = r3.A02
            r0.A05()
            com.whatsapp.jid.UserJid r1 = r0.A03
            X.4C3 r0 = new X.4C3
            r0.<init>(r3, r2)
            r3.A00(r1, r0)
            return
        L99:
            r15.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentActivity.onResume():void");
    }

    @Override // X.AbstractActivityC92484Li, X.C4KG, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0N0 c0n0;
        super.onSaveInstanceState(bundle);
        bundle.putString("extra_jid", C003101m.A07(((C4KG) this).A08));
        bundle.putString("extra_receiver_jid", C003101m.A07(((C4KG) this).A0A));
        bundle.putBoolean("sending_payment", ((AbstractActivityC92484Li) this).A0L);
        bundle.putString("extra_incoming_pay_request_id", ((AbstractActivityC92444Kp) this).A07);
        bundle.putString("extra_request_message_key", ((C4KG) this).A0O);
        C0N2 c0n2 = this.A0G;
        if (c0n2 != null) {
            bundle.putParcelable("paymentMethodSavedInst", c0n2);
        }
        C0N2 c0n22 = this.A0G;
        if (c0n22 != null && (c0n0 = c0n22.A06) != null) {
            bundle.putParcelable("countryDataSavedInst", c0n0);
        }
        C4GJ c4gj = this.A0K;
        if (c4gj != null) {
            bundle.putParcelable("countryTransDataSavedInst", c4gj);
        }
        C014006r c014006r = this.A0E;
        if (c014006r != null) {
            bundle.putString("sendAmountSavedInst", c014006r.A00.toString());
        }
        long j = ((C4KG) this).A01;
        if (j != 0) {
            bundle.putLong("quotedMessageRowIdSavedInst", j);
        }
        String str = ((AbstractActivityC92444Kp) this).A0E;
        if (str != null) {
            bundle.putString("receiverVpaSavedInst", str);
        }
        String str2 = ((AbstractActivityC92444Kp) this).A0F;
        if (str2 != null) {
            bundle.putString("receiverVpaIdSavedInst", str2);
        }
        PaymentView paymentView = this.A0W;
        if (paymentView != null) {
            String obj = paymentView.A0a.getText().toString();
            paymentView.A0m = obj;
            paymentView.A0j = obj;
            bundle.putString("extra_payment_preset_amount", obj);
            bundle.putString("paymentNoteSavedInst", this.A0W.getPaymentNote());
            bundle.putStringArrayList("paymentNoteMentionsSavedInst", C003101m.A0E(this.A0W.getMentionedJids()));
            bundle.putString("restoredPaymentAmount", this.A0W.getPaymentAmountString());
        }
    }
}
