package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilDyiReportActivity;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4KK */
/* loaded from: classes3.dex */
public abstract class C4KK extends C4K4 implements View.OnClickListener, InterfaceC899349a, InterfaceC899549c, InterfaceC899849f, C49V, InterfaceC899649d {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ListView A06;
    public SwitchCompat A07;
    public C03090Ed A08;
    public C0GZ A09;
    public C42031uu A0A;
    public C28S A0B;
    public C03550Gd A0C;
    public C42021ut A0D;
    public C0EU A0E;
    public C0EX A0F;
    public C463026g A0G;
    public C0DV A0H;
    public C895947p A0I;
    public C28O A0J;
    public C899048w A0K;
    public C49W A0L;
    public C4ES A0M;
    public AbstractC899449b A0N;
    public C4EY A0O;
    public AbstractC899949g A0P;
    public InterfaceC002901k A0Q;

    public AbstractC899449b A1P() {
        BrazilFbPayHubActivity brazilFbPayHubActivity = (BrazilFbPayHubActivity) this;
        return new C4EU(((ActivityC02290Ap) brazilFbPayHubActivity).A0A, brazilFbPayHubActivity.A0Q, brazilFbPayHubActivity.A0D, ((C4KK) brazilFbPayHubActivity).A0H, brazilFbPayHubActivity.A01, ((C4KK) brazilFbPayHubActivity).A0E, ((ActivityC02290Ap) brazilFbPayHubActivity).A0D, brazilFbPayHubActivity.A04, ((C4KK) brazilFbPayHubActivity).A0G, brazilFbPayHubActivity.A0A, brazilFbPayHubActivity.A07, ((C4KK) brazilFbPayHubActivity).A0B);
    }

    public void A1Q(int i) {
        AMp((C0N2) this.A0L.A00.get(i));
    }

    @Override // X.C49V
    public String ABL(C0N2 c0n2) {
        if (!(this instanceof BrazilFbPayHubActivity)) {
            return C40841sx.A0F(((ActivityC02310Ar) this).A01, c0n2) != null ? C40841sx.A0F(((ActivityC02310Ar) this).A01, c0n2) : "";
        } else if (c0n2.A01 == 2) {
            return getString(R.string.default_payment_method_set);
        } else {
            C0N0 c0n0 = c0n2.A06;
            return (c0n0 == null || c0n0.A09()) ? "" : getString(R.string.payment_method_unverified);
        }
    }

    @Override // X.InterfaceC899849f
    public void ASf(boolean z) {
        this.A00.setVisibility(z ? 0 : 8);
    }

    @Override // X.InterfaceC899349a
    public void ASl(boolean z) {
        this.A07.setChecked(z);
    }

    @Override // X.InterfaceC899349a
    public void ASm(boolean z) {
        this.A02.setVisibility(z ? 0 : 8);
    }

    @Override // X.InterfaceC899349a
    public void ATb(boolean z) {
        this.A05.setVisibility(z ? 0 : 8);
    }

