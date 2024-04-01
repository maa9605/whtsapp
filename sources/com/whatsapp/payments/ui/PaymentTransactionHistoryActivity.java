package com.whatsapp.payments.ui;

import X.AbstractC005302j;
import X.AbstractC04890Mh;
import X.ActivityC02290Ap;
import X.C000700j;
import X.C002301c;
import X.C014406v;
import X.C019208x;
import X.C01C;
import X.C03090Ed;
import X.C03750Gx;
import X.C07630Zb;
import X.C07O;
import X.C0AT;
import X.C0C9;
import X.C0D5;
import X.C0DV;
import X.C0DW;
import X.C0EX;
import X.C0HS;
import X.C0U1;
import X.C28021Ps;
import X.C28031Pt;
import X.C2Ly;
import X.C2OS;
import X.C2OV;
import X.C49Y;
import X.C4A7;
import X.C4EH;
import X.C4EI;
import X.C4EN;
import X.C4KB;
import X.C78323jj;
import X.C900249j;
import X.InterfaceC002901k;
import X.InterfaceC07650Zd;
import X.InterfaceC28001Pq;
import X.View$OnClickListenerC70033Qs;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.widget.MultiExclusionChip;
import com.whatsapp.payments.ui.widget.MultiExclusionChipGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class PaymentTransactionHistoryActivity extends C4KB implements C2OS, C2OV, C49Y {
    public ProgressBar A00;
    public TextView A01;
    public C07630Zb A02;
    public C002301c A03;
    public C0C9 A04;
    public C0D5 A05;
    public AbstractC005302j A06;
    public C03090Ed A07;
    public C0EX A08;
    public C0DW A09;
    public C0DV A0A;
    public C2Ly A0B;
    public C4EH A0C;
    public C4EI A0D;
    public C4EN A0E;
    public C900249j A0F;
    public MultiExclusionChipGroup A0G;
    public C03750Gx A0H;
    public InterfaceC002901k A0I;
    public String A0J;
    public ArrayList A0K;
    public final ArrayList A0S = new ArrayList();
    public boolean A0N = false;
    public boolean A0L = false;
    public boolean A0O = false;
    public boolean A0M = false;
    public final C28021Ps A0R = new C28021Ps();
    public final InterfaceC28001Pq A0P = new InterfaceC28001Pq() { // from class: X.4EF
        {
            PaymentTransactionHistoryActivity.this = this;
        }

        @Override // X.InterfaceC28001Pq
        public void AMt(AnonymousClass093 anonymousClass093) {
            PaymentTransactionHistoryActivity.this.A1S();
        }

        @Override // X.InterfaceC28001Pq
        public void AMu(AnonymousClass093 anonymousClass093) {
            PaymentTransactionHistoryActivity.this.A1S();
        }
    };
    public final C014406v A0Q = C014406v.A00("PaymentTransactionHistoryActivity", "payment-settings", "COMMON");

    public final MultiExclusionChip A1P(String str) {
        MultiExclusionChip multiExclusionChip = (MultiExclusionChip) getLayoutInflater().inflate(R.layout.payment_filter_chip, (ViewGroup) null);
        C07O.A0X(multiExclusionChip.getCheckedIcon(), getResources().getColor(R.color.searchBackground));
        multiExclusionChip.setText(str);
        return multiExclusionChip;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0HS, X.4EI] */
    /* renamed from: A1Q */
    public void A1S() {
        C4EH c4eh = this.A0C;
        if (c4eh != null) {
            c4eh.A05(true);
        }
        C4EI c4ei = this.A0D;
        if (c4ei != null) {
            c4ei.A05(true);
        }
        if (((ActivityC02290Ap) this).A0B.A0E(C01C.A20) && !TextUtils.isEmpty(this.A0J) && this.A06 == null) {
            ?? r4 = new C0HS(this.A0H, this.A03, this.A05, this.A0A, this.A0F, this.A0J, this.A0N, this.A0R, new C78323jj(this)) { // from class: X.4EI
                public C28021Ps A00;
                public final C002301c A01;
                public final C0D5 A02;
                public final C0DV A03;
                public final C78323jj A04;
                public final C900249j A05;
                public final C03750Gx A06;
                public final String A07;
                public final boolean A08 = true;
                public final boolean A09;

                {
                    this.A07 = r7;
                    this.A09 = r8;
                    this.A02 = r4;
                    this.A04 = r10;
                    this.A00 = r9;
                    this.A03 = r5;
                    this.A05 = r6;
                    this.A06 = r2;
                    this.A01 = r3;
                }

                /* JADX WARN: Removed duplicated region for block: B:207:0x01af  */
                /* JADX WARN: Removed duplicated region for block: B:243:0x020d  */
                @Override // X.C0HS
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object A07(java.lang.Object[] r15) {
                    /*
                        Method dump skipped, instructions count: 542
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C4EI.A07(java.lang.Object[]):java.lang.Object");
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    C0FK c0fk = (C0FK) obj;
                    C78323jj c78323jj = this.A04;
                    String str = this.A07;
                    C28021Ps c28021Ps = this.A00;
                    Object obj2 = c0fk.A00;
                    if (obj2 != null) {
                        List list = (List) obj2;
                        Object obj3 = c0fk.A01;
                        if (obj3 != null) {
                            c78323jj.A00.A1U(str, c28021Ps, list, (List) obj3);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
            };
            this.A0D = r4;
            this.A0I.ARy(r4, new Void[0]);
            return;
        }
        C4EH c4eh2 = new C4EH(this, this.A0K, new C78323jj(this), this.A0F);
        this.A0C = c4eh2;
        this.A0I.ARy(c4eh2, new Void[0]);
    }

    public final void A1R() {
        this.A02.A04(true);
        MultiExclusionChipGroup multiExclusionChipGroup = this.A0G;
        if (multiExclusionChipGroup != null) {
            for (int i = 0; i < multiExclusionChipGroup.getChildCount(); i++) {
                ((CompoundButton) multiExclusionChipGroup.getChildAt(i)).setChecked(false);
            }
            this.A0G.setVisibility(8);
        }
        A1S();
    }

    public void A1T(MultiExclusionChip multiExclusionChip, MultiExclusionChip multiExclusionChip2, MultiExclusionChip multiExclusionChip3, MultiExclusionChip multiExclusionChip4, Set set) {
        if (this.A0O) {
            C28021Ps c28021Ps = this.A0R;
            c28021Ps.A06 = set.contains(multiExclusionChip);
            c28021Ps.A05 = set.contains(multiExclusionChip2);
        }
        if (this.A0M) {
            C28021Ps c28021Ps2 = this.A0R;
            c28021Ps2.A01 = set.contains(multiExclusionChip3);
            c28021Ps2.A02 = set.contains(multiExclusionChip4);
        }
        A1S();
    }

    public void A1U(String str, C28021Ps c28021Ps, List list, List list2) {
        String string;
        C4EN c4en = this.A0E;
        c4en.A00 = list;
        ((AbstractC04890Mh) c4en).A01.A00();
        ArrayList arrayList = this.A0S;
        arrayList.clear();
        arrayList.addAll(list2);
        this.A00.setVisibility(8);
        if (list.isEmpty()) {
            TextView textView = this.A01;
            if (c28021Ps.A04) {
                if (c28021Ps.A06) {
                    if (TextUtils.isEmpty(str)) {
                        string = getString(R.string.payments_history_search_no_results_pending_requests_from_you);
                    } else {
                        string = getString(R.string.payments_history_search_no_results_pending_requests_from_you_query, str);
                    }
                } else if (c28021Ps.A05) {
                    if (TextUtils.isEmpty(str)) {
                        string = getString(R.string.payments_history_search_no_results_pending_requests_to_you);
                    } else {
                        string = getString(R.string.payments_history_search_no_results_pending_requests_to_you_query, str);
                    }
                } else if (TextUtils.isEmpty(str)) {
                    string = getString(R.string.payments_history_search_no_results_pending_requests);
                } else {
                    string = getString(R.string.payments_history_search_no_results_pending_requests_query, str);
                }
            } else if (c28021Ps.A06) {
                if (c28021Ps.A01) {
                    if (TextUtils.isEmpty(str)) {
                        string = getString(R.string.payments_history_search_no_results_completed_transactions_or_requests_from_you);
                    } else {
                        string = getString(R.string.payments_history_search_no_results_completed_transactions_or_requests_from_you_query, str);
                    }
                } else if (c28021Ps.A02) {
                    if (TextUtils.isEmpty(str)) {
                        string = getString(R.string.payments_history_search_no_results_incomplete_transactions_or_requests_from_you);
                    } else {
                        string = getString(R.string.payments_history_search_no_results_incomplete_transactions_or_requests_from_you_query, str);
                    }
                } else if (TextUtils.isEmpty(str)) {
                    string = getString(R.string.payments_history_search_no_results_transactions_or_requests_from_you);
                } else {
                    string = getString(R.string.payments_history_search_no_results_transactions_or_requests_from_you_query, str);
                }
            } else if (c28021Ps.A05) {
                if (c28021Ps.A01) {
                    if (TextUtils.isEmpty(str)) {
                        string = getString(R.string.payments_history_search_no_results_completed_transactions_or_requests_to_you);
                    } else {
                        string = getString(R.string.payments_history_search_no_results_completed_transactions_or_requests_to_you_query, str);
                    }
                } else if (c28021Ps.A02) {
                    if (TextUtils.isEmpty(str)) {
                        string = getString(R.string.payments_history_search_no_results_incomplete_transactions_or_requests_to_you);
                    } else {
                        string = getString(R.string.payments_history_search_no_results_incomplete_transactions_or_requests_to_you_query, str);
                    }
                } else if (TextUtils.isEmpty(str)) {
                    string = getString(R.string.payments_history_search_no_results_transactions_or_requests_to_you);
                } else {
                    string = getString(R.string.payments_history_search_no_results_transactions_or_requests_to_you_query, str);
                }
            } else if (c28021Ps.A01) {
                if (TextUtils.isEmpty(str)) {
                    string = getString(R.string.payments_history_search_no_results_completed_transactions_or_requests);
                } else {
                    string = getString(R.string.payments_history_search_no_results_completed_transactions_or_requests_query, str);
                }
            } else if (c28021Ps.A02) {
                if (TextUtils.isEmpty(str)) {
                    string = getString(R.string.payments_history_search_no_results_incomplete_transactions_or_requests);
                } else {
                    string = getString(R.string.payments_history_search_no_results_incomplete_transactions_or_requests_query, str);
                }
            } else if (TextUtils.isEmpty(str)) {
                string = getString(R.string.payments_history_search_no_results_transactions_or_requests);
            } else {
                string = getString(R.string.payments_history_search_no_results_transactions_or_requests_query, str);
            }
            textView.setText(string);
            this.A01.setVisibility(0);
            return;
        }
        this.A01.setVisibility(8);
        this.A0B.A06(list);
    }

    public final boolean A1V() {
        if (isTaskRoot()) {
            Class ACK = this.A0A.A03().ACK();
            C014406v c014406v = this.A0Q;
            StringBuilder sb = new StringBuilder("PaymentTransactionHistoryActivity maybeOpenPaymentSettings ");
            sb.append(ACK);
            c014406v.A07(null, sb.toString(), null);
            Intent intent = new Intent(this, ACK);
            if (Build.VERSION.SDK_INT >= 21) {
                finishAndRemoveTask();
                startActivity(intent);
                return true;
            }
            startActivity(intent);
            return false;
        }
        return false;
    }

    @Override // X.C2OV
    public void AJB(String str) {
        ((AbstractC04890Mh) this.A0E).A01.A00();
    }

    @Override // X.C2OS
    public void AMs() {
        A1S();
    }

    public /* synthetic */ void lambda$onSearchRequested$85$PaymentTransactionHistoryActivity(View view) {
        A1R();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A02.A05()) {
            A1R();
        } else if (A1V()) {
        } else {
            super.onBackPressed();
        }
    }

    @Override // X.C4KB, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onCreate(bundle);
        C000700j.A07(this.A09.A02());
        setContentView(R.layout.payment_transaction_history);
        this.A0I.AS1(new RunnableEBaseShape4S0100000_I0_4(this.A07, 46));
        this.A08.A01(this.A0P);
        this.A0E = new C4EN(this, this.A0H, this.A03, this.A0Q, this.A04, new ArrayList(), this.A0F, this, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.transaction_list);
        recyclerView.setAdapter(this.A0E);
        C0AT.A0f(recyclerView, true);
        C0AT.A0f(findViewById(16908292), true);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.A00 = progressBar;
        progressBar.setVisibility(0);
        this.A01 = (TextView) findViewById(R.id.payment_transaction_search_no_matches);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0k(toolbar);
        this.A02 = new C07630Zb(this, this.A03, findViewById(R.id.search_holder), toolbar, new InterfaceC07650Zd() { // from class: X.4EG
            @Override // X.InterfaceC07650Zd
            public boolean ANY(String str) {
                return false;
            }

            {
                PaymentTransactionHistoryActivity.this = this;
            }

            @Override // X.InterfaceC07650Zd
            public boolean ANX(String str) {
                PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = PaymentTransactionHistoryActivity.this;
                ArrayList A03 = C09940f2.A03(str, paymentTransactionHistoryActivity.A03);
                paymentTransactionHistoryActivity.A0K = A03;
                paymentTransactionHistoryActivity.A0J = str;
                if (A03.isEmpty()) {
                    paymentTransactionHistoryActivity.A0K = null;
                }
                paymentTransactionHistoryActivity.A1S();
                return false;
            }
        });
        this.A0N = getIntent().getBooleanExtra("extra_show_requests", false);
        this.A0L = getIntent().getBooleanExtra("extra_disable_search", false);
        C28031Pt c28031Pt = (C28031Pt) getIntent().getParcelableExtra("extra_predefined_search_filter");
        if (c28031Pt != null) {
            this.A0R.A00 = c28031Pt;
        }
        this.A06 = AbstractC005302j.A02(getIntent().getStringExtra("extra_jid"));
        C0U1 A0c = A0c();
        if (A0c != null) {
            if (this.A0N) {
                A0c.A0H(this.A03.A08(R.plurals.payments_settings_payment_requests, 2L));
            } else {
                A0c.A08(R.string.payments_settings_payment_history);
            }
            A0c.A0L(true);
        }
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 100) {
            return super.onCreateDialog(i);
        }
        C019208x c019208x = new C019208x(this);
        c019208x.A02(R.string.payments_request_status_requested_expired);
        c019208x.A01.A0J = false;
        c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Qt
            {
                PaymentTransactionHistoryActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                PaymentTransactionHistoryActivity.this.A1S();
            }
        });
        c019208x.A03(R.string.payments_request_status_request_expired);
        return c019208x.A00();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.A0L) {
            menu.add(0, R.id.menuitem_search, 0, getString(R.string.search)).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C4EH c4eh = this.A0C;
        if (c4eh != null) {
            c4eh.A05(true);
        }
        C4EI c4ei = this.A0D;
        if (c4ei != null) {
            c4ei.A05(true);
        }
        this.A08.A00(this.A0P);
        this.A0C = null;
        this.A0D = null;
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId == 16908332) {
            finish();
            A1V();
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0N = bundle.getBoolean("extra_show_requests");
        this.A06 = AbstractC005302j.A02(bundle.getString("extra_jid"));
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_show_requests", this.A0N);
        AbstractC005302j abstractC005302j = this.A06;
        if (abstractC005302j != null) {
            bundle.putString("extra_jid", abstractC005302j.getRawString());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        this.A02.A01();
        C07630Zb c07630Zb = this.A02;
        String string = getString(R.string.search_hint);
        SearchView searchView = c07630Zb.A01;
        if (searchView != null) {
            searchView.setQueryHint(string);
        }
        View findViewById = findViewById(R.id.search_back);
        if (((ActivityC02290Ap) this).A0B.A0E(C01C.A20) && !this.A0N && (this.A0M || this.A0O)) {
            findViewById(R.id.appBarLayout).setVisibility(0);
            if (this.A0G == null) {
                MultiExclusionChipGroup multiExclusionChipGroup = (MultiExclusionChipGroup) C0AT.A0D(findViewById(R.id.payment_filters), R.id.payment_filter_group);
                this.A0G = multiExclusionChipGroup;
                String string2 = getString(R.string.payment_search_filter_from_you);
                String string3 = getString(R.string.payment_search_filter_to_you);
                String string4 = getString(R.string.payments_transaction_status_complete);
                String string5 = getString(R.string.payment_search_filter_incomplete);
                final MultiExclusionChip A1P = A1P(string2);
                final MultiExclusionChip A1P2 = A1P(string3);
                final MultiExclusionChip A1P3 = A1P(string4);
                final MultiExclusionChip A1P4 = A1P(string5);
                if (this.A0O) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(A1P);
                    arrayList.add(A1P2);
                    multiExclusionChipGroup.A02(arrayList);
                }
                if (this.A0M) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(A1P3);
                    arrayList2.add(A1P4);
                    multiExclusionChipGroup.A02(arrayList2);
                }
                multiExclusionChipGroup.A00 = new C4A7() { // from class: X.3jd
                    {
                        PaymentTransactionHistoryActivity.this = this;
                    }

                    @Override // X.C4A7
                    public final void AOU(Set set) {
                        PaymentTransactionHistoryActivity.this.A1T(A1P, A1P2, A1P3, A1P4, set);
                    }
                };
            }
            this.A0G.setVisibility(0);
        }
        findViewById.setOnClickListener(new View$OnClickListenerC70033Qs(this));
        return false;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        A1S();
        C2Ly c2Ly = this.A0B;
        c2Ly.A00.clear();
        c2Ly.A02.add(new WeakReference(this));
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        C4EH c4eh = this.A0C;
        if (c4eh != null) {
            c4eh.A05(true);
        }
        C4EI c4ei = this.A0D;
        if (c4ei != null) {
            c4ei.A05(true);
        }
        this.A0C = null;
        this.A0D = null;
        this.A0B.A04(this);
    }
}
