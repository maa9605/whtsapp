package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.List;

/* renamed from: X.4KG */
/* loaded from: classes3.dex */
public abstract class C4KG extends C4K0 {
    public int A00;
    public long A01;
    public C02L A02;
    public C46Z A03;
    public C41321tj A04;
    public AnonymousClass012 A05;
    public C0DK A06;
    public C0C9 A07;
    public AbstractC005302j A08;
    public UserJid A09;
    public UserJid A0A;
    public C0GZ A0B;
    public C463026g A0C;
    public C0GR A0D;
    public C0DW A0E;
    public C0DV A0F;
    public C895947p A0G;
    public C90864Cs A0H;
    public C2MO A0I;
    public C05U A0J;
    public InterfaceC002901k A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public List A0Q;
    public boolean A0R;

    public C0JJ A1P(C05U c05u, C0C9 c0c9, String str, List list) {
        AnonymousClass092 anonymousClass092;
        UserJid userJid;
        AbstractC005302j abstractC005302j = this.A08;
        if (abstractC005302j != null) {
            long j = this.A01;
            if (j != 0) {
                anonymousClass092 = c0c9.A0C(j);
            } else {
                anonymousClass092 = null;
            }
            C0JJ A04 = c05u.A04(abstractC005302j, str, 0L, null, list, anonymousClass092);
            if (C003101m.A0U(this.A08) && (userJid = this.A0A) != null) {
                A04.A0d(userJid);
            }
            return A04;
        }
        throw null;
    }