    @Override // X.InterfaceC899649d
    public void AVp(List list) {
        if (!(this instanceof BrazilFbPayHubActivity)) {
            C49W c49w = this.A0L;
            c49w.A00 = list;
            c49w.notifyDataSetChanged();
            C40841sx.A0X(this.A06);
            return;
        }
        BrazilFbPayHubActivity brazilFbPayHubActivity = (BrazilFbPayHubActivity) this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0N2 c0n2 = (C0N2) it.next();
            if (c0n2.A08() == 5) {
                arrayList.add(c0n2);
            } else {
                arrayList2.add(c0n2);
            }
        }
        brazilFbPayHubActivity.A06.A01();
        C49W c49w2 = ((C4KK) brazilFbPayHubActivity).A0L;
        c49w2.A00 = arrayList2;
        c49w2.notifyDataSetChanged();
        C40841sx.A0X(((C4KK) brazilFbPayHubActivity).A06);
    }

    public void lambda$onCreate$56$FbPayHubActivity(View view) {
        if (this.A0M != null) {
            Intent intent = new Intent(this, BrazilPayBloksActivity.class);
            intent.putExtra("screen_name", "brpay_p_pin_change_verify");
            A14(intent);
            return;
        }
        throw null;
    }

    public void lambda$onCreate$57$FbPayHubActivity(View view) {
        C4ES c4es = this.A0M;
        if (c4es.A00) {
            if (c4es.A03.A05()) {
                PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
                pinBottomSheetDialogFragment.A0A = new C90834Cp();
                pinBottomSheetDialogFragment.A0B = new C4ER(c4es, pinBottomSheetDialogFragment);
                c4es.A01.AUh(pinBottomSheetDialogFragment);
                return;
            }
            c4es.A01.AUl(R.string.payment_add_fingerprint_title, R.string.payment_add_fingerprint_desc, new Object[0]);
        }
    }

    public /* synthetic */ void lambda$onCreate$58$FbPayHubActivity(View view) {
        this.A0P.A02();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            this.A0P.A01();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.add_new_account || view.getId() == R.id.p2p_onboarding_nudge_button) {
            AGy(this.A0L.getCount() == 0);
        }
    }

    @Override // X.C4K4, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fb_pay_hub);
        int A00 = C02160Ac.A00(this, R.color.fb_pay_hub_icon_tint);
        A0k((Toolbar) findViewById(R.id.pay_service_toolbar));
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A08(R.string.facebook_pay);
            A0c.A0L(true);
            A0c.A0A(C02180Ae.A0Q(getResources().getDrawable(R.drawable.ic_close), A00));
        }
        this.A03 = findViewById(R.id.payment_methods_container);
        this.A04 = findViewById(R.id.p2p_onboarding_nudge_container);
        findViewById(R.id.p2p_onboarding_nudge_button).setOnClickListener(this);
        BrazilFbPayHubActivity brazilFbPayHubActivity = (BrazilFbPayHubActivity) this;
        this.A0L = new C4EC(brazilFbPayHubActivity, ((ActivityC02310Ar) brazilFbPayHubActivity).A01, ((C4KK) brazilFbPayHubActivity).A0H, brazilFbPayHubActivity);
        ListView listView = (ListView) findViewById(R.id.methods_list);
        this.A06 = listView;
        listView.setAdapter((ListAdapter) this.A0L);
        C4EY c4ey = new C4EY(this, this.A0Q, this.A0H, new C28021Ps(), this.A0E, this.A09, this.A0G, this.A0J, this.A0C, this.A0F, this.A08, this.A0D, false);
        this.A0O = c4ey;
        c4ey.A01(false, false);
        this.A06.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.3Om
            {
                C4KK.this = this;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                C4KK.this.A1Q(i);
            }
        });
        View findViewById = findViewById(R.id.add_new_account);
        this.A01 = findViewById;
        findViewById.setOnClickListener(this);
        C02180Ae.A17((ImageView) findViewById(R.id.change_pin_icon), A00);
        C02180Ae.A17((ImageView) findViewById(R.id.add_new_account_icon), A00);
        C02180Ae.A17((ImageView) findViewById(R.id.fingerprint_setting_icon), A00);
        C02180Ae.A17((ImageView) findViewById(R.id.delete_payments_account_icon), A00);
        C02180Ae.A17((ImageView) findViewById(R.id.request_payment_account_info_icon), A00);
        this.A05 = findViewById(R.id.pin_container);
        this.A02 = findViewById(R.id.fingerprint_container);
        this.A07 = (SwitchCompat) findViewById(R.id.toggle_fingerprint);
        C4HD c4hd = new C4HD(brazilFbPayHubActivity.A0Q, brazilFbPayHubActivity, ((ActivityC02310Ar) brazilFbPayHubActivity).A01, ((C4KK) brazilFbPayHubActivity).A0H, brazilFbPayHubActivity.A09, brazilFbPayHubActivity.A02, brazilFbPayHubActivity.A0A, brazilFbPayHubActivity.A08);
        this.A0M = c4hd;
        AnonymousClass493 anonymousClass493 = c4hd.A03;
        if (anonymousClass493.A00.A03()) {
            InterfaceC899349a interfaceC899349a = c4hd.A06;
            interfaceC899349a.ASm(true);
            interfaceC899349a.ASl(anonymousClass493.A01() == 1);
            ((C4ES) c4hd).A00 = true;
        } else {
            c4hd.A06.ASm(false);
        }
        findViewById(R.id.change_pin).setOnClickListener(new View$OnClickListenerC69423Oj(this));
        this.A02.setOnClickListener(new View$OnClickListenerC69433Ok(this));
        this.A00 = findViewById(R.id.action_required_row_container);
        findViewById(R.id.action_required_row_container).setOnClickListener(new View$OnClickListenerC69443Ol(this));
        C4EV c4ev = new C4EV(((ActivityC02270An) brazilFbPayHubActivity).A08, ((ActivityC02290Ap) brazilFbPayHubActivity).A0A, brazilFbPayHubActivity.A00, brazilFbPayHubActivity.A0Q, ((C4KK) brazilFbPayHubActivity).A0I, ((ActivityC02310Ar) brazilFbPayHubActivity).A01, ((C4KK) brazilFbPayHubActivity).A0H, ((C4KK) brazilFbPayHubActivity).A0E, brazilFbPayHubActivity.A02, ((ActivityC02290Ap) brazilFbPayHubActivity).A0D, brazilFbPayHubActivity.A05, brazilFbPayHubActivity.A0A, ((C4KK) brazilFbPayHubActivity).A0G, ((C4KK) brazilFbPayHubActivity).A0B, brazilFbPayHubActivity.A08, ((C4KK) brazilFbPayHubActivity).A0K, ((C4KK) brazilFbPayHubActivity).A0A, brazilFbPayHubActivity);
        this.A0P = c4ev;
        c4ev.A05(getIntent().getStringExtra("notification-type"), "FBPAY", 1);
        findViewById(R.id.account_actions_container);
        this.A0N = A1P();
        findViewById(R.id.delete_payments_account_action).setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.4DL
            {
                C4KK.this = this;
            }

            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view) {
                C4KK c4kk = C4KK.this;
                if (c4kk.A0N != null) {
                    C002701i.A19(c4kk, 101);
                    return;
                }
                throw null;
            }
        });
        findViewById(R.id.request_dyi_report_action).setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.4DM
            {
                C4KK.this = this;
            }

            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view) {
                C4KK c4kk = C4KK.this;
                if (c4kk.A0N != null) {
                    Intent intent = new Intent(c4kk, BrazilDyiReportActivity.class);
                    intent.putExtra("paymentProvider", "FB");
                    c4kk.startActivity(intent);
                    return;
                }
                throw null;
            }
        });
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        return A1P().A01(this, i);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C4EY c4ey = this.A0O;
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

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A0O.A00(true);
        C4ES c4es = this.A0M;
        if (c4es.A05.A04()) {
            InterfaceC899349a interfaceC899349a = c4es.A06;
            interfaceC899349a.ATb(true);
            AnonymousClass493 anonymousClass493 = c4es.A03;
            if (anonymousClass493.A00.A03()) {
                c4es.A00 = false;
                interfaceC899349a.ASl(anonymousClass493.A01() == 1);
                c4es.A00 = true;
            }
        } else {
            c4es.A06.ATb(false);
        }
        this.A0P.A04("FBPAY");
    }
}
