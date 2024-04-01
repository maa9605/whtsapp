package X;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiContactPicker;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.PaymentContactPicker;
import com.whatsapp.payments.ui.PaymentInvitePickerActivity;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.payments.ui.widget.PaymentNuxView;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4KQ */
/* loaded from: classes3.dex */
public abstract class C4KQ extends C4KA implements View.OnClickListener, InterfaceC899549c, C4EB, C2OS, InterfaceC900049h, InterfaceC899649d {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public FrameLayout A07;
    public FrameLayout A08;
    public ListView A09;
    public TextView A0A;
    public C02L A0B;
    public C05W A0C;
    public C018708s A0D;
    public C02F A0E;
    public C018808t A0F;
    public C03090Ed A0G;
    public C0GZ A0H;
    public C03550Gd A0I;
    public C42021ut A0J;
    public C0EU A0K;
    public C0EX A0L;
    public C463026g A0M;
    public C0GR A0N;
    public C0DW A0O;
    public C0DV A0P;
    public C28O A0Q;
    public C77393i8 A0R;
    public C49W A0S;
    public C4EY A0T;
    public PaymentNuxView A0U;
    public TransactionsExpandableView A0V;
    public TransactionsExpandableView A0W;
    public InterfaceC002901k A0X;
    public final C014406v A0b = C014406v.A00("PaymentSettingsActivity", "payment-settings", "COMMON");
    public List A0Y = new ArrayList();
    public List A0a = new ArrayList();
    public List A0Z = new ArrayList();

    @Override // X.C4EB
    public int ABI(C0N2 c0n2) {
        return 0;
    }

    @Override // X.C4EB
    public boolean AUT() {
        return false;
    }

    @Override // X.C4EB
    public void AUe(C0N2 c0n2, PaymentMethodRow paymentMethodRow) {
    }

    public String A1P() {
        List<C0N2> list = this.A0S.A00;
        if (list != null && !list.isEmpty()) {
            for (C0N2 c0n2 : list) {
                if (c0n2.A01 == 2) {
                    C0N0 c0n0 = c0n2.A06;
                    if (c0n0 == null) {
                        Log.e(C014406v.A01("PaymentMethodUtils", "getDefaultAccountHolderName/null country data"));
                        return null;
                    }
                    return c0n0.A06();
                }
            }
            return null;
        }
        return null;
    }

    public void A1Q() {
        if (this instanceof BrazilPaymentSettingsActivity) {
            BrazilPaymentSettingsActivity brazilPaymentSettingsActivity = (BrazilPaymentSettingsActivity) this;
            ((C4KQ) brazilPaymentSettingsActivity).A0O.A01();
            String A02 = brazilPaymentSettingsActivity.A02.A02(true);
            if (A02 != null && !brazilPaymentSettingsActivity.A02.A04.A04()) {
                Intent intent = new Intent(brazilPaymentSettingsActivity, BrazilPayBloksActivity.class);
                intent.putExtra("screen_name", A02);
                C47V.A00(intent, "wa_payment_settings");
                brazilPaymentSettingsActivity.startActivityForResult(intent, 2);
                return;
            }
            brazilPaymentSettingsActivity.startActivity(new Intent(brazilPaymentSettingsActivity, BrazilFbPayHubActivity.class));
        }
    }

    public void A1R() {
        if (!(this instanceof IndiaUpiPaymentSettingsActivity)) {
            Intent intent = new Intent(this, PaymentContactPicker.class);
            intent.putExtra("for_payments", true);
            startActivityForResult(intent, 501);
            return;
        }
        IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity = (IndiaUpiPaymentSettingsActivity) this;
        if (!indiaUpiPaymentSettingsActivity.A06.A08()) {
            Intent intent2 = new Intent(indiaUpiPaymentSettingsActivity, IndiaUpiPaymentsAccountSetupActivity.class);
            intent2.putExtra("extra_setup_mode", 1);
            intent2.putExtra("extra_bank_account_link_completed_send_payment_default_action", 0);
            indiaUpiPaymentSettingsActivity.startActivity(intent2);
            return;
        }
        Intent intent3 = new Intent(indiaUpiPaymentSettingsActivity, IndiaUpiContactPicker.class);
        intent3.putExtra("for_payments", true);
        indiaUpiPaymentSettingsActivity.startActivityForResult(intent3, 501);
    }