    public void A1Q() {
        AbstractC005302j abstractC005302j = this.A08;
        if (abstractC005302j != null) {
            Intent A00 = Conversation.A00(this, this.A06.A02(abstractC005302j));
            C002701i.A1C(A00, "BasePaymentsActivity", this.A05);
            A00.putExtra("show_keyboard", false);
            A00.putExtra("start_t", SystemClock.uptimeMillis());
            this.A0I.A00();
            A14(A00);
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.4Cs, X.0HS] */
    public void A1R() {
        if (this instanceof AbstractActivityC92444Kp) {
            return;
        }
        BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this;
        C0DK c0dk = brazilPaymentActivity.A06;
        UserJid userJid = ((C4KG) brazilPaymentActivity).A0A;
        if (userJid != null) {
            C06C A02 = c0dk.A02(userJid);
            C0DV c0dv = ((C4KG) brazilPaymentActivity).A0F;
            c0dv.A04();
            C0TN A05 = c0dv.A08.A05(((C4KG) brazilPaymentActivity).A0A);
            if (A05 == null || A05.A03 == null) {
                ((C4KG) brazilPaymentActivity).A0K.AS1(new C3OG(brazilPaymentActivity));
            }
            PaymentView paymentView = brazilPaymentActivity.A0Q;
            String A08 = brazilPaymentActivity.A02.A08(A02, false);
            paymentView.A0i = A08;
            paymentView.A09.setText(A08);
            paymentView.A0M.A02(A02, paymentView.A0K);
            if (((ActivityC02290Ap) brazilPaymentActivity).A0B.A07(C01C.A3g) == 1 && brazilPaymentActivity.A0G.A05()) {
                UserJid userJid2 = ((C4KG) brazilPaymentActivity).A0A;
                if (((C4KG) brazilPaymentActivity).A0E.A03()) {
                    C0DV c0dv2 = ((C4KG) brazilPaymentActivity).A0F;
                    c0dv2.A04();
                    C0TN A052 = c0dv2.A08.A05(userJid2);
                    if (A052 != null && A052.A01 < ((C4KG) brazilPaymentActivity).A05.A05()) {
                        C90864Cs c90864Cs = ((C4KG) brazilPaymentActivity).A0H;
                        if (c90864Cs != null) {
                            c90864Cs.A05(true);
                        }
                        ?? r2 = new C0HS(((C4KG) brazilPaymentActivity).A0F, ((C4KG) brazilPaymentActivity).A04, userJid2) { // from class: X.4Cs
                            public final C41321tj A00;
                            public final UserJid A01;
                            public final C0DV A02;

                            {
                                this.A02 = r1;
                                this.A00 = r2;
                                this.A01 = userJid2;
                            }

                            @Override // X.C0HS
                            public Object A07(Object[] objArr) {
                                C468428m c468428m = new C468428m(C22H.A0A);
                                c468428m.A00 = C468328l.A00();
                                c468428m.A04 = true;
                                UserJid userJid3 = this.A01;
                                if (userJid3 != null) {
                                    c468428m.A02.add(userJid3);
                                }
                                if (this.A00.A01(c468428m.A01()).A00()) {
                                    C0DV c0dv3 = this.A02;
                                    c0dv3.A04();
                                    c0dv3.A08.A0E(userJid3);
                                    return null;
                                }
                                return null;
                            }
                        };
                        ((C4KG) brazilPaymentActivity).A0H = r2;
                        ((C4KG) brazilPaymentActivity).A0K.ARy(r2, new Void[0]);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    public void A1S() {
        Intent intent = new Intent(this, PaymentGroupParticipantPickerActivity.class);
        AbstractC005302j abstractC005302j = this.A08;
        if (abstractC005302j != null) {
            intent.putExtra("extra_jid", abstractC005302j.getRawString());
            startActivityForResult(intent, 1001);
            return;
        }
        throw null;
    }

    public /* synthetic */ void A1T(PaymentView paymentView, C014006r c014006r) {
        C463026g c463026g = this.A0C;
        C0JJ A1P = A1P(this.A0J, this.A07, paymentView.getPaymentNote(), paymentView.getMentionedJids());
        AbstractC005302j abstractC005302j = this.A08;
        c463026g.A08(A1P, C003101m.A0U(abstractC005302j) ? this.A0A : UserJid.of(abstractC005302j), c014006r);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0A = UserJid.getNullable(intent.getStringExtra("extra_receiver_jid"));
            A1R();
        } else if (i2 != 0 || this.A0A != null) {
        } else {
            finish();
        }
    }

    @Override // X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        InterfaceC03590Gh interfaceC03590Gh;
        C0DX ACJ;
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.A00 = getIntent().getIntExtra("extra_conversation_message_type", 0);
            this.A08 = AbstractC005302j.A02(getIntent().getStringExtra("extra_jid"));
            this.A0A = UserJid.getNullable(getIntent().getStringExtra("extra_receiver_jid"));
            this.A01 = getIntent().getLongExtra("extra_quoted_msg_row_id", 0L);
            this.A0M = getIntent().getStringExtra("extra_payment_preset_amount");
            this.A0P = getIntent().getStringExtra("extra_transaction_id");
            this.A0N = getIntent().getStringExtra("extra_payment_preset_min_amount");
            this.A0O = getIntent().getStringExtra("extra_request_message_key");
            this.A0R = getIntent().getBooleanExtra("extra_is_pay_money_only", true);
            this.A0L = getIntent().getStringExtra("extra_payment_note");
            this.A0Q = C003101m.A0F(UserJid.class, getIntent().getStringArrayListExtra("extra_mentioned_jids"));
            this.A09 = UserJid.getNullable(getIntent().getStringExtra("extra_inviter_jid"));
        }
        if (this.A0D.A02() != null) {
            interfaceC03590Gh = this.A0F.A02(this.A0D.A02().A02);
        } else {
            interfaceC03590Gh = null;
        }
        InterfaceC013706o A01 = this.A0D.A01();
        String A9K = A01 != null ? A01.A9K() : null;
        if (interfaceC03590Gh != null && (ACJ = interfaceC03590Gh.ACJ(A9K)) != null && ACJ.AUP()) {
            C46Z c46z = this.A03;
            if (c46z.A07 != null) {
                if (!c46z.A03() || !c46z.A09()) {
                    c46z.A08("payment_view", true, null);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C90864Cs c90864Cs = this.A0H;
        if (c90864Cs != null) {
            c90864Cs.A05(true);
            this.A0H = null;
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC02800Cx A0N = A0N();
        List<C0BA> A04 = A0N.A0Q.A04();
        if (A04.size() > 0) {
            C02820Cz c02820Cz = new C02820Cz(A0N);
            for (C0BA c0ba : A04) {
                if (c0ba != null) {
                    c02820Cz.A06(c0ba);
                }
            }
            c02820Cz.A05();
        }
        super.onSaveInstanceState(bundle);
    }
}
