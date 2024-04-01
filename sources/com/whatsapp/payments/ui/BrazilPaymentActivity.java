package com.whatsapp.payments.ui;

import X.AbstractC005302j;
import X.ActivityC02290Ap;
import X.AnonymousClass493;
import X.AnonymousClass499;
import X.C000200d;
import X.C001200o;
import X.C002301c;
import X.C003101m;
import X.C013606n;
import X.C014006r;
import X.C018708s;
import X.C02590Ca;
import X.C02E;
import X.C02O;
import X.C0CG;
import X.C0CI;
import X.C0DK;
import X.C0DV;
import X.C0DW;
import X.C0EU;
import X.C0JJ;
import X.C0KJ;
import X.C0N0;
import X.C0N2;
import X.C0N8;
import X.C0TN;
import X.C0U1;
import X.C28Q;
import X.C28S;
import X.C2GW;
import X.C3O6;
import X.C3OE;
import X.C3OF;
import X.C3OH;
import X.C3OI;
import X.C40081rY;
import X.C40841sx;
import X.C41751uS;
import X.C47302Ar;
import X.C47V;
import X.C47W;
import X.C47Y;
import X.C48z;
import X.C49682Lx;
import X.C49G;
import X.C49I;
import X.C49J;
import X.C4A5;
import X.C4AG;
import X.C4AH;
import X.C4AI;
import X.C4AJ;
import X.C4AK;
import X.C4AL;
import X.C4AM;
import X.C4BZ;
import X.C4D2;
import X.C4D6;
import X.C4EU;
import X.C4FZ;
import X.C4KG;
import X.C4KZ;
import X.C899048w;
import X.C90454Bb;
import X.C90834Cp;
import X.C90854Cr;
import X.C91474Fb;
import X.C91504Fe;
import X.C91924Gv;
import X.C91934Gw;
import X.InterfaceC013706o;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.widget.$$Lambda$cfXOxw_xiRBPGdEVyDTISt7ZSk;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class BrazilPaymentActivity extends C4KZ implements C4AH, C4AG, C4A5 {
    public Context A00;
    public C0CI A01;
    public C018708s A02;
    public C02E A03;
    public C001200o A04;
    public C002301c A05;
    public C0DK A06;
    public C013606n A07;
    public C40081rY A08;
    public C4BZ A09;
    public C47W A0A;
    public C90454Bb A0B;
    public C47Y A0C;
    public C41751uS A0D;
    public C28S A0E;
    public C0EU A0F;
    public C0DW A0G;
    public C47302Ar A0H;
    public C899048w A0I;
    public C48z A0J;
    public AnonymousClass493 A0K;
    public AnonymousClass499 A0L;
    public C49G A0M;
    public C49I A0N;
    public C49I A0O;
    public ConfirmPaymentFragment A0P;
    public PaymentView A0Q;
    public C49682Lx A0R;
    public C02O A0S;
    public final C2GW A0T = new C2GW() { // from class: X.4D1
        {
            BrazilPaymentActivity.this = this;
        }

        @Override // X.C2GW
        public void A00() {
            BrazilPaymentActivity brazilPaymentActivity = BrazilPaymentActivity.this;
            brazilPaymentActivity.A01.A03();
            brazilPaymentActivity.A01 = ((C4KG) brazilPaymentActivity).A0F.A01().A00();
        }
    };

    @Override // X.C4AH
    public Activity A8I() {
        return this;
    }

    @Override // X.C4AH
    public String AC7() {
        return null;
    }

    @Override // X.C4AH
    public boolean AFm() {
        return false;
    }

    @Override // X.C4AG
    public void AH5(String str) {
    }

    @Override // X.C4AG
    public void AMn() {
    }

    @Override // X.C4AG
    public void AOW() {
    }

    public static final String A00(boolean z, C0N2 c0n2) {
        C0N0 c0n0;
        if (!z || c0n2 == null || c0n2.A08() != 6 || (c0n0 = c0n2.A06) == null) {
            return null;
        }
        return ((C0N8) c0n0).A03 == 1 ? "debit" : "credit";
    }

    public static void A01(BrazilPaymentActivity brazilPaymentActivity, final BottomSheetDialogFragment bottomSheetDialogFragment) {
        if (brazilPaymentActivity != null) {
            AlertDialog create = new AlertDialog.Builder(brazilPaymentActivity).setMessage(brazilPaymentActivity.A00.getString(R.string.notification_payment_step_up_required_message)).setPositiveButton(brazilPaymentActivity.A00.getString(R.string.btn_continue), new DialogInterface.OnClickListener() { // from class: X.3OK
                {
                    BrazilPaymentActivity.this = brazilPaymentActivity;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BrazilPaymentActivity.this.A1Y(bottomSheetDialogFragment);
                }
            }).create();
            create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.3OJ
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    bottomSheetDialogFragment.A11();
                }
            });
            create.show();
            return;
        }
        throw null;
    }

    public static void A02(BrazilPaymentActivity brazilPaymentActivity, C0N2 c0n2, C014006r c014006r, String str, boolean z) {
        if (brazilPaymentActivity != null) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
            pinBottomSheetDialogFragment.A0A = new C90834Cp();
            pinBottomSheetDialogFragment.A0B = new C4D6(brazilPaymentActivity, pinBottomSheetDialogFragment, c014006r, c0n2, z, str);
            brazilPaymentActivity.AUh(pinBottomSheetDialogFragment);
            return;
        }
        throw null;
    }

    public static void A03(BrazilPaymentActivity brazilPaymentActivity, C28Q c28q) {
        C0KJ A00;
        if (brazilPaymentActivity != null) {
            C02590Ca c02590Ca = c28q.A04;
            if (c02590Ca != null && (A00 = C0KJ.A00(c02590Ca)) != null) {
                C000200d.A0k(brazilPaymentActivity.A0F, "payment_step_up_info", A00.A02().toString());
                return;
            }
            return;
        }
        throw null;
    }

    public static void A04(BrazilPaymentActivity brazilPaymentActivity, String str, C014006r c014006r, C0N2 c0n2, String str2, boolean z) {
        C0JJ A1P = brazilPaymentActivity.A1P(((C4KG) brazilPaymentActivity).A0J, ((C4KG) brazilPaymentActivity).A07, brazilPaymentActivity.A0Q.getPaymentNote(), brazilPaymentActivity.A0Q.getMentionedJids());
        C91934Gw c91934Gw = new C91934Gw();
        c91934Gw.A01 = str;
        c91934Gw.A03 = A1P.A0n.A01;
        c91934Gw.A02 = brazilPaymentActivity.A0R.A02();
        ((C4KG) brazilPaymentActivity).A0K.AS1(new C3OE(brazilPaymentActivity, A1P, c014006r, C013606n.A01("BRL"), c0n2, c91934Gw, str2, z));
        brazilPaymentActivity.A1Q();
    }

    public static boolean A05(BrazilPaymentActivity brazilPaymentActivity, C0N2 c0n2, int i) {
        if (brazilPaymentActivity != null) {
            C0N8 c0n8 = (C0N8) c0n2.A06;
            if (c0n8 != null && C40841sx.A0f(c0n2) && i == 1) {
                String str = c0n8.A0N;
                return str == null || !("DISABLED".equals(str) ^ true);
            }
            return false;
        }
        throw null;
    }

    public final AddPaymentMethodBottomSheet A1U(String str) {
        String string;
        if (this.A0G.A05()) {
            string = this.A00.getString(R.string.send_payment_add_method_bottom_sheet_desc);
        } else {
            string = this.A00.getString(R.string.accept_payment_add_debit_bottom_sheet_desc);
        }
        return A1V(str, false, null, string, null, false);
    }

    public final AddPaymentMethodBottomSheet A1V(String str, boolean z, String str2, String str3, String str4, boolean z2) {
        Intent intent = new Intent(this, BrazilPayBloksActivity.class);
        intent.putExtra("screen_name", str);
        C47V.A00(intent, "get_started");
        if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("verification_needed", "0");
            if (z2) {
                hashMap.put("add_debit_only", "1");
            }
            intent.putExtra("screen_params", hashMap);
        }
        C90854Cr c90854Cr = new C90854Cr(intent, str2, str3, str4);
        AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = new AddPaymentMethodBottomSheet();
        addPaymentMethodBottomSheet.A0P(new Bundle());
        addPaymentMethodBottomSheet.A04 = c90854Cr;
        return addPaymentMethodBottomSheet;
    }

    public void A1W() {
        C91924Gv c91924Gv = new C91924Gv();
        c91924Gv.A03 = ((C4KG) this).A0A;
        c91924Gv.A05 = false;
        ((C0TN) c91924Gv).A00 = 0;
        C0DV c0dv = ((C4KG) this).A0F;
        c0dv.A04();
        c0dv.A08.A0H(c91924Gv);
    }

    public void A1X(Intent intent, List list) {
        if (this.A0P != null) {
            String stringExtra = intent.getStringExtra("payment_method_credential_id");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0N2 c0n2 = (C0N2) it.next();
                if (c0n2.A07.equals(stringExtra)) {
                    this.A0P.AMp(c0n2);
                    break;
                }
            }
        }
        this.A01.A03();
    }

    public /* synthetic */ void A1Y(BottomSheetDialogFragment bottomSheetDialogFragment) {
        bottomSheetDialogFragment.A11();
        startActivity(new Intent(this, BrazilFbPayHubActivity.class));
    }

    public /* synthetic */ void A1Z(C014006r c014006r) {
        PaymentView paymentView = this.A0Q;
        if (paymentView != null) {
            ((C4KG) this).A0K.AS1(new C3O6(this, paymentView, c014006r));
            A1Q();
        }
    }

    public void A1a(C014006r c014006r, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0N2 c0n2 = (C0N2) it.next();
            if (C40841sx.A0f(c0n2) && c0n2.A06 != null && c0n2.A00 == 2) {
                PaymentView paymentView = this.A0Q;
                if (paymentView != null) {
                    ((C4KG) this).A0K.AS1(new C3O6(this, paymentView, c014006r));
                    A1Q();
                    return;
                }
                return;
            }
        }
        this.A0G.A01();
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A01 = new BrazilConfirmReceivePaymentFragment();
        AUh(paymentBottomSheet);
    }

    public void A1b(C014006r c014006r, List list) {
        if (list != null && list.size() > 0) {
            C0N2 c0n2 = (C0N2) list.get(C40841sx.A03(list));
            if (c0n2 != null) {
                A1c(c0n2, c014006r);
            } else {
                throw null;
            }
        } else {
            AddPaymentMethodBottomSheet A1U = A1U("brpay_p_add_card");
            A1U.A05 = new C3OH(this, list, c014006r);
            AUh(A1U);
        }
        this.A01.A03();
    }

    public final void A1c(C0N2 c0n2, C014006r c014006r) {
        C0TN c0tn;
        int i;
        InterfaceC013706o A01 = C013606n.A01("BRL");
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        if (((C4KG) this).A0A != null) {
            C0DV c0dv = ((C4KG) this).A0F;
            c0dv.A04();
            c0tn = c0dv.A08.A05(((C4KG) this).A0A);
        } else {
            c0tn = null;
        }
        UserJid userJid = ((C4KG) this).A0A;
        if (userJid != null) {
            String A9K = A01.A9K();
            if (c0tn != null && c0tn.A03 != null && c0tn.A05) {
                i = c0tn.A00;
            } else {
                i = 1;
            }
            final ConfirmPaymentFragment A00 = ConfirmPaymentFragment.A00(c0n2, userJid, A9K, c014006r, i);
            paymentBottomSheet.A01 = A00;
            A00.A0K = new C4D2(this, paymentBottomSheet, c014006r, A00);
            A00.A0J = new C49J() { // from class: X.4D3
                @Override // X.C49J
                public void A5Z(ViewGroup viewGroup) {
                }

                @Override // X.C49J
                public Integer A8z() {
                    return null;
                }

                @Override // X.C49J
                public String A9a(C002301c c002301c, C0N2 c0n22) {
                    return null;
                }

                @Override // X.C49J
                public String A9b(C0N2 c0n22) {
                    return null;
                }

                @Override // X.C49J
                public String ABK(C0N2 c0n22) {
                    return null;
                }

                @Override // X.C49J
                public boolean AF8(C0N2 c0n22) {
                    return true;
                }

                @Override // X.C49J
                public void AHO(C002301c c002301c, ViewGroup viewGroup) {
                }

                @Override // X.C49J
                public boolean AUR(C0N2 c0n22) {
                    return true;
                }

                @Override // X.C49J
                public boolean AUS() {
                    return false;
                }

                @Override // X.C49J
                public boolean AUT() {
                    return true;
                }

                {
                    BrazilPaymentActivity.this = this;
                }

                @Override // X.C49J
                public String A90(C0N2 c0n22, int i2) {
                    BrazilPaymentActivity brazilPaymentActivity = BrazilPaymentActivity.this;
                    if (BrazilPaymentActivity.A05(brazilPaymentActivity, c0n22, i2)) {
                        return brazilPaymentActivity.A00.getString(R.string.payment_use_another_card);
                    }
                    return null;
                }

                @Override // X.C49J
                public String A9t(C0N2 c0n22, int i2) {
                    C0N8 c0n8 = (C0N8) c0n22.A06;
                    if (c0n8 != null) {
                        BrazilPaymentActivity brazilPaymentActivity = BrazilPaymentActivity.this;
                        if (BrazilPaymentActivity.A05(brazilPaymentActivity, c0n22, i2)) {
                            if (!"ACTIVE".equals(c0n8.A0I)) {
                                return brazilPaymentActivity.A00.getString(R.string.card_state_no_longer_active_hint);
                            }
                            if (brazilPaymentActivity.A0G.A05()) {
                                return brazilPaymentActivity.A00.getString(R.string.brazil_credit_card_education_hint);
                            }
                            return brazilPaymentActivity.A00.getString(R.string.brazil_credit_card_education_hint_p2p_only);
                        } else if (c0n8.A0X) {
                            return null;
                        } else {
                            return brazilPaymentActivity.A00.getString(R.string.verify_payment_card_message);
                        }
                    }
                    return null;
                }

                @Override // X.C49J
                public void AHN(C002301c c002301c, ViewGroup viewGroup) {
                    BrazilPaymentActivity brazilPaymentActivity = BrazilPaymentActivity.this;
                    ((TextView) brazilPaymentActivity.getLayoutInflater().inflate(R.layout.confirm_dialog_title, viewGroup, true).findViewById(R.id.text)).setText(brazilPaymentActivity.A00.getString(R.string.confirm_payment_title, brazilPaymentActivity.A02.A08(brazilPaymentActivity.A06.A02(((C4KG) brazilPaymentActivity).A0A), false)));
                }

                @Override // X.C49J
                public void AKZ(C002301c c002301c, ViewGroup viewGroup, C0N2 c0n22) {
                    BrazilPaymentActivity brazilPaymentActivity = BrazilPaymentActivity.this;
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C0AT.A0D(brazilPaymentActivity.getLayoutInflater().inflate(R.layout.confirm_payment_footer_row, viewGroup, true), R.id.footer_text);
                    Context context = brazilPaymentActivity.A00;
                    SpannableString spannableString = new SpannableString(context.getString(R.string.confirm_payment_bottom_sheet_processor, context.getString(R.string.brazil_ecosystem_name)));
                    textEmojiLabel.setAccessibilityHelper(new C02780Cv(brazilPaymentActivity.A03, textEmojiLabel));
                    textEmojiLabel.A07 = new C02770Cu();
                    textEmojiLabel.setText(spannableString);
                }

                @Override // X.C49J
                public boolean AUO(C0N2 c0n22, int i2) {
                    return BrazilPaymentActivity.A05(BrazilPaymentActivity.this, c0n22, i2);
                }

                @Override // X.C49J
                public void AUe(C0N2 c0n22, PaymentMethodRow paymentMethodRow) {
                    if (!C40841sx.A0f(c0n22) || A00.A0W) {
                        return;
                    }
                    BrazilPaymentActivity.this.A0M.A03(c0n22, paymentMethodRow);
                }
            };
            this.A0P = A00;
            AUh(paymentBottomSheet);
            return;
        }
        throw null;
    }

    public void A1d(final AddPaymentMethodBottomSheet addPaymentMethodBottomSheet, final C014006r c014006r) {
        C0CI c0ci = this.A01;
        c0ci.A01.A03(new C0CG() { // from class: X.3ip
            {
                BrazilPaymentActivity.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                BrazilPaymentActivity.this.A1e(addPaymentMethodBottomSheet, c014006r, (List) obj);
            }
        }, ((ActivityC02290Ap) this).A0A.A06);
    }

    public /* synthetic */ void A1e(AddPaymentMethodBottomSheet addPaymentMethodBottomSheet, C014006r c014006r, List list) {
        addPaymentMethodBottomSheet.A10();
        A1c((C0N2) list.get(C40841sx.A03(list)), c014006r);
        this.A01.A03();
    }

    public /* synthetic */ void A1f(C0JJ c0jj, C014006r c014006r, InterfaceC013706o interfaceC013706o, C0N2 c0n2, C91934Gw c91934Gw, String str, boolean z) {
        ((C4KG) this).A0C.A0C(c0jj, c014006r, interfaceC013706o, c0n2, c91934Gw, ((C4KG) this).A0O, str, z);
    }

    public /* synthetic */ void A1g(List list, C014006r c014006r) {
        A1c((C0N2) list.get(C40841sx.A03(list)), c014006r);
    }

    @Override // X.C4AH
    public boolean AFc() {
        return TextUtils.isEmpty(((C4KG) this).A0O);
    }

    @Override // X.C4AG
    public void AMm() {
        AbstractC005302j abstractC005302j = ((C4KG) this).A08;
        if (abstractC005302j == null) {
            throw null;
        }
        if (C003101m.A0U(abstractC005302j) && ((C4KG) this).A00 == 0) {
            A1S();
        }
    }

    @Override // X.C4AG
    public void ANx(String str, final C014006r c014006r) {
        String A02 = this.A0N.A02(true);
        if (A02 == null) {
            C0CI c0ci = this.A01;
            c0ci.A01.A03(new C0CG() { // from class: X.3in
                {
                    BrazilPaymentActivity.this = this;
                }

                @Override // X.C0CG
                public final void A54(Object obj) {
                    BrazilPaymentActivity.this.A1a(c014006r, (List) obj);
                }
            }, null);
            return;
        }
        this.A0G.A01();
        AddPaymentMethodBottomSheet A1V = A1V(A02, true, this.A00.getString(R.string.add_debit_card_title), this.A00.getString(R.string.add_debit_card_education), this.A00.getString(R.string.add_debit_card_button), true);
        A1V.A05 = new C3OF(this, c014006r);
        AUh(A1V);
    }

    @Override // X.C4AG
    public void AOV(String str, final C014006r c014006r) {
        String A02 = this.A0N.A02(true);
        if (A02 == null) {
            this.A01.A03();
            C0CI A00 = ((C4KG) this).A0F.A01().A00();
            this.A01 = A00;
            A00.A01.A03(new C0CG() { // from class: X.3iq
                {
                    BrazilPaymentActivity.this = this;
                }

                @Override // X.C0CG
                public final void A54(Object obj) {
                    BrazilPaymentActivity.this.A1b(c014006r, (List) obj);
                }
            }, ((ActivityC02290Ap) this).A0A.A06);
            return;
        }
        AddPaymentMethodBottomSheet A1U = A1U(A02);
        A1U.A05 = new C3OI(this, A1U, c014006r);
        AUh(A1U);
    }

    @Override // X.C4A5
    public Object AQu() {
        InterfaceC013706o A01 = C013606n.A01("BRL");
        AbstractC005302j abstractC005302j = ((C4KG) this).A08;
        String str = ((C4KG) this).A0L;
        String str2 = super.A0P;
        C4AL c4al = new C4AL(super.A0R ? 0 : 2);
        C4AK c4ak = new C4AK(super.A0Q, NumberEntryKeyboard.A00(this.A05));
        String str3 = ((C4KG) this).A0O;
        String str4 = ((C4KG) this).A0M;
        String str5 = ((C4KG) this).A0N;
        C4AJ c4aj = new C4AJ(A01);
        C002301c c002301c = this.A05;
        return new C4AM(abstractC005302j, false, str, str2, this, c4al, c4ak, this, new C4AI(str3, str4, R.style.SendPaymentAmountInput, true, str5, true, true, c4aj, R.style.SendPaymentCurrencySymbolAfterAmount, R.style.SendPaymentCurrencySymbolBeforeAmount, new C91504Fe(A01, c002301c, A01.AB6(), A01.ABR())), new C91474Fb(this, this.A08, this.A03, c002301c, this.A0S, new C4FZ()));
    }

    @Override // X.C4KG, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, final Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        this.A01.A03();
        C0CI A00 = ((C4KG) this).A0F.A01().A00();
        this.A01 = A00;
        if (i2 != -1) {
            return;
        }
        A00.A01.A03(new C0CG() { // from class: X.3io
            {
                BrazilPaymentActivity.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                BrazilPaymentActivity.this.A1X(intent, (List) obj);
            }
        }, ((ActivityC02290Ap) this).A0A.A06);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A0Q.A0A()) {
            return;
        }
        AbstractC005302j abstractC005302j = ((C4KG) this).A08;
        if (abstractC005302j == null) {
            throw null;
        }
        if (!C003101m.A0U(abstractC005302j) || ((C4KG) this).A00 != 0) {
            finish();
            return;
        }
        ((C4KG) this).A0A = null;
        A1S();
    }

    @Override // X.C4KZ, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0B = new C90454Bb(this.A05, this.A0G);
        this.A00 = this.A04.A00;
        C0U1 A0c = A0c();
        if (A0c != null) {
            Context context = this.A00;
            boolean z = super.A0R;
            int i = R.string.new_payment;
            if (z) {
                i = R.string.payments_send_money;
            }
            A0c.A0H(context.getString(i));
            A0c.A0L(true);
            if (!super.A0R) {
                A0c.A06(0.0f);
            }
        }
        setContentView(R.layout.send_payment_screen);
        PaymentView paymentView = (PaymentView) findViewById(R.id.payment_view);
        this.A0Q = paymentView;
        if (paymentView != null) {
            paymentView.A0Z = this;
            AAs().A02(new $$Lambda$cfXOxw_xiRBPGdEVyDTISt7ZSk(paymentView));
            this.A01 = ((C4KG) this).A0F.A01().A00();
            this.A0D.A01(this.A0T);
            if (((C4KG) this).A0A == null) {
                AbstractC005302j abstractC005302j = ((C4KG) this).A08;
                if (abstractC005302j == null) {
                    throw null;
                }
                if (C003101m.A0U(abstractC005302j)) {
                    A1S();
                    return;
                }
                ((C4KG) this).A0A = UserJid.of(abstractC005302j);
            }
            A1R();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        Dialog A01 = new C4EU(((ActivityC02290Ap) this).A0A, ((C4KG) this).A0K, this.A0R, ((C4KG) this).A0F, ((C4KG) this).A07, this.A0F, ((ActivityC02290Ap) this).A0D, this.A0B, ((C4KG) this).A0C, this.A0L, this.A0H, this.A0E).A01(this, i);
        return A01 != null ? A01 : super.onCreateDialog(i);
    }

    @Override // X.C4KG, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0D.A00(this.A0T);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        AbstractC005302j abstractC005302j = ((C4KG) this).A08;
        if (abstractC005302j != null) {
            if (C003101m.A0U(abstractC005302j) && ((C4KG) this).A00 == 0) {
                ((C4KG) this).A0A = null;
                A1S();
                return true;
            }
            finish();
            return true;
        }
        throw null;
    }
}