    public final void A1S() {
        boolean z;
        int i;
        if (this instanceof IndiaUpiPaymentSettingsActivity) {
            IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity = (IndiaUpiPaymentSettingsActivity) this;
            z = false;
            if (!indiaUpiPaymentSettingsActivity.A0Y.isEmpty() && indiaUpiPaymentSettingsActivity.A0a.isEmpty() && indiaUpiPaymentSettingsActivity.A0Z.isEmpty() && !indiaUpiPaymentSettingsActivity.A0E.A01.A04().getBoolean("settingsQuickTipDismissedState", false)) {
                z = true;
            }
        } else if (this instanceof BrazilPaymentSettingsActivity) {
            z = false;
            if (((BrazilPaymentSettingsActivity) this).A1V() != 0) {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            if (!(this instanceof IndiaUpiPaymentSettingsActivity)) {
                if (this instanceof BrazilPaymentSettingsActivity) {
                    BrazilPaymentSettingsActivity brazilPaymentSettingsActivity = (BrazilPaymentSettingsActivity) this;
                    int A1V = brazilPaymentSettingsActivity.A1V();
                    int i2 = 0;
                    if (A1V != 1) {
                        i = 0;
                        if (A1V == 2) {
                            i2 = R.string.nux_description_stage_two;
                            i = R.string.nux_cta_stage_two;
                        }
                    } else {
                        i2 = R.string.nux_description_stage_one;
                        i = R.string.nux_cta_stage_one;
                    }
                    brazilPaymentSettingsActivity.A0U.setIcon(C02180Ae.A0O(brazilPaymentSettingsActivity, R.drawable.av_brazil_nux, R.color.nux_icon_color));
                    if (i2 != 0 && i != 0) {
                        brazilPaymentSettingsActivity.A0U.setDescription(brazilPaymentSettingsActivity.getString(i2));
                        brazilPaymentSettingsActivity.A0U.setCtaButtonText(brazilPaymentSettingsActivity.getString(i));
                    }
                }
            } else {
                this.A0U.setIcon(C02180Ae.A0N(this, R.drawable.ic_settings_quick_tip));
                InterfaceC013706o A01 = C013606n.A01("INR");
                PaymentNuxView paymentNuxView = this.A0U;
                StringBuilder sb = new StringBuilder();
                sb.append(A01.A9O());
                sb.append(A01.ABR().A00.intValue());
                paymentNuxView.setDescription(getString(R.string.settings_quick_tip_description, sb.toString()));
                this.A0U.setCtaButtonText(getString(R.string.send_first_payment));
            }
            this.A0U.setVisibility(0);
            this.A03.setVisibility(0);
            return;
        }
        this.A0U.setVisibility(8);
        this.A03.setVisibility(8);
    }

    public void A1T(int i) {
        AMp((C0N2) this.A0S.A00.get(i));
    }

    public boolean A1U() {
        if (this instanceof IndiaUpiPaymentSettingsActivity) {
            return false;
        }
        C0EU c0eu = this.A0K;
        return c0eu.A01.A05() - c0eu.A04().getLong("payments_all_transactions_last_sync_time", 0L) > TimeUnit.DAYS.toMillis(7L);
    }

    @Override // X.C49V
    public String ABL(C0N2 c0n2) {
        if (!(this instanceof IndiaUpiPaymentSettingsActivity)) {
            return C40841sx.A0F(((ActivityC02310Ar) this).A01, c0n2) != null ? C40841sx.A0F(((ActivityC02310Ar) this).A01, c0n2) : "";
        }
        C4IA c4ia = (C4IA) c0n2.A06;
        if (c4ia == null || c4ia.A0G) {
            return C40841sx.A0F(((ActivityC02310Ar) this).A01, c0n2) != null ? C40841sx.A0F(((ActivityC02310Ar) this).A01, c0n2) : "";
        }
        return getString(R.string.setup_pin_prompt);
    }

    @Override // X.C2OS
    public void AMs() {
        this.A0T.A00(false);
    }

    @Override // X.InterfaceC899649d
    public void AVp(List list) {
        boolean z;
        String A0G;
        AbstractC466427q abstractC466427q;
        this.A0Y = list;
        this.A04.setVisibility(0);
        C49W c49w = this.A0S;
        c49w.A00 = list;
        c49w.notifyDataSetChanged();
        if (this instanceof BrazilPaymentSettingsActivity) {
            if (this instanceof BrazilPaymentSettingsActivity) {
                BrazilPaymentSettingsActivity brazilPaymentSettingsActivity = (BrazilPaymentSettingsActivity) this;
                ((C4KQ) brazilPaymentSettingsActivity).A0O.A01();
                z = true;
                if (brazilPaymentSettingsActivity.A02.A02(true) == null) {
                    z = false;
                }
            } else {
                z = false;
            }
            this.A02.setVisibility(z ? 0 : 8);
            this.A00.setVisibility(z ? 0 : 8);
            this.A01.setVisibility(z ? 8 : 0);
            if (z) {
                A0G = getString(R.string.facebook_pay_hub_desc_not_added);
            } else if (this.A0Y.isEmpty()) {
                A0G = getString(R.string.facebook_pay_hub_desc);
            } else {
                Iterator it = this.A0Y.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C0N2 c0n2 = (C0N2) it.next();
                        if (c0n2.A08() == 5 && (abstractC466427q = (AbstractC466427q) c0n2.A06) != null) {
                            A0G = abstractC466427q.A02;
                            if (TextUtils.isEmpty(A0G)) {
                                A0G = this.A0B.A02();
                            }
                        }
                    } else {
                        C0DV c0dv = this.A0P;
                        C002301c c002301c = ((ActivityC02310Ar) this).A01;
                        List list2 = this.A0Y;
                        A0G = C40841sx.A0G(c0dv, c002301c, (C0N2) list2.get(C40841sx.A03(list2)));
                        break;
                    }
                }
            }
            this.A0A.setText(A0G);
        }
        C40841sx.A0X(this.A09);
        A1S();
    }

    @Override // X.InterfaceC900049h
    public void AVs(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.A0Z = list;
        this.A04.setVisibility(0);
        if (this.A0Z.isEmpty()) {
            this.A06.setVisibility(8);
            this.A0V.setVisibility(8);
            return;
        }
        this.A0V.setVisibility(0);
        this.A06.setVisibility(0);
        this.A0V.A00(this.A0Z);
        this.A0V.setTitle(((ActivityC02310Ar) this).A01.A08(R.plurals.payments_settings_payment_requests, this.A0Z.size()));
    }

    @Override // X.InterfaceC900049h
    public void AVu(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.A0a = list;
        this.A04.setVisibility(0);
        this.A0W.A00(this.A0a);
    }

    public /* synthetic */ void lambda$onCreate$143$PaymentSettingsActivity(View view) {
        if (!(this instanceof IndiaUpiPaymentSettingsActivity)) {
            if (this instanceof BrazilPaymentSettingsActivity) {
                this.A0K.A04().edit().putBoolean("payment_brazil_nux_dismissed", true).apply();
                A1S();
                return;
            }
            return;
        }
        IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity = (IndiaUpiPaymentSettingsActivity) this;
        indiaUpiPaymentSettingsActivity.A0E.A01.A04().edit().putBoolean("settingsQuickTipDismissedState", true).apply();
        indiaUpiPaymentSettingsActivity.A1S();
    }

    public /* synthetic */ void lambda$onCreate$144$PaymentSettingsActivity(View view) {
        if (this instanceof IndiaUpiPaymentSettingsActivity) {
            IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity = (IndiaUpiPaymentSettingsActivity) this;
            C000200d.A0l(indiaUpiPaymentSettingsActivity.A0E.A01, "settingsQuickTipDismissedState", true);
            indiaUpiPaymentSettingsActivity.A0E.A00 = true;
            indiaUpiPaymentSettingsActivity.A1S();
            indiaUpiPaymentSettingsActivity.A1R();
        } else if (this instanceof BrazilPaymentSettingsActivity) {
            BrazilPaymentSettingsActivity brazilPaymentSettingsActivity = (BrazilPaymentSettingsActivity) this;
            int A1V = brazilPaymentSettingsActivity.A1V();
            if (A1V == 1) {
                brazilPaymentSettingsActivity.A1Q();
            } else if (A1V == 2) {
                String A02 = brazilPaymentSettingsActivity.A02.A02(true);
                Intent intent = new Intent(brazilPaymentSettingsActivity, BrazilPayBloksActivity.class);
                intent.putExtra("screen_name", A02);
                C47V.A00(intent, "wa_payment_settings");
                brazilPaymentSettingsActivity.startActivityForResult(intent, 2);
            }
        }
    }

    public void lambda$onCreate$146$PaymentSettingsActivity(View view) {
        Intent intent = new Intent(this, PaymentTransactionHistoryActivity.class);
        intent.putExtra("extra_show_requests", false);
        startActivity(intent);
    }

    public void lambda$onCreate$147$PaymentSettingsActivity(View view) {
        Intent intent = new Intent(this, PaymentTransactionHistoryActivity.class);
        intent.putExtra("extra_show_requests", true);
        startActivity(intent);
    }

    public /* synthetic */ void lambda$onCreate$148$PaymentSettingsActivity(View view) {
        startActivityForResult(new Intent(this, PaymentInvitePickerActivity.class), 501);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        if (i == 48) {
            if (i2 != -1) {
                return;
            }
            finish();
        } else if (i == 150) {
            if (i2 != -1) {
                return;
            }
            A1R();
        } else if (i != 501) {
            super.onActivityResult(i, i2, intent);
        } else if (intent != null) {
            if (i2 == -1) {
                UserJid nullable = UserJid.getNullable(intent.getStringExtra("extra_invitee_jid"));
                if (nullable == null) {
                    return;
                }
                C09250cv.A00(((ActivityC02290Ap) this).A04, getResources().getString(R.string.payments_invite_sent_snackbar, this.A0D.A06(this.A0C.A0A(nullable))), -1).A04();
            } else if (i2 != 501 || (intExtra = intent.getIntExtra("extra_inviter_count", 0)) <= 0) {
            } else {
                C09250cv.A00(((ActivityC02290Ap) this).A04, getResources().getQuantityString(R.plurals.payments_multi_invite_snackbar, intExtra, Integer.valueOf(intExtra)), -1).A04();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x001c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0022  */
    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBackPressed() {
        /*
            r3 = this;
            boolean r0 = r3.isTaskRoot()
            if (r0 == 0) goto L20
            java.lang.Class<com.whatsapp.HomeActivity> r0 = com.whatsapp.HomeActivity.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r3, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L1d
            r3.finishAndRemoveTask()
            r3.startActivity(r2)
            r0 = 1
        L1a:
            if (r0 == 0) goto L22
            return
        L1d:
            r3.startActivity(r2)
        L20:
            r0 = 0
            goto L1a
        L22:
            super.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4KQ.onBackPressed():void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.payment_support_container) {
            InterfaceC002901k interfaceC002901k = this.A0X;
            C77393i8 c77393i8 = this.A0R;
            if (c77393i8 != null && c77393i8.A00() == AsyncTask.Status.RUNNING) {
                this.A0R.A05(false);
            }
            C77393i8 c77393i82 = new C77393i8(this, ((ActivityC02290Ap) this).A0B, ((ActivityC02310Ar) this).A01, this.A0F, super.A0J, this.A0N, "payments:settings", null, null, C000200d.A02("com.whatsapp.support.DescribeProblemActivity.from", "payments:settings"));
            this.A0R = c77393i82;
            interfaceC002901k.ARy(c77393i82, new Void[0]);
        } else if (view.getId() == R.id.send_payment_fab) {
            if (!this.A0E.A03()) {
                RequestPermissionActivity.A04(this, R.string.permission_contacts_access_on_new_payment_request, R.string.permission_contacts_access_on_new_payment);
            } else {
                A1R();
            }
        } else if (view.getId() == R.id.add_new_account) {
            AGy(this.A0S.getCount() == 0);
        } else if (view.getId() != R.id.fb_pay_hub) {
        } else {
            A1Q();
        }
    }

    @Override // X.C4KA, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        CharSequence A9L;
        super.onCreate(bundle);
        setContentView(R.layout.payment_settings);
        if (this.A0O.A04()) {
            this.A0U = (PaymentNuxView) findViewById(R.id.nux_container);
            this.A03 = findViewById(R.id.payment_nux_row_separator);
            C0AT.A0D(this.A0U, R.id.nux_close).setOnClickListener(new View$OnClickListenerC69973Qm(this));
            C0AT.A0D(this.A0U, R.id.nux_cta).setOnClickListener(new View$OnClickListenerC70003Qp(this));
            this.A02 = findViewById(R.id.fb_pay_hub_section_desc);
            View findViewById = findViewById(R.id.fb_pay_hub);
            this.A00 = C0AT.A0D(findViewById, R.id.pay_hub_add);
            this.A0A = (TextView) C0AT.A0D(findViewById, R.id.pay_hub_desc);
            this.A01 = C0AT.A0D(findViewById, R.id.pay_hub_chevron);
            this.A04 = findViewById(R.id.payment_setting_container);
            this.A06 = findViewById(R.id.requests_separator);
            this.A0T = new C4EY(this, this.A0X, this.A0P, new C28021Ps(), this.A0K, this.A0H, this.A0M, this.A0Q, this.A0I, this.A0L, this.A0G, this.A0J, true);
            Intent intent = getIntent();
            if (intent != null) {
                z = intent.getBooleanExtra("extra_force_get_methods", false);
            } else {
                z = false;
            }
            this.A0T.A01(A1U(), z);
            C0U1 A0c = A0c();
            if (A0c != null) {
                A0c.A08(R.string.payments_activity_title);
                A0c.A0L(true);
            }
            findViewById(R.id.add_new_account).setOnClickListener(this);
            findViewById(R.id.payment_support_container).setOnClickListener(this);
            findViewById(R.id.send_payment_fab).setOnClickListener(this);
            boolean z3 = this instanceof BrazilPaymentSettingsActivity;
            if (z3) {
                findViewById(R.id.payment_settings_services_separator).setVisibility(0);
                findViewById(R.id.pay_hub_container).setVisibility(0);
                findViewById(R.id.payment_methods_container).setVisibility(8);
                findViewById(R.id.payment_history_separator).setVisibility(8);
                if (z3) {
                    findViewById(R.id.fb_pay_hub).setVisibility(0);
                    findViewById(R.id.fb_pay_hub).setOnClickListener(this);
                }
            }
            this.A0S = new C4EC(this, ((ActivityC02310Ar) this).A01, this.A0P, this);
            ListView listView = (ListView) findViewById(R.id.methods_list);
            this.A09 = listView;
            listView.setAdapter((ListAdapter) this.A0S);
            this.A09.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.3Ql
                {
                    C4KQ.this = this;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    C4KQ.this.A1T(i);
                }
            });
            TransactionsExpandableView transactionsExpandableView = (TransactionsExpandableView) findViewById(R.id.payment_history_container);
            this.A0W = transactionsExpandableView;
            transactionsExpandableView.setTitle(getString(R.string.payments_settings_payment_history));
            TransactionsExpandableView transactionsExpandableView2 = this.A0W;
            String string = getString(R.string.payments_settings_view_payment_history);
            String string2 = getString(R.string.payments_no_history);
            View$OnClickListenerC70023Qr view$OnClickListenerC70023Qr = new View$OnClickListenerC70023Qr(this);
            transactionsExpandableView2.A09 = string;
            transactionsExpandableView2.A08 = string2;
            ((C4AC) transactionsExpandableView2).A01 = view$OnClickListenerC70023Qr;
            View inflate = getLayoutInflater().inflate(R.layout.payment_txn_history_nux_view, (ViewGroup) null, false);
            this.A0W.setCustomEmptyView(inflate);
            C02180Ae.A17((ImageView) inflate.findViewById(R.id.payment_nux_logo), getResources().getColor(R.color.icon_color_disabled));
            this.A08 = (FrameLayout) findViewById(R.id.payment_custom_header_row);
            this.A05 = findViewById(R.id.payment_custom_header_row_separator);
            TransactionsExpandableView transactionsExpandableView3 = (TransactionsExpandableView) findViewById(R.id.requests_container);
            this.A0V = transactionsExpandableView3;
            String string3 = getString(R.string.payments_settings_see_more_requests);
            String string4 = getString(R.string.payments_settings_see_more_requests);
            View$OnClickListenerC70013Qq view$OnClickListenerC70013Qq = new View$OnClickListenerC70013Qq(this);
            transactionsExpandableView3.A09 = string3;
            transactionsExpandableView3.A08 = string4;
            ((C4AC) transactionsExpandableView3).A01 = view$OnClickListenerC70013Qq;
            C4AN c4an = new C4AN(this);
            TransactionsExpandableView transactionsExpandableView4 = this.A0W;
            transactionsExpandableView4.A00 = c4an;
            TransactionsExpandableView transactionsExpandableView5 = this.A0V;
            transactionsExpandableView5.A00 = c4an;
            transactionsExpandableView4.setPaymentRequestActionCallback(this);
            transactionsExpandableView5.setPaymentRequestActionCallback(this);
            if (!(this instanceof IndiaUpiPaymentSettingsActivity)) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                findViewById(R.id.pin_container).setVisibility(0);
            }
            if (0 != 0) {
                View findViewById2 = findViewById(R.id.invite_container);
                findViewById2.setVisibility(0);
                findViewById2.setOnClickListener(new View$OnClickListenerC69983Qn(this));
            }
            TextView textView = (TextView) findViewById(R.id.payments_drawable_text_view);
            if (this instanceof IndiaUpiPaymentSettingsActivity) {
                A9L = C013806p.A05.A9L(this);
            } else {
                A9L = C013606n.A01("BRL").A9L(this);
            }
            textView.setText(A9L);
            final View findViewById3 = findViewById(R.id.payments_settings_scroll_view_layout);
            final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.send_payment_fab);
            final View findViewById4 = findViewById(R.id.payments_text_view);
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            layoutTransition.setInterpolator(0, new C015207d());
            layoutTransition.setInterpolator(1, new C015207d());
            layoutTransition.setDuration(150L);
            findViewById3.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.3Qo
                {
                    C4KQ.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    C4KQ c4kq = C4KQ.this;
                    View view = findViewById3;
                    ViewGroup viewGroup2 = viewGroup;
                    View view2 = findViewById4;
                    if (view.getScrollY() <= 20) {
                        int dimension = (int) (c4kq.getResources().getDimension(R.dimen.payment_settings_payments_scroll_view_extended_padding) + 0.5f);
                        viewGroup2.setPadding(dimension, dimension, dimension, dimension);
                        view2.setVisibility(0);
                        return;
                    }
                    int dimension2 = (int) (c4kq.getResources().getDimension(R.dimen.payment_settings_payments_scroll_view_standard_padding) + 0.5f);
                    viewGroup2.setPadding(dimension2, dimension2, dimension2, dimension2);
                    view2.setVisibility(8);
                }
            });
            int A00 = C02160Ac.A00(this, R.color.settings_icon);
            C02180Ae.A17((ImageView) findViewById(R.id.change_pin_icon), A00);
            C02180Ae.A17((ImageView) findViewById(R.id.add_new_account_icon), A00);
            C02180Ae.A17((ImageView) findViewById(R.id.payment_support_icon), A00);
            C02180Ae.A17(this.A0W.A04, A00);
            C02180Ae.A17(this.A0V.A04, A00);
            C02180Ae.A17((ImageView) findViewById(R.id.fingerprint_setting_icon), A00);
            C02180Ae.A17((ImageView) findViewById(R.id.invite_icon), A00);
            return;
        }
        this.A0b.A07(null, "onCreate payment is not enabled; finish", null);
        finish();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C4EY c4ey = this.A0T;
        if (c4ey != null) {
            C4EW c4ew = c4ey.A02;
            if (c4ew != null) {
                c4ew.A05(true);
            }
            c4ey.A02 = null;
            InterfaceC28001Pq interfaceC28001Pq = c4ey.A00;
            if (interfaceC28001Pq != null) {
                c4ey.A09.A00(interfaceC28001Pq);
            }
        }
        C77393i8 c77393i8 = this.A0R;
        if (c77393i8 != null) {
            c77393i8.A05(false);
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A0T.A01(A1U(), intent != null ? intent.getBooleanExtra("extra_force_get_methods", false) : false);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            if (isTaskRoot()) {
                Intent intent = new Intent(this, HomeActivity.class);
                if (Build.VERSION.SDK_INT >= 21) {
                    finishAndRemoveTask();
                    startActivity(intent);
                } else {
                    startActivity(intent);
                    return true;
                }
            }
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_debug) {
            String AC1 = this.A0P.A03().AC1();
            if (TextUtils.isEmpty(AC1)) {
                return false;
            }
            startActivity(new Intent().setClassName(this, AC1));
            return true;
        } else {
            return false;
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        A12(R.string.payments_loading);
        this.A0T.A00(true);
    }
}
